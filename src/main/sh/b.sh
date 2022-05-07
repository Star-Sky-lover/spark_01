#!/usr/bin/env bash

#awk -F ' ' '{print $1,$2,$3,$4,$5,$6}' words.txt

#sed -n '1,5p' words.txt

#cat words.txt | tr -s ' ' '\n' | sort | uniq -c | sort -r | awk '{ print $2, $1 }'

#cat words.txt

#readonly name="only_read"

name="this is"" my name"
name="this is my name"
echo ${#name}
echo "${name:0:22}" #从第一个字符开始截取22个字符
echo "${name: -15}" #从最后一个字符开始截取15个字符
echo "${name:7:5}"  #从最后一个字符开始截取5个字符

array_name=(1 2 3 4 5 6 7 8 9 10)
# shellcheck disable=SC2068
echo "${array_name[*]}"

# shellcheck disable=SC2128
for i in ${array_name}; do
  echo "$i"
done

a="abc"
b="abc"
if [ $a = $b ]; then
  echo true
else
  echo false
fi
if [ -z $a ]; then
  echo 1
else
  echo 2
fi

if [ -n "$a" ]; then
  echo true
else
  echo false
fi

if [ $a ]; then
  echo true
else
  echo false
fi


