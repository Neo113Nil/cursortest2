package X;

import android.os.Bundle;
import b.InterfaceC0074b;
import g.AbstractActivityC0125i;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: X.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0050t implements InterfaceC0074b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0125i f990b;

    public /* synthetic */ C0050t(AbstractActivityC0125i abstractActivityC0125i, int i) {
        this.f989a = i;
        this.f990b = abstractActivityC0125i;
    }

    @Override // b.InterfaceC0074b
    public final void a(a.l lVar) {
        switch (this.f989a) {
            case 0:
                C0051u c0051u = (C0051u) this.f990b.f2318s.f59b;
                c0051u.h.b(c0051u, c0051u, null);
                return;
            default:
                AbstractActivityC0125i abstractActivityC0125i = this.f990b;
                X0.e.e(lVar, "it");
                Bundle c2 = abstractActivityC0125i.d.f2373b.c("android:support:activity-result");
                if (c2 != null) {
                    a.j jVar = abstractActivityC0125i.h;
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
                    Bundle bundle2 = jVar.f1050g;
                    if (bundle != null) {
                        bundle2.putAll(bundle);
                    }
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        LinkedHashMap linkedHashMap = jVar.f1046b;
                        boolean containsKey = linkedHashMap.containsKey(str);
                        LinkedHashMap linkedHashMap2 = jVar.f1045a;
                        if (containsKey) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle2.containsKey(str)) {
                                continue;
                            } else {
                                if (linkedHashMap2 instanceof Y0.a) {
                                    ClassCastException classCastException = new ClassCastException((linkedHashMap2 == null ? "null" : linkedHashMap2.getClass().getName()).concat(" cannot be cast to kotlin.collections.MutableMap"));
                                    X0.e.g(classCastException, X0.k.class.getName());
                                    throw classCastException;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        X0.e.d(num2, "rcs[i]");
                        int intValue = num2.intValue();
                        String str2 = stringArrayList.get(i);
                        X0.e.d(str2, "keys[i]");
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
