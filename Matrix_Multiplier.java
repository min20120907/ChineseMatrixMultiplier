import java.util.Scanner;
public class Matrix_Multiplier {

    public static void main(String[] args) {
        
                    Scanner sc = new Scanner(System.in);
        int row1,column1,row2,column2,m3sum = 0;


                System.out.println("請輸入矩陣1的行數");
                row1 = sc.nextInt();
                System.out.println("請輸入矩陣1的列數");
                column1= sc.nextInt();
        int [][] Matrix1= new int [row1][column1];
        for(int i=0;i <row1;i++)
        {
            for(int k=0;k <column1;k++)
            {
                System.out.println("請輸入第"+ i +"行的第"+ k +"個數字:");
                Matrix1[i][k] = sc.nextInt();
            }
        }
        System.out.println("請輸入矩陣2的行數");
        row2=sc.nextInt();
        if (column1==row2){
        System.out.println("請輸入矩陣2的列數");
        column2=sc.nextInt();
        int [][] Matrix2= new int [row2][column2];
        for(int i=0;i <row2;i++)
        {
            for(int k=0;k <column2;k++)
            {
                System.out.println("請輸入第"+ i +"行的第一個"+ k +"數字:");
                Matrix2[i][k] = sc.nextInt();
            }
        }

        int [][] Matrix3= new int [row1][column2];
        for (int i = 0 ; i < row1 ; i++ )
        {
            for (int k = 0 ; k< column1 ; k++ )
            {
                for (int l = 0 ; l <row2 ; l++)
                    m3sum = m3sum + Matrix1[i][l]*Matrix2[l][k];
                Matrix3[i][k] = m3sum;

            }
        }
        System.out.println("Matrix3 is:\n");
        for(int i=0;i < row1;i++)
        {
            for(int k=0;k< column2;k++)
            {
                System.out.print(Matrix3[i][k] + ",");
            }
            System.out.println("\n");
        }
    }else {
            System.out.println("行數不同無法相乘！");
            Matrix_Multiplier.main(args);
        }

    }
    
}
