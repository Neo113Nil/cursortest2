package o;

import android.window.OnBackInvokedCallback;

/* renamed from: o.b5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0753b5 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0753b5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                ((LayoutInflaterFactory2C1213i5) this.b).D();
                break;
            case 1:
                ((AbstractActivityC0560Vm) this.b).onBackPressed();
                break;
            case 2:
                InterfaceC1455lp interfaceC1455lp = (InterfaceC1455lp) this.b;
                AbstractC0048Bt.n(interfaceC1455lp, "$onBackInvoked");
                interfaceC1455lp.invoke();
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
