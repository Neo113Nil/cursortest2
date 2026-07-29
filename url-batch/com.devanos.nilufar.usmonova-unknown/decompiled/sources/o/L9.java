package o;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class L9 extends M9 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L9(Field field, boolean z, int i) {
        super(field, z);
        this.e = i;
    }

    @Override // o.V9
    public void c(Object[] objArr) {
        switch (this.e) {
            case 1:
                AbstractC0048Bt.n(objArr, "args");
                AbstractC0946e20.j(this, objArr);
                d(P6.k0(objArr));
                break;
            default:
                super.c(objArr);
                break;
        }
    }
}
