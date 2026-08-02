package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPInputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfk extends zzer implements zzfu {
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzft zzf;
    private final zzft zzg;
    private zzfc zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;

    @Deprecated
    public zzfk() {
        this(null, 8000, 8000, false, null, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final HttpURLConnection zzk(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzc);
        httpURLConnection.setReadTimeout(this.zzd);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.zzf.zza());
        hashMap.putAll(this.zzg.zza());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j == 0) {
            if (j2 == -1) {
                sb = null;
                if (sb != null) {
                    httpURLConnection.setRequestProperty("Range", sb);
                }
                str = this.zze;
                if (str != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str);
                }
                httpURLConnection.setRequestProperty("Accept-Encoding", true == z ? "identity" : "gzip");
                httpURLConnection.setInstanceFollowRedirects(z2);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.setRequestMethod(zzfc.zza(1));
                httpURLConnection.connect();
                return httpURLConnection;
            }
            j = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("bytes=");
        sb2.append(j);
        sb2.append("-");
        if (j2 != -1) {
            sb2.append((j + j2) - 1);
        }
        sb = sb2.toString();
        if (sb != null) {
        }
        str = this.zze;
        if (str != null) {
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true == z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        httpURLConnection.setRequestMethod(zzfc.zza(1));
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, String str, zzfc zzfcVar) throws zzfq {
        if (str == null) {
            throw new zzfq("Null location redirect", zzfcVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new zzfq("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzfcVar, 2001, 1);
            }
            if (this.zzb || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new zzfq("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", zzfcVar, 2001, 1);
        } catch (MalformedURLException e) {
            throw new zzfq(e, zzfcVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzdw.zzc("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws zzfq {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzm;
            if (j != -1) {
                long j2 = j - this.zzn;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.zzj;
            int i3 = zzen.zza;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.zzn += read;
            zzg(read);
            return read;
        } catch (IOException e) {
            zzfc zzfcVar = this.zzh;
            int i4 = zzen.zza;
            throw zzfq.zza(e, zzfcVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b8, code lost:
    
        if (r8 != 0) goto L39;
     */
    @Override // com.google.android.gms.internal.ads.zzex
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzfc zzfcVar) throws zzfq {
        int i;
        URL url;
        long j;
        long j2;
        boolean zzb;
        HttpURLConnection httpURLConnection;
        String str;
        byte[] bArr;
        long j3;
        this.zzh = zzfcVar;
        this.zzn = 0L;
        this.zzm = 0L;
        zzi(zzfcVar);
        try {
            url = new URL(zzfcVar.zza.toString());
            int i2 = zzfcVar.zzb;
            byte[] bArr2 = zzfcVar.zzc;
            j = zzfcVar.zzf;
            j2 = zzfcVar.zzg;
            zzb = zzfcVar.zzb(1);
            try {
            } catch (IOException e) {
                e = e;
                i = 1;
            }
        } catch (IOException e2) {
            e = e2;
            i = 1;
        }
        if (this.zzb) {
            URL url2 = url;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 > 20) {
                    i = 1;
                    throw new zzfq(new NoRouteToHostException("Too many redirects: " + i4), zzfcVar, 2001, 1);
                }
                long j4 = j2;
                long j5 = j;
                URL url3 = url2;
                HttpURLConnection zzk = zzk(url2, 1, null, j, j2, zzb, false, zzfcVar.zzd);
                int responseCode = zzk.getResponseCode();
                String headerField = zzk.getHeaderField("Location");
                if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                    httpURLConnection = zzk;
                    break;
                }
                i = 1;
                try {
                    zzk.disconnect();
                    url2 = zzl(url3, headerField, zzfcVar);
                    i3 = i4;
                    j2 = j4;
                    j = j5;
                } catch (IOException e3) {
                    e = e3;
                }
                e = e3;
                zzm();
                throw zzfq.zza(e, zzfcVar, i);
            }
        }
        httpURLConnection = zzk(url, 1, null, j, j2, zzb, true, zzfcVar.zzd);
        this.zzi = httpURLConnection;
        this.zzl = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        int i5 = this.zzl;
        if (i5 < 200 || i5 > 299) {
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            if (this.zzl == 416) {
                str = responseMessage;
                if (zzfcVar.zzf == zzfv.zzb(httpURLConnection.getHeaderField("Content-Range"))) {
                    this.zzk = true;
                    zzj(zzfcVar);
                    long j6 = zzfcVar.zzg;
                    if (j6 != -1) {
                        return j6;
                    }
                    return 0L;
                }
            } else {
                str = responseMessage;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                bArr = errorStream != null ? zzen.zzab(errorStream) : zzen.zzf;
            } catch (IOException unused) {
                bArr = zzen.zzf;
            }
            byte[] bArr3 = bArr;
            zzm();
            throw new zzfs(this.zzl, str, this.zzl == 416 ? new zzey(2008) : null, headerFields, zzfcVar, bArr3);
        }
        httpURLConnection.getContentType();
        if (this.zzl == 200) {
            j3 = zzfcVar.zzf;
        }
        j3 = 0;
        boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
        if (equalsIgnoreCase) {
            this.zzm = zzfcVar.zzg;
        } else {
            long j7 = zzfcVar.zzg;
            if (j7 != -1) {
                this.zzm = j7;
            } else {
                long zza = zzfv.zza(httpURLConnection.getHeaderField("Content-Length"), httpURLConnection.getHeaderField("Content-Range"));
                this.zzm = zza != -1 ? zza - j3 : -1L;
            }
        }
        try {
            this.zzj = httpURLConnection.getInputStream();
            if (equalsIgnoreCase) {
                this.zzj = new GZIPInputStream(this.zzj);
            }
            this.zzk = true;
            zzj(zzfcVar);
            if (j3 != 0) {
                try {
                    byte[] bArr4 = new byte[4096];
                    while (j3 > 0) {
                        int min = (int) Math.min(j3, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                        InputStream inputStream = this.zzj;
                        int i6 = zzen.zza;
                        int read = inputStream.read(bArr4, 0, min);
                        if (Thread.currentThread().isInterrupted()) {
                            throw new zzfq(new InterruptedIOException(), zzfcVar, 2000, 1);
                        }
                        if (read == -1) {
                            throw new zzfq(zzfcVar, 2008, 1);
                        }
                        j3 -= read;
                        zzg(read);
                    }
                } catch (IOException e4) {
                    zzm();
                    if (e4 instanceof zzfq) {
                        throw ((zzfq) e4);
                    }
                    throw new zzfq(e4, zzfcVar, 2000, 1);
                }
            }
            return this.zzm;
        } catch (IOException e5) {
            zzm();
            throw new zzfq(e5, zzfcVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final void zzd() throws zzfq {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                long j = this.zzm;
                long j2 = j == -1 ? -1L : j - this.zzn;
                HttpURLConnection httpURLConnection = this.zzi;
                if (httpURLConnection != null) {
                    int i = zzen.zza;
                    if (zzen.zza <= 20) {
                        try {
                            InputStream inputStream2 = httpURLConnection.getInputStream();
                            if (j2 == -1) {
                                if (inputStream2.read() != -1) {
                                }
                            } else if (j2 <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                            }
                            String name = inputStream2.getClass().getName();
                            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                                Class<? super Object> superclass = inputStream2.getClass().getSuperclass();
                                Objects.requireNonNull(superclass);
                                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                declaredMethod.setAccessible(true);
                                declaredMethod.invoke(inputStream2, new Object[0]);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zzfc zzfcVar = this.zzh;
                    int i2 = zzen.zza;
                    throw new zzfq(e, zzfcVar, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzm();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzer, com.google.android.gms.internal.ads.zzex, com.google.android.gms.internal.ads.zzfu
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        return httpURLConnection == null ? zzfvq.zzd() : new zzfi(httpURLConnection.getHeaderFields());
    }

    private zzfk(String str, int i, int i2, boolean z, zzft zzftVar, zzfsy zzfsyVar, boolean z2) {
        super(true);
        this.zze = str;
        this.zzc = i;
        this.zzd = i2;
        this.zzb = z;
        this.zzf = zzftVar;
        this.zzg = new zzft();
    }
}
