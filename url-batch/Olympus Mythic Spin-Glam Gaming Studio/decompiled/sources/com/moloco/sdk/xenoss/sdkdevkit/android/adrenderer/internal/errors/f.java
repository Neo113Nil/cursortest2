package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class f implements c {
    public static final f a = new f("NATIVE_AD_ORTB_RESPONSE_NULL_ERROR", 0);
    public static final f b = new f("NATIVE_AD_IMAGE_ASSET_MEDIA_FETCH_ERROR", 1);
    public static final f c = new f("NATIVE_AD_IMAGE_PREPARE_ASSET_UNKNOWN_ERROR", 2);
    public static final f d = new f("NATIVE_AD_VIDEO_ASSET_MEDIA_NOT_ENOUGH_ERROR", 3);
    public static final f e = new f("NATIVE_AD_VIDEO_ASSET_MEDIA_FETCH_ERROR", 4);
    public static final f f = new f("NATIVE_AD_COMPOSE_VIEW_NOT_AVAILABLE_ERROR", 5);
    public static final /* synthetic */ f[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        f[] b2 = b();
        g = b2;
        h = EnumEntriesKt.enumEntries(b2);
    }

    public f(String str, int i) {
    }

    public static final /* synthetic */ f[] b() {
        return new f[]{a, b, c, d, e, f};
    }

    @NotNull
    public static EnumEntries c() {
        return h;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) g.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    @NotNull
    public String a() {
        return name();
    }
}
