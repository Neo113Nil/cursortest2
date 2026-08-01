package defpackage;

import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ea extends v00 implements mu {
    public final /* synthetic */ yf0[] e;
    public final /* synthetic */ List f;
    public final /* synthetic */ f40 g;
    public final /* synthetic */ ej0 h;
    public final /* synthetic */ ej0 i;
    public final /* synthetic */ fa j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(yf0[] yf0VarArr, List list, f40 f40Var, ej0 ej0Var, ej0 ej0Var2, fa faVar) {
        super(1);
        this.e = yf0VarArr;
        this.f = list;
        this.g = f40Var;
        this.h = ej0Var;
        this.i = ej0Var2;
        this.j = faVar;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        xf0 xf0Var = (xf0) obj;
        yf0[] yf0VarArr = this.e;
        int length = yf0VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i;
            yf0 yf0Var = yf0VarArr[i2];
            yf0Var.getClass();
            ca.b(xf0Var, yf0Var, (b50) this.f.get(i3), this.g.getLayoutDirection(), this.h.d, this.i.d, this.j.a);
            i2++;
            i = i3 + 1;
        }
        return ky0.a;
    }
}
