package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import androidx.constraintlayout.solver.widgets.Optimizer;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes2.dex */
public class zzcfn implements zzcfa {
    private final String zza;

    public zzcfn() {
        this.zza = null;
    }

    public zzcfn(String str) {
        this.zza = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0089 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    @Override // com.google.android.gms.internal.ads.zzcfa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean zza(String str) {
        int responseCode;
        boolean isPackageSide;
        boolean z = false;
        try {
            try {
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.setThreadStatsTag(Optimizer.OPTIMIZATION_STANDARD);
                }
                zzcfi.zze("Pinging URL: " + str);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    com.google.android.gms.ads.internal.client.zzaw.zzb();
                    String str2 = this.zza;
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setReadTimeout(60000);
                    if (str2 != null) {
                        httpURLConnection.setRequestProperty("User-Agent", str2);
                    }
                    httpURLConnection.setUseCaches(false);
                    zzcfh zzcfhVar = new zzcfh(null);
                    zzcfhVar.zzc(httpURLConnection, null);
                    responseCode = httpURLConnection.getResponseCode();
                    zzcfhVar.zze(httpURLConnection, responseCode);
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                e = e;
                zzcfi.zzj("Error while pinging URL: " + str + ". " + e.getMessage());
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.clearThreadStatsTag();
                    return false;
                }
            } catch (IndexOutOfBoundsException e2) {
                zzcfi.zzj("Error while parsing ping URL: " + str + ". " + e2.getMessage());
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.clearThreadStatsTag();
                    return false;
                }
            } catch (RuntimeException e3) {
                e = e3;
                zzcfi.zzj("Error while pinging URL: " + str + ". " + e.getMessage());
                if (ClientLibraryUtils.isPackageSide()) {
                }
            }
            if (responseCode >= 200 && responseCode < 300) {
                z = true;
                if (isPackageSide) {
                    return z;
                }
                return z;
            }
            zzcfi.zzj("Received non-success response code " + responseCode + " from pinging URL: " + str);
            return z;
        } finally {
            if (ClientLibraryUtils.isPackageSide()) {
                TrafficStats.clearThreadStatsTag();
            }
        }
    }
}
