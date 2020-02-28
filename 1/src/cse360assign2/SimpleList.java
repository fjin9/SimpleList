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
		if(count == list.length)
		{
			int increase = list.length/2;
			resize(count + increase);
		}
		
		for(int i = count; i > 0; i--)
		{
			list[i] = list[i - 1];
		}
		list[0] = num;
		count++;
		System.out.println("Number added successfully.");
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
			System.out.println("Removed element successfully.");
		}
		else
		{
			System.out.println(num + "element not found.");
		}
		
		int n = 3*list.length/4;
		
		if(count < n && count >= 1)
		{
			resize(count);
		}
		else
		{
			System.out.println("The lsit canont be reduced less than 1 entry.");
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
	
	public void resize(int newSize)
	{
		int array[] = new int[newSize];
		for(int i =0; i < newSize && i < count; i++)
		{
			array[i] = list[i];
		}
		list = array;
		if(newSize < count)
		{
			count = newSize;
		}
	}
	
	public void append(int value)
	{
		if(count == list.length)
		{
			int increase = list.length/2;
			resize(count + increase);
		}
		list[count] = value;		
		count++;
	}
	
	public int first()
	{
		int element1 = 0;
		if(list != null)
		{
			list[0] = element1;
		}
		else
		{
			element1 = -1;
		}
		return element1;
	}
	
	public int last()
	{
		int element2 = 0;
		if(list != null)
		{
			list[0] = element2;
		}
		else
		{
			element2 = -1;
		}
		return element2;
	}
	
	public int size()
	{
		return list.length;
	}
}