package com.my.target;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.my.target.fe;
import com.my.target.o;
import com.my.target.u2;
import com.my.target.wh;
import com.my.target.y0;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes14.dex */
public final class xc implements o.a, y0.a {
    private final wc a;
    private pj b;
    private WeakReference c;
    private WeakReference d;
    private a e;
    private fe f;
    private y0 g;
    private boolean h;
    private boolean i;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a(wc wcVar, String str, View view, Context context);
    }

    private xc(wc wcVar) {
        this.a = wcVar;
    }

    public static xc a(wc wcVar) {
        return new xc(wcVar);
    }

    @Override // com.my.target.y0.a
    public void b() {
    }

    @Override // com.my.target.o.a
    public void m() {
        if (this.c != null) {
            if (!this.h) {
                wh.b(this.a.H(), "closedByUser", 999);
            }
            this.c.clear();
            this.c = null;
        }
        pj pjVar = this.b;
        if (pjVar != null) {
            pjVar.e();
            this.b = null;
        }
        WeakReference weakReference = this.d;
        if (weakReference != null) {
            weakReference.clear();
            this.d = null;
        }
        fe feVar = this.f;
        if (feVar != null) {
            feVar.a();
        }
        y0 y0Var = this.g;
        if (y0Var != null) {
            y0Var.a(this.f != null ? 7000 : 0);
        }
    }

    public void a(a aVar) {
        this.e = aVar;
    }

    @Override // com.my.target.o.a
    public void b(boolean z) {
        y0 y0Var;
        if (z == this.i) {
            return;
        }
        this.i = z;
        pj pjVar = this.b;
        if (pjVar == null) {
            return;
        }
        if (!z) {
            pjVar.e();
            return;
        }
        WeakReference weakReference = this.d;
        if (weakReference == null || (y0Var = (y0) weakReference.get()) == null) {
            return;
        }
        this.b.b(y0Var);
    }

    public void a(Context context) {
        o a2 = o.a(this, context);
        this.c = new WeakReference(a2);
        try {
            a2.show();
        } catch (Throwable th) {
            th.printStackTrace();
            mi.b("Unable to start video dialog! Check myTarget MediaAdView, maybe it was created with non-Activity context");
            m();
        }
    }

    @Override // com.my.target.o.a
    public void a(final o oVar, FrameLayout frameLayout) {
        u2 u2Var = new u2(frameLayout.getContext());
        u2Var.setOnCloseListener(new u2.a() { // from class: com.my.target.xc$$ExternalSyntheticLambda0
            @Override // com.my.target.u2.a
            public final void b() {
                xc.this.b(oVar);
            }
        });
        frameLayout.addView(u2Var, -1, -1);
        y0 y0Var = new y0(frameLayout.getContext());
        this.g = y0Var;
        y0Var.setVisibility(8);
        this.g.setBannerWebViewListener(this);
        u2Var.addView(this.g, new FrameLayout.LayoutParams(-1, -1));
        this.g.setData(this.a.X());
        final ProgressBar progressBar = new ProgressBar(frameLayout.getContext(), null, android.R.attr.progressBarStyle);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        frameLayout.postDelayed(new Runnable() { // from class: com.my.target.xc$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                xc.this.a(progressBar);
            }
        }, 555L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ProgressBar progressBar) {
        a(this.g, progressBar);
    }

    @Override // com.my.target.y0.a
    public void a(WebView webView, int i, String str, String str2) {
        mi.a("NativeAdContentController: Content JS error - " + str);
    }

    @Override // com.my.target.y0.a
    public void a(String str) {
        o oVar;
        WeakReference weakReference;
        WeakReference weakReference2 = this.c;
        if (weakReference2 == null || (oVar = (o) weakReference2.get()) == null) {
            return;
        }
        a aVar = this.e;
        if (aVar != null && (weakReference = this.d) != null) {
            aVar.a(this.a, str, (View) weakReference.get(), oVar.getContext());
        }
        this.h = true;
        b(oVar);
    }

    @Override // com.my.target.y0.a
    public void a(WebView webView, String str) {
        fe feVar = this.f;
        if (feVar == null) {
            return;
        }
        feVar.a(webView, new fe.b[0]);
        this.f.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(o oVar) {
        if (oVar.isShowing()) {
            oVar.dismiss();
        }
    }

    private void a(y0 y0Var, ProgressBar progressBar) {
        this.f = fe.a(this.a, 1, null, y0Var.getContext());
        this.d = new WeakReference(y0Var);
        progressBar.setVisibility(8);
        y0Var.setVisibility(0);
        pj pjVar = this.b;
        if (pjVar != null) {
            pjVar.e();
        }
        pj a2 = pj.a(this.a.P(), this.a.H(), (wh.c) null);
        this.b = a2;
        if (this.i) {
            a2.b(y0Var);
        }
    }
}
