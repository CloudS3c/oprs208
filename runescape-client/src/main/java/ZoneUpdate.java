import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
public class ZoneUpdate {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final ZoneUpdate MAPPROJ_ANIM;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final ZoneUpdate OBJ_ADD;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final ZoneUpdate MAP_ANIM;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final ZoneUpdate PREFETCH_GAMEOBJECTS;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final ZoneUpdate OBJ_DEL;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final ZoneUpdate LOC_ANIM;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final ZoneUpdate OBJ_COUNT;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final ZoneUpdate LOC_DEL;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final ZoneUpdate AREA_SOUND;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final ZoneUpdate LOC_ADD_CHANGE;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final ZoneUpdate field3050;

	static {
		MAPPROJ_ANIM = new ZoneUpdate(15); // L: 5
		OBJ_ADD = new ZoneUpdate(5); // L: 6
		MAP_ANIM = new ZoneUpdate(6); // L: 7
		PREFETCH_GAMEOBJECTS = new ZoneUpdate(14); // L: 8
		OBJ_DEL = new ZoneUpdate(3); // L: 9
		LOC_ANIM = new ZoneUpdate(4); // L: 10
		OBJ_COUNT = new ZoneUpdate(7); // L: 11
		LOC_DEL = new ZoneUpdate(2); // L: 12
		AREA_SOUND = new ZoneUpdate(5); // L: 13
		LOC_ADD_CHANGE = new ZoneUpdate(4); // L: 14
		field3050 = new ZoneUpdate(5); // L: 15
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "15"
	)
    ZoneUpdate(int var1) {
	} // L: 21

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Lkw;I)Z",
		garbageValue = "-2102361500"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 10455
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 10456
				int var2 = ReflectionCheck.method648(var0, var1); // L: 10457
				int var3 = var0.cs1ComparisonValues[var1]; // L: 10458
				if (var0.cs1Comparisons[var1] == 2) { // L: 10459
					if (var2 >= var3) { // L: 10460
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 10462
					if (var2 <= var3) { // L: 10463
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 10465
					if (var2 == var3) { // L: 10466
						return false;
					}
				} else if (var3 != var2) { // L: 10468
					return false;
				}
			}

			return true; // L: 10470
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1968082006"
	)
	static final void method5345(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 11617
		Player.clientPreferences.method2405(var0); // L: 11618
	} // L: 11619
}
