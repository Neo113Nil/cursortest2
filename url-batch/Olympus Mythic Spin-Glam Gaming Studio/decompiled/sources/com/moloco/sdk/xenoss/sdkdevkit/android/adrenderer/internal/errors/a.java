package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class a implements c {
    public static final a a = new a("STATIC_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 0);
    public static final a b = new a("VAST_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 1);
    public static final a c = new a("MRAID_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 2);
    public static final a d = new a("NATIVE_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 3);
    public static final a e = new a("VAST_FULLSCREEN_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 4);
    public static final a f = new a("MRAID_FULLSCREEN_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 5);
    public static final a g = new a("STATIC_FULLSCREEN_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 6);
    public static final a h = new a("VAST_BANNER_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 7);
    public static final a i = new a("MRAID_BANNER_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 8);
    public static final a j = new a("STATIC_BANNER_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 9);
    public static final /* synthetic */ a[] k;
    public static final /* synthetic */ EnumEntries l;

    static {
        a[] b2 = b();
        k = b2;
        l = EnumEntriesKt.enumEntries(b2);
    }

    public a(String str, int i2) {
    }

    public static final /* synthetic */ a[] b() {
        return new a[]{a, b, c, d, e, f, g, h, i, j};
    }

    @NotNull
    public static EnumEntries c() {
        return l;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) k.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    @NotNull
    public String a() {
        return name();
    }
}
