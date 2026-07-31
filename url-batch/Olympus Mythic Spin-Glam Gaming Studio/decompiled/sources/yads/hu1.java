package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class hu1 {
    public static final hu1 b;
    public static final hu1 c;
    public static final hu1 d;
    public static final /* synthetic */ hu1[] e;

    static {
        hu1 hu1Var = new hu1(0, "INITIALIZATION_NOT_STARTED");
        b = hu1Var;
        hu1 hu1Var2 = new hu1(1, "INITIALIZING");
        c = hu1Var2;
        hu1 hu1Var3 = new hu1(2, "INITIALIZED");
        d = hu1Var3;
        hu1[] hu1VarArr = {hu1Var, hu1Var2, hu1Var3};
        e = hu1VarArr;
        EnumEntriesKt.enumEntries(hu1VarArr);
    }

    public hu1(int i, String str) {
    }

    public static hu1 valueOf(String str) {
        return (hu1) Enum.valueOf(hu1.class, str);
    }

    public static hu1[] values() {
        return (hu1[]) e.clone();
    }
}
