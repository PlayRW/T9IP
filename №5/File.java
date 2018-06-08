import java.util.Scanner;

public class File {

    private String fileName;
    private String date;
    private int fileSize;
    private int handling;

    // Сеттеры для полей класса

    void SetFileName(String name) { 
        
        this.fileName = name;
    }

    void SetDate(String date) { 

        this.date = date;
    }

    void SetFileSize(int size) { 

        this.fileSize = size;
    }

    void SetHandling(int handling) { 

        this.handling = handling;
    }

    // Геттеры для полей класса

    String GetFileName() {

        return fileName;
    }

    String GetDate() {

        return date;
    }

    int GetFileSize() {

        return fileSize;
    }

    int GetHandling() {

        return handling;
    }

    // Метод для ввода полей класса пользователем
  
   public static void input(File value) {

        Scanner n = new Scanner(System.in);
       
        System.out.print("\nИмя файла: ");
        String fileName = n.nextLine();
        value.SetFileName(fileName);

        System.out.print("Дата создания: ");
        String date = n.nextLine();
        value.SetDate(date);

        System.out.print("Размер файла: ");
        int fileSize = n.nextInt();
        value.SetFileSize(fileSize);

        System.out.print("Количество обращений: ");
        int handling = n.nextInt();
        value.SetHandling(handling);
    }

    // Метод вывода на экран

    public static void output(File object) {

            System.out.print("\nИмя файла: " + object.GetFileName() + "\n");
            System.out.print("Дата создания: " + object.GetDate() + "\n");
            System.out.print("Размер файла: " + object.GetFileSize() + "\n");
            System.out.print("Количество обращений: " + object.GetHandling() + "\n\n");
    }

    public static void fileSort(File[] object, int size) {

        String[] names = new String[size];
        char[] firstSymbol = new char[size];
        int[] symbolToInt = new int[size];

        for(int i = 0; i < size; i++) {
            names[i] = new String();
            names[i] = object[i].GetFileName();
            firstSymbol[i] = names[i].charAt(0);
            symbolToInt[i] = (int)firstSymbol[i];
        }

        for(int i = 0; i < size; i++)
            for(int j = 0; j < size-1; j++)
                if(symbolToInt[j] > symbolToInt[j+1]) {

                    int buffer = symbolToInt[j];
                    symbolToInt[j] = symbolToInt[j+1];
                    symbolToInt[j+1] = buffer;

                    File buff = object[j];
                    object[j] = object[j+1];
                    object[j+1] = buff;
                }
    }

    public static void main(String[] args) {

        int size = 3;
        
        File[] array = new File[size];

        for(int i = 0; i < size; i++)
            array[i] = new File();

        for(int i = 0; i < size; i++)
            input(array[i]);

        fileSort(array, size);

        System.out.print("\n\n Файлы, отсортированные по алфавиту: \n\n");

        for(int i = 0; i < size; i++)
            output(array[i]);

        Scanner n = new Scanner(System.in);
        System.out.print("\n Введите количество обращений: ");
        int hand = n.nextInt();

        boolean change = false;

        for(int i = 0; i < size; i++) 
            if(array[i].GetHandling() > hand) {
                output(array[i]);
                change = true;
            }

        if(!change)
            System.out.print("\n Нет файлов с количеством обращений больше чем " + hand + "\n\n");

        System.out.print("\n Введите заданный размер: ");
        int fSize = n.nextInt();

        change = false;

        for(int i = 0; i < size; i++) 
            if(array[i].GetFileSize() > fSize) {
                output(array[i]);
                change = true;
            }

        if(!change)
            System.out.print("\n Нет файлов размером более чем " + fSize + "\n\n");
    }
}