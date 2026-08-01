package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class ze implements xe {
    public final w90 d;
    public int f;
    public int g;
    public w90 a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public mf i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public ze(w90 w90Var) {
        this.d = w90Var;
    }

    @Override // defpackage.xe
    public final void a(xe xeVar) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((ze) obj).j) {
                return;
            }
        }
        this.c = true;
        w90 w90Var = this.a;
        if (w90Var != null) {
            w90Var.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        int size2 = arrayList.size();
        ze zeVar = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            ze zeVar2 = (ze) obj2;
            if (!(zeVar2 instanceof mf)) {
                i++;
                zeVar = zeVar2;
            }
        }
        if (zeVar != null && i == 1 && zeVar.j) {
            mf mfVar = this.i;
            if (mfVar != null) {
                if (!mfVar.j) {
                    return;
                } else {
                    this.f = this.h * mfVar.g;
                }
            }
            d(zeVar.g + this.f);
        }
        w90 w90Var2 = this.a;
        if (w90Var2 != null) {
            w90Var2.a(this);
        }
    }

    public final void b(w90 w90Var) {
        this.k.add(w90Var);
        if (this.j) {
            w90Var.a(w90Var);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            xe xeVar = (xe) obj;
            xeVar.a(xeVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.h0);
        sb.append(":");
        switch (this.e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
