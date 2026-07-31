package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class cb3 {
    public static final cb3 b;
    public static final cb3 c;
    public static final /* synthetic */ cb3[] d;

    static {
        cb3 cb3Var = new cb3(0, "AD");
        b = cb3Var;
        cb3 cb3Var2 = new cb3(1, "PASSBACK");
        c = cb3Var2;
        cb3[] cb3VarArr = {cb3Var, cb3Var2};
        d = cb3VarArr;
        EnumEntriesKt.enumEntries(cb3VarArr);
    }

    public cb3(int i, String str) {
    }

    public static cb3 valueOf(String str) {
        return (cb3) Enum.valueOf(cb3.class, str);
    }

    public static cb3[] values() {
        return (cb3[]) d.clone();
    }
}
