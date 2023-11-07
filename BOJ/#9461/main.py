def pado(n) :
    dp = [0] * (n+3)
    dp[0] = dp[1] = dp[2] = 1
    for i in range(3, n+3) :
        dp[i] = dp[i-3] + dp[i-2]
    return dp[n-1]

t = int(input())

for _ in range(t) :
    n = int(input())
    print(pado(n))
