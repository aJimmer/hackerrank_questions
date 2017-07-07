# Recurse through the entire tree, and for each node, compute the heights of each subtree

## Solution 1

### O(nlogn)

def getHeight(root):
	if root == None:
		return -1
	if getHeight(root.left) < getHeight(root.right):
		return getHeight(root.left) + 1
	else:
		return getHeight(root.right) + 1

def isBalanced(root):
	if root == None

	heightDiff = getHeight(root.left) - getHeight(root.right)

	if heightDiff > 1:
		return False
	else:
		return isBalanced(root.left) and isBalanced(root.right)

## Solution 2

### get rid of some of the get height calls to run in O(N)

def checkHeight(root):
	if root == None:
		return -1
	
	leftHeight = checkHeight(root.left)
	if leftHeight == MIN
		return MIN
	
	rightHeight = checkHeight(root.right)
	if rightHeight == MIN
		return MIN

	heightDiff = leftHeight - rightHeight

	if heightDiff > 1:
		return MIN
	else:
		return max(leftHeight, rightHeight) + 1

def _isBalanced(root):
	return checkHeight(root) != MIN
##





