package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class xi0 implements hn0 {
    public final LinkedHashSet a = new LinkedHashSet();

    public xi0(in0 in0Var) {
        in0Var.c("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.hn0
    public final Bundle a() {
        Bundle r = x40.r((pd0[]) Arrays.copyOf(new pd0[0], 0));
        List o0 = zd.o0(this.a);
        r.putStringArrayList("classes_to_restore", o0 instanceof ArrayList ? (ArrayList) o0 : new ArrayList<>(o0));
        return r;
    }
}
