package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class h50 {
    public static final h50 c;
    public static final h50 d;
    public static final h50 e;
    public static final /* synthetic */ h50[] f;
    public final String b;

    static {
        h50 h50Var = new h50(0, "BIDDING", "Bidding");
        c = h50Var;
        h50 h50Var2 = new h50(1, "WATERFALL", "Waterfall");
        d = h50Var2;
        h50 h50Var3 = new h50(2, "NONE", "None");
        e = h50Var3;
        h50[] h50VarArr = {h50Var, h50Var2, h50Var3};
        f = h50VarArr;
        EnumEntriesKt.enumEntries(h50VarArr);
    }

    public h50(int i, String str, String str2) {
        this.b = str2;
    }

    public static h50 valueOf(String str) {
        return (h50) Enum.valueOf(h50.class, str);
    }

    public static h50[] values() {
        return (h50[]) f.clone();
    }

    public final String a() {
        return this.b;
    }
}
