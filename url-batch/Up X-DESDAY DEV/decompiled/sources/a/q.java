package a;

import android.window.OnBackInvokedCallback;
import g.LayoutInflaterFactory2C0110A;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1082b;

    public /* synthetic */ q(int i, Object obj) {
        this.f1081a = i;
        this.f1082b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1081a) {
            case 0:
                W0.a aVar = (W0.a) this.f1082b;
                X0.e.e(aVar, "$onBackInvoked");
                aVar.a();
                break;
            case 1:
                ((LayoutInflaterFactory2C0110A) this.f1082b).C();
                break;
            default:
                ((Runnable) this.f1082b).run();
                break;
        }
    }
}
