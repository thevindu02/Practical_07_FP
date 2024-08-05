object CalculateSquare {

    def CalculateSquare(numbers: List[Int]): List[Int] = {
        numbers.map(num => num*num)
    }

    def main( args: Array[String]): Unit = {
        val input = List(1,2,3,4,5)
        val output = CalculateSquare(input);
        print(output)
    }


}