package o;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: o.No, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354No implements L1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractC0588Wo b;

    public /* synthetic */ C0354No(C0614Xo c0614Xo, int i) {
        this.a = i;
        this.b = c0614Xo;
    }

    @Override // o.L1
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                AbstractC0588Wo abstractC0588Wo = this.b;
                C0484So c0484So = (C0484So) abstractC0588Wo.E.pollFirst();
                if (c0484So == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = c0484So.h;
                    if (abstractC0588Wo.c.o(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            case 1:
                K1 k1 = (K1) obj;
                AbstractC0588Wo abstractC0588Wo2 = this.b;
                C0484So c0484So2 = (C0484So) abstractC0588Wo2.E.pollLast();
                if (c0484So2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    String str2 = c0484So2.h;
                    int i2 = c0484So2.i;
                    AbstractComponentCallbacksC0069Co o2 = abstractC0588Wo2.c.o(str2);
                    if (o2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        o2.k(i2, k1.h, k1.i);
                        break;
                    }
                }
            default:
                K1 k12 = (K1) obj;
                AbstractC0588Wo abstractC0588Wo3 = this.b;
                C0484So c0484So3 = (C0484So) abstractC0588Wo3.E.pollFirst();
                if (c0484So3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    String str3 = c0484So3.h;
                    int i3 = c0484So3.i;
                    AbstractComponentCallbacksC0069Co o3 = abstractC0588Wo3.c.o(str3);
                    if (o3 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        o3.k(i3, k12.h, k12.i);
                        break;
                    }
                }
        }
    }
}
