package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.x8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC4465x8 {
    public static final EnumC4465x8 b;
    public static final EnumC4465x8 c;
    public static final EnumC4465x8 d;
    public static final EnumC4465x8 e;
    public static final EnumC4465x8 f;
    public static final EnumC4465x8 g;
    public static final EnumC4465x8 h;
    public static final EnumC4465x8 i;
    public static final EnumC4465x8 j;
    public static final EnumC4465x8 k;
    public static final EnumC4465x8 l;
    public static final EnumC4465x8 m;
    public static final EnumC4465x8 n;
    public static final EnumC4465x8 o;
    public static final /* synthetic */ EnumC4465x8[] p;
    public final String a;

    static {
        EnumC4465x8 enumC4465x8 = new EnumC4465x8("VIDEO_READY", 0, "VideoReady");
        b = enumC4465x8;
        EnumC4465x8 enumC4465x82 = new EnumC4465x8("VIDEO_COMPLETE", 1, "VideoComplete");
        c = enumC4465x82;
        EnumC4465x8 enumC4465x83 = new EnumC4465x8("VIDEO_PLAYBACK_ERROR", 2, "VideoPlaybackError");
        d = enumC4465x83;
        EnumC4465x8 enumC4465x84 = new EnumC4465x8("VIDEO_COMMAND_ERROR", 3, "VideoCommandError");
        e = enumC4465x84;
        EnumC4465x8 enumC4465x85 = new EnumC4465x8("VIDEO_PLAYBACK_STATE", 4, "VideoPlaybackState");
        f = enumC4465x85;
        EnumC4465x8 enumC4465x86 = new EnumC4465x8("VIDEO_PLAYBACK_UPDATE", 5, "VideoPlaybackUpdate");
        g = enumC4465x86;
        EnumC4465x8 enumC4465x87 = new EnumC4465x8("VIDEO_QUARTILES_EVENT", 6, "VideoQuartilesEvent");
        h = enumC4465x87;
        EnumC4465x8 enumC4465x88 = new EnumC4465x8("VIDEO_PLAYER_CREATED", 7, "VideoPlayerCreated");
        i = enumC4465x88;
        EnumC4465x8 enumC4465x89 = new EnumC4465x8("VIDEO_PLAYER_POSITION_UPDATED", 8, "VideoPlayerPositionUpdated");
        j = enumC4465x89;
        EnumC4465x8 enumC4465x810 = new EnumC4465x8("VIDEO_PLAYER_DESTROYED", 9, "VideoPlayerDestroyed");
        k = enumC4465x810;
        EnumC4465x8 enumC4465x811 = new EnumC4465x8("VIDEO_PLAYER_ACTION_EXECUTED", 10, "VideoPlayerActionExecuted");
        l = enumC4465x811;
        EnumC4465x8 enumC4465x812 = new EnumC4465x8("VIDEO_PLAYER_POSITION", 11, "VideoPlayerPosition");
        m = enumC4465x812;
        EnumC4465x8 enumC4465x813 = new EnumC4465x8("VIDEO_CAN_PLAY_THROUGH", 12, "VideoCanPlayThrough");
        n = enumC4465x813;
        EnumC4465x8 enumC4465x814 = new EnumC4465x8("VIDEO_LOADED_METADATA", 13, "VideoLoadedMetadata");
        o = enumC4465x814;
        EnumC4465x8[] enumC4465x8Arr = {enumC4465x8, enumC4465x82, enumC4465x83, enumC4465x84, enumC4465x85, enumC4465x86, enumC4465x87, enumC4465x88, enumC4465x89, enumC4465x810, enumC4465x811, enumC4465x812, enumC4465x813, enumC4465x814};
        p = enumC4465x8Arr;
        EnumEntriesKt.enumEntries(enumC4465x8Arr);
    }

    public EnumC4465x8(String str, int i2, String str2) {
        this.a = str2;
    }

    public static EnumC4465x8 valueOf(String str) {
        return (EnumC4465x8) Enum.valueOf(EnumC4465x8.class, str);
    }

    public static EnumC4465x8[] values() {
        return (EnumC4465x8[]) p.clone();
    }
}
