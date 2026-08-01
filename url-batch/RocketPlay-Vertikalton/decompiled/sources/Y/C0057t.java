package Y;

import android.os.Bundle;
import b.InterfaceC0088b;
import g.AbstractActivityC0129i;
import j1.InterfaceC0183a;
import j1.InterfaceC0184b;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: Y.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0057t implements InterfaceC0088b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0129i f1527b;

    public /* synthetic */ C0057t(AbstractActivityC0129i abstractActivityC0129i, int i) {
        this.f1526a = i;
        this.f1527b = abstractActivityC0129i;
    }

    @Override // b.InterfaceC0088b
    public final void a(a.l lVar) {
        switch (this.f1526a) {
            case 0:
                C0058u c0058u = (C0058u) this.f1527b.f2674s.f38b;
                c0058u.d.b(c0058u, c0058u, null);
                return;
            default:
                AbstractActivityC0129i abstractActivityC0129i = this.f1527b;
                i1.f.e(lVar, "it");
                Bundle c2 = abstractActivityC0129i.d.f3037b.c("android:support:activity-result");
                if (c2 != null) {
                    a.j jVar = abstractActivityC0129i.h;
                    jVar.getClass();
                    ArrayList<Integer> integerArrayList = c2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = c2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        jVar.d.addAll(stringArrayList2);
                    }
                    Bundle bundle = c2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    Bundle bundle2 = jVar.f1579g;
                    if (bundle != null) {
                        bundle2.putAll(bundle);
                    }
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        LinkedHashMap linkedHashMap = jVar.f1575b;
                        boolean containsKey = linkedHashMap.containsKey(str);
                        LinkedHashMap linkedHashMap2 = jVar.f1574a;
                        if (containsKey) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle2.containsKey(str)) {
                                continue;
                            } else {
                                if ((linkedHashMap2 instanceof InterfaceC0183a) && !(linkedHashMap2 instanceof InterfaceC0184b)) {
                                    i1.l.c(linkedHashMap2, "kotlin.collections.MutableMap");
                                    throw null;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        i1.f.d(num2, "rcs[i]");
                        int intValue = num2.intValue();
                        String str2 = stringArrayList.get(i);
                        i1.f.d(str2, "keys[i]");
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(intValue), str3);
                        linkedHashMap.put(str3, Integer.valueOf(intValue));
                    }
                    return;
                }
                return;
        }
    }
}
