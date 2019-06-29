package lt.danskebank

import org.junit.Test
import kotlin.test.assertEquals

class SolutionSpec {

    @Test
    fun `Case 1`() {
        assertEquals(3, Solution.count("udduuuudddudduuudddu"))
    }

    @Test
    fun `Case 2`() {
        assertEquals(7, Solution.count("uudddudduuuddduduuuddudddduuuduuuuudddduddduuduu"))
    }

    @Test
    fun `Case 3`() {
        assertEquals(4, Solution.count("uuudduddduddduuduuuuddduuuuudddudddduduu"))
    }

    @Test
    fun `Case 4`() {
        assertEquals(1, Solution.count("uudduuuddudddu"))
    }

    @Test
    fun `Case 5`() {
        assertEquals(3, Solution.count("ddduudddduuduuuduuuuddduddduuduu"))
    }

    @Test
    fun `Case 6`() {
        assertEquals(5, Solution.count("dddduuduuduuuuduudddduuuudduddddduduuduuduuudduddu"))
    }

    @Test
    fun `Case 7`() {
        assertEquals(4, Solution.count("duuudddudddddduuduuuduuuuudddu"))
    }

    @Test
    fun `Case 8`() {
        assertEquals(3, Solution.count("uddudduuuuuuuuuddududddudddudududddu"))
    }

    @Test
    fun `Case 9`() {
        assertEquals(1, Solution.count("uuuddudduuduuddddddududuududuu"))
    }

    @Test
    fun `Case 10`() {
        assertEquals(6, Solution.count("uuuuuddduuddduddduduuuuuddduddddduuuduuuuuddduuddddddduuuduudu"))
    }
}
