package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class go2 {
    public static final go2 c;
    public static final go2 d;
    public static final go2 e;
    public static final /* synthetic */ go2[] f;
    public final String b;

    static {
        go2 go2Var = new go2(0, "SUCCESS", "success");
        c = go2Var;
        go2 go2Var2 = new go2(1, "ERROR", "error");
        d = go2Var2;
        go2 go2Var3 = new go2(2, "NO_ADS", "no_ads");
        e = go2Var3;
        go2[] go2VarArr = {go2Var, go2Var2, go2Var3, new go2(3, "FILTERED", "filtered")};
        f = go2VarArr;
        EnumEntriesKt.enumEntries(go2VarArr);
    }

    public go2(int i, String str, String str2) {
        this.b = str2;
    }

    public static go2 valueOf(String str) {
        return (go2) Enum.valueOf(go2.class, str);
    }

    public static go2[] values() {
        return (go2[]) f.clone();
    }
}
