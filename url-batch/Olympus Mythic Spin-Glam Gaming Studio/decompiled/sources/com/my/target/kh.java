package com.my.target;

import android.app.Activity;
import com.my.target.ads.MyTargetView;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.p;
import com.my.target.s5;
import com.my.target.tb;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public class kh {
    final MyTargetView a;
    final n b;
    final b c;
    final c d;
    final tb.a e;
    private s5 f;
    private boolean g;
    private boolean h;
    private int i;
    private long j;
    private long k;
    private int l;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static class a implements s5.a {
        private final kh a;

        public a(kh khVar) {
            this.a = khVar;
        }

        @Override // com.my.target.s5.a
        public void a() {
            this.a.i();
        }

        @Override // com.my.target.s5.a
        public void b() {
            this.a.k();
        }

        @Override // com.my.target.s5.a
        public void c() {
            this.a.e();
        }

        @Override // com.my.target.s5.a
        public void d() {
            this.a.h();
        }

        @Override // com.my.target.s5.a
        public void e() {
            this.a.f();
        }

        @Override // com.my.target.s5.a
        public void f() {
            this.a.j();
        }

        @Override // com.my.target.s5.a
        public void g() {
            this.a.g();
        }

        @Override // com.my.target.s5.a
        public void a(IAdLoadingError iAdLoadingError) {
            this.a.a(iAdLoadingError);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static class b {
        private boolean a;
        private boolean b;
        private boolean c;
        private boolean d;
        private boolean e;
        private boolean f;
        private boolean g;

        b() {
        }

        public boolean a() {
            if (this.b || !this.a) {
                return false;
            }
            return this.g || !this.e;
        }

        public boolean b() {
            if (this.c && this.a) {
                return (this.g || this.e) && !this.f && this.b;
            }
            return false;
        }

        public boolean c() {
            if (this.d && this.c) {
                return (this.g || this.e) && !this.a;
            }
            return false;
        }

        public void d(boolean z) {
            this.e = z;
        }

        public boolean e() {
            return this.b;
        }

        public void f() {
            this.f = false;
            this.c = false;
        }

        public void g(boolean z) {
            this.a = z;
            this.b = false;
        }

        public void a(boolean z) {
            this.d = z;
        }

        public void b(boolean z) {
            this.f = z;
        }

        public void c(boolean z) {
            this.g = z;
        }

        public boolean d() {
            return this.a;
        }

        public void e(boolean z) {
            this.c = z;
        }

        public void f(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static class c implements Runnable {
        private final WeakReference a;

        c(kh khVar) {
            this.a = new WeakReference(khVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            kh khVar = (kh) this.a.get();
            if (khVar != null) {
                khVar.m();
            }
        }
    }

    private kh(MyTargetView myTargetView, n nVar, tb.a aVar) {
        b bVar = new b();
        this.c = bVar;
        this.g = true;
        this.i = -1;
        this.l = 0;
        this.a = myTargetView;
        this.b = nVar;
        this.e = aVar;
        this.d = new c(this);
        if (myTargetView.getContext() instanceof Activity) {
            bVar.c(false);
        } else {
            mi.a("StandardAdMasterEngine: MyTargetView was created with non-activity focus, so system cannot automatically handle lifecycle");
            bVar.c(true);
        }
    }

    public static kh a(MyTargetView myTargetView, n nVar, tb.a aVar) {
        return new kh(myTargetView, nVar, aVar);
    }

    private void d() {
        s();
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        MyTargetView.MyTargetViewListener listener = this.a.getListener();
        if (listener != null) {
            listener.onClick(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        MyTargetView.MyTargetViewListener listener = this.a.getListener();
        if (listener != null) {
            listener.onShow(this.a);
        }
    }

    public void b(nh nhVar) {
        if (this.c.d()) {
            r();
        }
        n();
        a(nhVar);
        s5 s5Var = this.f;
        if (s5Var == null) {
            return;
        }
        s5Var.a(new a(this));
        this.j = System.currentTimeMillis() + this.i;
        this.k = 0L;
        if (this.h && this.c.e()) {
            this.k = this.i;
        }
        this.f.prepare();
    }

    public float c() {
        s5 s5Var = this.f;
        if (s5Var != null) {
            return s5Var.d();
        }
        return 0.0f;
    }

    void f() {
        this.c.b(false);
        if (this.c.b()) {
            o();
        }
    }

    void g() {
        n();
    }

    void h() {
        if (this.c.a()) {
            l();
        }
        this.c.b(true);
    }

    void i() {
        if (this.g) {
            this.c.e(true);
            MyTargetView.MyTargetViewListener listener = this.a.getListener();
            if (listener != null) {
                listener.onLoad(this.a);
            }
            this.g = false;
        }
        if (this.c.c()) {
            q();
        }
    }

    void k() {
        this.l++;
        mi.b("WebView crashed " + this.l + " times");
        if (this.l <= 2) {
            mi.a("Try reload ad without notifying user");
            m();
            return;
        }
        mi.a("No more try to reload ad, notify user...");
        d();
        MyTargetView.MyTargetViewRenderCrashListener renderCrashListener = this.a.getRenderCrashListener();
        if (renderCrashListener != null) {
            renderCrashListener.onViewRenderCrash(this.a);
        }
    }

    void l() {
        s();
        if (this.h) {
            this.k = this.j - System.currentTimeMillis();
        }
        s5 s5Var = this.f;
        if (s5Var != null) {
            s5Var.pause();
        }
        this.c.f(true);
    }

    void m() {
        mi.a("StandardAdMasterEngine: Load new standard ad");
        jh.a(this.b, this.e).a(new p.b() { // from class: com.my.target.kh$$ExternalSyntheticLambda0
            @Override // com.my.target.p.b
            public final void a(x xVar, s sVar) {
                kh.this.a((nh) xVar, sVar);
            }
        }).a(this.e.a(), this.a.getContext());
    }

    void n() {
        s5 s5Var = this.f;
        if (s5Var != null) {
            s5Var.destroy();
            this.f.a((s5.a) null);
            this.f = null;
        }
        this.a.removeAllViews();
    }

    void o() {
        if (this.k > 0 && this.h) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.k;
            this.j = currentTimeMillis + j;
            this.a.postDelayed(this.d, j);
            this.k = 0L;
        }
        s5 s5Var = this.f;
        if (s5Var != null) {
            s5Var.resume();
        }
        this.c.f(false);
    }

    void p() {
        if (!this.h || this.i <= 0) {
            return;
        }
        s();
        this.a.postDelayed(this.d, this.i);
    }

    void q() {
        int i = this.i;
        if (i > 0 && this.h) {
            this.a.postDelayed(this.d, i);
        }
        s5 s5Var = this.f;
        if (s5Var != null) {
            s5Var.start();
        }
        this.c.g(true);
    }

    void r() {
        this.c.g(false);
        s();
        s5 s5Var = this.f;
        if (s5Var != null) {
            s5Var.stop();
        }
    }

    void s() {
        this.a.removeCallbacks(this.d);
    }

    public void a(boolean z) {
        this.c.a(z);
        this.c.d(this.a.hasWindowFocus());
        if (this.c.c()) {
            q();
        } else {
            if (z || !this.c.d()) {
                return;
            }
            r();
        }
    }

    public void a() {
        if (this.c.d()) {
            r();
        }
        this.c.f();
        n();
    }

    public void a(MyTargetView.AdSize adSize) {
        s5 s5Var = this.f;
        if (s5Var != null) {
            s5Var.a(adSize);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(nh nhVar, s sVar) {
        if (nhVar != null) {
            b(nhVar);
        } else {
            mi.a("StandardAdMasterEngine: No new ad");
            p();
        }
    }

    void a(IAdLoadingError iAdLoadingError) {
        if (this.g) {
            this.c.e(false);
            MyTargetView.MyTargetViewListener listener = this.a.getListener();
            if (listener != null) {
                listener.onNoAd(iAdLoadingError, this.a);
            }
            this.g = false;
            return;
        }
        n();
        p();
    }

    public void b(boolean z) {
        this.c.d(z);
        if (this.c.c()) {
            q();
        } else if (this.c.b()) {
            o();
        } else if (this.c.a()) {
            l();
        }
    }

    private void a(nh nhVar) {
        this.h = nhVar.d() && this.b.n() && !this.b.i().equals("standard_300x250");
        gh c2 = nhVar.c();
        if (c2 == null) {
            jb b2 = nhVar.b();
            if (b2 == null) {
                MyTargetView.MyTargetViewListener listener = this.a.getListener();
                if (listener != null) {
                    listener.onNoAd(q.v, this.a);
                    return;
                }
                return;
            }
            this.f = sb.a(this.a, b2, this.b, this.e);
            if (this.h) {
                int a2 = b2.a() * 1000;
                this.i = a2;
                this.h = a2 > 0;
                return;
            }
            return;
        }
        this.f = ih.a(this.a, c2, this.e);
        this.i = c2.Z() * 1000;
    }

    public String b() {
        s5 s5Var = this.f;
        if (s5Var != null) {
            return s5Var.a();
        }
        return null;
    }
}
