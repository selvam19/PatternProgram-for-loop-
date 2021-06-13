class A
{
    public static void main(String[] args) {
        int row=5,k;
        for(int i=1;i<=row;i++)
        {
            k=i;
            for(int j=1;j<=row;j++)
            {
                System.out.print(k+" ");
                k+=5;
            }
            System.out.println();
        }
    }
}
OUTPUT:
C:\Users\Admin\.jdks\openjdk-15.0.2\bin\java.exe -javaagent:C:\Users\Admin\Downloads\Compressed\ideaIC-2020.3.2.win\lib\idea_rt.jar=12532:C:\Users\Admin\Downloads\Compressed\ideaIC-2020.3.2.win\bin -Dfile.encoding=UTF-8 -classpath C:\Users\Admin\IdeaProjects\untitled\out\production\untitled A
1 6 11 16 21 
2 7 12 17 22 
3 8 13 18 23 
4 9 14 19 24 
5 10 15 20 25 

Process finished with exit code 0
