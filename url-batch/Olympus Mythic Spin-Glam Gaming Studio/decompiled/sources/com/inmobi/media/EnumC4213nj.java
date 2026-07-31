package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.nj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class EnumC4213nj {
    public static final EnumC4213nj a;
    public static final EnumC4213nj b;
    public static final EnumC4213nj c;
    public static final EnumC4213nj d;
    public static final EnumC4213nj e;
    public static final EnumC4213nj f;
    public static final /* synthetic */ EnumC4213nj[] g;

    static {
        EnumC4213nj enumC4213nj = new EnumC4213nj("IDLE", 0);
        a = enumC4213nj;
        EnumC4213nj enumC4213nj2 = new EnumC4213nj("LOADING", 1);
        b = enumC4213nj2;
        EnumC4213nj enumC4213nj3 = new EnumC4213nj("REDIRECTING", 2);
        c = enumC4213nj3;
        EnumC4213nj enumC4213nj4 = new EnumC4213nj("RESOLVE_IN_WEB_VIEW", 3);
        d = enumC4213nj4;
        EnumC4213nj enumC4213nj5 = new EnumC4213nj("EXTERNAL", 4);
        e = enumC4213nj5;
        EnumC4213nj enumC4213nj6 = new EnumC4213nj("DONE", 5);
        f = enumC4213nj6;
        EnumC4213nj[] enumC4213njArr = {enumC4213nj, enumC4213nj2, enumC4213nj3, enumC4213nj4, enumC4213nj5, enumC4213nj6};
        g = enumC4213njArr;
        EnumEntriesKt.enumEntries(enumC4213njArr);
    }

    public EnumC4213nj(String str, int i) {
    }

    public static EnumC4213nj valueOf(String str) {
        return (EnumC4213nj) Enum.valueOf(EnumC4213nj.class, str);
    }

    public static EnumC4213nj[] values() {
        return (EnumC4213nj[]) g.clone();
    }
}
