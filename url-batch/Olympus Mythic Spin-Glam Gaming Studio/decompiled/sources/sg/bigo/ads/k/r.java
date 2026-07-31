package sg.bigo.ads.k;

import android.graphics.Bitmap;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.bv.b;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.k.a;

/* loaded from: classes9.dex */
public final class r extends n {
    private RoundedFrameLayout H;
    private LinearLayout I;
    private RoundedFrameLayout J;
    private ImageView K;
    private TextView L;
    private TextView M;
    private ImageView N;
    private RoundedFrameLayout O;
    private Button P;
    private boolean Q;

    public r(@NonNull sg.bigo.ads.y.b bVar) {
        super(bVar);
        this.Q = false;
    }

    static /* synthetic */ boolean b(r rVar) {
        rVar.Q = true;
        return true;
    }

    @Override // sg.bigo.ads.k.n
    protected final void J() {
        ViewGroup viewGroup;
        RoundedFrameLayout roundedFrameLayout;
        sg.bigo.ads.core.adview.h hVar;
        int i;
        super.J();
        if (this.t.h) {
            sg.bigo.ads.y.a.a(this.H, 18);
            viewGroup = this.r;
            roundedFrameLayout = this.H;
            hVar = ((sg.bigo.ads.ad.interstitial.u) this).c;
            i = this.t.i;
        } else {
            viewGroup = this.r;
            roundedFrameLayout = this.H;
            hVar = sg.bigo.ads.ad.interstitial.r.H;
            i = 0;
        }
        sg.bigo.ads.y.a.a(viewGroup, roundedFrameLayout, 8, hVar, i);
    }

    @Override // sg.bigo.ads.k.n, sg.bigo.ads.k.a
    protected final void a(double d) {
        super.a(d);
        if (this.Q) {
            return;
        }
        if (d <= 3.0d) {
            Button button = this.P;
            if (button != null) {
                button.setBackgroundColor(857743652);
                return;
            }
            return;
        }
        Button button2 = this.P;
        if (button2 != null) {
            button2.setBackgroundColor(872415231);
        }
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
    protected final void a(sg.bigo.ads.ad.interstitial.r rVar) {
        Bitmap a;
        super.a(rVar);
        if (C()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((n) this).z.getLayoutParams();
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.height = sg.bigo.ads.common.utils.f.a(this.r.getContext(), 24);
            ((n) this).z.setLayoutParams(marginLayoutParams);
            ((n) this).z.setVisibility(4);
        }
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) this.r.findViewById(R.id.inter_media_ad_card_layout);
        this.H = roundedFrameLayout;
        this.I = (LinearLayout) roundedFrameLayout.findViewById(R.id.inter_media_ad_card_info_container);
        this.J = (RoundedFrameLayout) this.H.findViewById(R.id.inter_rounded_icon_layout);
        this.K = (ImageView) this.H.findViewById(R.id.inter_icon);
        this.L = (TextView) this.H.findViewById(R.id.inter_title);
        this.M = (TextView) this.H.findViewById(R.id.inter_description);
        this.O = (RoundedFrameLayout) this.r.findViewById(R.id.inter_btn_cta_layout);
        this.P = (Button) this.H.findViewById(R.id.inter_btn_cta);
        this.N = (ImageView) this.H.findViewById(R.id.inter_star);
        RoundedFrameLayout roundedFrameLayout2 = this.H;
        roundedFrameLayout2.a(roundedFrameLayout2.getCornerRadiusTopLeft(), this.H.getCornerRadiusTopRight(), this.O.getCornerRadiusBottomLeft(), this.O.getCornerRadiusBottomRight());
        ImageView imageView = this.N;
        if (imageView != null && (a = sg.bigo.ads.ad.interstitial.s.a(imageView.getContext(), ((sg.bigo.ads.ad.interstitial.u) this).c, this.v, sg.bigo.ads.ad.interstitial.g.BLACK)) != null) {
            this.N.setImageBitmap(a);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.w.getLayoutParams();
        marginLayoutParams2.topMargin = sg.bigo.ads.common.utils.f.a(this.w.getContext(), 0);
        this.w.setLayoutParams(marginLayoutParams2);
        this.p.b(this.L);
        this.p.b(this.M);
        this.p.b(this.w);
    }

    @Override // sg.bigo.ads.k.n
    protected final void b(int i) {
        super.b(i);
        final int a = sg.bigo.ads.common.utils.f.a(this.r.getContext(), 12);
        final int a2 = sg.bigo.ads.common.utils.f.a(this.r.getContext(), 16);
        final int a3 = sg.bigo.ads.common.utils.f.a(this.r.getContext(), 20);
        final int a4 = sg.bigo.ads.common.utils.f.a(this.r.getContext(), 72);
        int max = Math.max(1, i);
        final boolean[] zArr = {false, false};
        final boolean v = v();
        this.r.postDelayed(new Runnable() { // from class: sg.bigo.ads.k.r.1
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.d.c.a((sg.bigo.ads.d.c) ((sg.bigo.ads.ad.interstitial.u) r.this).c)) {
                    return;
                }
                r.b(r.this);
                final a.C1909a u = r.this.u();
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.addTransition(new ChangeBounds());
                transitionSet.addTransition(new Fade());
                transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.an.h() { // from class: sg.bigo.ads.k.r.1.1
                    @Override // sg.bigo.ads.an.h, android.transition.Transition.TransitionListener
                    public final void onTransitionEnd(Transition transition) {
                        r.this.H();
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        zArr[0] = true;
                        RoundedFrameLayout roundedFrameLayout = r.this.O;
                        AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                        boolean[] zArr2 = zArr;
                        sg.bigo.ads.r.e.a(roundedFrameLayout, zArr2[0], zArr2[1], v);
                        if (u.b) {
                            r rVar = r.this;
                            rVar.a(rVar.P, new b.a());
                        }
                    }

                    @Override // sg.bigo.ads.an.h, android.transition.Transition.TransitionListener
                    public final void onTransitionStart(final Transition transition) {
                        r.this.G();
                        sg.bigo.ads.bv.b.a(r.this.I, -1, new b.a() { // from class: sg.bigo.ads.k.r.1.1.1
                            @Override // sg.bigo.ads.bv.b.a
                            public final long a() {
                                return transition.getDuration();
                            }
                        });
                        RoundedFrameLayout roundedFrameLayout = r.this.O;
                        Button button = r.this.P;
                        int i2 = u.a;
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        sg.bigo.ads.r.e.a(roundedFrameLayout, button, i2, zArr, v, transition.getDuration());
                    }
                });
                TransitionManager.beginDelayedTransition(r.this.s, transitionSet);
                r.this.H.setCornerRadius(a);
                if (r.this.C()) {
                    ViewGroup.LayoutParams layoutParams = ((n) r.this).z.getLayoutParams();
                    layoutParams.height = a2;
                    ((n) r.this).z.setLayoutParams(layoutParams);
                }
                int childCount = r.this.I.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = r.this.I.getChildAt(i2);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    int i3 = a2;
                    layoutParams2.leftMargin = i3;
                    layoutParams2.rightMargin = i3;
                    if (i2 == 0) {
                        layoutParams2.topMargin = i3;
                    }
                    if (i2 == childCount - 1) {
                        layoutParams2.bottomMargin = i3;
                    }
                    if (childAt.getId() == R.id.inter_btn_cta_layout) {
                        layoutParams2.topMargin = a3;
                    }
                    childAt.setLayoutParams(layoutParams2);
                }
                r.this.J.setCornerRadius(a2);
                ViewGroup.LayoutParams layoutParams3 = r.this.K.getLayoutParams();
                int i4 = a4;
                layoutParams3.width = i4;
                layoutParams3.height = i4;
                r.this.K.setLayoutParams(layoutParams3);
                r rVar = r.this;
                rVar.p.a(rVar.L);
                r rVar2 = r.this;
                rVar2.p.a(rVar2.M);
                r.this.L.setTextColor(sg.bigo.ads.ad.interstitial.d.b);
                r.this.M.setTextColor(sg.bigo.ads.ad.interstitial.d.b);
                r.this.N.setVisibility(0);
            }
        }, max * 1000);
    }
}
