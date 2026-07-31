package io.appmetrica.analytics.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: io.appmetrica.analytics.impl.ea, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC5304ea {
    public static final EnumC5304ea a;
    public static final EnumC5304ea b;
    public static final EnumC5304ea c;
    public static final EnumC5304ea d;
    public static final EnumC5304ea e;
    public static final EnumC5304ea f;
    public static final /* synthetic */ EnumC5304ea[] g;

    static {
        EnumC5304ea enumC5304ea = new EnumC5304ea("UNKNOWN", 0);
        EnumC5304ea enumC5304ea2 = new EnumC5304ea("APPSFLYER", 1);
        a = enumC5304ea2;
        EnumC5304ea enumC5304ea3 = new EnumC5304ea("ADJUST", 2);
        b = enumC5304ea3;
        EnumC5304ea enumC5304ea4 = new EnumC5304ea("KOCHAVA", 3);
        c = enumC5304ea4;
        EnumC5304ea enumC5304ea5 = new EnumC5304ea("TENJIN", 4);
        d = enumC5304ea5;
        EnumC5304ea enumC5304ea6 = new EnumC5304ea("AIRBRIDGE", 5);
        e = enumC5304ea6;
        EnumC5304ea enumC5304ea7 = new EnumC5304ea("SINGULAR", 6);
        f = enumC5304ea7;
        EnumC5304ea[] enumC5304eaArr = {enumC5304ea, enumC5304ea2, enumC5304ea3, enumC5304ea4, enumC5304ea5, enumC5304ea6, enumC5304ea7};
        g = enumC5304eaArr;
        EnumEntriesKt.enumEntries(enumC5304eaArr);
    }

    public EnumC5304ea(String str, int i) {
    }

    public static EnumC5304ea valueOf(String str) {
        return (EnumC5304ea) Enum.valueOf(EnumC5304ea.class, str);
    }

    public static EnumC5304ea[] values() {
        return (EnumC5304ea[]) g.clone();
    }
}
