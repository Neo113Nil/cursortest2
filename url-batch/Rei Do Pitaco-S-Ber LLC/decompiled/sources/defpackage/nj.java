package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class nj implements wc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wc
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                oj ojVar = (oj) obj;
                if (ojVar == null) {
                    ojVar = new oj(-3);
                }
                ((o4) this.b).H(ojVar);
                return;
            default:
                oj ojVar2 = (oj) obj;
                synchronized (pj.c) {
                    try {
                        e20 e20Var = pj.d;
                        ArrayList arrayList = (ArrayList) e20Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        e20Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((wc) arrayList.get(i)).accept(ojVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
