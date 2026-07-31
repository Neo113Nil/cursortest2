package com.inmobi.media;

import com.ironsource.X3;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.r8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class EnumC4307r8 {
    public static final /* synthetic */ EnumC4307r8[] a;

    static {
        EnumC4307r8[] enumC4307r8Arr = {new EnumC4307r8("LOADING", 0, "loading"), new EnumC4307r8("PLAYING", 1, "playing"), new EnumC4307r8("PAUSED", 2, "paused"), new EnumC4307r8("STOPPED", 3, X3.i.h0), new EnumC4307r8("FAILED", 4, X3.i.t), new EnumC4307r8("READY", 5, X3.i.s)};
        a = enumC4307r8Arr;
        EnumEntriesKt.enumEntries(enumC4307r8Arr);
    }

    public EnumC4307r8(String str, int i, String str2) {
    }

    public static EnumC4307r8 valueOf(String str) {
        return (EnumC4307r8) Enum.valueOf(EnumC4307r8.class, str);
    }

    public static EnumC4307r8[] values() {
        return (EnumC4307r8[]) a.clone();
    }
}
