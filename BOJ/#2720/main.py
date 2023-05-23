t = int(input())
charge = [0.25, 0.10, 0.05, 0.01]

for i in range(t):
    list = [0, 0, 0, 0]
    temp = int(input()) / 100

    num = 0
    for j in range(4):
        if temp % charge[j] != temp :
            list[j] = int(temp / charge[j])
            temp = round(temp % charge[j], 2)
        else:
            list[j] = 0

    for j in range(4):
        print(list[j], end=" ")