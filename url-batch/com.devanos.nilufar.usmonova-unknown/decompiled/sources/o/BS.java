package o;

/* loaded from: classes.dex */
public final class BS extends AbstractC2225xU implements InterfaceC2312yp {
    public QD h;
    public InterfaceC2114vp i;
    public InterfaceC2363za j;
    public C1932t2 k;
    public Object l;
    public int m;
    public /* synthetic */ Object n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1139h0 f19o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BS(C1139h0 c1139h0, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.f19o = c1139h0;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        BS bs = new BS(this.f19o, interfaceC2235xe);
        bs.n = obj;
        return bs;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        ((BS) create((InterfaceC2309ym) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
        return EnumC0448Re.h;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b0 A[LOOP:0: B:18:0x00da->B:26:0x01b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0158 A[EDGE_INSN: B:27:0x0158->B:28:0x0158 BREAK  A[LOOP:0: B:18:0x00da->B:26:0x01b0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015a A[Catch: all -> 0x019a, TRY_LEAVE, TryCatch #4 {all -> 0x019a, blocks: (B:72:0x011b, B:21:0x0149, B:24:0x0153, B:29:0x015a, B:36:0x0172, B:38:0x017b, B:77:0x0126, B:91:0x0132), top: B:71:0x011b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0193 -> B:10:0x0194). Please report as a decompilation issue!!! */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BS.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
