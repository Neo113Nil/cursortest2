package i0;

import android.os.Bundle;
import androidx.lifecycle.EnumC0080m;
import androidx.lifecycle.v;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f3036a;

    /* renamed from: b, reason: collision with root package name */
    public final d f3037b = new d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3038c;

    public e(f fVar) {
        this.f3036a = fVar;
    }

    public final void a() {
        f fVar = this.f3036a;
        v e2 = fVar.e();
        if (e2.d != EnumC0080m.f1897b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        e2.a(new C0174a(0, fVar));
        d dVar = this.f3037b;
        dVar.getClass();
        if (dVar.f3031a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        e2.a(new a.e(2, dVar));
        dVar.f3031a = true;
        this.f3038c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f3038c) {
            a();
        }
        v e2 = this.f3036a.e();
        if (e2.d.compareTo(EnumC0080m.d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + e2.d).toString());
        }
        d dVar = this.f3037b;
        if (!dVar.f3031a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (dVar.f3032b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        dVar.f3034e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        dVar.f3032b = true;
    }

    public final void c(Bundle bundle) {
        i1.f.e(bundle, "outBundle");
        d dVar = this.f3037b;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) dVar.f3034e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        n.f fVar = (n.f) dVar.d;
        fVar.getClass();
        n.d dVar2 = new n.d(fVar);
        fVar.f3575c.put(dVar2, Boolean.FALSE);
        while (dVar2.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar2.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
