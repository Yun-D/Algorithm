def byeul(num):
    down = int(num / 2)
    up = num - down

    for i in range(up):
        print("* ", end="")
    print()
    for j in range(down):
        print(" *", end="")
    print()

n = int(input())
for _ in range(n) :
    byeul(n)