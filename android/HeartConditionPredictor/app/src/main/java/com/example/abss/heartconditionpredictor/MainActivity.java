package com.example.abss.heartconditionpredictor;


import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"-------- Lets get started ---------",Toast.LENGTH_LONG).show();
        Log.d(LOG_TAG, "We are in on Create");
        Toast.makeText(this,"-------- On Create ---------",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
        Toast.makeText(this,"-------- On Start ---------",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"Please Enter your Input values",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
        Toast.makeText(this,"-------- On Restart ---------",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
        Toast.makeText(this,"-------- On Resume ---------",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"Please Enter your Input values",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
        Toast.makeText(this,"-------- On Pause ---------",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(LOG_TAG, "onBackPressed");
        Toast.makeText(this,"-------- On BackPressed --------",Toast.LENGTH_LONG).show();
        finish();
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
        Toast.makeText(this,"-------- On Stop ---------",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
        Toast.makeText(this,"-------- On Destroy ---------",Toast.LENGTH_LONG).show();
    }

    public void launchActivity(View view) {
        EditText ageIn;
        EditText sexIn;
        EditText rbpIn;
        EditText cptIn;
        EditText scIn;
        EditText fbsIn;
        EditText recrIn;
        EditText maxhrIn;
        EditText eiaIn;
        EditText opIn;
        EditText speIn;
        EditText mvIn;
        EditText thalIn;

        ageIn = (EditText) findViewById(R.id.age);
        String ageInput = ageIn.getText().toString();

        sexIn = (EditText) findViewById(R.id.sex);
        String sexInput = sexIn.getText().toString();

        rbpIn = (EditText) findViewById(R.id.rbp);
        String rbpInput = rbpIn.getText().toString();

        cptIn = (EditText) findViewById(R.id.cpt);
        String cptInput = cptIn.getText().toString();

        scIn = (EditText) findViewById(R.id.sc);
        String scInput = scIn.getText().toString();

        fbsIn = (EditText) findViewById(R.id.fbs);
        String fbsInput = fbsIn.getText().toString();

        recrIn = (EditText) findViewById(R.id.recr);
        String recrInput = recrIn.getText().toString();

        maxhrIn = (EditText) findViewById(R.id.mhr);
        String maxhrInput = maxhrIn.getText().toString();

        eiaIn = (EditText) findViewById(R.id.eia);
        String eiaInput = eiaIn.getText().toString();

        opIn = (EditText) findViewById(R.id.op);
        String opInput = opIn.getText().toString();

        speIn = (EditText) findViewById(R.id.spe);
        String speInput = speIn.getText().toString();

        mvIn = (EditText) findViewById(R.id.mv);
        String mvInput = mvIn.getText().toString();

        thalIn = (EditText) findViewById(R.id.thal);
        String thalInput = thalIn.getText().toString();

        Log.d(LOG_TAG, "--------------------------------------------------------");
        Log.d(LOG_TAG, "Inside launchActivity");
        Toast.makeText(this, "-------- Inside launchActivity ---------", Toast.LENGTH_LONG).show();

        Log.d(LOG_TAG, "--------------------------------------------------------");
        Log.d(LOG_TAG, "                  Input Data is as follows:");
        Log.d(LOG_TAG, "--------------------------------------------------------");

        Log.d(LOG_TAG, "Age (yrs) = " + ageInput);
        Toast.makeText(this, "-------- Age (yrs) --------" + ageInput, Toast.LENGTH_LONG).show();

        Log.d(LOG_TAG, "Sex (0:Female, 1: Male) = " + sexInput);
        Toast.makeText(this, "-------- Sex (0:Female, 1: Male) --------" + sexInput, Toast.LENGTH_LONG).show();

        Log.d(LOG_TAG, "Resting Blood Pressure = " + rbpInput);
        Toast.makeText(this, "-------- Resting Blood Pressure --------" + rbpInput, Toast.LENGTH_LONG).show();

        Log.d(LOG_TAG, "Chest Pain Type (4 Values) = " + cptInput);
        Toast.makeText(this, "-------- Chest Pain Type (4 Values) --------" + cptInput, Toast.LENGTH_LONG).show();

        Log.d(LOG_TAG, "Serum Cholesterol (mg/dl) = " + scInput);
        Toast.makeText(this, "-------- Serum cholesterol (mg/dl) --------" + scInput, Toast.LENGTH_LONG).show();

        Log.d(LOG_TAG, "Fasting blood sugar (if > 120 mg/dl:1 else :0) = " + fbsInput);
        Toast.makeText(this, "-------- Fasting blood sugar (if > 120 mg/dl:1 else :0) --------" + fbsInput, Toast.LENGTH_LONG).show();

        Log.d(LOG_TAG, "Resting electrocardiographic results (values 0, 1, and 2) = " + recrInput);
        Toast.makeText(this, "-------- Resting electrocardiographic results (values 0, 1, and 2) --------" + recrInput, Toast.LENGTH_LONG).show();

        Log.d(LOG_TAG, "Maximum heart rate achieved = " + maxhrInput);
        Toast.makeText(this, "-------- Maximum heart rate achieved --------" + maxhrInput, Toast.LENGTH_LONG).show();

        Log.d(LOG_TAG, "Exercise induced angina = " + eiaInput);
        Toast.makeText(this, "-------- Exercise induced angina --------" + eiaInput, Toast.LENGTH_LONG).show();

        Log.d(LOG_TAG, "Oldpeak (ST depression induced by exercise relative to rest) = " + opInput);
        Toast.makeText(this, "-------- Oldpeak (ST depression induced by exercise relative to rest) --------" + opInput, Toast.LENGTH_LONG).show();

        Log.d(LOG_TAG, "The slope of the peak exercise ST segment = " + speInput);
        Toast.makeText(this, "-------- The slope of the peak exercise ST segment --------" + speInput, Toast.LENGTH_LONG).show();

        Log.d(LOG_TAG, "Number of major vessels (0-3) colored by fluoroscopy = " + mvInput);
        Toast.makeText(this, "-------- Number of major vessels (0-3) colored by fluoroscopy --------" + mvInput, Toast.LENGTH_LONG).show();

        Log.d(LOG_TAG, "Thal: 3 = normal; 6 = fixed defect; 7 = reversible defect =  " + thalInput);
        Toast.makeText(this, "-------- Thal: 3 = normal; 6 = fixed defect; 7 = reversible defect --------" + thalInput, Toast.LENGTH_LONG).show();

        Log.d(LOG_TAG, "--------------------------------------------------------");

        // Hide the keyboard when the button is pushed.
        InputMethodManager inputManager = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);

        // Check the status of the network connection.
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        // If the network is active and the search field is not empty, start a BookLoader AsyncTask.
        if (networkInfo != null && networkInfo.isConnected() && ageInput.length() != 0 &&
                sexInput.length() != 0 && rbpInput.length() != 0 && cptInput.length() != 0 &&
                scInput.length() != 0 && fbsInput.length() != 0 && recrInput.length() != 0 &&
                maxhrInput.length() != 0 && eiaInput.length() != 0 && opInput.length() != 0 &&
                speInput.length() != 0 && mvInput.length() != 0 && thalInput.length() != 0) {
            Toast.makeText(this, "-------- Now for the Prediction -------", Toast.LENGTH_LONG).show();
            new getPrediction(this, ageIn, sexIn, rbpIn, cptIn, scIn, fbsIn, recrIn, maxhrIn, eiaIn, opIn, speIn, mvIn, thalIn).execute("?");
        }
        else {
            Toast.makeText(this, "-------- There is no connection to the internet -------", Toast.LENGTH_LONG).show();
            Log.d(LOG_TAG, "There is no connection to the internet");
        }
    }

    public void launchGallery(View view) {

        Toast.makeText(this, "Launching Gallery for the Visualization", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, GalleryActivity.class);
        startActivity(intent);
        finish();
    }
}
