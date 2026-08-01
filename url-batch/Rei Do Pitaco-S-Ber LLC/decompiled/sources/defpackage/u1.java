package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class u1 extends m60 {
    public final /* synthetic */ int u;

    @Override // defpackage.m60
    public final Object P(Intent intent, int i) {
        switch (this.u) {
            case 0:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        ArrayList r0 = o6.r0(stringArrayExtra);
                        Iterator it = r0.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(wa.Y(r0), wa.Y(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new bw(it.next(), it2.next()));
                        }
                        break;
                    }
                }
                break;
        }
        return new t1(intent, i);
    }
}
