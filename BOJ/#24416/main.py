def fib(n) :
    if n == 1 or n == 2 :
        return 1
    else:
        return fib(n-1) + fib(n-2)

def fibonacci(n) :
    dp = [0] * 100
    dp[1] = dp[2] = 1
    cnt = 0
    for i in range(3, n+1) : # 1, 2는 이미 1로 정해져 있으므로 n+1
        cnt += 1 # 실행 횟수를 세어줄 변수
        dp[i] = dp[i-1] + dp[i-2]
    return cnt


n = int(input())
print(fib(n), fibonacci(n))
