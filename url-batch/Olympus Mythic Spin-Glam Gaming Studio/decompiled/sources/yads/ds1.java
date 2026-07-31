package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class ds1 {
    public String a;

    public final ArrayList a(List list) {
        com.monetization.ads.mediation.base.a aVar;
        pr1 pr1Var;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dr1 dr1Var = (dr1) it.next();
            List<cr1> list2 = dr1Var.c;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (cr1 cr1Var : list2) {
                try {
                    aVar = (com.monetization.ads.mediation.base.a) rm2.a(cr1Var.b, new Object[0]);
                } catch (Exception unused) {
                    aVar = null;
                }
                if (aVar == null) {
                    pr1Var = new pr1(cr1Var.a, null, false);
                } else {
                    yn1 yn1Var = new yn1(aVar);
                    if (this.a == null) {
                        this.a = yn1Var.b().getNetworkSdkVersion();
                    }
                    pr1Var = new pr1(cr1Var.a, yn1Var.b().getCom.ironsource.Qf.b java.lang.String(), true);
                }
                arrayList2.add(pr1Var);
            }
            String str = this.a;
            this.a = null;
            arrayList.add(new qr1(dr1Var.a, dr1Var.b.b, str, arrayList2));
        }
        return arrayList;
    }
}
