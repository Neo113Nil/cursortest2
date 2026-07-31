package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵠ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1021 extends AbstractC1100 {
    static {
        StringFog.decrypt("sGnXJMLEfHCz\n", "1wyjaaewFB8=\n");
        StringFog.decrypt("LBiHlmIdQQAvDg==\n", "S33z2wdpKW8=\n");
        StringFog.decrypt("COHZmG6yzpkf+9OdXrLlvh760J1/pQ==\n", "a5O8+RrXg/w=\n");
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static ArrayList m4301(ArrayList arrayList) {
        C1049 c1049 = (C1049) AbstractC1100.m4401(arrayList, 1, C1049.class);
        return arrayList.get(0) instanceof Class ? AbstractC1043.m4321((Class) AbstractC1100.m4401(arrayList, 0, Class.class), c1049) : AbstractC1043.m4321(AbstractC1100.m4401(arrayList, 0, Object.class).getClass(), c1049);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Method m4303(ArrayList arrayList) {
        C1049 c1049 = (C1049) AbstractC1100.m4401(arrayList, 1, C1049.class);
        if (arrayList.get(0) instanceof Class) {
            ArrayList m4321 = AbstractC1043.m4321((Class) AbstractC1100.m4401(arrayList, 0, Class.class), c1049);
            if (m4321.isEmpty()) {
                return null;
            }
            return (Method) m4321.get(0);
        }
        ArrayList m43212 = AbstractC1043.m4321(AbstractC1100.m4401(arrayList, 0, Object.class).getClass(), c1049);
        if (m43212.isEmpty()) {
            return null;
        }
        return (Method) m43212.get(0);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static C1063 m4302() {
        return new C1063();
    }
}
