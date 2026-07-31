package io.appmetrica.analytics.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: io.appmetrica.analytics.impl.oe, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class EnumC5567oe {
    public static final EnumC5567oe a;
    public static final EnumC5567oe b;
    public static final /* synthetic */ EnumC5567oe[] c;

    static {
        EnumC5567oe enumC5567oe = new EnumC5567oe("REPORT", 0);
        a = enumC5567oe;
        EnumC5567oe enumC5567oe2 = new EnumC5567oe("LOCATION", 1);
        EnumC5567oe enumC5567oe3 = new EnumC5567oe("STARTUP", 2);
        b = enumC5567oe3;
        EnumC5567oe[] enumC5567oeArr = {enumC5567oe, enumC5567oe2, enumC5567oe3, new EnumC5567oe("DIAGNOSTIC", 3)};
        c = enumC5567oeArr;
        EnumEntriesKt.enumEntries(enumC5567oeArr);
    }

    public EnumC5567oe(String str, int i) {
    }

    public static EnumC5567oe valueOf(String str) {
        return (EnumC5567oe) Enum.valueOf(EnumC5567oe.class, str);
    }

    public static EnumC5567oe[] values() {
        return (EnumC5567oe[]) c.clone();
    }
}
