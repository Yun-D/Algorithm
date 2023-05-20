grade_list = ["A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"]
jumsu_list = [4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0]

total_hakjum = 0
total_grade = 0

for x in range(20) :
    name, hakjum, grade = input().split()
    hakjum = float(hakjum)

    if grade != "P":
        total_hakjum += hakjum
        total_grade += hakjum * jumsu_list[grade_list.index(grade)] # 학점 * 과목평점

print(total_grade / total_hakjum)