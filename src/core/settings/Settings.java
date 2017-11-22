package core.settings;

public class Settings {
	
	// Application settings
	public static final String WINDOW_TITLE = "slotmach";
	public static final double WINDOW_WIDTH = 1000, WINDOW_HEIGHT = 1000;
	
	// Rendering options
	public static final int FPS = 60;
	public static final long LOOP_TIME = 1000000000 / FPS;
	
	// Game logic options
	public static final int UPDATE_RATE = 60;
	public static final long UPDATE_LOOP_TIME = 1000000000 / UPDATE_RATE;
	
	// General in-game options
	public static final double SLOT_DEFAULT_VELOCITY = 2000.0f;
	public static final double SLOT_DEFAULT_COLUMN_HEIGHT = 1000.0f;
	public static final double SLOT_DEFAULT_WIDTH = 50.0f;
	public static final double SLOT_SLOWDOWN_ACCEL = -800.0f;
	public static final double SLOT_MIN_VELOCITY = 400.0f;
	public static final int SLOT_DEFAULT_COLUMNS = 3;
	public static final double PLAYER_MAX_MANA = 1000.0f;
	public static final int PLAYER_MAX_MONEY = 999999;
	
}
