package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class b implements c {
    public static final b a = new b("FULLSCREEN_AD_SHOW_FAILED_NO_SUPPORTED_TYPE", 0);
    public static final b b = new b("FULLSCREEN_AD_COMPOSE_VIEW_NOT_AVAILABLE", 1);
    public static final /* synthetic */ b[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        b[] b2 = b();
        c = b2;
        d = EnumEntriesKt.enumEntries(b2);
    }

    public b(String str, int i) {
    }

    public static final /* synthetic */ b[] b() {
        return new b[]{a, b};
    }

    @NotNull
    public static EnumEntries c() {
        return d;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) c.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    @NotNull
    public String a() {
        return name();
    }
}
