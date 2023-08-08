n = int(input())

for _ in range(n) :
    temp_list = list(map(int, input().split()))
    result = 0

    for i in range(1, len(temp_list) - 1):
        for j in range(i + 1, len(temp_list)):
            if temp_list[i] > temp_list[j]:
                temp_list[i], temp_list[j] = temp_list[j], temp_list[i] #스왑
                result += 1

    print(temp_list[0], result)