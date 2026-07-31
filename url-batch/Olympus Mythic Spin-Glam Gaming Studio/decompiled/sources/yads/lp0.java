package yads;

import android.os.Handler;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class lp0 implements Runnable {
    public static final /* synthetic */ KProperty[] f = {ra.a(lp0.class, "exposureUpdateListenerReference", "getExposureUpdateListenerReference()Lcom/monetization/ads/base/webview/mraid/exposure/OnExposureUpdateListener;", 0), ra.a(lp0.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};
    public final Handler b;
    public final jp0 c;
    public final qm2 d;
    public final qm2 e;

    public lp0(vb2 vb2Var, lw1 lw1Var, Handler handler, jp0 jp0Var) {
        this.b = handler;
        this.c = jp0Var;
        this.d = new qm2(lw1Var);
        this.e = new qm2(vb2Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        qm2 qm2Var = this.e;
        KProperty[] kPropertyArr = f;
        KProperty kProperty = kPropertyArr[1];
        View view = (View) qm2Var.a.get();
        qm2 qm2Var2 = this.d;
        KProperty kProperty2 = kPropertyArr[0];
        ya2 ya2Var = (ya2) qm2Var2.a.get();
        if (view == null || ya2Var == null) {
            return;
        }
        ip0 a = this.c.a(view);
        lw1 lw1Var = (lw1) ya2Var;
        if (!Intrinsics.areEqual(a, lw1Var.s)) {
            lw1Var.s = a;
            lw1Var.b.a(new kp0(a.a, a.b));
        }
        this.b.postDelayed(this, 200L);
    }
}
