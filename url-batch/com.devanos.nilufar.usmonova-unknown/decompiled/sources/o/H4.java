package o;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class H4 implements JP {
    public final /* synthetic */ int a;
    public final Object b;

    public H4(KP kp) {
        this.a = 1;
        this.b = new LinkedHashSet();
        kp.c("androidx.savedstate.Restarter", this);
    }

    @Override // o.JP
    public final Bundle a() {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                ((J4) this.b).getDelegate().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.b));
                return bundle2;
        }
    }

    public H4(J4 j4) {
        this.a = 0;
        this.b = j4;
    }
}
