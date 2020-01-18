using System;

/// <summary>
/// Summary description for Class1
/// </summary>
public class Problem1
{

	public static void Main(string[] args)
	{
		var result = GetHashCode();
		foreach (var r in result)
		{
			Console.WriteLine(r);
		}
	}

	public static List<string> GetHashCode()
	{
		string number = "7,6,7,8,6,7,8";
		List<string> result = new List<String>();
		Boolean zero = false;
		string[] list = number.Split(",");
		if (number.ToString().Contains('0'))
			zero = true;
		string first = string.Empty;
		string sec = string.Empty;
		foreach (var n in list)
		{

			// First occurance 
			if (!zero)
			{
				var nk = int.Parse(n);
				first = first + Char.ConvertFromUtf32(int.Parse(n) + 64);
			}

		}
		result.Add(first);
		for (int i = 0; i < list.Length - 1; i++)
		{
			try
			{
				for (int back = 0; back < i; back++)
				{
					sec = sec + Char.ConvertFromUtf32(int.Parse(list[back]) + 64);
				}
				if (int.Parse(list[i] + list[i + 1]) <= 26)
				{
					sec = sec + Char.ConvertFromUtf32(int.Parse(list[i] + list[i + 1]) + 64);
				}
				else
				{
					break;
				}
				if (i + 1 < list.Length)
				{
					for (int j = i + 2; j < list.Length; j++)
					{
						sec = sec + Char.ConvertFromUtf32(int.Parse(list[j]) + 64);
					}
				}
				result.Add(sec);
				sec = string.Empty;
			}
			catch (Exception e)
			{
			}


		}

		return result;
	}
	public static string combine(int n1)
	{
		return Char.ConvertFromUtf32(n1 + 64);
	}

}

