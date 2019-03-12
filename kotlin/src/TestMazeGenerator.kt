// Copyright 2003, William C. Wake. All rights reserved.

import junit.framework.TestCase

import java.util.Random

class TestMazeGenerator : TestCase() {
    fun testSeed0size15x20() {
        val expected = "`MazeGenerator` - Copyright by Creative Computing, Morristown, NJ\n" +
            "+--+--+--+--+--+--+--+--+--+--+  +--+--+--+--+\n" +
            "|  |           |        |     |     |        | \n" +
            "+  +  +  +  +  +  +--+  +  +  +  +--+  +--+  +\n" +
            "|     |  |  |  |     |     |     |     |  |  | \n" +
            "+--+--+  +  +--+  +  +--+--+--+--+  +  +  +  +\n" +
            "|     |  |        |  |              |  |     | \n" +
            "+  +  +  +--+--+--+  +  +  +--+--+--+--+--+--+\n" +
            "|  |     |        |     |  |     |        |  | \n" +
            "+--+--+  +--+  +--+  +--+  +  +  +  +--+  +  +\n" +
            "|     |        |        |  |  |     |     |  | \n" +
            "+  +  +--+--+--+  +--+  +  +  +--+--+  +--+  +\n" +
            "|  |              |     |  |  |     |  |     | \n" +
            "+  +--+--+--+--+--+--+  +  +  +  +--+  +--+  +\n" +
            "|        |           |  |  |  |     |  |     | \n" +
            "+  +--+  +--+  +  +  +  +  +  +--+  +  +  +--+\n" +
            "|  |     |     |  |  |  |  |     |  |  |  |  | \n" +
            "+  +  +--+  +--+  +  +  +  +--+  +  +  +  +  +\n" +
            "|  |        |     |  |  |        |  |  |  |  | \n" +
            "+  +--+  +--+  +--+  +  +--+--+--+  +  +  +  +\n" +
            "|     |     |  |  |  |  |     |        |     | \n" +
            "+--+  +--+  +  +  +  +--+  +  +  +--+--+  +--+\n" +
            "|  |     |  |     |     |  |  |     |  |     | \n" +
            "+  +--+  +--+--+--+  +  +  +  +--+  +  +  +  +\n" +
            "|     |     |     |  |  |  |     |  |  |  |  | \n" +
            "+  +  +--+  +  +  +--+  +  +--+  +  +  +  +  +\n" +
            "|  |        |  |     |  |     |     |  |  |  | \n" +
            "+  +--+--+  +--+  +  +  +--+  +--+--+  +  +--+\n" +
            "|  |     |        |  |     |     |     |     | \n" +
            "+  +  +--+--+--+--+  +  +--+  +  +  +--+--+  +\n" +
            "|     |           |  |     |  |  |  |     |  | \n" +
            "+  +--+  +--+--+--+  +--+  +  +  +  +  +  +  +\n" +
            "|  |                 |     |  |  |     |  |  | \n" +
            "+  +  +--+--+--+--+--+  +--+  +--+  +--+  +  +\n" +
            "|  |  |  |           |     |     |  |     |  | \n" +
            "+  +  +  +  +--+  +  +--+  +--+  +  +  +--+  +\n" +
            "|  |  |     |     |  |  |     |     |  |     | \n" +
            "+--+  +--+--+  +  +  +  +  +  +--+--+  +--+  +\n" +
            "|     |        |  |  |  |  |  |     |        | \n" +
            "+  +--+  +--+--+  +  +  +  +  +--+  +  +--+--+\n" +
            "|        |        |     |  |        |        | \n" +
            "+--+--+--+--+--+--+--+--+  +--+--+--+--+--+--+\n"

        val amazing = MazeGenerator()
        amazing.random = Random(0)
        val result = amazing.run(15, 20)

        assertEquals("Should have the maze that was expected", expected, result)
    }

    fun testSeed100size4x5() {
        val expected = "`MazeGenerator` - Copyright by Creative Computing, Morristown, NJ\n" +
            "+--+--+  +--+\n" +
            "|     |     | \n" +
            "+  +--+  +  +\n" +
            "|  |     |  | \n" +
            "+  +  +--+  +\n" +
            "|  |  |     | \n" +
            "+  +  +  +  +\n" +
            "|  |  |  |  | \n" +
            "+  +--+  +  +\n" +
            "|  |  |  |  | \n" +
            "+--+--+  +--+\n"

        val amazing = MazeGenerator()
        amazing.random = Random(100)
        val result = amazing.run(4, 5)
        assertEquals("Should have the maze that was expected", expected, result)
    }
}
