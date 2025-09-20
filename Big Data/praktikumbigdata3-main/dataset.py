
from collections import defaultdict

def map_function(text):
    for word in text.split():
        yield (word, 1)

def reduce_function(pairs):
    result = defaultdict(int)
    for word, count in pairs:
        result[word] += count
    return result

file=open(r"C:\Users\Taniaadna\Downloads\pantun.csv", "r")
isi_file=file.read()
file.close()

mapped = list(map_function(isi_file))
print(mapped)

word_count = reduce_function(mapped)
print("Hasil word count: ", word_count)