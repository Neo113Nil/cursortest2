package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class L implements i0.c {

    /* renamed from: a, reason: collision with root package name */
    public final i0.d f1878a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1879b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1880c;
    public final V0.g d;

    public L(i0.d dVar, S s2) {
        i1.f.e(dVar, "savedStateRegistry");
        this.f1878a = dVar;
        this.d = new V0.g(new K(0, s2));
    }

    @Override // i0.c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1880c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((M) this.d.a()).f1881b.entrySet().iterator();
        if (!it.hasNext()) {
            this.f1879b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((G) entry.getValue()).getClass();
        throw null;
    }
}
