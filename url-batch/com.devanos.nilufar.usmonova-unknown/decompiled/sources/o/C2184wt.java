package o;

import java.util.Arrays;

/* renamed from: o.wt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2184wt extends AbstractC2250xt {
    @Override // o.G9
    public final Object call(Object[] objArr) {
        AbstractC0048Bt.n(objArr, "args");
        AbstractC0946e20.j(this, objArr);
        Object obj = objArr[0];
        Object[] f0 = objArr.length <= 1 ? new Object[0] : P6.f0(objArr, 1, objArr.length);
        return this.a.invoke(obj, Arrays.copyOf(f0, f0.length));
    }
}
