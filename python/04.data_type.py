# data type
# numeric data: int: 4,-2, 0 ; float: 7.345 -9.0 ; complx: 7+8i;
# text data type : str: "python programming"
# boolean data: value True or False 
# sequenced data: list, tuple, range

#list is an ordered collection of data with elements separated by a comma and enclosed within square brackets. Lists are mutable and can be modified after creation.

list1= [22,11,[2,2],["manga","webtoon"]]
print(list1)

"""tuple is an ordered collection of data with elements separated by a comma and enclosed within parentheses. Tuples are immutable and can not be modified after creation."""

tuple1= (("Anya","Damian"),("Yor","Loid"))
print(tuple1)

"""range returns a sequence of numbers as specified by the user. If not specified by the user then it starts from 0 by default and increments by 1."""

sequence1= range(6,36,3)
for i in sequence1: 
    print (i)

#mapped data : dict
# dict is a dictionary is an unordered collection of data containing a key:value pair. The key:value pairs are enclosed within curly brackets 

dict1 = {"name":"Naruto","age": 30,"isHokage":True}
print(dict1)

#converting string to bytes

str1= "this is string one"
arr1= bytes(str1,'utf-8')
print(arr1)
arr2=bytes(str1,'utf-16')
print(arr2)


#Creating bytes to given size
byte_str=bytes(4)
print(byte_str)

#memory view: memoryview() function returns a memory view object from a specified object.

str1= bytes ("home","utf-8")
memoryViewStr = memoryview(str1)
print (list (memoryViewStr[0:]))

#set data 
# Set is an unordered collection of elements in which no element is repeated. 
# The elements of sets are separated by a comma and contained within curly braces.
set1 = {4,-5,23}
print(set1) 

#None: used to define a null value. 

state= None
print (type(state))

