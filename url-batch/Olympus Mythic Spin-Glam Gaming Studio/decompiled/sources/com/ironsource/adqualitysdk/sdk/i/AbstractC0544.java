package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ч, reason: contains not printable characters */
/* loaded from: classes8.dex */
public abstract class AbstractC0544 {
    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m4040(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            if (!z) {
                sb.append(StringFog.decrypt("po8=\n", "iq8ev7tGupQ=\n"));
            }
            if (obj instanceof String) {
                sb.append(StringFog.decrypt("pA==\n", "hilE5eYrWY4=\n"));
                sb.append(obj);
                sb.append(StringFog.decrypt("ng==\n", "vCHYL/26/40=\n"));
            } else {
                sb.append(obj);
            }
            i++;
            z = false;
        }
        return sb.toString();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0954 m4041(C0785 c0785, C0880 c0880) {
        C0954 mo4042 = mo4042(c0785, c0880);
        if (mo4042 != null) {
            Object obj = mo4042.f2276;
            if (obj instanceof AbstractC0544) {
                return ((AbstractC0544) obj).m4041(c0785, c0880);
            }
        }
        return mo4042;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public abstract C0954 mo4042(C0785 c0785, C0880 c0880);
}
