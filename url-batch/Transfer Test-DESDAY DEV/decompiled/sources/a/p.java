package a;

import android.window.OnBackInvokedCallback;
import g.y;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1214b;

    public /* synthetic */ p(int i, Object obj) {
        this.f1213a = i;
        this.f1214b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1213a) {
            case 0:
                f1.a aVar = (f1.a) this.f1214b;
                g1.f.e(aVar, "$onBackInvoked");
                aVar.c();
                break;
            case 1:
                ((y) this.f1214b).C();
                break;
            default:
                ((Runnable) this.f1214b).run();
                break;
        }
    }
}
