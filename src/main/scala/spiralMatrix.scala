object spiralMatrix extends App {
  def spiralMatrix(n: Int): Unit = {
    def constructMatrix(rows: Int, columns: Int, from: Int): List[List[Int]] = {
      if (rows == 0) List.empty
      else (from until from + columns).toList :: constructMatrix(columns, rows - 1, from + columns)
        .reverse
        .transpose
    }

    constructMatrix(n, n, 1).foreach(println)

  }

  spiralMatrix(4)
}
