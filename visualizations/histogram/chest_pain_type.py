# -*- coding: utf-8 -*-
#@author: abss

import pandas as pd
import matplotlib.pyplot as plt

file="../../HBDataBase/UCI_HB.csv"
file_data = pd.read_csv(file, sep=",")

age = file_data.iloc[:, 2]

fig=plt.figure()
ax = fig.add_subplot(1,1,1)
#Variable
ax.hist(age, bins=15)
plt.title('Chest Pain Type distribution of Patients')
plt.xlabel('Chest Pain Type')
plt.ylabel('No of People')
plt.show()
