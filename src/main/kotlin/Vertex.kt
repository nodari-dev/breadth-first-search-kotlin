class Vertex<T> (data: T){
    private val data: T = data
    private var visited: Boolean = false
    private val neighbors: MutableList<Vertex<T>> = mutableListOf()

    fun setVisited(){
        visited = true
    }

    fun getNeighbors(): List<Vertex<T>> {
        return neighbors
    }

    fun setNeighbors(newNeighbors: List<Vertex<T>>){
        neighbors.addAll(newNeighbors)
    }

    fun isVisited(): Boolean{
        return visited
    }

    fun getData(): T{
        return data
    }
}