scores = [12, 24, 10, 24]

min_score = scores[0]
max_score = scores[0]
min_count = 0
max_count = 0

for i in scores:
    if (i > max_score) :
        max_score = i
        max_count += 1
    elif (i < min_score) :
        min_score = i
        min_count += 1
result = [max_count, min_count]
return result