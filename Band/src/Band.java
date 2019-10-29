import java.util.ArrayList;

public class Band {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This sets up an array list using the music player class
		ArrayList<MusicPlayer> band = new ArrayList<MusicPlayer>();
		//These set the players role e.g. lead guitar, base guitar, and their names.
		MusicPlayer base = new Guitarist("Captain", "Zepplin", 99);
		MusicPlayer lead = new Guitarist("Freddy", "Mercury", 99);
		//This sets the instrument they are using
		base.setInstrument(new Guitar("Guitar1", "type1", "chicken", "tonewood1", "Sexy", 12345));
		lead.setInstrument(new Guitar("Guitar2", "type2", "chicken2", "tonewood2", "Sexy2", 122345));
		//this adds them
		band.add(base);
		band.add(lead);
		//This is a small look that will state the person playing and what instrument (will be guitar)
		for (MusicPlayer player : band) {
			player.play();
		}
		
	}

}
