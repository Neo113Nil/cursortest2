package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class ej3 {
    public static final ej3 b;
    public static final ej3 c;
    public static final /* synthetic */ ej3[] d;

    static {
        ej3 ej3Var = new ej3(0, "LEFT_TOP");
        b = ej3Var;
        ej3 ej3Var2 = new ej3(1, "CENTER");
        c = ej3Var2;
        ej3[] ej3VarArr = {ej3Var, ej3Var2};
        d = ej3VarArr;
        EnumEntriesKt.enumEntries(ej3VarArr);
    }

    public ej3(int i, String str) {
    }

    public static ej3 valueOf(String str) {
        return (ej3) Enum.valueOf(ej3.class, str);
    }

    public static ej3[] values() {
        return (ej3[]) d.clone();
    }
}
