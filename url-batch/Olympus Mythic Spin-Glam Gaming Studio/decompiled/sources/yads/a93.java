package yads;

import com.pubmatic.sdk.omsdk.POBOMSDKLogConstants;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a93 {
    public static final a93 b;
    public static final a93 c;
    public static final a93 d;
    public static final a93 e;
    public static final a93 f;
    public static final a93 g;
    public static final a93 h;
    public static final a93 i;
    public static final a93 j;
    public static final a93 k;
    public static final /* synthetic */ a93[] l;

    static {
        a93 a93Var = new a93(0, "ADTUNE_CLICK");
        b = a93Var;
        a93 a93Var2 = new a93(1, "CLICK");
        c = a93Var2;
        a93 a93Var3 = new a93(2, "FALSE_CLICK");
        d = a93Var3;
        a93 a93Var4 = new a93(3, POBOMSDKLogConstants.MSG_OMSDK_IMPRESSION_EVENT);
        e = a93Var4;
        a93 a93Var5 = new a93(4, "DSP_IMPRESSION");
        f = a93Var5;
        a93 a93Var6 = new a93(5, "MEDIATION_IMPRESSION");
        g = a93Var6;
        a93 a93Var7 = new a93(6, "MEDIATION_RESPONSE");
        h = a93Var7;
        a93 a93Var8 = new a93(7, "RENDER");
        i = a93Var8;
        a93 a93Var9 = new a93(8, "SERVER_SIDE_REWARD");
        j = a93Var9;
        a93 a93Var10 = new a93(9, "UNKNOWN");
        k = a93Var10;
        a93[] a93VarArr = {a93Var, a93Var2, a93Var3, a93Var4, a93Var5, a93Var6, a93Var7, a93Var8, a93Var9, a93Var10};
        l = a93VarArr;
        EnumEntriesKt.enumEntries(a93VarArr);
    }

    public a93(int i2, String str) {
    }

    public static a93 valueOf(String str) {
        return (a93) Enum.valueOf(a93.class, str);
    }

    public static a93[] values() {
        return (a93[]) l.clone();
    }
}
