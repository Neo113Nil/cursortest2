package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import android.net.TrafficStats;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzgat;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzu implements zze {
    private final Context zza;

    @Nullable
    private final String zzb;

    @Nullable
    private String zzc;

    public zzu(Context context, @Nullable String str) {
        this.zza = context;
        this.zzb = str;
    }

    private final URL zzd(String str) throws MalformedURLException {
        URL url = null;
        try {
            url = new URI(str).toURL();
        } catch (IllegalArgumentException e) {
            e = e;
            zzf(str, e);
        } catch (MalformedURLException e2) {
            e = e2;
            zzf(str, e);
        } catch (URISyntaxException e3) {
            zzf(str, e3);
            if (((Boolean) zzba.zzc().zzd(zzbjg.zzf)).booleanValue()) {
                url = zze(str);
            }
        }
        if (url != null) {
            return url;
        }
        StringBuilder sb = new StringBuilder(str.length() + 47);
        sb.append("Falling back to direct new URL(\"");
        sb.append(str);
        sb.append("\") constructor.");
        zzo.zzd(sb.toString());
        return new URL(str);
    }

    @Nullable
    private final URL zze(String str) {
        URL url;
        try {
            zzo.zzd("Attempting to parse components, encode, and reconstruct URI.");
            URL url2 = new URL(str);
            URI uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
            url = uri.toURL();
            try {
                String obj = uri.toString();
                StringBuilder sb = new StringBuilder(str.length() + 114 + obj.length());
                sb.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
                sb.append(str);
                sb.append("\" -> encoded URI: ");
                sb.append(obj);
                zzo.zzd(sb.toString());
            } catch (IllegalArgumentException e) {
                e = e;
                zzf(str, e);
                return url;
            } catch (MalformedURLException e2) {
                e = e2;
                zzf(str, e);
                return url;
            } catch (URISyntaxException e3) {
                e = e3;
                zzf(str, e);
                return url;
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e4) {
            e = e4;
            url = null;
        }
        return url;
    }

    private final void zzf(String str, Throwable th) {
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb.append("Error while parsing ping URL: ");
        sb.append(str);
        sb.append(". ");
        sb.append(message);
        zzo.zzi(sb.toString());
        zzcaq.zza(this.zza).zzi(th, "HttpUrlPinger.pingUrl", ((Integer) zzba.zzc().zzd(zzbjg.zzou)).intValue() / 100.0f);
    }

    @Override // com.google.android.gms.ads.internal.util.client.zze
    @WorkerThread
    public final zzt zza(String str) {
        return zzc(str, null);
    }

    @Nullable
    public final String zzb() {
        return this.zzc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x012a, code lost:
    
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0175, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0172, code lost:
    
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0166, code lost:
    
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0170, code lost:
    
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() != false) goto L63;
     */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzt zzc(String str, @Nullable Map map) {
        zzt zztVar = zzt.PERMANENT_FAILURE;
        if (str != null) {
            if (!((Boolean) zzba.zzc().zzd(zzbjg.zzg)).booleanValue() || !str.isEmpty()) {
                if (!((Boolean) zzba.zzc().zzd(zzbjg.zzdn)).booleanValue() || !zzay.zze()) {
                    try {
                        try {
                            if (ClientLibraryUtils.isPackageSide()) {
                                TrafficStats.setThreadStatsTag(263);
                            }
                            StringBuilder sb = new StringBuilder(str.length() + 13);
                            sb.append("Pinging URL: ");
                            sb.append(str);
                            zzo.zzd(sb.toString());
                            URL zzd = zzd(str);
                            int i = zzgat.zzb;
                            HttpURLConnection httpURLConnection = (HttpURLConnection) zzd.openConnection();
                            try {
                                zzay.zza();
                                String str2 = this.zzb;
                                httpURLConnection.setConnectTimeout(60000);
                                httpURLConnection.setInstanceFollowRedirects(true);
                                httpURLConnection.setReadTimeout(60000);
                                if (str2 != null) {
                                    httpURLConnection.setRequestProperty("User-Agent", str2);
                                }
                                httpURLConnection.setUseCaches(false);
                                if (map != null) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                    }
                                }
                                zzl zzlVar = new zzl(null);
                                zzlVar.zza(httpURLConnection, null);
                                int httpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                                zzlVar.zzc(httpURLConnection, httpUrlConnectionGetResponseCode);
                                if (httpUrlConnectionGetResponseCode >= 200 && httpUrlConnectionGetResponseCode < 300) {
                                    if (((Boolean) zzba.zzc().zzd(zzbjg.zzje)).booleanValue()) {
                                        this.zzc = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                                    }
                                    zztVar = zzt.SUCCESS;
                                    AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                }
                                StringBuilder sb2 = new StringBuilder(String.valueOf(httpUrlConnectionGetResponseCode).length() + 54 + str.length());
                                sb2.append("Received non-success response code ");
                                sb2.append(httpUrlConnectionGetResponseCode);
                                sb2.append(" from pinging URL: ");
                                sb2.append(str);
                                zzo.zzi(sb2.toString());
                                if (httpUrlConnectionGetResponseCode == 502) {
                                    zztVar = zzt.RETRIABLE_FAILURE;
                                }
                                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                            } catch (Throwable th) {
                                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            if (ClientLibraryUtils.isPackageSide()) {
                                TrafficStats.clearThreadStatsTag();
                            }
                            throw th2;
                        }
                    } catch (IOException e) {
                        e = e;
                        String message = e.getMessage();
                        StringBuilder sb3 = new StringBuilder(str.length() + 27 + String.valueOf(message).length());
                        sb3.append("Error while pinging URL: ");
                        sb3.append(str);
                        sb3.append(". ");
                        sb3.append(message);
                        zzo.zzi(sb3.toString());
                        zztVar = zzt.RETRIABLE_FAILURE;
                    } catch (IndexOutOfBoundsException e2) {
                        e = e2;
                        zzf(str, e);
                    } catch (RuntimeException e3) {
                        e = e3;
                        String message2 = e.getMessage();
                        StringBuilder sb32 = new StringBuilder(str.length() + 27 + String.valueOf(message2).length());
                        sb32.append("Error while pinging URL: ");
                        sb32.append(str);
                        sb32.append(". ");
                        sb32.append(message2);
                        zzo.zzi(sb32.toString());
                        zztVar = zzt.RETRIABLE_FAILURE;
                    } catch (MalformedURLException e4) {
                        e = e4;
                        zzf(str, e);
                    }
                }
            }
        }
        return zztVar;
    }
}
