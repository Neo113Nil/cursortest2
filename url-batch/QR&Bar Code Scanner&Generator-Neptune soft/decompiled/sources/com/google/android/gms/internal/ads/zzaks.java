package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.browser.trusted.sharing.ShareTarget;
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

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public class zzaks implements zzajw {
    protected final zzaku zza;

    @Deprecated
    protected final zzakr zzb;
    private final zzakr zzc;

    public zzaks(zzakr zzakrVar) {
        zzaku zzakuVar = new zzaku(4096);
        this.zzc = zzakrVar;
        this.zzb = zzakrVar;
        this.zza = zzakuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x02b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d5  */
    @Override // com.google.android.gms.internal.ads.zzajw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzajz zza(zzakd zzakdVar) throws zzakm {
        zzalb zzalbVar;
        byte[] bArr;
        zzalg zzalgVar;
        zzalg zzalgVar2;
        int zzb;
        String str;
        zzakm zzakmVar;
        String str2;
        Map map;
        byte[] bArr2;
        byte[] bArr3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            boolean z = true;
            try {
                zzajm zzd = zzakdVar.zzd();
                if (zzd == null) {
                    map = Collections.emptyMap();
                } else {
                    HashMap hashMap = new HashMap();
                    String str3 = zzd.zzb;
                    if (str3 != null) {
                        hashMap.put("If-None-Match", str3);
                    }
                    long j = zzd.zzd;
                    if (j > 0) {
                        hashMap.put("If-Modified-Since", zzala.zzc(j));
                    }
                    map = hashMap;
                }
                String zzk = zzakdVar.zzk();
                HashMap hashMap2 = new HashMap();
                hashMap2.putAll(map);
                hashMap2.putAll(zzakdVar.zzl());
                URL url = new URL(zzk);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
                int zzb2 = zzakdVar.zzb();
                httpURLConnection.setConnectTimeout(zzb2);
                httpURLConnection.setReadTimeout(zzb2);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                "https".equals(url.getProtocol());
                try {
                    for (String str4 : hashMap2.keySet()) {
                        httpURLConnection.setRequestProperty(str4, (String) hashMap2.get(str4));
                    }
                    if (zzakdVar.zza() != 0) {
                        httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
                        byte[] zzx = zzakdVar.zzx();
                        if (zzx != null) {
                            httpURLConnection.setDoOutput(true);
                            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
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
                    zzakdVar.zza();
                    if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                        zzalbVar = new zzalb(responseCode, zzale.zza(httpURLConnection.getHeaderFields()), -1, null);
                        httpURLConnection.disconnect();
                    } else {
                        try {
                            zzalbVar = new zzalb(responseCode, zzale.zza(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new zzalc(httpURLConnection));
                        } catch (Throwable th2) {
                            th = th2;
                            if (!z) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (IOException e) {
                                    e = e;
                                    zzalbVar = null;
                                    bArr = null;
                                    if (e instanceof SocketTimeoutException) {
                                        zzalgVar = new zzalg("socket", new zzakl(), null);
                                    } else {
                                        if (e instanceof MalformedURLException) {
                                            throw new RuntimeException("Bad URL ".concat(String.valueOf(zzakdVar.zzk())), e);
                                        }
                                        if (zzalbVar == null) {
                                            throw new zzaka(e);
                                        }
                                        int zzb3 = zzalbVar.zzb();
                                        zzakp.zzb("Unexpected response code %d for %s", Integer.valueOf(zzb3), zzakdVar.zzk());
                                        if (bArr != null) {
                                            zzajz zzajzVar = new zzajz(zzb3, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzalbVar.zzd());
                                            if (zzb3 != 401 && zzb3 != 403) {
                                                if (zzb3 < 400 || zzb3 > 499) {
                                                    throw new zzakk(zzajzVar);
                                                }
                                                throw new zzajq(zzajzVar);
                                            }
                                            zzalgVar = new zzalg("auth", new zzajl(zzajzVar), null);
                                        } else {
                                            zzalgVar = new zzalg("network", new zzajy(), null);
                                        }
                                    }
                                    zzalgVar2 = zzalgVar;
                                    zzajr zzy = zzakdVar.zzy();
                                    zzb = zzakdVar.zzb();
                                    try {
                                        zzakmVar = zzalgVar2.zzb;
                                        zzy.zzc(zzakmVar);
                                        str2 = zzalgVar2.zza;
                                        zzakdVar.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
                                    } catch (zzakm e2) {
                                        str = zzalgVar2.zza;
                                        zzakdVar.zzm(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(zzb)));
                                        throw e2;
                                    }
                                }
                            }
                            throw th;
                        }
                    }
                    try {
                        int zzb4 = zzalbVar.zzb();
                        List zzd2 = zzalbVar.zzd();
                        if (zzb4 == 304) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            zzajm zzd3 = zzakdVar.zzd();
                            if (zzd3 == null) {
                                return new zzajz(304, (byte[]) null, true, elapsedRealtime2, zzd2);
                            }
                            TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                            if (!zzd2.isEmpty()) {
                                Iterator it = zzd2.iterator();
                                while (it.hasNext()) {
                                    treeSet.add(((zzajv) it.next()).zza());
                                }
                            }
                            ArrayList arrayList = new ArrayList(zzd2);
                            List list = zzd3.zzh;
                            if (list != null) {
                                if (!list.isEmpty()) {
                                    for (zzajv zzajvVar : zzd3.zzh) {
                                        if (!treeSet.contains(zzajvVar.zza())) {
                                            arrayList.add(zzajvVar);
                                        }
                                    }
                                }
                            } else if (!zzd3.zzg.isEmpty()) {
                                for (Map.Entry entry : zzd3.zzg.entrySet()) {
                                    if (!treeSet.contains(entry.getKey())) {
                                        arrayList.add(new zzajv((String) entry.getKey(), (String) entry.getValue()));
                                    }
                                }
                            }
                            return new zzajz(304, zzd3.zza, true, elapsedRealtime2, (List) arrayList);
                        }
                        InputStream zzc = zzalbVar.zzc();
                        if (zzc != null) {
                            int zza = zzalbVar.zza();
                            try {
                                zzaku zzakuVar = this.zza;
                                zzalh zzalhVar = new zzalh(zzakuVar, zza);
                                try {
                                    bArr3 = zzakuVar.zzb(1024);
                                    while (true) {
                                        try {
                                            int read = zzc.read(bArr3);
                                            if (read == -1) {
                                                break;
                                            }
                                            zzalhVar.write(bArr3, 0, read);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                zzc.close();
                                            } catch (IOException unused) {
                                                zzakp.zzd("Error occurred when closing InputStream", new Object[0]);
                                            }
                                            zzakuVar.zza(bArr3);
                                            zzalhVar.close();
                                            throw th;
                                        }
                                    }
                                    bArr2 = zzalhVar.toByteArray();
                                    try {
                                        zzc.close();
                                    } catch (IOException unused2) {
                                        zzakp.zzd("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    zzakuVar.zza(bArr3);
                                    zzalhVar.close();
                                } catch (Throwable th4) {
                                    th = th4;
                                    bArr3 = null;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                bArr = null;
                                if (e instanceof SocketTimeoutException) {
                                }
                                zzalgVar2 = zzalgVar;
                                zzajr zzy2 = zzakdVar.zzy();
                                zzb = zzakdVar.zzb();
                                zzakmVar = zzalgVar2.zzb;
                                zzy2.zzc(zzakmVar);
                                str2 = zzalgVar2.zza;
                                zzakdVar.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
                            }
                        } else {
                            bArr2 = new byte[0];
                        }
                        try {
                            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            if (!zzakp.zzb) {
                                if (elapsedRealtime3 > 3000) {
                                }
                                if (zzb4 >= 200 || zzb4 > 299) {
                                    throw new IOException();
                                }
                                return new zzajz(zzb4, bArr2, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzd2);
                            }
                            Object[] objArr = new Object[5];
                            objArr[0] = zzakdVar;
                            objArr[1] = Long.valueOf(elapsedRealtime3);
                            objArr[2] = bArr2 != null ? Integer.valueOf(bArr2.length) : "null";
                            objArr[3] = Integer.valueOf(zzb4);
                            objArr[4] = Integer.valueOf(zzakdVar.zzy().zza());
                            zzakp.zza("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                            if (zzb4 >= 200) {
                            }
                            throw new IOException();
                        } catch (IOException e4) {
                            e = e4;
                            bArr = bArr2;
                            if (e instanceof SocketTimeoutException) {
                            }
                            zzalgVar2 = zzalgVar;
                            zzajr zzy22 = zzakdVar.zzy();
                            zzb = zzakdVar.zzb();
                            zzakmVar = zzalgVar2.zzb;
                            zzy22.zzc(zzakmVar);
                            str2 = zzalgVar2.zza;
                            zzakdVar.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
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
            str2 = zzalgVar2.zza;
            zzakdVar.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
        }
    }
}
