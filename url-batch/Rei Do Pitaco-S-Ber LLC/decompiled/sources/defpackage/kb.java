package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class kb implements qv {
    public final /* synthetic */ int a;
    public final /* synthetic */ b3 b;

    public /* synthetic */ kb(b3 b3Var, int i) {
        this.a = i;
        this.b = b3Var;
    }

    @Override // defpackage.qv
    public final void a(pb pbVar) {
        int i = this.a;
        b3 b3Var = this.b;
        switch (i) {
            case 0:
                pbVar.getClass();
                Bundle c = b3Var.i.b.c("android:support:activity-result");
                if (c != null) {
                    nb nbVar = b3Var.m;
                    LinkedHashMap linkedHashMap = nbVar.b;
                    LinkedHashMap linkedHashMap2 = nbVar.a;
                    Bundle bundle = nbVar.g;
                    ArrayList<Integer> integerArrayList = c.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = c.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        nbVar.d.addAll(stringArrayList2);
                    }
                    Bundle bundle2 = c.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle2 != null) {
                        bundle.putAll(bundle2);
                    }
                    int size = stringArrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String str = stringArrayList.get(i2);
                        if (linkedHashMap.containsKey(str)) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle.containsKey(str)) {
                                continue;
                            } else {
                                if (linkedHashMap2 instanceof vo) {
                                    m60.a0(linkedHashMap2, "kotlin.collections.MutableMap");
                                    throw null;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i2);
                        num2.getClass();
                        int intValue = num2.intValue();
                        String str2 = stringArrayList.get(i2);
                        str2.getClass();
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(intValue), str3);
                        nbVar.b.put(str3, Integer.valueOf(intValue));
                    }
                    return;
                }
                return;
            default:
                fk fkVar = (fk) b3Var.z.g;
                fkVar.x.b(fkVar, fkVar, null);
                return;
        }
    }
}
