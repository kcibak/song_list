
public class song 
{
	private String singer;
	private String title;
	private int length;
	public song(String s, String t, int l)
	{
		singer=s;
		title=t;
		length=l;
	}
	public String getArtist()
	{
		return singer;
	}
	public String getTitle()
	{
		return title;
	}
	public int getLength()
	{
		return length;
	}
	public String toString()
	{
		return "Artist: "+getArtist()+" Title: "+getTitle()+" Length: "+getLength();
	}
}
