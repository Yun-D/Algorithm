# n의 이친수는 n-1의 이친수, n-2의 이친수를 더한 값과 같음. 피보나치와 동일함
# 2 : 10
# 3 : 100 101
# 4 : 1000 1001 1010
# 5 : 10000 10001 10101 10100 10010
# 이전 이친수에 0이나 01을 붙이면 n의 이친수가 됨!

def dpdp (num) :
    dp = [0] * (n + 1)

    if num <=2 :
        return 1
    else:
        dp[1] = dp[2] = 1
        for i in range(3, num + 1):
            dp[i] = dp[i - 1] + dp[i - 2]
        return dp[num]

n = int(input())
print(dpdp(n))