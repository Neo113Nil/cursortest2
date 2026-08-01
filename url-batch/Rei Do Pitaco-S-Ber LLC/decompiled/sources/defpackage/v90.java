package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class v90 {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                v90 v90Var = (v90) arrayList.get(i);
                if (this.e == v90Var.b) {
                    c(this.c, v90Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(vp vpVar, int i) {
        int n;
        int n2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        uc ucVar = (uc) ((tc) arrayList.get(0)).T;
        vpVar.t();
        ucVar.b(vpVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((tc) arrayList.get(i2)).b(vpVar, false);
        }
        if (i == 0 && ucVar.z0 > 0) {
            m60.c(ucVar, vpVar, arrayList, 0);
        }
        if (i == 1 && ucVar.A0 > 0) {
            m60.c(ucVar, vpVar, arrayList, 1);
        }
        try {
            vpVar.p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            tc tcVar = (tc) arrayList.get(i3);
            iw iwVar = new iw(19);
            new WeakReference(tcVar);
            vp.n(tcVar.I);
            vp.n(tcVar.J);
            vp.n(tcVar.K);
            vp.n(tcVar.L);
            vp.n(tcVar.M);
            this.d.add(iwVar);
        }
        if (i == 0) {
            n = vp.n(ucVar.I);
            n2 = vp.n(ucVar.K);
            vpVar.t();
        } else {
            n = vp.n(ucVar.J);
            n2 = vp.n(ucVar.L);
            vpVar.t();
        }
        return n2 - n;
    }

    public final void c(int i, v90 v90Var) {
        int i2 = v90Var.b;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            tc tcVar = (tc) obj;
            ArrayList arrayList2 = v90Var.a;
            if (!arrayList2.contains(tcVar)) {
                arrayList2.add(tcVar);
            }
            if (i == 0) {
                tcVar.n0 = i2;
            } else {
                tcVar.o0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.b);
        sb.append("] <");
        String sb2 = sb.toString();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            sb2 = sb2 + " " + ((tc) obj).h0;
        }
        return sb2.concat(" >");
    }
}
