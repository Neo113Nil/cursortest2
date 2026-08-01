package X;

import android.util.Log;
import c.C0078a;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f1007b;

    public /* synthetic */ z(I i, int i2) {
        this.f1006a = i2;
        this.f1007b = i;
    }

    public final void a(Object obj) {
        switch (this.f1006a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                I i2 = this.f1007b;
                F f2 = (F) i2.f798C.pollFirst();
                if (f2 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    T.u uVar = i2.f810c;
                    String str = f2.f792a;
                    if (uVar.e(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            case 1:
                C0078a c0078a = (C0078a) obj;
                I i3 = this.f1007b;
                F f3 = (F) i3.f798C.pollFirst();
                if (f3 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    T.u uVar2 = i3.f810c;
                    String str2 = f3.f792a;
                    AbstractComponentCallbacksC0049q e2 = uVar2.e(str2);
                    if (e2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        e2.q(f3.f793b, c0078a.f1510a, c0078a.f1511b);
                        break;
                    }
                }
            default:
                C0078a c0078a2 = (C0078a) obj;
                I i4 = this.f1007b;
                F f4 = (F) i4.f798C.pollFirst();
                if (f4 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    T.u uVar3 = i4.f810c;
                    String str3 = f4.f792a;
                    AbstractComponentCallbacksC0049q e3 = uVar3.e(str3);
                    if (e3 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        e3.q(f4.f793b, c0078a2.f1510a, c0078a2.f1511b);
                        break;
                    }
                }
        }
    }
}
