package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import android.net.TrafficStats;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzfqt;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes4.dex */
public final class zzu implements zze {
    private final Context zza;
    private final String zzb;
    private String zzc;

    public zzu(Context context, String str) {
        this.zza = context;
        this.zzb = str;
    }

    private final URL zzc(String str) throws MalformedURLException {
        URL url = null;
        try {
            url = new URI(str).toURL();
        } catch (IllegalArgumentException e) {
            e = e;
            zze(str, e);
        } catch (MalformedURLException e2) {
            e = e2;
            zze(str, e);
        } catch (URISyntaxException e3) {
            zze(str, e3);
            if (((Boolean) zzbd.zzc().zzd(zzbci.zze)).booleanValue()) {
                url = zzd(str);
            }
        }
        if (url != null) {
            return url;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
        sb.append("Falling back to direct new URL(\"");
        sb.append(str);
        sb.append("\") constructor.");
        zzo.zzd(sb.toString());
        return new URL(str);
    }

    private final URL zzd(String str) {
        URL url;
        URI uri;
        try {
            zzo.zzd("Attempting to parse components, encode, and reconstruct URI.");
            URL url2 = new URL(str);
            uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
            url = uri.toURL();
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e) {
            e = e;
            url = null;
        }
        try {
            String obj = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 114 + obj.length());
            sb.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
            sb.append(str);
            sb.append("\" -> encoded URI: ");
            sb.append(obj);
            zzo.zzd(sb.toString());
            return url;
        } catch (IllegalArgumentException e2) {
            e = e2;
            zze(str, e);
            return url;
        } catch (MalformedURLException e3) {
            e = e3;
            zze(str, e);
            return url;
        } catch (URISyntaxException e4) {
            e = e4;
            zze(str, e);
            return url;
        }
    }

    private final void zze(String str, Throwable th) {
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message).length());
        sb.append("Error while parsing ping URL: ");
        sb.append(str);
        sb.append(". ");
        sb.append(message);
        zzo.zzi(sb.toString());
        zzbtt.zza(this.zza).zzi(th, "HttpUrlPinger.pingUrl", ((Integer) zzbd.zzc().zzd(zzbci.zznA)).intValue() / 100.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0111, code lost:
    
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cd A[RETURN] */
    @Override // com.google.android.gms.ads.internal.util.client.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzt zza(String str) {
        HttpURLConnection httpURLConnection;
        int responseCode;
        zzt zztVar = zzt.PERMANENT_FAILURE;
        try {
            try {
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.setThreadStatsTag(263);
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
                sb.append("Pinging URL: ");
                sb.append(str);
                zzo.zzd(sb.toString());
                URL zzc = zzc(str);
                int i = zzfqt.zzb;
                httpURLConnection = (HttpURLConnection) zzc.openConnection();
                try {
                    zzbb.zza();
                    String str2 = this.zzb;
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setReadTimeout(60000);
                    if (str2 != null) {
                        httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, str2);
                    }
                    httpURLConnection.setUseCaches(false);
                    zzl zzlVar = new zzl(null);
                    zzlVar.zza(httpURLConnection, null);
                    responseCode = httpURLConnection.getResponseCode();
                    zzlVar.zzc(httpURLConnection, responseCode);
                } finally {
                    httpURLConnection.disconnect();
                }
            } finally {
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.clearThreadStatsTag();
                }
            }
        } catch (IOException e) {
            e = e;
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
            sb2.append("Error while pinging URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            zzo.zzi(sb2.toString());
            zztVar = zzt.RETRIABLE_FAILURE;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            zze(str, e);
        } catch (RuntimeException e3) {
            e = e3;
            String message2 = e.getMessage();
            StringBuilder sb22 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message2).length());
            sb22.append("Error while pinging URL: ");
            sb22.append(str);
            sb22.append(". ");
            sb22.append(message2);
            zzo.zzi(sb22.toString());
            zztVar = zzt.RETRIABLE_FAILURE;
        } catch (MalformedURLException e4) {
            e = e4;
            zze(str, e);
        }
        if (responseCode >= 200 && responseCode < 300) {
            if (((Boolean) zzbd.zzc().zzd(zzbci.zziB)).booleanValue()) {
                this.zzc = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
            }
            zztVar = zzt.SUCCESS;
            if (!ClientLibraryUtils.isPackageSide()) {
                return zztVar;
            }
            return zztVar;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(responseCode).length() + 54 + String.valueOf(str).length());
        sb3.append("Received non-success response code ");
        sb3.append(responseCode);
        sb3.append(" from pinging URL: ");
        sb3.append(str);
        zzo.zzi(sb3.toString());
        if (responseCode == 502) {
            zztVar = zzt.RETRIABLE_FAILURE;
        }
        if (!ClientLibraryUtils.isPackageSide()) {
        }
        return zztVar;
    }

    public final String zzb() {
        return this.zzc;
    }
}
