package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class sr1 {
    public static final sr1 b;
    public static final /* synthetic */ sr1[] c;

    static {
        sr1 sr1Var = new sr1();
        b = sr1Var;
        sr1[] sr1VarArr = {sr1Var};
        c = sr1VarArr;
        EnumEntriesKt.enumEntries(sr1VarArr);
    }

    public static sr1 valueOf(String str) {
        return (sr1) Enum.valueOf(sr1.class, str);
    }

    public static sr1[] values() {
        return (sr1[]) c.clone();
    }
}
