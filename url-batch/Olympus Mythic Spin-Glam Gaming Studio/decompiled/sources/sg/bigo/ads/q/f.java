package sg.bigo.ads.q;

import android.app.Activity;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import sg.bigo.ads.R;
import sg.bigo.ads.an.h;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;
import sg.bigo.ads.q.c;

/* loaded from: classes15.dex */
public class f extends e {
    private final a I;
    private final a J;
    private boolean K;
    private final c.a L;
    protected final c b;
    protected final int c;
    protected final int d;
    protected int e;
    protected int f;
    protected final int g;
    protected RoundedFrameLayout h;
    protected RelativeLayout i;
    protected View j;
    protected LinearLayout k;
    protected ImageView l;
    protected TextView m;
    protected RelativeLayout n;
    protected ImageView o;
    protected ImageView p;
    protected ImageView q;
    protected ImageView r;
    protected final AtomicBoolean s;
    protected boolean t;

    /* renamed from: sg.bigo.ads.q.f$2, reason: invalid class name */
    final class AnonymousClass2 implements ValueCallback<Integer> {
        final /* synthetic */ ViewGroup.MarginLayoutParams a;

        AnonymousClass2(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.a = marginLayoutParams;
        }

        @Override // android.webkit.ValueCallback
        public final /* synthetic */ void onReceiveValue(Integer num) {
            this.a.topMargin = num.intValue();
            f.this.h.requestLayout();
            f.this.h.getMeasuredWidth();
            f fVar = f.this;
            fVar.b(fVar.c - this.a.topMargin);
        }
    }

    /* renamed from: sg.bigo.ads.q.f$3, reason: invalid class name */
    final class AnonymousClass3 implements ValueCallback<Void> {
        AnonymousClass3() {
        }

        @Override // android.webkit.ValueCallback
        public final /* bridge */ /* synthetic */ void onReceiveValue(Void r2) {
            f.this.t = true;
        }
    }

    class a implements View.OnTouchListener {
        private final int b;
        private float c;
        private float d;
        private int e;

        private a() {
            this.b = ViewConfiguration.get(f.this.N).getScaledTouchSlop();
        }

        /* synthetic */ a(f fVar, byte b) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            if (r3 != 3) goto L30;
         */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (f.this.g() || !f.this.s.get()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.c = motionEvent.getRawX();
                this.d = motionEvent.getRawY();
                if (!f.this.g() || f.this.b == null) {
                    f.this.g();
                    if (f.this.t) {
                        this.e = (int) motionEvent.getRawY();
                    }
                }
                return false;
            }
            if (action == 1) {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                if (Math.abs(this.c - rawX) < this.b && Math.abs(this.d - rawY) < this.b) {
                    f fVar = f.this;
                    fVar.e(fVar.e);
                }
                f.this.h();
            } else if (action == 2) {
                int rawY2 = (int) motionEvent.getRawY();
                int i = rawY2 - this.e;
                this.e = rawY2;
                f.this.a(i);
            }
            return true;
        }
    }

    public f(@NonNull Activity activity) {
        super(activity);
        c cVar;
        int i;
        this.s = new AtomicBoolean(true);
        byte b = 0;
        this.K = false;
        this.L = new c.a() { // from class: sg.bigo.ads.q.f.1
            @Override // sg.bigo.ads.q.c.a
            public final boolean a() {
                if (f.this.w()) {
                    return false;
                }
                f.this.f(0);
                return true;
            }
        };
        this.t = true;
        LandingPageStyleConfig landingPageStyleConfig = ((e) this).a;
        if (landingPageStyleConfig != null) {
            int i2 = landingPageStyleConfig.a;
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    cVar = new c(landingPageStyleConfig.c, i2, landingPageStyleConfig.e, landingPageStyleConfig.f);
                    break;
                default:
                    cVar = new c(0, 1, landingPageStyleConfig.e, landingPageStyleConfig.f);
                    break;
            }
        } else {
            cVar = null;
        }
        this.b = cVar;
        int a2 = sg.bigo.ads.common.utils.f.a(this.N, 20);
        this.d = a2;
        LandingPageStyleConfig landingPageStyleConfig2 = ((e) this).a;
        this.c = ((landingPageStyleConfig2 == null || (i = landingPageStyleConfig2.d) <= 0) ? sg.bigo.ads.common.utils.f.c(this.N) - sg.bigo.ads.common.utils.f.a(this.N, 48) : i) - a2;
        this.e = 0;
        this.f = (int) (this.c * (1.0f - (cVar != null ? cVar.e() : 1.0f)));
        this.g = sg.bigo.ads.common.utils.f.a(activity, 3);
        this.I = new a(this, b);
        this.J = new a(this, b);
        activity.setTheme(R.style.BigoAd_LandingPageStyle);
        aL();
        c_();
        activity.overridePendingTransition(0, 0);
    }

    static /* synthetic */ void g(f fVar) {
        if (fVar.s.compareAndSet(true, false)) {
            long abs = (long) Math.abs(((fVar.c - ((ViewGroup.MarginLayoutParams) fVar.h.getLayoutParams()).topMargin) * 1.5f) / fVar.g);
            sg.bigo.ads.ao.a aVar = new sg.bigo.ads.ao.a() { // from class: sg.bigo.ads.q.f.5
                @Override // sg.bigo.ads.ao.a
                public final void a(float f, int i) {
                    f.this.b((int) (i - f));
                }

                @Override // sg.bigo.ads.ao.a, android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    f.this.s.set(true);
                }
            };
            aVar.setDuration(abs);
            fVar.h.startAnimation(aVar);
        }
    }

    private boolean z() {
        WebView webView = this.D;
        if (webView == null) {
            return false;
        }
        return webView.canGoForward();
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final int a() {
        return R.layout.bigo_ad_activity_interstitial_landingpage;
    }

    protected void a(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
        int min = Math.min(Math.max(this.e, marginLayoutParams.topMargin + i), this.f);
        marginLayoutParams.topMargin = min;
        this.h.requestLayout();
        this.h.getMeasuredWidth();
        b(this.c - min);
    }

    @Override // sg.bigo.ads.q.e, sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(String str) {
        super.a(str);
        this.C.setEnabled(x());
        this.o.setEnabled(z());
    }

    @Override // sg.bigo.ads.q.e, sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(String str, boolean z) {
        super.a(str, z);
        this.C.setEnabled(x());
        this.o.setEnabled(z());
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public boolean a(MotionEvent motionEvent) {
        return this.I.onTouch(this.D, motionEvent);
    }

    @Override // sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void al() {
        super.al();
        this.N.overridePendingTransition(0, 0);
        c cVar = this.b;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // sg.bigo.ads.q.e, sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl
    public void b() {
        String str;
        ImageView imageView;
        super.b();
        this.h = (RoundedFrameLayout) q(R.id.inter_landpage_webview_page);
        this.i = (RelativeLayout) q(R.id.inter_webview_top_bar);
        this.k = (LinearLayout) q(R.id.inter_webview_top_action_bar);
        this.l = (ImageView) q(R.id.inter_webview_open);
        this.m = (TextView) q(R.id.inter_webview_host);
        this.r = (ImageView) q(R.id.inter_webview_safe);
        this.j = q(R.id.inter_webview_top_indicator);
        this.n = (RelativeLayout) q(R.id.inter_webview_bottom_bar);
        this.o = (ImageView) q(R.id.inter_webview_forward);
        this.p = (ImageView) q(R.id.inter_webview_copy);
        this.q = (ImageView) q(R.id.inter_webview_refresh);
        this.l.setOnClickListener(this);
        this.o.setOnClickListener(this);
        this.p.setOnClickListener(this);
        this.q.setOnClickListener(this);
        View q = q(R.id.inter_webview_top_middle);
        int i = 8;
        this.l.setVisibility(d() ? 8 : 0);
        this.o.setVisibility(d() ? 8 : 0);
        this.p.setVisibility(d() ? 8 : 0);
        this.q.setVisibility(d() ? 8 : 0);
        this.n.setVisibility(d() ? 8 : 0);
        ImageView imageView2 = this.C;
        if (imageView2 != null) {
            imageView2.setVisibility(d() ? 8 : 0);
        }
        View view = this.j;
        if (view != null) {
            view.setVisibility(d() ? 8 : 0);
        }
        if (q != null) {
            q.setVisibility(d() ? 8 : 0);
        }
        c cVar = this.b;
        if (cVar != null) {
            this.i.setLayoutDirection(cVar.f() ? 1 : 0);
        }
        this.k.setLayoutDirection(this.i.getLayoutDirection());
        this.B.setLayoutDirection(0);
        this.l.setLayoutDirection(0);
        this.A.setLayoutDirection(0);
        this.z.setLayoutDirection(0);
        this.m.setLayoutDirection(0);
        this.z.setMaxLines(1);
        float a2 = sg.bigo.ads.common.utils.f.a(this.N, 16);
        this.h.a(a2, a2, 0.0f, 0.0f);
        this.z.setVisibility(8);
        this.m.setVisibility(8);
        String str2 = this.E;
        boolean isHttpsUrl = URLUtil.isHttpsUrl(str2);
        try {
            str = Uri.parse(str2).getHost();
        } catch (Exception unused) {
            str = "";
        }
        this.m.setText(str);
        if (r.a((CharSequence) str)) {
            this.m.setVisibility(8);
            imageView = this.r;
        } else {
            this.m.setVisibility(0);
            imageView = this.r;
            if (isHttpsUrl) {
                i = 0;
            }
        }
        imageView.setVisibility(i);
        this.i.setOnTouchListener(this.J);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
        c cVar2 = this.b;
        if (cVar2 != null) {
            marginLayoutParams.topMargin = cVar2.g() ? this.e : this.f;
        }
        this.h.requestLayout();
        v.a(this.h, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.q.f.9
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                f.g(f.this);
            }
        });
        c cVar3 = this.b;
        if ((cVar3 == null || cVar3.d() != 0) && !d()) {
            Drawable progressDrawable = this.A.getProgressDrawable();
            if (progressDrawable instanceof LayerDrawable) {
                Drawable drawable = ((ClipDrawable) ((LayerDrawable) progressDrawable).findDrawableByLayerId(android.R.id.progress)).getDrawable();
                if (drawable instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                    c cVar4 = this.b;
                    gradientDrawable.setColors(new int[]{cVar4 != null ? cVar4.d() : -1, -1312769});
                }
            }
        }
    }

    protected void b(int i) {
        View view;
        int i2 = this.c;
        int i3 = i2 - this.f;
        int i4 = this.d;
        if (i == i2 && (view = this.j) != null && !this.K) {
            this.K = true;
            view.postDelayed(new Runnable() { // from class: sg.bigo.ads.q.f.4
                @Override // java.lang.Runnable
                public final void run() {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(new b.a());
                    transitionSet.addTransition(new Fade(2));
                    transitionSet.setDuration(300L);
                    TransitionManager.beginDelayedTransition(f.this.h, transitionSet);
                    f.this.j.setVisibility(8);
                }
            }, 500L);
        }
        c cVar = this.b;
        if (cVar != null) {
            cVar.b(i, i3, i2, i4);
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void b(String str) {
        super.b(str);
        TextView textView = this.z;
        if (textView != null) {
            textView.setVisibility(r.a((CharSequence) str) ? 8 : 0);
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final boolean b(MotionEvent motionEvent) {
        c cVar = this.b;
        return cVar != null ? cVar.a(motionEvent, this.L) || super.b(motionEvent) : super.b(motionEvent);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void c() {
        final View q = q(R.id.inter_webview_back);
        final View q2 = q(R.id.inter_webview_copy);
        final View q3 = q(R.id.inter_webview_close);
        v.a(q, new v.a() { // from class: sg.bigo.ads.q.f.8
            @Override // sg.bigo.ads.common.utils.v.a
            public final void a(View view, @NonNull Rect rect) {
                if (f.this.P != null) {
                    f.this.P.a(q, 1);
                    f.this.P.a(q2, 1);
                    f.this.P.a(q3, 1);
                }
            }
        });
    }

    protected void c_() {
        Window window = this.N.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = this.c;
        attributes.gravity = 80;
        window.setAttributes(attributes);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void d(final int i) {
        sg.bigo.ads.api.core.e eVar = this.G;
        if (eVar != null && eVar.b() == 4) {
            super.d(i);
            return;
        }
        final Runnable runnable = new Runnable() { // from class: sg.bigo.ads.q.f.7
            @Override // java.lang.Runnable
            public final void run() {
                f.super.d(i);
            }
        };
        if (this.s.compareAndSet(true, false)) {
            long abs = (long) Math.abs(((this.c - ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).topMargin) * 1.5f) / this.g);
            sg.bigo.ads.ao.a aVar = new sg.bigo.ads.ao.a() { // from class: sg.bigo.ads.q.f.6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0.0f, 1.0f);
                }

                @Override // sg.bigo.ads.ao.a
                public final void a(float f, int i2) {
                    f.this.b((int) (i2 - f));
                }

                @Override // sg.bigo.ads.ao.a, android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            };
            aVar.setFillAfter(true);
            aVar.setDuration(abs);
            this.h.startAnimation(aVar);
        }
    }

    @Override // sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void e() {
        super.e();
        c cVar = this.b;
        if (cVar != null) {
            cVar.a();
        }
    }

    protected final void e(int i) {
        int max = Math.max(this.e, Math.min(this.f, i));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
        if (marginLayoutParams.topMargin == max) {
            return;
        }
        long abs = (long) Math.abs(((max - r1) * 2.0f) / this.g);
        this.t = false;
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new b.a() { // from class: sg.bigo.ads.q.f.10
            @Override // sg.bigo.ads.common.utils.b.a
            public final void a(Object obj, Object obj2) {
                RoundedFrameLayout roundedFrameLayout = f.this.h;
                if (obj == roundedFrameLayout && (obj2 instanceof PointF)) {
                    PointF pointF = (PointF) obj2;
                    roundedFrameLayout.getMeasuredWidth();
                    float f = pointF.x;
                    f.this.b((int) (r2.c - pointF.y));
                }
            }
        });
        transitionSet.setDuration(abs);
        transitionSet.addListener((Transition.TransitionListener) new h() { // from class: sg.bigo.ads.q.f.11
            @Override // sg.bigo.ads.an.h, android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                super.onTransitionEnd(transition);
                f.this.t = true;
            }
        });
        TransitionManager.beginDelayedTransition(this.h, transitionSet);
        marginLayoutParams.topMargin = max;
        this.h.requestLayout();
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void f() {
        super.f();
        c cVar = this.b;
        if (cVar != null) {
            cVar.b();
        }
    }

    protected final boolean g() {
        return ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).topMargin <= this.e;
    }

    protected final void h() {
        float f = ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).topMargin;
        int i = this.f;
        if (f <= i * 0.8f) {
            i = 0;
        }
        e(i);
    }

    @Override // sg.bigo.ads.controller.landing.c, sg.bigo.ads.aj.h
    public final int i() {
        c cVar = this.b;
        if (cVar == null) {
            return 0;
        }
        return cVar.c;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, android.view.View.OnClickListener
    public void onClick(View view) {
        WebView webView;
        super.onClick(view);
        if (view == this.l) {
            sg.bigo.ads.core.landing.a.a((sg.bigo.ads.api.core.b) null, this.N, this.E, (JSONArray) null);
            return;
        }
        if (view == this.o) {
            WebView webView2 = this.D;
            if (webView2 == null || !webView2.canGoForward()) {
                return;
            }
            this.D.goForward();
            return;
        }
        if (view == this.p) {
            if (sg.bigo.ads.common.utils.d.g(this.N, this.E)) {
                Activity activity = this.N;
                Toast.makeText(activity, sg.bigo.ads.common.utils.a.a(activity, R.string.bigo_ad_link_copied, new Object[0]), 0).show();
                return;
            }
            return;
        }
        if (view != this.q || (webView = this.D) == null) {
            return;
        }
        webView.reload();
    }
}
