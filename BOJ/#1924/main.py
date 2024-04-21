import datetime

week = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]
x, y = map(int, input().split())
temp = datetime.date(2007, x,y).weekday()

print(week[temp])