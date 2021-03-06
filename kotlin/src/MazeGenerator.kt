import java.util.Random

class MazeGenerator {
    var target = 0
        set(value) {
            jumps.ensureKey(field, { mutableSetOf() }) { _, set ->
                set.add(value)
                set
            }
            flow.add(field)
            field = value
        }
    var random = Random(0)
    var result = StringBuffer()

    private fun clear() = result.setLength(0)

    private fun appendNewLine() {
        result.append("\n")
    }

    private fun append(text: String) {
        result.append(text)
    }

    private fun nextInt(count: Int) = (count * random.nextFloat()).toInt() + 1

    fun run(width: Int, height: Int): String {
        clear()
        append("`MazeGenerator` - Copyright by Creative Computing, Morristown, NJ\n")

        if (width == 1 || height == 1) return result.toString()

        val wArray = Array(width + 1) { IntArray(height + 1) }
        val values = Array(width + 1) { IntArray(height + 1) }

        var q = 0
        var z = 0
        var x = nextInt(width)

        // 130:170
        (1..width).forEach {
            append(if (it == x) "+  " else "+--")
        }

        // 180
        append("+\n")

        // 190
        wArray[x][1] = 1
        var c = 2

        // 200
        var r = x
        var s = 1
        target = 270


        while (target != -1) {
            when (target) {
                210 -> {
                    target = if (r != width)
                        250
                    else
                        220
                }

                220 -> {
                    target = if (s != height)
                        240
                    else {
                        r = 1
                        s = 1
                        260
                    }
                }

                240 -> {
                    r = 1
                    s++
                    target = 260
                }

                250 -> {
                    r++
                    target = 260
                }

                260 -> {
                    target = if (wArray[r][s] == 0)
                        210
                    else
                        270
                }

                270 -> {
                    target = if (r - 1 == 0)
                        600
                    else
                        280
                }

                280 -> {
                    target = if (wArray[r - 1][s] != 0)
                        600
                    else
                        290
                }

                290 -> {
                    target = if (s - 1 == 0)
                        430
                    else
                        300
                }

                300 -> {
                    target = if (wArray[r][s - 1] != 0)
                        430
                    else
                        310
                }

                310 -> {
                    target = if (r == width)
                        350
                    else
                        320
                }

                320 -> {
                    target = if (wArray[r + 1][s] != 0)
                        350
                    else
                        330
                }

                330 -> {
                    x = nextInt(3)
                    target = 340
                }

                340 -> {
                    target = if (x == 1) {
                        wArray[r - 1][s] = c
                        950
                    } else if (x == 2)
                        980
                    else if (x == 3) {
                        wArray[r + 1][s] = c
                        1030
                    } else
                        350
                }

                350 -> {
                    target = if (s != height)
                        380
                    else
                        360
                }

                360 -> {
                    target = if (z == 1)
                        410
                    else
                        370
                }

                370 -> {
                    q = 1
                    target = 390
                }

                380 -> {
                    target = if (wArray[r][s + 1] != 0)
                        410
                    else
                        390
                }

                390 -> {
                    x = nextInt(3)
                    target = 400
                }

                400 -> {
                    target = if (x == 1) {
                        wArray[r - 1][s] = c
                        950
                    } else if (x == 2)
                        980
                    else if (x == 3)
                        1090
                    else
                        410
                }

                410 -> {
                    x = nextInt(2)
                    target = 420
                }

                420 -> {
                    target = if (x == 1) {
                        wArray[r - 1][s] = c
                        950
                    } else if (x == 2)
                        980
                    else
                        430
                }

                430 -> {
                    target = if (r == width)
                        530
                    else
                        440
                }

                440 -> {
                    target = if (wArray[r + 1][s] != 0)
                        530
                    else
                        450
                }

                450 -> {
                    target = if (s != height)
                        480
                    else
                        460
                }

                460 -> {
                    target = if (z == 1)
                        510
                    else
                        470
                }

                470 -> {
                    q = 1
                    target = 490
                }

                480 -> {
                    target = if (wArray[r][s + 1] != 0)
                        510
                    else
                        490
                }

                490 -> {
                    x = nextInt(3)
                    target = 500
                }

                500 -> {
                    target = when (x) {
                        1 -> {
                            wArray[r - 1][s] = c
                            950
                        }
                        2 -> {
                            wArray[r + 1][s] = c
                            1030
                        }
                        3 -> 1090
                        else -> 510
                    }
                }

                510 -> {
                    x = nextInt(2)
                    target = 520
                }

                520 -> {
                    target = if (x == 1) {
                        wArray[r - 1][s] = c
                        950
                    } else if (x == 2) {
                        wArray[r + 1][s] = c
                        1030
                    } else
                        530
                }

                530 -> {
                    target = when {
                        s != height -> 560
                        z == 1 -> 590
                        else -> {
                            q = 1
                            570
                        }
                    }
                }

                560 -> {
                    target = if (wArray[r][s + 1] != 0)
                        590
                    else
                        570
                }

                570 -> {
                    x = nextInt(2)
                    target = 580
                }

                580 -> {
                    target = if (x == 1) {
                        wArray[r - 1][s] = c
                        950
                    } else if (x == 2)
                        1090
                    else
                        590
                }

                590 -> {
                    wArray[r - 1][s] = c
                    target = 950
                }

                600 -> {
                    target = if (s - 1 == 0)
                        790
                    else
                        610
                }

                610 -> {
                    target = if (wArray[r][s - 1] != 0)
                        790
                    else
                        620
                }

                620 -> {
                    target = if (r == width)
                        720
                    else
                        630
                }

                630 -> {
                    target = if (wArray[r + 1][s] != 0)
                        720
                    else
                        640
                }

                640 -> {
                    target = if (s != height)
                        670
                    else
                        650
                }

                650 -> {
                    target = if (z == 1) {
                        x = nextInt(2)
                        710
                    } else {
                        q = 1
                        x = nextInt(3)
                        690
                    }
                }

                670 -> {
                    target = if (wArray[r][s + 1] != 0) {
                        x = nextInt(2)
                        710
                    } else {
                        x = nextInt(3)
                        690
                    }
                }

                690 -> {
                    target = if (x == 1)
                        980
                    else if (x == 2) {
                        wArray[r + 1][s] = c
                        1030
                    } else if (x == 3)
                        1090
                    else {
                        x = nextInt(2)
                        710
                    }
                }

                710 -> {
                    target = when (x) {
                        1 -> 980
                        2 -> {
                            wArray[r + 1][s] = c
                            1030
                        }
                        else -> 720
                    }
                }

                720 -> {
                    target = when {
                        s != height -> 750
                        z == 1 -> 980
                        else -> {
                            q = 1
                            x = nextInt(2)
                            770
                        }
                    }
                }

                750 -> {
                    target = if (wArray[r][s + 1] != 0)
                        980
                    else {
                        x = nextInt(2)
                        770
                    }
                }


                770 -> {
                    target = when (x) {
                        1 -> 980
                        2 -> 1090
                        else -> 980
                    }
                }

                790 -> {
                    target = if (r == width)
                        880
                    else
                        800
                }

                800 -> {
                    target = if (wArray[r + 1][s] != 0)
                        880
                    else
                        810
                }

                810 -> {
                    target = if (s != height)
                        840
                    else
                        820
                }

                820 -> {
                    target = if (z == 1) {
                        wArray[r + 1][s] = c
                        1030
                    } else {
                        q = 1
                        c++
                        1000
                    }
                }

                840 -> {
                    target = if (wArray[r][s + 1] != 0) {
                        wArray[r + 1][s] = c
                        1030
                    } else
                        850
                }

                850 -> {
                    x = nextInt(2)
                    target = 860
                }

                860 -> {
                    target = when (x) {
                        2 -> 1090
                        else -> {
                            wArray[r + 1][s] = c
                            1030
                        }
                    }
                }

                880 -> {
                    target = if (s != height)
                        910
                    else
                        890
                }

                890 -> {
                    target = if (z == 1)
                        210
                    else {
                        q = 1
                        1090
                    }
                }

                910 -> {
                    target = if (wArray[r][s + 1] != 0)
                        210
                    else
                        1090
                }

                950 -> {
                    c++
                    values[r - 1][s] = 2
                    r--
                    target = 960
                }

                960 -> {
                    target = if (c == width * height + 1)
                        -1
                    else
                        970
                }

                970 -> {
                    q = 0
                    target = 270
                }

                980 -> {
                    wArray[r][s - 1] = c
                    c++
                    target = 1000
                }

                1000 -> {
                    values[r][s - 1] = 1
                    s--
                    target = if (c == width * height + 1)
                        -1
                    else
                        1010
                }

                1010 -> {
                    q = 0
                    target = 270
                }

                1030 -> {
                    c++
                    target = if (values[r][s] == 0) {
                        values[r][s] = 2
                        r++
                        1070
                    } else {
                        values[r][s] = 3
                        r++
                        1070
                    }
                }

                1070 -> {
                    target = if (c == width * height + 1)
                        -1
                    else
                        600
                }

                1090 -> {
                    target = when (q) {
                        1 -> {
                            z = 1
                            if (values[r][s] == 0) {
                                values[r][s] = 1
                                q = 0
                                r = 1
                                s = 1
                                260
                            } else {
                                values[r][s] = 3
                                q = 0
                                210
                            }
                        }
                        else -> 1100
                    }
                }

                1100 -> {
                    wArray[r][s + 1] = c
                    c++
                    target = if (values[r][s] == 0) {
                        values[r][s] = 1
                        1130
                    } else {
                        values[r][s] = 3
                        1130
                    }
                }

                1130 -> {
                    s++
                    target = if (c == height * width + 1)
                        -1
                    else
                        270
                }
            }
        }

        return finalize(width, height, values)
    }

    private fun finalize(width: Int, height: Int, values: Array<IntArray>): String {
        for (col in 1..height) {
            append("|")
            for (row in 1..width) {
                append(if (values[row][col] >= 2) "   " else "  |")
            }

            append(" \n")
            for (row in 1..width) {
                append(when (values[row][col]) {
                    0, 2 -> "+--"
                    else -> "+  "
                })
            }
            append("+\n")
        }

        val ret = result.toString()
        result.setLength(0)
        return ret
    }
}

fun main() {
    val cols = System.getenv("cols")?.toInt() ?: 10
    val rows = System.getenv("rows")?.toInt() ?: 10
    val amazing = MazeGenerator()
    val result = amazing.run(cols, rows)

    println(result)
//    jumps.forEach { i, set ->
//        println("${set.toString().padEnd(20)} -> $i")
//    }
//    println(flow)
}

fun <TKey, TValue> MutableMap<TKey, TValue>.ensureKey(key: TKey, default: (TKey) -> TValue, block: (TKey, TValue) -> TValue) {
    if (key !in this) {
        this[key] = default(key)
    }
    this[key] = block(key, getValue(key))
}

val jumps = mutableMapOf<Int, MutableSet<Int>>()
val flow = mutableListOf<Int>()
