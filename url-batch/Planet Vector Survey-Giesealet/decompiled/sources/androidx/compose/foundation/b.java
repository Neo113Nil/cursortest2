package androidx.compose.foundation;

import defpackage.bu;
import defpackage.hh;
import defpackage.ih;
import defpackage.qh;
import defpackage.r60;
import defpackage.ru;
import defpackage.rx;
import defpackage.tl0;
import defpackage.u50;
import defpackage.v00;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class b extends v00 implements ru {
    public final /* synthetic */ rx e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ tl0 g;
    public final /* synthetic */ bu h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(rx rxVar, boolean z, tl0 tl0Var, bu buVar) {
        super(3);
        this.e = rxVar;
        this.f = z;
        this.g = tl0Var;
        this.h = buVar;
    }

    @Override // defpackage.ru
    public final Object b(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        qh qhVar = (qh) ((ih) obj2);
        qhVar.V(-1525724089);
        Object K = qhVar.K();
        if (K == hh.a) {
            K = new r60();
            qhVar.e0(K);
        }
        r60 r60Var = (r60) K;
        u50 c = c.a(r60Var, this.e).c(new ClickableElement(r60Var, null, this.f, this.g, this.h));
        qhVar.q(false);
        return c;
    }
}
