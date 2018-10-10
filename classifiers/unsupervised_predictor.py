# -*- coding: utf-8 -*-
#@author: abss

import pandas as pd
import pickle

file1="../HBDataBase/UCI_HB_predict_unsupervised.csv"
file_data1 = pd.read_csv(file1, sep=",")

dataset_pred = file_data1.iloc[:, 0:13]

print "Input Dataset for the prediction is:"
print (dataset_pred)

print "----------------------------------"
print "K-Nearest Neighbour Classification"
print "----------------------------------"

# location of the saved model from disk
filename = '../thumbnail_databank/finalized_model_KNN.sav'
# Pull the model from the disk and load it through pickle
model = pickle.load(open(filename, "r")) 

class_label = model.predict(dataset_pred)
print "Heart Disease Prediction based on the model created is (Absence (1) or presence (2) of heart disease):"
print class_label

print "----------------------------------"
print "  Decision Tree classification"
print "----------------------------------"

# location of the saved model from disk
filename = '../thumbnail_databank/finalized_model_DTC.sav'
# Pull the model from the disk and load it through pickle
model = pickle.load(open(filename, "r")) 

class_label = model.predict(dataset_pred)
print "Heart Disease Prediction based on the model created is (Absence (1) or presence (2) of heart disease):"
print class_label

print "-------------------------------------"
print "Gaussian-Naive Baysean Classification"
print "-------------------------------------"

# location of the saved model from disk
filename = '../thumbnail_databank/finalized_model_GNB.sav'
# Pull the model from the disk and load it through pickle
model = pickle.load(open(filename, "r")) 

class_label = model.predict(dataset_pred)
print "Heart Disease Prediction based on the model created is (Absence (1) or presence (2) of heart disease):"
print class_label

print "-------------------------------------"
print " Logistic Regression Classification "
print "-------------------------------------"

# location of the saved model from disk
filename = '../thumbnail_databank/finalized_model_logistic.sav'
# Pull the model from the disk and load it through pickle
model = pickle.load(open(filename, "r")) 

class_label = model.predict(dataset_pred)
print "Heart Disease Prediction based on the model created is (Absence (1) or presence (2) of heart disease):"
print class_label

print "-------------------------------------"
print "    Random Forest Classification"
print "-------------------------------------"

# location of the saved model from disk
filename = '../thumbnail_databank/finalized_model_randforest.sav'
# Pull the model from the disk and load it through pickle
model = pickle.load(open(filename, "r")) 

class_label = model.predict(dataset_pred)
print "Heart Disease Prediction based on the model created is (Absence (1) or presence (2) of heart disease):"
print class_label

print "-------------------------------------"
print "Support Vector Machine Classification"
print "-------------------------------------"

# location of the saved model from disk
filename = '../thumbnail_databank/finalized_model_svc.sav'
# Pull the model from the disk and load it through pickle
model = pickle.load(open(filename, "r")) 

class_label = model.predict(dataset_pred)
print "Heart Disease Prediction based on the model created is (Absence (1) or presence (2) of heart disease):"
print class_label
