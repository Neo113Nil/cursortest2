package io.appmetrica.analytics.impl;

import com.pubmatic.sdk.common.POBCommonConstants;
import kotlin.text.Charsets;

/* renamed from: io.appmetrica.analytics.impl.lg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC5491lg {
    public static final String a(String str, EnumC5798xb enumC5798xb, String str2, String str3) {
        if (enumC5798xb == null) {
            enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        }
        if (!Q9.d.contains(EnumC5798xb.a(enumC5798xb.a))) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(enumC5798xb.name());
        if (Q9.f.contains(enumC5798xb) && str2 != null && str2.length() != 0) {
            sb.append(" with name ");
            sb.append(str2);
        }
        if (Q9.e.contains(enumC5798xb) && str3 != null && str3.length() != 0) {
            sb.append(" with value ");
            sb.append(str3);
        }
        return sb.toString();
    }

    public static final String a(C5822y9 c5822y9) {
        String str;
        StringBuilder sb = new StringBuilder("Event sent: ");
        int i = c5822y9.c;
        String str2 = c5822y9.d;
        byte[] bArr = c5822y9.e;
        if (i == 1) {
            str = "Attribution";
        } else if (i == 2) {
            str = "Session start";
        } else if (i == 4) {
            if (str2 == null) {
                str2 = POBCommonConstants.NULL_VALUE;
            }
            StringBuilder sb2 = new StringBuilder(str2);
            if (bArr != null) {
                String str3 = new String(bArr, Charsets.UTF_8);
                if (str3.length() > 0) {
                    sb2.append(" with value ");
                    sb2.append(str3);
                }
            }
            str = sb2.toString();
        } else if (i == 5) {
            str = "Referrer";
        } else if (i == 7) {
            str = "Session heartbeat";
        } else if (i == 13) {
            str = "The very first event";
        } else if (i == 35) {
            str = "E-Commerce";
        } else if (i == 40) {
            str = "Ad revenue (ILRD)";
        } else if (i == 42) {
            str = "External attribution";
        } else if (i == 16) {
            str = "Open";
        } else if (i == 17) {
            str = "Update";
        } else if (i == 20) {
            str = "User profile update";
        } else if (i != 21) {
            switch (i) {
                case 25:
                    str = "ANR";
                    break;
                case 26:
                    str = "Crash: " + str2;
                    break;
                case 27:
                    str = "Error: " + str2;
                    break;
                default:
                    str = "type=" + i;
                    break;
            }
        } else {
            str = "Revenue";
        }
        sb.append(str);
        return sb.toString();
    }
}
