def student_result():
    name = "Aidos"

    programming = 85
    math = 90
    english = 75  # Сумма = 250

    total = programming + math + english  
    average = total / 3 

    print("Student:", name)
    print("Programming:", programming)
    print("Math:", math)
    print("English:", english)
    print("Total:", total)
    print("Average:", round(average, 2))  

    if average >= 90:
        grade = "A"
    elif average >= 83:
        grade = "B"
    elif average >= 50:
        grade = "C"
    else:
        grade = "F"

    print("Grade:", grade)

    bonus = 10
    final_score = average + bonus

    print("Final score:", round(final_score, 2))

    scores = [programming, math, english]
    print("First subject (index 0):", scores[0])  
    
    comment = "Good job"  
    print("Comment length:", len(comment))

    result = "SUCCESS"
    print("Result:", result)
    print("Average rounded:", round(average, 2))

student_result()
