package Y;

import android.content.Intent;
import c.C0084a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class E extends T.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f944a;

    public /* synthetic */ E(int i) {
        this.f944a = i;
    }

    @Override // T.e
    public final Object O(Intent intent, int i) {
        switch (this.f944a) {
            case 0:
                return new C0084a(intent, i);
            case 1:
                V0.n nVar = V0.n.f876a;
                if (i != -1 || intent == null) {
                    return nVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return nVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Iterator it = arrayList2.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList3 = new ArrayList(Math.min(V0.g.c0(arrayList2), V0.g.c0(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList3.add(new U0.d(it.next(), it2.next()));
                }
                return V0.p.a0(arrayList3);
            default:
                return new C0084a(intent, i);
        }
    }
}
