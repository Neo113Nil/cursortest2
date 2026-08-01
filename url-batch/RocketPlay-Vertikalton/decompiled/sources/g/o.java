package g;

import K.C0010c0;
import K.T;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f2687b;

    public /* synthetic */ o(z zVar, int i) {
        this.f2686a = i;
        this.f2687b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f2686a) {
            case 0:
                z zVar = this.f2687b;
                if ((zVar.f2739Z & 1) != 0) {
                    zVar.u(0);
                }
                if ((zVar.f2739Z & 4096) != 0) {
                    zVar.u(108);
                }
                zVar.f2738Y = false;
                zVar.f2739Z = 0;
                break;
            default:
                z zVar2 = this.f2687b;
                zVar2.f2760w.showAtLocation(zVar2.f2759v, 55, 0, 0);
                C0010c0 c0010c0 = zVar2.f2762y;
                if (c0010c0 != null) {
                    c0010c0.b();
                }
                if (!(zVar2.f2763z && (viewGroup = zVar2.f2715A) != null && viewGroup.isLaidOut())) {
                    zVar2.f2759v.setAlpha(1.0f);
                    zVar2.f2759v.setVisibility(0);
                    break;
                } else {
                    zVar2.f2759v.setAlpha(RecyclerView.f1949A0);
                    C0010c0 a2 = T.a(zVar2.f2759v);
                    a2.a(1.0f);
                    zVar2.f2762y = a2;
                    a2.d(new q(0, this));
                    break;
                }
        }
    }
}
