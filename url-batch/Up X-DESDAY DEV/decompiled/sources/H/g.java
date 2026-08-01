package H;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g implements J.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f221b;

    public /* synthetic */ g(int i, Object obj) {
        this.f220a = i;
        this.f221b = obj;
    }

    @Override // J.a
    public final void a(Object obj) {
        switch (this.f220a) {
            case 0:
                h hVar = (h) obj;
                if (hVar == null) {
                    hVar = new h(-3);
                }
                ((B.j) this.f221b).E(hVar);
                return;
            default:
                h hVar2 = (h) obj;
                synchronized (i.f226c) {
                    try {
                        o.k kVar = i.d;
                        ArrayList arrayList = (ArrayList) kVar.getOrDefault((String) this.f221b, null);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((String) this.f221b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((J.a) arrayList.get(i)).a(hVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
