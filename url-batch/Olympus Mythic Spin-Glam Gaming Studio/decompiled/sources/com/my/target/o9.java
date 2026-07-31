package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.my.target.common.models.ImageData;
import com.my.target.g;
import com.my.target.xa;
import com.my.target.y0;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes14.dex */
public class o9 implements y0.a, xa {
    private final y0 c;
    private final w5 d;
    private final FrameLayout e;
    private final m g;
    private b h;
    private xa.a i;
    private long j;
    private long k;
    private p8 l;
    private long m;
    private long n;
    private f o;
    private final zf a = zf.a(o0.g, 200);
    private final Runnable b = new Runnable() { // from class: com.my.target.o9$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            o9.this.g();
        }
    };
    private final Handler f = new Handler(Looper.getMainLooper());

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class a implements View.OnClickListener {
        private final o9 a;

        a(o9 o9Var) {
            this.a = o9Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            xa.a e = this.a.e();
            p8 p8Var = this.a.l;
            if (e == null || p8Var == null) {
                return;
            }
            e.a(p8Var);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class b implements Runnable {
        private final o9 a;

        b(o9 o9Var) {
            this.a = o9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            xa.a e = this.a.e();
            if (e != null) {
                e.e();
            }
        }
    }

    private o9(Context context) {
        y0 y0Var = new y0(context);
        this.c = y0Var;
        w5 w5Var = new w5(context);
        this.d = w5Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        w5Var.setContentDescription("Close");
        qi.b(w5Var, "close_button");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388613;
        w5Var.setVisibility(8);
        w5Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 1;
        y0Var.setLayoutParams(layoutParams2);
        frameLayout.addView(y0Var);
        if (w5Var.getParent() == null) {
            frameLayout.addView(w5Var);
        }
        Bitmap a2 = a1.a(qi.g(context).b(28));
        if (a2 != null) {
            w5Var.a(a2, false);
        }
        m mVar = new m(context);
        this.g = mVar;
        int a3 = qi.a(10, context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(a3, a3, a3, a3);
        frameLayout.addView(mVar, layoutParams3);
    }

    public static o9 a(Context context) {
        return new o9(context);
    }

    private void c() {
        xa.a aVar = this.i;
        if (aVar != null) {
            aVar.a(true);
            this.a.b(this.b);
        }
    }

    private void f() {
        this.a.a(this.b);
        this.j = System.currentTimeMillis();
        xa.a aVar = this.i;
        if (aVar != null) {
            aVar.a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        xa.a aVar = this.i;
        if (aVar != null) {
            aVar.a(this.k / 1000.0d);
        }
        long j = this.k;
        if (j > 0) {
            this.k = j - 200;
        } else {
            a();
        }
    }

    @Override // com.my.target.y0.a
    public void b() {
        xa.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    void d() {
        e a2;
        p8 p8Var = this.l;
        if (p8Var == null || (a2 = p8Var.a()) == null) {
            return;
        }
        f fVar = this.o;
        if (fVar == null || !fVar.b()) {
            Context context = i().getContext();
            if (fVar == null) {
                a7.a(a2.c(), context);
            } else {
                fVar.a(context);
            }
        }
    }

    @Override // com.my.target.z9
    public void destroy() {
        a(0);
    }

    xa.a e() {
        return this.i;
    }

    @Override // com.my.target.z9
    public View getCloseButton() {
        return this.d;
    }

    @Override // com.my.target.z9
    public View i() {
        return this.e;
    }

    @Override // com.my.target.z9
    public void pause() {
        if (this.j > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.j;
            if (currentTimeMillis > 0) {
                long j = this.k;
                if (currentTimeMillis < j) {
                    this.k = j - currentTimeMillis;
                }
            }
            this.k = 0L;
        }
        if (this.m > 0) {
            long currentTimeMillis2 = System.currentTimeMillis() - this.m;
            if (currentTimeMillis2 > 0) {
                long j2 = this.n;
                if (currentTimeMillis2 < j2) {
                    this.n = j2 - currentTimeMillis2;
                }
            }
            this.n = 0L;
        }
        b bVar = this.h;
        if (bVar != null) {
            this.f.removeCallbacks(bVar);
        }
        this.a.b(this.b);
    }

    @Override // com.my.target.z9
    public void resume() {
        if (this.k > 0) {
            f();
        }
        long j = this.n;
        if (j > 0) {
            a(j);
        }
    }

    @Override // com.my.target.z9
    public void stop() {
    }

    @Override // com.my.target.xa
    public void a(i9 i9Var, p8 p8Var) {
        this.l = p8Var;
        this.c.setBannerWebViewListener(this);
        String e0 = p8Var.e0();
        if (e0 == null) {
            b("failed to load, null source");
            return;
        }
        this.c.setData(e0);
        this.c.setForceMediaPlayback(p8Var.d0());
        ImageData Z = p8Var.Z();
        if (Z != null) {
            this.d.a(Z.getBitmap(), false);
        }
        this.d.setOnClickListener(new a(this));
        if (p8Var.X() > 0.0f) {
            mi.a("InterstitialHtmlPresenter: Banner will be allowed to close in " + p8Var.X() + " seconds");
            this.k = (long) (p8Var.X() * 1000.0f);
            f();
        } else {
            mi.a("InterstitialHtmlPresenter: Banner is allowed to close");
            this.d.setVisibility(0);
        }
        float f0 = p8Var.f0();
        if (f0 > 0.0f) {
            this.h = new b(this);
            long j = ((long) f0) * 1000;
            this.n = j;
            a(j);
        }
        a(p8Var);
        xa.a aVar = this.i;
        if (aVar != null) {
            aVar.a(p8Var, i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.my.target.b bVar) {
        xa.a aVar = this.i;
        if (aVar != null) {
            aVar.b(bVar);
        }
    }

    private void b(String str) {
        xa.a aVar = this.i;
        if (aVar != null) {
            aVar.a(str);
            c();
        }
    }

    @Override // com.my.target.xa
    public void a(int i) {
        this.c.b("window.playerDestroy && window.playerDestroy();");
        this.e.removeView(this.c);
        this.c.a(i);
    }

    @Override // com.my.target.y0.a
    public void a(WebView webView, int i, String str, String str2) {
        b(str);
    }

    @Override // com.my.target.y0.a
    public void a(String str) {
        n2 a2;
        p8 p8Var = this.l;
        if (p8Var != null && p8Var.f().b()) {
            a2 = t2.a();
        } else {
            a2 = q2.a();
        }
        xa.a aVar = this.i;
        if (aVar != null) {
            aVar.a(this.l, str, 1, s2.a(a2), i().getContext());
        }
    }

    @Override // com.my.target.y0.a
    public void a(WebView webView, String str) {
        xa.a aVar = this.i;
        if (aVar != null) {
            aVar.a(webView);
        }
    }

    @Override // com.my.target.xa
    public void a(xa.a aVar) {
        this.i = aVar;
    }

    void a() {
        this.d.setVisibility(0);
        c();
    }

    private void a(final com.my.target.b bVar) {
        e a2 = bVar.a();
        if (a2 == null) {
            this.g.setVisibility(8);
            return;
        }
        this.g.setImageBitmap(a2.g().getBitmap());
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.o9$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o9.this.a(view);
            }
        });
        if (a2.b() == null) {
            return;
        }
        f a3 = f.a(a2, new r3());
        this.o = a3;
        a3.a(new g.a() { // from class: com.my.target.o9$$ExternalSyntheticLambda2
            @Override // com.my.target.g.a
            public final void b() {
                o9.this.b(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        d();
    }

    private void a(long j) {
        b bVar = this.h;
        if (bVar == null) {
            return;
        }
        this.f.removeCallbacks(bVar);
        this.m = System.currentTimeMillis();
        this.f.postDelayed(this.h, j);
    }
}
