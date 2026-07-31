package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class dd2 {
    public static final dd2 b;
    public static final dd2 c;
    public static final dd2 d;
    public static final /* synthetic */ dd2[] e;

    static {
        dd2 dd2Var = new dd2(0, "SCREEN_ON");
        b = dd2Var;
        dd2 dd2Var2 = new dd2(1, "SCREEN_OFF");
        c = dd2Var2;
        dd2 dd2Var3 = new dd2(2, "USER_PRESENT");
        d = dd2Var3;
        dd2[] dd2VarArr = {dd2Var, dd2Var2, dd2Var3};
        e = dd2VarArr;
        EnumEntriesKt.enumEntries(dd2VarArr);
    }

    public dd2(int i, String str) {
    }

    public static dd2 valueOf(String str) {
        return (dd2) Enum.valueOf(dd2.class, str);
    }

    public static dd2[] values() {
        return (dd2[]) e.clone();
    }
}
