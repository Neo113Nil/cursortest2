package com.google.android.gms.ads.identifier;

import android.util.Log;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.ads_identifier.zzh;
import com.google.android.gms.internal.ads_identifier.zzk;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@18.2.0 */
/* loaded from: classes6.dex */
public final class zze {
    @WorkerThread
    public static final void zza(String str) {
        try {
            try {
                zzk.zzb(263);
                URL url = new URL(str);
                int i = zzh.zzb;
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                try {
                    int httpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                    if (httpUrlConnectionGetResponseCode < 200 || httpUrlConnectionGetResponseCode >= 300) {
                        Log.w("HttpUrlPinger", "Received non-success response code " + httpUrlConnectionGetResponseCode + " from pinging URL: " + str);
                    }
                    zzk.zza();
                } finally {
                    AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                }
            } catch (Throwable th) {
                zzk.zza();
                throw th;
            }
        } catch (IOException e) {
            e = e;
            Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
            zzk.zza();
        } catch (IndexOutOfBoundsException e2) {
            Log.w("HttpUrlPinger", "Error while parsing ping URL: " + str + ". " + e2.getMessage(), e2);
            zzk.zza();
        } catch (RuntimeException e3) {
            e = e3;
            Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
            zzk.zza();
        }
    }
}
