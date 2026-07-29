package o;

import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public class GF implements InterfaceC0290Lb {
    public final AbstractC0533Ul a;
    public final CH b;
    public final Y6 c;

    public GF(AbstractC0533Ul abstractC0533Ul, CH ch) {
        AbstractC0048Bt.n(abstractC0533Ul, "fileSystem");
        AbstractC0048Bt.n(ch, "path");
        this.a = abstractC0533Ul;
        this.b = ch;
        this.c = new Y6();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[Catch: FileNotFoundException -> 0x0087, TRY_ENTER, TryCatch #4 {FileNotFoundException -> 0x0087, blocks: (B:15:0x0083, B:18:0x008b, B:47:0x0041), top: B:46:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b A[Catch: FileNotFoundException -> 0x0087, TRY_LEAVE, TryCatch #4 {FileNotFoundException -> 0x0087, blocks: (B:15:0x0083, B:18:0x008b, B:47:0x0041), top: B:46:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(GF gf, AbstractC2367ze abstractC2367ze) {
        FF ff;
        int i;
        Throwable th;
        GF gf2;
        FileNotFoundException e;
        JL jl;
        Throwable th2;
        if (abstractC2367ze instanceof FF) {
            ff = (FF) abstractC2367ze;
            int i2 = ff.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ff.l = i2 - Integer.MIN_VALUE;
                Object obj = ff.j;
                i = ff.l;
                boolean z = true;
                th = null;
                if (i != 0) {
                    AbstractC1494mO.l(obj);
                    if (gf.c.a.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        JL h = AbstractC0946e20.h(gf.a.h(gf.b));
                        try {
                            HO ho = HO.J;
                            ff.h = gf;
                            ff.i = h;
                            ff.l = 1;
                            ID p = ho.p(h);
                            EnumC0448Re enumC0448Re = EnumC0448Re.h;
                            if (p == enumC0448Re) {
                                return enumC0448Re;
                            }
                            gf2 = gf;
                            jl = h;
                            obj = p;
                        } catch (Throwable th3) {
                            gf2 = gf;
                            jl = h;
                            th2 = th3;
                            if (jl != null) {
                            }
                            th = th2;
                            obj = null;
                            if (th == null) {
                            }
                        }
                    } catch (FileNotFoundException e2) {
                        gf2 = gf;
                        e = e2;
                        if (gf2.a.d(gf2.b)) {
                            return new ID(z);
                        }
                        throw e;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jl = ff.i;
                    gf2 = ff.h;
                    try {
                        AbstractC1494mO.l(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        if (jl != null) {
                            try {
                                jl.close();
                            } catch (Throwable th5) {
                                try {
                                    AbstractC0946e20.e(th2, th5);
                                } catch (FileNotFoundException e3) {
                                    e = e3;
                                    if (gf2.a.d(gf2.b)) {
                                    }
                                }
                            }
                        }
                        th = th2;
                        obj = null;
                        if (th == null) {
                        }
                    }
                }
                if (jl != null) {
                    try {
                        jl.close();
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                if (th == null) {
                    throw th;
                }
                AbstractC0048Bt.k(obj);
                return obj;
            }
        }
        ff = new FF(gf, abstractC2367ze);
        Object obj2 = ff.j;
        i = ff.l;
        boolean z2 = true;
        th = null;
        if (i != 0) {
        }
        if (jl != null) {
        }
        if (th == null) {
        }
    }

    @Override // o.InterfaceC0290Lb
    public final void close() {
        this.c.a.set(true);
    }
}
