package com.my.target;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.my.target.g;
import com.my.target.z9;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class qa implements z9, ra {
    private final Handler a;
    private final Runnable b;
    private final z9.a c;
    private final r8 d;
    private l8 e;
    private final sa f;
    private long g;

    public qa(n9 n9Var, r8 r8Var, z9.a aVar) {
        this.d = r8Var;
        this.c = aVar;
        this.a = n9Var.e();
        sa a = n9Var.a(this);
        this.f = a;
        j();
        a.a(r8Var.f().b(), r8Var.i());
        this.b = new Runnable() { // from class: com.my.target.qa$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                qa.this.g();
            }
        };
        a((b) r8Var);
        a(r8Var);
        aVar.a(r8Var, a);
    }

    public static qa a(n9 n9Var, r8 r8Var, z9.a aVar) {
        return new qa(n9Var, r8Var, aVar);
    }

    private void c() {
        this.f.f();
        this.a.removeCallbacks(this.b);
        this.c.a(0.0d);
        this.c.a(true);
    }

    private boolean f() {
        long j = this.g - 200;
        this.g = j;
        return j <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        if (f()) {
            c();
        } else {
            h();
        }
    }

    private void h() {
        this.a.removeCallbacks(this.b);
        this.a.postDelayed(this.b, 200L);
        this.c.a(this.g / 1000.0d);
        this.f.setRemainingAllowCloseDelay((int) ((this.g / 1000) + 1));
    }

    private void j() {
        this.f.a(this.d.e0(), this.d.f0());
        this.f.a(this.d.a() != null ? this.d.a().g() : null, this.d.b());
        this.f.setTitleAction(this.d.l());
        this.f.setTitle(this.d.K());
        this.f.setDescription(this.d.n());
        this.f.b(this.d.w(), this.d.s());
    }

    @Override // com.my.target.ra
    public void b() {
        j();
    }

    @Override // com.my.target.ra
    public void d() {
        if (this.d.a() != null) {
            a7.a(this.d.a().c(), this.f.getContext());
        }
    }

    @Override // com.my.target.z9
    public void destroy() {
    }

    @Override // com.my.target.ra
    public void e() {
        this.c.a(this.d);
    }

    @Override // com.my.target.z9
    public View getCloseButton() {
        return this.f.getCloseButton();
    }

    @Override // com.my.target.z9
    public View i() {
        return this.f;
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
        this.c.b(bVar);
    }

    @Override // com.my.target.ra
    public void a() {
        e a = this.d.a();
        if (a == null) {
            return;
        }
        Context context = this.f.getContext();
        l8 l8Var = this.e;
        if (l8Var == null) {
            a7.a(a.c(), context);
        } else {
            l8Var.c();
        }
    }

    @Override // com.my.target.ra
    public void a(b bVar, int i, n2 n2Var) {
        z9.a aVar = this.c;
        if (bVar == null) {
            bVar = this.d;
        }
        aVar.a(bVar, null, i, s2.a(n2Var), i().getContext());
    }

    private void a(r8 r8Var) {
        boolean z = false;
        if (r8Var.b0()) {
            long X = (long) (r8Var.X() * 1000.0f);
            this.g = X;
            if (X > 0) {
                mi.a("InterstitialPresenterS4: Banner will be allowed to close in " + this.g + " millis");
                h();
            } else {
                mi.a("InterstitialPresenterS4loseDelayState = CloseDelayState.DISABLED: Banner is allowed to close");
                c();
                z = true;
            }
        } else {
            this.f.e();
        }
        this.c.a(z);
    }

    private void a(final b bVar) {
        e a = bVar.a();
        if (a == null) {
            this.f.setShowingChoiceButton(false);
            return;
        }
        this.f.setShowingChoiceButton(true);
        if (a.b() == null) {
            return;
        }
        m8 m8Var = new m8(a, this.d.b(), this.f.getContext());
        this.e = m8Var;
        m8Var.a(new g.a() { // from class: com.my.target.qa$$ExternalSyntheticLambda1
            @Override // com.my.target.g.a
            public final void b() {
                qa.this.b(bVar);
            }
        });
    }
}
