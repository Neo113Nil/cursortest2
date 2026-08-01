package Y;

import android.util.Log;
import c.C0100a;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f1542b;

    public /* synthetic */ z(I i, int i2) {
        this.f1541a = i2;
        this.f1542b = i;
    }

    public final void a(Object obj) {
        switch (this.f1541a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                I i2 = this.f1542b;
                F f2 = (F) i2.f1332C.pollFirst();
                if (f2 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    U.v vVar = i2.f1344c;
                    String str = f2.f1326a;
                    if (vVar.e(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            case 1:
                C0100a c0100a = (C0100a) obj;
                I i3 = this.f1542b;
                F f3 = (F) i3.f1332C.pollFirst();
                if (f3 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    U.v vVar2 = i3.f1344c;
                    String str2 = f3.f1326a;
                    AbstractComponentCallbacksC0055q e2 = vVar2.e(str2);
                    if (e2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        e2.q(f3.f1327b, c0100a.f2107a, c0100a.f2108b);
                        break;
                    }
                }
            default:
                C0100a c0100a2 = (C0100a) obj;
                I i4 = this.f1542b;
                F f4 = (F) i4.f1332C.pollFirst();
                if (f4 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    U.v vVar3 = i4.f1344c;
                    String str3 = f4.f1326a;
                    AbstractComponentCallbacksC0055q e3 = vVar3.e(str3);
                    if (e3 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        e3.q(f4.f1327b, c0100a2.f2107a, c0100a2.f2108b);
                        break;
                    }
                }
        }
    }
}
