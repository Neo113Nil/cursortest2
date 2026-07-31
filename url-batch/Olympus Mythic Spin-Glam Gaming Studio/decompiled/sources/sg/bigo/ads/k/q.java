package sg.bigo.ads.k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.bv.b;
import sg.bigo.ads.k.a;

/* loaded from: classes9.dex */
public final class q extends p {
    public q(@NonNull sg.bigo.ads.y.b bVar) {
        super(bVar);
    }

    @Override // sg.bigo.ads.k.p
    protected final boolean L() {
        return false;
    }

    @Override // sg.bigo.ads.k.p, sg.bigo.ads.k.n
    protected final void a(sg.bigo.ads.ad.interstitial.r rVar) {
        super.a(rVar);
        ((n) this).z.setVisibility(4);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w.getLayoutParams();
        marginLayoutParams.topMargin = sg.bigo.ads.common.utils.f.a(this.w.getContext(), 0);
        this.w.setLayoutParams(marginLayoutParams);
    }

    @Override // sg.bigo.ads.k.p, sg.bigo.ads.k.n
    protected final void b(int i) {
        super.b(i);
        if (B() == null) {
            return;
        }
        final View findViewById = this.r.findViewById(R.id.inter_btn_cta_layout);
        final Button button = (Button) this.r.findViewById(R.id.inter_btn_cta);
        if (button == null) {
            return;
        }
        button.postDelayed(new Runnable() { // from class: sg.bigo.ads.k.q.1
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.d.c.a((sg.bigo.ads.d.c) ((sg.bigo.ads.ad.interstitial.u) q.this).c)) {
                    return;
                }
                a.C1909a u = q.this.u();
                b.a aVar = new b.a() { // from class: sg.bigo.ads.k.q.1.1
                    @Override // sg.bigo.ads.bv.b.a
                    public final void b(int i2) {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        if (findViewById == null || !q.this.v()) {
                            return;
                        }
                        sg.bigo.ads.ad.interstitial.c.e(findViewById);
                    }
                };
                if (u.b) {
                    q.this.a(button, aVar);
                } else {
                    sg.bigo.ads.ad.interstitial.d.a(button, u.a, aVar);
                }
            }
        }, Math.max(1, i) * 1000);
    }
}
