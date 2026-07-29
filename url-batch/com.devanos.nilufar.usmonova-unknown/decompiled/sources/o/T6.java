package o;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class T6 implements NQ {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ T6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // o.NQ
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return AbstractC1305jX.z((Object[]) this.b);
            case 1:
                return ((Iterable) this.b).iterator();
            case 2:
                return (Iterator) this.b;
            case 3:
                return new RQ(0, this.b);
            default:
                return new C2247xq(this);
        }
    }
}
