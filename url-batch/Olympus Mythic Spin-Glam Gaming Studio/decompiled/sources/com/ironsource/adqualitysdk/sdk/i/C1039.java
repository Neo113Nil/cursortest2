package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ḷ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1039 implements InvocationHandler {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2630 = StringFog.decrypt("/tYsn2t1arf4xz2/TXdpqfvSO7A=\n", "mbNY2w4WBcU=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0505 f2631;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object f2632;

    public C1039(Object obj, C0505 c0505) {
        this.f2632 = obj;
        this.f2631 = c0505;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (name.hashCode() == 1622498214) {
            String str = f2630;
            if (name.equals(str)) {
                try {
                    String name2 = method.getName();
                    if (name2.hashCode() == 1622498214 && name2.equals(str)) {
                        return this.f2632;
                    }
                    return null;
                } catch (Throwable th) {
                    AbstractC0577.m4068(StringFog.decrypt("X2RrSAAz95BjZQ==\n", "DxYEMHlmg/k=\n"), StringFog.decrypt("9V95Of209aTGQmAzr/X4m8VMZz/77byn1VljOeu0\n", "sC0LVo+UnMo=\n") + method.getName(), th, true);
                    return null;
                }
            }
        }
        try {
            this.f2631.m4028(obj, method, objArr);
        } catch (Throwable th2) {
            String decrypt = StringFog.decrypt("4H3VnWCEAB3cfA==\n", "sA+65RnRdHQ=\n");
            StringBuilder sb = new StringBuilder();
            sb.append(StringFog.decrypt("9LD/W+Yu1lrHreZRtGLWR8Wn41HmNJ8=\n", "scKNNJQOvzQ=\n"));
            Object obj2 = this.f2632;
            sb.append(obj2 != null ? obj2.toString() : StringFog.decrypt("5NMIKw==\n", "iqZkRwOu8As=\n"));
            sb.append(StringFog.decrypt("LlIXbiltdQI=\n", "Dj9yGkECETg=\n"));
            sb.append(method.getName());
            AbstractC0577.m4068(decrypt, sb.toString(), th2, true);
        }
        Object obj3 = this.f2632;
        if (obj3 != null) {
            return method.invoke(obj3, objArr);
        }
        if (!Object.class.equals(method.getDeclaringClass())) {
            return null;
        }
        if (objArr != null) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : objArr) {
                    if (Proxy.isProxyClass(obj4.getClass())) {
                        arrayList.add(Proxy.getInvocationHandler(obj4));
                    } else {
                        arrayList.add(obj4);
                    }
                }
                objArr = arrayList.toArray();
            } catch (Throwable th3) {
                AbstractC0577.m4068(StringFog.decrypt("3w1/7mYhnJPjDA==\n", "j38Qlh906Po=\n"), StringFog.decrypt("QjkChCLTlddzPxmFN9Ob3HEkE4okmp3cJyoCjCM=\n", "B0tw61Dz8rI=\n"), th3, true);
            }
        }
        return method.invoke(this, objArr);
    }
}
