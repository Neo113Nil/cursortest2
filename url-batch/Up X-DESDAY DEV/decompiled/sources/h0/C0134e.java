package h0;

import android.os.Bundle;
import androidx.lifecycle.EnumC0070m;
import androidx.lifecycle.t;
import java.util.Map;

/* renamed from: h0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134e {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0135f f2375a;

    /* renamed from: b, reason: collision with root package name */
    public final C0133d f2376b = new C0133d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2377c;

    public C0134e(InterfaceC0135f interfaceC0135f) {
        this.f2375a = interfaceC0135f;
    }

    public final void a() {
        InterfaceC0135f interfaceC0135f = this.f2375a;
        t d = interfaceC0135f.d();
        if (d.f1370c != EnumC0070m.f1361b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        d.a(new C0130a(0, interfaceC0135f));
        C0133d c0133d = this.f2376b;
        c0133d.getClass();
        if (c0133d.f2370a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        d.a(new a.e(2, c0133d));
        c0133d.f2370a = true;
        this.f2377c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f2377c) {
            a();
        }
        t d = this.f2375a.d();
        if (d.f1370c.compareTo(EnumC0070m.d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + d.f1370c).toString());
        }
        C0133d c0133d = this.f2376b;
        if (!c0133d.f2370a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c0133d.f2371b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c0133d.f2373e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c0133d.f2371b = true;
    }

    public final void c(Bundle bundle) {
        X0.e.e(bundle, "outBundle");
        C0133d c0133d = this.f2376b;
        c0133d.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) c0133d.f2373e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        n.f fVar = (n.f) c0133d.d;
        fVar.getClass();
        n.d dVar = new n.d(fVar);
        fVar.f3260c.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC0132c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
