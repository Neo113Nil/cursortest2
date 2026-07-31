package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.my.target.ads.MyTargetView;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.dc;
import com.my.target.fe;
import com.my.target.g;
import com.my.target.ph;
import com.my.target.pj;
import com.my.target.qh;
import com.my.target.s5;
import com.my.target.tb;
import com.my.target.wh;
import java.util.Iterator;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes11.dex */
public final class ih implements s5 {
    private final fe a;
    private final MyTargetView b;
    private final gh c;
    private final Context d;
    private final ph.a e = new c(this);
    private final uh f;
    private final pj g;
    private final mj h;
    private final g i;
    private final tb.a j;
    private ph k;
    private s5.a l;
    private boolean m;
    private tb n;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a extends pj.a {
        final /* synthetic */ com.my.target.b a;

        a(com.my.target.b bVar) {
            this.a = bVar;
        }

        @Override // com.my.target.pj.a
        public void b() {
            mi.a("StandardAdEngine: Ad shown, banner Id = " + this.a.x());
            tb tbVar = ih.this.n;
            if (tbVar != null) {
                tbVar.b();
                ih.this.n.d();
            }
            s5.a aVar = ih.this.l;
            if (aVar != null) {
                aVar.f();
            }
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class b implements g.a {
        b() {
        }

        @Override // com.my.target.g.a
        public void b() {
            ih.this.b();
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static class c implements ph.a {
        private final ih a;

        public c(ih ihVar) {
            this.a = ihVar;
        }

        @Override // com.my.target.ph.a
        public void a(com.my.target.b bVar, String str) {
            this.a.a(bVar, str);
        }

        @Override // com.my.target.ph.a
        public void b() {
            this.a.g();
        }

        @Override // com.my.target.ph.a
        public void a(com.my.target.b bVar) {
            this.a.a(bVar);
        }

        @Override // com.my.target.ph.a
        public void a(WebView webView) {
            this.a.a(webView);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class d implements qh.a {
        private final ih a;

        d(ih ihVar) {
            this.a = ihVar;
        }

        @Override // com.my.target.qh.a
        public void a() {
            this.a.f();
        }

        @Override // com.my.target.qh.a
        public void a(IAdLoadingError iAdLoadingError) {
            this.a.a(iAdLoadingError);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class e implements dc.c {
        private final ih a;

        public e(ih ihVar) {
            this.a = ihVar;
        }

        @Override // com.my.target.dc.c
        public void a() {
            this.a.f();
        }

        @Override // com.my.target.dc.c
        public void d() {
            this.a.e();
        }

        @Override // com.my.target.dc.c
        public void e() {
            this.a.c();
        }

        @Override // com.my.target.dc.c
        public void a(IAdLoadingError iAdLoadingError) {
            this.a.a(iAdLoadingError);
        }

        @Override // com.my.target.dc.c
        public void a(String str, gh ghVar) {
            this.a.a(str, ghVar);
        }

        @Override // com.my.target.dc.c
        public void a(float f, float f2, gh ghVar) {
            this.a.a(f, f2);
        }
    }

    private ih(MyTargetView myTargetView, gh ghVar, tb.a aVar) {
        this.b = myTargetView;
        this.c = ghVar;
        this.d = myTargetView.getContext();
        this.j = aVar;
        this.f = ghVar.H().c();
        this.g = pj.a(ghVar.P(), ghVar.H(), (wh.c) null);
        this.h = mj.a(ghVar.H(), null);
        this.i = g.a(ghVar.a());
        this.a = fe.a(ghVar, 1, null, myTargetView.getContext());
    }

    public static ih a(MyTargetView myTargetView, gh ghVar, tb.a aVar) {
        return new ih(myTargetView, ghVar, aVar);
    }

    private void h() {
        dc a2;
        ph phVar = this.k;
        if (phVar instanceof dc) {
            a2 = (dc) phVar;
        } else {
            if (phVar != null) {
                phVar.a((ph.a) null);
                this.k.a(this.a != null ? 7000 : 0);
            }
            a2 = dc.a(this.b);
            a2.a(this.e);
            this.k = a2;
            a(a2.getView());
        }
        a2.a(new e(this));
        a2.a(this.c);
    }

    private void i() {
        qh a2;
        ph phVar = this.k;
        if (phVar instanceof gk) {
            a2 = (qh) phVar;
        } else {
            if (phVar != null) {
                phVar.a((ph.a) null);
                this.k.a(this.a != null ? 7000 : 0);
            }
            a2 = gk.a(this.d);
            a2.a(this.e);
            this.k = a2;
            a(a2.getView());
        }
        a2.a(new d(this));
        a2.a(this.c);
    }

    void b() {
        wh.b(this.c.H(), "closedByUser", 999);
        s5.a aVar = this.l;
        if (aVar == null) {
            return;
        }
        aVar.g();
    }

    void c() {
        s5.a aVar = this.l;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // com.my.target.s5
    public float d() {
        return 0.0f;
    }

    @Override // com.my.target.s5
    public void destroy() {
        this.g.e();
        this.h.c();
        this.i.a();
        fe feVar = this.a;
        if (feVar != null) {
            feVar.a();
        }
        ph phVar = this.k;
        if (phVar != null) {
            phVar.a(this.a != null ? 7000 : 0);
            this.k = null;
        }
    }

    void e() {
        s5.a aVar = this.l;
        if (aVar != null) {
            aVar.d();
        }
    }

    void f() {
        s5.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void g() {
        wh.b(this.c.H(), "error", 1);
        this.c.f().a(1, 5500);
        s5.a aVar = this.l;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    @Override // com.my.target.s5
    public void pause() {
        ph phVar = this.k;
        if (phVar != null) {
            phVar.pause();
        }
        this.m = false;
        this.g.e();
        this.h.a((View) null);
    }

    @Override // com.my.target.s5
    public void prepare() {
        this.n = this.j.b();
        if ("mraid".equals(this.c.M())) {
            h();
        } else {
            i();
        }
    }

    @Override // com.my.target.s5
    public void resume() {
        ph phVar = this.k;
        if (phVar != null) {
            phVar.resume();
        }
        this.m = true;
        this.g.b(this.b);
        this.h.a(this.b);
        this.h.b();
    }

    @Override // com.my.target.s5
    public void start() {
        this.m = true;
        ph phVar = this.k;
        if (phVar != null) {
            phVar.start();
        }
        this.h.a(this.b);
        this.h.b();
    }

    @Override // com.my.target.s5
    public void stop() {
        ph phVar = this.k;
        if (phVar != null) {
            phVar.a(this.a == null);
        }
        this.h.a((View) null);
    }

    @Override // com.my.target.s5
    public void a(s5.a aVar) {
        this.l = aVar;
    }

    @Override // com.my.target.s5
    public String a() {
        return "myTarget";
    }

    @Override // com.my.target.s5
    public void a(MyTargetView.AdSize adSize) {
        ph phVar = this.k;
        if (phVar == null) {
            return;
        }
        phVar.getView().a(adSize.getWidthPixels(), adSize.getHeightPixels());
    }

    void a(float f, float f2) {
        if (this.f.c.isEmpty()) {
            return;
        }
        float f3 = f2 - f;
        uh a2 = this.f.a();
        Iterator it = this.f.c.iterator();
        while (it.hasNext()) {
            xe xeVar = (xe) it.next();
            float h = xeVar.h();
            if (h < 0.0f && xeVar.g() >= 0.0f) {
                h = (f2 / 100.0f) * xeVar.g();
            }
            if (h >= 0.0f && h <= f3) {
                a2.c.add(xeVar);
                it.remove();
            }
        }
        wh.a(a2, 1);
    }

    void a(String str, gh ghVar) {
        wh.b(ghVar.H(), str, 999);
    }

    void a(IAdLoadingError iAdLoadingError) {
        s5.a aVar = this.l;
        if (aVar != null) {
            aVar.a(iAdLoadingError);
        }
    }

    void a(com.my.target.b bVar, String str) {
        s5.a aVar = this.l;
        if (aVar != null) {
            aVar.c();
        }
        l2 a2 = l2.a(this.b.getCustomParams());
        if (TextUtils.isEmpty(str)) {
            a2.a(bVar, 1, this.b.getWebFormClient(), this.b.getContext());
        } else {
            a2.a(bVar, str, 1, this.b.getWebFormClient(), this.b.getContext());
        }
    }

    void a(com.my.target.b bVar) {
        this.g.e();
        this.g.a(new a(bVar));
        if (this.m) {
            this.g.b(this.b);
        }
    }

    void a(WebView webView) {
        ph phVar;
        if (this.a == null || (phVar = this.k) == null) {
            return;
        }
        this.a.a(webView, new fe.b(phVar.getView().getAdChoicesView(), 3));
        this.a.c();
    }

    private void a(h3 h3Var) {
        if (this.k != null) {
            MyTargetView.AdSize size = this.b.getSize();
            this.k.getView().a(size.getWidthPixels(), size.getHeightPixels());
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        h3Var.setLayoutParams(layoutParams);
        this.b.removeAllViews();
        this.b.addView(h3Var);
        if (this.c.a() == null) {
            return;
        }
        this.i.a(h3Var.getAdChoicesView(), new b());
    }
}
