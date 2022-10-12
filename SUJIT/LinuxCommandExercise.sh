: 'fetch all the files recursively from the specified directory Path in argument 
check if the file is xml then copy it in a directory named "xml" in the current directory. 
check if filename contains any special character rename it to only alphanumeric name (means remove all special character from fileName)
check which file contains emailAddress and list out all those file names in file named "EmailAddressFiles.txt" and those emailAddress in file named "EmailAddresses.txt" in current directory. 
& replace @gmail.com in all emailAddresses in all files with @axelor.com.'


#!/bin/sh

path=/Training/Command/

mkdir xml

for file in $path
do

cp *.xml xml/

rename 's/(@|~|#|%)//' *.txt
done

grep -l "@gmail.com" *.txt > EmailAddressFiles.txt

cat EmailAddressFiles.txt

grep -h "@gmail.com" *.txt > EmailAddresses.txt

cat EmailAddresses.txt

sed 's/@gmail.com/@axelor.com/' EmailAddresses.txt
