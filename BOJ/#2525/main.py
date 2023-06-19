hh, mm = map(int, input().split())
cook = int(input())

mm += cook
if mm < 60 :
    print(hh, mm)
else :
    hh = hh + (mm // 60)
    mm = mm % 60

    if hh > 23 :
        hh = hh-24
    print(hh, mm)