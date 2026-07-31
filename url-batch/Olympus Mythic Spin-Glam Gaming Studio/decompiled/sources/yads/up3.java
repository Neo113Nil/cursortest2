package yads;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes6.dex */
public abstract class up3 {
    public static final ep2 a(Context context, int i) {
        ps2 ps2Var = new ps2();
        context.getApplicationContext();
        Context applicationContext = context.getApplicationContext();
        SSLSocketFactory a = ps2Var.a(applicationContext);
        y82.a(applicationContext);
        ep2 ep2Var = new ep2(new o92(), new po(new g11(new eu1(a))), i);
        ep2Var.a();
        return ep2Var;
    }
}
