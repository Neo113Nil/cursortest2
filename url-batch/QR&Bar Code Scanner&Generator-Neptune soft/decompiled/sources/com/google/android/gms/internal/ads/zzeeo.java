package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeeo implements zzfhk {
    protected final Context zza;
    protected final String zzb;
    protected final zzcbo zzc;

    public zzeeo(Context context, String str, zzcbo zzcboVar, int i, byte[] bArr) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzcboVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e6, code lost:
    
        com.google.android.gms.ads.internal.util.zze.zzj("Received error HTTP response code: " + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x020c, code lost:
    
        throw new com.google.android.gms.internal.ads.zzebh(r1 == true ? 1 : 0, "Received error HTTP response code: " + r6);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0233 A[Catch: all -> 0x0242, TryCatch #1 {all -> 0x0242, blocks: (B:16:0x0099, B:23:0x0221, B:25:0x0233, B:28:0x0241, B:30:0x009f, B:32:0x00a7, B:33:0x00ac, B:35:0x00b0, B:40:0x00c2, B:44:0x00ca, B:45:0x00cd, B:49:0x00ce, B:50:0x00e6, B:52:0x00ec, B:59:0x0104, B:55:0x010e, B:62:0x0118, B:65:0x011d, B:78:0x0154, B:80:0x0162, B:83:0x0175, B:84:0x017b, B:85:0x017c, B:88:0x0190, B:89:0x0193, B:97:0x019b, B:99:0x01a7, B:108:0x01cc, B:109:0x01d8, B:111:0x01d9, B:112:0x01e5, B:114:0x01e6, B:115:0x020c), top: B:15:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0241 A[Catch: all -> 0x0242, TRY_LEAVE, TryCatch #1 {all -> 0x0242, blocks: (B:16:0x0099, B:23:0x0221, B:25:0x0233, B:28:0x0241, B:30:0x009f, B:32:0x00a7, B:33:0x00ac, B:35:0x00b0, B:40:0x00c2, B:44:0x00ca, B:45:0x00cd, B:49:0x00ce, B:50:0x00e6, B:52:0x00ec, B:59:0x0104, B:55:0x010e, B:62:0x0118, B:65:0x011d, B:78:0x0154, B:80:0x0162, B:83:0x0175, B:84:0x017b, B:85:0x017c, B:88:0x0190, B:89:0x0193, B:97:0x019b, B:99:0x01a7, B:108:0x01cc, B:109:0x01d8, B:111:0x01d9, B:112:0x01e5, B:114:0x01e6, B:115:0x020c), top: B:15:0x0099 }] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.android.gms.internal.ads.zzcgo] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.net.HttpURLConnection] */
    @Override // com.google.android.gms.internal.ads.zzfhk
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzeen zza(zzeem zzeemVar) throws zzebh {
        ?? r1;
        zzeen zzeenVar;
        HttpURLConnection httpURLConnection;
        InputStreamReader inputStreamReader;
        zzeeo zzeeoVar = this;
        String str = zzeemVar.zza;
        int i = zzeemVar.zzb;
        Map map = zzeemVar.zzc;
        byte[] bArr = zzeemVar.zzd;
        String str2 = zzeemVar.zze;
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        boolean z = true;
        try {
            zzeen zzeenVar2 = new zzeen();
            com.google.android.gms.ads.internal.util.zze.zzi("SDK version: " + zzeeoVar.zzb);
            com.google.android.gms.ads.internal.util.zze.zze("AdRequestServiceImpl: Sending request: " + str);
            URL url = new URL(str);
            HashMap hashMap = new HashMap();
            int i2 = 0;
            while (true) {
                ?? r7 = (HttpURLConnection) url.openConnection();
                try {
                    com.google.android.gms.ads.internal.util.zzs zzp = com.google.android.gms.ads.internal.zzt.zzp();
                    Context context = zzeeoVar.zza;
                    String str3 = zzeeoVar.zzb;
                    HttpURLConnection httpURLConnection2 = r7;
                    zzeen zzeenVar3 = zzeenVar2;
                    r1 = z;
                    try {
                        zzp.zze(context, str3, false, httpURLConnection2, false, i);
                        for (Map.Entry entry : map.entrySet()) {
                            r7 = httpURLConnection2;
                            try {
                                try {
                                    r7.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                    httpURLConnection2 = r7;
                                } catch (Throwable th) {
                                    th = th;
                                    r7.disconnect();
                                    throw th;
                                }
                            } catch (zzebh e) {
                                e = e;
                                zzeenVar = zzeenVar3;
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhg)).booleanValue()) {
                                }
                            }
                        }
                        r7 = httpURLConnection2;
                        if (!TextUtils.isEmpty(str2)) {
                            r7.setRequestProperty("Content-Type", str2);
                        }
                        int length = bArr.length;
                        BufferedOutputStream bufferedOutputStream = null;
                        if (length > 0) {
                            r7.setDoOutput(r1);
                            r7.setFixedLengthStreamingMode(length);
                            try {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(r7.getOutputStream());
                                try {
                                    bufferedOutputStream2.write(bArr);
                                    IOUtils.closeQuietly(bufferedOutputStream2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    IOUtils.closeQuietly(bufferedOutputStream);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        ?? zzcgoVar = new zzcgo(null);
                        zzcgoVar.zzc(r7, bArr);
                        int responseCode = r7.getResponseCode();
                        for (Map.Entry<String, List<String>> entry2 : r7.getHeaderFields().entrySet()) {
                            String key = entry2.getKey();
                            List<String> value = entry2.getValue();
                            if (hashMap.containsKey(key)) {
                                ((List) hashMap.get(key)).addAll(value);
                            } else {
                                hashMap.put(key, new ArrayList(value));
                            }
                        }
                        zzcgoVar.zze(r7, responseCode);
                        zzeenVar = zzeenVar3;
                        try {
                            zzeenVar.zza = responseCode;
                            zzeenVar.zzb = hashMap;
                            zzeenVar.zzc = "";
                            if (responseCode >= 200 && responseCode < 300) {
                                try {
                                    inputStreamReader = new InputStreamReader(r7.getInputStream());
                                    try {
                                        com.google.android.gms.ads.internal.zzt.zzp();
                                        StringBuilder sb = new StringBuilder(8192);
                                        char[] cArr = new char[2048];
                                        while (true) {
                                            int read = inputStreamReader.read(cArr);
                                            if (read == -1) {
                                                break;
                                            }
                                            sb.append(cArr, 0, read);
                                        }
                                        String sb2 = sb.toString();
                                        IOUtils.closeQuietly(inputStreamReader);
                                        zzcgoVar.zzg(sb2);
                                        zzeenVar.zzc = sb2;
                                        if (TextUtils.isEmpty(sb2)) {
                                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeC)).booleanValue()) {
                                                throw new zzebh(3);
                                            }
                                        }
                                        zzeenVar.zzd = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime;
                                        httpURLConnection = r7;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        IOUtils.closeQuietly(inputStreamReader);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    inputStreamReader = null;
                                }
                            } else {
                                if (responseCode < 300 || responseCode >= 400) {
                                    break;
                                }
                                String headerField = r7.getHeaderField("Location");
                                if (TextUtils.isEmpty(headerField)) {
                                    com.google.android.gms.ads.internal.util.zze.zzj("No location header to follow redirect.");
                                    throw new zzebh(r1 == true ? 1 : 0, "No location header to follow redirect");
                                }
                                URL url2 = new URL(headerField);
                                int i3 = i2 + 1;
                                if (i3 > ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzef)).intValue()) {
                                    com.google.android.gms.ads.internal.util.zze.zzj("Too many redirects.");
                                    throw new zzebh(r1 == true ? 1 : 0, "Too many redirects");
                                }
                                try {
                                    r7.disconnect();
                                    z = r1 == true ? 1 : 0;
                                    i2 = i3;
                                    zzeenVar2 = zzeenVar;
                                    url = url2;
                                    zzeeoVar = this;
                                } catch (IOException e2) {
                                    e = e2;
                                    String concat = "Error while connecting to ad server: ".concat(String.valueOf(e.getMessage()));
                                    com.google.android.gms.ads.internal.util.zze.zzj(concat);
                                    throw new zzebh(r1, concat, e);
                                }
                            }
                        } catch (zzebh e3) {
                            e = e3;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhg)).booleanValue()) {
                                throw e;
                            }
                            zzeenVar.zzd = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime;
                            httpURLConnection = r7;
                            httpURLConnection.disconnect();
                            return zzeenVar;
                        }
                    } catch (zzebh e4) {
                        e = e4;
                        r7 = httpURLConnection2;
                    } catch (Throwable th6) {
                        th = th6;
                        r7 = httpURLConnection2;
                    }
                } catch (zzebh e5) {
                    e = e5;
                    zzeenVar = zzeenVar2;
                } catch (Throwable th7) {
                    th = th7;
                }
            }
        } catch (IOException e6) {
            e = e6;
            r1 = z;
        }
    }
}
