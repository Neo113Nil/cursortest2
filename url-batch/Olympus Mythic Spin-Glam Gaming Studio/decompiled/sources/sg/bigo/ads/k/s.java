package sg.bigo.ads.k;

import android.transition.ChangeBounds;
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
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.bv.b;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.k.a;

/* loaded from: classes8.dex */
public final class s extends n {
    private RoundedFrameLayout H;
    private LinearLayout I;
    private LinearLayout J;
    private RoundedFrameLayout K;
    private ImageView L;
    private TextView M;
    private TextView N;
    private TextView O;
    private IconListView P;
    private RoundedFrameLayout Q;
    private Button R;
    private boolean S;

    public s(@NonNull sg.bigo.ads.y.b bVar) {
        super(bVar);
        this.S = false;
    }

    static /* synthetic */ boolean b(s sVar) {
        sVar.S = true;
        return true;
    }

    @Override // sg.bigo.ads.k.n
    protected final void J() {
        super.J();
        if (this.t.h) {
            sg.bigo.ads.y.a.a(this.H, 18);
            sg.bigo.ads.y.a.a(this.r, this.H, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, this.t.i);
        } else {
            sg.bigo.ads.y.a.a(this.r, this.H, 8, sg.bigo.ads.ad.interstitial.r.H, 0);
        }
        IconListView iconListView = this.P;
        if (iconListView != null) {
            List<IconListView.a> items = iconListView.getItems();
            for (int i = 0; items != null && i < items.size(); i++) {
                IconListView.a aVar = items.get(i);
                sg.bigo.ads.y.a.a(aVar.d, 26);
                sg.bigo.ads.y.a.a(this.r, aVar.d, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, this.t.i);
                sg.bigo.ads.y.a.a(aVar.g, 26);
                sg.bigo.ads.y.a.a(this.r, aVar.g, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, this.t.i);
            }
        }
    }

    @Override // sg.bigo.ads.k.n, sg.bigo.ads.k.a
    protected final void a(double d) {
        super.a(d);
        if (this.S) {
            return;
        }
        if (d <= 3.0d) {
            Button button = this.R;
            if (button != null) {
                button.setBackgroundColor(857743652);
                return;
            }
            return;
        }
        Button button2 = this.R;
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
        this.I = (LinearLayout) roundedFrameLayout.findViewById(R.id.inter_media_ad_card_container);
        this.J = (LinearLayout) this.H.findViewById(R.id.inter_media_ad_card_top_layout);
        this.K = (RoundedFrameLayout) this.H.findViewById(R.id.inter_rounded_icon_layout);
        this.L = (ImageView) this.H.findViewById(R.id.inter_icon);
        this.M = (TextView) this.H.findViewById(R.id.inter_title);
        this.N = (TextView) this.H.findViewById(R.id.inter_company);
        this.O = (TextView) this.H.findViewById(R.id.inter_description);
        this.Q = (RoundedFrameLayout) this.H.findViewById(R.id.inter_btn_cta_layout);
        this.R = (Button) this.H.findViewById(R.id.inter_btn_cta);
        RoundedFrameLayout roundedFrameLayout2 = this.H;
        roundedFrameLayout2.a(roundedFrameLayout2.getCornerRadiusTopLeft(), this.Q.getCornerRadiusTopRight(), this.H.getCornerRadiusBottomLeft(), this.Q.getCornerRadiusBottomRight());
        IconListView iconListView = (IconListView) this.H.findViewById(R.id.inter_download_msg);
        this.P = iconListView;
        iconListView.a(this.v);
        this.P.setVisibility(8);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.w.getLayoutParams();
        marginLayoutParams2.topMargin = sg.bigo.ads.common.utils.f.a(this.w.getContext(), 0);
        this.w.setLayoutParams(marginLayoutParams2);
        this.p.b(this.M);
        this.p.b(this.O);
        this.p.b(this.w);
    }

    @Override // sg.bigo.ads.k.n
    protected final void b(int i) {
        super.b(i);
        final int a = sg.bigo.ads.common.utils.f.a(this.r.getContext(), 16);
        final int a2 = sg.bigo.ads.common.utils.f.a(this.r.getContext(), 40);
        final int a3 = sg.bigo.ads.common.utils.f.a(this.r.getContext(), 72);
        final boolean v = v();
        if (this.v != null) {
            final boolean[] zArr = {false, false};
            this.r.postDelayed(new Runnable() { // from class: sg.bigo.ads.k.s.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (sg.bigo.ads.d.c.a((sg.bigo.ads.d.c) ((sg.bigo.ads.ad.interstitial.u) s.this).c)) {
                        return;
                    }
                    s.b(s.this);
                    final a.C1909a u = s.this.u();
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(new ChangeBounds());
                    transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.an.h() { // from class: sg.bigo.ads.k.s.1.1
                        @Override // sg.bigo.ads.an.h, android.transition.Transition.TransitionListener
                        public final void onTransitionEnd(Transition transition) {
                            s.this.H();
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            zArr[0] = true;
                            RoundedFrameLayout roundedFrameLayout = s.this.Q;
                            AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                            boolean[] zArr2 = zArr;
                            sg.bigo.ads.r.e.a(roundedFrameLayout, zArr2[0], zArr2[1], v);
                            if (u.b) {
                                s sVar = s.this;
                                sVar.a(sVar.R, new b.a());
                            }
                        }

                        @Override // sg.bigo.ads.an.h, android.transition.Transition.TransitionListener
                        public final void onTransitionStart(final Transition transition) {
                            s.this.G();
                            sg.bigo.ads.bv.b.a(s.this.I, -1, new b.a() { // from class: sg.bigo.ads.k.s.1.1.1
                                @Override // sg.bigo.ads.bv.b.a
                                public final long a() {
                                    return transition.getDuration();
                                }
                            });
                            RoundedFrameLayout roundedFrameLayout = s.this.Q;
                            Button button = s.this.R;
                            int i2 = u.a;
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            sg.bigo.ads.r.e.a(roundedFrameLayout, button, i2, zArr, v, transition.getDuration());
                        }
                    });
                    TransitionManager.beginDelayedTransition(s.this.s, transitionSet);
                    s.this.H.setCornerRadius(a);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) s.this.J.getLayoutParams();
                    int i2 = a;
                    marginLayoutParams.setMargins(i2, i2, i2, 0);
                    s.this.J.setLayoutParams(marginLayoutParams);
                    s.this.K.setCornerRadius(a);
                    ViewGroup.LayoutParams layoutParams = s.this.L.getLayoutParams();
                    int i3 = a3;
                    layoutParams.width = i3;
                    layoutParams.height = i3;
                    s.this.L.setLayoutParams(layoutParams);
                    s.this.N.setVisibility(0);
                    s.this.N.setTextColor(u.a);
                    s.this.O.setTextSize(2, 12.0f);
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) s.this.O.getLayoutParams();
                    marginLayoutParams2.topMargin = sg.bigo.ads.common.utils.f.a(s.this.r.getContext(), 4);
                    s.this.O.setLayoutParams(marginLayoutParams2);
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) s.this.P.getLayoutParams();
                    marginLayoutParams3.topMargin = a;
                    s.this.P.setLayoutParams(marginLayoutParams3);
                    if (sg.bigo.ads.common.utils.l.a((Collection) s.this.P.getItems())) {
                        s.this.P.setVisibility(8);
                    } else {
                        s.this.P.setVisibility(0);
                    }
                    s.this.J.removeView(s.this.Q);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, a2);
                    int i4 = a;
                    layoutParams2.setMargins(i4, i4, i4, i4);
                    s.this.I.addView(s.this.Q, layoutParams2);
                    s sVar = s.this;
                    sVar.p.a(sVar.M);
                    s sVar2 = s.this;
                    sVar2.p.a(sVar2.O);
                    s.this.M.setTextColor(sg.bigo.ads.ad.interstitial.d.b);
                    s.this.O.setTextColor(sg.bigo.ads.ad.interstitial.d.b);
                }
            }, Math.max(1, i) * 1000);
        } else {
            RoundedFrameLayout roundedFrameLayout = this.Q;
            if (roundedFrameLayout == null || !v) {
                return;
            }
            sg.bigo.ads.ad.interstitial.c.e(roundedFrameLayout);
        }
    }
}
