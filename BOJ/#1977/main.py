import math

m = int(input())
n = int(input())
result = []

for i in range(m, n+1) :
    temp = int(math.sqrt(i))
    if temp * temp == i :
        result.append(i)

if len(result) > 0 :
    print(sum(result))
    print(result[0])
else:
    print(-1)