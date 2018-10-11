package com.example.abss.heartconditionpredictor;


import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class getPrediction extends AsyncTask<String,Void,String>{
    EditText mageIn;
    EditText msexIn;
    EditText mrbpIn;
    EditText mcptIn;
    EditText mscIn;
    EditText mfbsIn;
    EditText mrecrIn;
    EditText mmaxhrIn;
    EditText meiaIn;
    EditText mopIn;
    EditText mspeIn;
    EditText mmvIn;
    EditText mthalIn;
    Context mcontext;

    public getPrediction(Context context, EditText ageIn, EditText sexIn, EditText rbpIn, EditText cptIn, EditText scIn, EditText fbsIn, EditText recrIn, EditText maxhrIn, EditText eiaIn, EditText opIn, EditText speIn, EditText mvIn, EditText thalIn) {
        this.mcontext = context;
        this.mageIn = ageIn;
        this.msexIn = sexIn;
        this.mrbpIn = rbpIn;
        this.mcptIn = cptIn;
        this.mscIn = scIn;
        this.mfbsIn = fbsIn;
        this.mrecrIn = recrIn;
        this.mmaxhrIn = maxhrIn;
        this.meiaIn = eiaIn;
        this.mopIn = opIn;
        this.mspeIn = speIn;
        this.mmvIn = mvIn;
        this.mthalIn = thalIn;
    }

    // Class name for Log tag
    private static final String LOG_TAG = getPrediction.class.getSimpleName();


    @Override
    protected String doInBackground(String... strings) {
        // Get the search string
        String queryString = strings[0];

        // Set up variables for the try block that need to be closed in the finally block.
        HttpURLConnection urlConnection=null;
        BufferedReader reader=null;
        String out=null;

        //Attempt to query the server for the prediction
        // Ex: http://192.168.0.103:8000/predict?age=0.0&sex=1.0&cp=1.0&rbp=30.0&sc=130.0&fbs=0.0&recr=2.0&maxhr=19.0&eia=0.0&op=0.0&peak=2.0&mv=3.0&thal=3.0
        try {
            final String SERVER_BASE_URL = "http://192.168.0.104:8000/predict?";
            final String AGE_PARAM = "age";
            final String SEX_PARAM = "sex";
            final String RBP_PARAM = "rbp";
            final String CPT_PARAM = "cp";
            final String SC_PARAM = "sc";
            final String FBS_PARAM = "fbs";
            final String RECR_PARAM = "recr";
            final String MAXHR_PARAM = "maxhr";
            final String EIA_PARAM = "eia";
            final String OP_PARAM = "op";
            final String SPE_PARAM = "peak";
            final String MV_PARAM = "mv";
            final String THAL_PARAM = "thal";

            Uri buildURI = Uri.parse(SERVER_BASE_URL).buildUpon()
                    .appendQueryParameter(AGE_PARAM, mageIn.getText().toString())
                    .appendQueryParameter(SEX_PARAM, msexIn.getText().toString())
                    .appendQueryParameter(CPT_PARAM, mcptIn.getText().toString())
                    .appendQueryParameter(RBP_PARAM, mrbpIn.getText().toString())
                    .appendQueryParameter(SC_PARAM, mscIn.getText().toString())
                    .appendQueryParameter(FBS_PARAM, mfbsIn.getText().toString())
                    .appendQueryParameter(RECR_PARAM, mrecrIn.getText().toString())
                    .appendQueryParameter(MAXHR_PARAM, mmaxhrIn.getText().toString())
                    .appendQueryParameter(EIA_PARAM, meiaIn.getText().toString())
                    .appendQueryParameter(OP_PARAM, mopIn.getText().toString())
                    .appendQueryParameter(SPE_PARAM, mspeIn.getText().toString())
                    .appendQueryParameter(MV_PARAM, mmvIn.getText().toString())
                    .appendQueryParameter(THAL_PARAM, mthalIn.getText().toString()).build();

            URL requestURL = new URL(buildURI.toString());

            Log.d(LOG_TAG, "URL = " + buildURI.toString());

            //open the network connection
            urlConnection =(HttpURLConnection)requestURL.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            //Get the input stream
            InputStream inputStream =urlConnection.getInputStream();

            //Read the response string into the String builder
            StringBuilder builder =new StringBuilder();
            reader =new BufferedReader(new InputStreamReader(inputStream));

            String line;

            while ((line=reader.readLine())!=null){
                builder.append(line +=" \n");
            }
            if (builder.length() == 0) {
                // Stream was empty.  No point in parsing.
                Toast.makeText(mcontext, "-------- builder String Empty ------- ", Toast.LENGTH_LONG).show();
                return null;
            }
            out = builder.toString();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }// Close the connections.
        finally {
            if(urlConnection != null) {
                urlConnection.disconnect();
            }
            if(reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return out;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        Log.d(LOG_TAG, "Prediction Analysis (Absence (1) or presence (2) of heart disease) : " + s);
        Toast.makeText(mcontext, "********* Prediction (Absence (1) or presence (2) of heart disease) ***********  "+s, Toast.LENGTH_LONG).show();
        Toast.makeText(mcontext, "********* Prediction (Absence (1) or presence (2) of heart disease) ***********  "+s, Toast.LENGTH_LONG).show();
    }
}