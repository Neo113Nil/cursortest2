package h0;

import android.os.Bundle;
import androidx.lifecycle.EnumC0069m;
import androidx.lifecycle.t;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f2381a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2382b = new d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2383c;

    public e(f fVar) {
        this.f2381a = fVar;
    }

    public final void a() {
        f fVar = this.f2381a;
        t e2 = fVar.e();
        if (e2.f1372c != EnumC0069m.f1363b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        e2.a(new C0146a(0, fVar));
        d dVar = this.f2382b;
        dVar.getClass();
        if (dVar.f2376a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        e2.a(new a.e(2, dVar));
        dVar.f2376a = true;
        this.f2383c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f2383c) {
            a();
        }
        t e2 = this.f2381a.e();
        if (e2.f1372c.compareTo(EnumC0069m.d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + e2.f1372c).toString());
        }
        d dVar = this.f2382b;
        if (!dVar.f2376a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (dVar.f2377b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        dVar.f2379e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        dVar.f2377b = true;
    }

    public final void c(Bundle bundle) {
        X0.d.e(bundle, "outBundle");
        d dVar = this.f2382b;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) dVar.f2379e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        n.f fVar = (n.f) dVar.d;
        fVar.getClass();
        n.d dVar2 = new n.d(fVar);
        fVar.f3285c.put(dVar2, Boolean.FALSE);
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
