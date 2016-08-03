package base;

import java.util.HashMap;
import java.util.Map;

public class Main
{

	public static void main(String args[])
	{	
		Map<Integer, String> algrithmMap = new HashMap<Integer, String>()
		{
			/**
			 * serialVersionUID
			 */
			private static final long serialVersionUID = 1L;

			{
				put(221, "DoubleMatrix");
				put(208, "Trie");
				put(372, "SuperPow");
				put(374, "GuessNum");
				put(345, "ReverseVowelsString");
				put(145, "PostordertTraversal");
				put(373, "FindKPairsWithSmallestSums");
				put(371, "SubOfTwoInt");
				put(258, "AddDigits");
				put(292, "NimGame");
				put(1, "TwoSum");
				put(2, "AddTwoNumbers");
				put(310, "MHT");
				put(340, "ReverseString");
				put(111, "SpliteGround");
			}
		};
		String prefix = "leetcode.";
		try
		{
			int algrithmIndex = 111;
			Class<?> algrithm = Class.forName(prefix + algrithmMap.get(algrithmIndex));
			BaseAlgorithm baseAlgorithm = (BaseAlgorithm)algrithm.newInstance();
			baseAlgorithm.runDemo();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (InstantiationException e)
		{
			e.printStackTrace();
		}
		catch (IllegalAccessException e)
		{
			e.printStackTrace();
		}

	}
}