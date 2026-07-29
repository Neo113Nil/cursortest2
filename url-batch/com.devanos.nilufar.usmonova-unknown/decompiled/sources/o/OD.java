package o;

/* loaded from: classes.dex */
public final class OD extends AbstractC1296jO implements InterfaceC2312yp {
    public C2247xq i;
    public QD j;
    public long[] k;
    public int l;
    public int m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public int f75o;
    public long p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ QD s;
    public final /* synthetic */ C2247xq t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OD(QD qd, C2247xq c2247xq, InterfaceC2235xe interfaceC2235xe) {
        super(interfaceC2235xe);
        this.s = qd;
        this.t = c2247xq;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        OD od = new OD(this.s, this.t, interfaceC2235xe);
        od.r = obj;
        return od;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((OD) create((OQ) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:14:0x009c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0050 -> B:6:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006c -> B:5:0x0091). Please report as a decompilation issue!!! */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OQ oq;
        QD qd;
        long[] jArr;
        int length;
        C2247xq c2247xq;
        int i;
        long j;
        int i2 = this.q;
        if (i2 == 0) {
            AbstractC1494mO.l(obj);
            oq = (OQ) this.r;
            qd = this.s;
            jArr = qd.a;
            length = jArr.length - 2;
            if (length >= 0) {
                c2247xq = this.t;
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
        int i3 = this.f75o;
        int i4 = this.n;
        long j2 = this.p;
        int i5 = this.m;
        int i6 = this.l;
        long[] jArr2 = this.k;
        QD qd2 = this.j;
        C2247xq c2247xq2 = this.i;
        OQ oq2 = (OQ) this.r;
        AbstractC1494mO.l(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                length = i6;
                jArr = jArr2;
                qd = qd2;
                oq = oq2;
                i = i5;
                c2247xq = c2247xq2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        oq2 = oq;
                        i3 = 0;
                        qd2 = qd;
                        jArr2 = jArr;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        c2247xq2 = c2247xq;
                        i5 = i;
                        i6 = length;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                int i7 = (i5 << 3) + i3;
                                c2247xq2.i = i7;
                                Object obj2 = qd2.b[i7];
                                this.r = oq2;
                                this.i = c2247xq2;
                                this.j = qd2;
                                this.k = jArr2;
                                this.l = i6;
                                this.m = i5;
                                this.p = j2;
                                this.n = i4;
                                this.f75o = i3;
                                this.q = 1;
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
