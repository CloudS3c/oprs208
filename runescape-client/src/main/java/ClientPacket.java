import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("ClientPacket")
public class ClientPacket implements class262 {
	public static final ClientPacket _EXIT_FREECAM = new ClientPacket(0, 0);
	public static final ClientPacket _EVENT_KEYBOARD = new ClientPacket(1, -2);
	public static final ClientPacket _IGNORELIST_DEL = new ClientPacket(2, -1);
	public static final ClientPacket _BUTTON_CLICK = new ClientPacket(3, 4);
	public static final ClientPacket _EVENT_MOUSE_MOVE = new ClientPacket(4, -1);
	public static final ClientPacket _CLANCHANNEL_KICKUSER = new ClientPacket(5, -1);
	public static final ClientPacket _RESUME_P_COUNTDIALOG = new ClientPacket(6, 4);
	public static final ClientPacket _OPPLAYER8 = new ClientPacket(7, 3);
	public static final ClientPacket _REFLECTION_CHECK_REPLY = new ClientPacket(8, -1);
	public static final ClientPacket _OPOBJ2 = new ClientPacket(9, 7);
	public static final ClientPacket _AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL = new ClientPacket(10, -1);
	public static final ClientPacket _OPHELD5 = new ClientPacket(11, 8);
	public static final ClientPacket _CLAN_JOINCHAT_LEAVECHAT = new ClientPacket(12, -1);
	public static final ClientPacket _OPNPCT = new ClientPacket(13, 11);
	public static final ClientPacket _IF_BUTTOND = new ClientPacket(14, 16);
	public static final ClientPacket _OPLOCU = new ClientPacket(15, 15);
	public static final ClientPacket _RESUME_PAUSEBUTTON = new ClientPacket(16, 6);
	public static final ClientPacket _CLOSE_MODAL = new ClientPacket(17, 0);
	public static final ClientPacket _OPNPC4 = new ClientPacket(18, 3);
	public static final ClientPacket _OPOBJT = new ClientPacket(19, 15);
	public static final ClientPacket _WINDOW_STATUS = new ClientPacket(20, 5);
	public static final ClientPacket _IDLE_LOGOUT = new ClientPacket(21, 0);
	public static final ClientPacket _OPLOC3 = new ClientPacket(22, 7);
	public static final ClientPacket _IF_BUTTON8 = new ClientPacket(23, 8);
	public static final ClientPacket _OPNPC2 = new ClientPacket(24, 3);
	public static final ClientPacket _OPNPC5 = new ClientPacket(25, 3);
	public static final ClientPacket _OPPLAYER3 = new ClientPacket(27, 3);
	public static final ClientPacket _IF_BUTTON1 = new ClientPacket(28, 8);
	public static final ClientPacket _OPPLAYER6 = new ClientPacket(29, 3);
	public static final ClientPacket _RESUME_P_OBJDIALOG = new ClientPacket(30, 2);
	public static final ClientPacket _OPLOCT = new ClientPacket(32, 15);
	public static final ClientPacket _OPPLAYER4 = new ClientPacket(33, 3);
	public static final ClientPacket _OPHELD2 = new ClientPacket(34, 8);
	public static final ClientPacket _OPLOC5 = new ClientPacket(35, 7);
	public static final ClientPacket _RESUME_P_STRINGDIALOG = new ClientPacket(36, -1);
	public static final ClientPacket _SEND_PING_REPLY = new ClientPacket(37, 10);
	public static final ClientPacket _IF_BUTTON9 = new ClientPacket(38, 8);
	public static final ClientPacket _OPLOC2 = new ClientPacket(39, 7);
	public static final ClientPacket _MAP_BUILD_COMPLETE = new ClientPacket(40, 0);
	public static final ClientPacket _MOVE_MINIMAPCLICK = new ClientPacket(41, -1);
	public static final ClientPacket _OPNPCU = new ClientPacket(42, 11);
	public static final ClientPacket _IF_BUTTON4 = new ClientPacket(43, 8);
	public static final ClientPacket _OPHELDU = new ClientPacket(44, 16);
	public static final ClientPacket _OPPLAYER2 = new ClientPacket(45, 3);
	public static final ClientPacket _OPOBJ6 = new ClientPacket(46, 6);
	public static final ClientPacket _IF_BUTTON2 = new ClientPacket(47, 8);
	public static final ClientPacket _OPPLAYER5 = new ClientPacket(48, 3);
	public static final ClientPacket _OPPLAYERT = new ClientPacket(49, 11);
	public static final ClientPacket _NO_TIMEOUT = new ClientPacket(50, 0);
	public static final ClientPacket _IF_BUTTONT = new ClientPacket(51, 16);
	public static final ClientPacket _OPPLAYERU = new ClientPacket(52, 11);
	public static final ClientPacket _SEND_SNAPSHOT = new ClientPacket(54, -1);
	public static final ClientPacket _FRIEND_SETRANK = new ClientPacket(55, -1);
	public static final ClientPacket _OPHELD4 = new ClientPacket(56, 8);
	public static final ClientPacket _OPHELD3 = new ClientPacket(57, 8);
	public static final ClientPacket _CLAN_KICKUSER = new ClientPacket(58, -1);
	public static final ClientPacket _OPOBJ5 = new ClientPacket(59, 7);
	public static final ClientPacket _OPLOC6 = new ClientPacket(60, 2);
	public static final ClientPacket _OPPLAYER7 = new ClientPacket(61, 3);
	public static final ClientPacket _IF1_BUTTON4 = new ClientPacket(63, 8);
	public static final ClientPacket _SET_CHATFILTERSETTINGS = new ClientPacket(64, 3);
	public static final ClientPacket _OPHELD1 = new ClientPacket(65, 8);
	public static final ClientPacket _BUG_REPORT = new ClientPacket(66, -2);
	public static final ClientPacket _EVENT_CAMERA_POSITION = new ClientPacket(67, 4);
	public static final ClientPacket _OPNPC1 = new ClientPacket(68, 3);
	public static final ClientPacket _EVENT_APPLET_FOCUS = new ClientPacket(69, 1);
	public static final ClientPacket _OPOBJ4 = new ClientPacket(70, 7);
	public static final ClientPacket _OPOBJU = new ClientPacket(71, 15);
	public static final ClientPacket _TELEPORT = new ClientPacket(72, 9);
	public static final ClientPacket _RESUME_P_NAMEDIALOG = new ClientPacket(73, -1);
	public static final ClientPacket _IF_BUTTON10 = new ClientPacket(74, 8);
	public static final ClientPacket _OPPLAYER1 = new ClientPacket(75, 3);
	public static final ClientPacket _IF_BUTTON3 = new ClientPacket(76, 8);
	public static final ClientPacket _IF_BUTTON6 = new ClientPacket(78, 8);
	public static final ClientPacket _AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL = new ClientPacket(79, -1);
	public static final ClientPacket _IF1_BUTTON1 = new ClientPacket(80, 8);
	public static final ClientPacket _IF_BUTTON7 = new ClientPacket(81, 8);
	public static final ClientPacket _OPOBJ6_2 = new ClientPacket(82, 2);
	public static final ClientPacket _IF1_BUTTON2 = new ClientPacket(83, 8);
	public static final ClientPacket _OPHELD_D = new ClientPacket(84, 9);
	public static final ClientPacket _CLICKWORLDMAP = new ClientPacket(85, 4);
	public static final ClientPacket _OPLOC4 = new ClientPacket(86, 7);
	public static final ClientPacket _IF1_BUTTON5 = new ClientPacket(87, 8);
	public static final ClientPacket _UPDATE_APPEARANCE = new ClientPacket(88, 13);
	public static final ClientPacket _LOGIN_STATISTICS = new ClientPacket(89, -1);
	public static final ClientPacket _OPOBJ3 = new ClientPacket(90, 7);
	public static final ClientPacket _IF_BUTTON5 = new ClientPacket(91, 8);
	public static final ClientPacket _MESSAGE_PRIVATE = new ClientPacket(92, -2);
	public static final ClientPacket _OPOBJ1 = new ClientPacket(93, 7);
	public static final ClientPacket _FRIENDLIST_ADD = new ClientPacket(94, -1);
	public static final ClientPacket _CLIENT_CHEAT = new ClientPacket(95, -1);
	public static final ClientPacket _MESSAGE_PUBLIC = new ClientPacket(96, -1);
	public static final ClientPacket _MOVE_GAMECLICK = new ClientPacket(97, -1);
	public static final ClientPacket _OPNPC3 = new ClientPacket(98, 3);

	public static final ClientPacket field3035 = new ClientPacket(99, 2);
	public static final ClientPacket _FRIENDLIST_DEL = new ClientPacket(100, -1);
	public static final ClientPacket _IGNORELIST_ADD = new ClientPacket(101, -1);
	public static final ClientPacket _OPHELDT = new ClientPacket(102, 14);
	public static final ClientPacket _EVENT_MOUSE_CLICK = new ClientPacket(103, 6);
	public static final ClientPacket _IF1_BUTTON3 = new ClientPacket(104, 8);
	public static final ClientPacket _DETECT_MODIFIED_CLIENT = new ClientPacket(105, 4);
	public static final ClientPacket _OPLOC1 = new ClientPacket(106, 7);
	public static final ClientPacket _UNKNOWN1 = new ClientPacket(107, 22);

	final int id;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
			intValue = 1792994671
	)
	@Export("length")
	final int length;

	ClientPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
			descriptor = "(I)[I",
			garbageValue = "-1572617485"
	)
	public static int[] method5341() {
		int[] var0 = new int[KeyHandler.field123];

		for(int var1 = 0; var1 < KeyHandler.field123; ++var1) {
			var0[var1] = KeyHandler.field143[var1];
		}

		return var0;
	}
}
