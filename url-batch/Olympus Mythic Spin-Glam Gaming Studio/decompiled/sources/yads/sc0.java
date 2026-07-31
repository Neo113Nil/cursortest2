package yads;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class sc0 {
    public final Context a;
    public final HashMap b;
    public final int c;
    public final p53 d;
    public final boolean e;

    public sc0(Context context) {
        String b;
        TelephonyManager telephonyManager;
        this.a = context == null ? null : context.getApplicationContext();
        int i = sb3.a;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                b = lh.b(networkCountryIso);
                int[] a = tc0.a(b);
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                um2 um2Var = tc0.n;
                hashMap.put(2, (Long) um2Var.get(a[0]));
                hashMap.put(3, (Long) tc0.o.get(a[1]));
                hashMap.put(4, (Long) tc0.p.get(a[2]));
                hashMap.put(5, (Long) tc0.q.get(a[3]));
                hashMap.put(10, (Long) tc0.r.get(a[4]));
                hashMap.put(9, (Long) tc0.s.get(a[5]));
                hashMap.put(7, (Long) um2Var.get(a[0]));
                this.b = hashMap;
                this.c = 2000;
                this.d = tv.a;
                this.e = true;
            }
        }
        b = lh.b(Locale.getDefault().getCountry());
        int[] a2 = tc0.a(b);
        HashMap hashMap2 = new HashMap(8);
        hashMap2.put(0, 1000000L);
        um2 um2Var2 = tc0.n;
        hashMap2.put(2, (Long) um2Var2.get(a2[0]));
        hashMap2.put(3, (Long) tc0.o.get(a2[1]));
        hashMap2.put(4, (Long) tc0.p.get(a2[2]));
        hashMap2.put(5, (Long) tc0.q.get(a2[3]));
        hashMap2.put(10, (Long) tc0.r.get(a2[4]));
        hashMap2.put(9, (Long) tc0.s.get(a2[5]));
        hashMap2.put(7, (Long) um2Var2.get(a2[0]));
        this.b = hashMap2;
        this.c = 2000;
        this.d = tv.a;
        this.e = true;
    }
}
