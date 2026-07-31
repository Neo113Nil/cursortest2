package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ac3 {
    public static final ac3 c;
    public static final ac3 d;
    public static final ac3 e;
    public static final ac3 f;
    public static final ac3 g;
    public static final ac3 h;
    public static final ac3 i;
    public static final /* synthetic */ ac3[] j;
    public final String b;

    static {
        ac3 ac3Var = new ac3(0, "NO_AD_VIEW", "no_ad_view");
        c = ac3Var;
        ac3 ac3Var2 = new ac3(1, "NO_VISIBLE_ADS", "no_visible_ads");
        d = ac3Var2;
        ac3 ac3Var3 = new ac3(2, "NOT_VISIBLE_FOR_PERCENT", "not_visible_for_percent");
        e = ac3Var3;
        ac3 ac3Var4 = new ac3(3, "REQUIRED_ASSET_CAN_NOT_BE_VISIBLE", "required_asset_can_not_be_visible");
        f = ac3Var4;
        ac3 ac3Var5 = new ac3(4, "SUPERVIEW_NULL", "superview_null");
        g = ac3Var5;
        ac3 ac3Var6 = new ac3(5, "SUPERVIEW_HIDDEN", "superview_hidden");
        h = ac3Var6;
        ac3 ac3Var7 = new ac3(6, "VISIBLE_AREA_TOO_SMALL", "visible_area_too_small");
        i = ac3Var7;
        ac3[] ac3VarArr = {ac3Var, ac3Var2, ac3Var3, ac3Var4, ac3Var5, ac3Var6, ac3Var7};
        j = ac3VarArr;
        EnumEntriesKt.enumEntries(ac3VarArr);
    }

    public ac3(int i2, String str, String str2) {
        this.b = str2;
    }

    public static ac3 valueOf(String str) {
        return (ac3) Enum.valueOf(ac3.class, str);
    }

    public static ac3[] values() {
        return (ac3[]) j.clone();
    }
}
