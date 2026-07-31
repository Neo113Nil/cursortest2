package yads;

import com.yandex.mobile.ads.R$font;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class xv0 {
    public static final xv0 f;
    public static final /* synthetic */ xv0[] g;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    static {
        xv0 xv0Var = new xv0(R$font.monetization_ads_internal_font_light, R$font.monetization_ads_internal_font_regular, R$font.monetization_ads_internal_font_medium, R$font.monetization_ads_internal_font_bold);
        f = xv0Var;
        xv0[] xv0VarArr = {xv0Var};
        g = xv0VarArr;
        EnumEntriesKt.enumEntries(xv0VarArr);
    }

    public xv0(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static xv0 valueOf(String str) {
        return (xv0) Enum.valueOf(xv0.class, str);
    }

    public static xv0[] values() {
        return (xv0[]) g.clone();
    }
}
