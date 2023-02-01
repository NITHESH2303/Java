a= input()
b=input()
s=""
for i in range(len(a)):
    if(a[i:i+len(b)]==b):
        s+=a[i:i+len(b)]
    else:
        s+="+"
print(s[0:len(s)-1])