package defpackage;

import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class yu0 {
    public static final go a = new go(3, null, 2);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0047 -> B:10:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(defpackage.ju0 r9, boolean r10, defpackage.sg0 r11, defpackage.h9 r12) {
        /*
            boolean r0 = r12 instanceof defpackage.uu0
            if (r0 == 0) goto L13
            r0 = r12
            uu0 r0 = (defpackage.uu0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            uu0 r0 = new uu0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.g
            int r1 = r0.h
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r9 = r0.f
            sg0 r10 = r0.e
            ju0 r11 = r0.d
            defpackage.rg0.u(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L4a
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.g8.s(r9)
            r9 = 0
            return r9
        L36:
            defpackage.rg0.u(r12)
        L39:
            r0.d = r9
            r0.e = r11
            r0.f = r10
            r0.h = r2
            java.lang.Object r12 = r9.b(r11, r0)
            ck r1 = defpackage.ck.d
            if (r12 != r1) goto L4a
            return r1
        L4a:
            qg0 r12 = (defpackage.qg0) r12
            java.util.List r1 = r12.a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L54:
            if (r5 >= r3) goto L7b
            java.lang.Object r6 = r1.get(r5)
            wg0 r6 = (defpackage.wg0) r6
            if (r10 == 0) goto L70
            boolean r7 = r6.b()
            if (r7 != 0) goto L6e
            boolean r7 = r6.h
            if (r7 != 0) goto L6e
            boolean r6 = r6.d
            if (r6 == 0) goto L6e
            r6 = r2
            goto L74
        L6e:
            r6 = r4
            goto L74
        L70:
            boolean r6 = defpackage.rg0.c(r6)
        L74:
            if (r6 != 0) goto L78
            r1 = r4
            goto L7c
        L78:
            int r5 = r5 + 1
            goto L54
        L7b:
            r1 = r2
        L7c:
            if (r1 == 0) goto L39
            java.util.List r9 = r12.a
            java.lang.Object r9 = r9.get(r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yu0.a(ju0, boolean, sg0, h9):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0174 -> B:11:0x0179). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(ju0 ju0Var, sg0 sg0Var, h9 h9Var) {
        xu0 xu0Var;
        int i;
        ju0 ju0Var2;
        xu0 xu0Var2;
        sg0 sg0Var2;
        ju0 ju0Var3;
        sg0 sg0Var3;
        int size;
        int i2;
        Object b;
        if (h9Var instanceof xu0) {
            xu0Var = (xu0) h9Var;
            int i3 = xu0Var.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xu0Var.g = i3 - Integer.MIN_VALUE;
                Object obj = xu0Var.f;
                i = xu0Var.g;
                Object obj2 = null;
                int i4 = 1;
                ck ckVar = ck.d;
                if (i == 0) {
                    if (i == 1) {
                        sg0Var3 = xu0Var.e;
                        ju0Var3 = xu0Var.d;
                        rg0.u(obj);
                        List list = ((qg0) obj).a;
                        size = list.size();
                        while (i2 < size) {
                        }
                        return list.get(0);
                    }
                    if (i != 2) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sg0 sg0Var4 = xu0Var.e;
                    ju0Var3 = xu0Var.d;
                    rg0.u(obj);
                    xu0Var2 = xu0Var;
                    sg0Var2 = sg0Var4;
                    Object obj3 = null;
                    char c = 2;
                    ck ckVar2 = ckVar;
                    List list2 = ((qg0) obj).a;
                    int size2 = list2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        if (((wg0) list2.get(i5)).b()) {
                            return obj3;
                        }
                    }
                    ju0Var2 = ju0Var3;
                    ckVar = ckVar2;
                    i4 = 1;
                    obj2 = obj3;
                    xu0Var2.d = ju0Var2;
                    xu0Var2.e = sg0Var2;
                    xu0Var2.g = i4;
                    b = ju0Var2.b(sg0Var2, xu0Var2);
                    if (b == ckVar) {
                        return ckVar;
                    }
                    ju0Var3 = ju0Var2;
                    obj = b;
                    xu0 xu0Var3 = xu0Var2;
                    sg0Var3 = sg0Var2;
                    xu0Var = xu0Var3;
                    List list3 = ((qg0) obj).a;
                    size = list3.size();
                    for (i2 = 0; i2 < size; i2++) {
                        wg0 wg0Var = (wg0) list3.get(i2);
                        if (wg0Var.b() || !wg0Var.h || wg0Var.d) {
                            int size3 = list3.size();
                            int i6 = 0;
                            while (i6 < size3) {
                                wg0 wg0Var2 = (wg0) list3.get(i6);
                                if (wg0Var2.b()) {
                                    return obj2;
                                }
                                long j = ju0Var3.i.B;
                                ku0 ku0Var = ju0Var3.i;
                                ku0Var.getClass();
                                Object obj4 = obj2;
                                long g = y6.g(nz.a0(ku0Var).A.c(), ku0Var);
                                long j2 = ku0Var.B;
                                long floatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (g >> 32)) - ((int) (j2 >> 32))) / 2.0f) << 32) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (g & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f) & 4294967295L);
                                int i7 = wg0Var2.i == 1 ? 1 : 0;
                                long j3 = wg0Var2.c;
                                ck ckVar3 = ckVar;
                                float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
                                float f = i7;
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) * f;
                                float f2 = ((int) (j >> 32)) + intBitsToFloat3;
                                float intBitsToFloat4 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) * f;
                                if (((intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat < (-intBitsToFloat3)) | (intBitsToFloat > f2)) || (intBitsToFloat2 > ((int) (j & 4294967295L)) + intBitsToFloat4)) {
                                    return obj4;
                                }
                                i6++;
                                obj2 = obj4;
                                ckVar = ckVar3;
                            }
                            obj3 = obj2;
                            ckVar2 = ckVar;
                            xu0Var.d = ju0Var3;
                            xu0Var.e = sg0Var3;
                            c = 2;
                            xu0Var.g = 2;
                            obj = ju0Var3.b(sg0.f, xu0Var);
                            if (obj == ckVar2) {
                                return ckVar2;
                            }
                            sg0 sg0Var5 = sg0Var3;
                            xu0Var2 = xu0Var;
                            sg0Var2 = sg0Var5;
                            List list22 = ((qg0) obj).a;
                            int size22 = list22.size();
                            while (i5 < size22) {
                            }
                            ju0Var2 = ju0Var3;
                            ckVar = ckVar2;
                            i4 = 1;
                            obj2 = obj3;
                            xu0Var2.d = ju0Var2;
                            xu0Var2.e = sg0Var2;
                            xu0Var2.g = i4;
                            b = ju0Var2.b(sg0Var2, xu0Var2);
                            if (b == ckVar) {
                            }
                        }
                    }
                    return list3.get(0);
                }
                rg0.u(obj);
                ju0Var2 = ju0Var;
                xu0Var2 = xu0Var;
                sg0Var2 = sg0Var;
                xu0Var2.d = ju0Var2;
                xu0Var2.e = sg0Var2;
                xu0Var2.g = i4;
                b = ju0Var2.b(sg0Var2, xu0Var2);
                if (b == ckVar) {
                }
            }
        }
        xu0Var = new xu0(h9Var);
        Object obj5 = xu0Var.f;
        i = xu0Var.g;
        Object obj22 = null;
        int i42 = 1;
        ck ckVar4 = ck.d;
        if (i == 0) {
        }
    }
}
