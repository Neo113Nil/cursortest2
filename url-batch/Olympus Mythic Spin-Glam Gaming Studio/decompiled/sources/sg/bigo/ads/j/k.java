package sg.bigo.ads.j;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.common.view.RoundedImageView;

/* loaded from: classes5.dex */
public class k extends a {
    protected View p;
    protected RoundedImageView q;
    protected TextView r;
    protected View s;
    protected RoundedImageView t;
    protected RoundedImageView u;
    protected Button v;

    public k(@NonNull sg.bigo.ads.y.b bVar, int i, @NonNull sg.bigo.ads.ai.o oVar, @Nullable sg.bigo.ads.n.c cVar) {
        super(bVar, i, oVar, cVar);
    }

    @Override // sg.bigo.ads.j.a
    protected final void a(double d) {
        if (d <= 3.0d) {
            TextView textView = this.m;
            if (textView != null) {
                textView.setTextColor(sg.bigo.ads.bv.b.a(sg.bigo.ads.ad.interstitial.d.b, 0.6f));
                return;
            }
            return;
        }
        TextView textView2 = this.m;
        if (textView2 != null) {
            textView2.setTextColor(sg.bigo.ads.bv.b.a(sg.bigo.ads.ad.interstitial.d.a, 0.6f));
        }
    }

    protected void a(int i) {
        Button button = (Button) this.l.findViewById(R.id.inter_btn_cta);
        this.v = button;
        if (button != null) {
            float a = sg.bigo.ads.common.utils.f.a(this.l.getContext(), 8);
            this.v.setBackground(sg.bigo.ads.common.utils.e.a(a, a, a, a, (Rect) null, i));
            sg.bigo.ads.ad.interstitial.d.a(this.v, sg.bigo.ads.bv.b.a(i));
            l().a(this.v);
        }
    }

    @Override // sg.bigo.ads.j.a
    protected void a(int i, boolean z, boolean z2) {
        sg.bigo.ads.y.a.a(this.t, 5);
        sg.bigo.ads.y.a.a(this.u, 5);
        if (z) {
            sg.bigo.ads.y.a.a(this.k, this.t, 4, this.f, i);
            sg.bigo.ads.y.a.a(this.k, this.u, 4, this.f, i);
        } else {
            ViewGroup viewGroup = this.k;
            RoundedImageView roundedImageView = this.t;
            sg.bigo.ads.core.adview.h hVar = sg.bigo.ads.ad.interstitial.r.H;
            sg.bigo.ads.y.a.a(viewGroup, roundedImageView, 4, hVar, 0);
            sg.bigo.ads.y.a.a(this.k, this.u, 4, hVar, 0);
        }
        sg.bigo.ads.y.a.a(this.l, 9);
        if (z2) {
            sg.bigo.ads.y.a.a(this.k, this.l, 4, this.f, i);
        } else {
            sg.bigo.ads.y.a.a(this.k, this.l, 4, sg.bigo.ads.ad.interstitial.r.H, 0);
        }
    }

    @Override // sg.bigo.ads.j.a
    protected final void a(View view) {
        View findViewById;
        if (view == null || this.h == null || (findViewById = view.findViewById(R.id.inter_ad_tag_layout)) == null) {
            return;
        }
        this.h.a(findViewById, 0);
    }

    @Override // sg.bigo.ads.j.a
    protected final void a(final Runnable runnable) {
        super.a(new Runnable() { // from class: sg.bigo.ads.j.k.2
            @Override // java.lang.Runnable
            public final void run() {
                k.this.m();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }

    protected void a(sg.bigo.ads.ad.interstitial.r rVar, @NonNull Rect rect) {
        sg.bigo.ads.an.p b = b(rVar);
        int a = sg.bigo.ads.common.utils.f.a(this.s.getContext(), 16);
        int width = rect.width();
        int height = rect.height();
        int i = a * 2;
        int i2 = width - i;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.t.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.u.getLayoutParams();
        sg.bigo.ads.an.p a2 = sg.bigo.ads.an.p.a(b.b, b.c, width, height - i);
        sg.bigo.ads.an.p a3 = sg.bigo.ads.an.p.a(b.b, b.c, i2, height);
        if (a2.a(a3)) {
            layoutParams.width = a2.b;
            layoutParams.height = a2.c + i;
            marginLayoutParams.topMargin = a;
            marginLayoutParams.bottomMargin = a;
            marginLayoutParams2.leftMargin = a;
            marginLayoutParams2.rightMargin = a;
        } else {
            layoutParams.width = a3.b + i;
            layoutParams.height = a3.c;
            marginLayoutParams.leftMargin = a;
            marginLayoutParams.rightMargin = a;
            marginLayoutParams2.topMargin = a;
            marginLayoutParams2.bottomMargin = a;
        }
        this.s.requestLayout();
        this.t.requestLayout();
        this.u.requestLayout();
    }

    @Override // sg.bigo.ads.j.a
    protected void d(final sg.bigo.ads.ad.interstitial.r rVar) {
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            return;
        }
        this.p = viewGroup.findViewById(R.id.inter_end_page);
        this.q = (RoundedImageView) this.l.findViewById(R.id.inter_icon);
        this.r = (TextView) this.l.findViewById(R.id.inter_title);
        l().a(this.q);
        l().a(this.r, null);
        this.s = this.l.findViewById(R.id.inter_end_page_image_layout);
        this.t = (RoundedImageView) this.l.findViewById(R.id.inter_end_page_image);
        this.u = (RoundedImageView) this.l.findViewById(R.id.inter_end_page_image_background);
        float a = sg.bigo.ads.common.utils.f.a(this.t.getContext(), 8);
        this.t.setCornerRadius(a);
        this.u.setCornerRadius(a);
        this.u.setBackgroundColor(654311423);
        sg.bigo.ads.common.utils.v.a(this.s, new v.a() { // from class: sg.bigo.ads.j.k.1
            @Override // sg.bigo.ads.common.utils.v.a
            public final void a(View view, @NonNull Rect rect) {
                k.this.a(rVar, rect);
            }
        });
        a(f(rVar));
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

    @Override // sg.bigo.ads.ad.interstitial.v
    public final boolean f() {
        return true;
    }

    @Override // sg.bigo.ads.j.a
    protected int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_18;
    }

    @Override // sg.bigo.ads.j.a
    protected final void i() {
        String j = ((sg.bigo.ads.cp.a) this.f.f()).j();
        TextView textView = (TextView) this.l.findViewById(R.id.inter_advertiser);
        if (TextUtils.isEmpty(j)) {
            textView.setVisibility(8);
        } else {
            textView.setText(j);
        }
    }

    @NonNull
    protected sg.bigo.ads.ad.interstitial.b l() {
        return sg.bigo.ads.ad.interstitial.b.d;
    }

    protected final void m() {
        if (this.v == null || !j()) {
            return;
        }
        sg.bigo.ads.ad.interstitial.c.e(this.v);
    }
}
