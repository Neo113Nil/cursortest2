package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class sg0 {
    public static final sg0 b;
    public static final sg0 c;
    public static final sg0 d;
    public static final /* synthetic */ sg0[] e;

    static {
        sg0 sg0Var = new sg0(0, "PHONE");
        b = sg0Var;
        sg0 sg0Var2 = new sg0(1, "TABLET");
        c = sg0Var2;
        sg0 sg0Var3 = new sg0(2, "TV");
        d = sg0Var3;
        sg0[] sg0VarArr = {sg0Var, sg0Var2, sg0Var3};
        e = sg0VarArr;
        EnumEntriesKt.enumEntries(sg0VarArr);
    }

    public sg0(int i, String str) {
    }

    public static sg0 valueOf(String str) {
        return (sg0) Enum.valueOf(sg0.class, str);
    }

    public static sg0[] values() {
        return (sg0[]) e.clone();
    }
}
