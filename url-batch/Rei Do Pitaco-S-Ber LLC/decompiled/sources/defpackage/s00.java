package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class s00 implements v00 {
    public final h3 a;
    public boolean b;
    public Bundle c;
    public final e40 d;

    public s00(h3 h3Var, t80 t80Var) {
        h3Var.getClass();
        this.a = h3Var;
        this.d = new e40(new jm(2, t80Var));
    }

    @Override // defpackage.v00
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((t00) this.d.a()).c.entrySet().iterator();
        if (!it.hasNext()) {
            this.b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((r00) entry.getValue()).getClass();
        throw null;
    }
}
