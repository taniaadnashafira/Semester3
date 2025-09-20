from collections import defaultdict

with open(r"C:\Users\Taniaadna\.m2\Documents\Hello.txt", "r") as file:
    data = file.readlines()

def map_function(text):
    for word in text.split():
        yield (word, 1)

def reduce_function(pairs):
    result = defaultdict(int)
    for word, count in pairs:
        result[word] += count
    return result

def mapreduce_wordcount(texts):
    map_result = []
    for text in texts:
        map_result.extend(map_function(text))
    return reduce_function(map_result)

mapped = mapreduce_wordcount(data)

for word, count in mapped.items():
    print(f"{word} : {count}")

