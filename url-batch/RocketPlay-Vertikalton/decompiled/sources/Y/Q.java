package Y;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.EnumC0079l;
import androidx.lifecycle.InterfaceC0075h;
import b0.C0091c;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0075h, i0.f, androidx.lifecycle.S {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0055q f1397a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.Q f1398b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.v f1399c = null;
    public i0.e d = null;

    public Q(AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q, androidx.lifecycle.Q q2) {
        this.f1397a = abstractComponentCallbacksC0055q;
        this.f1398b = q2;
    }

    @Override // androidx.lifecycle.InterfaceC0075h
    public final C0091c a() {
        Application application;
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1397a;
        Context applicationContext = abstractComponentCallbacksC0055q.C().getApplicationContext();
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
        C0091c c0091c = new C0091c(0);
        LinkedHashMap linkedHashMap = c0091c.f2102a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.J.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.J.f1873a, this);
        linkedHashMap.put(androidx.lifecycle.J.f1874b, this);
        Bundle bundle = abstractComponentCallbacksC0055q.f1503f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.J.f1875c, bundle);
        }
        return c0091c;
    }

    @Override // i0.f
    public final i0.d b() {
        f();
        return this.d.f3037b;
    }

    @Override // androidx.lifecycle.S
    public final androidx.lifecycle.Q c() {
        f();
        return this.f1398b;
    }

    public final void d(EnumC0079l enumC0079l) {
        this.f1399c.d(enumC0079l);
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v e() {
        f();
        return this.f1399c;
    }

    public final void f() {
        if (this.f1399c == null) {
            this.f1399c = new androidx.lifecycle.v(this);
            i0.e eVar = new i0.e(this);
            this.d = eVar;
            eVar.a();
            androidx.lifecycle.J.d(this);
        }
    }
}
