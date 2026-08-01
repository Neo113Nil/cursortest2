package X;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.EnumC0068l;
import androidx.lifecycle.InterfaceC0064h;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0064h, h0.f, androidx.lifecycle.P {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0048q f867a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.O f868b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.t f869c = null;
    public h0.e d = null;

    public Q(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q, androidx.lifecycle.O o2) {
        this.f867a = abstractComponentCallbacksC0048q;
        this.f868b = o2;
    }

    @Override // androidx.lifecycle.InterfaceC0064h
    public final a0.c a() {
        Application application;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f867a;
        Context applicationContext = abstractComponentCallbacksC0048q.C().getApplicationContext();
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
        LinkedHashMap linkedHashMap = cVar.f1106a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1339a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1340b, this);
        Bundle bundle = abstractComponentCallbacksC0048q.f973f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1341c, bundle);
        }
        return cVar;
    }

    @Override // h0.f
    public final h0.d b() {
        f();
        return this.d.f2382b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        f();
        return this.f868b;
    }

    public final void d(EnumC0068l enumC0068l) {
        this.f869c.d(enumC0068l);
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t e() {
        f();
        return this.f869c;
    }

    public final void f() {
        if (this.f869c == null) {
            this.f869c = new androidx.lifecycle.t(this);
            h0.e eVar = new h0.e(this);
            this.d = eVar;
            eVar.a();
            androidx.lifecycle.H.d(this);
        }
    }
}
