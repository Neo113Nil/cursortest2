package yads;

import com.facebook.share.internal.ShareConstants;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class jc2 {
    public static final jc2 b;
    public static final jc2 c;
    public static final jc2 d;
    public static final /* synthetic */ jc2[] e;

    static {
        jc2 jc2Var = new jc2(0, "NONE");
        b = jc2Var;
        jc2 jc2Var2 = new jc2(1, ShareConstants.ACTION);
        c = jc2Var2;
        jc2 jc2Var3 = new jc2(2, "ERROR");
        d = jc2Var3;
        jc2[] jc2VarArr = {jc2Var, jc2Var2, jc2Var3};
        e = jc2VarArr;
        EnumEntriesKt.enumEntries(jc2VarArr);
    }

    public jc2(int i, String str) {
    }

    public static jc2 valueOf(String str) {
        return (jc2) Enum.valueOf(jc2.class, str);
    }

    public static jc2[] values() {
        return (jc2[]) e.clone();
    }
}
