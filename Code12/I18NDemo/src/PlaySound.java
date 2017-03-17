import jaco.mp3.player.MP3Player;

public class PlaySound {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MP3Player mp3 = new MP3Player(PlaySound.class.getResource("E.mp3"));
		mp3.play();
		Thread.sleep(15000);

	}

}
