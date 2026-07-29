package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class O1 extends N1 {
    public final /* synthetic */ int a;

    public /* synthetic */ O1(int i) {
        this.a = i;
    }

    @Override // o.N1
    public final Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.a) {
            case 0:
                String[] strArr = (String[]) obj;
                AbstractC0048Bt.n(strArr, "input");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                AbstractC0048Bt.m(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            case 1:
                Intent intent = (Intent) obj;
                AbstractC0048Bt.n(intent, "input");
                return intent;
            default:
                C1723pt c1723pt = (C1723pt) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = c1723pt.i;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        c1723pt = new C1723pt(c1723pt.h, null, c1723pt.j, c1723pt.k);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c1723pt);
                if (AbstractC0588Wo.J(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent2);
                }
                return intent2;
        }
    }

    @Override // o.N1
    public M1 b(Context context, Object obj) {
        switch (this.a) {
            case 0:
                String[] strArr = (String[]) obj;
                AbstractC0048Bt.n(strArr, "input");
                if (strArr.length == 0) {
                    return new M1(C1384kk.h);
                }
                for (String str : strArr) {
                    if (AbstractC1807r8.n(context, str) != 0) {
                        return null;
                    }
                }
                int E = EB.E(strArr.length);
                if (E < 16) {
                    E = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(E);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new M1(linkedHashMap);
            default:
                return super.b(context, obj);
        }
    }

    @Override // o.N1
    public final Object c(Intent intent, int i) {
        switch (this.a) {
            case 0:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        break;
                    }
                }
                break;
        }
        return new K1(intent, i);
    }
}
