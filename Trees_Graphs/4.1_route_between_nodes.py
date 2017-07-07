class dag:
	def __init__(self, matrix):
		self.matrix = _matrix

	def get_adj(self, node):
		return [i for (i, val) in enumerate(self.matrix[node]) if val]

	def nb_nodes(self):
		return len(self.matrix)

def test():
	m = [[1,0,0,1]
		 [0,1,1,1]
		 [0,1,1,0]
		 [0,0,1,1]]

	d = dag(m)

	assert (hasPath(d,0,2))
	assert (hasPath(d,0,1))
	assert (hasPath(d,2,3))
	assert (hasPath(d,2,0)==False)
	assert (hasPath(d,1,0)==False)

	print('Test Ok')

def hasPath(dag, start, end):
	q = [start]
	visited = [0] * dag.nodes()
	while len(q) > 0:
		node = q.pop()
		visited[node] = 1
		if end==node:
			return True
		q = q + [x for x in dag.get_adj(node) if not visited[x]]
	return False