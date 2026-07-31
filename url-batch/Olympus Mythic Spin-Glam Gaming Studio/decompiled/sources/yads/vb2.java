package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public abstract class vb2 extends oo implements r01, hd2, jl3 {
    public static boolean j;
    public final Context b;
    public final kl3 c;
    public final id2 d;
    public final h03 e;
    public t01 f;
    public s01 g;
    public boolean h;
    public boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vb2(Context context, vn3 vn3Var, AttributeSet attributeSet, int i) {
        super(r3, attributeSet);
        int i2;
        vn3Var = (i & 2) != 0 ? new vn3() : vn3Var;
        attributeSet = (i & 4) != 0 ? null : attributeSet;
        Context applicationContext = context.getApplicationContext();
        kl3 kl3Var = new kl3();
        id2 a = id2.h.a(applicationContext);
        this.b = applicationContext;
        this.c = kl3Var;
        this.d = a;
        this.e = new h03();
        setBackgroundColor(0);
        setVisibility(4);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setScrollBarStyle(0);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setSupportZoom(false);
        getSettings().setBuiltInZoomControls(false);
        getSettings().setTextZoom(100);
        getSettings().setMinimumFontSize(1);
        getSettings().setMinimumLogicalFontSize(1);
        WebSettings settings = getSettings();
        uw2.a();
        synchronized (vw2.k) {
        }
        int ordinal = vn3Var.a.ordinal();
        if (ordinal == 0) {
            i2 = -1;
        } else if (ordinal != 1) {
            i2 = 3;
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 2;
            }
        } else {
            i2 = 1;
        }
        settings.setCacheMode(i2);
        WebSettings settings2 = getSettings();
        if (pa.a(21)) {
            settings2.setMixedContentMode(2);
        }
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        setWebViewClient(new q01(this));
        setWebChromeClient(new m01());
        if (j) {
            return;
        }
        j = true;
    }

    public void a(Context context, String str) {
        t01 t01Var = this.f;
        if (t01Var != null) {
            t01Var.a(str);
        }
    }

    @Override // yads.oo
    public final String b() {
        return "<style type='text/css'> \n  * { \n      -webkit-tap-highlight-color: rgba(0, 0, 0, 0) !important; \n      -webkit-focus-ring-color: rgba(0, 0, 0, 0) !important; \n      outline: none !important; \n    } \n</style> \n" + un3.a();
    }

    @Override // yads.oo
    public final void c() {
        setHtmlWebViewListener(null);
        super.c();
    }

    public abstract void d();

    @Override // yads.oo, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("Yandex|SafeDK: Execution> Lyads/vb2;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.y, this, motionEvent);
        return safedk_vb2_dispatchTouchEvent_c1d5353631dc8e1f08ccced2fc133280(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = true;
        this.d.a(this);
        this.c.getClass();
        a(kl3.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.i = false;
        this.c.getClass();
        a(kl3.a(this));
        this.d.b(this);
        super.onDetachedFromWindow();
    }

    @Override // yads.oo, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.c.getClass();
        a(kl3.a(this));
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.c.getClass();
        a(kl3.a(this));
    }

    public boolean safedk_vb2_dispatchTouchEvent_c1d5353631dc8e1f08ccced2fc133280(MotionEvent p0) {
        t01 t01Var;
        if (p0 != null && p0.getAction() == 0 && (t01Var = this.f) != null) {
            t01Var.a();
        }
        return super.dispatchTouchEvent(p0);
    }

    public final void setHtmlWebViewErrorListener(@Nullable s01 s01Var) {
        this.g = s01Var;
    }

    public void setHtmlWebViewListener(@Nullable t01 t01Var) {
        this.f = t01Var;
    }

    @Override // yads.r01
    public void a() {
        h03 h03Var = this.e;
        Runnable runnable = new Runnable() { // from class: yads.vb2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                vb2.a(vb2.this);
            }
        };
        synchronized (h03Var.a) {
            if (h03Var.b) {
                return;
            }
            h03Var.b = true;
            Unit unit = Unit.INSTANCE;
            runnable.run();
        }
    }

    public static final void a(vb2 vb2Var) {
        vb2Var.d();
    }

    @Override // yads.r01
    public void a(int i) {
        s01 s01Var = this.g;
        if (s01Var != null) {
            s01Var.a(i);
        }
    }

    @Override // yads.hd2
    public final void a(dd2 dd2Var) {
        boolean z;
        if (dd2Var != dd2.c) {
            this.c.getClass();
            if (kl3.a(this) && this.d.a()) {
                z = true;
                a(z);
            }
        }
        z = false;
        a(z);
    }

    public final void a(boolean z) {
        if (this.h != z) {
            this.h = z;
            t01 t01Var = this.f;
            if (t01Var != null) {
                t01Var.a(z);
            }
        }
    }
}
