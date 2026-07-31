package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.i8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class EnumC4071i8 {
    public static final /* synthetic */ EnumC4071i8[] a;

    static {
        EnumC4071i8[] enumC4071i8Arr = {new EnumC4071i8("CREATE_VIDEO_PLAYER", 0, "createVideoPlayer"), new EnumC4071i8("EXECUTE_VIDEO_PLAYER_ACTION", 1, "executeVideoPlayerActions"), new EnumC4071i8("UPDATE_VIDEO_PLAYER_POSITION", 2, "updateVideoPlayerPosition"), new EnumC4071i8("GET_VIDEO_PLAYER_STATE", 3, "getVideoPlayerState"), new EnumC4071i8("UNKNOWN", 4, "unknown")};
        a = enumC4071i8Arr;
        EnumEntriesKt.enumEntries(enumC4071i8Arr);
    }

    public EnumC4071i8(String str, int i, String str2) {
    }

    public static EnumC4071i8 valueOf(String str) {
        return (EnumC4071i8) Enum.valueOf(EnumC4071i8.class, str);
    }

    public static EnumC4071i8[] values() {
        return (EnumC4071i8[]) a.clone();
    }
}
