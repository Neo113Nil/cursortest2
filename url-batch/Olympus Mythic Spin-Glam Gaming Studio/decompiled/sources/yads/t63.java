package yads;

import com.pubmatic.sdk.omsdk.POBOMSDKLogConstants;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class t63 {
    public static final t63 b;
    public static final t63 c;
    public static final t63 d;
    public static final t63 e;
    public static final t63 f;
    public static final /* synthetic */ t63[] g;

    static {
        t63 t63Var = new t63(0, "TIME");
        b = t63Var;
        t63 t63Var2 = new t63(1, "PERCENTAGE");
        c = t63Var2;
        t63 t63Var3 = new t63(2, POBOMSDKLogConstants.MSG_OMSDK_START_EVENT);
        d = t63Var3;
        t63 t63Var4 = new t63(3, "END");
        e = t63Var4;
        t63 t63Var5 = new t63(4, "POSITION");
        f = t63Var5;
        t63[] t63VarArr = {t63Var, t63Var2, t63Var3, t63Var4, t63Var5};
        g = t63VarArr;
        EnumEntriesKt.enumEntries(t63VarArr);
    }

    public t63(int i, String str) {
    }

    public static t63 valueOf(String str) {
        return (t63) Enum.valueOf(t63.class, str);
    }

    public static t63[] values() {
        return (t63[]) g.clone();
    }
}
