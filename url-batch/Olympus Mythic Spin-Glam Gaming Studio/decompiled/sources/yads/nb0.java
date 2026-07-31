package yads;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class nb0 {
    public static final mb0 b;
    public static final nb0 c;
    public static final nb0 d;
    public static final /* synthetic */ nb0[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        nb0 nb0Var = new nb0(0, "DEFAULT");
        c = nb0Var;
        nb0 nb0Var2 = new nb0(1, "RESULT");
        d = nb0Var2;
        nb0[] nb0VarArr = {nb0Var, nb0Var2};
        e = nb0VarArr;
        f = EnumEntriesKt.enumEntries(nb0VarArr);
        b = new mb0();
    }

    public nb0(int i, String str) {
    }

    public static nb0 valueOf(String str) {
        return (nb0) Enum.valueOf(nb0.class, str);
    }

    public static nb0[] values() {
        return (nb0[]) e.clone();
    }
}
