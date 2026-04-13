step1:
nano ceaser.sh

if [ "$1" = "enc" ]; then
  tr 'a-zA-Z' 'd-za-cD-ZA-C'
else
 tr 'd-za-cD-ZA-C' 'a-zA-Z'

fi

step2:

echo "hello" >plain.txt


step3:
chmod +x ceaser.sh

step4:

./ceaser.sh enc < plain.txt > cipher.txt


verify:
cat cipher.txt

step5:
./ceaser.sh dec < cipher.txt > recover.txt

verify:
cat recover.txt
