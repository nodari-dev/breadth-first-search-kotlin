import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BreathFirstSearchTest {
    private val v0: Vertex<String> = Vertex("0")
    private val v1: Vertex<String> = Vertex("1")
    private val v2: Vertex<String> = Vertex("2")
    private val v3: Vertex<String> = Vertex("3")
    private val v4: Vertex<String> = Vertex("4")
    private val v5: Vertex<String> = Vertex("5")

    @Test
    fun `works correctly`(){
        v0.setNeighbors(listOf(v5, v1))
        v5.setNeighbors(listOf(v2, v3))
        v1.setNeighbors(listOf(v4))

        val expectedResult = listOf<String>("0", "5", "1", "2", "3", "4")
        val bfs: BreathFirstSearch<String> = BreathFirstSearch(v0)

        bfs.traverse()

        assertEquals(bfs.getResult(), expectedResult)
    }

}