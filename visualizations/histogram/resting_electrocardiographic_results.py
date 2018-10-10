# -*- coding: utf-8 -*-
#@author: abss

import pandas as pd
import matplotlib.pyplot as plt

file="../../HBDataBase/UCI_HB.csv"
file_data = pd.read_csv(file, sep=",")

age = file_data.iloc[:, 6]

fig=plt.figure()
ax = fig.add_subplot(1,1,1)
#Variable
ax.hist(age, bins=6)
plt.title('resting electrocardiographic results distribution of Patients')
plt.xlabel('resting electrocardiographic results')
plt.ylabel('No of People')
plt.show()
