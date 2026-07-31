package yads;

import com.my.target.common.DisclaimerAlias;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class fz2 {
    public static final fz2 b;
    public static final fz2 c;
    public static final fz2 d;
    public static final /* synthetic */ fz2[] e;

    static {
        fz2 fz2Var = new fz2(0, "AD");
        b = fz2Var;
        fz2 fz2Var2 = new fz2(1, "DSP");
        c = fz2Var2;
        fz2 fz2Var3 = new fz2(2, DisclaimerAlias.UNDEFINED);
        d = fz2Var3;
        fz2[] fz2VarArr = {fz2Var, fz2Var2, fz2Var3};
        e = fz2VarArr;
        EnumEntriesKt.enumEntries(fz2VarArr);
    }

    public fz2(int i, String str) {
    }

    public static fz2 valueOf(String str) {
        return (fz2) Enum.valueOf(fz2.class, str);
    }

    public static fz2[] values() {
        return (fz2[]) e.clone();
    }
}
