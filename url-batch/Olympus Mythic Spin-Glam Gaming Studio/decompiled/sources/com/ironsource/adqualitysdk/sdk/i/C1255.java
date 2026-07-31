package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺒ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1255 extends AbstractC1005 {
    public C1255(String str, String str2, C0785 c0785) {
        super(str, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("iLQtswn6u6U=\n", "6dpJwWaT34g=\n"));
        sb.append(this.f2434.toLowerCase());
        sb.append(StringFog.decrypt("mA==\n", "tScur9/U7Bs=\n"));
        sb.append(this.f2433);
        String m4543 = AbstractC1293.m4543("11U5UA==\n", "+SZLPMv3+SI=\n", sb);
        if (c0785 != null) {
            ArrayList arrayList = new ArrayList();
            while (c0785 != null && c0785.f1846 != null) {
                arrayList.add(c0785);
                c0785 = c0785.f1847;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0785 c07852 = (C0785) it.next();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                String m4083 = AbstractC0584.m4083("UQ==\n", "fwIiTuAEFVo=\n", sb2, str2);
                C1064 c1064 = c07852.f1846;
                this.f2435.add(new C0981(m4083, c1064.f2696, m4543, c07852.m4180() + c1064.m4336()));
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            this.f2435.add(new C0981(str, str2, AbstractC1293.m4543("BAzQu4nsAPpGHZG/lOYN\n", "KW+/1eeJY44=\n", sb3), 0));
        }
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        ArrayList arrayList2 = new ArrayList();
        String name = C1064.class.getName();
        for (int length = stackTrace.length - 1; length >= 0; length--) {
            StackTraceElement stackTraceElement = stackTrace[length];
            if (stackTraceElement.getClassName().equals(name)) {
                break;
            }
            arrayList2.add(0, stackTraceElement);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            StackTraceElement stackTraceElement2 = (StackTraceElement) it2.next();
            this.f2435.add(new C0981(stackTraceElement2.getClassName(), stackTraceElement2.getMethodName(), stackTraceElement2.getFileName(), stackTraceElement2.getLineNumber()));
        }
    }
}
