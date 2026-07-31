package yads;

import android.content.Context;
import android.util.Log;
import java.io.File;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes15.dex */
public abstract class fp2 {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (r2 != 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ep2 a(Context context, int i) {
        long j;
        vw2 vw2Var;
        qv1 qv1Var = jl2.a;
        boolean z = lm3.a;
        boolean z2 = ob1.a;
        lm3.a = Log.isLoggable("Yandex Mobile Ads", 2);
        lm3.a = false;
        ps2 ps2Var = new ps2();
        context.getApplicationContext();
        Context applicationContext = context.getApplicationContext();
        SSLSocketFactory a = ps2Var.a(applicationContext);
        y82.a(applicationContext);
        po poVar = new po(new g11(new eu1(a)));
        File a2 = eh0.a(context, "mobileads-volley-cache");
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a3 = vw2Var2.a(context);
        if (a3 != null) {
            j = a3.d;
        }
        j = 52428800;
        ep2 ep2Var = new ep2(new dh0(a2, (int) xs1.a(context, 10485760L, j)), poVar, i);
        ep2Var.a(new to2());
        return ep2Var;
    }
}
