package o;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes.dex */
public final class GP implements JP {
    public final KP a;
    public boolean b;
    public Bundle c;
    public final BU d;

    public GP(KP kp, InterfaceC0746b00 interfaceC0746b00) {
        AbstractC0048Bt.n(kp, "savedStateRegistry");
        this.a = kp;
        this.d = EB.D(new LE(7, interfaceC0746b00));
    }

    @Override // o.JP
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((HP) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = ((DP) entry.getValue()).e.a();
            if (!AbstractC0048Bt.h(a, Bundle.EMPTY)) {
                bundle.putBundle(str, a);
            }
        }
        this.b = false;
        return bundle;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle a = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (a != null) {
            bundle.putAll(a);
        }
        this.c = bundle;
        this.b = true;
    }
}
