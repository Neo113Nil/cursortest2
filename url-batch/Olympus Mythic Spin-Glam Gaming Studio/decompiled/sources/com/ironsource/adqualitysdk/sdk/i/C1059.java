package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ẏ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1059 extends AbstractC1100 {
    static {
        StringFog.decrypt("Q6iGAbayVvw=\n", "JM3yR9/XOpg=\n");
        StringFog.decrypt("rsLwJECd1Y26\n", "yaeEYin4uek=\n");
        StringFog.decrypt("Of+KT7dpXWAY85tlulRIQCfqmw==\n", "Xpr+Cd4bLhQ=\n");
        StringFog.decrypt("HUBjL/I0iG48THIF/xGSbhJ1ZQz9L4M=\n", "eiUXaZtG+xo=\n");
        StringFog.decrypt("qL+wmJyduKKuobG9jZ68vqKhsZya\n", "y83V+ej4/ss=\n");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static Field m4331(ArrayList arrayList) {
        Field[] fields;
        Class cls = (Class) AbstractC1100.m4401(arrayList, 0, Class.class);
        String str = (String) AbstractC1100.m4401(arrayList, 1, String.class);
        C1082 c1082 = C0860.m4221().f2086;
        synchronized (C1082.class) {
            try {
                if (c1082.f2736 == null) {
                    c1082.f2736 = new ArrayList();
                }
                c1082.f2736.clear();
                ArrayList arrayList2 = c1082.f2736;
                try {
                    fields = cls.getDeclaredFields();
                } catch (Error unused) {
                    fields = cls.getFields();
                }
                for (Field field : fields) {
                    if (field.getType().getName().toLowerCase().startsWith(str.toLowerCase())) {
                        field.setAccessible(true);
                        arrayList2.add(field);
                    }
                }
                if (c1082.f2736.isEmpty()) {
                    return null;
                }
                return (Field) c1082.f2736.get(0);
            } finally {
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Field m4332(ArrayList arrayList) {
        if (!(arrayList.get(0) instanceof Class)) {
            Object m4401 = AbstractC1100.m4401(arrayList, 0, Object.class);
            return C0860.m4221().f2086.m4370(m4401.getClass(), (Class) AbstractC1100.m4401(arrayList, 1, Class.class));
        }
        Class cls = (Class) AbstractC1100.m4401(arrayList, 0, Class.class);
        if (arrayList.get(1) instanceof Class) {
            return C0860.m4221().f2086.m4370(cls, (Class) AbstractC1100.m4401(arrayList, 1, Class.class));
        }
        return C0860.m4221().f2086.m4369(cls, (C1084) AbstractC1100.m4401(arrayList, 1, C1084.class));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static List m4333(ArrayList arrayList) {
        if (!(arrayList.get(0) instanceof Class)) {
            Object m4401 = AbstractC1100.m4401(arrayList, 0, Object.class);
            boolean booleanValue = arrayList.size() > 1 ? ((Boolean) AbstractC1100.m4401(arrayList, 1, Boolean.class)).booleanValue() : false;
            C1082 c1082 = C0860.m4221().f2086;
            return Arrays.asList(C1082.m4368(m4401.getClass(), booleanValue, -1, null));
        }
        if (arrayList.size() <= 1) {
            return new ArrayList();
        }
        Class cls = (Class) AbstractC1100.m4401(arrayList, 0, Class.class);
        C1084 c1084 = (C1084) AbstractC1100.m4401(arrayList, 1, C1084.class);
        C1082 c10822 = C0860.m4221().f2086;
        ArrayList arrayList2 = new ArrayList();
        c10822.m4371(cls, c1084, arrayList2);
        return arrayList2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Field m4335(ArrayList arrayList) {
        return C0860.m4221().f2086.m4369((Class) AbstractC1100.m4401(arrayList, 0, Class.class), (C1084) AbstractC1100.m4401(arrayList, 1, C1084.class));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static C1085 m4334() {
        C1082 c1082 = C0860.m4221().f2086;
        return new C1085();
    }
}
