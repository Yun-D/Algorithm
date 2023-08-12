import sys
n = int(sys.stdin.readline())
hab = 0
temp = 0

while n >= hab :
    temp += 1
    hab += temp
print(temp-1)