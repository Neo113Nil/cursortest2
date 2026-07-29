package o;

/* loaded from: classes.dex */
public final class XP extends AbstractC1296jO implements InterfaceC2312yp {
    public Object[] i;
    public long[] j;
    public int k;
    public int l;
    public int m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public long f129o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ YP r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XP(YP yp, InterfaceC2235xe interfaceC2235xe) {
        super(interfaceC2235xe);
        this.r = yp;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        XP xp = new XP(this.r, interfaceC2235xe);
        xp.q = obj;
        return xp;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((XP) create((OQ) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004d -> B:14:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004f -> B:6:0x0060). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0069 -> B:5:0x0088). Please report as a decompilation issue!!! */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OQ oq;
        Object[] objArr;
        long[] jArr;
        int length;
        int i;
        long j;
        int i2 = this.p;
        if (i2 == 0) {
            AbstractC1494mO.l(obj);
            oq = (OQ) this.q;
            QD qd = this.r.h;
            objArr = qd.b;
            jArr = qd.a;
            length = jArr.length - 2;
            if (length >= 0) {
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return C0782bY.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i3 = this.n;
        int i4 = this.m;
        long j2 = this.f129o;
        i = this.l;
        int i5 = this.k;
        long[] jArr2 = this.j;
        Object[] objArr2 = this.i;
        OQ oq2 = (OQ) this.q;
        AbstractC1494mO.l(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                length = i5;
                jArr = jArr2;
                objArr = objArr2;
                oq = oq2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        oq2 = oq;
                        i3 = 0;
                        jArr2 = jArr;
                        i5 = length;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        objArr2 = objArr;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                Object obj2 = objArr2[(i << 3) + i3];
                                this.q = oq2;
                                this.i = objArr2;
                                this.j = jArr2;
                                this.k = i5;
                                this.l = i;
                                this.f129o = j2;
                                this.m = i4;
                                this.n = i3;
                                this.p = 1;
                                oq2.b(obj2, this);
                                return EnumC0448Re.h;
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
            return C0782bY.a;
        }
    }
}
