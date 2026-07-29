package o;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class S6 implements Iterable, InterfaceC1594nw {
    public final /* synthetic */ int h;
    public final Object i;

    public /* synthetic */ S6(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.h) {
            case 0:
                return AbstractC1305jX.z((Object[]) this.i);
            case 1:
                return new C1779qj((Iterator) ((InterfaceC1455lp) this.i).invoke());
            default:
                return ((NQ) this.i).iterator();
        }
    }
}
