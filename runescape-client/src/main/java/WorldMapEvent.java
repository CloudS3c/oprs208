import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1057426347
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILkz;Lkz;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)[Ljl;",
		garbageValue = "127"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket._TRIGGER_ONDIALOGABORT, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.field3073, ServerPacket.field3074, ServerPacket.field3145, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.field3077, ServerPacket.CHAT_FILTER_SETTINGS_PRIVATECHAT, ServerPacket.NPC_INFO_SMALL_VIEWPORT_1, ServerPacket.field3080, ServerPacket._TOGGLE_OCULUS_ORB, ServerPacket.IF_SETANGLE, ServerPacket._ENTER_FREECAM, ServerPacket._LOGOUT_FULL, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.field3086, ServerPacket.NPC_SPOTANIM, ServerPacket.field3071, ServerPacket.CAM_SETANGLE, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.NPC_INFO_LARGE_VIEWPORT_2, ServerPacket.field3092, ServerPacket.REBUILD_REGION, ServerPacket.UPDATE_UID192, ServerPacket._REBUILD_REGION, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.field3097, ServerPacket._RESET_ANIMS, ServerPacket.field3099, ServerPacket.field3147, ServerPacket.SET_PLAYER_OP, ServerPacket._IF_SETPOSITION, ServerPacket.field3103, ServerPacket._LEGACY_NPC_INFO_SMALL, ServerPacket.field3105, ServerPacket.UPDATE_STAT, ServerPacket.IF_SETHIDE, ServerPacket.PLAYER_SPOTANIM, ServerPacket._IF_SETNPCHEAD, ServerPacket._UPDATE_INV_CLEAR, ServerPacket._IF_SETEVENTS, ServerPacket.field3175, ServerPacket.EVENT_WORLDHOP, ServerPacket._CLANCHANNEL_FULL, ServerPacket.PROJECTILE_SPAWN, ServerPacket._CAM_LOOKAT, ServerPacket.IF_MOVESUB, ServerPacket._CLANCHANNEL_DELTA, ServerPacket.NPC_INFO_SMALL_VIEWPORT_2, ServerPacket.field3127, ServerPacket._MESSAGE_GAME, ServerPacket.field3151, ServerPacket.IF_SETNPCHEAD, ServerPacket._UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.field3072, ServerPacket.IF_SETPOSITION, ServerPacket._SET_PLAYER_OP, ServerPacket._UPDATE_UID192, ServerPacket._TRADING_POST_UPDATE, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.field3131, ServerPacket.field3132, ServerPacket.field3133, ServerPacket.field3091, ServerPacket.IF_SETSCROLLPOS, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket._PLAYER_SPOTANIM_SPECIFIC, ServerPacket._AREA_SOUND, ServerPacket.field3139, ServerPacket._CAM_SHAKE, ServerPacket.MINIMAP_FLAG_SET, ServerPacket._IF1_MODELROTATE, ServerPacket.field3143, ServerPacket._OBJ_ADD, ServerPacket._MAP_ANIM, ServerPacket._GAMEFRAME_FULL, ServerPacket._UPDATE_INV_PARTIAL, ServerPacket._MIDI_JINGLE, ServerPacket._IF_SETCOLOUR, ServerPacket.LOGOUT_FULL, ServerPacket.CAM_RESET, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.field3089, ServerPacket._NPC_INFO_LARGE, ServerPacket.SET_PRIVCHATMODE, ServerPacket._TRADING_POST_RESULTS, ServerPacket.CAM_LOOKAT, ServerPacket.VARP_SMALL, ServerPacket.IF_SETCOLOUR, ServerPacket._PLAYER_INFO, ServerPacket.HINT_ARROW, ServerPacket._MIDI_SONG, ServerPacket.field3163, ServerPacket._FRIENDLIST_LOADED, ServerPacket._CLANSETTINGS_FULL, ServerPacket.MIDI_SONG, ServerPacket._IF_SETANIM, ServerPacket.REFLECTION_CHECKER, ServerPacket.field3169, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.field3171, ServerPacket.URL_OPEN, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.field3108, ServerPacket.field3166, ServerPacket.field3176}; // L: 115
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Ldv;",
		garbageValue = "-958717632"
	)
	static class119 method5257(int var0) {
		class119[] var1 = new class119[]{class119.field1480, class119.field1470, class119.field1473, class119.field1472, class119.field1471, class119.field1474}; // L: 33
		class119 var2 = (class119)Varps.findEnumerated(var1, var0); // L: 35
		if (var2 == null) { // L: 36
			var2 = class119.field1480;
		}

		return var2; // L: 37
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(Lcl;I)Z",
		garbageValue = "2125074657"
	)
	static boolean method5256(Player var0) {
		if (Client.drawPlayerNames == 0) { // L: 4796
			return false;
		} else {
			boolean var1;
			if (class67.localPlayer == var0) { // L: 4797
				var1 = (Client.drawPlayerNames & 8) != 0; // L: 4811
				return var1; // L: 4813
			} else {
				var1 = UserComparator4.method2730() || class137.method3085() && var0.isFriend(); // L: 4798
				if (!var1) { // L: 4799
					boolean var2 = (Client.drawPlayerNames & 2) != 0; // L: 4802
					var1 = var2 && var0.isFriendsChatMember(); // L: 4804
				}

				return var1; // L: 4806
			}
		}
	}
}
