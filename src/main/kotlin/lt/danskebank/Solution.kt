package lt.danskebank

class Solution {
    companion object {
        fun count(path: String): Int {
            // Your code here
            return 0
        }
    }
}

fun main() {
    // EXPLANATION:
    // val path = "udduuuudddudduuudddduduu" // 3
    //
    //       /\
    //      /  \      /\
    //_/\  /    \/\  /  \      _
    //   \/        \/    \    /
    //                    \/\/
    //

    val path = ""
    println(Solution.count(path))
}