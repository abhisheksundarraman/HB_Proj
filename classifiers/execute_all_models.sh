#!/usr/bin/bash -x 
while read line
do
echo "\n"
echo "Executing $line"
echo "\n"
python $line
done < list_of_models
