class Main
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(((i*j)%2)+" ");
            }
            System.out.println();
        }
    }
}
OUTPUT:
C:\Users\Admin\.jdks\openjdk-15.0.2\bin\java.exe -javaagent:C:\Users\Admin\Downloads\Compressed\ideaIC-2020.3.2.win\lib\idea_rt.jar=4573:C:\Users\Admin\Downloads\Compressed\ideaIC-2020.3.2.win\bin -Dfile.encoding=UTF-8 -classpath C:\Users\Admin\IdeaProjects\Bala\out\production\Bala com.company.Main
1 0 1 0 1 
0 0 0 0 0 
1 0 1 0 1 
0 0 0 0 0 
1 0 1 0 1 

Process finished with exit code 0
