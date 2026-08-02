package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfpu extends zzfpi {
    private zzftn<Integer> zza;
    private zzftn<Integer> zzb;
    private zzfpt zzc;
    private HttpURLConnection zzd;

    zzfpu() {
        this(new zzftn() { // from class: com.google.android.gms.internal.ads.zzfpr
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                return zzfpu.zzf();
            }
        }, new zzftn() { // from class: com.google.android.gms.internal.ads.zzfps
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                return zzfpu.zzg();
            }
        }, null);
    }

    zzfpu(zzftn<Integer> zzftnVar, zzftn<Integer> zzftnVar2, zzfpt zzfptVar) {
        this.zza = zzftnVar;
        this.zzb = zzftnVar2;
        this.zzc = zzfptVar;
    }

    static /* synthetic */ Integer zzf() {
        return -1;
    }

    static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfpj.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfpj.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfpt zzfptVar = this.zzc;
        Objects.requireNonNull(zzfptVar);
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfptVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfpt zzfptVar, final int i, final int i2) throws IOException {
        this.zza = new zzftn() { // from class: com.google.android.gms.internal.ads.zzfpk
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzb = new zzftn() { // from class: com.google.android.gms.internal.ads.zzfpl
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.zzc = zzfptVar;
        return zzm();
    }

    public HttpURLConnection zzo(final Network network, final URL url, final int i, final int i2) throws IOException {
        this.zza = new zzftn() { // from class: com.google.android.gms.internal.ads.zzfpm
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzb = new zzftn() { // from class: com.google.android.gms.internal.ads.zzfpn
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.zzc = new zzfpt() { // from class: com.google.android.gms.internal.ads.zzfpo
            @Override // com.google.android.gms.internal.ads.zzfpt
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = network.openConnection(url);
                return openConnection;
            }
        };
        return zzm();
    }

    public URLConnection zzr(final URL url, final int i) throws IOException {
        this.zza = new zzftn() { // from class: com.google.android.gms.internal.ads.zzfpp
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzc = new zzfpt() { // from class: com.google.android.gms.internal.ads.zzfpq
            @Override // com.google.android.gms.internal.ads.zzfpt
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = url.openConnection();
                return openConnection;
            }
        };
        return zzm();
    }
}
