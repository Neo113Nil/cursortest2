package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class dc3 {
    public static final dc3 c;
    public static final dc3 d;
    public static final dc3 e;
    public static final dc3 f;
    public static final /* synthetic */ dc3[] g;
    public final String b;

    static {
        dc3 dc3Var = new dc3(0, "INCONSISTENT_ASSET_VALUE", "inconsistent_asset_value");
        c = dc3Var;
        dc3 dc3Var2 = new dc3(1, "NO_VISIBLE_SPONSORED_ASSET", "no_visible_sponsored_asset");
        d = dc3Var2;
        dc3 dc3Var3 = new dc3(2, "NO_VISIBLE_REQUIRED_ASSETS", "no_visible_required_assets");
        e = dc3Var3;
        dc3 dc3Var4 = new dc3(3, "OVERLAPPED_BY_VIEW", "overlapped_by_view");
        f = dc3Var4;
        dc3[] dc3VarArr = {dc3Var, dc3Var2, dc3Var3, dc3Var4};
        g = dc3VarArr;
        EnumEntriesKt.enumEntries(dc3VarArr);
    }

    public dc3(int i, String str, String str2) {
        this.b = str2;
    }

    public static dc3 valueOf(String str) {
        return (dc3) Enum.valueOf(dc3.class, str);
    }

    public static dc3[] values() {
        return (dc3[]) g.clone();
    }
}
