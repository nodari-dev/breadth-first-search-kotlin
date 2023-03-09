import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class VertexTest {

    @Test
    fun `works correctly`(){
        val vertex: Vertex<String> = Vertex("hello")
        val vertexTwo: Vertex<String> = Vertex("hello two")

        val neighbors: List<Vertex<String>> = listOf(vertexTwo)

        assertEquals(vertex.isVisited(), false)
        vertex.setVisited()
        assertEquals(vertex.isVisited(), true)

        assertEquals(vertex.getNeighbors().size, 0)
        vertex.setNeighbors(neighbors)
        assertEquals(vertex.getNeighbors().size, 1)

        assertEquals(vertex.getData(), "hello")
    }
}