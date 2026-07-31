package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.IOUtils;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import io.bidmachine.util.network.NetworkUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes12.dex */
public final class zzejk implements zzfpi {
    protected final Context zza;
    protected final String zzb;

    @Nullable
    private final String zzc;

    public zzejk(Context context, String str, zzccd zzccdVar, int i, @Nullable String str2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzejj zza(zzeji zzejiVar) throws zzefb {
        return zzc(zzejiVar.zza, zzejiVar.zzb, zzejiVar.zzc, zzejiVar.zzd, zzejiVar.zze, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0244, code lost:
    
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r4.append("Received error HTTP response code: ");
        r4.append(r0);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(r4.toString());
        r8 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r8.append("Received error HTTP response code: ");
        r8.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x027e, code lost:
    
        throw new com.google.android.gms.internal.ads.zzefb(1, r8.toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.io.BufferedOutputStream, java.io.Closeable, java.io.OutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final zzejj zzc(String str, int i, Map map, byte[] bArr, String str2, long j) throws zzefb {
        HttpURLConnection httpURLConnection;
        URL url;
        try {
            zzejj zzejjVar = new zzejj();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdn)).booleanValue() && com.google.android.gms.ads.internal.client.zzay.zze()) {
                zzejjVar.zza = 410;
            } else {
                String str3 = this.zzb;
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 13);
                sb.append("SDK version: ");
                sb.append(str3);
                String sb2 = sb.toString();
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh(sb2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 39);
                sb3.append("AdRequestServiceImpl: Sending request: ");
                sb3.append(str);
                com.google.android.gms.ads.internal.util.client.zzo.zzd(sb3.toString());
                URL url2 = new URL(str);
                HashMap hashMap = new HashMap();
                int i3 = 0;
                while (true) {
                    int i4 = zzgat.zzb;
                    httpURLConnection = (HttpURLConnection) url2.openConnection();
                    String str4 = this.zzc;
                    if (str4 != null) {
                        httpURLConnection.setRequestMethod(str4);
                    }
                    try {
                        try {
                            com.google.android.gms.ads.internal.zzt.zzc().zzb(this.zza, str3, false, httpURLConnection, false, i);
                            for (Map.Entry entry : map.entrySet()) {
                                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                httpURLConnection.setRequestProperty("Content-Type", str2);
                            }
                            InputStreamReader inputStreamReader = null;
                            com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                            try {
                                zzlVar.zza(httpURLConnection, bArr);
                            } catch (Throwable th) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzg("Network request logging failed.", th);
                                com.google.android.gms.ads.internal.zzt.zzh().zzi(th, "HttpRequestFunction.logAdRequest");
                            }
                            int length = bArr.length;
                            if (length > 0) {
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setFixedLengthStreamingMode(length);
                                try {
                                    ?? bufferedOutputStream = new BufferedOutputStream(AdMobNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
                                    try {
                                        bufferedOutputStream.write(bArr);
                                        IOUtils.closeQuietly((Closeable) bufferedOutputStream);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        inputStreamReader = bufferedOutputStream;
                                        IOUtils.closeQuietly(inputStreamReader);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                            int httpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                            for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                                String key = entry2.getKey();
                                List<String> value = entry2.getValue();
                                if (hashMap.containsKey(key)) {
                                    ((List) hashMap.get(key)).addAll(value);
                                } else {
                                    hashMap.put(key, new ArrayList(value));
                                }
                            }
                            zzlVar.zzc(httpURLConnection, httpUrlConnectionGetResponseCode);
                            zzejjVar.zza = httpUrlConnectionGetResponseCode;
                            zzejjVar.zzb = hashMap;
                            zzejjVar.zzc = "";
                            if (httpUrlConnectionGetResponseCode >= 200 && httpUrlConnectionGetResponseCode < 300) {
                                try {
                                    InputStreamReader inputStreamReader2 = new InputStreamReader(AdMobNetworkBridge.urlConnectionGetInputStream(httpURLConnection));
                                    try {
                                        com.google.android.gms.ads.internal.zzt.zzc();
                                        StringBuilder sb4 = new StringBuilder(8192);
                                        char[] cArr = new char[2048];
                                        while (true) {
                                            int read = inputStreamReader2.read(cArr);
                                            if (read == -1) {
                                                break;
                                            }
                                            sb4.append(cArr, 0, read);
                                        }
                                        String sb5 = sb4.toString();
                                        IOUtils.closeQuietly(inputStreamReader2);
                                        zzlVar.zze(sb5);
                                        zzejjVar.zzc = sb5;
                                        if (TextUtils.isEmpty(sb5)) {
                                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgG)).booleanValue()) {
                                                throw new zzefb(3);
                                            }
                                        }
                                        zzejjVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        inputStreamReader = inputStreamReader2;
                                        IOUtils.closeQuietly(inputStreamReader);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } else {
                                if (httpUrlConnectionGetResponseCode < 300 || httpUrlConnectionGetResponseCode >= 400) {
                                    break;
                                }
                                String headerField = httpURLConnection.getHeaderField(NetworkUtils.HEADER_LOCATION);
                                if (TextUtils.isEmpty(headerField)) {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("No location header to follow redirect.");
                                    throw new zzefb(1, "No location header to follow redirect");
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjc)).booleanValue()) {
                                    try {
                                        url = new URI(headerField).toURL();
                                    } catch (URISyntaxException e) {
                                        throw new zzefb(1, e.getMessage(), e);
                                    }
                                } else {
                                    url = new URL(headerField);
                                }
                                int i5 = i3 + 1;
                                if (i5 > ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgp)).intValue()) {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Too many redirects.");
                                    throw new zzefb(1, "Too many redirects");
                                }
                                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                i3 = i5;
                                url2 = url;
                            }
                        } catch (zzefb e2) {
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjI)).booleanValue()) {
                                throw e2;
                            }
                            zzejjVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j;
                        }
                    } catch (Throwable th6) {
                        AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                        throw th6;
                    }
                }
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            }
            return zzejjVar;
        } catch (IOException e3) {
            String valueOf = String.valueOf(e3.getMessage());
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            String concat = "Error while connecting to ad server: ".concat(valueOf);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
            throw new zzefb(1, concat, e3);
        }
    }
}
