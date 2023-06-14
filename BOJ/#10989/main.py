import sys

n = int(sys.stdin.readline())
list = [0] * 10001 # 자리 만들어두기

for _ in range(n):
    list[int(sys.stdin.readline())] += 1 # 같은 수가 나온다면 ++

for i in range(10001):
    if list[i] != 0: # 나온 수를 발견한다면
        for j in range(list[i]): # 입력된 해당 수의 개수만큼
            print(i) # 프린트!