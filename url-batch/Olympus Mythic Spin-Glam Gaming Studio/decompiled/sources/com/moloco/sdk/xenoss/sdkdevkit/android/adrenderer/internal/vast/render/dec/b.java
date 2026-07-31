package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {
    public static final b a = new b("DisplayStarted", 0);
    public static final b b = new b("ClickThrough", 1);
    public static final /* synthetic */ b[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        b[] a2 = a();
        c = a2;
        d = EnumEntriesKt.enumEntries(a2);
    }

    public b(String str, int i) {
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{a, b};
    }

    @NotNull
    public static EnumEntries b() {
        return d;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) c.clone();
    }
}
