import sys

n = int(sys.stdin.readline())
xlist = [[0] * 2 for i in range(n)]

for i in range(n) :
    x, y = map(int, sys.stdin.readline().split())
    xlist[i][0] = x
    xlist[i][1] = y

answer_list = sorted(xlist)

for x in range(n) :
    print(answer_list[x][0], answer_list[x][1])