class A
{
    public static void main(String[] args) {
        int row=5;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=row;j++)
            {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
OUTPUT:
C:\Users\Admin\.jdks\openjdk-15.0.2\bin\java.exe -javaagent:C:\Users\Admin\Downloads\Compressed\ideaIC-2020.3.2.win\lib\idea_rt.jar=12499:C:\Users\Admin\Downloads\Compressed\ideaIC-2020.3.2.win\bin -Dfile.encoding=UTF-8 -classpath C:\Users\Admin\IdeaProjects\untitled\out\production\untitled A
1 2 3 4 5 
2 4 6 8 10 
3 6 9 12 15 
4 8 12 16 20 
5 10 15 20 25 

Process finished with exit code 0
