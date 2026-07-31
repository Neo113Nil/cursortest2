package yads;

import com.my.target.common.DisclaimerAlias;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class hb2 {
    public static final hb2 c;
    public static final hb2 d;
    public static final hb2 e;
    public static final /* synthetic */ hb2[] f;
    public final int b;

    static {
        hb2 hb2Var = new hb2(0, 2, "LANDSCAPE");
        c = hb2Var;
        hb2 hb2Var2 = new hb2(1, 1, "PORTRAIT");
        d = hb2Var2;
        hb2 hb2Var3 = new hb2(2, 0, DisclaimerAlias.UNDEFINED);
        e = hb2Var3;
        hb2[] hb2VarArr = {hb2Var, hb2Var2, hb2Var3};
        f = hb2VarArr;
        EnumEntriesKt.enumEntries(hb2VarArr);
    }

    public hb2(int i, int i2, String str) {
        this.b = i2;
    }

    public static hb2 valueOf(String str) {
        return (hb2) Enum.valueOf(hb2.class, str);
    }

    public static hb2[] values() {
        return (hb2[]) f.clone();
    }
}
