import sys
t = int(sys.stdin.readline())
data = [0]

for _ in range(t) :
    floor, room, n = map(int, sys.stdin.readline().split())

    ur_floor = n % floor
    ur_room = (n // floor) + 1

    if n % floor == 0: # 만약 n이 floor의 배수라면
        ur_floor = floor
        ur_room = n // floor

    print(ur_floor*100 + ur_room)