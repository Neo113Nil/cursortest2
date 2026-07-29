package o;

import java.util.ArrayList;

/* renamed from: o.bo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0798bo implements InterfaceC0655Zd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0798bo(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // o.InterfaceC0655Zd
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                C0863co c0863co = (C0863co) obj;
                if (c0863co == null) {
                    c0863co = new C0863co(-3);
                }
                ((C2002u5) this.b).V(c0863co);
                return;
            default:
                C0863co c0863co2 = (C0863co) obj;
                synchronized (AbstractC0994eo.c) {
                    try {
                        GR gr = AbstractC0994eo.d;
                        ArrayList arrayList = (ArrayList) gr.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        gr.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC0655Zd) arrayList.get(i)).accept(c0863co2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
