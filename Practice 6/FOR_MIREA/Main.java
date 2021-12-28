package FOR_MIREA;

public class Main
{
    public static void main(String[] args)
    {
        Student[] sortById = Student.getSamples(true);
        for (Student item : sortById) {
            System.out.print(item);
            System.out.print(' ');
        }
        System.out.println();
        Student[] sortedById = InsertionSort.insertionSort(sortById);
        for (Student value : sortedById) {
            System.out.print(value);
            System.out.print(' ');
        }
        System.out.println();
        Student[] sortByGPA = Student.getSamples(false);
        QuickSort.quickSort(sortByGPA, 0, sortByGPA.length - 1);
        for (Student student : sortByGPA) {
            System.out.print(student);
            System.out.print(' ');
        }
        System.out.println();
        int[] sortByAll = new int[sortById.length + sortByGPA.length];
        int j=0;
        for (int i=0; i<sortByAll.length; i++)
        {
            if (i<sortById.length){sortByAll[i] = sortById[i].getId();}
            else
            {
                sortByAll[i] = sortByGPA[j].getGPA();
                j++;
            }
        }
        MergeSort.mergeSort(sortByAll, 0, sortByAll.length);
        for (int k : sortByAll) {
            System.out.print(k);
            System.out.print(' ');
        }
    }
}