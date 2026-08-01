package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class rr0 extends tk0 implements qu {
    public long[] e;
    public int f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ sr0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr0(sr0 sr0Var, kj kjVar) {
        super(kjVar);
        this.j = sr0Var;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        rr0 rr0Var = new rr0(this.j, kjVar);
        rr0Var.i = obj;
        return rr0Var;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        return ((rr0) create((jq0) obj, (kj) obj2)).invokeSuspend(ky0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00bc -> B:7:0x00be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:20:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jq0 jq0Var;
        long[] jArr;
        int length;
        int i;
        jq0 jq0Var2;
        int i2;
        jq0 jq0Var3;
        int i3;
        sr0 sr0Var = this.j;
        long j = sr0Var.d;
        long j2 = sr0Var.f;
        long j3 = sr0Var.e;
        int i4 = this.h;
        ck ckVar = ck.d;
        if (i4 == 0) {
            rg0.u(obj);
            jq0Var = (jq0) this.i;
            jArr = sr0Var.g;
            if (jArr != null) {
                length = jArr.length;
                i = 0;
            }
            if (j3 != 0) {
                jq0Var2 = jq0Var;
                i2 = 0;
                if (i2 >= 64) {
                }
            }
            if (j != 0) {
            }
            return ky0.a;
        }
        if (i4 == 1) {
            length = this.g;
            int i5 = this.f;
            jArr = this.e;
            jq0Var = (jq0) this.i;
            rg0.u(obj);
            i = i5 + 1;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = this.f;
                jq0Var3 = (jq0) this.i;
                rg0.u(obj);
                i3 = i6 + 1;
                if (i3 < 64) {
                    if (((1 << i3) & j) != 0) {
                        Long l = new Long(j2 + i3 + 64);
                        this.i = jq0Var3;
                        this.e = null;
                        this.f = i3;
                        this.h = 3;
                        jq0Var3.b(l, this);
                        return ckVar;
                    }
                    i6 = i3;
                    i3 = i6 + 1;
                    if (i3 < 64) {
                    }
                }
                return ky0.a;
            }
            i2 = this.f;
            jq0Var2 = (jq0) this.i;
            rg0.u(obj);
            i2++;
            if (i2 >= 64) {
                jq0Var = jq0Var2;
                if (j != 0) {
                    jq0Var3 = jq0Var;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return ky0.a;
            }
            if ((j3 & (1 << i2)) != 0) {
                Long l2 = new Long(j2 + i2);
                this.i = jq0Var2;
                this.e = null;
                this.f = i2;
                this.h = 2;
                jq0Var2.b(l2, this);
                return ckVar;
            }
            i2++;
            if (i2 >= 64) {
            }
        }
        if (i < length) {
            Long l3 = new Long(jArr[i]);
            this.i = jq0Var;
            this.e = jArr;
            this.f = i;
            this.g = length;
            this.h = 1;
            jq0Var.b(l3, this);
            return ckVar;
        }
        if (j3 != 0) {
        }
        if (j != 0) {
        }
        return ky0.a;
    }
}
