
public class Guitarist extends Person implements MusicPlayer{
	
	Guitar favouriteGuitar;
	
	public Guitarist(String _pfname, String _plname, int _page) {
		super(_pfname, _plname, _page);
	}
	
	@Override
	public void play() {
		if(this.favouriteGuitar != null) {
			System.out.println(super.getFirstName() + "" + super.getLastName() 
								+ "is playing the guitar now...");
		}
		else {
			System.out.println("No guitar is assigned to " + super.getFirstName() + " "
					+ super.getLastName());
		
		}
	}
	@Override
	public void setInstrument(Instrument instrument) {
		if(instrument instanceof Guitar) {
			this.favouriteGuitar = (Guitar) instrument;
		}
		else {
			System.out.println("I dont play the " + instrument.toString());
		}
	}
	@Override
	public Instrument getInstrument() {
		return this.favouriteGuitar;
	}

}
