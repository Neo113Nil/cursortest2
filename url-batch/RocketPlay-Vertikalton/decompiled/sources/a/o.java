package a;

import Y.A;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class o extends i1.g implements h1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f1604c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(x xVar, int i) {
        super(1);
        this.f1603b = i;
        this.f1604c = xVar;
    }

    @Override // h1.l
    public final Object g(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f1603b) {
            case 0:
                i1.f.e((C0061b) obj, "backEvent");
                x xVar = this.f1604c;
                W0.h hVar = xVar.f1621b;
                ListIterator listIterator = hVar.listIterator(hVar.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((A) obj2).f1319a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                A a2 = (A) obj2;
                if (xVar.f1622c != null) {
                    xVar.a();
                }
                xVar.f1622c = a2;
                break;
            default:
                i1.f.e((C0061b) obj, "backEvent");
                x xVar2 = this.f1604c;
                if (xVar2.f1622c == null) {
                    W0.h hVar2 = xVar2.f1621b;
                    ListIterator listIterator2 = hVar2.listIterator(hVar2.a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((A) obj3).f1319a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                break;
        }
        return V0.i.f1250a;
    }
}
