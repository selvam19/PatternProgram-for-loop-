class A
{
    public static void main(String[] args) {
        int row=5,k=1;
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
C:\Users\Admin\.jdks\openjdk-15.0.2\bin\java.exe -javaagent:C:\Users\Admin\Downloads\Compressed\ideaIC-2020.3.2.win\lib\idea_rt.jar=12483:C:\Users\Admin\Downloads\Compressed\ideaIC-2020.3.2.win\bin -Dfile.encoding=UTF-8 -classpath C:\Users\Admin\IdeaProjects\untitled\out\production\untitled A
1 3 5 7 9 
11 13 15 17 19 
21 23 25 27 29 
31 33 35 37 39 
41 43 45 47 49 

Process finished with exit code 0
