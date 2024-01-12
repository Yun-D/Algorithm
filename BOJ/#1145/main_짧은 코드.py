num_list = list(map(int, input().split()))

result = min(num_list)
while True :
    cnt = 0

    for temp in num_list :
        if result % temp == 0 :
            cnt += 1
    if cnt > 2 :
        break
    else:
        result += 1

print(result)