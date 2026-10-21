digit = 918
rev = 0 
while digit > 0:
    rem = digit%10
    rev = rem * 10 + digit
    digit = digit//10
print(rev)
