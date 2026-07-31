package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵍ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1003 extends AbstractC1100 {
    static {
        StringFog.decrypt("/iUX\n", "kEBgIuyGgLA=\n");
        StringFog.decrypt("drYkQw==\n", "Fd5FMe9CJiU=\n");
        StringFog.decrypt("joOhSf9OwiKK\n", "7/HTKIYau1I=\n");
        StringFog.decrypt("UnrK8G2k6ppOVcXhZr/G\n", "PRiglQ7Qovs=\n");
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static char m4283(ArrayList arrayList) {
        return (char) ((Number) AbstractC1100.m4401(arrayList, 0, Number.class)).intValue();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m4284(ArrayList arrayList) {
        return AbstractC1226.m4478(AbstractC1100.m4401(arrayList, 0, Object.class), (String) AbstractC1100.m4401(arrayList, 1, String.class), (List) AbstractC1100.m4401(arrayList, 2, List.class)) != null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Object m4286(C0880 c0880, ArrayList arrayList) {
        String str;
        Constructor<?> constructor;
        int i = 0;
        Class cls = (Class) AbstractC1100.m4401(arrayList, 0, Class.class);
        List arrayList2 = new ArrayList();
        if (arrayList.size() > 1) {
            arrayList2 = (List) AbstractC1100.m4401(arrayList, 1, List.class);
        }
        List list = arrayList.size() > 2 ? (List) AbstractC1100.m4401(arrayList, 2, List.class) : null;
        try {
            if (list != null) {
                Class<?>[] clsArr = new Class[list.size()];
                list.toArray(clsArr);
                String str2 = AbstractC1226.f3226;
                return cls.getConstructor(clsArr).newInstance(arrayList2.toArray());
            }
            String str3 = AbstractC1226.f3226;
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            while (true) {
                if (i >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i];
                if (constructor.getParameterTypes().length == arrayList2.size() && AbstractC1226.m4480(constructor.getParameterTypes(), arrayList2)) {
                    break;
                }
                i++;
            }
            return constructor.newInstance(arrayList2.toArray());
        } catch (Exception e) {
            String str4 = c0880.f2139.f1857.f2831;
            StringBuilder sb = new StringBuilder();
            sb.append(StringFog.decrypt("+uuP8a6OR7za+In3sskEoNru3Q==\n", "v5n9ntyuJM4=\n"));
            sb.append(cls.getName());
            sb.append(StringFog.decrypt("uYHsb4UFrm7+haU=\n", "mfaFG+0lzxw=\n"));
            sb.append(arrayList2);
            if (list != null) {
                str = StringFog.decrypt("izrGkLdNdu/YKM2Htw==\n", "q1uo9JcuGo4=\n") + list;
            } else {
                str = "";
            }
            sb.append(str);
            AbstractC0844.m4219(str4, sb.toString(), e, null);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Class m4285(ArrayList arrayList) {
        return Array.newInstance((Class<?>) AbstractC1100.m4401(arrayList, 0, Class.class), 0).getClass();
    }
}
