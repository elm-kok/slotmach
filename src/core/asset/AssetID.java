package core.asset;


public enum AssetID {

	// Images
	TEST_IMG("img/test.png", AssetType.IMAGE),
	K_IMG("img/K.png", AssetType.IMAGE),
	O_IMG("img/O.png", AssetType.IMAGE),
	FROZEN_IMG("img/frozen.png", AssetType.IMAGE),
	MPBAR_IMG("img/mpbar.png", AssetType.IMAGE),
	BOX_IMG("img/box.png", AssetType.IMAGE),
	VSHADOW_TOP_IMG("img/vshadow_top.png", AssetType.IMAGE),
	VSHADOW_BOTTOM_IMG("img/vshadow_bottom.png", AssetType.IMAGE),
	HSHADOW_LEFT_IMG("img/hshadow_left.png", AssetType.IMAGE),
	HSHADOW_RIGHT_IMG("img/hshadow_right.png", AssetType.IMAGE),
	LIGHTX_IMG("img/lightx.png", AssetType.IMAGE),
	LIGHT0_IMG("img/light0.png", AssetType.IMAGE),
	LIGHT1_IMG("img/light1.png", AssetType.IMAGE),
	LIGHT2_IMG("img/light2.png", AssetType.IMAGE),
	STATUSBG_IMG("img/statusbg.png", AssetType.IMAGE),
	
	// Sounds
	BGM_SFX("sfx/bgm.wav", AssetType.AUDIO),
	BLIP_SFX("sfx/blip2.wav", AssetType.AUDIO),
	FREEZE_SFX("sfx/freeze.mp3", AssetType.AUDIO),
	YAY_SFX("sfx/yay.mp3", AssetType.AUDIO);
	
	private final String url;
	private final AssetType type;
	private AssetID(String url, AssetType type) {
		this.url = url;
		this.type = type;
	}
	
	public String getURL() {
		return ClassLoader.getSystemResource(url).toString();
	}
	
	public AssetType getType() {
		return type;
	}
}
