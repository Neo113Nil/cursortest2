package l;

import androidx.appcompat.widget.Toolbar;
import k.C0170o;

/* loaded from: classes.dex */
public final /* synthetic */ class V0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2945b;

    public /* synthetic */ V0(Toolbar toolbar, int i) {
        this.f2944a = i;
        this.f2945b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2944a) {
            case 0:
                Y0 y02 = this.f2945b.f1219L;
                C0170o c0170o = y02 == null ? null : y02.f2948b;
                if (c0170o != null) {
                    c0170o.collapseActionView();
                    break;
                }
                break;
            default:
                this.f2945b.n();
                break;
        }
    }
}
