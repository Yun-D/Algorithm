n, m = map(int, input().split())
basket = list(range(1, n+1))

for x in range(m):
    i, j = map(int, input().split())
    temp_list = basket[i-1:j] #슬라이스
    temp_list.reverse()
    basket[i-1:j] = temp_list

for x in range(n):
    print(basket[x], end=" ")