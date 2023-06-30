n = int(input())
n_list = list(map(int, input().split()))
result = 0

for i in range(n) :
    err = 0
    if n_list[i] > 1 :
        for j in range(2, n_list[i]) :
            if n_list[i] % j == 0 :
                err += 1

        if err == 0 :
            result += 1

print(result)