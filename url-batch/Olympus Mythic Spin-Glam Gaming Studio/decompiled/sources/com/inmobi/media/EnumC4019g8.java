package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.g8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class EnumC4019g8 {
    public static final EnumC4019g8 b;
    public static final EnumC4019g8 c;
    public static final EnumC4019g8 d;
    public static final EnumC4019g8 e;
    public static final EnumC4019g8 f;
    public static final EnumC4019g8 g;
    public static final /* synthetic */ EnumC4019g8[] h;
    public final short a;

    static {
        EnumC4019g8 enumC4019g8 = new EnumC4019g8("UNDEFINED_ERROR", 0, (short) 10001);
        b = enumC4019g8;
        EnumC4019g8 enumC4019g82 = new EnumC4019g8("INVALID_STATE", 1, (short) 10002);
        c = enumC4019g82;
        EnumC4019g8 enumC4019g83 = new EnumC4019g8("MALFORMED_URL", 2, (short) 10003);
        d = enumC4019g83;
        EnumC4019g8 enumC4019g84 = new EnumC4019g8("TIMEOUT", 3, (short) 10004);
        e = enumC4019g84;
        EnumC4019g8 enumC4019g85 = new EnumC4019g8("NETWORK", 4, (short) 10005);
        f = enumC4019g85;
        EnumC4019g8 enumC4019g86 = new EnumC4019g8("NO_URL_FOUND", 5, (short) 10006);
        g = enumC4019g86;
        EnumC4019g8[] enumC4019g8Arr = {enumC4019g8, enumC4019g82, enumC4019g83, enumC4019g84, enumC4019g85, enumC4019g86};
        h = enumC4019g8Arr;
        EnumEntriesKt.enumEntries(enumC4019g8Arr);
    }

    public EnumC4019g8(String str, int i, short s) {
        this.a = s;
    }

    public static EnumC4019g8 valueOf(String str) {
        return (EnumC4019g8) Enum.valueOf(EnumC4019g8.class, str);
    }

    public static EnumC4019g8[] values() {
        return (EnumC4019g8[]) h.clone();
    }
}
