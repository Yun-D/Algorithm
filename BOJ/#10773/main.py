import sys
k = int(sys.stdin.readline())
data = [0]

for _ in range(k) :
    num = int(sys.stdin.readline())
    if num == 0 :
        data.pop()
    else:
        data.append(num)

print(sum(data))