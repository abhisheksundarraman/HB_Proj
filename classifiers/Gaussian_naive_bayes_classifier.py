# -*- coding: utf-8 -*-
#@author: abss


import pandas as pd
from sklearn.naive_bayes import GaussianNB
from sklearn.model_selection import train_test_split
import pickle
from sklearn.metrics import classification_report, confusion_matrix

file="../HBDataBase/UCI_HB.csv"
file_data = pd.read_csv(file, sep=",")

dataset = file_data.iloc[:, 0:13]
labels = file_data.iloc[:, 13]

Dataset_train, Dataset_test, Label_train, Label_test = train_test_split(dataset, labels, test_size=0.3, random_state=7)

print "Gaussian naive bayes Classification"

# 1. Set up the model
model = GaussianNB()

# 2. Use fit to train the model.
model.fit(Dataset_train, Label_train)

# save the model to disk
filename = '../thumbnail_databank/finalized_model_GNB.sav'
pickle.dump(model, open(filename, 'wb'))

Label_pred = model.predict(Dataset_test)

# 3. Determine the efficinecy of the model.
acc=model.score(Dataset_test, Label_pred)

print "Model's accuracy is:", acc

#confusion matrix
print "confusion matrix"
print(confusion_matrix(Label_test, Label_pred)) 

#classification report
print "classification report" 
print(classification_report(Label_test, Label_pred)) 
