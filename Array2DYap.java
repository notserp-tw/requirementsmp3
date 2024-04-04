public class Array2DYap
{
    int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    public void traverse2DArray() {
        for (int r = 0; r < array.length; r++)
        {
            for (int c = 0; c < array[r].length; c++)
            {
                System.out.print(array[r][c] + " ");
            }
            System.out.println();
        }

        // Column-major order
        for (int c = 0; c < array[0].length; c++)
        {
            for (int r = 0; r < array.length; r++)
            {
                System.out.print(array[r][c] + " ");
            }
            System.out.println();
        }
    }
    public void enhancedTraverse()
    {
        for (int[] i : array)
        {
            for (int j : i)
            {
                System.out.println(j);
            }
        }
    }
    public String toString()
    {
        return "blah blah blah";
    }
    public boolean equals()
    {
        return false;
    }
}
