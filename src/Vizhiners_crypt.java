import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vizhiners_crypt
{

    public static void main(String[] args) throws IOException {
        TableOfVizhiner();
        System.out.println("");
        Encrypt();
    }

    public static void TableOfVizhiner() {
        int size = 26;
        char horizontalA = 'A';
        char verticalA = 'A';
        char[][] tableOfVizhiner = new char[size][size];
        for (int i = 0; i < size; i++)
        {
            for (int j = 0 ; j < size ; j++ )
            {
                tableOfVizhiner[i][j] = horizontalA;
                if (horizontalA > 'Z')
                {
                    horizontalA = 'A';
                    tableOfVizhiner[i][j] = horizontalA;
                }
                System.out.print(tableOfVizhiner[i][j]);
                horizontalA++;
            }
            System.out.println("");
            verticalA++;
            horizontalA = verticalA;
        }
    }


    public static void Encrypt() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your keyword. Use only Latin letters, please.");
        String keyword = reader.readLine().toUpperCase();
        System.out.println("Enter your text. Use only Latin letters, please.");
        String text = reader.readLine().toUpperCase();

        int keywordLength = keyword.length();
        int textLength = text.length();

        char keywordArray[] = new char[keywordLength];
        char textArray[] = new char[textLength] ;
        keywordArray = keyword.toCharArray();
        textArray = text.toCharArray();





    }
}
