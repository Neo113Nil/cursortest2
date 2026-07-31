package yads;

import com.google.android.exoplayer2.C;
import com.ironsource.B5;
import com.ironsource.C4538a2;
import com.mbridge.msdk.foundation.download.Command;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes13.dex */
public abstract class b11 {
    public static zq a(u82 u82Var) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = u82Var.c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long a = str != null ? a(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(StringUtils.COMMA, 0);
            z = false;
            j = 0;
            j2 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            i = 1;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str3 = (String) map.get("Expires");
        long a2 = str3 != null ? a(str3) : 0L;
        String str4 = (String) map.get("Last-Modified");
        long a3 = str4 != null ? a(str4) : 0L;
        String str5 = (String) map.get(Command.HTTP_HEADER_ETAG);
        if (i != 0) {
            j4 = currentTimeMillis + (j * 1000);
            if (!z) {
                j3 = j4;
                j4 = (j2 * 1000) + j4;
                zq zqVar = new zq();
                zqVar.a = u82Var.b;
                zqVar.b = str5;
                zqVar.f = j3;
                zqVar.e = j4;
                zqVar.c = a;
                zqVar.d = a3;
                zqVar.g = map;
                zqVar.h = u82Var.d;
                return zqVar;
            }
            j3 = j4;
            zq zqVar2 = new zq();
            zqVar2.a = u82Var.b;
            zqVar2.b = str5;
            zqVar2.f = j3;
            zqVar2.e = j4;
            zqVar2.c = a;
            zqVar2.d = a3;
            zqVar2.g = map;
            zqVar2.h = u82Var.d;
            return zqVar2;
        }
        j3 = 0;
        if (a <= 0 || a2 < a) {
            j4 = 0;
            zq zqVar22 = new zq();
            zqVar22.a = u82Var.b;
            zqVar22.b = str5;
            zqVar22.f = j3;
            zqVar22.e = j4;
            zqVar22.c = a;
            zqVar22.d = a3;
            zqVar22.g = map;
            zqVar22.h = u82Var.d;
            return zqVar22;
        }
        j4 = currentTimeMillis + (a2 - a);
        j3 = j4;
        zq zqVar222 = new zq();
        zqVar222.a = u82Var.b;
        zqVar222.b = str5;
        zqVar222.f = j3;
        zqVar222.e = j4;
        zqVar222.c = a;
        zqVar222.d = a3;
        zqVar222.g = map;
        zqVar222.h = u82Var.d;
        return zqVar222;
    }

    public static long a(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            if (!"0".equals(str) && !C4538a2.f.equals(str)) {
                boolean z = lm3.a;
                boolean z2 = ob1.a;
                return 0L;
            }
            boolean z3 = lm3.a;
            boolean z4 = ob1.a;
            return 0L;
        }
    }

    public static String a(Map map) {
        String str;
        if (map != null && (str = (String) map.get("Content-Type")) != null) {
            String[] split = str.split(";", 0);
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals(B5.N)) {
                    return split2[1];
                }
            }
        }
        return C.ISO88591_NAME;
    }
}
