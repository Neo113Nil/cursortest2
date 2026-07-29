package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* renamed from: o.Pc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0394Pc extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ AbstractActivityC0446Rc i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0394Pc(AbstractActivityC0446Rc abstractActivityC0446Rc, int i) {
        super(0);
        this.h = i;
        this.i = abstractActivityC0446Rc;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        InterfaceExecutorC0291Lc interfaceExecutorC0291Lc;
        switch (this.h) {
            case 0:
                AbstractActivityC0446Rc abstractActivityC0446Rc = this.i;
                return new NP(abstractActivityC0446Rc.getApplication(), abstractActivityC0446Rc, abstractActivityC0446Rc.getIntent() != null ? abstractActivityC0446Rc.getIntent().getExtras() : null);
            case 1:
                this.i.reportFullyDrawn();
                return C0782bY.a;
            case 2:
                AbstractActivityC0446Rc abstractActivityC0446Rc2 = this.i;
                interfaceExecutorC0291Lc = abstractActivityC0446Rc2.reportFullyDrawnExecutor;
                return new C1389kp(interfaceExecutorC0291Lc, new C0394Pc(abstractActivityC0446Rc2, 1));
            default:
                AbstractActivityC0446Rc abstractActivityC0446Rc3 = this.i;
                YF yf = new YF(new RunnableC0109Ec(abstractActivityC0446Rc3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (AbstractC0048Bt.h(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0446Rc3.getLifecycle().a(new C0161Gc(yf, 0, abstractActivityC0446Rc3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC1866s2(abstractActivityC0446Rc3, 4, yf));
                    }
                }
                return yf;
        }
    }
}
