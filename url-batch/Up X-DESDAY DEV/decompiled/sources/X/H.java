package X;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class H implements G {

    /* renamed from: a, reason: collision with root package name */
    public final int f794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f795b;

    public H(I i, int i2) {
        this.f795b = i;
        this.f794a = i2;
    }

    @Override // X.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        I i = this.f795b;
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = i.f827w;
        int i2 = this.f794a;
        if (abstractComponentCallbacksC0049q == null || i2 >= 0 || !abstractComponentCallbacksC0049q.g().M(-1, 0)) {
            return i.N(arrayList, arrayList2, i2, 1);
        }
        return false;
    }
}
