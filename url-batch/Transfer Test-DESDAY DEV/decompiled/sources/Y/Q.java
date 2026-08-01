package Y;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.EnumC0071l;
import androidx.lifecycle.InterfaceC0067h;
import b0.C0083c;
import i0.C0141d;
import i0.C0142e;
import i0.InterfaceC0143f;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0067h, InterfaceC0143f, androidx.lifecycle.S {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0049q f1016a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.Q f1017b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.v f1018c = null;
    public C0142e d = null;

    public Q(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q, androidx.lifecycle.Q q2) {
        this.f1016a = abstractComponentCallbacksC0049q;
        this.f1017b = q2;
    }

    @Override // androidx.lifecycle.InterfaceC0067h
    public final C0083c a() {
        Application application;
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f1016a;
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
        C0083c c0083c = new C0083c(0);
        LinkedHashMap linkedHashMap = c0083c.f1725a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.J.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.J.f1494a, this);
        linkedHashMap.put(androidx.lifecycle.J.f1495b, this);
        Bundle bundle = abstractComponentCallbacksC0049q.f1122f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.J.f1496c, bundle);
        }
        return c0083c;
    }

    @Override // i0.InterfaceC0143f
    public final C0141d b() {
        f();
        return this.d.f2617b;
    }

    @Override // androidx.lifecycle.S
    public final androidx.lifecycle.Q c() {
        f();
        return this.f1017b;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v d() {
        f();
        return this.f1018c;
    }

    public final void e(EnumC0071l enumC0071l) {
        this.f1018c.d(enumC0071l);
    }

    public final void f() {
        if (this.f1018c == null) {
            this.f1018c = new androidx.lifecycle.v(this);
            C0142e c0142e = new C0142e(this);
            this.d = c0142e;
            c0142e.a();
            androidx.lifecycle.J.d(this);
        }
    }
}
