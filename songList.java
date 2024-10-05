import java.util.List;
public class songList
{
private List<song> songList;

public songList(List<song> sList)
{
	songList=sList;
}

public int numArtist(String searchArtist)
{
	int a=0;
	for(int b=0;b<7;b++)
	{
		if((songList.get(b).getArtist().equals(searchArtist)))
		{
			a++;
		}
	}
	return a;
}

public int totalLength()
{
	int total=0;
	for(int a=0;a<songList.size();a++)
	{
		total+=(songList.get(a).getLength());
	}
	return total;
}

public String longestSongTime()
{
	String longest=new String("");
	int longer=songList.get(0).getLength();
	for(int a=1;a<songList.size();a++)
	{
		if(songList.get(a).getLength()>longer)
		{
			longest=songList.get(a).getTitle();
			longer=songList.get(a).getLength();
		}
	}
	return longest;
}

public void removeDuplicate()
{
	for(int a=0;a<songList.size()-1;a++)
	{
		for(int b=1;b<songList.size()-a;b++)
		{
			if((songList.get(a).getArtist().contentEquals(songList.get(a+b).getArtist()))&&(songList.get(a).getTitle().contentEquals(songList.get(a+b).getTitle()))&&(songList.get(a).getLength()==songList.get(a+b).getLength()))
			{
				songList.remove(a+1);
			}
		}
	}
}
}