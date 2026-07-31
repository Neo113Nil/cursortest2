package yads;

import android.util.Base64;
import com.android.volley.toolbox.HttpClientStack;
import com.ironsource.C4701ic;
import java.util.Map;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public abstract class xo2 {
    public static final xu1 a;

    static {
        xu1 xu1Var;
        xu1 xu1Var2 = xu1.b;
        if (xu1Var2 == null) {
            synchronized (xu1.c) {
                xu1Var = xu1.b;
                if (xu1Var == null) {
                    xu1Var = new xu1();
                    xu1.b = xu1Var;
                }
            }
            xu1Var2 = xu1Var;
        }
        a = xu1Var2;
    }

    public static final void a(long j, ro2 ro2Var, u82 u82Var) {
        String str;
        String str2;
        byte[] b = ro2Var.b();
        String str3 = null;
        if (b != null) {
            try {
                str = StringsKt.decodeToString(b);
            } catch (Exception unused) {
                str = "UNKNOWN_CONTENT";
            }
            str2 = str;
        } else {
            str2 = null;
        }
        byte[] bArr = u82Var.b;
        if (bArr != null) {
            if (ro2Var instanceof k31) {
                str3 = "IMAGE_CONTENT";
            } else {
                try {
                    str3 = StringsKt.decodeToString(Base64.decode(bArr, 0));
                } catch (IllegalArgumentException unused2) {
                    str3 = StringsKt.decodeToString(bArr);
                } catch (Exception unused3) {
                    str3 = "UNKNOWN_CONTENT";
                }
            }
        }
        xu1 xu1Var = a;
        int i = ro2Var.c;
        String str4 = i == 0 ? C4701ic.a : i == 1 ? "POST" : i == 2 ? com.safedk.android.a.g.f : i == 3 ? "DELETE" : i == 4 ? "HEAD" : i == 5 ? "OPTIONS" : i == 6 ? "TRACE" : i == 7 ? HttpClientStack.HttpPatch.METHOD_NAME : "UNKNOWN";
        String g = ro2Var.g();
        Map d = ro2Var.d();
        Integer valueOf = Integer.valueOf(u82Var.a);
        Map map = u82Var.c;
        xu1Var.getClass();
        if (su1.a.a()) {
            vu1 vu1Var = new vu1(new bv1(j, str4, g, d, str2), new fv1(System.currentTimeMillis(), valueOf, map, str3));
            synchronized (xu1.c) {
                try {
                    if (xu1Var.a.size() > 100) {
                        xu1Var.a.remove(0);
                    }
                    xu1Var.a.add(vu1Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
