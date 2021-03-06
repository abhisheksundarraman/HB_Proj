# -*- coding: utf-8 -*-
#@author: abss

import pandas as pd
import matplotlib.pyplot as plt

file="../../HBDataBase/UCI_HB.csv"
file_data = pd.read_csv(file, sep=",")

age = file_data.iloc[:, 9]

fig=plt.figure()
ax = fig.add_subplot(1,1,1)
#Variable
ax.hist(age, bins=8)
plt.title('oldpeak distribution of Patients')
plt.ylabel('No of People')
plt.xlabel('oldpeak')
plt.show()
