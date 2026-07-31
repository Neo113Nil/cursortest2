package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f4 {
    public static final f4 b;
    public static final f4 c;
    public static final f4 d;
    public static final f4 e;
    public static final f4 f;
    public static final f4 g;
    public static final f4 h;
    public static final f4 i;
    public static final f4 j;
    public static final f4 k;
    public static final f4 l;
    public static final f4 m;
    public static final f4 n;
    public static final f4 o;
    public static final f4 p;
    public static final f4 q;
    public static final /* synthetic */ f4[] r;

    static {
        f4 f4Var = new f4(0, "REQUEST_SUCCEEDED_RESPONSE_NOT_FOUND");
        b = f4Var;
        f4 f4Var2 = new f4(1, "REQUEST_SUCCEEDED_RESPONSE_PARAMS_INVALID");
        c = f4Var2;
        f4 f4Var3 = new f4(2, "REQUEST_SUCCEEDED_RESPONSE_NO_CONTENT");
        d = f4Var3;
        f4 f4Var4 = new f4(3, "REQUEST_SUCCEEDED_RESPONSE_CODE_INVALID");
        e = f4Var4;
        f4 f4Var5 = new f4(4, "REQUEST_SUCCEEDED_SERVICE_UNAVAILABLE");
        f = f4Var5;
        f4 f4Var6 = new f4(5, "REQUEST_SUCCEEDED_NO_SUCH_AD_UNIT_ID_ERROR");
        g = f4Var6;
        f4 f4Var7 = new f4(6, "REQUEST_SUCCEEDED_INVALID_SDK_CONFIGURATION");
        h = f4Var7;
        f4 f4Var8 = new f4(7, "REQUEST_FAILED_INVALID_ANDROID_SDK_API");
        i = f4Var8;
        f4 f4Var9 = new f4(8, "REQUEST_FAILED_INVALID_REQUEST_URL");
        j = f4Var9;
        f4 f4Var10 = new f4(9, "REQUEST_FAILED_INVALID_AD_TYPE");
        k = f4Var10;
        f4 f4Var11 = new f4(10, "REQUEST_FAILED_NO_CONNECTION");
        l = f4Var11;
        f4 f4Var12 = new f4(11, "REQUEST_FAILED_TIMEOUT");
        m = f4Var12;
        f4 f4Var13 = new f4(12, "REQUEST_FAILED_AUTH_FAILURE");
        n = f4Var13;
        f4 f4Var14 = new f4(13, "REQUEST_FAILED_CLIENT_ERROR");
        o = f4Var14;
        f4 f4Var15 = new f4(14, "REQUEST_FAILED_PARSE_ERROR");
        p = f4Var15;
        f4 f4Var16 = new f4(15, "REQUEST_FAILED_UNKNOWN");
        q = f4Var16;
        f4[] f4VarArr = {f4Var, f4Var2, f4Var3, f4Var4, f4Var5, f4Var6, f4Var7, f4Var8, f4Var9, f4Var10, f4Var11, f4Var12, f4Var13, f4Var14, f4Var15, f4Var16};
        r = f4VarArr;
        EnumEntriesKt.enumEntries(f4VarArr);
    }

    public f4(int i2, String str) {
    }

    public static f4 valueOf(String str) {
        return (f4) Enum.valueOf(f4.class, str);
    }

    public static f4[] values() {
        return (f4[]) r.clone();
    }
}
