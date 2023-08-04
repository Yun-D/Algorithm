n = int(input())
call = list(map(int, input().split()))

youngsik = minsik = 0

for i in range(n) :
    youngsik += (call[i] // 30 + 1) * 10
    minsik += (call[i] // 60 + 1) * 15


if youngsik < minsik :
    print("Y", youngsik)
elif youngsik == minsik :
    print("Y M", youngsik)
else:
    print("M", minsik)