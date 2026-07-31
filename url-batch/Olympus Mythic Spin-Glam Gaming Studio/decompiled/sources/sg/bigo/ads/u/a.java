package sg.bigo.ads.u;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.f;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ad.interstitial.v;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.an.p;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.common.view.RoundedImageView;
import sg.bigo.ads.r.e;

/* loaded from: classes12.dex */
public abstract class a extends v {

    @NonNull
    protected final p i;

    @NonNull
    protected final f j;
    protected ViewGroup k;
    protected ViewGroup l;
    protected RoundedImageView m;
    protected RoundedImageView n;
    protected Button o;

    @Nullable
    protected TextView p;
    protected ViewGroup q;
    protected AnimationSet r;
    protected Rect s;

    /* JADX WARN: Type inference failed for: r2v1, types: [sg.bigo.ads.api.core.b] */
    protected a(@NonNull sg.bigo.ads.y.b bVar, @NonNull o oVar, p pVar) {
        super(bVar, oVar);
        this.i = pVar;
        ?? f = bVar.f();
        this.j = new f(oVar.a("layer.gp_element"), 0, f != 0 ? f.o() : "");
    }

    public static int a(@Nullable o oVar) {
        return sg.bigo.ads.k.a.a(oVar, "layer.webview_layout");
    }

    @Nullable
    public static a a(Context context, @NonNull sg.bigo.ads.y.b bVar, @Nullable o oVar, boolean z) {
        int i;
        int i2;
        if (oVar == null || bVar == null || z) {
            return null;
        }
        if (context != null) {
            i = context.getResources().getDisplayMetrics().widthPixels;
            i2 = sg.bigo.ads.common.utils.f.c(context);
        } else {
            i = 0;
            i2 = 0;
        }
        p pVar = new p(i, i2);
        int a = oVar.a("layer.ad_component_layout");
        if (a == 1) {
            return new b(bVar, oVar, pVar);
        }
        if (a == 2) {
            return new c(bVar, oVar, pVar);
        }
        if (a != 3) {
            return null;
        }
        return new d(bVar, oVar, pVar);
    }

    private void a(boolean z) {
        AnimationSet animationSet = this.r;
        if (animationSet == null || this.s == null) {
            return;
        }
        List<Animation> animations = animationSet.getAnimations();
        for (int i = 0; animations != null && i < animations.size(); i++) {
            Animation animation = animations.get(i);
            if (animation instanceof sg.bigo.ads.ao.a) {
                sg.bigo.ads.ao.a aVar = (sg.bigo.ads.ao.a) animation;
                int height = this.s.height();
                aVar.c = height;
                if (z) {
                    aVar.d = height;
                }
            }
        }
    }

    public static int b(@Nullable o oVar) {
        return sg.bigo.ads.k.a.a(oVar, "layer.webview_force_time", "layer.webview_force_time_new");
    }

    public final View a(@NonNull r rVar, @NonNull ViewGroup viewGroup, int i, @Nullable final v.a aVar) {
        if (viewGroup == null) {
            return null;
        }
        this.k = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), h(), null, false);
        this.l = viewGroup2;
        if (viewGroup2 == null) {
            return null;
        }
        this.k.addView(viewGroup2, new ViewGroup.LayoutParams(-1, -1));
        this.l.setBackgroundColor(-234881024);
        k();
        e(rVar);
        f(rVar);
        TextView textView = (TextView) this.l.findViewById(R.id.inter_warning);
        this.p = textView;
        sg.bigo.ads.ad.interstitial.d.a(textView, -234881024);
        sg.bigo.ads.as.a.a((View) this.p, 101.0f);
        ViewGroup viewGroup3 = (ViewGroup) this.l.findViewById(R.id.inter_ad_tag_layout);
        this.q = viewGroup3;
        sg.bigo.ads.common.utils.v.a(viewGroup3, new v.a() { // from class: sg.bigo.ads.u.a.1
            @Override // sg.bigo.ads.common.utils.v.a
            public final void a(View view, @NonNull Rect rect) {
                if (a.this.h != null) {
                    a.this.h.a(a.this.q, 0);
                }
            }
        });
        sg.bigo.ads.as.a.a((View) this.q, 101.0f);
        d(rVar);
        sg.bigo.ads.ad.interstitial.c.a(this.l, this.k, new Runnable() { // from class: sg.bigo.ads.u.a.2
            @Override // java.lang.Runnable
            public final void run() {
                v.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(a.this.l);
                }
                a.this.i();
            }
        });
        int a = this.g.a("layer.click_type");
        ViewGroup viewGroup4 = this.k;
        ViewGroup viewGroup5 = this.l;
        a(rVar, viewGroup4, viewGroup5, null, i, 10, a, viewGroup5);
        TextView textView2 = this.p;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        a(a, this.g.a("layer.media_view_clickable_switch") == 1, this.g.a("layer.other_space_clickable_switch") == 1);
        String j = ((sg.bigo.ads.cp.a) this.f.f()).j();
        TextView textView3 = (TextView) this.l.findViewById(R.id.inter_advertiser);
        if (TextUtils.isEmpty(j)) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(j);
        }
        return this.l;
    }

    @CallSuper
    protected void a(int i, boolean z, boolean z2) {
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            return;
        }
        sg.bigo.ads.y.a.a(viewGroup, 12);
        sg.bigo.ads.y.a.a(this.o, 17);
        sg.bigo.ads.y.a.a(this.m, 17);
        if (z2) {
            sg.bigo.ads.y.a.a(this.k, this.l, 10, this.f, i);
        } else {
            sg.bigo.ads.y.a.a(this.k, this.l, 10, r.H, 0);
        }
        sg.bigo.ads.y.a.a(this.n, 5);
        RoundedImageView roundedImageView = this.n;
        if (roundedImageView != null) {
            if (z) {
                sg.bigo.ads.y.a.a(this.k, roundedImageView, 10, this.f, i);
            } else {
                sg.bigo.ads.y.a.a(this.k, roundedImageView, 10, r.H, 0);
            }
        }
    }

    public final void a(@NonNull View view) {
        ViewGroup viewGroup = this.l;
        if (viewGroup == null || view == null) {
            return;
        }
        Point a = sg.bigo.ads.common.utils.v.a(viewGroup, view);
        this.s = new Rect(a.x, a.y, view.getMeasuredWidth() + a.x, view.getMeasuredHeight() + a.y);
        a(false);
    }

    protected abstract void d(@NonNull r rVar);

    @Override // sg.bigo.ads.ad.interstitial.v
    public final int e() {
        o oVar = this.g;
        return e.a(oVar != null ? oVar.a("layer.mediaview_colour") : 3);
    }

    protected void e(@NonNull r rVar) {
        RoundedImageView roundedImageView = (RoundedImageView) this.l.findViewById(R.id.inter_click_guide_image);
        this.n = roundedImageView;
        if (roundedImageView == null || rVar == null) {
            return;
        }
        roundedImageView.setTag(5);
        ValueCallback<Bitmap> valueCallback = new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.u.a.6
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                final Bitmap bitmap2 = bitmap;
                if (bitmap2 != null) {
                    a.this.n.post(new Runnable() { // from class: sg.bigo.ads.u.a.6.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.this.n.setImageBitmap(bitmap2);
                        }
                    });
                }
            }
        };
        Bitmap g = sg.bigo.ads.ad.interstitial.v.a(rVar).g();
        if (g != null) {
            valueCallback.onReceiveValue(g);
        } else {
            sg.bigo.ads.ad.interstitial.v.a(rVar, valueCallback);
        }
    }

    protected void f(@NonNull r rVar) {
        Button button = (Button) this.l.findViewById(R.id.inter_btn_cta);
        this.o = button;
        if (button != null) {
            int g = g(rVar);
            float a = sg.bigo.ads.common.utils.f.a(this.l.getContext(), 8);
            this.o.setBackground(sg.bigo.ads.common.utils.e.a(a, a, a, a, (Rect) null, g));
            sg.bigo.ads.ad.interstitial.d.a(this.o, sg.bigo.ads.bv.b.a(g));
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.v
    public final boolean f() {
        return true;
    }

    protected final int g(@NonNull r rVar) {
        int i;
        o oVar = this.g;
        if (oVar == null) {
            return -16736769;
        }
        int a = oVar.a("layer.cta_color");
        return (a == 3 && d() && (i = sg.bigo.ads.ad.interstitial.v.a(rVar).j) != 0) ? i : s.a(this.f, a, null);
    }

    public abstract boolean g();

    @LayoutRes
    protected abstract int h();

    @CallSuper
    protected final void i() {
        a(1, new Runnable() { // from class: sg.bigo.ads.u.a.3
            @Override // java.lang.Runnable
            public final void run() {
                a.this.l.post(new Runnable() { // from class: sg.bigo.ads.u.a.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.j();
                    }
                });
            }
        });
    }

    protected final void j() {
        ViewStub viewStub;
        View inflate;
        ViewStub viewStub2;
        final View inflate2;
        ViewGroup viewGroup;
        o oVar = this.g;
        int a = oVar != null ? oVar.a("layer.guided_click") : 2;
        if (a == 1) {
            Button button = this.o;
            if (button != null) {
                sg.bigo.ads.ad.interstitial.c.e(button);
                return;
            }
            return;
        }
        if (a != 3) {
            ViewGroup viewGroup2 = this.l;
            if (viewGroup2 == null || this.o == null || (viewStub2 = (ViewStub) viewGroup2.findViewById(R.id.inter_gesture_zoom_layout)) == null || (inflate2 = viewStub2.inflate()) == null) {
                return;
            }
            inflate2.setAlpha(0.0f);
            sg.bigo.ads.as.a.a(inflate2, 99.0f);
            final View findViewById = inflate2.findViewById(R.id.inter_click_guide);
            final View findViewById2 = inflate2.findViewById(R.id.inter_click_ripple);
            if (findViewById == null || findViewById2 == null) {
                return;
            }
            int a2 = sg.bigo.ads.common.utils.f.a(this.l.getContext(), 50);
            inflate2.setPadding(a2, a2, 0, 0);
            Button button2 = this.o;
            if (button2 != null && (viewGroup = this.l) != null) {
                Point a3 = sg.bigo.ads.common.utils.v.a(viewGroup, button2);
                Rect rect = new Rect(a3.x, a3.y, this.o.getMeasuredWidth() + a3.x, this.o.getMeasuredHeight() + a3.y);
                Rect rect2 = new Rect(0, 0, findViewById2.getLayoutParams().width, findViewById2.getLayoutParams().height);
                int centerY = ((rect.centerY() - rect2.centerY()) + rect2.top) - a2;
                int centerX = ((rect.centerX() - rect2.centerX()) + rect2.left) - a2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) inflate2.getLayoutParams();
                marginLayoutParams.topMargin = centerY;
                marginLayoutParams.leftMargin = (int) (centerX - (rect.width() * 0.15f));
                inflate2.requestLayout();
            }
            sg.bigo.ads.ad.interstitial.c.a(0, sg.bigo.ads.ad.interstitial.v.e, 200L, new ValueCallback<Integer>() { // from class: sg.bigo.ads.u.a.4
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Integer num) {
                    if (num != null) {
                        inflate2.setAlpha((r3.intValue() * 1.0f) / sg.bigo.ads.ad.interstitial.v.e);
                    }
                }
            }, new ValueCallback<Void>() { // from class: sg.bigo.ads.u.a.5
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Void r2) {
                    inflate2.setAlpha(1.0f);
                    sg.bigo.ads.ad.interstitial.c.a(findViewById, findViewById2);
                }
            });
            return;
        }
        ViewGroup viewGroup3 = this.l;
        if (viewGroup3 == null || (viewStub = (ViewStub) viewGroup3.findViewById(R.id.inter_gesture_slide_layout)) == null || (inflate = viewStub.inflate()) == null) {
            return;
        }
        sg.bigo.ads.as.a.a(inflate, 99.0f);
        View findViewById3 = inflate.findViewById(R.id.inter_click_guide);
        if (findViewById3 != null) {
            inflate.setTag(16);
            sg.bigo.ads.y.a.a(this.k, inflate, 10, this.f, 0);
            int max = Math.max(1300, Math.max(600, 600));
            sg.bigo.ads.ao.a aVar = new sg.bigo.ads.ao.a(-(sg.bigo.ads.common.utils.f.c(findViewById3.getContext()) >> 1));
            aVar.setRepeatCount(-1);
            aVar.setInterpolator(new b.InterpolatorC1868b(max - 1000) { // from class: sg.bigo.ads.ad.interstitial.c.12
                private final Interpolator a = sg.bigo.ads.common.utils.b.a(2);

                public AnonymousClass12(long j) {
                    super(1000L, 0L, j);
                    this.a = sg.bigo.ads.common.utils.b.a(2);
                }

                @Override // sg.bigo.ads.common.utils.b.InterpolatorC1868b, android.animation.TimeInterpolator
                public final float getInterpolation(float f) {
                    float interpolation = super.getInterpolation(f);
                    Interpolator interpolator = this.a;
                    return interpolator != null ? interpolator.getInterpolation(interpolation) : interpolation;
                }
            });
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setRepeatCount(-1);
            long j = max - 300;
            alphaAnimation.setInterpolator(new b.InterpolatorC1868b(300L, 0L, j));
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.1f, 1.0f, 0.1f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setRepeatCount(-1);
            scaleAnimation.setInterpolator(new b.InterpolatorC1868b(300L, 0L, j));
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setRepeatCount(-1);
            alphaAnimation2.setInterpolator(new b.InterpolatorC1868b(300L, j, 0L));
            AnimationSet animationSet = new AnimationSet(false);
            animationSet.setDuration(max);
            animationSet.setRepeatCount(-1);
            animationSet.addAnimation(scaleAnimation);
            animationSet.addAnimation(aVar);
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(alphaAnimation2);
            findViewById3.startAnimation(animationSet);
            this.r = animationSet;
            a(true);
        }
    }

    protected void k() {
        Context context = this.l.getContext();
        RoundedImageView roundedImageView = (RoundedImageView) this.l.findViewById(R.id.inter_icon);
        this.m = roundedImageView;
        if (roundedImageView != null) {
            roundedImageView.setCornerRadius(sg.bigo.ads.common.utils.f.a(context, 22));
            this.m.setStrokeWidth(sg.bigo.ads.common.utils.f.a(context, 1));
            this.m.setStrokeColor(134217728);
        }
    }
}
