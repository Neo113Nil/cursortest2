package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class go extends fu0 implements ru {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ go(int i, kj kjVar, int i2) {
        super(i, kjVar);
        this.d = i2;
    }

    @Override // defpackage.ru
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        int i2 = 3;
        switch (i) {
            case 0:
                long j = ((ra0) obj2).a;
                new go(i2, (kj) obj3, 0).invokeSuspend(ky0Var);
                break;
            case 1:
                ((Number) obj2).floatValue();
                new go(i2, (kj) obj3, 1).invokeSuspend(ky0Var);
                break;
            default:
                long j2 = ((ra0) obj2).a;
                new go(i2, (kj) obj3, 2).invokeSuspend(ky0Var);
                break;
        }
        return ky0Var;
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        switch (i) {
            case 0:
                rg0.u(obj);
                break;
            case 1:
                rg0.u(obj);
                break;
            default:
                rg0.u(obj);
                break;
        }
        return ky0Var;
    }
}
