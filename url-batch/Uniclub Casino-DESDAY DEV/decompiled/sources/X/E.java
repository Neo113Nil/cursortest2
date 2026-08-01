package X;

import android.content.Intent;
import c.C0077a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class E extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f795e;

    @Override // q1.d
    public final Object K(Intent intent, int i) {
        switch (this.f795e) {
            case 0:
                return new C0077a(intent, i);
            case 1:
                Q0.r rVar = Q0.r.f669a;
                if (i != -1 || intent == null) {
                    return rVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return rVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                ArrayList f02 = Q0.g.f0(stringArrayExtra);
                Iterator it = f02.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(Q0.j.w0(f02), Q0.j.w0(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new P0.b(it.next(), it2.next()));
                }
                return Q0.t.c0(arrayList2);
            default:
                return new C0077a(intent, i);
        }
    }
}
