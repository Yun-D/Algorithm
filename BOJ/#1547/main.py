m = int(input())
cups = [0 for _ in range(4)]
cups[1] = 1 #첫번째 컵에 공 넣기

for _ in range(m) :
    i, j = map(int, input().split())
    cups[i], cups[j] = cups[j], cups[i]

print(cups.index(1))
