package l;

import androidx.appcompat.widget.Toolbar;
import k.C0204o;

/* loaded from: classes.dex */
public final /* synthetic */ class W0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3380b;

    public /* synthetic */ W0(Toolbar toolbar, int i) {
        this.f3379a = i;
        this.f3380b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3379a) {
            case 0:
                Z0 z02 = this.f3380b.f1753L;
                C0204o c0204o = z02 == null ? null : z02.f3393b;
                if (c0204o != null) {
                    c0204o.collapseActionView();
                    break;
                }
                break;
            default:
                this.f3380b.n();
                break;
        }
    }
}
