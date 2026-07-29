package o;

/* renamed from: o.sS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1893sS extends AbstractC1296jO implements InterfaceC2312yp {
    public int[] i;
    public int j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C1959tS n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1893sS(C1959tS c1959tS, InterfaceC2235xe interfaceC2235xe) {
        super(interfaceC2235xe);
        this.n = c1959tS;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C1893sS c1893sS = new C1893sS(this.n, interfaceC2235xe);
        c1893sS.m = obj;
        return c1893sS;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C1893sS) create((OQ) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00be -> B:7:0x00bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0084 -> B:20:0x0098). Please report as a decompilation issue!!! */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        OQ oq;
        int[] iArr;
        int length;
        int i;
        OQ oq2;
        int i2;
        OQ oq3;
        int i3;
        C1959tS c1959tS = this.n;
        long j2 = c1959tS.h;
        int i4 = c1959tS.j;
        long j3 = c1959tS.i;
        int i5 = this.l;
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        if (i5 == 0) {
            j = 0;
            AbstractC1494mO.l(obj);
            oq = (OQ) this.m;
            iArr = c1959tS.k;
            if (iArr != null) {
                length = iArr.length;
                i = 0;
            }
            if (j3 != j) {
                oq2 = oq;
                i2 = 0;
                if (i2 >= 64) {
                }
            }
            if (j2 != j) {
            }
            return C0782bY.a;
        }
        if (i5 == 1) {
            length = this.k;
            int i6 = this.j;
            iArr = this.i;
            j = 0;
            oq = (OQ) this.m;
            AbstractC1494mO.l(obj);
            i = i6 + 1;
        } else {
            if (i5 != 2) {
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = this.j;
                oq3 = (OQ) this.m;
                AbstractC1494mO.l(obj);
                j = 0;
                i3 = i7 + 1;
                if (i3 < 64) {
                    if (((1 << i3) & j2) != j) {
                        Integer num = new Integer(i3 + 64 + i4);
                        this.m = oq3;
                        this.i = null;
                        this.j = i3;
                        this.l = 3;
                        oq3.b(num, this);
                        return enumC0448Re;
                    }
                    i7 = i3;
                    i3 = i7 + 1;
                    if (i3 < 64) {
                    }
                }
                return C0782bY.a;
            }
            i2 = this.j;
            oq2 = (OQ) this.m;
            AbstractC1494mO.l(obj);
            j = 0;
            i2++;
            if (i2 >= 64) {
                oq = oq2;
                if (j2 != j) {
                    oq3 = oq;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return C0782bY.a;
            }
            if (((1 << i2) & j3) != j) {
                Integer num2 = new Integer(i4 + i2);
                this.m = oq2;
                this.i = null;
                this.j = i2;
                this.l = 2;
                oq2.b(num2, this);
                return enumC0448Re;
            }
            i2++;
            if (i2 >= 64) {
            }
        }
        if (i < length) {
            Integer num3 = new Integer(iArr[i]);
            this.m = oq;
            this.i = iArr;
            this.j = i;
            this.k = length;
            this.l = 1;
            oq.b(num3, this);
            return enumC0448Re;
        }
        if (j3 != j) {
        }
        if (j2 != j) {
        }
        return C0782bY.a;
    }
}
