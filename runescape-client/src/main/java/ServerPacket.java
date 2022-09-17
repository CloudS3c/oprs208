import java.lang.reflect.Field;
import java.lang.reflect.Method;

import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.rs.Reflection;

@ObfuscatedName("jl")
@Implements("ServerPacket")
public class ServerPacket {
	public static final ServerPacket _TRIGGER_ONDIALOGABORT = new ServerPacket(0, 0);
	public static final ServerPacket _REBUILD_REGION_NORMAL = new ServerPacket(1, -2);
	public static final ServerPacket _IF_SETTEXT = new ServerPacket(2, -2);
	public static final ServerPacket _UPDATE_REBOOT_TIMER = new ServerPacket(3, 2);
	public static final ServerPacket _LOC_DEL = new ServerPacket(4, 2);
	public static final ServerPacket _REFLECTION_CHECK = new ServerPacket(5, -2);
	public static final ServerPacket _OBJ_COUNT = new ServerPacket(6, 7);
	public static final ServerPacket _CHAT_FILTER_SETTINGS_PRIVATECHAT = new ServerPacket(7, 1);
	public static final ServerPacket _MAPPROJ_ANIM = new ServerPacket(8, 15);
	public static final ServerPacket _IF_SETSCROLLPOS = new ServerPacket(9, 6);
	public static final ServerPacket _TOGGLE_OCULUS_ORB = new ServerPacket(10, 4);
	public static final ServerPacket _LOC_ANIM = new ServerPacket(11, 4);
	public static final ServerPacket _ENTER_FREECAM = new ServerPacket(12, 1);
	public static final ServerPacket _LOGOUT_FULL = new ServerPacket(13, 0);
	public static final ServerPacket _IF_OPENSUB = new ServerPacket(14, 7);
	public static final ServerPacket _IF_SETMODEL = new ServerPacket(15, 6);
	public static final ServerPacket _UPDATE_ZONE_PARTIAL_FOLLOWS = new ServerPacket(16, 2);
	public static final ServerPacket _IF_MOVESUB = new ServerPacket(17, 8);
	public static final ServerPacket _UPDATE_INV_STOP_TRANSMIT = new ServerPacket(18, 2);
	public static final ServerPacket _PREFETCH_GAMEOBJECTS = new ServerPacket(19, 14);
	public static final ServerPacket _IF_SETPLAYERHEAD = new ServerPacket(20, 4);
	public static final ServerPacket _HEAT_MAP = new ServerPacket(21, 1);
	public static final ServerPacket _UNKNOWN4 = new ServerPacket(22, -2);
	public static final ServerPacket _LOGOUT_TRANSFER = new ServerPacket(23, -1);
	public static final ServerPacket _REBUILD_REGION = new ServerPacket(24, -2);
	public static final ServerPacket _OPEN_URL = new ServerPacket(25, -2);
	public static final ServerPacket _IF_CLOSESUB = new ServerPacket(26, 4);
	public static final ServerPacket _RESET_ANIMS = new ServerPacket(27, 0);
	public static final ServerPacket _LOGOUT = new ServerPacket(28, 1);
	public static final ServerPacket _SEND_PING = new ServerPacket(29, 8);
	public static final ServerPacket _LOC_ADD_CHANGE = new ServerPacket(30, 4);
	public static final ServerPacket _IF_SETPOSITION = new ServerPacket(31, 8);
	public static final ServerPacket _UPDATE_STAT = new ServerPacket(32, 6);
	public static final ServerPacket _LEGACY_NPC_INFO_SMALL = new ServerPacket(33, -2);
	public static final ServerPacket _MINIMAP_TOGGLE = new ServerPacket(34, 1);
	public static final ServerPacket _SPOTANIM_SPECIFIC = new ServerPacket(35, 8);
	public static final ServerPacket _IF_SETANGLE = new ServerPacket(36, 10);
	public static final ServerPacket _VARCLAN_ENABLE = new ServerPacket(37, 0);
	public static final ServerPacket _IF_SETNPCHEAD = new ServerPacket(38, 6);
	public static final ServerPacket _UPDATE_INV_CLEAR = new ServerPacket(39, 4);
	public static final ServerPacket _IF_SETEVENTS = new ServerPacket(40, 12);
	public static final ServerPacket _IF_OPENTOP = new ServerPacket(41, 2);
	public static final ServerPacket _UNKNOWN2 = new ServerPacket(42, -2);
	public static final ServerPacket _CLANCHANNEL_FULL = new ServerPacket(43, -2);
	public static final ServerPacket _CAM_MOVETO = new ServerPacket(44, 6);
	public static final ServerPacket _CAM_LOOKAT = new ServerPacket(45, 6);
	public static final ServerPacket _RUNCLIENTSCRIPT = new ServerPacket(46, -2);
	public static final ServerPacket _CLANCHANNEL_DELTA = new ServerPacket(47, -2);
	public static final ServerPacket _VARP_LARGE = new ServerPacket(48, 6);
	public static final ServerPacket _CAM_SMOOTHRESET = new ServerPacket(49, 4);
	public static final ServerPacket _MESSAGE_GAME = new ServerPacket(50, -1);
	public static final ServerPacket _LEGACY_NPC_INFO_LARGE = new ServerPacket(51, -2);
	public static final ServerPacket _UNKNOWN1 = new ServerPacket(52, -1);
	public static final ServerPacket _UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(53, 2);
	public static final ServerPacket _CLANSETTINGS_DELTA = new ServerPacket(54, -2);
	public static final ServerPacket _SYNTH_SOUND = new ServerPacket(55, 5);
	public static final ServerPacket _SET_PLAYER_OP = new ServerPacket(56, -1);
	public static final ServerPacket _UPDATE_UID192 = new ServerPacket(57, 28);
	public static final ServerPacket _TRADING_POST_UPDATE = new ServerPacket(58, 20);
	public static final ServerPacket _MESSAGE_PRIVATE_ECHO = new ServerPacket(59, -2);
	public static final ServerPacket _MESSAGE_CLANCHANNEL = new ServerPacket(60, -1);
	public static final ServerPacket _MESSAGE_PRIVATE = new ServerPacket(61, -1);
	public static final ServerPacket _SYNC_CLIENT_VARCACHE = new ServerPacket(62, 0);
	public static final ServerPacket _VARCLAN = new ServerPacket(63, -1);
	public static final ServerPacket _MAP_SPOTANIM_SPECIFIC = new ServerPacket(64, 8);
	public static final ServerPacket _NPC_INFO_SMALL = new ServerPacket(65, -2);
	public static final ServerPacket _PLAYER_SPOTANIM_SPECIFIC = new ServerPacket(66, 8);
	public static final ServerPacket _AREA_SOUND = new ServerPacket(67, 5);
	public static final ServerPacket _UPDATE_SITESETTINGS = new ServerPacket(68, -1);
	public static final ServerPacket _CAM_SHAKE = new ServerPacket(69, 4);
	public static final ServerPacket _UPDATE_INV_FULL = new ServerPacket(70, -2);
	public static final ServerPacket _IF1_MODELROTATE = new ServerPacket(71, 8);
	public static final ServerPacket _UPDATE_IGNORELIST = new ServerPacket(72, -2);
	public static final ServerPacket _OBJ_ADD = new ServerPacket(73, 5);
	public static final ServerPacket _MAP_ANIM = new ServerPacket(74, 6);
	public static final ServerPacket _GAMEFRAME_FULL = new ServerPacket(75, -2);
	public static final ServerPacket _UPDATE_INV_PARTIAL = new ServerPacket(76, -2);
	public static final ServerPacket _MIDI_JINGLE = new ServerPacket(77, 5);
	public static final ServerPacket _IF_SETCOLOUR = new ServerPacket(78, 6);
	public static final ServerPacket _UPDATE_RUNWEIGHT = new ServerPacket(79, 2);
	public static final ServerPacket _HINT_ARROW = new ServerPacket(80, 6);
	public static final ServerPacket _MESSAGE_CLANCHANNEL_SYSTEM = new ServerPacket(81, -1);
	public static final ServerPacket _UPDATE_FRIENDLIST = new ServerPacket(82, -2);
	public static final ServerPacket _NPC_INFO_LARGE = new ServerPacket(83, -2);
	public static final ServerPacket _VARCLAN_DISABLE = new ServerPacket(84, 0);
	public static final ServerPacket _TRADING_POST_RESULTS = new ServerPacket(85, -2);
	public static final ServerPacket _IF_SETHIDE = new ServerPacket(86, 5);
	public static final ServerPacket _MESSAGE_FRIENDCHANNEL = new ServerPacket(87, -2);
	public static final ServerPacket _RESET_CLIENT_VARCACHE = new ServerPacket(88, 0);
	public static final ServerPacket _PLAYER_INFO = new ServerPacket(89, -2);
	public static final ServerPacket _UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(90, -2);
	public static final ServerPacket _MIDI_SONG = new ServerPacket(91, 2);
	public static final ServerPacket _CHAT_FILTER_SETTINGS = new ServerPacket(92, 2);
	public static final ServerPacket _FRIENDLIST_LOADED = new ServerPacket(93, 0);
	public static final ServerPacket _CLANSETTINGS_FULL = new ServerPacket(94, -2);
	public static final ServerPacket _SET_MAP_FLAG = new ServerPacket(95, 2);
	public static final ServerPacket _IF_SETANIM = new ServerPacket(96, 6);
	public static final ServerPacket _UPDATE_RUNENERGY = new ServerPacket(97, 1);
	public static final ServerPacket _NPC_ANIM_SPECIFIC = new ServerPacket(98, 5);
	public static final ServerPacket _VARP_SMALL = new ServerPacket(99, 3);
	public static final ServerPacket _LOC_ANIM_SPECIFIC = new ServerPacket(100, 6);
	public static final ServerPacket _CAM_RESET = new ServerPacket(101, 0);
	public static final ServerPacket _OBJ_DEL = new ServerPacket(102, 3);
	public static final ServerPacket _IF_SETOBJECT = new ServerPacket(103, 10);
	public static final ServerPacket _PROJANIM_SPECIFIC = new ServerPacket(104, 17);
	public static final ServerPacket _UNKNOWN3 = new ServerPacket(105, 5);

	public final int id;
	public final int length;

	ServerPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck();
		var2.size = var0.readUnsignedByte();
		var2.id = var0.readInt();
		var2.operations = new int[var2.size];
		var2.creationErrors = new int[var2.size];
		var2.fields = new Field[var2.size];
		var2.intReplaceValues = new int[var2.size];
		var2.methods = new Method[var2.size];
		var2.arguments = new byte[var2.size][][];

		for(int var3 = 0; var3 < var2.size; ++var3) {
			try {
				int var4 = var0.readUnsignedByte();
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) {
					if (var4 == 3 || var4 == 4) {
						var5 = var0.readStringCp1252NullTerminated();
						var6 = var0.readStringCp1252NullTerminated();
						var7 = var0.readUnsignedByte();
						String[] var8 = new String[var7];

						for(int var9 = 0; var9 < var7; ++var9) {
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated();
						byte[][] var10 = new byte[var7][];
						int var12;
						if (var4 == 3) {
							for(int var11 = 0; var11 < var7; ++var11) {
								var12 = var0.readInt();
								var10[var11] = new byte[var12];
								var0.readBytes(var10[var11], 0, var12);
							}
						}

						var2.operations[var3] = var4;
						Class[] var21 = new Class[var7];

						for(var12 = 0; var12 < var7; ++var12) {
							var21[var12] = class21.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = class21.loadClassFromDescriptor(var20);
						if (class21.loadClassFromDescriptor(var5).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var13 = class21.loadClassFromDescriptor(var5).getDeclaredMethods();
						Method[] var14 = var13;

						for(int var15 = 0; var15 < var14.length; ++var15) {
							Method var16 = var14[var15];
							if (Reflection.getMethodName(var16).equals(var6)) {
								Class[] var17 = Reflection.getParameterTypes(var16);
								if (var17.length == var21.length) {
									boolean var18 = true;

									for(int var19 = 0; var19 < var21.length; ++var19) {
										if (var21[var19] != var17[var19]) {
											var18 = false;
											break;
										}
									}

									if (var18 && var22 == var16.getReturnType()) {
										var2.methods[var3] = var16;
									}
								}
							}
						}

						var2.arguments[var3] = var10;
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated();
					var6 = var0.readStringCp1252NullTerminated();
					var7 = 0;
					if (var4 == 1) {
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4;
					var2.intReplaceValues[var3] = var7;
					if (class21.loadClassFromDescriptor(var5).getClassLoader() == null) {
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(class21.loadClassFromDescriptor(var5), var6);
				}
			} catch (ClassNotFoundException var24) {
				var2.creationErrors[var3] = -1;
			} catch (SecurityException var25) {
				var2.creationErrors[var3] = -2;
			} catch (NullPointerException var26) {
				var2.creationErrors[var3] = -3;
			} catch (Exception var27) {
				var2.creationErrors[var3] = -4;
			} catch (Throwable var28) {
				var2.creationErrors[var3] = -5;
			}
		}

		class33.reflectionChecks.addFirst(var2);
	}
}
