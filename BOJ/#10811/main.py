n, m = map(int, input().split())
basket = list(range(1, n+1))
new_basket = basket.copy()

for x in range(m):
    i, j = map(int, input().split())
    basket = new_basket.copy()
    temp = i-1

    for y in reversed(range(i-1, j)):
        new_basket[temp] = basket[y]
        temp += 1

for x in range(n):
    print(new_basket[x], end=" ")