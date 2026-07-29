package o;

/* renamed from: o.Pf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0397Pf extends AbstractC2225xU implements InterfaceC2312yp {
    public Object h;
    public int i;
    public /* synthetic */ boolean j;
    public final /* synthetic */ C0657Zf k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0397Pf(C0657Zf c0657Zf, int i, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.k = c0657Zf;
        this.l = i;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0397Pf c0397Pf = new C0397Pf(this.k, this.l, interfaceC2235xe);
        c0397Pf.j = ((Boolean) obj).booleanValue();
        return c0397Pf;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C0397Pf) create(bool, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        if (r7 == r4) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object obj2;
        int i;
        int i2 = this.i;
        C0657Zf c0657Zf = this.k;
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        if (i2 == 0) {
            AbstractC1494mO.l(obj);
            z = this.j;
            this.j = z;
            this.i = 1;
            obj = c0657Zf.h(this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.h;
                AbstractC1494mO.l(obj);
                i = ((Number) obj).intValue();
                return new C1643of(obj2 != null ? obj2.hashCode() : 0, i, obj2);
            }
            z = this.j;
            AbstractC1494mO.l(obj);
        }
        if (!z) {
            obj2 = obj;
            i = this.l;
            return new C1643of(obj2 != null ? obj2.hashCode() : 0, i, obj2);
        }
        SR f = c0657Zf.f();
        this.h = obj;
        this.i = 2;
        Integer a = f.a();
        if (a != enumC0448Re) {
            obj2 = obj;
            obj = a;
            i = ((Number) obj).intValue();
            return new C1643of(obj2 != null ? obj2.hashCode() : 0, i, obj2);
        }
        return enumC0448Re;
    }
}
