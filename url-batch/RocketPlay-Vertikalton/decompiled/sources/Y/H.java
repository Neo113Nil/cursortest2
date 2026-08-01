package Y;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class H implements G {

    /* renamed from: a, reason: collision with root package name */
    public final int f1328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f1329b;

    public H(I i, int i2) {
        this.f1329b = i;
        this.f1328a = i2;
    }

    @Override // Y.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        I i = this.f1329b;
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = i.f1361w;
        int i2 = this.f1328a;
        if (abstractComponentCallbacksC0055q == null || i2 >= 0 || !abstractComponentCallbacksC0055q.g().M(-1, 0)) {
            return i.N(arrayList, arrayList2, i2, 1);
        }
        return false;
    }
}
