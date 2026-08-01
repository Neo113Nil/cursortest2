package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ye {
    public uc a;
    public boolean b;
    public boolean c;
    public uc d;
    public ArrayList e;
    public jc f;
    public q7 g;
    public ArrayList h;

    public final void a(ze zeVar, int i, ArrayList arrayList, l00 l00Var) {
        w90 w90Var = zeVar.d;
        l00 l00Var2 = w90Var.c;
        ze zeVar2 = w90Var.i;
        ze zeVar3 = w90Var.h;
        if (l00Var2 == null) {
            uc ucVar = this.a;
            if (w90Var == ucVar.d || w90Var == ucVar.e) {
                return;
            }
            if (l00Var == null) {
                l00Var = new l00();
                l00Var.a = null;
                l00Var.b = new ArrayList();
                l00Var.a = w90Var;
                arrayList.add(l00Var);
            }
            w90Var.c = l00Var;
            l00Var.b.add(w90Var);
            ArrayList arrayList2 = zeVar3.k;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                xe xeVar = (xe) obj;
                if (xeVar instanceof ze) {
                    a((ze) xeVar, i, arrayList, l00Var);
                }
            }
            ArrayList arrayList3 = zeVar2.k;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                xe xeVar2 = (xe) obj2;
                if (xeVar2 instanceof ze) {
                    a((ze) xeVar2, i, arrayList, l00Var);
                }
            }
            if (i == 1 && (w90Var instanceof q70)) {
                ArrayList arrayList4 = ((q70) w90Var).k.k;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    xe xeVar3 = (xe) obj3;
                    if (xeVar3 instanceof ze) {
                        a((ze) xeVar3, i, arrayList, l00Var);
                    }
                }
            }
            ArrayList arrayList5 = zeVar3.l;
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                a((ze) obj4, i, arrayList, l00Var);
            }
            ArrayList arrayList6 = zeVar2.l;
            int size5 = arrayList6.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                a((ze) obj5, i, arrayList, l00Var);
            }
            if (i == 1 && (w90Var instanceof q70)) {
                ArrayList arrayList7 = ((q70) w90Var).k.l;
                int size6 = arrayList7.size();
                while (i2 < size6) {
                    Object obj6 = arrayList7.get(i2);
                    i2++;
                    a((ze) obj6, i, arrayList, l00Var);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0274, code lost:
    
        r6 = 1;
        r9 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0277, code lost:
    
        f(r11, 0, r10, 0, r12);
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x029a, code lost:
    
        r7 = r10;
        r0 = r13;
        r10 = r8;
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00e8, code lost:
    
        if (r15 != 3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00ea, code lost:
    
        if (r6 != r0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00ec, code lost:
    
        f(r0, 0, r0, 0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00f5, code lost:
    
        r11 = r12.k();
        f(1, (int) ((r11 * r12.W) + 0.5f), 1, r11, r12);
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x012c, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x012f, code lost:
    
        if (r15 != 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0131, code lost:
    
        f(r8, 0, r6, 0, r12);
        r12.d.e.m = r12.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0145, code lost:
    
        if (r15 != 2) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0147, code lost:
    
        r0 = r2[r16];
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0149, code lost:
    
        if (r0 == 1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x014c, code lost:
    
        if (r0 != 4) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x014f, code lost:
    
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0152, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0154, code lost:
    
        f(1, (int) ((r4 * r25.q()) + 0.5f), r6, r12.k(), r12);
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0182, code lost:
    
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x018a, code lost:
    
        if (r7[r16].f == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0190, code lost:
    
        if (r7[1].f != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0192, code lost:
    
        f(r8, 0, r10, 0, r12);
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01b4, code lost:
    
        r8 = r0;
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00c9, code lost:
    
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c0, code lost:
    
        if (r13 == 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d4, code lost:
    
        if (r13 != 3) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d6, code lost:
    
        if (r6 == r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r6 != 1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dc, code lost:
    
        r8 = r0;
        r0 = 3;
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b8, code lost:
    
        if (r10 != r0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ba, code lost:
    
        if (r13 == r8) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01bc, code lost:
    
        if (r13 != r6) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01bf, code lost:
    
        r9 = r0;
        r7 = r10;
        r0 = r13;
        r10 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c3, code lost:
    
        r8 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x029f, code lost:
    
        if (r0 != r9) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02a1, code lost:
    
        if (r7 != r9) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02a3, code lost:
    
        if (r15 == r6) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02a5, code lost:
    
        if (r1 != r6) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02a9, code lost:
    
        if (r1 != 2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02ab, code lost:
    
        if (r15 != 2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02af, code lost:
    
        if (r2[r16] != r8) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02b3, code lost:
    
        if (r2[r6] != r8) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02b5, code lost:
    
        f(r8, (int) ((r4 * r25.q()) + 0.5f), r8, (int) ((r14 * r25.k()) + 0.5f), r12);
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02e8, code lost:
    
        f(r10, 0, r10, 0, r12);
        r12.d.e.m = r12.q();
        r12.e.e.m = r12.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c7, code lost:
    
        if (r1 != r0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c9, code lost:
    
        if (r13 != r8) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01cb, code lost:
    
        f(r8, 0, r8, 0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d3, code lost:
    
        r9 = r12.q();
        r0 = r12.W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01dc, code lost:
    
        if (r12.X != (-1)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01de, code lost:
    
        r0 = 1.0f / r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e0, code lost:
    
        f(r6, r9, r6, (int) ((r9 * r0) + 0.5f), r12);
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0208, code lost:
    
        if (r1 != 1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020a, code lost:
    
        f(r13, 0, r8, 0, r12);
        r12.e.e.m = r12.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x021f, code lost:
    
        r11 = r8;
        r8 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0222, code lost:
    
        if (r1 != 2) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0224, code lost:
    
        r7 = r2[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0226, code lost:
    
        if (r7 == r6) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0229, code lost:
    
        if (r7 != 4) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x022c, code lost:
    
        r0 = r8;
        r7 = r10;
        r10 = r11;
        r9 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0231, code lost:
    
        f(r8, r12.q(), r6, (int) ((r14 * r25.k()) + 0.5f), r12);
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x025f, code lost:
    
        r0 = r8;
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0267, code lost:
    
        if (r7[2].f == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
    
        if (r7[3].f != null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0272, code lost:
    
        r7 = r10;
        r10 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0337  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(uc ucVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ye yeVar;
        int i9;
        ArrayList arrayList = ucVar.q0;
        int[] iArr = ucVar.p0;
        int size = arrayList.size();
        char c = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tc tcVar = (tc) obj;
            int[] iArr2 = tcVar.p0;
            ec[] ecVarArr = tcVar.Q;
            ec ecVar = tcVar.L;
            ec ecVar2 = tcVar.J;
            ec ecVar3 = tcVar.K;
            ec ecVar4 = tcVar.I;
            int i11 = iArr2[c];
            int i12 = iArr2[1];
            char c2 = c;
            if (tcVar.g0 == 8) {
                tcVar.a = true;
                c = c2;
            } else {
                float f = tcVar.w;
                if (f < 1.0f && i11 == 3) {
                    tcVar.r = 2;
                }
                float f2 = tcVar.z;
                if (f2 < 1.0f && i12 == 3) {
                    tcVar.s = 2;
                }
                if (tcVar.W > 0.0f) {
                    if (i11 == 3) {
                        i9 = 2;
                        if (i12 == 2 || i12 == 1) {
                            i = 3;
                            tcVar.r = 3;
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 3;
                        i9 = 2;
                    }
                    if (i12 == i && (i11 == i9 || i11 == 1)) {
                        tcVar.s = i;
                    } else if (i11 == i && i12 == i) {
                        if (tcVar.r == 0) {
                            tcVar.r = i;
                        }
                        if (tcVar.s == 0) {
                            tcVar.s = i;
                        }
                    }
                } else {
                    i = 3;
                }
                if (i11 == i && tcVar.r == 1 && (ecVar4.f == null || ecVar3.f == null)) {
                    i11 = 2;
                }
                if (i12 == 3 && tcVar.s == 1 && (ecVar2.f == null || ecVar.f == null)) {
                    i12 = 2;
                }
                tm tmVar = tcVar.d;
                tmVar.d = i11;
                int i13 = tcVar.r;
                tmVar.a = i13;
                q70 q70Var = tcVar.e;
                q70Var.d = i12;
                ArrayList arrayList2 = arrayList;
                int i14 = tcVar.s;
                q70Var.a = i14;
                int i15 = (i11 == 4 || i11 == 1) ? 2 : 2;
                if (i12 != 4) {
                    if (i12 == 1) {
                        i4 = 1;
                        i2 = i12;
                        i3 = i11;
                        int q = tcVar.q();
                        if (i3 == 4) {
                            q = (ucVar.q() - ecVar4.g) - ecVar3.g;
                            i3 = i4;
                        }
                        int k = tcVar.k();
                        if (i2 != 4) {
                            int k2 = (ucVar.k() - ecVar2.g) - ecVar.g;
                            i5 = i4;
                            yeVar = this;
                            i6 = i3;
                            i7 = q;
                            i8 = k2;
                        } else {
                            i5 = i2;
                            i6 = i3;
                            i7 = q;
                            i8 = k;
                            yeVar = this;
                        }
                        yeVar.f(i6, i7, i5, i8, tcVar);
                        tcVar.d.e.d(tcVar.q());
                        tcVar.e.e.d(tcVar.k());
                        tcVar.a = true;
                        c = c2;
                        arrayList = arrayList2;
                    }
                }
                i2 = i12;
                i3 = i11;
                i4 = 1;
                int q2 = tcVar.q();
                if (i3 == 4) {
                }
                int k3 = tcVar.k();
                if (i2 != 4) {
                }
                yeVar.f(i6, i7, i5, i8, tcVar);
                tcVar.d.e.d(tcVar.q());
                tcVar.e.e.d(tcVar.k());
                tcVar.a = true;
                c = c2;
                arrayList = arrayList2;
            }
        }
    }

    public final void c() {
        uc ucVar = this.a;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.e;
        arrayList2.clear();
        uc ucVar2 = this.d;
        ucVar2.d.f();
        ucVar2.e.f();
        arrayList2.add(ucVar2.d);
        arrayList2.add(ucVar2.e);
        ArrayList arrayList3 = ucVar2.q0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            tc tcVar = (tc) obj;
            if (tcVar instanceof gm) {
                hm hmVar = new hm(tcVar);
                tcVar.d.f();
                tcVar.e.f();
                hmVar.f = ((gm) tcVar).u0;
                arrayList2.add(hmVar);
            } else {
                if (tcVar.x()) {
                    if (tcVar.b == null) {
                        tcVar.b = new l9(tcVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(tcVar.b);
                } else {
                    arrayList2.add(tcVar.d);
                }
                if (tcVar.y()) {
                    if (tcVar.c == null) {
                        tcVar.c = new l9(tcVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(tcVar.c);
                } else {
                    arrayList2.add(tcVar.e);
                }
                if (tcVar instanceof pm) {
                    arrayList2.add(new om(tcVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ((w90) obj2).f();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            w90 w90Var = (w90) obj3;
            if (w90Var.b != ucVar2) {
                w90Var.d();
            }
        }
        arrayList.clear();
        e(ucVar.d, 0, arrayList);
        e(ucVar.e, 1, arrayList);
        this.b = false;
    }

    public final int d(uc ucVar, int i) {
        ArrayList arrayList;
        int i2;
        long max;
        float f;
        uc ucVar2 = ucVar;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long j2 = 0;
        while (i3 < size) {
            w90 w90Var = ((l00) arrayList2.get(i3)).a;
            if (!(w90Var instanceof l9) ? !(i != 0 ? (w90Var instanceof q70) : (w90Var instanceof tm)) : ((l9) w90Var).f != i) {
                ze zeVar = (i == 0 ? ucVar2.d : ucVar2.e).h;
                ze zeVar2 = (i == 0 ? ucVar2.d : ucVar2.e).i;
                ze zeVar3 = w90Var.h;
                ze zeVar4 = w90Var.i;
                boolean contains = zeVar3.l.contains(zeVar);
                boolean contains2 = zeVar4.l.contains(zeVar2);
                long j3 = w90Var.j();
                if (contains && contains2) {
                    long b = l00.b(zeVar3, j);
                    arrayList = arrayList2;
                    long a = l00.a(zeVar4, j);
                    long j4 = b - j3;
                    int i4 = zeVar4.f;
                    i2 = i3;
                    if (j4 >= (-i4)) {
                        j4 += i4;
                    }
                    long j5 = zeVar3.f;
                    long j6 = ((-a) - j3) - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    tc tcVar = w90Var.b;
                    if (i == 0) {
                        f = tcVar.d0;
                    } else if (i == 1) {
                        f = tcVar.e0;
                    } else {
                        tcVar.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j4 / (1.0f - f)) + (j6 / f)) : 0L;
                    max = (zeVar3.f + ((((long) ((f2 * f) + 0.5f)) + j3) + ((long) (((1.0f - f) * f2) + 0.5f)))) - zeVar4.f;
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    max = contains ? Math.max(l00.b(zeVar3, zeVar3.f), zeVar3.f + j3) : contains2 ? Math.max(-l00.a(zeVar4, zeVar4.f), (-zeVar4.f) + j3) : (w90Var.j() + zeVar3.f) - zeVar4.f;
                }
            } else {
                arrayList = arrayList2;
                max = j;
                i2 = i3;
            }
            j2 = Math.max(j2, max);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            ucVar2 = ucVar;
            j = 0;
        }
        return (int) j2;
    }

    public final void e(w90 w90Var, int i, ArrayList arrayList) {
        ze zeVar = w90Var.h;
        ze zeVar2 = w90Var.i;
        ArrayList arrayList2 = zeVar.k;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            xe xeVar = (xe) obj;
            if (xeVar instanceof ze) {
                a((ze) xeVar, i, arrayList, null);
            } else if (xeVar instanceof w90) {
                a(((w90) xeVar).h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = zeVar2.k;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            xe xeVar2 = (xe) obj2;
            if (xeVar2 instanceof ze) {
                a((ze) xeVar2, i, arrayList, null);
            } else if (xeVar2 instanceof w90) {
                a(((w90) xeVar2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((q70) w90Var).k.k;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                xe xeVar3 = (xe) obj3;
                if (xeVar3 instanceof ze) {
                    a((ze) xeVar3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, tc tcVar) {
        q7 q7Var = this.g;
        q7Var.a = i;
        q7Var.b = i3;
        q7Var.c = i2;
        q7Var.d = i4;
        this.f.b(tcVar, q7Var);
        tcVar.O(q7Var.e);
        tcVar.L(q7Var.f);
        tcVar.E = q7Var.h;
        tcVar.I(q7Var.g);
    }

    public final void g() {
        o7 o7Var;
        ye yeVar = this;
        ArrayList arrayList = yeVar.a.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            tc tcVar = (tc) arrayList.get(i);
            if (!tcVar.a) {
                int[] iArr = tcVar.p0;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = tcVar.r;
                int i6 = tcVar.s;
                boolean z = i3 == 2 || (i3 == 3 && i5 == 1);
                boolean z2 = i4 == 2 || (i4 == 3 && i6 == 1);
                mf mfVar = tcVar.d.e;
                boolean z3 = mfVar.j;
                mf mfVar2 = tcVar.e.e;
                boolean z4 = mfVar2.j;
                boolean z5 = z;
                if (z3 && z4) {
                    yeVar.f(1, mfVar.g, 1, mfVar2.g, tcVar);
                    tcVar.a = true;
                } else if (z3 && z2) {
                    f(1, mfVar.g, 2, mfVar2.g, tcVar);
                    q70 q70Var = tcVar.e;
                    if (i4 == 3) {
                        q70Var.e.m = tcVar.k();
                    } else {
                        q70Var.e.d(tcVar.k());
                        tcVar.a = true;
                    }
                } else if (z4 && z5) {
                    f(2, mfVar.g, 1, mfVar2.g, tcVar);
                    tm tmVar = tcVar.d;
                    if (i3 == 3) {
                        tmVar.e.m = tcVar.q();
                    } else {
                        tmVar.e.d(tcVar.q());
                        tcVar.a = true;
                    }
                }
                if (tcVar.a && (o7Var = tcVar.e.l) != null) {
                    o7Var.d(tcVar.a0);
                }
                yeVar = this;
            }
            i = i2;
        }
    }
}
