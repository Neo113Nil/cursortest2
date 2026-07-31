package com.my.target;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.my.target.g;
import com.my.target.xa;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class na implements z9, oa {
    private final pa a;
    private final p8 b;
    private long c;
    private final Handler d;
    private final Runnable e;
    private l8 f;
    private final xa.a g;

    private na(n9 n9Var, p8 p8Var, xa.a aVar) {
        this.g = aVar;
        this.b = p8Var;
        this.d = n9Var.e();
        pa a = n9Var.a(this);
        this.a = a;
        l();
        this.e = new Runnable() { // from class: com.my.target.na$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                na.this.j();
            }
        };
        a((b) p8Var);
        a(p8Var);
        aVar.a(p8Var, a);
    }

    public static na a(n9 n9Var, p8 p8Var, xa.a aVar) {
        return new na(n9Var, p8Var, aVar);
    }

    private void c() {
        this.a.e();
        this.d.removeCallbacks(this.e);
        this.g.a(0.0d);
        this.g.a(true);
    }

    private void f() {
        this.g.a(true);
    }

    private boolean g() {
        long j = this.c - 200;
        this.c = j;
        return j <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        if (g()) {
            c();
        } else {
            k();
        }
    }

    private void k() {
        this.d.removeCallbacks(this.e);
        this.d.postDelayed(this.e, 200L);
        this.g.a(this.c / 1000.0d);
        this.a.setRemainingAllowCloseDelay((int) ((this.c / 1000) + 1));
    }

    private void l() {
        this.a.setHtmlSource(this.b);
        this.a.a(this.b.a() != null ? this.b.a().g() : null, h());
        this.a.a(this.b.f().b(), this.b.i());
    }

    @Override // com.my.target.oa
    public void b() {
        this.g.b();
    }

    @Override // com.my.target.oa
    public void d() {
        if (this.b.a() != null) {
            a7.a(this.b.a().c(), this.a.getContext());
        }
    }

    @Override // com.my.target.z9
    public void destroy() {
    }

    @Override // com.my.target.oa
    public void e() {
        this.g.a(this.b);
    }

    @Override // com.my.target.z9
    public View getCloseButton() {
        return this.a.getCloseButton();
    }

    @Override // com.my.target.z9
    public View i() {
        return this.a;
    }

    @Override // com.my.target.z9
    public void pause() {
    }

    @Override // com.my.target.z9
    public void resume() {
    }

    @Override // com.my.target.z9
    public void stop() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(b bVar) {
        this.g.b(bVar);
    }

    private String h() {
        String str = "";
        if (!TextUtils.isEmpty(this.b.c())) {
            str = "" + this.b.c();
        }
        if (TextUtils.isEmpty(this.b.d())) {
            return str;
        }
        if (!TextUtils.isEmpty(str)) {
            str = str + " ";
        }
        return str + this.b.d();
    }

    @Override // com.my.target.oa
    public void a(String str) {
        this.g.a(str);
        f();
    }

    @Override // com.my.target.oa
    public void a() {
        e a = this.b.a();
        if (a == null) {
            return;
        }
        Context context = this.a.getContext();
        l8 l8Var = this.f;
        if (l8Var == null) {
            a7.a(a.c(), context);
        } else {
            l8Var.c();
        }
    }

    @Override // com.my.target.oa
    public void a(WebView webView) {
        this.g.a(webView);
    }

    @Override // com.my.target.oa
    public void a(String str, int i, n2 n2Var) {
        this.g.a(this.b, str, 1, s2.a(n2Var), i().getContext());
    }

    private void a(p8 p8Var) {
        boolean z = false;
        if (p8Var.b0()) {
            long X = (long) (p8Var.X() * 1000.0f);
            this.c = X;
            if (X > 0) {
                mi.a("InterstitialPresenterS4: Banner will be allowed to close in " + this.c + " millis");
                k();
            } else {
                mi.a("InterstitialPresenterS4loseDelayState = CloseDelayState.DISABLED: Banner is allowed to close");
                c();
                z = true;
            }
        } else {
            this.a.d();
        }
        this.g.a(z);
    }

    private void a(final b bVar) {
        e a = bVar.a();
        if (a == null) {
            this.a.setShowingChoiceButton(false);
            return;
        }
        this.a.setShowingChoiceButton(true);
        if (a.b() == null) {
            return;
        }
        m8 m8Var = new m8(a, h(), this.a.getContext());
        this.f = m8Var;
        m8Var.a(new g.a() { // from class: com.my.target.na$$ExternalSyntheticLambda0
            @Override // com.my.target.g.a
            public final void b() {
                na.this.b(bVar);
            }
        });
    }
}
