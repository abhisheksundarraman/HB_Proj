# -*- coding: utf-8 -*-
#@author: abss


import pandas as pd
file="/home/abss/HBData/HBDataBase/UCI_HB.csv"
file_data = pd.read_csv(file, sep=",")

print "\nDataset describption for the 270 people\n"
dataset = file_data.iloc[:, :13]
print dataset.describe()

print "\nclass label describption for the 270 people\n"
classlabel_dataset = file_data.iloc[:, 13]
print classlabel_dataset.describe()
