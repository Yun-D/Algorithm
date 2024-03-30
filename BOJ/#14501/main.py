n = int(input())
schedule = [list(map(int, input().split())) for _ in range(n)]
dp = [0 for _ in range(n+1)]

for i in range(n-1, -1, -1) :
   if i + schedule[i][0] > n : #퇴사일을 넘긴다면 상담할 수 없음
       dp[i] = dp[i+1]
   else: #위 경우가 아닐 경우, i일에 상담하는 것과 하지 않는 것 중 큰 것 선택
       dp[i] = max( dp[i+1], dp[i+schedule[i][0]] + schedule[i][1])

print(dp[0])