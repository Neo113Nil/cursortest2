package sg.bigo.ads.bz;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.webkit.WebSettings;
import sg.bigo.ads.common.utils.s;

/* loaded from: classes3.dex */
public final class c {
    public static int a(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 0;
            }
            int type = activeNetworkInfo.getType();
            if (type == 1) {
                return 3;
            }
            if (type != 0) {
                return 0;
            }
            switch (activeNetworkInfo.getSubtype()) {
            }
            return 0;
        } catch (Throwable th) {
            sg.bigo.ads.bn.a.a(0, "NetworkUtil", "exception on get network info:" + th.getMessage());
            return 0;
        }
    }

    public static boolean b(Context context) {
        if (context == null) {
            return true;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static String c(Context context) {
        String property;
        String c = sg.bigo.ads.bw.a.c();
        long currentTimeMillis = System.currentTimeMillis();
        long d = currentTimeMillis - sg.bigo.ads.bw.a.d();
        if (!TextUtils.isEmpty(c) && d > 0 && d < s.d.a(1) * 7) {
            return c;
        }
        try {
            property = WebSettings.getDefaultUserAgent(context);
        } catch (Exception unused) {
            property = System.getProperty("http.agent");
        }
        StringBuilder sb = new StringBuilder();
        int length = property.length();
        for (int i = 0; i < length; i++) {
            char charAt = property.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
            } else {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        sg.bigo.ads.bw.a.a(sb2);
        sg.bigo.ads.bw.a.b(currentTimeMillis);
        return sb2;
    }
}
