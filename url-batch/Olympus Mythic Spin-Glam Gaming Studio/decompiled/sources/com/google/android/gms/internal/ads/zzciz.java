package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzciz implements zzhs {
    private final Context zza;
    private final zzhs zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbhr zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private zzhw zzl;

    public zzciz(Context context, zzhs zzhsVar, String str, int i, zziq zziqVar, zzciy zzciyVar) {
        this.zza = context;
        this.zzb = zzhsVar;
        this.zzc = str;
        this.zzd = i;
        new AtomicLong(-1L);
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcG)).booleanValue();
    }

    private final boolean zzf() {
        if (!this.zze) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfv)).booleanValue() || this.zzj) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfw)).booleanValue() && !this.zzk;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        return inputStream != null ? inputStream.read(bArr, i, i2) : this.zzb.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final long zzb(zzhw zzhwVar) throws IOException {
        Long l;
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        Uri uri = zzhwVar.zza;
        this.zzh = uri;
        this.zzl = zzhwVar;
        this.zzi = zzbhr.zza(uri);
        zzbho zzbhoVar = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfs)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzhwVar.zze;
                this.zzi.zzi = zzgvb.zza(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbhoVar = com.google.android.gms.ads.internal.zzt.zzj().zzc(this.zzi);
            }
            if (zzbhoVar != null && zzbhoVar.zza()) {
                this.zzj = zzbhoVar.zzg();
                this.zzk = zzbhoVar.zze();
                if (!zzf()) {
                    this.zzf = zzbhoVar.zzb();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzhwVar.zze;
            this.zzi.zzi = zzgvb.zza(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfu);
            } else {
                l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzft);
            }
            long longValue = l.longValue();
            com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzz();
            Future zza = zzbic.zza(this.zza, this.zzi);
            try {
                try {
                    zzbid zzbidVar = (zzbid) zza.get(longValue, TimeUnit.MILLISECONDS);
                    zzbidVar.zzc();
                    this.zzj = zzbidVar.zzd();
                    this.zzk = zzbidVar.zzf();
                    zzbidVar.zze();
                    if (!zzf()) {
                        this.zzf = zzbidVar.zzb();
                    }
                } catch (InterruptedException unused) {
                    zza.cancel(false);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused2) {
                    zza.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            throw null;
        }
        if (this.zzi != null) {
            zzhv zzb = zzhwVar.zzb();
            zzb.zza(Uri.parse(this.zzi.zza));
            this.zzl = zzb.zze();
        }
        return this.zzb.zzb(this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
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

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zze(zziq zziqVar) {
    }
}
