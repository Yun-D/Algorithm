s = input()
alphalist = [0 for _ in range(26)]

for i in s :
    alphalist[ord(i)-97] += 1

for i in alphalist :
    print(i, end=" ")