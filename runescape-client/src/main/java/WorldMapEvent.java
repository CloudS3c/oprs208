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
		return new ServerPacket[]{ServerPacket._TRIGGER_ONDIALOGABORT, ServerPacket._REBUILD_REGION_NORMAL, ServerPacket._IF_SETTEXT, ServerPacket._UPDATE_REBOOT_TIMER, ServerPacket._LOC_DEL, ServerPacket._REFLECTION_CHECK, ServerPacket._OBJ_COUNT, ServerPacket._CHAT_FILTER_SETTINGS_PRIVATECHAT, ServerPacket._MAPPROJ_ANIM, ServerPacket._IF_SETSCROLLPOS, ServerPacket._TOGGLE_OCULUS_ORB, ServerPacket._LOC_ANIM, ServerPacket._ENTER_FREECAM, ServerPacket._LOGOUT_FULL, ServerPacket._IF_OPENSUB, ServerPacket._IF_SETMODEL, ServerPacket._UPDATE_ZONE_PARTIAL_FOLLOWS, ServerPacket._IF_MOVESUB, ServerPacket._UPDATE_INV_STOP_TRANSMIT, ServerPacket._PREFETCH_GAMEOBJECTS, ServerPacket._IF_SETPLAYERHEAD, ServerPacket._HEAT_MAP, ServerPacket._UNKNOWN4, ServerPacket._LOGOUT_TRANSFER, ServerPacket._REBUILD_REGION, ServerPacket._OPEN_URL, ServerPacket._IF_CLOSESUB, ServerPacket._RESET_ANIMS, ServerPacket._LOGOUT, ServerPacket._SEND_PING, ServerPacket._LOC_ADD_CHANGE, ServerPacket._IF_SETPOSITION, ServerPacket._UPDATE_STAT, ServerPacket._LEGACY_NPC_INFO_SMALL, ServerPacket._MINIMAP_TOGGLE, ServerPacket._SPOTANIM_SPECIFIC, ServerPacket._IF_SETANGLE, ServerPacket._VARCLAN_ENABLE, ServerPacket._IF_SETNPCHEAD, ServerPacket._UPDATE_INV_CLEAR, ServerPacket._IF_SETEVENTS, ServerPacket._IF_OPENTOP, ServerPacket._UNKNOWN2, ServerPacket._CLANCHANNEL_FULL, ServerPacket._CAM_MOVETO, ServerPacket._CAM_LOOKAT, ServerPacket._RUNCLIENTSCRIPT, ServerPacket._CLANCHANNEL_DELTA, ServerPacket._VARP_LARGE, ServerPacket._CAM_SMOOTHRESET, ServerPacket._MESSAGE_GAME, ServerPacket._LEGACY_NPC_INFO_LARGE, ServerPacket._UNKNOWN1, ServerPacket._UPDATE_ZONE_FULL_FOLLOWS, ServerPacket._CLANSETTINGS_DELTA, ServerPacket._SYNTH_SOUND, ServerPacket._SET_PLAYER_OP, ServerPacket._UPDATE_UID192, ServerPacket._TRADING_POST_UPDATE, ServerPacket._MESSAGE_PRIVATE_ECHO, ServerPacket._MESSAGE_CLANCHANNEL, ServerPacket._MESSAGE_PRIVATE, ServerPacket._SYNC_CLIENT_VARCACHE, ServerPacket._VARCLAN, ServerPacket._MAP_SPOTANIM_SPECIFIC, ServerPacket._NPC_INFO_SMALL, ServerPacket._PLAYER_SPOTANIM_SPECIFIC, ServerPacket._AREA_SOUND, ServerPacket._UPDATE_SITESETTINGS, ServerPacket._CAM_SHAKE, ServerPacket._UPDATE_INV_FULL, ServerPacket._IF1_MODELROTATE, ServerPacket._UPDATE_IGNORELIST, ServerPacket._OBJ_ADD, ServerPacket._MAP_ANIM, ServerPacket._GAMEFRAME_FULL, ServerPacket._UPDATE_INV_PARTIAL, ServerPacket._MIDI_JINGLE, ServerPacket._IF_SETCOLOUR, ServerPacket._UPDATE_RUNWEIGHT, ServerPacket._HINT_ARROW, ServerPacket._MESSAGE_CLANCHANNEL_SYSTEM, ServerPacket._UPDATE_FRIENDLIST, ServerPacket._NPC_INFO_LARGE, ServerPacket._VARCLAN_DISABLE, ServerPacket._TRADING_POST_RESULTS, ServerPacket._IF_SETHIDE, ServerPacket._MESSAGE_FRIENDCHANNEL, ServerPacket._RESET_CLIENT_VARCACHE, ServerPacket._PLAYER_INFO, ServerPacket._UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket._MIDI_SONG, ServerPacket._CHAT_FILTER_SETTINGS, ServerPacket._FRIENDLIST_LOADED, ServerPacket._CLANSETTINGS_FULL, ServerPacket._SET_MAP_FLAG, ServerPacket._IF_SETANIM, ServerPacket._UPDATE_RUNENERGY, ServerPacket._NPC_ANIM_SPECIFIC, ServerPacket._VARP_SMALL, ServerPacket._LOC_ANIM_SPECIFIC, ServerPacket._CAM_RESET, ServerPacket._OBJ_DEL, ServerPacket._IF_SETOBJECT, ServerPacket._PROJANIM_SPECIFIC, ServerPacket._UNKNOWN3}; // L: 115
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
