# -*- coding: utf-8 -*-
#@author: abss

import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

file="../../HBDataBase/UCI_HB.csv"
file_data = pd.read_csv(file, sep=",")

age = file_data.iloc[:, 11]
class_label = file_data.iloc[:, 13]

ax1 = plt.subplots(1, 1)
ax1 = sns.violinplot(class_label, age)
ax1 = sns.despine()
plt.title('Distribution major vessels V/s Heart Condition')
plt.xlabel('Heart Condition Absence (1) Presence (2)')
plt.ylabel('major vessels')
plt.show()
