package com.my.target;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.ph;
import com.my.target.qh;
import com.my.target.y0;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class gk implements qh, y0.a {
    private final y0 a;
    private final h3 b;
    private ph.a c;
    private qh.a d;
    private gh e;

    gk(y0 y0Var, h3 h3Var) {
        this.a = y0Var;
        this.b = h3Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        h3Var.addView(y0Var, 0);
        y0Var.setLayoutParams(layoutParams);
        y0Var.setBannerWebViewListener(this);
    }

    public static gk a(Context context) {
        return new gk(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        d(str);
        this.a.setOnLayoutListener(null);
    }

    private void d(String str) {
        this.a.setData(str);
    }

    @Override // com.my.target.y0.a
    public void a(WebView webView, int i, String str, String str2) {
    }

    @Override // com.my.target.ph
    public void a(boolean z) {
    }

    @Override // com.my.target.y0.a
    public void b() {
        ph.a aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    @Override // com.my.target.ph
    public h3 getView() {
        return this.b;
    }

    @Override // com.my.target.ph
    public void pause() {
    }

    @Override // com.my.target.ph
    public void resume() {
    }

    @Override // com.my.target.ph
    public void start() {
        gh ghVar;
        ph.a aVar = this.c;
        if (aVar == null || (ghVar = this.e) == null) {
            return;
        }
        aVar.a(ghVar);
    }

    @Override // com.my.target.ph
    public void a(gh ghVar) {
        this.e = ghVar;
        final String Y = ghVar.Y();
        if (Y == null) {
            a(q.q);
            return;
        }
        if (this.a.getMeasuredHeight() == 0 || this.a.getMeasuredWidth() == 0) {
            this.a.setOnLayoutListener(new y0.d() { // from class: com.my.target.gk$$ExternalSyntheticLambda0
                @Override // com.my.target.y0.d
                public final void a() {
                    gk.this.c(Y);
                }
            });
        } else {
            d(Y);
        }
        qh.a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
    }

    private void b(String str) {
        gh ghVar;
        ph.a aVar = this.c;
        if (aVar == null || (ghVar = this.e) == null) {
            return;
        }
        aVar.a(ghVar, str);
    }

    private gk(Context context) {
        this(new y0(context), new h3(context));
    }

    @Override // com.my.target.ph
    public void a(ph.a aVar) {
        this.c = aVar;
    }

    @Override // com.my.target.ph
    public void a(int i) {
        a((qh.a) null);
        a((ph.a) null);
        if (this.a.getParent() != null) {
            ((ViewGroup) this.a.getParent()).removeView(this.a);
        }
        this.a.a(i);
    }

    @Override // com.my.target.qh
    public void a(qh.a aVar) {
        this.d = aVar;
    }

    @Override // com.my.target.y0.a
    public void a(String str) {
        if (this.e != null) {
            b(str);
        }
    }

    @Override // com.my.target.y0.a
    public void a(WebView webView, String str) {
        ph.a aVar = this.c;
        if (aVar != null) {
            aVar.a(webView);
        }
    }

    private void a(IAdLoadingError iAdLoadingError) {
        qh.a aVar = this.d;
        if (aVar != null) {
            aVar.a(iAdLoadingError);
        }
    }
}
