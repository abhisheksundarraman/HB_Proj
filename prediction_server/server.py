#How to run this server - gunicorn --bind <IP-Address of host 192.168.0.103>:8000 server:app

# import Flask class from the flask module
from flask import Flask, request

import numpy as np
import pickle

# Create Flask object to run
app = Flask(__name__)

@app.route('/')
def home():
    return "Hi, Welcome to Flask!!"

@app.route('/predict')
def predict():

	# Load the pre-trained and persisted SVM model
	# Note: The model will be loaded only once at the start of the server
	svmFile = open('../thumbnail_databank/finalized_model_svc.sav', 'rb')
	svmModel = pickle.load(svmFile)
	svmFile.close()

	# Get values from browser
	age = request.args['age']
	sex = request.args['sex']
	cp = request.args['cp']
	rbp = request.args['rbp']
	sc = request.args['sc']
	fbs = request.args['fbs']
	recr = request.args['recr']
	maxhr = request.args['maxhr']
	eia = request.args['eia']
	op = request.args['op']
	peak = request.args['peak']
	mv = request.args['mv']
	thal = request.args['thal']
	
	testData = np.array([age,sex,cp,rbp,sc,fbs,recr,maxhr,eia,op,peak,mv,thal]).reshape(1,13)
	print(testData[0])
	class_prediced = int(svmModel.predict(testData)[0])
	print("Heart Disease Prediction based on the model created is (Absence (1) or presence (2) of heart disease):")
	output = "Predicted Class: " + str(class_prediced)
        print(output)
	
	return (output)

if __name__ == "__main__":
	print("**Starting Server...")
	
	# Run Server
	app.run()
