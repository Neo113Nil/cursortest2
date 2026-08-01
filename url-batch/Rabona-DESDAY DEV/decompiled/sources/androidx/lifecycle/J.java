package androidx.lifecycle;

import android.os.Bundle;
import h0.C0133d;
import h0.InterfaceC0132c;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class J implements InterfaceC0132c {

    /* renamed from: a, reason: collision with root package name */
    public final C0133d f1345a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1346b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1347c;
    public final P0.c d;

    public J(C0133d c0133d, P p2) {
        X0.d.e(c0133d, "savedStateRegistry");
        this.f1345a = c0133d;
        this.d = new P0.c(new I(0, p2));
    }

    @Override // h0.InterfaceC0132c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1347c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((K) this.d.a()).f1348b.entrySet().iterator();
        if (!it.hasNext()) {
            this.f1346b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((E) entry.getValue()).getClass();
        throw null;
    }
}
