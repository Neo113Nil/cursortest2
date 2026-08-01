package W0;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class q implements o1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1281a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1282b;

    public /* synthetic */ q(int i, Object obj) {
        this.f1281a = i;
        this.f1282b = obj;
    }

    @Override // o1.d
    public final Iterator iterator() {
        switch (this.f1281a) {
            case 0:
                return ((List) this.f1282b).iterator();
            case 1:
                return new o1.c(this);
            default:
                return (Iterator) this.f1282b;
        }
    }
}
