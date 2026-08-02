package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcjs implements zzazv {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzc = new AtomicReference();
    private final int zze;
    private final int zzf;
    private final String zzg;
    private final zzazu zzh;
    private final zzbab zzi;
    private zzazo zzj;
    private HttpURLConnection zzk;
    private InputStream zzl;
    private boolean zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private final SSLSocketFactory zzd = new zzcjr(this);
    private final Set zzs = new HashSet();

    zzcjs(String str, zzbab zzbabVar, int i, int i2, int i3) {
        zzbac.zzb(str);
        this.zzg = str;
        this.zzi = zzbabVar;
        this.zzh = new zzazu();
        this.zze = i;
        this.zzf = i2;
        this.zzr = i3;
    }

    private final void zzi() {
        HttpURLConnection httpURLConnection = this.zzk;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zze.zzh("Unexpected error while disconnecting", e);
            }
            this.zzk = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f6, code lost:
    
        if (r3 != 0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x021a A[Catch: IOException -> 0x0269, TryCatch #0 {IOException -> 0x0269, blocks: (B:3:0x000e, B:4:0x001e, B:6:0x0024, B:8:0x002e, B:9:0x0036, B:10:0x004e, B:12:0x0054, B:19:0x0078, B:21:0x0092, B:22:0x00a3, B:23:0x00a8, B:37:0x00de, B:99:0x020f, B:101:0x021a, B:103:0x022b, B:109:0x0234, B:110:0x0243, B:113:0x024a, B:114:0x0251, B:117:0x0252, B:118:0x0268), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzazm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzazo zzazoVar) throws zzazs {
        int responseCode;
        String headerField;
        int responseCode2;
        long j;
        long parseLong;
        String headerField2;
        this.zzj = zzazoVar;
        long j2 = 0;
        this.zzq = 0L;
        this.zzp = 0L;
        try {
            URL url = new URL(zzazoVar.zza.toString());
            long j3 = zzazoVar.zzc;
            long j4 = zzazoVar.zzd;
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i > 20) {
                    throw new NoRouteToHostException("Too many redirects: " + i2);
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.zzd);
                }
                httpURLConnection.setConnectTimeout(this.zze);
                httpURLConnection.setReadTimeout(this.zzf);
                for (Map.Entry entry : this.zzh.zza().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j3 == j2) {
                    if (j4 != -1) {
                    }
                    httpURLConnection.setRequestProperty("User-Agent", this.zzg);
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.zzk = httpURLConnection;
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                            if (responseCode2 >= 200 || responseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.zzk.getHeaderFields();
                                zzi();
                                zzazt zzaztVar = new zzazt(responseCode2, headerFields, zzazoVar);
                                if (responseCode2 == 416) {
                                    throw zzaztVar;
                                }
                                zzaztVar.initCause(new zzazn(0));
                                throw zzaztVar;
                            }
                            if (responseCode2 == 200) {
                                j = zzazoVar.zzc;
                            }
                            j = 0;
                            this.zzn = j;
                            long j5 = zzazoVar.zzd;
                            if (j5 != -1) {
                                this.zzo = j5;
                            } else {
                                HttpURLConnection httpURLConnection2 = this.zzk;
                                String headerField3 = httpURLConnection2.getHeaderField("Content-Length");
                                if (!TextUtils.isEmpty(headerField3)) {
                                    try {
                                        parseLong = Long.parseLong(headerField3);
                                    } catch (NumberFormatException unused) {
                                        com.google.android.gms.ads.internal.util.zze.zzg("Unexpected Content-Length [" + headerField3 + "]");
                                    }
                                    headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                    if (!TextUtils.isEmpty(headerField2)) {
                                        Matcher matcher = zzb.matcher(headerField2);
                                        if (matcher.find()) {
                                            try {
                                                long parseLong2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                if (parseLong < 0) {
                                                    parseLong = parseLong2;
                                                } else if (parseLong != parseLong2) {
                                                    com.google.android.gms.ads.internal.util.zze.zzj("Inconsistent headers [" + headerField3 + "] [" + headerField2 + "]");
                                                    parseLong = Math.max(parseLong, parseLong2);
                                                }
                                            } catch (NumberFormatException unused2) {
                                                com.google.android.gms.ads.internal.util.zze.zzg("Unexpected Content-Range [" + headerField2 + "]");
                                            }
                                        }
                                    }
                                    this.zzo = parseLong != -1 ? parseLong - this.zzn : -1L;
                                }
                                parseLong = -1;
                                headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                if (!TextUtils.isEmpty(headerField2)) {
                                }
                                this.zzo = parseLong != -1 ? parseLong - this.zzn : -1L;
                            }
                            try {
                                this.zzl = this.zzk.getInputStream();
                                this.zzm = true;
                                zzbab zzbabVar = this.zzi;
                                if (zzbabVar != null) {
                                    ((zzckg) zzbabVar).zzk(this, zzazoVar);
                                }
                                return this.zzo;
                            } catch (IOException e) {
                                zzi();
                                throw new zzazs(e, zzazoVar, 1);
                            }
                        } catch (IOException e2) {
                            zzi();
                            throw new zzazs("Unable to connect to ".concat(String.valueOf(zzazoVar.zza.toString())), e2, zzazoVar, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !"http".equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i = i2;
                    j2 = 0;
                } else {
                    j2 = j3;
                }
                String str = "bytes=" + j2 + "-";
                if (j4 != -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append((j2 + j4) - 1);
                    str = sb.toString();
                }
                httpURLConnection.setRequestProperty("Range", str);
                httpURLConnection.setRequestProperty("User-Agent", this.zzg);
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300) {
                    this.zzk = httpURLConnection;
                    responseCode2 = httpURLConnection.getResponseCode();
                    if (responseCode2 >= 200) {
                    }
                    Map<String, List<String>> headerFields2 = this.zzk.getHeaderFields();
                    zzi();
                    zzazt zzaztVar2 = new zzazt(responseCode2, headerFields2, zzazoVar);
                    if (responseCode2 == 416) {
                    }
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                }
            }
        } catch (IOException e3) {
            throw new zzazs("Unable to connect to ".concat(String.valueOf(zzazoVar.zza.toString())), e3, zzazoVar, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazm
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzk;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzazm
    public final void zzd() throws zzazs {
        try {
            if (this.zzl != null) {
                HttpURLConnection httpURLConnection = this.zzk;
                long j = this.zzo;
                if (j != -1) {
                    j -= this.zzq;
                }
                if (zzbar.zza == 19 || zzbar.zza == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j == -1) {
                            if (inputStream.read() != -1) {
                            }
                        } else if (j <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                        }
                        String name = inputStream.getClass().getName();
                        if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                            Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(inputStream, new Object[0]);
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.zzl.close();
                } catch (IOException e) {
                    throw new zzazs(e, this.zzj, 3);
                }
            }
        } finally {
            this.zzl = null;
            zzi();
            if (this.zzm) {
                this.zzm = false;
            }
            this.zzs.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazv
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzk;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final void zzh(int i) {
        this.zzr = i;
        for (Socket socket : this.zzs) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzr);
                } catch (SocketException e) {
                    com.google.android.gms.ads.internal.util.zze.zzk("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazm
    public final int zza(byte[] bArr, int i, int i2) throws zzazs {
        try {
            if (this.zzp != this.zzn) {
                byte[] bArr2 = (byte[]) zzc.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.zzp;
                    long j2 = this.zzn;
                    if (j == j2) {
                        zzc.set(bArr2);
                        break;
                    }
                    int read = this.zzl.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.zzp += read;
                    zzbab zzbabVar = this.zzi;
                    if (zzbabVar != null) {
                        ((zzckg) zzbabVar).zzW(this, read);
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.zzo;
            if (j3 != -1) {
                long j4 = j3 - this.zzq;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                }
                return -1;
            }
            int read2 = this.zzl.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.zzo == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzq += read2;
            zzbab zzbabVar2 = this.zzi;
            if (zzbabVar2 == null) {
                return read2;
            }
            ((zzckg) zzbabVar2).zzW(this, read2);
            return read2;
        } catch (IOException e) {
            throw new zzazs(e, this.zzj, 2);
        }
    }
}
