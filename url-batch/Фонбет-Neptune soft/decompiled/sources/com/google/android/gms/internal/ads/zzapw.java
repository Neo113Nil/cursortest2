package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.webkit.ProxyConfig;
import com.google.common.net.HttpHeaders;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzapw implements zzapa {
    protected final zzapy zza = new zzapy(4096);

    public zzapw(zzapv zzapvVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x02b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d5  */
    @Override // com.google.android.gms.internal.ads.zzapa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzapd zza(zzaph zzaphVar) throws zzapq {
        zzaqf zzaqfVar;
        byte[] bArr;
        zzaqk zzaqkVar;
        zzaqk zzaqkVar2;
        int zzb;
        String str;
        zzapq zzapqVar;
        String str2;
        Map map;
        byte[] bArr2;
        byte[] bArr3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            boolean z = true;
            try {
                zzaoq zzd = zzaphVar.zzd();
                if (zzd == null) {
                    map = Collections.emptyMap();
                } else {
                    HashMap hashMap = new HashMap();
                    String str3 = zzd.zzb;
                    if (str3 != null) {
                        hashMap.put(HttpHeaders.IF_NONE_MATCH, str3);
                    }
                    long j = zzd.zzd;
                    if (j > 0) {
                        hashMap.put(HttpHeaders.IF_MODIFIED_SINCE, zzaqe.zzc(j));
                    }
                    map = hashMap;
                }
                String zzk = zzaphVar.zzk();
                HashMap hashMap2 = new HashMap();
                hashMap2.putAll(map);
                hashMap2.putAll(zzaphVar.zzl());
                URL url = new URL(zzk);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
                int zzb2 = zzaphVar.zzb();
                httpURLConnection.setConnectTimeout(zzb2);
                httpURLConnection.setReadTimeout(zzb2);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                ProxyConfig.MATCH_HTTPS.equals(url.getProtocol());
                try {
                    for (String str4 : hashMap2.keySet()) {
                        httpURLConnection.setRequestProperty(str4, (String) hashMap2.get(str4));
                    }
                    if (zzaphVar.zza() != 0) {
                        httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
                        byte[] zzx = zzaphVar.zzx();
                        if (zzx != null) {
                            httpURLConnection.setDoOutput(true);
                            if (!httpURLConnection.getRequestProperties().containsKey(HttpHeaders.CONTENT_TYPE)) {
                                httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded; charset=UTF-8");
                            }
                            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                            dataOutputStream.write(zzx);
                            dataOutputStream.close();
                        }
                    } else {
                        httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == -1) {
                        try {
                            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (!z) {
                            }
                            throw th;
                        }
                    }
                    zzaphVar.zza();
                    if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                        zzaqfVar = new zzaqf(responseCode, zzaqi.zza(httpURLConnection.getHeaderFields()), -1, null);
                        httpURLConnection.disconnect();
                    } else {
                        try {
                            zzaqfVar = new zzaqf(responseCode, zzaqi.zza(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new zzaqg(httpURLConnection));
                        } catch (Throwable th2) {
                            th = th2;
                            if (!z) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (IOException e) {
                                    e = e;
                                    zzaqfVar = null;
                                    bArr = null;
                                    if (e instanceof SocketTimeoutException) {
                                        zzaqkVar = new zzaqk("socket", new zzapp(), null);
                                    } else {
                                        if (e instanceof MalformedURLException) {
                                            throw new RuntimeException("Bad URL ".concat(String.valueOf(zzaphVar.zzk())), e);
                                        }
                                        if (zzaqfVar == null) {
                                            throw new zzape(e);
                                        }
                                        int zzb3 = zzaqfVar.zzb();
                                        zzapt.zzb("Unexpected response code %d for %s", Integer.valueOf(zzb3), zzaphVar.zzk());
                                        if (bArr != null) {
                                            zzapd zzapdVar = new zzapd(zzb3, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzaqfVar.zzd());
                                            if (zzb3 != 401 && zzb3 != 403) {
                                                if (zzb3 < 400 || zzb3 > 499) {
                                                    throw new zzapo(zzapdVar);
                                                }
                                                throw new zzaou(zzapdVar);
                                            }
                                            zzaqkVar = new zzaqk("auth", new zzaop(zzapdVar), null);
                                        } else {
                                            zzaqkVar = new zzaqk("network", new zzapc(), null);
                                        }
                                    }
                                    zzaqkVar2 = zzaqkVar;
                                    zzaov zzy = zzaphVar.zzy();
                                    zzb = zzaphVar.zzb();
                                    try {
                                        zzapqVar = zzaqkVar2.zzb;
                                        zzy.zzc(zzapqVar);
                                        str2 = zzaqkVar2.zza;
                                        zzaphVar.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
                                    } catch (zzapq e2) {
                                        str = zzaqkVar2.zza;
                                        zzaphVar.zzm(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(zzb)));
                                        throw e2;
                                    }
                                }
                            }
                            throw th;
                        }
                    }
                    try {
                        int zzb4 = zzaqfVar.zzb();
                        List zzd2 = zzaqfVar.zzd();
                        if (zzb4 == 304) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            zzaoq zzd3 = zzaphVar.zzd();
                            if (zzd3 == null) {
                                return new zzapd(304, (byte[]) null, true, elapsedRealtime2, zzd2);
                            }
                            TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                            if (!zzd2.isEmpty()) {
                                Iterator it = zzd2.iterator();
                                while (it.hasNext()) {
                                    treeSet.add(((zzaoz) it.next()).zza());
                                }
                            }
                            ArrayList arrayList = new ArrayList(zzd2);
                            List list = zzd3.zzh;
                            if (list != null) {
                                if (!list.isEmpty()) {
                                    for (zzaoz zzaozVar : zzd3.zzh) {
                                        if (!treeSet.contains(zzaozVar.zza())) {
                                            arrayList.add(zzaozVar);
                                        }
                                    }
                                }
                            } else if (!zzd3.zzg.isEmpty()) {
                                for (Map.Entry entry : zzd3.zzg.entrySet()) {
                                    if (!treeSet.contains(entry.getKey())) {
                                        arrayList.add(new zzaoz((String) entry.getKey(), (String) entry.getValue()));
                                    }
                                }
                            }
                            return new zzapd(304, zzd3.zza, true, elapsedRealtime2, (List) arrayList);
                        }
                        InputStream zzc = zzaqfVar.zzc();
                        if (zzc != null) {
                            int zza = zzaqfVar.zza();
                            try {
                                zzapy zzapyVar = this.zza;
                                zzaql zzaqlVar = new zzaql(zzapyVar, zza);
                                try {
                                    bArr3 = zzapyVar.zzb(1024);
                                    while (true) {
                                        try {
                                            int read = zzc.read(bArr3);
                                            if (read == -1) {
                                                break;
                                            }
                                            zzaqlVar.write(bArr3, 0, read);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                zzc.close();
                                            } catch (IOException unused) {
                                                zzapt.zzd("Error occurred when closing InputStream", new Object[0]);
                                            }
                                            zzapyVar.zza(bArr3);
                                            zzaqlVar.close();
                                            throw th;
                                        }
                                    }
                                    bArr2 = zzaqlVar.toByteArray();
                                    try {
                                        zzc.close();
                                    } catch (IOException unused2) {
                                        zzapt.zzd("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    zzapyVar.zza(bArr3);
                                    zzaqlVar.close();
                                } catch (Throwable th4) {
                                    th = th4;
                                    bArr3 = null;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                bArr = null;
                                if (e instanceof SocketTimeoutException) {
                                }
                                zzaqkVar2 = zzaqkVar;
                                zzaov zzy2 = zzaphVar.zzy();
                                zzb = zzaphVar.zzb();
                                zzapqVar = zzaqkVar2.zzb;
                                zzy2.zzc(zzapqVar);
                                str2 = zzaqkVar2.zza;
                                zzaphVar.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
                            }
                        } else {
                            bArr2 = new byte[0];
                        }
                        try {
                            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            if (!zzapt.zzb) {
                                if (elapsedRealtime3 > 3000) {
                                }
                                if (zzb4 >= 200 || zzb4 > 299) {
                                    throw new IOException();
                                }
                                return new zzapd(zzb4, bArr2, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzd2);
                            }
                            Object[] objArr = new Object[5];
                            objArr[0] = zzaphVar;
                            objArr[1] = Long.valueOf(elapsedRealtime3);
                            objArr[2] = bArr2 != null ? Integer.valueOf(bArr2.length) : "null";
                            objArr[3] = Integer.valueOf(zzb4);
                            objArr[4] = Integer.valueOf(zzaphVar.zzy().zza());
                            zzapt.zza("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                            if (zzb4 >= 200) {
                            }
                            throw new IOException();
                        } catch (IOException e4) {
                            e = e4;
                            bArr = bArr2;
                            if (e instanceof SocketTimeoutException) {
                            }
                            zzaqkVar2 = zzaqkVar;
                            zzaov zzy22 = zzaphVar.zzy();
                            zzb = zzaphVar.zzb();
                            zzapqVar = zzaqkVar2.zzb;
                            zzy22.zzc(zzapqVar);
                            str2 = zzaqkVar2.zza;
                            zzaphVar.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
                        }
                    } catch (IOException e5) {
                        e = e5;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (IOException e6) {
                e = e6;
            }
            str2 = zzaqkVar2.zza;
            zzaphVar.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
        }
    }
}
