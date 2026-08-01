package l;

import androidx.appcompat.widget.Toolbar;
import k.C0160o;

/* loaded from: classes.dex */
public final /* synthetic */ class V0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2941a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2942b;

    public /* synthetic */ V0(Toolbar toolbar, int i) {
        this.f2941a = i;
        this.f2942b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2941a) {
            case 0:
                Y0 y02 = this.f2942b.f1220L;
                C0160o c0160o = y02 == null ? null : y02.f2945b;
                if (c0160o != null) {
                    c0160o.collapseActionView();
                    break;
                }
                break;
            default:
                this.f2942b.n();
                break;
        }
    }
}
