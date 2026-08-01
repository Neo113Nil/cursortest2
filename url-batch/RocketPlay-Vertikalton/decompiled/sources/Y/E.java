package Y;

import a1.AbstractC0067d;
import android.content.Intent;
import c.C0100a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class E extends AbstractC0067d {
    public final /* synthetic */ int d;

    public /* synthetic */ E(int i) {
        this.d = i;
    }

    @Override // a1.AbstractC0067d
    public final Object o(Intent intent, int i) {
        switch (this.d) {
            case 0:
                return new C0100a(intent, i);
            case 1:
                W0.t tVar = W0.t.f1285a;
                if (i != -1 || intent == null) {
                    return tVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return tVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                ArrayList v02 = W0.i.v0(stringArrayExtra);
                Iterator it = v02.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(W0.l.t0(v02), W0.l.t0(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new V0.d(it.next(), it2.next()));
                }
                return W0.v.s0(arrayList2);
            default:
                return new C0100a(intent, i);
        }
    }
}
