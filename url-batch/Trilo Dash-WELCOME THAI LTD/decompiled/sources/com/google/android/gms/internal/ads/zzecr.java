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

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzecr implements zzffh {
    protected final Context zza;
    protected final String zzb;
    protected final zzcag zzc;

    public zzecr(Context context, String str, zzcag zzcagVar, int i, byte[] bArr) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzcagVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e6, code lost:
    
        com.google.android.gms.ads.internal.util.zze.zzj("Received error HTTP response code: " + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x020c, code lost:
    
        throw new com.google.android.gms.internal.ads.zzdzk(1, "Received error HTTP response code: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0233 A[Catch: all -> 0x0242, TryCatch #1 {all -> 0x0242, blocks: (B:16:0x0099, B:23:0x0221, B:25:0x0233, B:28:0x0241, B:30:0x009f, B:32:0x00a7, B:33:0x00ac, B:35:0x00b0, B:40:0x00c2, B:44:0x00ca, B:45:0x00cd, B:49:0x00ce, B:50:0x00e6, B:52:0x00ec, B:59:0x0104, B:55:0x010e, B:62:0x0118, B:65:0x011d, B:78:0x0154, B:80:0x0162, B:83:0x0175, B:84:0x017b, B:85:0x017c, B:88:0x0190, B:89:0x0193, B:97:0x019b, B:99:0x01a7, B:108:0x01cc, B:109:0x01d8, B:111:0x01d9, B:112:0x01e5, B:114:0x01e6, B:115:0x020c), top: B:15:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0241 A[Catch: all -> 0x0242, TRY_LEAVE, TryCatch #1 {all -> 0x0242, blocks: (B:16:0x0099, B:23:0x0221, B:25:0x0233, B:28:0x0241, B:30:0x009f, B:32:0x00a7, B:33:0x00ac, B:35:0x00b0, B:40:0x00c2, B:44:0x00ca, B:45:0x00cd, B:49:0x00ce, B:50:0x00e6, B:52:0x00ec, B:59:0x0104, B:55:0x010e, B:62:0x0118, B:65:0x011d, B:78:0x0154, B:80:0x0162, B:83:0x0175, B:84:0x017b, B:85:0x017c, B:88:0x0190, B:89:0x0193, B:97:0x019b, B:99:0x01a7, B:108:0x01cc, B:109:0x01d8, B:111:0x01d9, B:112:0x01e5, B:114:0x01e6, B:115:0x020c), top: B:15:0x0099 }] */
    @Override // com.google.android.gms.internal.ads.zzffh
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzecq zza(zzecp zzecpVar) throws zzdzk {
        int i;
        zzecq zzecqVar;
        InputStreamReader inputStreamReader;
        zzecr zzecrVar = this;
        String str = zzecpVar.zza;
        int i2 = zzecpVar.zzb;
        Map map = zzecpVar.zzc;
        byte[] bArr = zzecpVar.zzd;
        String str2 = zzecpVar.zze;
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
        try {
            zzecq zzecqVar2 = new zzecq();
            com.google.android.gms.ads.internal.util.zze.zzi("SDK version: " + zzecrVar.zzb);
            com.google.android.gms.ads.internal.util.zze.zze("AdRequestServiceImpl: Sending request: " + str);
            URL url = new URL(str);
            HashMap hashMap = new HashMap();
            int i3 = 0;
            while (true) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                try {
                    com.google.android.gms.ads.internal.util.zzs zzp = com.google.android.gms.ads.internal.zzt.zzp();
                    Context context = zzecrVar.zza;
                    String str3 = zzecrVar.zzb;
                    HttpURLConnection httpURLConnection2 = httpURLConnection;
                    zzecq zzecqVar3 = zzecqVar2;
                    i = 1;
                    try {
                        zzp.zze(context, str3, false, httpURLConnection2, false, i2);
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection = httpURLConnection2;
                            try {
                                try {
                                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                    httpURLConnection2 = httpURLConnection;
                                } catch (Throwable th) {
                                    th = th;
                                    httpURLConnection.disconnect();
                                    throw th;
                                }
                            } catch (zzdzk e) {
                                e = e;
                                zzecqVar = zzecqVar3;
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgT)).booleanValue()) {
                                    throw e;
                                }
                                zzecqVar.zzd = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime;
                                httpURLConnection.disconnect();
                                return zzecqVar;
                            }
                        }
                        httpURLConnection = httpURLConnection2;
                        if (!TextUtils.isEmpty(str2)) {
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                        }
                        int length = bArr.length;
                        BufferedOutputStream bufferedOutputStream = null;
                        if (length > 0) {
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            try {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
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
                        zzcfh zzcfhVar = new zzcfh(null);
                        zzcfhVar.zzc(httpURLConnection, bArr);
                        int responseCode = httpURLConnection.getResponseCode();
                        for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                            String key = entry2.getKey();
                            List<String> value = entry2.getValue();
                            if (hashMap.containsKey(key)) {
                                ((List) hashMap.get(key)).addAll(value);
                            } else {
                                hashMap.put(key, new ArrayList(value));
                            }
                        }
                        zzcfhVar.zze(httpURLConnection, responseCode);
                        zzecqVar = zzecqVar3;
                        try {
                            zzecqVar.zza = responseCode;
                            zzecqVar.zzb = hashMap;
                            zzecqVar.zzc = "";
                            if (responseCode >= 200 && responseCode < 300) {
                                try {
                                    inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
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
                                        zzcfhVar.zzg(sb2);
                                        zzecqVar.zzc = sb2;
                                        if (TextUtils.isEmpty(sb2)) {
                                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzev)).booleanValue()) {
                                                throw new zzdzk(3);
                                            }
                                        }
                                        zzecqVar.zzd = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime;
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
                                String headerField = httpURLConnection.getHeaderField("Location");
                                if (TextUtils.isEmpty(headerField)) {
                                    com.google.android.gms.ads.internal.util.zze.zzj("No location header to follow redirect.");
                                    throw new zzdzk(1, "No location header to follow redirect");
                                }
                                URL url2 = new URL(headerField);
                                int i4 = i3 + 1;
                                if (i4 > ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdZ)).intValue()) {
                                    com.google.android.gms.ads.internal.util.zze.zzj("Too many redirects.");
                                    throw new zzdzk(1, "Too many redirects");
                                }
                                try {
                                    httpURLConnection.disconnect();
                                    zzecrVar = this;
                                    i3 = i4;
                                    zzecqVar2 = zzecqVar;
                                    url = url2;
                                } catch (IOException e2) {
                                    e = e2;
                                    String concat = "Error while connecting to ad server: ".concat(String.valueOf(e.getMessage()));
                                    com.google.android.gms.ads.internal.util.zze.zzj(concat);
                                    throw new zzdzk(i, concat, e);
                                }
                            }
                        } catch (zzdzk e3) {
                            e = e3;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgT)).booleanValue()) {
                            }
                        }
                    } catch (zzdzk e4) {
                        e = e4;
                        httpURLConnection = httpURLConnection2;
                    } catch (Throwable th6) {
                        th = th6;
                        httpURLConnection = httpURLConnection2;
                    }
                } catch (zzdzk e5) {
                    e = e5;
                    zzecqVar = zzecqVar2;
                } catch (Throwable th7) {
                    th = th7;
                }
            }
        } catch (IOException e6) {
            e = e6;
            i = 1;
        }
    }
}
