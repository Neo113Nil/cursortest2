package yads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class v23 extends sz2 {
    public final xb2 a = new xb2();
    public final wb2 b = new wb2();
    public m73 c;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r6 != r8) goto L15;
     */
    @Override // yads.sz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ht1 a(jt1 jt1Var, ByteBuffer byteBuffer) {
        gt1 a33Var;
        int i;
        ArrayList arrayList;
        long j;
        ArrayList arrayList2;
        long j2;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        int i4;
        long j4;
        boolean z4;
        List list;
        long j5;
        long j6;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i5;
        int i6;
        int i7;
        boolean z9;
        int i8 = 32;
        boolean z10 = true;
        m73 m73Var = this.c;
        if (m73Var != null) {
            long j7 = jt1Var.i;
            synchronized (m73Var) {
                long j8 = m73Var.b;
            }
        }
        m73 m73Var2 = new m73(jt1Var.f);
        this.c = m73Var2;
        m73Var2.a(jt1Var.f - jt1Var.i);
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        xb2 xb2Var = this.a;
        xb2Var.a = array;
        xb2Var.c = limit;
        xb2Var.b = 0;
        this.b.b(array, limit);
        this.b.c(39);
        long a = (this.b.a(1) << 32) | this.b.a(32);
        this.b.c(20);
        int a2 = this.b.a(12);
        int a3 = this.b.a(8);
        xb2 xb2Var2 = this.a;
        xb2Var2.e(xb2Var2.b + 14);
        if (a3 == 0) {
            a33Var = new a33();
        } else if (a3 != 255) {
            long j9 = 1;
            long j10 = -9223372036854775807L;
            if (a3 == 4) {
                xb2 xb2Var3 = this.a;
                int k = xb2Var3.k();
                ArrayList arrayList3 = new ArrayList(k);
                int i9 = 0;
                while (i9 < k) {
                    long l = xb2Var3.l();
                    boolean z11 = (xb2Var3.k() & 128) != 0 ? z10 : false;
                    ArrayList arrayList4 = new ArrayList();
                    if (z11) {
                        i = i8;
                        arrayList = arrayList3;
                        j = j9;
                        arrayList2 = arrayList4;
                        j2 = -9223372036854775807L;
                        j3 = -9223372036854775807L;
                        z = false;
                        z2 = false;
                        z3 = false;
                        i2 = 0;
                        i3 = 0;
                        i4 = 0;
                    } else {
                        int k2 = xb2Var3.k();
                        boolean z12 = (k2 & 128) != 0 ? z10 : false;
                        boolean z13 = (k2 & 64) != 0 ? z10 : false;
                        boolean z14 = (k2 & i8) != 0 ? z10 : false;
                        long l2 = z13 ? xb2Var3.l() : -9223372036854775807L;
                        if (z13) {
                            arrayList = arrayList3;
                        } else {
                            int k3 = xb2Var3.k();
                            ArrayList arrayList5 = new ArrayList(k3);
                            int i10 = 0;
                            while (i10 < k3) {
                                arrayList5.add(new c33(xb2Var3.k(), xb2Var3.l()));
                                i10++;
                                arrayList3 = arrayList3;
                            }
                            arrayList = arrayList3;
                            arrayList4 = arrayList5;
                        }
                        if (z14) {
                            long k4 = xb2Var3.k();
                            z4 = (k4 & 128) != 0;
                            j = 1;
                            i = 32;
                            j4 = ((((k4 & 1) << 32) | xb2Var3.l()) * 1000) / 90;
                        } else {
                            i = 32;
                            j = 1;
                            j4 = -9223372036854775807L;
                            z4 = false;
                        }
                        j3 = j4;
                        z3 = z4;
                        arrayList2 = arrayList4;
                        z = z12;
                        z2 = z13;
                        j2 = l2;
                        i2 = xb2Var3.p();
                        i3 = xb2Var3.k();
                        i4 = xb2Var3.k();
                    }
                    ArrayList arrayList6 = arrayList;
                    arrayList6.add(new d33(l, z11, z, z2, arrayList2, j2, z3, j3, i2, i3, i4));
                    i9++;
                    arrayList3 = arrayList6;
                    j9 = j;
                    z10 = true;
                    i8 = i;
                }
                a33Var = new e33(arrayList3);
            } else if (a3 == 5) {
                xb2 xb2Var4 = this.a;
                m73 m73Var3 = this.c;
                long l3 = xb2Var4.l();
                boolean z15 = (xb2Var4.k() & 128) != 0;
                List emptyList = Collections.emptyList();
                if (z15) {
                    list = emptyList;
                    j5 = -9223372036854775807L;
                    j6 = -9223372036854775807L;
                    z5 = false;
                    z6 = false;
                    z7 = false;
                    z8 = false;
                    i5 = 0;
                    i6 = 0;
                    i7 = 0;
                } else {
                    int k5 = xb2Var4.k();
                    boolean z16 = (k5 & 128) != 0;
                    boolean z17 = (k5 & 64) != 0;
                    boolean z18 = (k5 & 32) != 0;
                    boolean z19 = (k5 & 16) != 0;
                    long a4 = (!z17 || z19) ? -9223372036854775807L : z63.a(xb2Var4, a);
                    if (!z17) {
                        int k6 = xb2Var4.k();
                        ArrayList arrayList7 = new ArrayList(k6);
                        for (int i11 = 0; i11 < k6; i11++) {
                            int k7 = xb2Var4.k();
                            long a5 = !z19 ? z63.a(xb2Var4, a) : -9223372036854775807L;
                            arrayList7.add(new x23(k7, a5, m73Var3.b(a5)));
                        }
                        emptyList = arrayList7;
                    }
                    if (z18) {
                        long k8 = xb2Var4.k();
                        z9 = (k8 & 128) != 0;
                        j10 = ((((k8 & 1) << 32) | xb2Var4.l()) * 1000) / 90;
                    } else {
                        z9 = false;
                    }
                    int p = xb2Var4.p();
                    int k9 = xb2Var4.k();
                    i7 = xb2Var4.k();
                    z8 = z9;
                    i5 = p;
                    list = emptyList;
                    i6 = k9;
                    z5 = z16;
                    j6 = j10;
                    j5 = a4;
                    z7 = z19;
                    z6 = z17;
                }
                a33Var = new y23(l3, z15, z5, z6, z7, j5, m73Var3.b(j5), list, z8, j6, i5, i6, i7);
            } else if (a3 != 6) {
                a33Var = null;
            } else {
                xb2 xb2Var5 = this.a;
                m73 m73Var4 = this.c;
                long a6 = z63.a(xb2Var5, a);
                a33Var = new z63(a6, m73Var4.b(a6));
            }
        } else {
            xb2 xb2Var6 = this.a;
            long l4 = xb2Var6.l();
            int i12 = a2 - 4;
            byte[] bArr = new byte[i12];
            xb2Var6.a(bArr, 0, i12);
            a33Var = new fj2(l4, bArr, a);
        }
        return a33Var == null ? new ht1(new gt1[0]) : new ht1(a33Var);
    }
}
