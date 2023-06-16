import sys

n = int(sys.stdin.readline())
xlist = []
ylist = []

for _ in range(n) :
    x, y = map(int, sys.stdin.readline().split())
    xlist.append(x)
    ylist.append(y)

print( abs(max(xlist) - min(xlist)) * abs(max(ylist) - min(ylist)) )