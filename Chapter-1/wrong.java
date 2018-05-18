//CTCI Q1 is string unique

isboolean class unique(str[])
	{
		HashMap<string> hm=new HashMap<string>();
		
		for(int i=0;i<str.length;i++)
		{
			if(hm.contains(s.charat(i)))
				return false;
			hm.put(str.charat[i]);
			
		}
		return true;
	}
