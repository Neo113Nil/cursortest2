package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class c70 extends tk0 implements qu {
    public dv e;
    public d70 f;
    public long[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ d70 o;
    public final /* synthetic */ dv p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c70(d70 d70Var, dv dvVar, kj kjVar) {
        super(kjVar);
        this.o = d70Var;
        this.p = dvVar;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        c70 c70Var = new c70(this.o, this.p, kjVar);
        c70Var.n = obj;
        return c70Var;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        return ((c70) create((jq0) obj, (kj) obj2)).invokeSuspend(ky0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:14:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:6:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006d -> B:5:0x0094). Please report as a decompilation issue!!! */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jq0 jq0Var;
        d70 d70Var;
        long[] jArr;
        int length;
        dv dvVar;
        int i;
        long j;
        int i2 = this.m;
        if (i2 == 0) {
            rg0.u(obj);
            jq0Var = (jq0) this.n;
            d70Var = this.o;
            jArr = d70Var.e.a;
            length = jArr.length - 2;
            if (length >= 0) {
                dvVar = this.p;
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return ky0.a;
        }
        if (i2 != 1) {
            g8.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.k;
        int i4 = this.j;
        long j2 = this.l;
        int i5 = this.i;
        int i6 = this.h;
        long[] jArr2 = this.g;
        d70 d70Var2 = this.f;
        dv dvVar2 = this.e;
        jq0 jq0Var2 = (jq0) this.n;
        rg0.u(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                length = i6;
                jArr = jArr2;
                d70Var = d70Var2;
                jq0Var = jq0Var2;
                i = i5;
                dvVar = dvVar2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        jq0Var2 = jq0Var;
                        i3 = 0;
                        d70Var2 = d70Var;
                        jArr2 = jArr;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        dvVar2 = dvVar;
                        i5 = i;
                        i6 = length;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                int i7 = (i5 << 3) + i3;
                                dvVar2.e = i7;
                                Object obj2 = d70Var2.e.b[i7];
                                this.n = jq0Var2;
                                this.e = dvVar2;
                                this.f = d70Var2;
                                this.g = jArr2;
                                this.h = i6;
                                this.i = i5;
                                this.l = j2;
                                this.j = i4;
                                this.k = i3;
                                this.m = 1;
                                jq0Var2.b(obj2, this);
                                return ck.d;
                            }
                            j2 >>= 8;
                            i3++;
                            if (i3 < i4) {
                            }
                        }
                    }
                    if (i != length) {
                    }
                }
            }
            return ky0.a;
        }
    }
}
