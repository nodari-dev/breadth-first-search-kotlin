class BreathFirstSearch<T>(startVertex: Vertex<T>) {
    private val startVertex: Vertex<T> = startVertex

    // custom implementation for testing
    private val result: MutableList<T> = mutableListOf()
    fun getResult(): MutableList<T> {
        return result
    }
    // custom implementation for testing

    fun traverse(){
        val queue: MutableList<Vertex<T>> = mutableListOf()
        queue.add(startVertex)
        while(queue.isNotEmpty()){
            val current: Vertex<T>? = queue.removeFirstOrNull()
            if (current != null) {
                if(!current.isVisited()){
                    current.setVisited()
                    result.add(current.getData())
                    queue.addAll(current.getNeighbors())
                }
            }
        }
    }

}