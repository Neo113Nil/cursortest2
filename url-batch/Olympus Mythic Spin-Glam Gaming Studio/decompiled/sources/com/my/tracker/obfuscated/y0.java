package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.s0;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.net.InetAddress;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class y0 {
    boolean a = false;
    private x0 b = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        x2.a("Ipv4DataProvider: get IPv4 address");
        try {
            s0.b a = s0.a(okHttpClientProvider).a(str);
            if (!a.c()) {
                x2.a("Ipv4DataProvider: unsuccessful response from server: " + a.a());
                return;
            }
            String str2 = (String) a.b();
            if (TextUtils.isEmpty(str2)) {
                x2.a("Ipv4DataProvider: empty response from server");
                return;
            }
            String optString = new JSONObject(str2).optString(POBConstants.KEY_IP);
            if (TextUtils.isEmpty(optString)) {
                x2.a("Ipv4DataProvider: IP is empty");
                return;
            }
            x2.a("Ipv4DataProvider: IPv4 address is received " + optString);
            this.b = new x0(InetAddress.getByName(optString).getAddress());
        } catch (Throwable th) {
            x2.b("Ipv4DataProvider: failed to get IPv4 address", th);
        }
    }

    public x0 a(final String str, final MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        if (!this.a) {
            this.a = true;
            m.b(new Runnable() { // from class: com.my.tracker.obfuscated.y0$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    y0.this.b(str, okHttpClientProvider);
                }
            });
        }
        return this.b;
    }
}
