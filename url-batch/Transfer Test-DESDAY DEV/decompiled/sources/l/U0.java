package l;

import androidx.appcompat.widget.Toolbar;
import k.C0166o;

/* loaded from: classes.dex */
public final /* synthetic */ class U0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2948a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2949b;

    public /* synthetic */ U0(Toolbar toolbar, int i) {
        this.f2948a = i;
        this.f2949b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2948a) {
            case 0:
                X0 x02 = this.f2949b.f1367L;
                C0166o c0166o = x02 == null ? null : x02.f2962b;
                if (c0166o != null) {
                    c0166o.collapseActionView();
                    break;
                }
                break;
            default:
                this.f2949b.n();
                break;
        }
    }
}
