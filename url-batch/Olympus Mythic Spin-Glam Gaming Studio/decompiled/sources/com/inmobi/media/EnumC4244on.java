package com.inmobi.media;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.on, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class EnumC4244on {
    public static final /* synthetic */ EnumC4244on[] b;
    public static final /* synthetic */ EnumEntries c;
    public final String a;

    static {
        EnumC4244on[] enumC4244onArr = {new EnumC4244on("SHOW_VIDEO", 0, "show"), new EnumC4244on("HIDE_VIDEO", 1, "hide"), new EnumC4244on("PLAY_VIDEO", 2, "resume"), new EnumC4244on("PAUSE_VIDEO", 3, "pause"), new EnumC4244on("MUTE_VIDEO", 4, "mute"), new EnumC4244on("UNMUTE_VIDEO", 5, "unmute"), new EnumC4244on("SKIP_VIDEO", 6, "skip")};
        b = enumC4244onArr;
        c = EnumEntriesKt.enumEntries(enumC4244onArr);
    }

    public EnumC4244on(String str, int i, String str2) {
        this.a = str2;
    }

    public static EnumC4244on valueOf(String str) {
        return (EnumC4244on) Enum.valueOf(EnumC4244on.class, str);
    }

    public static EnumC4244on[] values() {
        return (EnumC4244on[]) b.clone();
    }
}
