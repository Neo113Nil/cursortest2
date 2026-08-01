package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class tu0 implements iq0 {
    public final /* synthetic */ int a;
    public final iq0 b;
    public final mu c;

    public /* synthetic */ tu0(iq0 iq0Var, mu muVar, int i) {
        this.a = i;
        this.b = iq0Var;
        this.c = muVar;
    }

    @Override // defpackage.iq0
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new cr(this);
            default:
                return new vw0(this);
        }
    }
}
