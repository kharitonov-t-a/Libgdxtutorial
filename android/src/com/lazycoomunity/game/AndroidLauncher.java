package com.lazycoomunity.game;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.lazycoomunity.game.MyGame;

public class AndroidLauncher extends AndroidApplication {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		config.useAccelerometer = false;
		config.useCompass = false;
		config.useWakelock = true;
//		config.useGL30 = true;
//		config.useGLSurfaceView20API18 = true;

		initialize(new MyGame(), config);
	}
}
