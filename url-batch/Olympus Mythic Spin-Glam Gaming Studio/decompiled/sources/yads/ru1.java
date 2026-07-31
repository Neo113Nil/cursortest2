package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ru1 {
    public static final ru1 b;
    public static final ru1 c;
    public static final ru1 d;
    public static final /* synthetic */ ru1[] e;

    static {
        ru1 ru1Var = new ru1(0, "VERBOSE");
        ru1 ru1Var2 = new ru1(1, "DEBUG");
        ru1 ru1Var3 = new ru1(2, "INFO");
        b = ru1Var3;
        ru1 ru1Var4 = new ru1(3, "WARNING");
        c = ru1Var4;
        ru1 ru1Var5 = new ru1(4, "ERROR");
        d = ru1Var5;
        ru1[] ru1VarArr = {ru1Var, ru1Var2, ru1Var3, ru1Var4, ru1Var5};
        e = ru1VarArr;
        EnumEntriesKt.enumEntries(ru1VarArr);
    }

    public ru1(int i, String str) {
    }

    public static ru1 valueOf(String str) {
        return (ru1) Enum.valueOf(ru1.class, str);
    }

    public static ru1[] values() {
        return (ru1[]) e.clone();
    }
}
