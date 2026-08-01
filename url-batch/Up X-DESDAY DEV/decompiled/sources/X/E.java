package X;

import android.content.Intent;
import c.C0078a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class E extends q1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f791a;

    public /* synthetic */ E(int i) {
        this.f791a = i;
    }

    @Override // q1.l
    public final Object N(Intent intent, int i) {
        switch (this.f791a) {
            case 0:
                return new C0078a(intent, i);
            case 1:
                Q0.n nVar = Q0.n.f665a;
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
                ArrayList h02 = Q0.c.h0(stringArrayExtra);
                Iterator it = h02.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(Q0.f.v0(h02), Q0.f.v0(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new P0.b(it.next(), it2.next()));
                }
                return Q0.p.e0(arrayList2);
            default:
                return new C0078a(intent, i);
        }
    }
}
