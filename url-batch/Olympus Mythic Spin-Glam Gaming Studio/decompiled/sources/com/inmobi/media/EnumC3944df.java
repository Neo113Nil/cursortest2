package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.df, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class EnumC3944df {
    public static final EnumC3944df a;
    public static final EnumC3944df b;
    public static final EnumC3944df c;
    public static final EnumC3944df d;
    public static final /* synthetic */ EnumC3944df[] e;

    static {
        EnumC3944df enumC3944df = new EnumC3944df("UNAVAILABLE", 0);
        a = enumC3944df;
        EnumC3944df enumC3944df2 = new EnumC3944df("SLOW", 1);
        b = enumC3944df2;
        EnumC3944df enumC3944df3 = new EnumC3944df("MEDIUM", 2);
        c = enumC3944df3;
        EnumC3944df enumC3944df4 = new EnumC3944df("FAST", 3);
        d = enumC3944df4;
        EnumC3944df[] enumC3944dfArr = {enumC3944df, enumC3944df2, enumC3944df3, enumC3944df4};
        e = enumC3944dfArr;
        EnumEntriesKt.enumEntries(enumC3944dfArr);
    }

    public EnumC3944df(String str, int i) {
    }

    public static EnumC3944df valueOf(String str) {
        return (EnumC3944df) Enum.valueOf(EnumC3944df.class, str);
    }

    public static EnumC3944df[] values() {
        return (EnumC3944df[]) e.clone();
    }
}
