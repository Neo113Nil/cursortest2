package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcce implements zzfs {
    private final Context zza;
    private final zzfs zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbah zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private zzfy zzl;

    public zzcce(Context context, zzfs zzfsVar, String str, int i, zzgu zzguVar, zzccd zzccdVar) {
        this.zza = context;
        this.zzb = zzfsVar;
        this.zzc = str;
        this.zzd = i;
        new AtomicLong(-1L);
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbG)).booleanValue();
    }

    private final boolean zzg() {
        if (!this.zze) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdT)).booleanValue() || this.zzj) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdU)).booleanValue() && !this.zzk;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        return inputStream != null ? inputStream.read(bArr, i, i2) : this.zzb.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final long zzb(zzfy zzfyVar) throws IOException {
        Long l;
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        this.zzh = zzfyVar.zza;
        this.zzl = zzfyVar;
        this.zzi = zzbah.zza(zzfyVar.zza);
        zzbae zzbaeVar = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdQ)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzfyVar.zze;
                this.zzi.zzi = zzfvj.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbaeVar = com.google.android.gms.ads.internal.zzu.zzc().zzb(this.zzi);
            }
            if (zzbaeVar != null && zzbaeVar.zze()) {
                this.zzj = zzbaeVar.zzg();
                this.zzk = zzbaeVar.zzf();
                if (!zzg()) {
                    this.zzf = zzbaeVar.zzc();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzfyVar.zze;
            this.zzi.zzi = zzfvj.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdS);
            } else {
                l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdR);
            }
            long longValue = l.longValue();
            com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
            com.google.android.gms.ads.internal.zzu.zzd();
            Future zza = zzbas.zza(this.zza, this.zzi);
            try {
                try {
                    zzbat zzbatVar = (zzbat) zza.get(longValue, TimeUnit.MILLISECONDS);
                    zzbatVar.zzd();
                    this.zzj = zzbatVar.zzf();
                    this.zzk = zzbatVar.zze();
                    zzbatVar.zza();
                    if (!zzg()) {
                        this.zzf = zzbatVar.zzc();
                    }
                } catch (InterruptedException unused) {
                    zza.cancel(false);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused2) {
                    zza.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
            throw null;
        }
        if (this.zzi != null) {
            zzfw zza2 = zzfyVar.zza();
            zza2.zzd(Uri.parse(this.zzi.zza));
            this.zzl = zza2.zze();
        }
        return this.zzb.zzb(this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream = this.zzf;
        if (inputStream == null) {
            this.zzb.zzd();
        } else {
            IOUtils.closeQuietly(inputStream);
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzf(zzgu zzguVar) {
    }
}
