package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.mg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class EnumC4183mg {
    public static final EnumC4183mg a;
    public static final EnumC4183mg b;
    public static final /* synthetic */ EnumC4183mg[] c;

    static {
        EnumC4183mg enumC4183mg = new EnumC4183mg("STOPPED", 0);
        a = enumC4183mg;
        EnumC4183mg enumC4183mg2 = new EnumC4183mg("STARTED", 1);
        b = enumC4183mg2;
        EnumC4183mg[] enumC4183mgArr = {enumC4183mg, enumC4183mg2};
        c = enumC4183mgArr;
        EnumEntriesKt.enumEntries(enumC4183mgArr);
    }

    public EnumC4183mg(String str, int i) {
    }

    public static EnumC4183mg valueOf(String str) {
        return (EnumC4183mg) Enum.valueOf(EnumC4183mg.class, str);
    }

    public static EnumC4183mg[] values() {
        return (EnumC4183mg[]) c.clone();
    }
}
