n, b = map(int, input().split())
arr = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
answer = ''

while n :
    answer += arr[n%b]
    n //= b

print(answer[::-1])