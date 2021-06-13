class A
{
    public static void main(String[] args) {
        int row=5,k=2;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=row;j++)
            {
                System.out.print(k+" ");
                k+=2;
            }
            System.out.println();
        }
    }
}
OUTPUT:
C:\Users\Admin\.jdks\openjdk-15.0.2\bin\java.exe -javaagent:C:\Users\Admin\Downloads\Compressed\ideaIC-2020.3.2.win\lib\idea_rt.jar=12489:C:\Users\Admin\Downloads\Compressed\ideaIC-2020.3.2.win\bin -Dfile.encoding=UTF-8 -classpath C:\Users\Admin\IdeaProjects\untitled\out\production\untitled A
2 4 6 8 10 
12 14 16 18 20 
22 24 26 28 30 
32 34 36 38 40 
42 44 46 48 50 

Process finished with exit code 0
