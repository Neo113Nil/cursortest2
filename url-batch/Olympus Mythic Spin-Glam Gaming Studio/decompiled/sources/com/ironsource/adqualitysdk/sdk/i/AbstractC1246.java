package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﹼ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public abstract class AbstractC1246 {
    /* renamed from: ﾇ, reason: contains not printable characters */
    public static ArrayList m4504(String str, String str2, boolean z) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile(str2).matcher(str);
        while (matcher.find()) {
            if (matcher.groupCount() == 0) {
                arrayList.add(matcher.group());
                if (z) {
                    return arrayList;
                }
            } else {
                for (int i = 1; i <= matcher.groupCount(); i++) {
                    arrayList.add(matcher.group(i));
                    if (z) {
                        return arrayList;
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static int m4506(String str, String str2) {
        String[] split = str.replaceAll(StringFog.decrypt("fagE+isERA==\n", "JvY01xIqGbA=\n"), "").split(StringFog.decrypt("Nso=\n", "auTcBhdVbr4=\n"));
        String[] split2 = str2.replaceAll(StringFog.decrypt("VuTbHKPQjA==\n", "DbrrMZr+0YY=\n"), "").split(StringFog.decrypt("K1Q=\n", "d3qyPyA1v38=\n"));
        int i = 0;
        while (i < split.length && i < split2.length && split[i].equals(split2[i])) {
            i++;
        }
        return (i >= split.length || i >= split2.length) ? Integer.signum(split.length - split2.length) : Integer.signum(Integer.valueOf(split[i]).compareTo(Integer.valueOf(split2[i])));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m4505(String str) {
        Handler handler = AbstractC1026.f2539;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return false;
        }
        try {
            new GZIPInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m4509(String str, int i) {
        return !TextUtils.isEmpty(str) && str.length() >= 1 && str.length() <= i;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m4508(String str, String str2, boolean z) {
        if (z && !TextUtils.isEmpty(str2)) {
            if (!str2.startsWith(StringFog.decrypt("7Q==\n", "sxU1dy+2Nog=\n"))) {
                str2 = AbstractC0584.m4083("ljQDxnESU2Y=\n", "yG9ftS1BDkw=\n", new StringBuilder(), str2);
            }
            if (!str2.endsWith(StringFog.decrypt("1Q==\n", "8ZvKDCsioqE=\n"))) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                str2 = AbstractC1293.m4543("GUdu2zCOaQ==\n", "Qhsdh2PTQwo=\n", sb);
            }
        }
        ArrayList m4504 = m4504(str, str2, true);
        if (m4504.size() > 0) {
            return (String) m4504.get(0);
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m4507(String str) {
        if (str != null) {
            Handler handler = AbstractC1026.f2539;
            if (Looper.myLooper() != Looper.getMainLooper() && m4505(str)) {
                int i = 0;
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    new ByteArrayOutputStream();
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = gZIPInputStream.read(bArr, i, 8192 - i);
                        if (read == -1) {
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            return new String(bArr, StringFog.decrypt("XoPTTF0=\n", "C9eVYWWWyk8=\n"));
                        }
                        i += read;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }
}
