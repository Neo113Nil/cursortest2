package sg.bigo.ads.j;

import android.graphics.Rect;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.view.RoundedImageView;

/* loaded from: classes9.dex */
public class g extends a {
    protected View p;
    protected RoundedImageView q;
    protected TextView r;
    protected TextView s;
    protected Button t;

    public g(@NonNull sg.bigo.ads.y.b bVar, int i, @NonNull sg.bigo.ads.ai.o oVar, @Nullable sg.bigo.ads.n.c cVar) {
        super(bVar, i, oVar, cVar);
    }

    @Override // sg.bigo.ads.j.a
    protected void a(double d) {
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
        this.t = button;
        if (button != null) {
            float a = sg.bigo.ads.common.utils.f.a(this.l.getContext(), 8);
            this.t.setBackground(sg.bigo.ads.common.utils.e.a(a, a, a, a, (Rect) null, i));
            sg.bigo.ads.ad.interstitial.d.a(this.t, sg.bigo.ads.bv.b.a(i));
            sg.bigo.ads.ad.interstitial.b.a.a(this.t);
        }
    }

    @Override // sg.bigo.ads.j.a
    protected void a(int i, boolean z, boolean z2) {
        sg.bigo.ads.y.a.a(this.p, 5);
        if (z) {
            sg.bigo.ads.y.a.a(this.k, this.p, 4, this.f, i);
        } else {
            sg.bigo.ads.y.a.a(this.k, this.p, 4, sg.bigo.ads.ad.interstitial.r.H, 0);
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
    protected void a(final Runnable runnable) {
        final Runnable runnable2 = new Runnable() { // from class: sg.bigo.ads.j.g.1
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable3 = runnable;
                if (runnable3 != null) {
                    runnable3.run();
                }
                g.this.m();
            }
        };
        if (this.l == null) {
            runnable2.run();
        } else {
            sg.bigo.ads.common.utils.v.c(this.p, 0, 0);
            this.l.post(new Runnable() { // from class: sg.bigo.ads.j.g.2
                @Override // java.lang.Runnable
                public final void run() {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(new b.a() { // from class: sg.bigo.ads.j.g.2.1
                        @Override // sg.bigo.ads.common.utils.b.a
                        public final void a(TransitionValues transitionValues, TransitionValues transitionValues2) {
                            if (transitionValues.view == g.this.p) {
                                Rect rect = (Rect) transitionValues2.values.get("android:changeBounds:bounds");
                                transitionValues.values.put("android:changeBounds:bounds", new Rect(rect.centerX(), rect.centerY(), rect.centerX(), rect.centerY()));
                            }
                        }
                    });
                    transitionSet.setDuration(300L);
                    TransitionManager.beginDelayedTransition(g.this.l, transitionSet);
                    ViewGroup viewGroup = g.this.l;
                    b.d dVar = new b.d() { // from class: sg.bigo.ads.j.g.2.2
                        @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                        public final void onAnimationEnd(Animation animation) {
                            super.onAnimationEnd(animation);
                            runnable2.run();
                        }
                    };
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
                    alphaAnimation.setDuration(300L);
                    alphaAnimation.setFillAfter(true);
                    alphaAnimation.setAnimationListener(dVar);
                    viewGroup.startAnimation(alphaAnimation);
                    sg.bigo.ads.common.utils.v.c(g.this.p, -1, -2);
                }
            });
        }
    }

    protected final void b(Runnable runnable) {
        super.a(runnable);
    }

    @Override // sg.bigo.ads.j.a
    protected void d(sg.bigo.ads.ad.interstitial.r rVar) {
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            return;
        }
        this.p = viewGroup.findViewById(R.id.inter_end_page);
        l();
        this.r = (TextView) this.l.findViewById(R.id.inter_title);
        this.s = (TextView) this.l.findViewById(R.id.inter_description);
        this.q = (RoundedImageView) this.l.findViewById(R.id.inter_icon);
        sg.bigo.ads.ad.interstitial.b bVar = sg.bigo.ads.ad.interstitial.b.a;
        bVar.a(this.r, this.s);
        bVar.a(this.q);
        a(f(rVar));
    }

    @Override // sg.bigo.ads.ad.interstitial.v
    public final boolean f() {
        return true;
    }

    @Override // sg.bigo.ads.j.a
    protected int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_14_15;
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

    protected void l() {
        if (this.p != null) {
            float a = sg.bigo.ads.common.utils.f.a(this.l.getContext(), 16);
            this.p.setBackground(sg.bigo.ads.common.utils.e.a(a, a, a, a, (Rect) null, -1));
            sg.bigo.ads.ad.interstitial.b.a.b(this.p);
        }
    }

    protected void m() {
        if (this.t == null || !j()) {
            return;
        }
        sg.bigo.ads.ad.interstitial.c.e(this.t);
    }
}
