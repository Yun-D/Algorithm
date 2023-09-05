global tttemp
tttemp = 1

def recursion(s, l, r):
    if l >= r: return 1
    elif s[l] != s[r]: return 0
    else:
        global tttemp
        tttemp += 1
        return recursion(s, l+1, r-1)

def isPalindrome(s):
    return recursion(s, 0, len(s)-1)



n = int(input())

for _ in range(n) :
    temp = input()
    print(isPalindrome(temp), tttemp)
    tttemp = 1
