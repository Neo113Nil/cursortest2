package g;

import K.T;
import K.c0;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f2247b;

    public /* synthetic */ n(y yVar, int i) {
        this.f2246a = i;
        this.f2247b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f2246a) {
            case 0:
                y yVar = this.f2247b;
                if ((yVar.f2300a0 & 1) != 0) {
                    yVar.u(0);
                }
                if ((yVar.f2300a0 & 4096) != 0) {
                    yVar.u(108);
                }
                yVar.f2299Z = false;
                yVar.f2300a0 = 0;
                break;
            default:
                y yVar2 = this.f2247b;
                yVar2.f2321w.showAtLocation(yVar2.f2320v, 55, 0, 0);
                c0 c0Var = yVar2.f2323y;
                if (c0Var != null) {
                    c0Var.b();
                }
                if (!(yVar2.f2275A && (viewGroup = yVar2.f2276B) != null && viewGroup.isLaidOut())) {
                    yVar2.f2320v.setAlpha(1.0f);
                    yVar2.f2320v.setVisibility(0);
                    break;
                } else {
                    yVar2.f2320v.setAlpha(RecyclerView.f1570A0);
                    c0 a2 = T.a(yVar2.f2320v);
                    a2.a(1.0f);
                    yVar2.f2323y = a2;
                    a2.d(new p(0, this));
                    break;
                }
        }
    }
}
