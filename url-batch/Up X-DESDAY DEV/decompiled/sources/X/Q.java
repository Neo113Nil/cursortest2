package X;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.EnumC0069l;
import androidx.lifecycle.InterfaceC0065h;
import h0.C0133d;
import h0.C0134e;
import h0.InterfaceC0135f;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0065h, InterfaceC0135f, androidx.lifecycle.P {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0049q f863a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.O f864b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.t f865c = null;
    public C0134e d = null;

    public Q(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q, androidx.lifecycle.O o2) {
        this.f863a = abstractComponentCallbacksC0049q;
        this.f864b = o2;
    }

    @Override // androidx.lifecycle.InterfaceC0065h
    public final a0.c a() {
        Application application;
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f863a;
        Context applicationContext = abstractComponentCallbacksC0049q.C().getApplicationContext();
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
        a0.c cVar = new a0.c(0);
        LinkedHashMap linkedHashMap = cVar.f1104a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1337a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1338b, this);
        Bundle bundle = abstractComponentCallbacksC0049q.f969f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1339c, bundle);
        }
        return cVar;
    }

    @Override // h0.InterfaceC0135f
    public final C0133d b() {
        f();
        return this.d.f2376b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        f();
        return this.f864b;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        f();
        return this.f865c;
    }

    public final void e(EnumC0069l enumC0069l) {
        this.f865c.d(enumC0069l);
    }

    public final void f() {
        if (this.f865c == null) {
            this.f865c = new androidx.lifecycle.t(this);
            C0134e c0134e = new C0134e(this);
            this.d = c0134e;
            c0134e.a();
            androidx.lifecycle.H.d(this);
        }
    }
}
