rep -l "@gmail.com" *.txt > EmailAddressFiles.txt
cat EmailAddressfiles.txt
grep -h "@gmail.com" *.txt > EmailAddresses.txt
cat EmailAddresses.txt 
sed 's/gmail/axelor/' EmailAddresses.txt

Answer
