package o;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.Ny, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0364Ny extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0390Oy i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0364Ny(C0390Oy c0390Oy, int i) {
        super(0);
        this.h = i;
        this.i = c0390Oy;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                return TM.n(this.i);
            case 1:
                C0390Oy c0390Oy = this.i;
                C2217xM c2217xM = c0390Oy.f79o;
                ArrayList typeParameters = c2217xM.getTypeParameters();
                ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(typeParameters));
                Iterator it = typeParameters.iterator();
                while (it.hasNext()) {
                    LM lm = (LM) it.next();
                    InterfaceC1437lX h = ((InterfaceC1569nX) c0390Oy.q.j).h(lm);
                    if (h == null) {
                        throw new AssertionError("Parameter " + lm + " surely belongs to class " + c2217xM + ", so it must be resolved");
                    }
                    arrayList.add(h);
                }
                return arrayList;
            default:
                C0390Oy c0390Oy2 = this.i;
                if (AbstractC0192Hh.f(c0390Oy2) == null) {
                    return null;
                }
                ((C1198hu) c0390Oy2.n.i).w.getClass();
                return null;
        }
    }
}
