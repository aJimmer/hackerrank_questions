class Node:
	val = None
	left = None
	right = None

	def __init__(self, val):
		self.val = val

def createMinimalBST(arr, start, end):
	if end < start:
		return None
	mid = (start + end) / 2
	n = Node(arr[mid])

	n.left = createMinimalBST(arr, start, mid - 1)
	n.right = createMinimalBST(arr, mid + 1, end)

	return n
	