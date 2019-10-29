
public class Guitar extends Instrument {
	private String playMode;
	private String toneWood;
	private String bodyStyle;
	private int serialNumber;
	
	public Guitar(String name, String type,String PlayMode, String ToneWood, String BodyStyle, int SerialNumber) {
		super(name, type);
		this.playMode = PlayMode;
		this.bodyStyle = BodyStyle;
		this.serialNumber = SerialNumber;
		this.toneWood = ToneWood;
	}
	
	
	public String getPlayMode() {
		return playMode;
	} 
	public void setPlayMode(String playMode) {
		this.playMode = playMode;
	}
	public String getBodyStyle() {
		return bodyStyle;
	}
	public void setBodyStyle(String bodyStyle) {
		this.bodyStyle = bodyStyle;
	}
	public String getToneWood() {
		return toneWood;
	}
	public void setToneWood(String toneWood) {
		this.toneWood = toneWood;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

}
