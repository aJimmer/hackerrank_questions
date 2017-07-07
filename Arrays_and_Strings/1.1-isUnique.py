'''Is Unique - Implement an algorithm to determine if a string has all unique characters. 
			 What if you cannot use additional data structures?
---------------------------------------------------------------------------------------------------------------------------------------
	• Create a Boolean array the size of the number of character sets
	• Iterate through the string and set the corresponding index to true, if its already true then characters are not unique
	• You can also just compare each letter to every other letter, or sort the string and compare consecutive characters for doubles
---------------------------------------------------------------------------------------------------------------------------------------'''

def isUnique(str):

	bit_vector = [False] * 26
	
	for i in str:

		val = ord(i) - 97

		if bit_vector[val]:
			return 'is not unique'
		
		bit_vector[val] = True
	
	print(bit_vector)
	return 'is unique'


check = isUnique('abcdefghijklmnopqrstuvwxyz')
print(check)

