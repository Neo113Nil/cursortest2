package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfnp extends zzfnd {
    private zzfph<Integer> zza;
    private zzfph<Integer> zzb;
    private zzfno zzc;
    private HttpURLConnection zzd;

    zzfnp() {
        this(new zzfph() { // from class: com.google.android.gms.internal.ads.zzfnm
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                return zzfnp.zzf();
            }
        }, new zzfph() { // from class: com.google.android.gms.internal.ads.zzfnn
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                return zzfnp.zzg();
            }
        }, null);
    }

    zzfnp(zzfph<Integer> zzfphVar, zzfph<Integer> zzfphVar2, zzfno zzfnoVar) {
        this.zza = zzfphVar;
        this.zzb = zzfphVar2;
        this.zzc = zzfnoVar;
    }

    static /* synthetic */ Integer zzf() {
        return -1;
    }

    static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfne.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfne.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfno zzfnoVar = this.zzc;
        Objects.requireNonNull(zzfnoVar);
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfnoVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfno zzfnoVar, final int i, final int i2) throws IOException {
        this.zza = new zzfph() { // from class: com.google.android.gms.internal.ads.zzfnf
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzb = new zzfph() { // from class: com.google.android.gms.internal.ads.zzfng
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.zzc = zzfnoVar;
        return zzm();
    }

    public HttpURLConnection zzo(final Network network, final URL url, final int i, final int i2) throws IOException {
        this.zza = new zzfph() { // from class: com.google.android.gms.internal.ads.zzfnh
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzb = new zzfph() { // from class: com.google.android.gms.internal.ads.zzfni
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.zzc = new zzfno() { // from class: com.google.android.gms.internal.ads.zzfnj
            @Override // com.google.android.gms.internal.ads.zzfno
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = network.openConnection(url);
                return openConnection;
            }
        };
        return zzm();
    }

    public URLConnection zzr(final URL url, final int i) throws IOException {
        this.zza = new zzfph() { // from class: com.google.android.gms.internal.ads.zzfnk
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzc = new zzfno() { // from class: com.google.android.gms.internal.ads.zzfnl
            @Override // com.google.android.gms.internal.ads.zzfno
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = url.openConnection();
                return openConnection;
            }
        };
        return zzm();
    }
}
