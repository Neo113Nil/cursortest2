package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class yg extends fu0 implements qu {
    public int d;
    public /* synthetic */ float e;
    public final /* synthetic */ zg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(zg zgVar, kj kjVar) {
        super(2, kjVar);
        this.f = zgVar;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        yg ygVar = new yg(this.f, kjVar);
        ygVar.e = ((Number) obj).floatValue();
        return ygVar;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        return ((yg) create(Float.valueOf(((Number) obj).floatValue()), (kj) obj2)).invokeSuspend(ky0.a);
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        if (i == 0) {
            rg0.u(obj);
            float f = this.e;
            zg zgVar = this.f;
            Object g = zgVar.a.d.d.g(mp0.e);
            qu quVar = (qu) (g != null ? g : null);
            if (quVar == null) {
                throw y6.u("Required value was null.");
            }
            ra0 ra0Var = new ra0((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            this.d = 1;
            obj = quVar.invoke(ra0Var, this);
            ck ckVar = ck.d;
            if (obj == ckVar) {
                return ckVar;
            }
        } else {
            if (i != 1) {
                g8.s("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rg0.u(obj);
        }
        return new Float(Float.intBitsToFloat((int) (((ra0) obj).a & 4294967295L)));
    }
}
