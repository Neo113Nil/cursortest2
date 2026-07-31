package sg.bigo.ads.k;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.bv.b;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.RoundedImageView;
import sg.bigo.ads.k.a;

/* loaded from: classes9.dex */
public class b extends sg.bigo.ads.k.a implements sg.bigo.ads.q.d {
    protected ViewGroup A;

    @Nullable
    protected ViewGroup B;

    @Nullable
    protected Button C;

    @Nullable
    protected RoundedFrameLayout D;

    @Nullable
    protected MediaView E;

    @Nullable
    protected TextView F;

    @Nullable
    protected TextView G;

    @Nullable
    protected Button H;

    @Nullable
    protected Button I;

    @Nullable
    protected RoundedImageView J;
    protected int K;
    protected int L;
    protected boolean M;
    private int N;
    protected RelativeLayout y;

    @Nullable
    protected RealtimeBlurLinearLayout z;

    /* renamed from: sg.bigo.ads.k.b$6, reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[sg.bigo.ads.ad.interstitial.b.values().length];
            a = iArr;
            try {
                iArr[sg.bigo.ads.ad.interstitial.b.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[sg.bigo.ads.ad.interstitial.b.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[sg.bigo.ads.ad.interstitial.b.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[sg.bigo.ads.ad.interstitial.b.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[sg.bigo.ads.ad.interstitial.b.d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @RequiresApi
    protected class a extends b.a {
        private RectF b;
        private RectF c;
        private RectF d;
        private float e = Float.NaN;
        private RectF f;

        protected a() {
        }

        @Override // sg.bigo.ads.common.utils.b.a
        @CallSuper
        public final void a(TransitionValues transitionValues, TransitionValues transitionValues2) {
            if (transitionValues.view == b.this.z) {
                Rect rect = (Rect) transitionValues.values.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) transitionValues2.values.get("android:changeBounds:bounds");
                b bVar = b.this;
                Rect rect3 = new Rect(sg.bigo.ads.common.utils.v.a(bVar.C, bVar.K));
                this.b = new RectF(rect3);
                if (rect3.intersect(rect2)) {
                    this.c = new RectF(rect);
                    this.d = new RectF(rect2);
                    this.e = b.this.C.getTranslationY();
                    this.f = new RectF(rect2);
                }
            }
        }

        @Override // sg.bigo.ads.common.utils.b.a
        public final void a(Object obj, Object obj2) {
            if (obj != b.this.z || this.c == null || this.d == null || this.f == null || this.b == null || !(obj2 instanceof PointF) || Float.isNaN(this.e)) {
                return;
            }
            PointF pointF = (PointF) obj2;
            if (this.c.centerX() != this.d.centerX()) {
                b.this.C.setTranslationY(this.e - (Math.abs(this.f.top - this.b.bottom) * (Math.abs(pointF.x - this.c.left) / Math.abs(this.d.left - this.c.left))));
            } else {
                this.f.offsetTo(pointF.x, pointF.y);
                if (new RectF(this.b).intersect(this.f)) {
                    b.this.C.setTranslationY((this.e + this.f.top) - this.b.bottom);
                }
            }
        }
    }

    public b(@NonNull sg.bigo.ads.y.b bVar) {
        super(bVar);
        this.L = -1;
        this.M = false;
    }

    private boolean M() {
        return ((sg.bigo.ads.cp.a) ((sg.bigo.ads.ad.interstitial.u) this).c.f()).aZ();
    }

    private void a(@ColorInt int i, @ColorInt int i2, int i3) {
        if (this.z != null) {
            float f = i3;
            this.z.setBackground(sg.bigo.ads.common.utils.e.a(f, f, f, f, i, i2, sg.bigo.ads.common.utils.f.a(r0.getContext(), 1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public sg.bigo.ads.an.p b(int i, int i2, int i3, int i4) {
        sg.bigo.ads.an.p pVar;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.D.getLayoutParams();
        sg.bigo.ads.an.p a2 = sg.bigo.ads.ad.interstitial.s.a(((sg.bigo.ads.ad.interstitial.u) this).c);
        if (a2.a(i, i2)) {
            this.D.setCornerRadius(0.0f);
            marginLayoutParams.setMargins(0, 0, 0, 0);
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            pVar = new sg.bigo.ads.an.p(i, i2);
        } else {
            this.D.setCornerRadius(sg.bigo.ads.common.utils.f.a(r2.getContext(), 8));
            marginLayoutParams.setMargins(i3, i4, i3, i4);
            sg.bigo.ads.an.p a3 = sg.bigo.ads.an.p.a(a2.b, a2.c, i - (i3 * 2), i2 - (i4 * 2));
            int i5 = a3.b;
            marginLayoutParams.width = i5;
            int i6 = a3.c;
            marginLayoutParams.height = i6;
            pVar = new sg.bigo.ads.an.p(i5, i6);
        }
        sg.bigo.ads.common.utils.v.c(this.E, -1, -1);
        this.D.setLayoutParams(marginLayoutParams);
        return pVar;
    }

    private void b(@ColorInt int i, @ColorInt int i2, int i3) {
        if (this.z != null) {
            float f = i3;
            this.z.setBlurStyle(new sg.bigo.ads.cb.b(f, f, f, f, i, i2, sg.bigo.ads.common.utils.f.a(r0.getContext(), 1)));
        }
    }

    protected void A() {
        B();
    }

    public final void B() {
        if (v()) {
            Button button = this.H;
            if (button != null) {
                sg.bigo.ads.ad.interstitial.c.e(button);
            }
            Button button2 = this.I;
            if (button2 != null) {
                sg.bigo.ads.ad.interstitial.c.e(button2);
            }
        }
    }

    protected final void C() {
        Button button;
        if (this.r == null || (button = this.C) == null || button.getVisibility() != 0) {
            return;
        }
        float translationY = this.C.getTranslationY();
        RectF rectF = new RectF(sg.bigo.ads.common.utils.v.a(this.C, this.K));
        rectF.offset(0.0f, -translationY);
        float f = rectF.top;
        RectF rectF2 = new RectF(sg.bigo.ads.common.utils.v.a(this.w, 0));
        float f2 = rectF2.top;
        if (rectF2.intersect(rectF)) {
            rectF.offset(0.0f, f2 - rectF.bottom);
        }
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.z;
        if (realtimeBlurLinearLayout != null && realtimeBlurLinearLayout.getVisibility() == 0) {
            RectF rectF3 = new RectF(sg.bigo.ads.common.utils.v.a(this.z, 0));
            float f3 = rectF3.top;
            if (rectF3.intersect(rectF)) {
                rectF.offset(0.0f, f3 - rectF.bottom);
            }
        }
        float f4 = rectF.top;
        if (f4 != f) {
            this.C.setTranslationY(f4 - f);
        } else {
            this.C.setTranslationY(0.0f);
        }
    }

    protected final void D() {
        sg.bigo.ads.common.utils.v.a(this.D, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.k.b.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                b.this.C();
            }
        });
    }

    protected void E() {
        if (this.z == null) {
            return;
        }
        final int y = y();
        Runnable runnable = new Runnable() { // from class: sg.bigo.ads.k.b.4
            @Override // java.lang.Runnable
            public final void run() {
                b.this.z.post(new Runnable() { // from class: sg.bigo.ads.k.b.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        b.this.a(y > 0);
                    }
                });
            }
        };
        if (y == 0) {
            runnable.run();
        } else {
            a(y, runnable);
        }
    }

    protected void F() {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.z;
        if (realtimeBlurLinearLayout == null || this.r == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = realtimeBlurLinearLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -(this.r.getMeasuredHeight() - sg.bigo.ads.common.utils.v.a(this.r, this.z).y);
            this.z.requestLayout();
        }
    }

    protected void G() {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.z;
        if (realtimeBlurLinearLayout == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = realtimeBlurLinearLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.N;
            this.z.requestLayout();
        }
    }

    protected void H() {
        sg.bigo.ads.ad.interstitial.x xVar = this.t;
        int i = xVar != null ? xVar.i : 0;
        View findViewById = this.r.findViewById(R.id.inter_media_container);
        sg.bigo.ads.y.a.a(findViewById, 9);
        sg.bigo.ads.ad.interstitial.x xVar2 = this.t;
        if (xVar2 == null || !xVar2.g) {
            MediaView mediaView = this.E;
            if (mediaView != null) {
                mediaView.setOtherClickAreaClick(false);
            }
            if (findViewById != null) {
                sg.bigo.ads.y.a.a(this.r, findViewById, 8, sg.bigo.ads.ad.interstitial.r.H, 0);
            }
        } else {
            MediaView mediaView2 = this.E;
            if (mediaView2 != null) {
                mediaView2.setOtherClickAreaClick(true);
            }
            if (findViewById != null) {
                sg.bigo.ads.y.a.a(this.r, findViewById, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, i);
            }
        }
        sg.bigo.ads.ad.interstitial.x xVar3 = this.t;
        boolean z = xVar3 != null && xVar3.f;
        MediaView mediaView3 = this.E;
        if (mediaView3 != null) {
            sg.bigo.ads.y.a.a(this.r, mediaView3, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, i);
            this.E.setMediaAreaClickable(z);
            this.E.b().a(!z);
        }
        sg.bigo.ads.ad.interstitial.x xVar4 = this.t;
        boolean z2 = xVar4 != null && xVar4.h;
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.z;
        if (realtimeBlurLinearLayout != null) {
            sg.bigo.ads.y.a.a(realtimeBlurLinearLayout, 18);
            ViewGroup viewGroup = this.r;
            if (z2) {
                sg.bigo.ads.y.a.a(viewGroup, this.z, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, this.t.i);
            } else {
                sg.bigo.ads.y.a.a(viewGroup, this.z, 8, sg.bigo.ads.ad.interstitial.r.H, 0);
            }
        }
    }

    @Override // sg.bigo.ads.q.d
    public final int I() {
        if (this.L == -1) {
            sg.bigo.ads.ai.o oVar = this.u;
            this.L = oVar != null ? oVar.a("video_play_page.webview_layout") : 0;
        }
        int i = this.L;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return i;
            default:
                return 0;
        }
    }

    @Override // sg.bigo.ads.q.d
    public final int J() {
        return sg.bigo.ads.k.a.a(this.u, "video_play_page.webview_force_time", "video_play_page.webview_force_time_new");
    }

    @Override // sg.bigo.ads.q.d
    public final boolean K() {
        int I = I();
        return I == 5 || I == 6;
    }

    @Override // sg.bigo.ads.q.d
    public final boolean L() {
        return this.M;
    }

    @Override // sg.bigo.ads.k.a
    protected final void a(double d) {
        if (d <= 3.0d) {
            TextView textView = this.w;
            if (textView != null) {
                textView.setTextColor(sg.bigo.ads.bv.b.a(sg.bigo.ads.ad.interstitial.d.b, 0.6f));
                return;
            }
            return;
        }
        TextView textView2 = this.w;
        if (textView2 != null) {
            textView2.setTextColor(sg.bigo.ads.bv.b.a(sg.bigo.ads.ad.interstitial.d.a, 0.6f));
        }
    }

    @Override // sg.bigo.ads.q.d
    public final void a(int i, int i2, int i3, int i4) {
        if (K()) {
            if (i >= i3) {
                this.M = true;
                return;
            }
            this.M = false;
            if (this.y != null) {
                int min = (i3 - Math.min(i, i2)) + i4;
                ViewGroup.LayoutParams layoutParams = this.y.getLayoutParams();
                if (min != layoutParams.height) {
                    layoutParams.height = min;
                    this.y.requestLayout();
                    b(this.y.getMeasuredWidth(), layoutParams.height, sg.bigo.ads.common.utils.f.a(this.D.getContext(), 12), sg.bigo.ads.common.utils.f.a(this.D.getContext(), 12));
                    C();
                }
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public void a(@NonNull View view) {
        sg.bigo.ads.ax.b bVar;
        View findViewById = view.findViewById(R.id.inter_ad_tag_layout);
        if (findViewById == null || (bVar = this.d) == null) {
            return;
        }
        bVar.a(findViewById, 0);
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final void a(@NonNull ViewGroup viewGroup, @NonNull View view, int i, int i2, int i3, @Nullable View... viewArr) {
        super.a(viewGroup, view, i, i2, i3, viewArr);
        H();
        sg.bigo.ads.ad.interstitial.u.b((View) this.r);
    }

    protected final void a(boolean z) {
        if (this.z == null || this.x) {
            return;
        }
        final a.C1909a u = u();
        Button button = this.H;
        if (button != null) {
            sg.bigo.ads.ad.interstitial.d.b(button, u.a);
        }
        if (z) {
            F();
            this.z.setVisibility(0);
            this.z.post(new Runnable() { // from class: sg.bigo.ads.k.b.5
                @Override // java.lang.Runnable
                public final void run() {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(b.this.new a());
                    transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.an.h() { // from class: sg.bigo.ads.k.b.5.1
                        @Override // sg.bigo.ads.an.h, android.transition.Transition.TransitionListener
                        public final void onTransitionEnd(Transition transition) {
                            b.this.A();
                            AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                            if (u.b) {
                                b bVar = b.this;
                                bVar.a(bVar.H, new b.a());
                            }
                        }

                        @Override // sg.bigo.ads.an.h, android.transition.Transition.TransitionListener
                        public final void onTransitionStart(Transition transition) {
                        }
                    });
                    transitionSet.setDuration(300L);
                    TransitionManager.beginDelayedTransition(b.this.s, transitionSet);
                    b.this.G();
                }
            });
        } else {
            this.z.setVisibility(0);
            C();
            A();
            if (u.b) {
                a(this.H, new b.a());
            }
        }
    }

    protected boolean a(@NonNull sg.bigo.ads.ad.interstitial.b bVar) {
        ViewGroup viewGroup;
        if (y() < 0 || (viewGroup = this.r) == null) {
            return false;
        }
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(z());
        if (viewStub != null) {
            this.A = (ViewGroup) viewStub.inflate();
        }
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = (RealtimeBlurLinearLayout) this.r.findViewById(R.id.inter_component_layout);
        this.z = realtimeBlurLinearLayout;
        if (realtimeBlurLinearLayout == null) {
            return false;
        }
        this.J = (RoundedImageView) realtimeBlurLinearLayout.findViewById(R.id.inter_icon);
        this.F = (TextView) this.z.findViewById(R.id.inter_title);
        TextView textView = (TextView) this.z.findViewById(R.id.inter_description);
        this.G = textView;
        bVar.a(this.F, textView);
        bVar.a(this.J);
        sg.bigo.ads.common.utils.v.a(this.z, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.k.b.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                b.this.E();
            }
        });
        ViewGroup.LayoutParams layoutParams = this.z.getLayoutParams();
        layoutParams.width = -1;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.N = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        this.z.setVisibility(4);
        this.z.requestLayout();
        return true;
    }

    protected void b(@NonNull sg.bigo.ads.ad.interstitial.b bVar) {
        float a2 = sg.bigo.ads.common.utils.f.a(this.z.getContext(), 8);
        Button button = (Button) this.z.findViewById(R.id.inter_btn_cta_main);
        this.I = button;
        if (button != null) {
            button.setBackground(sg.bigo.ads.common.utils.e.a(a2, a2, a2, a2, (Rect) null, -16724924));
            bVar.a(this.I);
        }
        Button button2 = (Button) this.z.findViewById(R.id.inter_btn_cta);
        this.H = button2;
        if (button2 != null) {
            button2.setBackground(sg.bigo.ads.common.utils.e.a(a2, a2, a2, a2, (Rect) null, 0));
            bVar.a(this.H);
        }
    }

    @Override // sg.bigo.ads.k.a
    @Nullable
    public final ViewGroup k() {
        return this.D;
    }

    @Override // sg.bigo.ads.k.a
    @Nullable
    public final MediaView l() {
        return this.E;
    }

    @Override // sg.bigo.ads.k.a
    @Nullable
    public final Button m() {
        return this.C;
    }

    @Override // sg.bigo.ads.k.a
    public final boolean n() {
        return true;
    }

    @Override // sg.bigo.ads.k.a
    protected final void q() {
        String j = ((sg.bigo.ads.cp.a) ((sg.bigo.ads.ad.interstitial.u) this).c.f()).j();
        TextView textView = (TextView) this.r.findViewById(R.id.inter_advertiser);
        if (TextUtils.isEmpty(j)) {
            textView.setVisibility(8);
        } else {
            textView.setText(j);
        }
    }

    @Override // sg.bigo.ads.k.a
    protected void t() {
        Integer a2;
        Integer a3;
        super.t();
        this.y = (RelativeLayout) this.r.findViewById(R.id.inter_media_component);
        this.B = (ViewGroup) this.r.findViewById(R.id.inter_warning_layout);
        this.C = (Button) this.r.findViewById(R.id.inter_btn_mute);
        this.D = (RoundedFrameLayout) this.r.findViewById(R.id.inter_media_layout);
        this.E = (MediaView) this.r.findViewById(R.id.inter_media);
        this.K = sg.bigo.ads.common.utils.f.a(this.C.getContext(), 12);
        this.E.setImageBlurBorder(false);
        sg.bigo.ads.common.utils.v.a(this.D, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.k.b.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int a4 = sg.bigo.ads.common.utils.f.a(b.this.D.getContext(), 12);
                b bVar = b.this;
                bVar.b(bVar.D.getMeasuredWidth(), b.this.D.getMeasuredHeight(), a4, a4);
                b.this.D();
            }
        });
        sg.bigo.ads.ai.o oVar = this.u;
        int a4 = oVar != null ? oVar.a("video_play_page.ad_component_colour", 2) : 2;
        sg.bigo.ads.ad.interstitial.b bVar = a4 != 1 ? a4 != 3 ? M() ? sg.bigo.ads.ad.interstitial.b.b : sg.bigo.ads.ad.interstitial.b.d : M() ? sg.bigo.ads.ad.interstitial.b.c : sg.bigo.ads.ad.interstitial.b.e : sg.bigo.ads.ad.interstitial.b.a;
        a(bVar);
        b(bVar);
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.z;
        if (realtimeBlurLinearLayout != null) {
            int a5 = sg.bigo.ads.common.utils.f.a(realtimeBlurLinearLayout.getContext(), 12);
            if (M()) {
                if (this.z != null) {
                    int i = AnonymousClass6.a[bVar.ordinal()];
                    if (i != 1) {
                        a(sg.bigo.ads.bv.b.a((i == 2 && (a3 = sg.bigo.ads.ad.interstitial.s.a((NativeAd) ((sg.bigo.ads.ad.interstitial.u) this).c)) != null) ? a3.intValue() : -12303292, 0.5f), sg.bigo.ads.bv.b.a(-1, 0.1f), a5);
                    }
                    a(-1, -1, a5);
                }
                bVar.b(this.z);
                bVar.a(this.F, this.G);
            }
            if (this.z != null) {
                int i2 = AnonymousClass6.a[bVar.ordinal()];
                if (i2 != 1) {
                    if (i2 == 4 && (a2 = sg.bigo.ads.ad.interstitial.s.a((NativeAd) ((sg.bigo.ads.ad.interstitial.u) this).c)) != null) {
                        b(sg.bigo.ads.bv.b.a(a2.intValue(), 0.35f), sg.bigo.ads.bv.b.a(a2.intValue(), 0.1f), a5);
                    } else {
                        b(sg.bigo.ads.bv.b.a(-3355444, 0.35f), sg.bigo.ads.bv.b.a(-1, 0.1f), a5);
                    }
                }
                a(-1, -1, a5);
            }
            bVar.b(this.z);
            bVar.a(this.F, this.G);
        }
    }

    protected int z() {
        return R.id.inter_component_19;
    }
}
