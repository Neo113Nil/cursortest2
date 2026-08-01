package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ax {
    public final ArrayList a = new ArrayList();
    public final h40 b;
    public io c;
    public io d;
    public int e;
    public boolean f;

    public ax(h40 h40Var, ArrayList arrayList) {
        io ioVar = io.e;
        this.c = ioVar;
        this.d = ioVar;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = h40Var.b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            io ioVar2 = h40Var.c;
            io ioVar3 = h40Var.d;
            this.c = ioVar2;
            this.d = ioVar3;
            c();
            b(h40Var.e);
        }
        this.b = h40Var;
    }

    public final void a(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cb cbVar = (cb) list.get(i);
            cbVar.getClass();
            if (true == z) {
                ax axVar = cbVar.c;
                if (axVar != null) {
                    throw new IllegalStateException(cbVar + " (" + (i + 1) + "/" + size + ") is already controlled by " + axVar + " but is still added to " + this);
                }
                cbVar.c = this;
                this.a.add(cbVar);
            }
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            cb cbVar = (cb) arrayList.get(size);
            if (!cbVar.d && cbVar.e != i) {
                cbVar.e = i;
                throw null;
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        cb cbVar = (cb) arrayList.get(size);
        io ioVar = this.c;
        io ioVar2 = this.d;
        cbVar.a = ioVar;
        cbVar.b = ioVar2;
        throw null;
    }
}
