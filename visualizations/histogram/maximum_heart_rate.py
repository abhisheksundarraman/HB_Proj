# -*- coding: utf-8 -*-
#@author: abss

import pandas as pd
import matplotlib.pyplot as plt

file="../../HBDataBase/UCI_HB.csv"
file_data = pd.read_csv(file, sep=",")

age = file_data.iloc[:, 7]

fig=plt.figure()
ax = fig.add_subplot(1,1,1)
#Variable
ax.hist(age, bins=7)
plt.title('maximum heart rate distribution of Patients')
plt.xlabel('maximum heart rate')
plt.ylabel('No of people')
plt.show()
