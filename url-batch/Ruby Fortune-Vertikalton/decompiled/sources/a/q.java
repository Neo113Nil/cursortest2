package a;

import android.window.OnBackInvokedCallback;
import g.LayoutInflaterFactory2C0109A;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1079b;

    public /* synthetic */ q(int i, Object obj) {
        this.f1078a = i;
        this.f1079b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1078a) {
            case 0:
                W0.a aVar = (W0.a) this.f1079b;
                X0.e.e(aVar, "$onBackInvoked");
                aVar.a();
                break;
            case 1:
                ((LayoutInflaterFactory2C0109A) this.f1079b).C();
                break;
            default:
                ((Runnable) this.f1079b).run();
                break;
        }
    }
}
