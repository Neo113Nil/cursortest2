package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.zk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC4530zk {
    public static final EnumC4530zk a;
    public static final EnumC4530zk b;
    public static final /* synthetic */ EnumC4530zk[] c;

    static {
        EnumC4530zk enumC4530zk = new EnumC4530zk("SDK", 0);
        a = enumC4530zk;
        EnumC4530zk enumC4530zk2 = new EnumC4530zk("TEMPLATE", 1);
        b = enumC4530zk2;
        EnumC4530zk[] enumC4530zkArr = {enumC4530zk, enumC4530zk2};
        c = enumC4530zkArr;
        EnumEntriesKt.enumEntries(enumC4530zkArr);
    }

    public EnumC4530zk(String str, int i) {
    }

    public static EnumC4530zk valueOf(String str) {
        return (EnumC4530zk) Enum.valueOf(EnumC4530zk.class, str);
    }

    public static EnumC4530zk[] values() {
        return (EnumC4530zk[]) c.clone();
    }
}
