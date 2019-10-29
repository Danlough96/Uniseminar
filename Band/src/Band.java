import java.util.ArrayList;

public class Band {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MusicPlayer> band = new ArrayList<MusicPlayer>();
		
		MusicPlayer base = new Guitarist("Captain", "Zepplin", 99);
		MusicPlayer lead = new Guitarist("Freddy", "Mercury", 99);
		
		base.setInstrument(new Guitar("Guitar1", "type1", "chicken", "tonewood1", "Sexy", 12345));
		lead.setInstrument(new Guitar("Guitar2", "type2", "chicken2", "tonewood2", "Sexy2", 122345));
		
		band.add(lead);
		band.add(base);
		
		for (MusicPlayer player : band) {
			player.play();
		}
		
	}

}
