package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class hd3 {
    public static final hd3 b;
    public static final hd3 c;
    public static final hd3 d;
    public static final /* synthetic */ hd3[] e;

    static {
        hd3 hd3Var = new hd3(0, "MILLISECONDS");
        b = hd3Var;
        hd3 hd3Var2 = new hd3(1, "PERCENTS");
        c = hd3Var2;
        hd3 hd3Var3 = new hd3(2, "POSITION");
        d = hd3Var3;
        hd3[] hd3VarArr = {hd3Var, hd3Var2, hd3Var3};
        e = hd3VarArr;
        EnumEntriesKt.enumEntries(hd3VarArr);
    }

    public hd3(int i, String str) {
    }

    public static hd3 valueOf(String str) {
        return (hd3) Enum.valueOf(hd3.class, str);
    }

    public static hd3[] values() {
        return (hd3[]) e.clone();
    }
}
