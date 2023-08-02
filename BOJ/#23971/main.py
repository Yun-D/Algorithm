import math
h, w, n, m = map(int, input().split())

row = math.ceil(h / (n+1)) #행에 n+1이 몇 번 들어갈 수 있을지 구하고 이를 올려줌
column = math.ceil(w / (m+1))

print(row * column)