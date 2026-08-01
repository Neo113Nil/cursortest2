package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class dr implements iq0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final mu c;

    public /* synthetic */ dr(Object obj, mu muVar, int i) {
        this.a = i;
        this.b = obj;
        this.c = muVar;
    }

    @Override // defpackage.iq0
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new cr(this);
            default:
                return new dv(this);
        }
    }
}
