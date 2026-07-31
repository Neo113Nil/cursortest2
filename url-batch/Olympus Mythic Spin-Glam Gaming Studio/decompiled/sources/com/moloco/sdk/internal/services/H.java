package com.moloco.sdk.internal.services;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class H {
    public static final H a = new H("UNKNOWN", 0);
    public static final H b = new H("PORTRAIT", 1);
    public static final H c = new H("LANDSCAPE", 2);
    public static final /* synthetic */ H[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        H[] a2 = a();
        d = a2;
        e = EnumEntriesKt.enumEntries(a2);
    }

    public H(String str, int i) {
    }

    public static final /* synthetic */ H[] a() {
        return new H[]{a, b, c};
    }

    @NotNull
    public static EnumEntries b() {
        return e;
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) d.clone();
    }
}
