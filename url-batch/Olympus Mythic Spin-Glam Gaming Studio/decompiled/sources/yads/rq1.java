package yads;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class rq1 {
    public static final qq1 c;
    public static final rq1 d;
    public static final rq1 e;
    public static final /* synthetic */ rq1[] f;
    public static final /* synthetic */ EnumEntries g;
    public final String b;

    static {
        rq1 rq1Var = new rq1(0, "INTERSTITIAL", "interstitial");
        d = rq1Var;
        rq1 rq1Var2 = new rq1(1, BrandSafetyUtils.k, "rewarded");
        rq1 rq1Var3 = new rq1(2, "BANNER", "banner");
        rq1 rq1Var4 = new rq1(3, "NATIVE", "native");
        e = rq1Var4;
        rq1[] rq1VarArr = {rq1Var, rq1Var2, rq1Var3, rq1Var4};
        f = rq1VarArr;
        g = EnumEntriesKt.enumEntries(rq1VarArr);
        c = new qq1();
    }

    public rq1(int i, String str, String str2) {
        this.b = str2;
    }

    public static rq1 valueOf(String str) {
        return (rq1) Enum.valueOf(rq1.class, str);
    }

    public static rq1[] values() {
        return (rq1[]) f.clone();
    }
}
