package sg.bigo.ads.u;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.an.p;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.common.view.RoundedImageView;

/* loaded from: classes13.dex */
public class c extends a {
    protected View t;
    protected TextView u;
    protected View v;
    protected RoundedImageView w;

    protected c(@NonNull sg.bigo.ads.y.b bVar, @NonNull o oVar, @NonNull p pVar) {
        super(bVar, oVar, pVar);
    }

    @Override // sg.bigo.ads.u.a
    protected void a(int i, boolean z, boolean z2) {
        super.a(i, z, z2);
        sg.bigo.ads.y.a.a(this.w, 5);
        RoundedImageView roundedImageView = this.w;
        if (roundedImageView != null) {
            if (z) {
                sg.bigo.ads.y.a.a(this.k, roundedImageView, 10, this.f, i);
            } else {
                sg.bigo.ads.y.a.a(this.k, roundedImageView, 10, r.H, 0);
            }
        }
    }

    protected void a(@NonNull r rVar, @NonNull Rect rect) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.o.getLayoutParams();
        layoutParams.addRule(12, 0);
        layoutParams.addRule(3, this.v.getId());
        this.o.requestLayout();
        p b = b(rVar);
        int a = f.a(this.v.getContext(), 16);
        int width = rect.width();
        int height = rect.height();
        int i = a * 2;
        int i2 = width - i;
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.v.getLayoutParams();
        layoutParams2.addRule(2, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.n.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.w.getLayoutParams();
        p a2 = p.a(b.b, b.c, width, height - i);
        p a3 = p.a(b.b, b.c, i2, height);
        if (a2.a(a3)) {
            layoutParams2.width = a2.b;
            layoutParams2.height = a2.c + i;
            marginLayoutParams.topMargin = a;
            marginLayoutParams.bottomMargin = a;
            marginLayoutParams2.leftMargin = a;
            marginLayoutParams2.rightMargin = a;
        } else {
            layoutParams2.width = a3.b + i;
            layoutParams2.height = a3.c;
            marginLayoutParams.leftMargin = a;
            marginLayoutParams.rightMargin = a;
            marginLayoutParams2.topMargin = a;
            marginLayoutParams2.bottomMargin = a;
        }
        this.n.requestLayout();
        this.w.requestLayout();
        this.v.requestLayout();
    }

    @Override // sg.bigo.ads.u.a
    protected void d(@NonNull final r rVar) {
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            return;
        }
        this.t = viewGroup.findViewById(R.id.inter_click_guide_container);
        this.v = this.l.findViewById(R.id.inter_click_guide_image_layout);
        this.w = (RoundedImageView) this.l.findViewById(R.id.inter_click_guide_image_background);
        this.w.setCornerRadius(f.a(this.l.getContext(), 8));
        this.w.setBackgroundColor(654311423);
        v.a(this.v, new v.a() { // from class: sg.bigo.ads.u.c.1
            @Override // sg.bigo.ads.common.utils.v.a
            public final void a(View view, @NonNull Rect rect) {
                c.this.a(rVar, rect);
            }
        });
        l().a(this.u, null);
    }

    @Override // sg.bigo.ads.ad.interstitial.v
    public final boolean d() {
        sg.bigo.ads.cp.a aVar;
        sg.bigo.ads.y.b bVar = this.f;
        if (bVar == null || (aVar = (sg.bigo.ads.cp.a) bVar.f()) == null) {
            return true;
        }
        return aVar.aZ();
    }

    @Override // sg.bigo.ads.u.a
    protected final void e(@NonNull r rVar) {
        super.e(rVar);
        RoundedImageView roundedImageView = this.n;
        if (roundedImageView != null) {
            roundedImageView.setCornerRadius(f.a(roundedImageView.getContext(), 8));
        }
    }

    @Override // sg.bigo.ads.u.a
    protected void f(@NonNull r rVar) {
        super.f(rVar);
        l().a(this.o);
    }

    @Override // sg.bigo.ads.u.a
    public final boolean g() {
        return false;
    }

    @Override // sg.bigo.ads.u.a
    protected int h() {
        return R.layout.bigo_ad_view_click_guide_2;
    }

    @Override // sg.bigo.ads.u.a
    protected final void k() {
        super.k();
        l().a(this.m);
    }

    @NonNull
    protected sg.bigo.ads.ad.interstitial.b l() {
        return sg.bigo.ads.ad.interstitial.b.d;
    }
}
