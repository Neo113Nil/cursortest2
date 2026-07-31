package com.moloco.sdk.internal.services;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class z {
    public static final z a = new z("SILENT", 0);
    public static final z b = new z("VIBRATE", 1);
    public static final z c = new z("NORMAL", 2);
    public static final /* synthetic */ z[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        z[] a2 = a();
        d = a2;
        e = EnumEntriesKt.enumEntries(a2);
    }

    public z(String str, int i) {
    }

    public static final /* synthetic */ z[] a() {
        return new z[]{a, b, c};
    }

    @NotNull
    public static EnumEntries b() {
        return e;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) d.clone();
    }
}
