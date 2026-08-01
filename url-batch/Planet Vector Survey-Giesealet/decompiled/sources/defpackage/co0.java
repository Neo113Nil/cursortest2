package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class co0 implements ed0 {
    public final int d;
    public final List e;
    public Float f = null;
    public Float g = null;
    public zn0 h = null;
    public zn0 i = null;

    public co0(int i, ArrayList arrayList) {
        this.d = i;
        this.e = arrayList;
    }

    @Override // defpackage.ed0
    public final boolean q() {
        return this.e.contains(this);
    }
}
