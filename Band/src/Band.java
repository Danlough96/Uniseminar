import java.util.ArrayList;

public class Band {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MusicPlayer> band = new ArrayList<MusicPlayer>();
		
		MusicPlayer base = new Guitarist("Captain", "Zepplin", 99);
		MusicPlayer lead = new Guitarist("Freddy", "Mercury", 99);
		
		base.setInstrument(new Guitar("Guitar1", "type1", ""));
	}

}
