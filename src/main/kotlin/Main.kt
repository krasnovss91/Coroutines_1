import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main(args: Array<String>) {
    coroutineJob_1()
    coroutineJob_2()
    coroutineLob_3()
}

suspend fun coroutineJob_1() =
    coroutineScope {
        var job = launch {
            val str = "1215 544 965"
            println(str.split(" ".toRegex()).toTypedArray().size)
            delay(1000)
        }
    }

suspend fun coroutineJob_2() =
    coroutineScope {
        var job = launch {
            val str = "743 239 032 832 03"
            println(str.split(" ".toRegex()).toTypedArray().size)
            delay(1000)
        }
    }

suspend fun coroutineLob_3() =
    coroutineScope {
        var job = launch {
            val str = "8923 232"
            println(str.split(" ".toRegex()).toTypedArray().size)
            delay(1000)
        }
    }

