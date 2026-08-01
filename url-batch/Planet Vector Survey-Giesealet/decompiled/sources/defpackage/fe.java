package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class fe implements iq0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fe(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.iq0
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return ((Iterable) this.b).iterator();
            default:
                return (Iterator) this.b;
        }
    }
}
