package core.asset;

import java.util.HashMap;
import java.util.Map;
import javafx.scene.image.Image;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Font;

public final class AssetCache {

	private static final Map<AssetID, Image> imageCache = new HashMap<AssetID, Image>();

	private static final Map<AssetID, AudioClip> audioCache = new HashMap<AssetID, AudioClip>();

	public static void loadAssets() throws InvalidAssetException {
		for (AssetID id : AssetID.values()) {
			if (id.getType() == AssetID.AssetType.IMAGE) {
				try {
					imageCache.put(id, new Image(id.getURL()));
				} catch (IllegalArgumentException e) {
					throw new InvalidAssetException(id.toString());
				}
			} else if (id.getType() == AssetID.AssetType.AUDIO) {
				try {
					audioCache.put(id, new AudioClip(id.getURL()));
				} catch (IllegalArgumentException e) {
					throw new InvalidAssetException(id.toString());
				}
			} else {
				throw new InvalidAssetException("Unknown type: " + id.getType().toString());
			}
		}
	}

	public static Image getImage(AssetID id) {
		if (imageCache.containsKey(id))
			return imageCache.get(id);
		return null;
	}


	public static AudioClip getAudio(AssetID id) {
		if (audioCache.containsKey(id))
			return audioCache.get(id);
		return null;
	}

	public static Font loadFont(String fontName, double size) throws InvalidAssetException {
		Font ret = Font.loadFont(ClassLoader.getSystemResourceAsStream("fnt/" + fontName), size);
		if (ret == null)
			throw new InvalidAssetException();
		return ret;
	}

}
