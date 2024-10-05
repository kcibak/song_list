import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class driver {

	public static void main(String[] args) {
		Scanner scanS=new Scanner(System.in);
		Scanner scanI=new Scanner(System.in);
		List<song> list1=new ArrayList<song>();
		for(int a=0;a<7;a++)
		{
			System.out.println("Artist?:");
			String singer=scanS.nextLine();
			System.out.println("Title?:");
			String title=scanS.nextLine();
			System.out.print("Song length?:");
			int length=scanI.nextInt();
			song song=new song(singer,title,length);
			list1.add(song);
		}
		songList list2=new songList(list1);
		for(int b=0;b<list1.size();b++)
		{
			System.out.println(list1.get(b).toString());
		}
		System.out.println();
		System.out.println("Total duration: "+list2.totalLength()+" seconds.");
		System.out.println();
		System.out.println("Longest song: "+list2.longestSongTime()+" seconds.");
		System.out.println();
		System.out.println("Choose artist.");
		String singer=scanS.nextLine();
		System.out.println(singer+" appears "+list2.numArtist(singer)+" times in this list.");
		System.out.println();
		list2.removeDuplicate();
		System.out.println("New list:");
		for(int c=0;c<list1.size();c++)
		{
			System.out.println(list1.get(c).toString());
		}
		
	}

}
