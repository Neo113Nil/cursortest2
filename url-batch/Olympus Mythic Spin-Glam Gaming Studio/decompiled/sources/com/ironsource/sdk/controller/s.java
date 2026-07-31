package com.ironsource.sdk.controller;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4782n4;
import com.ironsource.Ib;
import com.ironsource.mediationsdk.logger.IronLog;
import java.security.MessageDigest;
import java.util.UUID;

/* loaded from: classes5.dex */
final class s {
    private static final String b = "MD5";
    private String a;

    s(String str) {
        this.a = str;
    }

    static String a() {
        return UUID.randomUUID().toString();
    }

    private String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return a(messageDigest.digest());
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    private String a(String str) {
        try {
            return Ib.a(str);
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return b(str);
        }
    }

    private String a(byte[] bArr) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            if (hexString.length() < 2) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    String b() {
        return this.a;
    }

    boolean a(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(a(str + str2 + this.a));
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }
}
