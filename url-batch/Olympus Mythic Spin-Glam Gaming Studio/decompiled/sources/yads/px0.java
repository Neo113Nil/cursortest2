package yads;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class px0 {
    public static final ox0 c;
    public static final px0 d;
    public static final px0 e;
    public static final px0 f;
    public static final /* synthetic */ px0[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String b;

    static {
        px0 px0Var = new px0(0, "INTERSTITIAL", "interstitial");
        d = px0Var;
        px0 px0Var2 = new px0(1, BrandSafetyUtils.k, "rewarded");
        e = px0Var2;
        px0 px0Var3 = new px0(2, "APP_OPEN", "appopen");
        f = px0Var3;
        px0[] px0VarArr = {px0Var, px0Var2, px0Var3};
        g = px0VarArr;
        h = EnumEntriesKt.enumEntries(px0VarArr);
        c = new ox0();
    }

    public px0(int i, String str, String str2) {
        this.b = str2;
    }

    public static px0 valueOf(String str) {
        return (px0) Enum.valueOf(px0.class, str);
    }

    public static px0[] values() {
        return (px0[]) g.clone();
    }
}
