package Y;

import android.util.Log;
import c.C0084a;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f1161b;

    public /* synthetic */ z(I i, int i2) {
        this.f1160a = i2;
        this.f1161b = i;
    }

    public final void a(Object obj) {
        switch (this.f1160a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                I i2 = this.f1161b;
                F f2 = (F) i2.f951C.pollFirst();
                if (f2 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    U.v vVar = i2.f963c;
                    String str = f2.f945a;
                    if (vVar.d(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            case 1:
                C0084a c0084a = (C0084a) obj;
                I i3 = this.f1161b;
                F f3 = (F) i3.f951C.pollFirst();
                if (f3 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    U.v vVar2 = i3.f963c;
                    String str2 = f3.f945a;
                    AbstractComponentCallbacksC0049q d = vVar2.d(str2);
                    if (d == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        d.q(f3.f946b, c0084a.f1727a, c0084a.f1728b);
                        break;
                    }
                }
            default:
                C0084a c0084a2 = (C0084a) obj;
                I i4 = this.f1161b;
                F f4 = (F) i4.f951C.pollFirst();
                if (f4 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    U.v vVar3 = i4.f963c;
                    String str3 = f4.f945a;
                    AbstractComponentCallbacksC0049q d2 = vVar3.d(str3);
                    if (d2 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        d2.q(f4.f946b, c0084a2.f1727a, c0084a2.f1728b);
                        break;
                    }
                }
        }
    }
}
