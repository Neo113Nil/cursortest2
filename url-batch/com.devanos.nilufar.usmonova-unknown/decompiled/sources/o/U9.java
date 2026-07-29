package o;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class U9 extends Q9 {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U9(Method method, int i) {
        super(method, false, 6);
        this.g = i;
        switch (i) {
            case 1:
                AbstractC0048Bt.n(method, "method");
                super(method, true, 4);
                break;
            case 2:
                AbstractC0048Bt.n(method, "method");
                super(method, false, 6);
                break;
            default:
                AbstractC0048Bt.n(method, "method");
                break;
        }
    }

    @Override // o.Q9, o.G9
    public final Object call(Object[] objArr) {
        switch (this.g) {
            case 0:
                AbstractC0048Bt.n(objArr, "args");
                AbstractC0946e20.j(this, objArr);
                return e(objArr[0], objArr.length <= 1 ? new Object[0] : P6.f0(objArr, 1, objArr.length));
            case 1:
                AbstractC0048Bt.n(objArr, "args");
                AbstractC0946e20.j(this, objArr);
                d(P6.k0(objArr));
                return e(null, objArr.length <= 1 ? new Object[0] : P6.f0(objArr, 1, objArr.length));
            default:
                AbstractC0048Bt.n(objArr, "args");
                AbstractC0946e20.j(this, objArr);
                return e(null, objArr);
        }
    }
}
