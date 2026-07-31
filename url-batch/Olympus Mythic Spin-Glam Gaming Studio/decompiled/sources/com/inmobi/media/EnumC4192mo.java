package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.mo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class EnumC4192mo {
    public static final EnumC4192mo a;
    public static final EnumC4192mo b;
    public static final /* synthetic */ EnumC4192mo[] c;

    static {
        EnumC4192mo enumC4192mo = new EnumC4192mo("HIDDEN", 0);
        a = enumC4192mo;
        EnumC4192mo enumC4192mo2 = new EnumC4192mo("VISIBLE", 1);
        b = enumC4192mo2;
        EnumC4192mo[] enumC4192moArr = {enumC4192mo, enumC4192mo2};
        c = enumC4192moArr;
        EnumEntriesKt.enumEntries(enumC4192moArr);
    }

    public EnumC4192mo(String str, int i) {
    }

    public static EnumC4192mo valueOf(String str) {
        return (EnumC4192mo) Enum.valueOf(EnumC4192mo.class, str);
    }

    public static EnumC4192mo[] values() {
        return (EnumC4192mo[]) c.clone();
    }
}
