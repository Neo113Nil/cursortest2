package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ὶ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC1100 {
    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m4400(List list, int i, Class cls) {
        Object obj = list.get(i);
        return obj == null || cls.isAssignableFrom(obj.getClass());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Object m4401(List list, int i, Class cls) {
        Object obj = list.get(i);
        if (obj == null || cls.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        throw new ClassCastException(StringFog.decrypt("Bdy0bsNokMQnzq4g\n", "Rr3aAKwcsKc=\n") + obj.getClass().getName() + StringFog.decrypt("ggX56Q==\n", "onGWycJ/Onk=\n") + cls.getName());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static List m4402(List list, int i) {
        ArrayList arrayList = new ArrayList();
        return (list.size() <= i || !m4400(list, i, List.class)) ? arrayList : (List) m4401(list, i, List.class);
    }
}
