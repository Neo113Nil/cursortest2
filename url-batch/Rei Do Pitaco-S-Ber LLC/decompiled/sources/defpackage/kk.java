package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class kk {
    public final /* synthetic */ int a;
    public final /* synthetic */ sk b;

    public /* synthetic */ kk(sk skVar, int i) {
        this.a = i;
        this.b = skVar;
    }

    public final void a(Object obj) {
        int i = this.a;
        sk skVar = this.b;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                pk pkVar = (pk) skVar.C.pollFirst();
                if (pkVar == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = pkVar.f;
                    if (skVar.c.i(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            case 1:
                t1 t1Var = (t1) obj;
                pk pkVar2 = (pk) skVar.C.pollFirst();
                if (pkVar2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    String str2 = pkVar2.f;
                    int i3 = pkVar2.g;
                    dk i4 = skVar.c.i(str2);
                    if (i4 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        i4.q(i3, t1Var.f, t1Var.g);
                        break;
                    }
                }
            default:
                t1 t1Var2 = (t1) obj;
                pk pkVar3 = (pk) skVar.C.pollFirst();
                if (pkVar3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    String str3 = pkVar3.f;
                    int i5 = pkVar3.g;
                    dk i6 = skVar.c.i(str3);
                    if (i6 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        i6.q(i5, t1Var2.f, t1Var2.g);
                        break;
                    }
                }
        }
    }
}
