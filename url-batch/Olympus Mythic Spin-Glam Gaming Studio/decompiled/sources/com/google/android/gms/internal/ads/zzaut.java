package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import com.ironsource.C4701ic;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzaut extends zzaug {
    public zzaut() {
        throw null;
    }

    public zzaut(zzaus zzausVar, SSLSocketFactory sSLSocketFactory) {
    }

    @VisibleForTesting
    static List zzb(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new zzatk((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzauq zza(zzats zzatsVar, Map map) throws IOException, zzata {
        String zzh = zzatsVar.zzh();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(zzatsVar.zzm());
        URL url = new URL(zzh);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int zzo = zzatsVar.zzo();
        httpURLConnection.setConnectTimeout(zzo);
        httpURLConnection.setReadTimeout(zzo);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        url.getProtocol();
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            if (zzatsVar.zza() != 0) {
                httpURLConnection.setRequestMethod("POST");
                byte[] zzn = zzatsVar.zzn();
                if (zzn != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(AdMobNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
                    dataOutputStream.write(zzn);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod(C4701ic.a);
            }
            int httpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
            if (httpUrlConnectionGetResponseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            zzatsVar.zza();
            if ((httpUrlConnectionGetResponseCode >= 100 && httpUrlConnectionGetResponseCode < 200) || httpUrlConnectionGetResponseCode == 204 || httpUrlConnectionGetResponseCode == 304) {
                zzauq zzauqVar = new zzauq(httpUrlConnectionGetResponseCode, zzb(httpURLConnection.getHeaderFields()), -1, null);
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                return zzauqVar;
            }
            try {
                return new zzauq(httpUrlConnectionGetResponseCode, zzb(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new zzaur(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
