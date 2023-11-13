t = int(input())
dp = []
for i in range(1, t+1) :
    dp.append(list(map(int, input().split())))

for i in range(1, t) :
    for j in range(0, i+1) : # 층수 만큼의 칸을 돈다
        if j==0 : # 왼쪽
            dp[i][j] += dp[i-1][j]
        elif j==i : # 오른쪽
            dp[i][j] += dp[i-1][j-1]
        else: # 내부
            dp[i][j] += max(dp[i-1][j], dp[i-1][j-1]) # 상위 값 중 누적된 값이 더 큰 값과 더해준다.

print(max(dp[t-1]))