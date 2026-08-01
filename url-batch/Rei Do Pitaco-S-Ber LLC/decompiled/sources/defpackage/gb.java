package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class gb implements dl {
    public final /* synthetic */ int f;
    public final /* synthetic */ b3 g;

    public /* synthetic */ gb(b3 b3Var, int i) {
        this.f = i;
        this.g = b3Var;
    }

    @Override // defpackage.dl
    public final Object a() {
        int i = this.f;
        int i2 = 0;
        b3 b3Var = this.g;
        switch (i) {
            case 0:
                b3Var.reportFullyDrawn();
                return tg.m;
            case 1:
                return new cl(b3Var.k, new gb(b3Var, i2));
            case 2:
                nf nfVar = new nf();
                b3Var.h().a().b(nfVar);
                return nfVar;
            default:
                pv pvVar = new pv(new fb(b3Var, i2));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (oo.b(Looper.myLooper(), Looper.getMainLooper())) {
                        b3Var.f.a(new hb(pvVar, b3Var));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new l3(b3Var, pvVar, 1));
                    }
                }
                return pvVar;
        }
    }
}
