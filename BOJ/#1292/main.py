a, b = map(int, input().split())
num_list = []

if a == 1 and b == 1:
    print(1)
else :
    for i in range(b) :
        for j in range(i) :
            num_list.append(i)

    print(sum(num_list[a-1:b]))