package Y;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import b.InterfaceC0080b;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: Y.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0051t implements InterfaceC0080b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f1146b;

    public /* synthetic */ C0051t(ComponentActivity componentActivity, int i) {
        this.f1145a = i;
        this.f1146b = componentActivity;
    }

    @Override // b.InterfaceC0080b
    public final void a(ComponentActivity componentActivity) {
        ComponentActivity componentActivity2 = this.f1146b;
        switch (this.f1145a) {
            case 0:
                C0052u c0052u = (C0052u) ((FragmentActivity) componentActivity2).f1478s.f30b;
                c0052u.d.b(c0052u, c0052u, null);
                return;
            default:
                int i = ComponentActivity.f1237r;
                g1.f.e(componentActivity2, "this$0");
                g1.f.e(componentActivity, "it");
                Bundle c2 = componentActivity2.d.f2617b.c("android:support:activity-result");
                if (c2 != null) {
                    a.j jVar = componentActivity2.h;
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
                    Bundle bundle2 = jVar.f1200g;
                    if (bundle != null) {
                        bundle2.putAll(bundle);
                    }
                    int size = stringArrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String str = stringArrayList.get(i2);
                        LinkedHashMap linkedHashMap = jVar.f1196b;
                        boolean containsKey = linkedHashMap.containsKey(str);
                        LinkedHashMap linkedHashMap2 = jVar.f1195a;
                        if (containsKey) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle2.containsKey(str)) {
                                continue;
                            } else {
                                if ((linkedHashMap2 instanceof h1.a) && !(linkedHashMap2 instanceof h1.b)) {
                                    g1.l.c(linkedHashMap2, "kotlin.collections.MutableMap");
                                    throw null;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i2);
                        g1.f.d(num2, "rcs[i]");
                        int intValue = num2.intValue();
                        String str2 = stringArrayList.get(i2);
                        g1.f.d(str2, "keys[i]");
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
