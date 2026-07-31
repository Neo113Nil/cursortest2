package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class Za {
    public static final Za d;
    public static final Za e;
    public static final Za f;
    public static final Za g;
    public static final Za h;
    public static final Za i;
    public static final Za j;
    public static final /* synthetic */ Za[] k;
    public final String a;
    public final String b;
    public final int c;

    static {
        Za za = new Za("LPClickStart", 0, "clickStartCalled", "sdk_click_detected", 0);
        d = za;
        Za za2 = new Za("LPStartFailed", 1, "landingsStartFailed", "valid_click_failed", 1);
        e = za2;
        Za za3 = new Za("LPStartSuccess", 2, "landingsStartSuccess", "browser_open_success", 2);
        f = za3;
        Za za4 = new Za("LPBrowserOpenFailed", 3, "browserOpenFailed", "browser_open_failed", 2);
        g = za4;
        Za za5 = new Za("LPPageStart", 4, "landingsPageStarted", "on_page_started", 3);
        h = za5;
        Za za6 = new Za("LPCompleteSuccess", 5, "landingsCompleteSuccess", "landing_success", 4);
        i = za6;
        Za za7 = new Za("LPCompleteFailed", 6, "landingsCompleteFailed", "landing_failed", 4);
        j = za7;
        Za[] zaArr = {za, za2, za3, za4, za5, za6, za7};
        k = zaArr;
        EnumEntriesKt.enumEntries(zaArr);
    }

    public Za(String str, int i2, String str2, String str3, int i3) {
        this.a = str2;
        this.b = str3;
        this.c = i3;
    }

    public static Za valueOf(String str) {
        return (Za) Enum.valueOf(Za.class, str);
    }

    public static Za[] values() {
        return (Za[]) k.clone();
    }
}
