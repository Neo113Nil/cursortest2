package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class hr extends vv {
    public static final int g0(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map h0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return vh.f;
        }
        int i = 0;
        if (size == 1) {
            bw bwVar = (bw) arrayList.get(0);
            bwVar.getClass();
            Map singletonMap = Collections.singletonMap(bwVar.f, bwVar.g);
            singletonMap.getClass();
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(g0(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            bw bwVar2 = (bw) obj;
            linkedHashMap.put(bwVar2.f, bwVar2.g);
        }
        return linkedHashMap;
    }
}
