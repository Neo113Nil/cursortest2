package o;

/* renamed from: o.wf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2170wf {
    public final /* synthetic */ ZD a;
    public final /* synthetic */ C1098gM b;
    public final /* synthetic */ C1360kM c;
    public final /* synthetic */ C0657Zf d;

    public C2170wf(ZD zd, C1098gM c1098gM, C1360kM c1360kM, C0657Zf c0657Zf) {
        this.a = zd;
        this.b = c1098gM;
        this.c = c1360kM;
        this.d = c0657Zf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d4, TRY_LEAVE, TryCatch #0 {all -> 0x00d4, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d7, B:46:0x00de), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7 A[Catch: all -> 0x00d4, TRY_ENTER, TryCatch #0 {all -> 0x00d4, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d7, B:46:0x00de), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [o.ZD] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C1906sf c1906sf, AbstractC2367ze abstractC2367ze) {
        C2104vf c2104vf;
        int i;
        C0657Zf c0657Zf;
        C0762bE c0762bE;
        C1098gM c1098gM;
        C1360kM c1360kM;
        InterfaceC2312yp interfaceC2312yp;
        ZD zd;
        ZD zd2;
        C0657Zf c0657Zf2;
        Object obj;
        try {
            if (abstractC2367ze instanceof C2104vf) {
                c2104vf = (C2104vf) abstractC2367ze;
                int i2 = c2104vf.f233o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2104vf.f233o = i2 - Integer.MIN_VALUE;
                    Object obj2 = c2104vf.m;
                    i = c2104vf.f233o;
                    EnumC0448Re enumC0448Re = EnumC0448Re.h;
                    if (i != 0) {
                        AbstractC1494mO.l(obj2);
                        c2104vf.h = c1906sf;
                        ZD zd3 = this.a;
                        c2104vf.i = zd3;
                        C1098gM c1098gM2 = this.b;
                        c2104vf.j = c1098gM2;
                        C1360kM c1360kM2 = this.c;
                        c2104vf.k = c1360kM2;
                        c0657Zf = this.d;
                        c2104vf.l = c0657Zf;
                        c2104vf.f233o = 1;
                        c0762bE = (C0762bE) zd3;
                        if (c0762bE.c(c2104vf) != enumC0448Re) {
                            c1098gM = c1098gM2;
                            c1360kM = c1360kM2;
                            interfaceC2312yp = c1906sf;
                        }
                        return enumC0448Re;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = c2104vf.j;
                            c1360kM = (C1360kM) c2104vf.i;
                            zd = (ZD) c2104vf.h;
                            try {
                                AbstractC1494mO.l(obj2);
                                c1360kM.h = obj;
                                Object obj3 = c1360kM.h;
                                ((C0762bE) zd).e(null);
                                return obj3;
                            } catch (Throwable th) {
                                th = th;
                                ((C0762bE) zd).e(null);
                                throw th;
                            }
                        }
                        c0657Zf2 = (C0657Zf) c2104vf.j;
                        c1360kM = (C1360kM) c2104vf.i;
                        zd2 = (ZD) c2104vf.h;
                        try {
                            AbstractC1494mO.l(obj2);
                            if (!AbstractC0048Bt.h(obj2, c1360kM.h)) {
                                zd = zd2;
                                Object obj32 = c1360kM.h;
                                ((C0762bE) zd).e(null);
                                return obj32;
                            }
                            c2104vf.h = zd2;
                            c2104vf.i = c1360kM;
                            c2104vf.j = obj2;
                            c2104vf.f233o = 3;
                            if (c0657Zf2.i(obj2, false, c2104vf) != enumC0448Re) {
                                obj = obj2;
                                zd = zd2;
                                c1360kM.h = obj;
                                Object obj322 = c1360kM.h;
                                ((C0762bE) zd).e(null);
                                return obj322;
                            }
                            return enumC0448Re;
                        } catch (Throwable th2) {
                            th = th2;
                            zd = zd2;
                            ((C0762bE) zd).e(null);
                            throw th;
                        }
                    }
                    C0657Zf c0657Zf3 = c2104vf.l;
                    c1360kM = c2104vf.k;
                    c1098gM = (C1098gM) c2104vf.j;
                    ?? r7 = (ZD) c2104vf.i;
                    InterfaceC2312yp interfaceC2312yp2 = (InterfaceC2312yp) c2104vf.h;
                    AbstractC1494mO.l(obj2);
                    c0657Zf = c0657Zf3;
                    interfaceC2312yp = interfaceC2312yp2;
                    c0762bE = r7;
                    if (!c1098gM.h) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = c1360kM.h;
                    c2104vf.h = c0762bE;
                    c2104vf.i = c1360kM;
                    c2104vf.j = c0657Zf;
                    c2104vf.k = null;
                    c2104vf.l = null;
                    c2104vf.f233o = 2;
                    Object invoke = interfaceC2312yp.invoke(obj4, c2104vf);
                    if (invoke != enumC0448Re) {
                        zd2 = c0762bE;
                        obj2 = invoke;
                        c0657Zf2 = c0657Zf;
                        if (!AbstractC0048Bt.h(obj2, c1360kM.h)) {
                        }
                    }
                    return enumC0448Re;
                }
            }
            if (!c1098gM.h) {
            }
        } catch (Throwable th3) {
            th = th3;
            zd = c0762bE;
            ((C0762bE) zd).e(null);
            throw th;
        }
        c2104vf = new C2104vf(this, abstractC2367ze);
        Object obj22 = c2104vf.m;
        i = c2104vf.f233o;
        EnumC0448Re enumC0448Re2 = EnumC0448Re.h;
        if (i != 0) {
        }
    }
}
