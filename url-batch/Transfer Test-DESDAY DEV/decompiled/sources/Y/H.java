package Y;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class H implements G {

    /* renamed from: a, reason: collision with root package name */
    public final int f947a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f948b;

    public H(I i, int i2) {
        this.f948b = i;
        this.f947a = i2;
    }

    @Override // Y.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        I i = this.f948b;
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = i.f980w;
        int i2 = this.f947a;
        if (abstractComponentCallbacksC0049q == null || i2 >= 0 || !abstractComponentCallbacksC0049q.g().M(-1, 0)) {
            return i.N(arrayList, arrayList2, i2, 1);
        }
        return false;
    }
}
