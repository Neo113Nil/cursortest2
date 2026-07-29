package o;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class JS implements Iterable, InterfaceC1594nw {
    public final C0841cS h;
    public final int i;
    public final C1537n2 j;

    public JS(C0841cS c0841cS, int i, AbstractC0997er abstractC0997er, C1537n2 c1537n2) {
        this.h = c0841cS;
        this.i = i;
        this.j = c1537n2;
        abstractC0997er.getClass();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0931dr(this.h, this.i, null, this.j);
    }
}
