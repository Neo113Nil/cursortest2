package o;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: o.hE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1156hE extends SD {

    /* renamed from: o, reason: collision with root package name */
    public final SD f173o;
    public boolean p;

    public C1156hE(int i, C1959tS c1959tS, InterfaceC2114vp interfaceC2114vp, InterfaceC2114vp interfaceC2114vp2, SD sd) {
        super(i, c1959tS, interfaceC2114vp, interfaceC2114vp2);
        this.f173o = sd;
        sd.k();
    }

    @Override // o.SD, o.AbstractC1696pS
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.f173o.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:11:0x0020, B:13:0x0025, B:16:0x002a, B:21:0x0044, B:23:0x004c, B:24:0x005e, B:26:0x0066, B:27:0x006b, B:29:0x008c, B:30:0x00a2, B:31:0x00a9, B:34:0x00b2, B:35:0x00b3, B:44:0x00be, B:47:0x00d4, B:48:0x00c4, B:51:0x00e9, B:52:0x00ea, B:53:0x009f, B:54:0x0053, B:55:0x005b, B:33:0x00aa), top: B:10:0x0020, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:11:0x0020, B:13:0x0025, B:16:0x002a, B:21:0x0044, B:23:0x004c, B:24:0x005e, B:26:0x0066, B:27:0x006b, B:29:0x008c, B:30:0x00a2, B:31:0x00a9, B:34:0x00b2, B:35:0x00b3, B:44:0x00be, B:47:0x00d4, B:48:0x00c4, B:51:0x00e9, B:52:0x00ea, B:53:0x009f, B:54:0x0053, B:55:0x005b, B:33:0x00aa), top: B:10:0x0020, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:11:0x0020, B:13:0x0025, B:16:0x002a, B:21:0x0044, B:23:0x004c, B:24:0x005e, B:26:0x0066, B:27:0x006b, B:29:0x008c, B:30:0x00a2, B:31:0x00a9, B:34:0x00b2, B:35:0x00b3, B:44:0x00be, B:47:0x00d4, B:48:0x00c4, B:51:0x00e9, B:52:0x00ea, B:53:0x009f, B:54:0x0053, B:55:0x005b, B:33:0x00aa), top: B:10:0x0020, inners: #1 }] */
    @Override // o.SD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0772bO v() {
        int i;
        SD sd = this.f173o;
        if (sd.m || sd.c) {
            return new C1762qS();
        }
        QD qd = this.h;
        int i2 = this.b;
        HashMap c = qd != null ? AbstractC2025uS.c(sd, this, sd.e()) : null;
        Object obj = AbstractC2025uS.b;
        synchronized (obj) {
            try {
                AbstractC2025uS.d(this);
                if (qd != null && qd.d != 0) {
                    AbstractC0772bO y = y(this.f173o.d(), c, this.f173o.e());
                    if (!y.equals(C1827rS.i)) {
                        return y;
                    }
                    QD w = this.f173o.w();
                    if (w != null) {
                        w.i(qd);
                    } else {
                        this.f173o.A(qd);
                        this.h = null;
                    }
                    if (this.f173o.d() < i2) {
                        this.f173o.u();
                    }
                    SD sd2 = this.f173o;
                    sd2.r(sd2.e().k(i2).j(this.j));
                    this.f173o.z(i2);
                    SD sd3 = this.f173o;
                    i = this.d;
                    this.d = -1;
                    if (i < 0) {
                        int[] iArr = sd3.k;
                        AbstractC0048Bt.n(iArr, "<this>");
                        int length = iArr.length;
                        int[] copyOf = Arrays.copyOf(iArr, length + 1);
                        copyOf[length] = i;
                        sd3.k = copyOf;
                    } else {
                        sd3.getClass();
                    }
                    SD sd4 = this.f173o;
                    C1959tS c1959tS = this.j;
                    sd4.getClass();
                    synchronized (obj) {
                        sd4.j = sd4.j.m(c1959tS);
                        SD sd5 = this.f173o;
                        int[] iArr2 = this.k;
                        sd5.getClass();
                        if (iArr2.length != 0) {
                            int[] iArr3 = sd5.k;
                            if (iArr3.length != 0) {
                                int length2 = iArr3.length;
                                int length3 = iArr2.length;
                                int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                                System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                                AbstractC0048Bt.k(copyOf2);
                                iArr2 = copyOf2;
                            }
                            sd5.k = iArr2;
                        }
                    }
                    this.m = true;
                    if (!this.p) {
                        this.p = true;
                        this.f173o.l();
                    }
                    return C1827rS.i;
                }
                a();
                if (this.f173o.d() < i2) {
                }
                SD sd22 = this.f173o;
                sd22.r(sd22.e().k(i2).j(this.j));
                this.f173o.z(i2);
                SD sd32 = this.f173o;
                i = this.d;
                this.d = -1;
                if (i < 0) {
                }
                SD sd42 = this.f173o;
                C1959tS c1959tS2 = this.j;
                sd42.getClass();
                synchronized (obj) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
