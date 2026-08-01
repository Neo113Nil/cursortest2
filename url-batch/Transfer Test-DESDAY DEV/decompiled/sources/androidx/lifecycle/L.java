package androidx.lifecycle;

import android.os.Bundle;
import i0.C0141d;
import i0.InterfaceC0140c;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class L implements InterfaceC0140c {

    /* renamed from: a, reason: collision with root package name */
    public final C0141d f1499a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1500b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1501c;
    public final U0.g d;

    public L(C0141d c0141d, S s2) {
        g1.f.e(c0141d, "savedStateRegistry");
        this.f1499a = c0141d;
        this.d = new U0.g(new K(0, s2));
    }

    @Override // i0.InterfaceC0140c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1501c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((M) this.d.a()).f1502b.entrySet().iterator();
        if (!it.hasNext()) {
            this.f1500b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((G) entry.getValue()).getClass();
        throw null;
    }
}
