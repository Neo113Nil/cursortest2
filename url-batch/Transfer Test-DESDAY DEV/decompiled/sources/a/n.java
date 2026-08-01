package a;

import Y.A;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class n extends g1.g implements f1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f1210c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(w wVar, int i) {
        super(1);
        this.f1209b = i;
        this.f1210c = wVar;
    }

    @Override // f1.l
    public final Object g(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f1209b) {
            case 0:
                g1.f.e((C0056b) obj, "backEvent");
                w wVar = this.f1210c;
                V0.c cVar = wVar.f1227b;
                ListIterator listIterator = cVar.listIterator(cVar.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((A) obj2).f937a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                A a2 = (A) obj2;
                if (wVar.f1228c != null) {
                    wVar.a();
                }
                wVar.f1228c = a2;
                break;
            default:
                g1.f.e((C0056b) obj, "backEvent");
                w wVar2 = this.f1210c;
                if (wVar2.f1228c == null) {
                    V0.c cVar2 = wVar2.f1227b;
                    ListIterator listIterator2 = cVar2.listIterator(cVar2.a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((A) obj3).f937a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                break;
        }
        return U0.i.f870a;
    }
}
