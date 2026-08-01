package a;

import android.window.OnBackInvokedCallback;
import g.z;
import h1.InterfaceC0173a;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1608b;

    public /* synthetic */ q(int i, Object obj) {
        this.f1607a = i;
        this.f1608b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1607a) {
            case 0:
                InterfaceC0173a interfaceC0173a = (InterfaceC0173a) this.f1608b;
                i1.f.e(interfaceC0173a, "$onBackInvoked");
                interfaceC0173a.c();
                break;
            case 1:
                ((z) this.f1608b).C();
                break;
            default:
                ((Runnable) this.f1608b).run();
                break;
        }
    }
}
