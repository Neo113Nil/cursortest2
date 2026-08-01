package defpackage;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import defpackage.ks;
import defpackage.t50;
import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ks implements js {
    public final f3 a;
    public final f3 b;
    public final is d;
    public u60 f;
    public ts h;
    public final ts c = new ts(null, 6);
    public final FocusOwnerImpl$modifier$1 e = new z50() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // defpackage.z50
        public final t50 f() {
            return ks.this.c;
        }

        @Override // defpackage.z50
        public final /* bridge */ /* synthetic */ void g(t50 t50Var) {
        }

        public final int hashCode() {
            return ks.this.c.hashCode();
        }
    };
    public final x60 g = new x60(1);

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public ks(f3 f3Var, f3 f3Var2) {
        this.a = f3Var;
        this.b = f3Var2;
        this.d = new is(this, f3Var2);
    }

    public final boolean a(boolean z) {
        ca0 ca0Var;
        ts tsVar = this.h;
        if (tsVar != null) {
            f(null);
            rs rsVar = rs.d;
            rs rsVar2 = rs.g;
            tsVar.j0(rsVar, rsVar2);
            if (!tsVar.d.q) {
                cy.b("visitAncestors called on an unattached node");
            }
            t50 t50Var = tsVar.d.h;
            p10 a0 = nz.a0(tsVar);
            while (a0 != null) {
                if ((((t50) a0.F.j).g & 1024) != 0) {
                    while (t50Var != null) {
                        if ((t50Var.f & 1024) != 0) {
                            t50 t50Var2 = t50Var;
                            l70 l70Var = null;
                            while (t50Var2 != null) {
                                if (t50Var2 instanceof ts) {
                                    ((ts) t50Var2).j0(rs.e, rsVar2);
                                } else if ((t50Var2.f & 1024) != 0 && (t50Var2 instanceof ol)) {
                                    int i = 0;
                                    for (t50 t50Var3 = ((ol) t50Var2).s; t50Var3 != null; t50Var3 = t50Var3.i) {
                                        if ((t50Var3.f & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                t50Var2 = t50Var3;
                                            } else {
                                                if (l70Var == null) {
                                                    l70Var = new l70(new t50[16]);
                                                }
                                                if (t50Var2 != null) {
                                                    l70Var.b(t50Var2);
                                                    t50Var2 = null;
                                                }
                                                l70Var.b(t50Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                t50Var2 = nz.j(l70Var);
                            }
                        }
                        t50Var = t50Var.h;
                    }
                }
                a0 = a0.n();
                t50Var = (a0 == null || (ca0Var = a0.F) == null) ? null : (su0) ca0Var.i;
            }
        }
        return true;
    }

    public final boolean b(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (z) {
            a(z);
        } else {
            int ordinal = mz.M(this.c).ordinal();
            if (ordinal == 0) {
                a(z);
            } else {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    g8.c();
                    return false;
                }
                z3 = false;
            }
        }
        if (z3 && z2) {
            c();
        }
        return z3;
    }

    public final void c() {
        f3 f3Var = this.a;
        if (f3Var.isFocused() || f3Var.hasFocus()) {
            f3Var.clearFocus();
        } else if (f3Var.hasFocus()) {
            View findFocus = f3Var.findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            f3Var.clearFocus();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        if (r7 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016f A[Catch: all -> 0x02ea, TryCatch #0 {all -> 0x02ea, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x0019, B:13:0x0023, B:16:0x002f, B:18:0x0035, B:19:0x003a, B:21:0x0042, B:23:0x0047, B:25:0x004d, B:29:0x0053, B:34:0x016f, B:36:0x0175, B:37:0x0178, B:39:0x0183, B:42:0x0191, B:46:0x019b, B:81:0x01a1, B:82:0x01a6, B:75:0x01e0, B:48:0x01aa, B:50:0x01b0, B:52:0x01b4, B:54:0x01bc, B:56:0x01c2, B:62:0x01ca, B:64:0x01d3, B:65:0x01d7, B:60:0x01da, B:84:0x01e5, B:87:0x01e8, B:89:0x01ee, B:96:0x01f2, B:101:0x01fb, B:103:0x0203, B:111:0x021a, B:113:0x021f, B:147:0x0223, B:142:0x0265, B:115:0x022f, B:117:0x0235, B:119:0x0239, B:121:0x0241, B:123:0x0247, B:129:0x024f, B:131:0x0258, B:132:0x025c, B:127:0x025f, B:153:0x026a, B:157:0x027a, B:159:0x027f, B:193:0x0283, B:188:0x02c5, B:161:0x028f, B:163:0x0295, B:165:0x0299, B:167:0x02a1, B:169:0x02a7, B:175:0x02af, B:177:0x02b8, B:178:0x02bc, B:173:0x02bf, B:200:0x02cc, B:202:0x02d3, B:215:0x005b, B:217:0x0061, B:218:0x0064, B:220:0x006c, B:223:0x007a, B:227:0x0084, B:262:0x00d9, B:264:0x00dd, B:229:0x0089, B:231:0x008f, B:233:0x0093, B:235:0x009b, B:237:0x00a1, B:243:0x00a9, B:245:0x00b2, B:246:0x00b6, B:241:0x00b9, B:252:0x00bf, B:266:0x00c4, B:269:0x00c7, B:271:0x00cd, B:278:0x00d1, B:283:0x00e3, B:285:0x00e9, B:286:0x00ec, B:288:0x00f6, B:291:0x0104, B:295:0x010e, B:330:0x0163, B:332:0x0167, B:297:0x0113, B:299:0x0119, B:301:0x011d, B:303:0x0125, B:305:0x012b, B:311:0x0133, B:313:0x013c, B:314:0x0140, B:309:0x0143, B:320:0x0149, B:335:0x014e, B:338:0x0151, B:340:0x0157, B:347:0x015b), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v20, types: [l70] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [l70] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v24, types: [t50] */
    /* JADX WARN: Type inference failed for: r12v25, types: [t50] */
    /* JADX WARN: Type inference failed for: r12v29, types: [t50] */
    /* JADX WARN: Type inference failed for: r12v30, types: [t50] */
    /* JADX WARN: Type inference failed for: r12v34, types: [t50] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v43, types: [t50] */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [l70] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [l70] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(KeyEvent keyEvent, bu buVar) {
        Object obj;
        t50 t50Var;
        ca0 ca0Var;
        Object obj2;
        ca0 ca0Var2;
        int size;
        ca0 ca0Var3;
        ts tsVar = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!g(keyEvent)) {
                return false;
            }
            ts v = nz.v(tsVar);
            if (v != null) {
                if (!v.d.q) {
                    cy.b("visitLocalDescendants called on an unattached node");
                }
                t50 t50Var2 = v.d;
                if ((t50Var2.g & 9216) != 0) {
                    t50Var = null;
                    for (t50 t50Var3 = t50Var2.i; t50Var3 != null; t50Var3 = t50Var3.i) {
                        int i = t50Var3.f;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            t50Var = t50Var3;
                        }
                    }
                } else {
                    t50Var = null;
                }
            }
            if (v != null) {
                if (!v.d.q) {
                    cy.b("visitAncestors called on an unattached node");
                }
                t50 t50Var4 = v.d;
                p10 a0 = nz.a0(v);
                loop11: while (true) {
                    if (a0 == null) {
                        obj2 = null;
                        break;
                    }
                    if ((((t50) a0.F.j).g & 8192) != 0) {
                        while (t50Var4 != null) {
                            if ((t50Var4.f & 8192) != 0) {
                                l70 l70Var = null;
                                t50 t50Var5 = t50Var4;
                                while (t50Var5 != null) {
                                    if (t50Var5 instanceof s00) {
                                        obj2 = t50Var5;
                                        break loop11;
                                    }
                                    if ((t50Var5.f & 8192) != 0 && (t50Var5 instanceof ol)) {
                                        t50 t50Var6 = ((ol) t50Var5).s;
                                        int i2 = 0;
                                        t50Var5 = t50Var5;
                                        l70Var = l70Var;
                                        while (t50Var6 != null) {
                                            if ((t50Var6.f & 8192) != 0) {
                                                i2++;
                                                l70Var = l70Var;
                                                if (i2 == 1) {
                                                    t50Var5 = t50Var6;
                                                } else {
                                                    if (l70Var == null) {
                                                        l70Var = new l70(new t50[16]);
                                                    }
                                                    if (t50Var5 != null) {
                                                        l70Var.b(t50Var5);
                                                        t50Var5 = null;
                                                    }
                                                    l70Var.b(t50Var6);
                                                }
                                            }
                                            t50Var6 = t50Var6.i;
                                            t50Var5 = t50Var5;
                                            l70Var = l70Var;
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    t50Var5 = nz.j(l70Var);
                                }
                            }
                            t50Var4 = t50Var4.h;
                        }
                    }
                    a0 = a0.n();
                    t50Var4 = (a0 == null || (ca0Var2 = a0.F) == null) ? null : (su0) ca0Var2.i;
                }
                Object obj3 = (s00) obj2;
                if (obj3 != null) {
                    t50Var = ((t50) obj3).d;
                    if (t50Var != null) {
                        if (!t50Var.d.q) {
                            cy.b("visitAncestors called on an unattached node");
                        }
                        t50 t50Var7 = t50Var.d.h;
                        p10 a02 = nz.a0(t50Var);
                        ArrayList arrayList = null;
                        while (a02 != null) {
                            if ((((t50) a02.F.j).g & 8192) != 0) {
                                while (t50Var7 != null) {
                                    if ((t50Var7.f & 8192) != 0) {
                                        t50 t50Var8 = t50Var7;
                                        l70 l70Var2 = null;
                                        while (t50Var8 != null) {
                                            if (t50Var8 instanceof s00) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(t50Var8);
                                            } else if ((t50Var8.f & 8192) != 0 && (t50Var8 instanceof ol)) {
                                                int i3 = 0;
                                                for (t50 t50Var9 = ((ol) t50Var8).s; t50Var9 != null; t50Var9 = t50Var9.i) {
                                                    if ((t50Var9.f & 8192) != 0) {
                                                        i3++;
                                                        if (i3 == 1) {
                                                            t50Var8 = t50Var9;
                                                        } else {
                                                            if (l70Var2 == null) {
                                                                l70Var2 = new l70(new t50[16]);
                                                            }
                                                            if (t50Var8 != null) {
                                                                l70Var2.b(t50Var8);
                                                                t50Var8 = null;
                                                            }
                                                            l70Var2.b(t50Var9);
                                                        }
                                                    }
                                                }
                                                if (i3 == 1) {
                                                }
                                            }
                                            t50Var8 = nz.j(l70Var2);
                                        }
                                    }
                                    t50Var7 = t50Var7.h;
                                }
                            }
                            a02 = a02.n();
                            t50Var7 = (a02 == null || (ca0Var3 = a02.F) == null) ? null : (su0) ca0Var3.i;
                        }
                        if (arrayList != null && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i4 = size - 1;
                                if (((s00) arrayList.get(size)).g(keyEvent)) {
                                    return true;
                                }
                                if (i4 < 0) {
                                    break;
                                }
                                size = i4;
                            }
                        }
                        ol olVar = t50Var.d;
                        ?? r0 = 0;
                        while (olVar != 0) {
                            if (olVar instanceof s00) {
                                if (((s00) olVar).g(keyEvent)) {
                                    return true;
                                }
                            } else if ((olVar.f & 8192) != 0 && (olVar instanceof ol)) {
                                t50 t50Var10 = olVar.s;
                                int i5 = 0;
                                r0 = r0;
                                olVar = olVar;
                                while (t50Var10 != null) {
                                    if ((t50Var10.f & 8192) != 0) {
                                        i5++;
                                        r0 = r0;
                                        if (i5 == 1) {
                                            olVar = t50Var10;
                                        } else {
                                            if (r0 == 0) {
                                                r0 = new l70(new t50[16]);
                                            }
                                            if (olVar != 0) {
                                                r0.b(olVar);
                                                olVar = 0;
                                            }
                                            r0.b(t50Var10);
                                        }
                                    }
                                    t50Var10 = t50Var10.i;
                                    r0 = r0;
                                    olVar = olVar;
                                }
                                if (i5 == 1) {
                                }
                            }
                            olVar = nz.j(r0);
                        }
                        if (((Boolean) buVar.a()).booleanValue()) {
                            return true;
                        }
                        ol olVar2 = t50Var.d;
                        ?? r14 = 0;
                        while (olVar2 != 0) {
                            if (olVar2 instanceof s00) {
                                if (((s00) olVar2).B(keyEvent)) {
                                    return true;
                                }
                            } else if ((olVar2.f & 8192) != 0 && (olVar2 instanceof ol)) {
                                t50 t50Var11 = olVar2.s;
                                int i6 = 0;
                                olVar2 = olVar2;
                                r14 = r14;
                                while (t50Var11 != null) {
                                    if ((t50Var11.f & 8192) != 0) {
                                        i6++;
                                        r14 = r14;
                                        if (i6 == 1) {
                                            olVar2 = t50Var11;
                                        } else {
                                            if (r14 == 0) {
                                                r14 = new l70(new t50[16]);
                                            }
                                            if (olVar2 != 0) {
                                                r14.b(olVar2);
                                                olVar2 = 0;
                                            }
                                            r14.b(t50Var11);
                                        }
                                    }
                                    t50Var11 = t50Var11.i;
                                    olVar2 = olVar2;
                                    r14 = r14;
                                }
                                if (i6 == 1) {
                                }
                            }
                            olVar2 = nz.j(r14);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i7 = 0; i7 < size2; i7++) {
                                if (((s00) arrayList.get(i7)).B(keyEvent)) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            if (!tsVar.d.q) {
                cy.b("visitAncestors called on an unattached node");
            }
            t50 t50Var12 = tsVar.d.h;
            p10 a03 = nz.a0(tsVar);
            loop15: while (true) {
                if (a03 == null) {
                    obj = null;
                    break;
                }
                if ((((t50) a03.F.j).g & 8192) != 0) {
                    while (t50Var12 != null) {
                        if ((t50Var12.f & 8192) != 0) {
                            t50 t50Var13 = t50Var12;
                            l70 l70Var3 = null;
                            while (t50Var13 != null) {
                                if (t50Var13 instanceof s00) {
                                    obj = t50Var13;
                                    break loop15;
                                }
                                if ((t50Var13.f & 8192) != 0 && (t50Var13 instanceof ol)) {
                                    t50 t50Var14 = ((ol) t50Var13).s;
                                    int i8 = 0;
                                    t50Var13 = t50Var13;
                                    l70Var3 = l70Var3;
                                    while (t50Var14 != null) {
                                        if ((t50Var14.f & 8192) != 0) {
                                            i8++;
                                            l70Var3 = l70Var3;
                                            if (i8 == 1) {
                                                t50Var13 = t50Var14;
                                            } else {
                                                if (l70Var3 == null) {
                                                    l70Var3 = new l70(new t50[16]);
                                                }
                                                if (t50Var13 != null) {
                                                    l70Var3.b(t50Var13);
                                                    t50Var13 = null;
                                                }
                                                l70Var3.b(t50Var14);
                                            }
                                        }
                                        t50Var14 = t50Var14.i;
                                        t50Var13 = t50Var13;
                                        l70Var3 = l70Var3;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                t50Var13 = nz.j(l70Var3);
                            }
                        }
                        t50Var12 = t50Var12.h;
                    }
                }
                a03 = a03.n();
                t50Var12 = (a03 == null || (ca0Var = a03.F) == null) ? null : (su0) ca0Var.i;
            }
            Object obj4 = (s00) obj;
            t50Var = obj4 != null ? ((t50) obj4).d : null;
            if (t50Var != null) {
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0115, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean e(int i, zi0 zi0Var, mu muVar) {
        boolean n;
        ca0 ca0Var;
        os osVar;
        boolean z;
        ts tsVar = this.c;
        ts v = nz.v(tsVar);
        int i2 = 4;
        f3 f3Var = this.b;
        ts tsVar2 = null;
        if (v != null) {
            c10 layoutDirection = f3Var.getLayoutDirection();
            ms k0 = v.k0();
            os osVar2 = k0.h;
            os osVar3 = k0.i;
            if (i == 1) {
                osVar = k0.b;
            } else if (i == 2) {
                osVar = k0.c;
            } else if (i == 5) {
                osVar = k0.d;
            } else if (i == 6) {
                osVar = k0.e;
            } else if (i == 3) {
                int ordinal = layoutDirection.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        g8.c();
                        return null;
                    }
                    osVar2 = osVar3;
                }
                if (osVar2 == os.b) {
                    osVar2 = null;
                }
                if (osVar2 == null) {
                    osVar = k0.f;
                }
                osVar = osVar2;
            } else if (i == 4) {
                int ordinal2 = layoutDirection.ordinal();
                if (ordinal2 == 0) {
                    osVar2 = osVar3;
                } else if (ordinal2 != 1) {
                    g8.c();
                    return null;
                }
                if (osVar2 == os.b) {
                    osVar2 = null;
                }
                if (osVar2 == null) {
                    osVar = k0.g;
                }
                osVar = osVar2;
            } else {
                if (i != 7 && i != 8) {
                    g8.s("invalid FocusDirection");
                    return null;
                }
                js focusOwner = ((f3) nz.b0(v)).getFocusOwner();
                ts tsVar3 = ((ks) focusOwner).h;
                if (i == 7) {
                    k0.j.getClass();
                } else {
                    k0.k.getClass();
                }
                osVar = tsVar3 != ((ks) focusOwner).h ? os.d : os.b;
            }
            os osVar4 = os.c;
            if (!nz.l(osVar, osVar4)) {
                if (nz.l(osVar, os.d)) {
                    Object v2 = nz.v(tsVar);
                    if (v2 != null) {
                        return (Boolean) muVar.c(v2);
                    }
                } else {
                    os osVar5 = os.b;
                    if (!nz.l(osVar, osVar5)) {
                        osVar.getClass();
                        if (osVar == osVar5) {
                            g8.s("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (osVar == osVar4) {
                            g8.s("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        l70 l70Var = osVar.a;
                        int i3 = l70Var.f;
                        if (i3 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                            z = false;
                        } else {
                            Object[] objArr = l70Var.d;
                            boolean z2 = false;
                            for (int i4 = 0; i4 < i3; i4++) {
                                Object obj = (ps) objArr[i4];
                                if (!((t50) obj).d.q) {
                                    cy.b("visitChildren called on an unattached node");
                                }
                                l70 l70Var2 = new l70(new t50[16]);
                                t50 t50Var = ((t50) obj).d;
                                t50 t50Var2 = t50Var.i;
                                if (t50Var2 == null) {
                                    nz.h(l70Var2, t50Var);
                                } else {
                                    l70Var2.b(t50Var2);
                                }
                                while (true) {
                                    int i5 = l70Var2.f;
                                    if (i5 != 0) {
                                        t50 t50Var3 = (t50) l70Var2.j(i5 - 1);
                                        if ((t50Var3.g & 1024) == 0) {
                                            nz.h(l70Var2, t50Var3);
                                        } else {
                                            while (true) {
                                                if (t50Var3 == null) {
                                                    break;
                                                }
                                                if ((t50Var3.f & 1024) != 0) {
                                                    l70 l70Var3 = null;
                                                    while (t50Var3 != null) {
                                                        if (t50Var3 instanceof ts) {
                                                            ts tsVar4 = (ts) t50Var3;
                                                            if (tsVar4.k0().a ? ((Boolean) muVar.c(tsVar4)).booleanValue() : od0.j(tsVar4, 7, muVar)) {
                                                                z2 = true;
                                                                break;
                                                            }
                                                        } else if (((t50Var3.f & 1024) != 0) && (t50Var3 instanceof ol)) {
                                                            int i6 = 0;
                                                            for (t50 t50Var4 = ((ol) t50Var3).s; t50Var4 != null; t50Var4 = t50Var4.i) {
                                                                if ((t50Var4.f & 1024) != 0) {
                                                                    i6++;
                                                                    if (i6 == 1) {
                                                                        t50Var3 = t50Var4;
                                                                    } else {
                                                                        if (l70Var3 == null) {
                                                                            l70Var3 = new l70(new t50[16]);
                                                                        }
                                                                        if (t50Var3 != null) {
                                                                            l70Var3.b(t50Var3);
                                                                            t50Var3 = null;
                                                                        }
                                                                        l70Var3.b(t50Var4);
                                                                    }
                                                                }
                                                            }
                                                            if (i6 == 1) {
                                                            }
                                                        }
                                                        t50Var3 = nz.j(l70Var3);
                                                    }
                                                } else {
                                                    t50Var3 = t50Var3.i;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z = z2;
                        }
                        return Boolean.valueOf(z);
                    }
                }
            }
            return null;
        }
        v = null;
        c10 layoutDirection2 = f3Var.getLayoutDirection();
        y5 y5Var = new y5(v, this, muVar, 7);
        if (i == 1 || i == 2) {
            if (i == 1) {
                n = nz.x(tsVar, y5Var);
            } else {
                if (i != 2) {
                    g8.s("This function should only be used for 1-D focus search");
                    return null;
                }
                n = nz.n(tsVar, y5Var);
            }
            return Boolean.valueOf(n);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return od0.v(i, y5Var, tsVar, zi0Var);
        }
        if (i == 7) {
            int ordinal3 = layoutDirection2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    g8.c();
                    return null;
                }
                i2 = 3;
            }
            ts v3 = nz.v(tsVar);
            if (v3 != null) {
                return od0.v(i2, y5Var, v3, zi0Var);
            }
            return null;
        }
        if (i != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) bs.a(i))).toString());
        }
        ts v4 = nz.v(tsVar);
        if (v4 != null) {
            if (!v4.d.q) {
                cy.b("visitAncestors called on an unattached node");
            }
            t50 t50Var5 = v4.d.h;
            p10 a0 = nz.a0(v4);
            loop5: while (true) {
                if (a0 == null) {
                    break;
                }
                if ((((t50) a0.F.j).g & 1024) != 0) {
                    while (t50Var5 != null) {
                        if ((t50Var5.f & 1024) != 0) {
                            t50 t50Var6 = t50Var5;
                            l70 l70Var4 = null;
                            while (t50Var6 != null) {
                                if (t50Var6 instanceof ts) {
                                    ts tsVar5 = (ts) t50Var6;
                                    if (tsVar5.k0().a) {
                                        tsVar2 = tsVar5;
                                        break loop5;
                                    }
                                } else if ((t50Var6.f & 1024) != 0 && (t50Var6 instanceof ol)) {
                                    int i7 = 0;
                                    for (t50 t50Var7 = ((ol) t50Var6).s; t50Var7 != null; t50Var7 = t50Var7.i) {
                                        if ((t50Var7.f & 1024) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                t50Var6 = t50Var7;
                                            } else {
                                                if (l70Var4 == null) {
                                                    l70Var4 = new l70(new t50[16]);
                                                }
                                                if (t50Var6 != null) {
                                                    l70Var4.b(t50Var6);
                                                    t50Var6 = null;
                                                }
                                                l70Var4.b(t50Var7);
                                            }
                                        }
                                    }
                                    if (i7 != 1) {
                                        t50Var6 = nz.j(l70Var4);
                                    }
                                }
                                t50Var6 = nz.j(l70Var4);
                            }
                        }
                        t50Var5 = t50Var5.h;
                    }
                }
                a0 = a0.n();
                t50Var5 = (a0 == null || (ca0Var = a0.F) == null) ? null : (su0) ca0Var.i;
            }
        }
        ts tsVar6 = tsVar2;
        return Boolean.valueOf((tsVar6 == null || tsVar6 == tsVar) ? false : ((Boolean) y5Var.c(tsVar6)).booleanValue());
    }

    public final void f(ts tsVar) {
        p10 a0;
        np0 p;
        p10 a02;
        np0 p2;
        ts tsVar2 = this.h;
        this.h = tsVar;
        x60 x60Var = this.g;
        Object[] objArr = x60Var.a;
        int i = x60Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            m2 m2Var = (m2) objArr[i2];
            m2Var.getClass();
            if (tsVar2 != null && (a02 = nz.a0(tsVar2)) != null && (p2 = a02.p()) != null && p2.d.b(mp0.f)) {
                ((AutofillManager) m2Var.a.e).notifyViewExited(m2Var.c, a02.e);
            }
            if (tsVar != null && (a0 = nz.a0(tsVar)) != null && (p = a0.p()) != null && p.d.b(mp0.f)) {
                int i3 = a0.e;
                m2Var.d.a.b(i3, new l2(m2Var, i3));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0352, code lost:
    
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a3, code lost:
    
        r30 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ad, code lost:
    
        if (((r10 & ((~r10) << 6)) & (-9187201950435737472L)) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00af, code lost:
    
        r0 = r4.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b5, code lost:
    
        if (r4.e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c6, code lost:
    
        if (((r4.a[r0 >> 3] >> ((r0 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d0, code lost:
    
        r0 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d2, code lost:
    
        if (r0 <= r5) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d4, code lost:
    
        r11 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00eb, code lost:
    
        if (java.lang.Long.compare((r4.d * 32) ^ Long.MIN_VALUE, (r0 * 25) ^ Long.MIN_VALUE) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ed, code lost:
    
        r0 = r4.a;
        r3 = r4.c;
        r5 = r4.b;
        r6 = (r3 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f9, code lost:
    
        if (r14 >= r6) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fb, code lost:
    
        r9 = r0[r14] & (-9187201950435737472L);
        r0[r14] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r14 = r14 + 1;
        r11 = r11;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0116, code lost:
    
        r36 = r12;
        r40 = 128;
        r13 = r11;
        r6 = defpackage.p8.a0(r0);
        r9 = r6 - 1;
        r14 = 72057594037927935L;
        r0[r9] = (r0[r9] & 72057594037927935L) | (-72057594037927936L);
        r0[r6] = r0[0];
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0135, code lost:
    
        if (r6 == r3) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0137, code lost:
    
        r9 = r6 >> 3;
        r12 = (r6 & 7) << 3;
        r10 = (r0[r9] >> r12) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0144, code lost:
    
        if (r10 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014b, code lost:
    
        if (r10 == 254) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014e, code lost:
    
        r10 = r5[r6];
        r10 = ((int) (r10 ^ (r10 >>> r30))) * r31;
        r11 = (r10 ^ (r10 << 16)) >>> 7;
        r23 = r4.b(r11);
        r11 = r11 & r3;
        r29 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016e, code lost:
    
        if ((((r23 - r11) & r3) / 8) != (((r6 - r11) & r3) / 8)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0191, code lost:
    
        r32 = r14;
        r11 = r23 >> 3;
        r13 = r0[r11];
        r15 = (r23 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a1, code lost:
    
        if (((r13 >> r15) & 255) != 128) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01a3, code lost:
    
        r38 = r7;
        r39 = r8;
        r24 = r5;
        r25 = r6;
        r0[r11] = ((~(255 << r15)) & r13) | ((r10 & 127) << r15);
        r0[r9] = (r0[r9] & (~(255 << r12))) | (128 << r12);
        r24[r23] = r24[r25];
        r24[r25] = 0;
        r6 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01e7, code lost:
    
        r0[r0.length - 1] = (r0[0] & r32) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r5 = r24;
        r13 = r29;
        r14 = r32;
        r7 = r38;
        r8 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01ca, code lost:
    
        r24 = r5;
        r25 = r6;
        r38 = r7;
        r39 = r8;
        r0[r11] = ((r10 & 127) << r15) | ((~(255 << r15)) & r13);
        r5 = r24[r23];
        r24[r23] = r24[r25];
        r24[r25] = r5;
        r6 = r25 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0170, code lost:
    
        r32 = r14;
        r0[r9] = ((r10 & 127) << r12) | (r0[r9] & (~(255 << r12)));
        r0[r0.length - r7] = (r0[0] & r32) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r13 = r29;
        r14 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0146, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0200, code lost:
    
        r38 = r7;
        r39 = r8;
        r4.e = defpackage.vn0.a(r4.c) - r4.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0285, code lost:
    
        r0 = r4.b(r39);
        r38 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0289, code lost:
    
        r29 = r0;
        r4.d++;
        r0 = r4.e;
        r3 = r4.a;
        r5 = r29 >> 3;
        r6 = r3[r5];
        r8 = (r29 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02a3, code lost:
    
        if (((r6 >> r8) & 255) != r40) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02a5, code lost:
    
        r22 = r38 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02a7, code lost:
    
        r4.e = r0 - r22;
        r0 = r4.c;
        r6 = (r6 & (~(255 << r8))) | (r36 << r8);
        r3[r5] = r6;
        r3[(((r29 - 7) & r0) + (r0 & 7)) >> 3] = r6;
        r38 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0213, code lost:
    
        r38 = 1;
        r39 = r8;
        r36 = r12;
        r40 = 128;
        r0 = defpackage.vn0.b(r4.c);
        r3 = r4.a;
        r5 = r4.b;
        r6 = r4.c;
        r4.c(r0);
        r0 = r4.a;
        r7 = r4.b;
        r8 = r4.c;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0232, code lost:
    
        if (r9 >= r6) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0241, code lost:
    
        if (((r3[r9 >> 3] >> ((r9 & 7) << 3)) & 255) >= 128) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0243, code lost:
    
        r10 = r5[r9];
        r12 = ((int) ((r10 >>> r30) ^ r10)) * r31;
        r12 = r12 ^ (r12 << 16);
        r13 = r4.b(r12 >>> 7);
        r14 = r12 & 127;
        r12 = r13 >> 3;
        r16 = (r13 & 7) << 3;
        r19 = r5;
        r20 = r6;
        r5 = (r0[r12] & (~(255 << r16))) | (r14 << r16);
        r0[r12] = r5;
        r0[(((r13 - 7) & r8) + (r8 & 7)) >> 3] = r5;
        r7[r13] = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x027e, code lost:
    
        r9 = r9 + 1;
        r5 = r19;
        r6 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x027a, code lost:
    
        r19 = r5;
        r20 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c8, code lost:
    
        r38 = 1;
        r36 = r12;
        r40 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0350, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(KeyEvent keyEvent) {
        int i;
        char c;
        int i2;
        boolean z;
        long f = x40.f(keyEvent.getKeyCode());
        int z2 = d31.z(keyEvent);
        int i3 = -862048943;
        char c2 = ' ';
        int i4 = 8;
        int i5 = 0;
        int i6 = 1;
        if (z2 == 2) {
            u60 u60Var = this.f;
            if (u60Var == null) {
                u60Var = new u60(3);
                this.f = u60Var;
            }
            u60 u60Var2 = u60Var;
            int i7 = ((int) (f ^ (f >>> 32))) * (-862048943);
            int i8 = i7 ^ (i7 << 16);
            int i9 = i8 >>> 7;
            int i10 = i8 & 127;
            int i11 = u60Var2.c;
            int i12 = i9 & i11;
            int i13 = 0;
            loop0: while (true) {
                long[] jArr = u60Var2.a;
                int i14 = i12 >> 3;
                int i15 = i3;
                int i16 = (i12 & 7) << 3;
                long j = jArr[i14] >>> i16;
                long j2 = jArr[i14 + 1] << (64 - i16);
                char c3 = c2;
                long j3 = j | (j2 & ((-i16) >> 63));
                long j4 = i10;
                long j5 = j3 ^ (j4 * 72340172838076673L);
                long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
                while (true) {
                    if (j6 == 0) {
                        break;
                    }
                    i2 = (i12 + (Long.numberOfTrailingZeros(j6) >> 3)) & i11;
                    char c4 = c3;
                    if (u60Var2.b[i2] == f) {
                        z = 1;
                        break loop0;
                    }
                    j6 &= j6 - 1;
                    c3 = c4;
                }
                i13 += 8;
                i12 = (i12 + i13) & i11;
                i4 = i4;
                c2 = c;
                i3 = i15;
            }
            u60Var2.b[i2] = f;
            return z;
        }
        if (z2 != 1) {
            return true;
        }
        u60 u60Var3 = this.f;
        if (u60Var3 == null || !u60Var3.a(f)) {
            return false;
        }
        u60 u60Var4 = this.f;
        if (u60Var4 != null) {
            int i17 = ((int) ((f >>> 32) ^ f)) * (-862048943);
            int i18 = i17 ^ (i17 << 16);
            int i19 = i18 & 127;
            int i20 = u60Var4.c;
            int i21 = i18 >>> 7;
            loop5: while (true) {
                int i22 = i21 & i20;
                long[] jArr2 = u60Var4.a;
                int i23 = i22 >> 3;
                int i24 = (i22 & 7) << 3;
                long j7 = ((jArr2[i23 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr2[i23] >>> i24);
                long j8 = (i19 * 72340172838076673L) ^ j7;
                long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j9 == 0) {
                        break;
                    }
                    i = ((Long.numberOfTrailingZeros(j9) >> 3) + i22) & i20;
                    if (u60Var4.b[i] == f) {
                        break loop5;
                    }
                    j9 &= j9 - 1;
                }
                i5 += 8;
                i21 = i22 + i5;
            }
            if (i >= 0) {
                u60Var4.d--;
                long[] jArr3 = u60Var4.a;
                int i25 = u60Var4.c;
                int i26 = i >> 3;
                int i27 = (i & 7) << 3;
                long j10 = (jArr3[i26] & (~(255 << i27))) | (254 << i27);
                jArr3[i26] = j10;
                jArr3[(((i - 7) & i25) + (i25 & 7)) >> 3] = j10;
                return true;
            }
        }
        return true;
    }
}
