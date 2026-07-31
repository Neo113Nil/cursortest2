package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class en0 {
    public static final en0 b;
    public static final en0 c;
    public static final /* synthetic */ en0[] d;

    static {
        en0 en0Var = new en0(0, "FRAME");
        b = en0Var;
        en0 en0Var2 = new en0(1, "TRACE");
        c = en0Var2;
        en0[] en0VarArr = {en0Var, en0Var2};
        d = en0VarArr;
        EnumEntriesKt.enumEntries(en0VarArr);
    }

    public en0(int i, String str) {
    }

    public static en0 valueOf(String str) {
        return (en0) Enum.valueOf(en0.class, str);
    }

    public static en0[] values() {
        return (en0[]) d.clone();
    }
}
