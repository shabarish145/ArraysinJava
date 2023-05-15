package Arrays;

public class SingleDimension
{

	public static void main(String[] args)
	{
		int[] Student = new int[5];
		
		Student[0] = 10;
		Student[1] = 20;
		Student[2] = 30;
		Student[3] = 40;
		Student[4] = 50;
		
		System.out.println(Student[0]);
		System.out.println(Student[1]);
		System.out.println(Student[2]);
		System.out.println(Student[3]);
		System.out.println(Student[4]);
		
		// By using for loop
		for(int i=0;i<Student.length;i++)
		{
			System.out.println(Student[i]);
		}
		

	}

}
