n, k = map(int, input().split())
list = []

for x in range(1, n+1):
    if n % x == 0:
        list.append(x)
    else:
        continue


if k > len(list):
    print(0)
else:
    print(list[k-1])