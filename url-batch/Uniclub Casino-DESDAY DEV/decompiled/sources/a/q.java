package a;

import android.window.OnBackInvokedCallback;
import g.LayoutInflaterFactory2C0122A;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1084b;

    public /* synthetic */ q(int i, Object obj) {
        this.f1083a = i;
        this.f1084b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1083a) {
            case 0:
                W0.a aVar = (W0.a) this.f1084b;
                X0.d.e(aVar, "$onBackInvoked");
                aVar.a();
                break;
            case 1:
                ((LayoutInflaterFactory2C0122A) this.f1084b).C();
                break;
            default:
                ((Runnable) this.f1084b).run();
                break;
        }
    }
}
