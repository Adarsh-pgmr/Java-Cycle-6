import java.io.*;

class Experiment1c

{

	public static void main(String[] args) throws Exception	{

		try

		{

			FileInputStream fin = new FileInputStream("file.txt");

			int i;

			while((i=fin.read())!=-1)

				System.out.println((char)i);

			fin.close();

		}

		catch(FileNotFoundException e)

		{

			System.out.println(e);

		}

	}

}
