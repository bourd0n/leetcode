import com.bourd0n.leetcode.twosum.BruteForceSolution
import com.bourd0n.leetcode.twosum.OnePassHashTableSolution
import com.bourd0n.leetcode.twosum.Solution
import com.bourd0n.leetcode.twosum.TwoPassHashTableSolution
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

import java.util.ArrayList

@RunWith(Parameterized::class)
class SolutionTest(private val solution: Solution) {

    @Test
    fun test1() {
        val result = solution.twoSum(intArrayOf(2, 7, 11, 15), 9)
        Assert.assertArrayEquals(intArrayOf(0, 1), result)
    }

    @Test
    fun test2() {
        val result = solution.twoSum(intArrayOf(1, 2, 3, 11, 15, 7), 9)
        Assert.assertArrayEquals(intArrayOf(1, 5), result)
    }

    @Test
    fun test3() {
        val solution = TwoPassHashTableSolution()
        val result = solution.twoSum(intArrayOf(1, 2, 0, 11, 15, 7), 15)
        Assert.assertArrayEquals(intArrayOf(2, 4), result)
    }

    @Test
    fun test4() {
        val result = solution.twoSum(intArrayOf(-1, -2, -3, -4, -5), -8)
        Assert.assertArrayEquals(intArrayOf(2, 4), result)
    }

    @Test
    fun test5() {
        val result = solution.twoSum(intArrayOf(3, 3), 6)
        Assert.assertArrayEquals(intArrayOf(0, 1), result)
    }

    companion object {

        @JvmStatic
        @Parameterized.Parameters(name = "{0}")
        fun impls(): Collection<Solution> {
            return object : ArrayList<Solution>() {
                init {
                    add(BruteForceSolution())
                    add(TwoPassHashTableSolution())
                    add(OnePassHashTableSolution())
                }
            }
        }
    }
}
