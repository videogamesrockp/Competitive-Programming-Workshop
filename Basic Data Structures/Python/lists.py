list = []

for i in range(5):
    list.append(i) # Add to list

for i in range(len(list)): # len(list) gets number of elements in list
    print(list[i]) # Access element at index i in list

list.pop(0) # Remove from beginning of list in O(n)

for i in list:
    print(i) # Iterate through list in a different way

tup = (5, 6) # Can't modify elements in tuple

print(tup)
