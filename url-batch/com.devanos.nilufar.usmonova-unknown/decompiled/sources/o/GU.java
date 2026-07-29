package o;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class GU implements InterfaceC0212Ib {
    public final /* synthetic */ int a;

    public /* synthetic */ GU(int i) {
        this.a = i;
    }

    @Override // o.InterfaceC0212Ib
    public long a() {
        return SystemClock.elapsedRealtime();
    }

    public AbstractC1964tX b(SW sw, List list) {
        AbstractC0048Bt.n(sw, "typeConstructor");
        AbstractC0048Bt.n(list, "arguments");
        List parameters = sw.getParameters();
        AbstractC0048Bt.m(parameters, "typeConstructor.parameters");
        InterfaceC1437lX interfaceC1437lX = (InterfaceC1437lX) AbstractC0720ac.w0(parameters);
        if (interfaceC1437lX == null || !interfaceC1437lX.O()) {
            return new C2381zs((InterfaceC1437lX[]) parameters.toArray(new InterfaceC1437lX[0]), (AbstractC1701pX[]) list.toArray(new AbstractC1701pX[0]), false);
        }
        List parameters2 = sw.getParameters();
        AbstractC0048Bt.m(parameters2, "typeConstructor.parameters");
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(parameters2));
        Iterator it = parameters2.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC1437lX) it.next()).z());
        }
        return new C1697pT(1, EB.V(AbstractC0720ac.O0(arrayList, list)));
    }

    public String toString() {
        switch (this.a) {
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                return "NULL_VALUE";
            default:
                return super.toString();
        }
    }
}
