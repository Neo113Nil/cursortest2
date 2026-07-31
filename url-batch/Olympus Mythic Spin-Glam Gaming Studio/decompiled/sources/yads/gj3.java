package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class gj3 {
    public static final gj3 b;
    public static final /* synthetic */ gj3[] c;

    static {
        gj3 gj3Var = new gj3(0, "FIT_XY");
        gj3 gj3Var2 = new gj3(1, "FIT_CENTER");
        b = gj3Var2;
        gj3[] gj3VarArr = {gj3Var, gj3Var2, new gj3(2, "CENTER_CROP")};
        c = gj3VarArr;
        EnumEntriesKt.enumEntries(gj3VarArr);
    }

    public gj3(int i, String str) {
    }

    public static gj3 valueOf(String str) {
        return (gj3) Enum.valueOf(gj3.class, str);
    }

    public static gj3[] values() {
        return (gj3[]) c.clone();
    }
}
