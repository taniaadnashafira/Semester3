from collections import defaultdict

dataset = [10, 20, 30, 40, 50, 60]

def map_function(value):
    yield (value, 1)

def reduce_function(pairs):
    total_sum = 0
    total_count = 0
    for value, count in pairs:
        total_sum += value * count
        total_count += count
    average = total_sum / total_count if total_count != 0 else 0
    return average

def mapreduce_average(dataset):
    map_result = []
    for value in dataset:
        map_result.extend(map_function(value))
    return reduce_function(map_result)

average = mapreduce_average(dataset)

print(f"Rata-rata nilai: {average}")
