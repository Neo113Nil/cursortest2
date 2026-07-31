package sg.bigo.ads.j;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.k;
import sg.bigo.ads.ad.interstitial.u;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.bv.b;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.RoundedImageView;

/* loaded from: classes14.dex */
public class ab extends a {
    protected int p;
    protected ViewGroup q;
    protected boolean r;
    protected int s;
    protected boolean t;
    private boolean u;
    private boolean v;
    private View w;
    private sg.bigo.ads.common.utils.o x;

    public ab(@NonNull sg.bigo.ads.y.b bVar, @NonNull sg.bigo.ads.ai.o oVar, @Nullable sg.bigo.ads.n.c cVar) {
        super(bVar, 0, oVar, cVar);
        this.t = false;
        this.t = 1 == oVar.a("endpage.ep_sprt", 0);
        this.p = oVar.a("endpage.ad_component_layout");
    }

    protected static void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int a = sg.bigo.ads.common.utils.f.a(viewGroup.getContext(), 16);
            RoundedImageView roundedImageView = (RoundedImageView) viewGroup.findViewById(R.id.inter_icon);
            if (roundedImageView != null) {
                roundedImageView.setCornerRadius(a);
            }
            float f = a;
            viewGroup.setBackground(sg.bigo.ads.common.utils.e.a(f, f, f, f, (Rect) null, -1));
            sg.bigo.ads.ad.interstitial.b.a.b(viewGroup);
        }
    }

    static /* synthetic */ void a(ab abVar) {
        sg.bigo.ads.ai.o oVar;
        String str;
        sg.bigo.ads.ai.o oVar2;
        String str2;
        ViewGroup viewGroup;
        if (abVar.k() || (abVar instanceof ac)) {
            oVar = abVar.g;
            str = "multi_ads_endpage.guide_click";
        } else {
            oVar = abVar.g;
            str = "endpage.guide_click";
        }
        final int a = oVar.a(str);
        if (a > 0) {
            if (abVar.k() || (abVar instanceof ac)) {
                oVar2 = abVar.g;
                str2 = "multi_ads_endpage.guide_click_timing";
            } else {
                oVar2 = abVar.g;
                str2 = "endpage.guide_click_timing";
            }
            int a2 = oVar2.a(str2, 0);
            final ViewGroup n = abVar.n();
            final ViewGroup viewGroup2 = (ViewGroup) abVar.q.findViewById(R.id.inter_btn_cta_layout);
            if (n != null) {
                viewGroup = (ViewGroup) n.findViewById(R.id.inter_btn_cta_layout);
                n.setClipChildren(false);
            } else {
                viewGroup = null;
            }
            final ViewGroup viewGroup3 = viewGroup;
            if (viewGroup2 != null) {
                abVar.q.setClipChildren(false);
                viewGroup2.postDelayed(new Runnable() { // from class: sg.bigo.ads.j.ab.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (sg.bigo.ads.d.c.a((sg.bigo.ads.d.c) ab.this.f)) {
                            return;
                        }
                        int i = a;
                        if (1 == i) {
                            sg.bigo.ads.ad.interstitial.c.e(viewGroup2);
                            ViewGroup viewGroup4 = viewGroup3;
                            if (viewGroup4 != null) {
                                sg.bigo.ads.ad.interstitial.c.e(viewGroup4);
                                return;
                            }
                            return;
                        }
                        if (2 == i) {
                            ab abVar2 = ab.this;
                            ab.a(abVar2, abVar2.q);
                            ViewGroup viewGroup5 = n;
                            if (viewGroup5 != null) {
                                ab.a(ab.this, viewGroup5);
                            }
                        }
                    }
                }, a2 * 1000);
            }
        }
    }

    static /* synthetic */ void a(ab abVar, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) new WeakReference(viewGroup).get();
        if (viewGroup2 != null) {
            View a = sg.bigo.ads.common.utils.a.a(viewGroup2.getContext(), R.layout.bigo_ad_endpage_cta_click_guide, viewGroup2, false);
            if (a != null) {
                viewGroup2.addView(a);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a.getLayoutParams();
                layoutParams.gravity = 8388693;
                layoutParams.bottomMargin = -sg.bigo.ads.common.utils.f.a(viewGroup2.getContext(), 30);
                a.setLayoutParams(layoutParams);
                final View findViewById = a.findViewById(R.id.click_gesture);
                final View findViewById2 = a.findViewById(R.id.click_ripple);
                final RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 10.0f, 1, 0.5f, 1, 0.6f);
                rotateAnimation.setDuration(200L);
                rotateAnimation.setStartOffset(560L);
                rotateAnimation.setFillAfter(true);
                final RotateAnimation rotateAnimation2 = new RotateAnimation(10.0f, 0.0f, 1, 0.5f, 1, 0.6f);
                rotateAnimation2.setDuration(240L);
                rotateAnimation2.setFillAfter(true);
                final AnimationSet animationSet = new AnimationSet(false);
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 5.0f, 1.0f, 5.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(400L);
                scaleAnimation.setInterpolator(sg.bigo.ads.common.utils.b.a(2));
                scaleAnimation.setFillAfter(true);
                animationSet.addAnimation(scaleAnimation);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(400L);
                scaleAnimation.setInterpolator(sg.bigo.ads.common.utils.b.a(2));
                alphaAnimation.setFillAfter(true);
                animationSet.addAnimation(alphaAnimation);
                alphaAnimation.setAnimationListener(new b.d() { // from class: sg.bigo.ads.j.ab.5
                    @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        findViewById2.setVisibility(4);
                    }
                });
                rotateAnimation.setAnimationListener(new b.d() { // from class: sg.bigo.ads.j.ab.6
                    @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        findViewById.startAnimation(rotateAnimation2);
                    }
                });
                rotateAnimation2.setAnimationListener(new b.d() { // from class: sg.bigo.ads.j.ab.7
                    @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        findViewById.startAnimation(rotateAnimation);
                        findViewById2.setVisibility(0);
                        findViewById2.startAnimation(animationSet);
                    }
                });
                findViewById.startAnimation(rotateAnimation);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // sg.bigo.ads.j.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View a(@NonNull sg.bigo.ads.ad.interstitial.r rVar, @NonNull ViewGroup viewGroup, int i) {
        View b;
        View view;
        if (rVar == 0 || viewGroup == null) {
            return this.k;
        }
        this.k = viewGroup;
        if (!(rVar instanceof sg.bigo.ads.s.b)) {
            if (rVar instanceof sg.bigo.ads.s.a) {
                b = ((sg.bigo.ads.s.a) rVar).b();
            }
            view = this.w;
            if (view != null) {
                return super.a(rVar, viewGroup, i);
            }
            this.k.addView(view, new ViewGroup.LayoutParams(-1, -1));
            d(rVar);
            return this.w;
        }
        b = ((sg.bigo.ads.s.b) rVar).b();
        this.w = b;
        view = this.w;
        if (view != null) {
        }
    }

    @Override // sg.bigo.ads.j.a
    protected final void a(double d) {
    }

    @Override // sg.bigo.ads.j.a
    protected final void a(int i, boolean z, boolean z2) {
        this.r = z;
        this.s = i;
        this.l.setTag(34);
        ViewGroup viewGroup = this.k;
        if (z2) {
            sg.bigo.ads.y.a.a(viewGroup, this.l, l(), m(), this.s);
        } else {
            sg.bigo.ads.y.a.a(viewGroup, this.l, l(), sg.bigo.ads.ad.interstitial.r.H, 0);
        }
        o();
        String str = (k() || (this instanceof ac)) ? "multi_ads_endpage.ad_component_clickable_switch" : "endpage.ad_component_clickable_switch";
        sg.bigo.ads.ai.o oVar = this.g;
        a(oVar == null || oVar.a(str) == 1);
    }

    @Override // sg.bigo.ads.j.a
    protected final void a(View view) {
        if (view == null || this.h == null) {
            return;
        }
        View findViewById = view.findViewById(R.id.bigo_ad_bottom_privacy_content);
        View findViewById2 = view.findViewById(R.id.inter_options);
        this.h.a(findViewById, 0);
        this.h.a(findViewById2, 0);
    }

    protected final void a(Button button, sg.bigo.ads.ad.interstitial.r rVar) {
        sg.bigo.ads.ai.o oVar;
        String str;
        int i;
        if (button == null || rVar == null) {
            return;
        }
        if ((this instanceof w) || (this instanceof ac)) {
            oVar = this.g;
            str = "multi_ads_endpage.cta_color";
        } else {
            oVar = this.g;
            str = "endpage.cta_color";
        }
        int a = oVar.a(str);
        if (a == 2) {
            i = -14972829;
        } else {
            if (a == 3) {
                sg.bigo.ads.y.b m = m();
                if (m.K() != null) {
                    i = m.K().intValue();
                }
            }
            i = -16736769;
        }
        sg.bigo.ads.ad.interstitial.d.a(button, i, new b.a() { // from class: sg.bigo.ads.j.ab.1
            @Override // sg.bigo.ads.bv.b.a
            public final void b(int i2) {
                ab.a(ab.this);
            }
        });
    }

    @Override // sg.bigo.ads.j.a
    protected void a(@NonNull sg.bigo.ads.ad.interstitial.r rVar, int i) {
        super.a(rVar, i);
        a((Button) this.q.findViewById(R.id.inter_btn_cta), rVar);
    }

    protected final void a(sg.bigo.ads.ad.interstitial.r rVar, final ViewGroup viewGroup, sg.bigo.ads.y.b bVar) {
        a(true, false);
        if (viewGroup == null || rVar == null || bVar == null) {
            return;
        }
        final int a = sg.bigo.ads.common.utils.f.a(viewGroup.getContext(), 16);
        final RoundedImageView roundedImageView = new RoundedImageView(viewGroup.getContext());
        roundedImageView.setCornerRadius(a);
        final int a2 = roundedImageView.getContext().getResources().getDisplayMetrics().widthPixels - sg.bigo.ads.common.utils.f.a(roundedImageView.getContext(), p());
        final int a3 = sg.bigo.ads.common.utils.f.a(roundedImageView.getContext(), q());
        roundedImageView.setLayoutParams(new FrameLayout.LayoutParams(a2, a3));
        roundedImageView.setTag(9);
        sg.bigo.ads.ad.interstitial.s.a(bVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.j.ab.4
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                final Bitmap bitmap2 = bitmap;
                if (bitmap2 == null || bitmap2.isRecycled()) {
                    return;
                }
                int width = bitmap2.getWidth();
                int height = bitmap2.getHeight();
                if (width < a2 || height < a3) {
                    roundedImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    sg.bigo.ads.common.utils.e.a(roundedImageView.getContext(), bitmap2, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.j.ab.4.1
                        @Override // android.webkit.ValueCallback
                        public final /* synthetic */ void onReceiveValue(Bitmap bitmap3) {
                            RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(viewGroup.getContext());
                            roundedFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, a3));
                            roundedFrameLayout.setCornerRadius(a);
                            sg.bigo.ads.common.utils.v.a(roundedFrameLayout, viewGroup, null, -1);
                            RoundedImageView roundedImageView2 = new RoundedImageView(viewGroup.getContext());
                            roundedImageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, a3));
                            roundedImageView2.setImageBitmap(bitmap3);
                            roundedImageView2.setCornerRadius(a);
                            roundedImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            roundedImageView2.setTag(9);
                            sg.bigo.ads.common.utils.v.a(roundedImageView2, roundedFrameLayout, null, -1);
                            int a4 = sg.bigo.ads.common.utils.f.a(viewGroup.getContext(), 10);
                            roundedImageView.setImageBitmap(bitmap2);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) roundedImageView.getLayoutParams();
                            layoutParams.width = -2;
                            layoutParams.height = -2;
                            layoutParams.gravity = 17;
                            layoutParams.setMargins(a4, a4, a4, a4);
                            roundedImageView.setLayoutParams(layoutParams);
                            sg.bigo.ads.common.utils.v.a(roundedImageView, roundedFrameLayout, null, -1);
                            ab.this.o();
                        }
                    });
                } else {
                    roundedImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    sg.bigo.ads.common.utils.v.a(roundedImageView, viewGroup, null, -1);
                    roundedImageView.setImageBitmap(bitmap2);
                    ab.this.o();
                }
            }
        });
    }

    protected void a(boolean z) {
        if (this.v) {
            return;
        }
        this.v = true;
        if (z) {
            sg.bigo.ads.y.a.a(this.k, this.q, l(), m(), this.s);
        } else {
            sg.bigo.ads.y.a.a(this.k, this.q, l(), sg.bigo.ads.ad.interstitial.r.H, 0);
        }
    }

    protected void a(boolean z, boolean z2) {
    }

    @Override // sg.bigo.ads.ad.interstitial.v
    public boolean a(@NonNull sg.bigo.ads.ad.interstitial.r rVar, @NonNull ViewGroup viewGroup, @NonNull View view, u.a aVar, int i, int i2, int i3, @Nullable View... viewArr) {
        if (!this.t) {
            return super.a(rVar, viewGroup, view, aVar, i, i2, i3, viewArr);
        }
        View view2 = this.q;
        if (view2 == null) {
            view2 = this.w;
        }
        return super.a(this.f, rVar, viewGroup, view2, aVar, i, l(), i3, viewArr);
    }

    @Override // sg.bigo.ads.ad.interstitial.e
    public final void b() {
        super.b();
        sg.bigo.ads.common.utils.o oVar = this.x;
        if (oVar == null || !oVar.e()) {
            return;
        }
        this.x.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.e
    public final void c() {
        super.c();
        sg.bigo.ads.common.utils.o oVar = this.x;
        if (oVar == null || oVar.e()) {
            return;
        }
        this.x.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.j.a
    protected void d(final sg.bigo.ads.ad.interstitial.r rVar) {
        ViewGroup viewGroup = this.l;
        if (viewGroup != null) {
            int i = this.p;
            if (i != 2) {
                if (i == 3 || i == 4) {
                    ViewGroup viewGroup2 = (ViewGroup) ((ViewStub) viewGroup.findViewById(R.id.bigo_ad_end_stub_1_img_wrap)).inflate();
                    this.q = viewGroup2;
                    a(rVar, viewGroup2, m());
                } else if (i != 5) {
                    this.q = (ViewGroup) ((ViewStub) viewGroup.findViewById(R.id.bigo_ad_end_stub_1_half_wrap)).inflate();
                    a(false, true);
                }
                a((ViewGroup) this.q.findViewById(R.id.bigo_ad_inter_layout_end_page));
            }
            this.q = (ViewGroup) ((ViewStub) viewGroup.findViewById(R.id.bigo_ad_end_stub_1_all_wrap)).inflate();
            a((ViewGroup) this.q.findViewById(R.id.bigo_ad_inter_layout_end_page));
        }
        KeyEvent.Callback callback = this.l;
        if (callback == null) {
            callback = this.w;
        }
        int i2 = this.w == null ? 11 : 5;
        if (this.t) {
            i2 = 12;
        }
        final int i3 = ((this instanceof w) || (this instanceof ac)) ? 13 : i2;
        if (rVar instanceof sg.bigo.ads.s.b) {
            ((sg.bigo.ads.s.b) rVar).b(i3);
        } else if (rVar instanceof sg.bigo.ads.s.a) {
            ((sg.bigo.ads.s.a) rVar).a(i3);
        }
        if (i3 == 12 || i3 == 13) {
            sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) m().f(), i3, 2);
        }
        if (rVar == 0 || callback == null) {
            return;
        }
        if (!(rVar instanceof sg.bigo.ads.s.a) || this.t) {
            sg.bigo.ads.common.utils.o oVar = new sg.bigo.ads.common.utils.o(this.g.a("endpage.force_staying_time", 3) * 1000) { // from class: sg.bigo.ads.j.ab.3
                @Override // sg.bigo.ads.common.utils.o
                public final void a() {
                    k.b bVar = rVar;
                    if (bVar instanceof sg.bigo.ads.s.b) {
                        ((sg.bigo.ads.s.b) bVar).a(i3);
                    } else if ((bVar instanceof sg.bigo.ads.s.a) && ab.this.t) {
                        ((sg.bigo.ads.s.a) bVar).a(i3, 2);
                    }
                }

                @Override // sg.bigo.ads.common.utils.o
                public final void a(long j) {
                }
            };
            this.x = oVar;
            oVar.c();
        }
    }

    @Override // sg.bigo.ads.j.a
    protected int h() {
        return R.layout.bigo_ad_activity_interstitial_multi_single_end;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.j.a
    protected final void i() {
        AdOptionsView adOptionsView;
        if (m() == null || this.l == null) {
            return;
        }
        String j = ((sg.bigo.ads.cp.a) m().f()).j();
        TextView textView = (TextView) this.l.findViewById(R.id.inter_advertiser);
        TextView textView2 = (TextView) this.l.findViewById(R.id.inter_ad_label);
        if (textView != null && textView2 != null) {
            textView.setVisibility(8);
            if (!TextUtils.isEmpty(j)) {
                textView2.setText(sg.bigo.ads.common.utils.a.a(textView2.getContext(), R.string.bigo_ad_tag, new Object[0]) + " · " + j);
            }
        }
        TextView textView3 = this.m;
        if (textView3 != null) {
            textView3.setText(m().getWarning());
        }
        ViewGroup viewGroup = this.l;
        if (viewGroup == null || (adOptionsView = (AdOptionsView) viewGroup.findViewById(R.id.inter_options)) == 0) {
            return;
        }
        adOptionsView.setTag(4);
        adOptionsView.a((sg.bigo.ads.api.core.b) m().f(), ((sg.bigo.ads.cp.a) m().f()).m());
    }

    protected int l() {
        return this.t ? 14 : 4;
    }

    protected sg.bigo.ads.y.b m() {
        return this.f;
    }

    protected ViewGroup n() {
        return null;
    }

    protected void o() {
        if (this.u) {
            return;
        }
        View findViewWithTag = this.q.findViewWithTag(9);
        if (this.r && findViewWithTag != null) {
            this.u = true;
            sg.bigo.ads.y.a.a(this.k, findViewWithTag, l(), m(), this.s);
        } else if (findViewWithTag != null) {
            this.u = true;
            sg.bigo.ads.y.a.a(this.k, findViewWithTag, l(), sg.bigo.ads.ad.interstitial.r.H, this.s);
        }
    }

    protected int p() {
        return 40;
    }

    protected int q() {
        return 142;
    }
}
