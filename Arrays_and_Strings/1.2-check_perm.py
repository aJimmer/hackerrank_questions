'''

Check Permutation - Given two strings, write a method to decide if one is a permutation of the other.
---------------------------------------------------------------------------------------------------------------------------------------
	• Strings of different lengths cannot be permutations of each other
	• Then we can sort the 2 strings and compare the strings. 
	
	Or
	
	• Use a map to increment and decrement letter frequencies, if all the values are zero in the end, the strings are permutations.
---------------------------------------------------------------------------------------------------------------------------------------

'''

def check_perm(str1, str2):

	if len(str1) != len(str2):
		return False
	str1_sorted = sorted(str1)
	str2_sorted = sorted(str2)

	if str1_sorted == str2_sorted:
		return True
	else:
		return False

print(check_perm('apple','lepp'))