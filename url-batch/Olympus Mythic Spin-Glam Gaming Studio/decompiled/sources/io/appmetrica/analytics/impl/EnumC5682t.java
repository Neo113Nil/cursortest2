package io.appmetrica.analytics.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: io.appmetrica.analytics.impl.t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class EnumC5682t {
    public static final /* synthetic */ EnumC5682t[] a;

    static {
        EnumC5682t[] enumC5682tArr = {new EnumC5682t(0, "AUTOCOLLECTED", "autocollected"), new EnumC5682t(1, "MANUAL", "manual")};
        a = enumC5682tArr;
        EnumEntriesKt.enumEntries(enumC5682tArr);
    }

    public EnumC5682t(int i, String str, String str2) {
    }

    public static EnumC5682t valueOf(String str) {
        return (EnumC5682t) Enum.valueOf(EnumC5682t.class, str);
    }

    public static EnumC5682t[] values() {
        return (EnumC5682t[]) a.clone();
    }
}
