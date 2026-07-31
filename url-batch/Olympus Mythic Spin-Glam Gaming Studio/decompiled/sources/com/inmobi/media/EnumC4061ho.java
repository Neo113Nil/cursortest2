package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.ho, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class EnumC4061ho {
    public static final EnumC4061ho a;
    public static final EnumC4061ho b;
    public static final EnumC4061ho c;
    public static final /* synthetic */ EnumC4061ho[] d;

    static {
        EnumC4061ho enumC4061ho = new EnumC4061ho("UNKNOWN", 0);
        a = enumC4061ho;
        EnumC4061ho enumC4061ho2 = new EnumC4061ho("HIDDEN", 1);
        b = enumC4061ho2;
        EnumC4061ho enumC4061ho3 = new EnumC4061ho("VISIBLE", 2);
        c = enumC4061ho3;
        EnumC4061ho[] enumC4061hoArr = {enumC4061ho, enumC4061ho2, enumC4061ho3};
        d = enumC4061hoArr;
        EnumEntriesKt.enumEntries(enumC4061hoArr);
    }

    public EnumC4061ho(String str, int i) {
    }

    public static EnumC4061ho valueOf(String str) {
        return (EnumC4061ho) Enum.valueOf(EnumC4061ho.class, str);
    }

    public static EnumC4061ho[] values() {
        return (EnumC4061ho[]) d.clone();
    }
}
