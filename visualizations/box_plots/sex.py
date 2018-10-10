# -*- coding: utf-8 -*-
#@author: abss

import pandas as pd
import matplotlib.pyplot as plt

file="../../HBDataBase/UCI_HB.csv"
file_data = pd.read_csv(file, sep=",")

age = file_data.iloc[:, 1]

fig=plt.figure()
ax = fig.add_subplot(1,1,1)
#Variable
ax.boxplot(age)
plt.title('Sex distribution of Patients')
plt.ylabel('Sex')
plt.show()
