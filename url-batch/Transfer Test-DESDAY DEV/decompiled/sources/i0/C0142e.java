package i0;

import android.os.Bundle;
import androidx.lifecycle.EnumC0072m;
import androidx.lifecycle.v;
import java.util.Map;

/* renamed from: i0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142e {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0143f f2616a;

    /* renamed from: b, reason: collision with root package name */
    public final C0141d f2617b = new C0141d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2618c;

    public C0142e(InterfaceC0143f interfaceC0143f) {
        this.f2616a = interfaceC0143f;
    }

    public final void a() {
        InterfaceC0143f interfaceC0143f = this.f2616a;
        v d = interfaceC0143f.d();
        if (d.d != EnumC0072m.f1518b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        d.a(new C0138a(0, interfaceC0143f));
        C0141d c0141d = this.f2617b;
        c0141d.getClass();
        if (c0141d.f2611a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        d.a(new a.e(2, c0141d));
        c0141d.f2611a = true;
        this.f2618c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f2618c) {
            a();
        }
        v d = this.f2616a.d();
        if (d.d.compareTo(EnumC0072m.d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + d.d).toString());
        }
        C0141d c0141d = this.f2617b;
        if (!c0141d.f2611a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c0141d.f2612b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c0141d.f2614e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c0141d.f2612b = true;
    }

    public final void c(Bundle bundle) {
        g1.f.e(bundle, "outBundle");
        C0141d c0141d = this.f2617b;
        c0141d.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) c0141d.f2614e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        n.f fVar = (n.f) c0141d.d;
        fVar.getClass();
        n.d dVar = new n.d(fVar);
        fVar.f3149c.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC0140c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
