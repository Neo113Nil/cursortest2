package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;

/* loaded from: classes4.dex */
public final class rf {
    public static final String c = "Incorrect AppMetrica Integration. The minimum supported version of AppMetrica SDK is 8.1.0 (inclusive) and the maximum supported version is 9.0.0 (exclusive). Please, check your AppMetrica integration.";
    public static final String d = "Incorrect AppMetrica Version. The minimum supported version of AppMetrica SDK is 8.1.0 (inclusive) and the maximum supported version is 9.0.0 (exclusive). And the current version of AppMetrica SDK is ";
    public final ae3 a;
    public final bg b;

    public rf(Context context) {
        ae3 ae3Var = new ae3();
        bg a = gf.a(context);
        this.a = ae3Var;
        this.b = a;
    }

    public final void a() {
        String str;
        bg bgVar = this.b;
        bgVar.getClass();
        try {
            bgVar.b.getClass();
            str = AppMetrica.getLibraryVersion();
        } catch (Throwable unused) {
            boolean z = ob1.a;
            str = null;
        }
        if (str == null) {
            throw new ja1(c);
        }
        this.a.getClass();
        zd3 a = ae3.a("8.1.0");
        if (a == null) {
            return;
        }
        this.a.getClass();
        zd3 a2 = ae3.a("9.0.0");
        if (a2 == null) {
            return;
        }
        this.a.getClass();
        zd3 a3 = ae3.a(str);
        if (a3 == null || a3.compareTo(a) < 0 || a3.compareTo(a2) >= 0) {
            throw new ja1(a(str));
        }
    }

    public static String a(String str) {
        return d + str;
    }
}
