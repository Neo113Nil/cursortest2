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

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfe extends zzek implements zzfo {
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzfn zzf;
    private final zzfn zzg;
    private zzew zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;

    @Deprecated
    public zzfe() {
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
                httpURLConnection.setRequestMethod(zzew.zza(1));
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
        httpURLConnection.setRequestMethod(zzew.zza(1));
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, String str, zzew zzewVar) throws zzfk {
        if (str == null) {
            throw new zzfk("Null location redirect", zzewVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new zzfk("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzewVar, 2001, 1);
            }
            if (this.zzb || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new zzfk("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", zzewVar, 2001, 1);
        } catch (MalformedURLException e) {
            throw new zzfk(e, zzewVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzdn.zza("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i, int i2) throws zzfk {
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
            int i3 = zzeg.zza;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.zzn += read;
            zzg(read);
            return read;
        } catch (IOException e) {
            zzew zzewVar = this.zzh;
            int i4 = zzeg.zza;
            throw zzfk.zza(e, zzewVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b4, code lost:
    
        if (r8 != 0) goto L35;
     */
    @Override // com.google.android.gms.internal.ads.zzer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzew zzewVar) throws zzfk {
        int i;
        URL url;
        long j;
        long j2;
        boolean zzb;
        HttpURLConnection httpURLConnection;
        String str;
        byte[] bArr;
        long j3;
        this.zzh = zzewVar;
        this.zzn = 0L;
        this.zzm = 0L;
        zzi(zzewVar);
        try {
            url = new URL(zzewVar.zza.toString());
            int i2 = zzewVar.zzb;
            byte[] bArr2 = zzewVar.zzc;
            j = zzewVar.zzf;
            j2 = zzewVar.zzg;
            zzb = zzewVar.zzb(1);
        } catch (IOException e) {
            e = e;
            i = 1;
        }
        if (this.zzb) {
            URL url2 = url;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 > 20) {
                    i = 1;
                    throw new zzfk(new NoRouteToHostException("Too many redirects: " + i4), zzewVar, 2001, 1);
                }
                long j4 = j2;
                long j5 = j;
                URL url3 = url2;
                HttpURLConnection zzk = zzk(url2, 1, null, j, j2, zzb, false, zzewVar.zzd);
                int responseCode = zzk.getResponseCode();
                String headerField = zzk.getHeaderField("Location");
                if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                    httpURLConnection = zzk;
                    break;
                }
                i = 1;
                try {
                    zzk.disconnect();
                    url2 = zzl(url3, headerField, zzewVar);
                    i3 = i4;
                    j2 = j4;
                    j = j5;
                } catch (IOException e2) {
                    e = e2;
                }
                e = e2;
                zzm();
                throw zzfk.zza(e, zzewVar, i);
            }
        }
        httpURLConnection = zzk(url, 1, null, j, j2, zzb, true, zzewVar.zzd);
        this.zzi = httpURLConnection;
        this.zzl = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        int i5 = this.zzl;
        if (i5 < 200 || i5 > 299) {
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            if (this.zzl == 416) {
                str = responseMessage;
                if (zzewVar.zzf == zzfp.zzb(httpURLConnection.getHeaderField("Content-Range"))) {
                    this.zzk = true;
                    zzj(zzewVar);
                    long j6 = zzewVar.zzg;
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
                bArr = errorStream != null ? zzeg.zzaa(errorStream) : zzeg.zzf;
            } catch (IOException unused) {
                bArr = zzeg.zzf;
            }
            byte[] bArr3 = bArr;
            zzm();
            throw new zzfm(this.zzl, str, this.zzl == 416 ? new zzes(2008) : null, headerFields, zzewVar, bArr3);
        }
        httpURLConnection.getContentType();
        if (this.zzl == 200) {
            j3 = zzewVar.zzf;
        }
        j3 = 0;
        boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
        if (equalsIgnoreCase) {
            this.zzm = zzewVar.zzg;
        } else {
            long j7 = zzewVar.zzg;
            if (j7 != -1) {
                this.zzm = j7;
            } else {
                long zza = zzfp.zza(httpURLConnection.getHeaderField("Content-Length"), httpURLConnection.getHeaderField("Content-Range"));
                this.zzm = zza != -1 ? zza - j3 : -1L;
            }
        }
        try {
            this.zzj = httpURLConnection.getInputStream();
            if (equalsIgnoreCase) {
                this.zzj = new GZIPInputStream(this.zzj);
            }
            this.zzk = true;
            zzj(zzewVar);
            if (j3 != 0) {
                try {
                    byte[] bArr4 = new byte[4096];
                    while (j3 > 0) {
                        int min = (int) Math.min(j3, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                        InputStream inputStream = this.zzj;
                        int i6 = zzeg.zza;
                        int read = inputStream.read(bArr4, 0, min);
                        if (Thread.currentThread().isInterrupted()) {
                            throw new zzfk(new InterruptedIOException(), zzewVar, 2000, 1);
                        }
                        if (read == -1) {
                            throw new zzfk(zzewVar, 2008, 1);
                        }
                        j3 -= read;
                        zzg(read);
                    }
                } catch (IOException e3) {
                    zzm();
                    if (e3 instanceof zzfk) {
                        throw ((zzfk) e3);
                    }
                    throw new zzfk(e3, zzewVar, 2000, 1);
                }
            }
            return this.zzm;
        } catch (IOException e4) {
            zzm();
            throw new zzfk(e4, zzewVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final void zzd() throws zzfk {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                long j = this.zzm;
                long j2 = j == -1 ? -1L : j - this.zzn;
                HttpURLConnection httpURLConnection = this.zzi;
                if (httpURLConnection != null) {
                    int i = zzeg.zza;
                    if (zzeg.zza <= 20) {
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
                    zzew zzewVar = this.zzh;
                    int i2 = zzeg.zza;
                    throw new zzfk(e, zzewVar, 2000, 3);
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

    @Override // com.google.android.gms.internal.ads.zzek, com.google.android.gms.internal.ads.zzer, com.google.android.gms.internal.ads.zzfo
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        return httpURLConnection == null ? zzfrk.zzd() : new zzfc(httpURLConnection.getHeaderFields());
    }

    private zzfe(String str, int i, int i2, boolean z, zzfn zzfnVar, zzfot zzfotVar, boolean z2) {
        super(true);
        this.zze = str;
        this.zzc = i;
        this.zzd = i2;
        this.zzb = z;
        this.zzf = zzfnVar;
        this.zzg = new zzfn();
    }
}
