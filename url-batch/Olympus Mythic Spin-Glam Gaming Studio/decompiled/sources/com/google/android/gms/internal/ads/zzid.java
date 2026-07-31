package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.Nullable;
import com.ironsource.C4701ic;
import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import io.bidmachine.util.network.NetworkUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzid extends zzhk implements zzil {
    private final boolean zza;
    private final int zzb;
    private final int zzc;

    @Nullable
    private final String zzd;

    @Nullable
    private final zzik zze;
    private final zzik zzf;

    @Nullable
    private zzhw zzg;

    @Nullable
    private HttpURLConnection zzh;

    @Nullable
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    /* synthetic */ zzid(String str, int i, int i2, boolean z, boolean z2, zzik zzikVar, zzgul zzgulVar, boolean z3, byte[] bArr) {
        super(true);
        this.zzd = str;
        this.zzb = i;
        this.zzc = i2;
        this.zza = z;
        this.zze = zzikVar;
        this.zzf = new zzik();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final HttpURLConnection zzk(URL url, int i, @Nullable byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzb);
        httpURLConnection.setReadTimeout(this.zzc);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.zze.zza());
        hashMap.putAll(this.zzf.zza());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j == 0) {
            if (j2 == -1) {
                sb = null;
                if (sb != null) {
                    httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, sb);
                }
                str = this.zzd;
                if (str != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str);
                }
                httpURLConnection.setRequestProperty("Accept-Encoding", true == z ? "identity" : "gzip");
                httpURLConnection.setInstanceFollowRedirects(z2);
                httpURLConnection.setDoOutput(false);
                int i2 = zzhw.zzh;
                httpURLConnection.setRequestMethod(C4701ic.a);
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
        str = this.zzd;
        if (str != null) {
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true == z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        int i22 = zzhw.zzh;
        httpURLConnection.setRequestMethod(C4701ic.a);
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, @Nullable String str, zzhw zzhwVar) throws zzih {
        if (str == null) {
            throw new zzih("Null location redirect", zzhwVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new zzih("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzhwVar, 2001, 1);
            }
            if (this.zza || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb = new StringBuilder(String.valueOf(protocol2).length() + 40 + protocol.length() + 1);
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new zzih(sb.toString(), zzhwVar, 2001, 1);
        } catch (MalformedURLException e) {
            throw new zzih(e, zzhwVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            } catch (Exception e) {
                zzeh.zzf("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws zzih {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzl;
            if (j != -1) {
                long j2 = j - this.zzm;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                }
                return -1;
            }
            InputStream inputStream = this.zzi;
            String str = zzfm.zza;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.zzm += read;
            zzh(read);
            return read;
        } catch (IOException e) {
            zzhw zzhwVar = this.zzg;
            String str2 = zzfm.zza;
            throw zzih.zza(e, zzhwVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d4, code lost:
    
        if (r10 == r19) goto L39;
     */
    @Override // com.google.android.gms.internal.ads.zzhs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzhw zzhwVar) throws zzih {
        long j;
        HttpURLConnection httpURLConnection;
        String str;
        byte[] bArr;
        long j2;
        this.zzg = zzhwVar;
        this.zzm = 0L;
        this.zzl = 0L;
        zzf(zzhwVar);
        try {
            Thread currentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? currentThread.getId() : currentThread.threadId()));
            URL url = new URL(zzhwVar.zza.toString());
            long j3 = zzhwVar.zze;
            long j4 = zzhwVar.zzf;
            boolean zza = zzhwVar.zza(1);
            if (this.zza) {
                j = 0;
                URL url2 = url;
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (i > 20) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 20);
                        sb.append("Too many redirects: ");
                        sb.append(i2);
                        throw new zzih(new NoRouteToHostException(sb.toString()), zzhwVar, 2001, 1);
                    }
                    long j5 = j3;
                    URL url3 = url2;
                    HttpURLConnection zzk = zzk(url2, 1, null, j3, j4, zza, false, zzhwVar.zzd);
                    int httpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(zzk);
                    String headerField = zzk.getHeaderField(NetworkUtils.HEADER_LOCATION);
                    if (httpUrlConnectionGetResponseCode != 300 && httpUrlConnectionGetResponseCode != 301 && httpUrlConnectionGetResponseCode != 302 && httpUrlConnectionGetResponseCode != 303 && httpUrlConnectionGetResponseCode != 307 && httpUrlConnectionGetResponseCode != 308) {
                        httpURLConnection = zzk;
                        break;
                    }
                    AdMobNetworkBridge.httpUrlConnectionDisconnect(zzk);
                    url2 = zzl(url3, headerField, zzhwVar);
                    j3 = j5;
                    i = i2;
                }
            } else {
                j = 0;
                httpURLConnection = zzk(url, 1, null, j3, j4, zza, true, zzhwVar.zzd);
            }
            this.zzh = httpURLConnection;
            this.zzk = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
            String responseMessage = httpURLConnection.getResponseMessage();
            int i3 = this.zzk;
            if (i3 < 200 || i3 > 299) {
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                if (this.zzk == 416) {
                    str = responseMessage;
                    if (zzhwVar.zze == zzim.zza(httpURLConnection.getHeaderField("Content-Range"))) {
                        this.zzj = true;
                        zzg(zzhwVar);
                        long j6 = zzhwVar.zzf;
                        return j6 != -1 ? j6 : j;
                    }
                } else {
                    str = responseMessage;
                }
                InputStream errorStream = httpURLConnection.getErrorStream();
                try {
                    bArr = errorStream != null ? zzham.zza(errorStream) : zzfm.zzb;
                } catch (IOException unused) {
                    bArr = zzfm.zzb;
                }
                byte[] bArr2 = bArr;
                zzm();
                throw new zzij(this.zzk, str, this.zzk == 416 ? new zzht(2008) : null, headerFields, zzhwVar, bArr2);
            }
            httpURLConnection.getContentType();
            if (this.zzk == 200) {
                j2 = zzhwVar.zze;
            }
            j2 = j;
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                this.zzl = zzhwVar.zzf;
            } else {
                long j7 = zzhwVar.zzf;
                if (j7 != -1) {
                    this.zzl = j7;
                } else {
                    long zzb = zzim.zzb(httpURLConnection.getHeaderField(NetworkUtils.HEADER_CONTENT_LENGTH), httpURLConnection.getHeaderField("Content-Range"));
                    this.zzl = zzb != -1 ? zzb - j2 : -1L;
                }
            }
            try {
                this.zzi = AdMobNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                if (equalsIgnoreCase) {
                    this.zzi = new GZIPInputStream(this.zzi);
                }
                this.zzj = true;
                zzg(zzhwVar);
                if (j2 != j) {
                    try {
                        byte[] bArr3 = new byte[4096];
                        while (j2 > j) {
                            int min = (int) Math.min(j2, 4096L);
                            InputStream inputStream = this.zzi;
                            String str2 = zzfm.zza;
                            int read = inputStream.read(bArr3, 0, min);
                            if (Thread.currentThread().isInterrupted()) {
                                throw new zzih(new InterruptedIOException(), zzhwVar, 2000, 1);
                            }
                            if (read == -1) {
                                throw new zzih(zzhwVar, 2008, 1);
                            }
                            j2 -= read;
                            zzh(read);
                        }
                    } catch (IOException e) {
                        zzm();
                        if (e instanceof zzih) {
                            throw ((zzih) e);
                        }
                        throw new zzih(e, zzhwVar, 2000, 1);
                    }
                }
                return this.zzl;
            } catch (IOException e2) {
                zzm();
                throw new zzih(e2, zzhwVar, 2000, 1);
            }
        } catch (IOException e3) {
            zzm();
            throw zzih.zza(e3, zzhwVar, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        zzhw zzhwVar = this.zzg;
        if (zzhwVar != null) {
            return zzhwVar.zza;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() throws zzih {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zzhw zzhwVar = this.zzg;
                    String str = zzfm.zza;
                    throw new zzih(e, zzhwVar, 2000, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
            TrafficStats.clearThreadStatsTag();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhs, com.google.android.gms.internal.ads.zzil
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzh;
        return httpURLConnection == null ? zzgxp.zza() : new zzic(httpURLConnection.getHeaderFields());
    }
}
