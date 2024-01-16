n = int(input())
rainbow = {'ChongChong'}

for i in range(n) :
    a, b = map(str, input().split())
    if a in rainbow : rainbow.add(b) #총총이를 만난 토끼를 rainbow 세트에 넣는다
    elif b in rainbow : rainbow.add(a)
    else : continue

print(len(rainbow))

