package o;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class P9 extends Q9 {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P9(Field field, boolean z, boolean z2, int i) {
        super(field, z, z2);
        this.g = i;
    }

    @Override // o.Q9, o.V9
    public void c(Object[] objArr) {
        switch (this.g) {
            case 1:
                AbstractC0048Bt.n(objArr, "args");
                super.c(objArr);
                d(P6.k0(objArr));
                break;
            default:
                super.c(objArr);
                break;
        }
    }
}
