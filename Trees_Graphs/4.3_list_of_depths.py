class LinkedList:
	next = None
	val = None

	def __init__(self, val):
		self.val = val

	def add(self, val):
		if self.next == None:
			self.next = LinkedList(val)
		else:
			self.next.add(val)

	def __str__(self):
		return "({val})".format(val = self.val)+str(self.next)

class BinaryTree:
	val = None
	left = None
	right = None

	def __init__(self, val):
		self.val  = val

	def __str__(self):
		return "<Binary Tree (val is {val}). \n\tleft is {left} \n\tright is {right}>".format(val=self.val, left=self.left, right=self.right)

	def depth(tree):
		if tree == None:
			return 0
		if tree.left == None and tree.right == None:
			return 1

		else:
			depthLeft = 1 + depth(tree.left)
			depthRight = 1 + depth(tree.right)
			if depthLeft > depthRight:
				return depthLeft
			else:
				return depthRight

	 