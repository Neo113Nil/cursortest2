package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class g42 {
    public static final g42 c;
    public static final g42 d;
    public static final /* synthetic */ g42[] e;
    public final String b;

    static {
        g42 g42Var = new g42(0, "LoadingOnShow", "loading_on_show");
        c = g42Var;
        g42 g42Var2 = new g42(1, "LoadingOnBack", "loading_on_back");
        d = g42Var2;
        g42[] g42VarArr = {g42Var, g42Var2};
        e = g42VarArr;
        EnumEntriesKt.enumEntries(g42VarArr);
    }

    public g42(int i, String str, String str2) {
        this.b = str2;
    }

    public static g42 valueOf(String str) {
        return (g42) Enum.valueOf(g42.class, str);
    }

    public static g42[] values() {
        return (g42[]) e.clone();
    }

    public final String a() {
        return this.b;
    }
}
