n = int(input())
paper = [[0] * 100 for _ in range(100)]
result = 0

for _ in range(n):
    x, y = map(int, input().split())
    for xarea in range(x, x+10) : #가로가 시작되는 점 + 색종이 크기 10
        for yarea in range(y, y+10) :
            paper[xarea][yarea] = 1 #색종이 영역에 1 채우기

for i in range(100) :
    result += paper[i].count(1) #해당 값이 1이면 색종이가 있던 곳. 값이 1이면 result++

print(result)