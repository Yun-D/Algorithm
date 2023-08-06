a, b = map(int, input().split())

min = min(a, b)
max = max(a, b)

if min == max or min + 1 == max :
    print(0)
else:
    print(max - min - 1)

for i in range(min+1, max) :
    print(i,end= " ")