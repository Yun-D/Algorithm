def is_sosu(num) :
    if num == 1 : return 1
    error = 0
    for j in range(2, num // 2 + 1):
        if num % j == 0:
            error += 1
            break
    return error

m = int(input())
n = int(input())

sosu = []
for i in range(m, n+1) :
    if is_sosu(i) == 0 :
        sosu.append(i)

if len(sosu) > 0 :
    print(sum(sosu))
    print(sosu[0])
else:
    print(-1)