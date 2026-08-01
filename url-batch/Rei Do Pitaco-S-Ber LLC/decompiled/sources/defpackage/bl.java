package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.a;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class bl implements lm, x00, t80 {
    public final dk f;
    public final s80 g;
    public a h = null;
    public w00 i = null;

    public bl(dk dkVar, s80 s80Var) {
        this.f = dkVar;
        this.g = s80Var;
    }

    @Override // defpackage.x00
    public final h3 a() {
        f();
        return this.i.b;
    }

    public final void b(fp fpVar) {
        this.h.d(fpVar);
    }

    @Override // defpackage.lm
    public final wt c() {
        Application application;
        dk dkVar = this.f;
        Context applicationContext = dkVar.C().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        wt wtVar = new wt(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) wtVar.a;
        if (application != null) {
            linkedHashMap.put(tg.n, application);
        }
        linkedHashMap.put(oo.l, this);
        linkedHashMap.put(oo.m, this);
        Bundle bundle = dkVar.k;
        if (bundle != null) {
            linkedHashMap.put(oo.n, bundle);
        }
        return wtVar;
    }

    @Override // defpackage.t80
    public final s80 d() {
        f();
        return this.g;
    }

    @Override // defpackage.lp
    public final a e() {
        f();
        return this.h;
    }

    public final void f() {
        if (this.h == null) {
            this.h = new a(this);
            w00 w00Var = new w00(this);
            this.i = w00Var;
            w00Var.a();
            oo.l(this);
        }
    }
}
