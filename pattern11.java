class A
{
    public static void main(String[] args) {
        int row=5;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=row;j++)
            {
                System.out.print(i+" "+j+" ");
            }
            System.out.println();
        }
    }
}
OUTPUT:
C:\Users\Admin\.jdks\openjdk-15.0.2\bin\java.exe -javaagent:C:\Users\Admin\Downloads\Compressed\ideaIC-2020.3.2.win\lib\idea_rt.jar=12522:C:\Users\Admin\Downloads\Compressed\ideaIC-2020.3.2.win\bin -Dfile.encoding=UTF-8 -classpath C:\Users\Admin\IdeaProjects\untitled\out\production\untitled A
1 1 1 2 1 3 1 4 1 5 
2 1 2 2 2 3 2 4 2 5 
3 1 3 2 3 3 3 4 3 5 
4 1 4 2 4 3 4 4 4 5 
5 1 5 2 5 3 5 4 5 5 

Process finished with exit code 0
