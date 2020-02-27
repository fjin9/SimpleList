//Name: Feifan Jin
//ClassID: 151
//Assignment 1

package cse360assign2;

public class SimpleList
{
	private int list[];
	private int count;
	
	public SimpleList()
	{
		this.count = 0;
		list = new int[10];
	}
	
	public void add(int num)
	{
		if(count < 10)
		{
			for(int i = count; i > 0; i--)
			{
				list[i] = list[i - 1];
			}
			list[0] = num;
			count++;
		}
		else
		{
			list[count - 1] = 0;
			for(int i = count; i > 0; i--)
			{
				list[i] = list[i - 1];
			}
			list[0] = num;
			count = 10;			
		}
	}

	public void remove(int num)
	{
		int index = search(num);
		
		if(index != -1)
		{
			for(int i = index; i < count - 1; i++)
			{
				list[i] = list[i + 1];
			}
			count--;
		}
		else
		{
			System.out.println(num + "element not found.");
		}
	}
	
	public int count()
	{
		return count;
	}
	
	public String toString()
	{
		String str = "";
		for(int i = 0; i < count; i++)
		{
			str += list[i];
			if(i != count -1)
			{
				str += " ";
			}
		}
		return str;
	}
	
	public int search(int num)
	{
		int index = -1;
		for(int i = 0; i < count; i++)
		{
			if(list[i] == num)
			{
				index = i;
			}
		}
		return index;
	}
}