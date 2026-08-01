package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class j4 extends v00 implements mu {
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j4(int i, ArrayList arrayList) {
        super(1);
        this.e = i;
        this.f = arrayList;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        int i = this.e;
        ky0 ky0Var = ky0.a;
        ArrayList arrayList = this.f;
        switch (i) {
            case 0:
                xf0 xf0Var = (xf0) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    xf0.j(xf0Var, (yf0) arrayList.get(i2), 0, 0);
                }
                break;
            case 1:
                xf0 xf0Var2 = (xf0) obj;
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    xf0.g(xf0Var2, (yf0) arrayList.get(i3), 0, 0);
                }
                break;
            default:
                xf0 xf0Var3 = (xf0) obj;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    xf0.l(xf0Var3, (yf0) arrayList.get(i4), 0, 0);
                }
                break;
        }
        return ky0Var;
    }
}
