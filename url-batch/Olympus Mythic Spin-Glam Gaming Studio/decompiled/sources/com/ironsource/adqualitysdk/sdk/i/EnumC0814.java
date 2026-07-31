package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒢ, reason: contains not printable characters */
/* loaded from: classes8.dex */
public enum EnumC0814 {
    f2008,
    f2007,
    f2006;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static EnumC0814 m4214(String str) {
        char c;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int hashCode = str.hashCode();
        if (hashCode == 3642) {
            if (str.equals(StringFog.decrypt("484=\n", "kaLIsb/ey6w=\n"))) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 96921) {
            if (hashCode == 109261 && str.equals(StringFog.decrypt("iBjK\n", "5nekvh2k+zU=\n"))) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals(StringFog.decrypt("jl04\n", "7ylUfo9u9KM=\n"))) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return f2008;
        }
        if (c == 1) {
            return f2007;
        }
        if (c != 2) {
            return null;
        }
        return f2006;
    }
}
