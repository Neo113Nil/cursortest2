package l;

import androidx.appcompat.widget.Toolbar;
import k.C0160o;

/* loaded from: classes.dex */
public final /* synthetic */ class V0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2920b;

    public /* synthetic */ V0(Toolbar toolbar, int i) {
        this.f2919a = i;
        this.f2920b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2919a) {
            case 0:
                Y0 y02 = this.f2920b.f1217L;
                C0160o c0160o = y02 == null ? null : y02.f2923b;
                if (c0160o != null) {
                    c0160o.collapseActionView();
                    break;
                }
                break;
            default:
                this.f2920b.n();
                break;
        }
    }
}
