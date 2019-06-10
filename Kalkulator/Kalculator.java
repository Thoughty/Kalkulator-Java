//Name:Warat Phat-in 
//ID:6188035
//Section:2

import java.util.ArrayList;
import java.lang.Math;
public class Kalculator {
	//******INSERT YOUR CODE HERE***********
	//Class attributes go here
	//**************************************
	/**
	 * Constructor is the fist method to be call at instantiation of a Kalculator object.
	 * If you need to initialize your object, do so here. 
	 */
	public double min,max;
	public double sum;
	ArrayList<Double> Sana;
	public double std;
	public double avg;
	public double[] maxk,mink,IndexMax,IndexMin;
	Kalculator()
	{
		
		//******INSERT YOUR CODE HERE***********
		
		Sana = new ArrayList<Double>();  
		sum = 0;
		avg = 0;
		std = 0;
		min = 9999;
		max = -9999;
		maxk = new double[] {-999,-999,-999};
		mink = new double[] {999,999,999};
		IndexMax = new double[3];
		IndexMin = new double[3];
		
		//**************************************
	}
	
	/**
	 * Add number to the list of numbers. 
	 * @param number
	 */
	public void addNumber(double number)
	{	//******INSERT YOUR CODE HERE***********
		Sana.add(number);
		//**************************************
	}
	
	/**
	 * Remove the least recently added number from the list. If the list is empty, do nothing.
	 */
	public void deleteFirstNumber()
	{
		//******INSERT YOUR CODE HERE***********
		if(Sana.isEmpty())
		{
			;
		}
		else
		{
			Sana.remove(0);
		}
			
		//**************************************
	}
	
	/**
	 * Remove the most recently added number from the list. If the list is empty, do nothing.
	 */
	public void deleteLastNumber()
	{
		//******INSERT YOUR CODE HERE***********
		if(Sana.isEmpty())
		{
			;
		}
		else
		{
			Sana.remove(Sana.size()-1);
		}
			
		//**************************************
	}
	
	/**
	 * Calculate the summation of all the numbers in the list, then returns the sum. 
	 * If the list is empty, return 0.
	 * @return
	 */
	public double getSum()
	{
		//******INSERT YOUR CODE HERE***********
		if(Sana.isEmpty())
		{
			return 0;
		}
		else
		{
			for(int i=0; i<Sana.size();i++)
			{
				sum = sum + Sana.get(i);
			}
				return sum;
		}
		//**************************************
	}
	
	/**
	 * Calculate and return the average of all the numbers in the list.
	 * If the list is empty, return 0.
	 * @return
	 */
	public double getAvg()
	{
		//******INSERT YOUR CODE HERE***********
		if(Sana.isEmpty())
		{
			return 0;
		}
		else
		{
			avg = sum/Sana.size();
			return avg;
		}
		//**************************************
	}
	
	/**
	 * Calculate and return the sample standard deviation of all the numbers in the list.
	 * If the list has fewer than 2 numbers, return 0.
	 * @return
	 */
	public double getStd()
	{
		//******INSERT YOUR CODE HERE***********
		if(Sana.size()<2)
		{
			return 0;
		}
		else
		{
			for(int i = 0; i<Sana.size(); i++)
			{
				std = std + Math.pow(Sana.get(i)-avg, 2);
			}
			 std = std/(Sana.size()-1);
			 std = Math.sqrt(std);
			 return std;
		}
		//**************************************
	}
	
	/**
	 * Find and return the maximum of all the numbers in the list.
	 * If the list is empty, return 0.
	 * @return
	 */
	public double getMax()
	{
		//******INSERT YOUR CODE HERE***********
		if(Sana.isEmpty())
		{
			return 0;
		}
		else
		{
			for(int i=0;i<Sana.size();i++)
			{
				if(Sana.get(i) > max)
				{
					max = Sana.get(i);
				}
			}
			return max;
		}
		
		//**************************************
	}
	
	/**
	 * Find and return the minimum of all the numbers in the list.
	 * If the list is empty, return 0.
	 */
	public double getMin()
	{
		//******INSERT YOUR CODE HERE***********
		if(Sana.isEmpty())
		{
			return 0;
		}
		else
		{
			for(int i=0;i<Sana.size();i++)
			{
				if(Sana.get(i) < min)
				{
					min = Sana.get(i);
				}
			}
			return min;
		}
		//**************************************
	}
	
	/**
	 * Find and return the maximum k numbers of all the numbers in the list as an array of k double number.
	 * The order of the returned k numbers does not matter. (We only care if you can get the max k elements)
	 * If the list has fewer than k numbers, return null.
	 */
	public double[] getMaxK(int k)
	{
		//******INSERT YOUR CODE HERE***********
		if(Sana.size()<=2)
		{
			return null;
		}
		else
		{
			for(int i =0;i < Sana.size() ; i++)
			{
				if(maxk[0] < Sana.get(i))
				{
					maxk[0] = Sana.get(i);
					IndexMax[0] = i;
				}
				
			}
			for(int i =0;i < Sana.size() ; i++)
			{
				if(maxk[1] < Sana.get(i) && IndexMax[0] != i)
				{
					maxk[1] = Sana.get(i);
					IndexMax[1] = i;
				}
			}
			for(int i =0;i < Sana.size() ; i++)
			{
				if(maxk[2] < Sana.get(i) && IndexMax[0] != i && IndexMax[1] != i)
				{
					maxk[2] = Sana.get(i);
					IndexMax[2] = i;
				}
			}
			return maxk;
		}
		//**************************************
	}
	
	/**
	 * Find and return the minimum k numbers of all the numbers in the list as an array of k double number.
	 * The order of the returned k numbers does not matter. (We only care if you can get the min k elements)
	 * If the list has fewer than k numbers, return null.
	 */
	public double[] getMinK(int k)
	{
		//******INSERT YOUR CODE HERE***********
		if(Sana.size()<=2)
		{
			return null;
		}
		else
		{
			for(int i =0;i < Sana.size() ; i++)
			{
				if(mink[0] > Sana.get(i))
				{
					mink[0] = Sana.get(i);
					IndexMin[0] = i;
				}
				
			}
			for(int i =0;i < Sana.size() ; i++)
			{
				if(mink[1] > Sana.get(i) && IndexMin[0] != i)
				{
					mink[1] = Sana.get(i);
					IndexMin[1] = i;
				}
			}
			for(int i =0;i < Sana.size() ; i++)
			{
				if(mink[2] > Sana.get(i) && IndexMin[0] != i && IndexMin[1] != i)
				{
					mink[2] = Sana.get(i);
					IndexMin[2] = i;
				}
			}
			return mink;
		}	
		//**************************************
	}
	
	/**
	 * Print (via System.out.println()) the numbers in the list in format of:
	 * DATA[<N>]:[<n1>, <n2>, <n3>, ...]
	 * Where N is the size of the list. <ni> is the ith number in the list.
	 * E.g., "DATA[4]:[1.0, 2.0, 3.0, 4.0]"
	 */
	public void printData()
	{
		//******INSERT YOUR CODE HERE***********
		System.out.print("Data[" + Sana.size()+"] : [");
		for(int i = 0; i<Sana.size();i++)
		{
			if(i == Sana.size() - 1)
			{
				System.out.print(Sana.get(i));
			}
			else
			{
				System.out.print(Sana.get(i)+", ");
			}
			
		}
		System.out.println("]");
		//**************************************
	}
}
