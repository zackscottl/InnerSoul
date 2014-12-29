package tylerandzack.creations.innersoulgame;

import java.applet.Applet;
import java.applet.AudioClip;

public class PlaySound {

	String name;
	int repeat;

	public PlaySound(String name, int repeat) {
		this.name = name;
		this.repeat = repeat;

		playSound(name, repeat);
	}

	private void playSound(String name, int repeat) {
		if (name == "footsteps") {
			AudioClip footstepsAudioClip = Applet.newAudioClip(getClass().getResource("/footsteps.wav"));
			for (int i = 0; i < repeat + 1; i++) {
				footstepsAudioClip.play();
			}
		}
	}
}
