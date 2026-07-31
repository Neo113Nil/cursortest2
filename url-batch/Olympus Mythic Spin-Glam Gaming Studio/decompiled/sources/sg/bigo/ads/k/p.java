package sg.bigo.ads.k;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;

/* loaded from: classes9.dex */
public class p extends n {
    private View H;
    private TextView I;

    public p(@NonNull sg.bigo.ads.y.b bVar) {
        super(bVar);
    }

    static /* synthetic */ void b(p pVar) {
        View view = pVar.H;
        if (view == null || pVar.I == null) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        pVar.I.getLocationOnScreen(iArr2);
        ViewGroup.LayoutParams layoutParams = pVar.I.getLayoutParams();
        layoutParams.width = (iArr[0] - iArr2[0]) - sg.bigo.ads.common.utils.f.a(pVar.r.getContext(), 28);
        pVar.I.setLayoutParams(layoutParams);
    }

    @Override // sg.bigo.ads.k.n
    protected final sg.bigo.ads.r.d E() {
        sg.bigo.ads.r.d E = super.E();
        if (!L() || E != sg.bigo.ads.r.d.LTR) {
            return E;
        }
        sg.bigo.ads.an.p a = sg.bigo.ads.ad.interstitial.s.a(((sg.bigo.ads.ad.interstitial.u) this).c);
        return (!a.a() || a.b < a.c) ? E : sg.bigo.ads.r.d.TILE;
    }

    @Override // sg.bigo.ads.k.n
    protected final sg.bigo.ads.r.c F() {
        return E() == sg.bigo.ads.r.d.TILE ? sg.bigo.ads.r.c.FILL_MATCH_SELF : super.F();
    }

    protected boolean L() {
        return true;
    }

    @Override // sg.bigo.ads.k.n
    protected final void a(int i, boolean z, int i2, boolean z2) {
        if (E() == sg.bigo.ads.r.d.TILE) {
            z2 = false;
            i2 = i;
        }
        super.a(i, z, i2, z2);
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final void a(@NonNull View view) {
        View findViewById;
        if (this.d == null || (findViewById = view.findViewById(R.id.inter_media_ad_extra)) == null) {
            return;
        }
        this.d.a(findViewById, 0);
    }

    @Override // sg.bigo.ads.k.n
    protected void a(sg.bigo.ads.ad.interstitial.r rVar) {
        super.a(rVar);
        this.H = rVar != null ? rVar.q(R.id.inter_btn_close) : null;
        TextView textView = (TextView) this.r.findViewById(R.id.inter_title);
        this.I = textView;
        this.p.b(textView);
        this.p.b(this.w);
        if (C()) {
            ((n) this).z.setVisibility(8);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w.getLayoutParams();
            marginLayoutParams.topMargin = sg.bigo.ads.common.utils.f.a(this.w.getContext(), 0);
            this.w.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // sg.bigo.ads.k.n
    protected void b(int i) {
        super.b(i);
        final View findViewById = this.r.findViewById(R.id.inter_media_ad_desc);
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(4);
        if (i < 0) {
            return;
        }
        findViewById.postDelayed(new Runnable() { // from class: sg.bigo.ads.k.p.1
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.d.c.a((sg.bigo.ads.d.c) ((sg.bigo.ads.ad.interstitial.u) p.this).c)) {
                    return;
                }
                findViewById.setVisibility(0);
                p.b(p.this);
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.625f, 1, 0.0f);
                translateAnimation.setDuration(600L);
                findViewById.startAnimation(translateAnimation);
            }
        }, i * 1000);
    }

    @Override // sg.bigo.ads.k.n, sg.bigo.ads.k.a
    protected final void t() {
        super.t();
        if (E() == sg.bigo.ads.r.d.TILE) {
            if (this.A != null) {
                ((n) this).z.setType(1);
                LinearLayout linearLayout = (LinearLayout) this.r.findViewById(R.id.inter_media_container);
                if (linearLayout != null) {
                    Object tag = this.A.getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.e);
                    if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.b) {
                        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar = (sg.bigo.ads.ad.interstitial.multi_img.view.b) tag;
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bVar.k.getLayoutParams();
                        layoutParams.gravity = 17;
                        layoutParams.topMargin = 0;
                        layoutParams.leftMargin = 0;
                        layoutParams.rightMargin = 0;
                        layoutParams.bottomMargin = 0;
                        layoutParams.height = -1;
                        layoutParams.width = -1;
                        bVar.k.setLayoutParams(layoutParams);
                    }
                    ((n) this).y.removeView(this.A);
                    Context context = ((n) this).y.getContext();
                    int a = sg.bigo.ads.common.utils.f.a(context, 20);
                    int a2 = sg.bigo.ads.common.utils.f.a(context, 12);
                    final LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams2.leftMargin = a;
                    layoutParams2.rightMargin = a;
                    layoutParams2.bottomMargin = a2;
                    linearLayout.addView(this.A, 1, layoutParams2);
                    final LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((n) this).y.getLayoutParams();
                    sg.bigo.ads.common.utils.v.a(((n) this).y, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.k.p.2
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            int a3 = sg.bigo.ads.common.utils.f.a(((n) p.this).y.getContext(), 100);
                            int measuredHeight = ((n) p.this).y.getMeasuredHeight();
                            if (measuredHeight < a3) {
                                LinearLayout.LayoutParams layoutParams4 = layoutParams3;
                                layoutParams4.weight = 0.0f;
                                layoutParams4.height = a3;
                                ((n) p.this).y.setLayoutParams(layoutParams4);
                                int measuredHeight2 = p.this.A.getMeasuredHeight();
                                LinearLayout.LayoutParams layoutParams5 = layoutParams2;
                                layoutParams5.height = measuredHeight2 - (a3 - measuredHeight);
                                p.this.A.setLayoutParams(layoutParams5);
                            }
                        }
                    });
                }
            }
            K();
        }
    }
}
