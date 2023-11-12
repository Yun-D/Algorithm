t = int(input())
stair = [0] * 301
for i in range(1, t+1) :
    stair[i] = int(input())

dp = [0] * 301
dp[1] = stair[1]
dp[2] = stair[1] + stair[2] #첫번째, 두번째 계단을 밟았을 경우
dp[3] = max(stair[1] + stair[3], stair[2] + stair[3]) #첫번째, 세번째 계단을 밟았을 경우, 두번째, 세번째 계단을 밟았을 경우 중 더 큰 값

for i in range(4, t+1) :
    dp[i] = max(dp[i-3] + stair[i-1] + stair[i], dp[i-2] + stair[i])

print(dp[t])