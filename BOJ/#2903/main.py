n = int(input())

num = 3
temp = 1
for x in range(n-1):
    temp *= 2
    num += temp

print(num**2)