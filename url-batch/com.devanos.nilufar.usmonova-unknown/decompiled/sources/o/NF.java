package o;

/* loaded from: classes.dex */
public final class NF extends GF {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098 A[Catch: all -> 0x00a4, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00a4, blocks: (B:18:0x0098, B:30:0x00a6, B:61:0x0055), top: B:60:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6 A[Catch: all -> 0x00a4, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00a4, blocks: (B:18:0x0098, B:30:0x00a6, B:61:0x0055), top: B:60:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, AbstractC2367ze abstractC2367ze) {
        MF mf;
        int i;
        C0935dv g;
        Throwable th;
        IL il;
        C0935dv c0935dv;
        C0782bY c0782bY;
        Throwable th2;
        C0782bY c0782bY2;
        if (abstractC2367ze instanceof MF) {
            mf = (MF) abstractC2367ze;
            int i2 = mf.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mf.m = i2 - Integer.MIN_VALUE;
                Object obj2 = mf.k;
                i = mf.m;
                C0782bY c0782bY3 = C0782bY.a;
                Throwable th3 = null;
                if (i != 0) {
                    AbstractC1494mO.l(obj2);
                    if (this.c.a.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    AbstractC0533Ul abstractC0533Ul = this.a;
                    abstractC0533Ul.getClass();
                    CH ch = this.b;
                    AbstractC0048Bt.n(ch, "file");
                    g = abstractC0533Ul.g(ch);
                    try {
                        IL g2 = AbstractC0946e20.g(C0935dv.b(g));
                        try {
                            HO ho = HO.J;
                            mf.h = g;
                            mf.i = g;
                            mf.j = g2;
                            mf.m = 1;
                            ho.u(obj, g2);
                            EnumC0448Re enumC0448Re = EnumC0448Re.h;
                            if (c0782bY3 == enumC0448Re) {
                                return enumC0448Re;
                            }
                            il = g2;
                            c0935dv = g;
                        } catch (Throwable th4) {
                            th = th4;
                            il = g2;
                            c0935dv = g;
                            if (il != null) {
                                try {
                                    il.close();
                                } catch (Throwable th5) {
                                    try {
                                        AbstractC0946e20.e(th, th5);
                                    } catch (Throwable th6) {
                                        th = th6;
                                        g = c0935dv;
                                        if (g != null) {
                                            try {
                                                g.close();
                                            } catch (Throwable th7) {
                                                AbstractC0946e20.e(th, th7);
                                            }
                                        }
                                        th3 = th;
                                        c0782bY = null;
                                        if (th3 != null) {
                                        }
                                    }
                                }
                            }
                            th2 = th;
                            c0782bY2 = null;
                            C0935dv c0935dv2 = c0935dv;
                            if (th2 == null) {
                            }
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        if (g != null) {
                        }
                        th3 = th;
                        c0782bY = null;
                        if (th3 != null) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    il = mf.j;
                    g = mf.i;
                    c0935dv = mf.h;
                    try {
                        AbstractC1494mO.l(obj2);
                    } catch (Throwable th9) {
                        th = th9;
                        if (il != null) {
                        }
                        th2 = th;
                        c0782bY2 = null;
                        C0935dv c0935dv22 = c0935dv;
                        if (th2 == null) {
                        }
                    }
                }
                g.flush();
                if (il != null) {
                    try {
                        il.close();
                    } catch (Throwable th10) {
                        th2 = th10;
                    }
                }
                th2 = null;
                c0782bY2 = c0782bY3;
                C0935dv c0935dv222 = c0935dv;
                if (th2 == null) {
                    throw th2;
                }
                AbstractC0048Bt.k(c0782bY2);
                if (c0935dv222 != null) {
                    try {
                        c0935dv222.close();
                    } catch (Throwable th11) {
                        th3 = th11;
                    }
                }
                c0782bY = c0782bY3;
                if (th3 != null) {
                    throw th3;
                }
                AbstractC0048Bt.k(c0782bY);
                return c0782bY3;
            }
        }
        mf = new MF(this, abstractC2367ze);
        Object obj22 = mf.k;
        i = mf.m;
        C0782bY c0782bY32 = C0782bY.a;
        Throwable th32 = null;
        if (i != 0) {
        }
        g.flush();
        if (il != null) {
        }
        th2 = null;
        c0782bY2 = c0782bY32;
        C0935dv c0935dv2222 = c0935dv;
        if (th2 == null) {
        }
    }
}
