package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs)
	{
		String [] arr = new String[eggs.size()];
		int counter = 0;
		for(String str : eggs)
		{
			arr[counter] = str;
			counter++;
		}
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == "cracked")
			{
				return i;
			}
		}
		return -1;
	}
	public static int countPearls(List<Boolean> oysters)
	{
		String [] arr = new String[oysters.size()];
		int counter = 0;
		for(Boolean bool : oysters)
		{
			if(bool == true)
				counter++;
		}
		return counter;
	}
	public static double findTallest(List<Double> people)
	{

		double max = people.get(0);
		for(double person : people)
		{
			if(person > max)
				max = person;
		}
		return max;
	}
	public static String findLongestWord(List<String> words)
	{

		int max = words.get(0).length();
		String maxWord = words.get(0);
		for(String word : words)
		{
			if(word.length() > max)
			{
				max = word.length();
				maxWord = word;
			}
		}
		return maxWord;
	}
	public static Boolean containsSOS(List<String> messages)
	{
		for(String message : messages)
		{
			if(message.contains("... --- ..."))
				return true;
		}
		return false;
	}
	public static List<Double> sortScores(List<Double> scores)
	{
		for(int i = 0; i < scores.size() -1; i++)
		{
			for(int j = 0; j < scores.size() - i -1; j++)
			{
				if(scores.get(j + 1) < scores.get(j))
				{
					double temp = scores.get(j + 1);
					scores.set(j + 1, scores.get(j));
					scores.set(j, temp);
				}
			}
		}
		return scores;
	}
	public static List<String> sortDNA(List<String> dna)
	{
		for(int i = 0; i < dna.size() -1; i++)
		{
			for(int j = 0; j < dna.size() - i -1; j++)
			{
				if(dna.get(j + 1).length() < dna.get(j).length())
				{
					String temp = dna.get(j + 1);
					dna.set(j + 1, dna.get(j));
					dna.set(j, temp);
				}
			}
		}
		return dna;
	}
	public static List<String> sortWords(List<String> words)
	{
		for(int i = 0; i < words.size() -1; i++)
		{
			for(int j = 0; j < words.size() - i -1; j++)
			{
				if(words.get(j + 1).compareTo(words.get(j)) < 0)
				{
					String temp = words.get(j + 1);
					words.set(j + 1, words.get(j));
					words.set(j, temp);
				}
			}
		}
		return words;
	}
}
