package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class z2 implements v00 {
    public final /* synthetic */ int a;
    public final Object b;

    public z2(h3 h3Var) {
        this.a = 1;
        this.b = new LinkedHashSet();
        h3Var.e("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.v00
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((b3) obj).j().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) obj));
                return bundle2;
        }
    }

    public z2(b3 b3Var) {
        this.a = 0;
        this.b = b3Var;
    }
}
