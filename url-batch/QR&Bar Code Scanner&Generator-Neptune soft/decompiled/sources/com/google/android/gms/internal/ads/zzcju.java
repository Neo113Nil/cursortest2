package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcju implements zzazm {
    private final zzbab zza;
    private final Context zzb;
    private final zzazm zzc;
    private final String zzd;
    private final int zze;
    private InputStream zzg;
    private boolean zzh;
    private Uri zzi;
    private volatile zzbeb zzj;
    private final zzckc zzr;
    private boolean zzk = false;
    private boolean zzl = false;
    private boolean zzm = false;
    private boolean zzn = false;
    private long zzo = 0;
    private final AtomicLong zzq = new AtomicLong(-1);
    private zzfzp zzp = null;
    private final boolean zzf = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbD)).booleanValue();

    public zzcju(Context context, zzazm zzazmVar, String str, int i, zzbab zzbabVar, zzckc zzckcVar, byte[] bArr) {
        this.zzb = context;
        this.zzc = zzazmVar;
        this.zza = zzbabVar;
        this.zzr = zzckcVar;
        this.zzd = str;
        this.zze = i;
    }

    private final void zzl(zzazo zzazoVar) {
        zzbab zzbabVar = this.zza;
        if (zzbabVar != null) {
            ((zzckg) zzbabVar).zzk(this, zzazoVar);
        }
    }

    private final boolean zzm() {
        if (!this.zzf) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdx)).booleanValue() || this.zzm) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdy)).booleanValue() && !this.zzn;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzazm
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        zzbab zzbabVar;
        if (!this.zzh) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzg;
        int read = inputStream != null ? inputStream.read(bArr, i, i2) : this.zzc.zza(bArr, i, i2);
        if ((!this.zzf || this.zzg != null) && (zzbabVar = this.zza) != null) {
            ((zzckg) zzbabVar).zzW(this, read);
        }
        return read;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e8  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.zzazm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzazo zzazoVar) throws IOException {
        zzbdy zzbdyVar;
        Long l;
        boolean z;
        boolean z2;
        long elapsedRealtime;
        zzben zzbenVar;
        String str = "ms";
        if (this.zzh) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        boolean z3 = true;
        this.zzh = true;
        this.zzi = zzazoVar.zza;
        if (!this.zzf) {
            zzl(zzazoVar);
        }
        this.zzj = zzbeb.zza(zzazoVar.zza);
        ?? r4 = -1;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdu)).booleanValue()) {
            if (this.zzj != null) {
                this.zzj.zzh = zzazoVar.zzc;
                this.zzj.zzi = zzftm.zzc(this.zzd);
                this.zzj.zzj = this.zze;
                zzbdyVar = com.google.android.gms.ads.internal.zzt.zzc().zzb(this.zzj);
            } else {
                zzbdyVar = null;
            }
            if (zzbdyVar != null && zzbdyVar.zze()) {
                this.zzk = zzbdyVar.zzd();
                this.zzm = zzbdyVar.zzg();
                this.zzn = zzbdyVar.zzf();
                this.zzo = zzbdyVar.zza();
                this.zzl = true;
                if (!zzm()) {
                    this.zzg = zzbdyVar.zzc();
                    if (this.zzf) {
                        zzl(zzazoVar);
                    }
                    return -1L;
                }
            }
        } else if (this.zzj != null) {
            this.zzj.zzh = zzazoVar.zzc;
            this.zzj.zzi = zzftm.zzc(this.zzd);
            this.zzj.zzj = this.zze;
            if (this.zzj.zzg) {
                l = (Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdw);
            } else {
                l = (Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdv);
            }
            long longValue = l.longValue();
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzd();
            Future zza = zzbem.zza(this.zzb, this.zzj);
            try {
                try {
                    zzbenVar = (zzben) zza.get(longValue, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    th = th;
                    z3 = r4;
                }
                try {
                    this.zzk = zzbenVar.zzd();
                    this.zzm = zzbenVar.zzf();
                    this.zzn = zzbenVar.zze();
                    this.zzo = zzbenVar.zza();
                } catch (InterruptedException unused) {
                    z2 = true;
                    zza.cancel(true);
                    Thread.currentThread().interrupt();
                    elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime2;
                    this.zzr.zza.zzV(z2, elapsedRealtime);
                    this.zzl = z2;
                    r4 = new StringBuilder();
                    r4.append("Cache connection took ");
                    r4.append(elapsedRealtime);
                    r4.append("ms");
                    str = r4.toString();
                    com.google.android.gms.ads.internal.util.zze.zza(str);
                    this.zzl = false;
                    if (this.zzj != null) {
                    }
                    return this.zzc.zzb(zzazoVar);
                } catch (ExecutionException | TimeoutException unused2) {
                    z = true;
                    zza.cancel(true);
                    elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime2;
                    this.zzr.zza.zzV(z, elapsedRealtime);
                    this.zzl = z;
                    r4 = new StringBuilder();
                    r4.append("Cache connection took ");
                    r4.append(elapsedRealtime);
                    r4.append("ms");
                    str = r4.toString();
                    com.google.android.gms.ads.internal.util.zze.zza(str);
                    this.zzl = false;
                    if (this.zzj != null) {
                    }
                    return this.zzc.zzb(zzazoVar);
                } catch (Throwable th2) {
                    th = th2;
                    long elapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime2;
                    this.zzr.zza.zzV(z3, elapsedRealtime3);
                    this.zzl = z3;
                    com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + elapsedRealtime3 + str);
                    throw th;
                }
            } catch (InterruptedException unused3) {
                z2 = false;
            } catch (ExecutionException | TimeoutException unused4) {
                z = false;
            } catch (Throwable th3) {
                th = th3;
                z3 = false;
            }
            if (!zzm()) {
                this.zzg = zzbenVar.zzc();
                if (this.zzf) {
                    zzl(zzazoVar);
                }
                long elapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime2;
                this.zzr.zza.zzV(true, elapsedRealtime4);
                this.zzl = true;
                com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + elapsedRealtime4 + "ms");
                return -1L;
            }
            long elapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime2;
            this.zzr.zza.zzV(true, elapsedRealtime5);
            this.zzl = true;
            str = "Cache connection took " + elapsedRealtime5 + "ms";
            com.google.android.gms.ads.internal.util.zze.zza(str);
        }
        this.zzl = false;
        if (this.zzj != null) {
            zzazoVar = new zzazo(Uri.parse(this.zzj.zza), null, zzazoVar.zzb, zzazoVar.zzc, zzazoVar.zzd, null, 0);
        }
        return this.zzc.zzb(zzazoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzazm
    public final Uri zzc() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzazm
    public final void zzd() throws IOException {
        if (!this.zzh) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzh = false;
        this.zzi = null;
        InputStream inputStream = this.zzg;
        if (inputStream == null) {
            this.zzc.zzd();
        } else {
            IOUtils.closeQuietly(inputStream);
            this.zzg = null;
        }
    }

    public final long zze() {
        return this.zzo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long zzf() {
        if (this.zzj == null) {
            return -1L;
        }
        if (this.zzq.get() != -1) {
            return this.zzq.get();
        }
        synchronized (this) {
            if (this.zzp == null) {
                this.zzp = zzchc.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcjt
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzcju.this.zzg();
                    }
                });
            }
        }
        if (!this.zzp.isDone()) {
            return -1L;
        }
        try {
            this.zzq.compareAndSet(-1L, ((Long) this.zzp.get()).longValue());
            return this.zzq.get();
        } catch (InterruptedException | ExecutionException unused) {
            return -1L;
        }
    }

    final /* synthetic */ Long zzg() throws Exception {
        return Long.valueOf(com.google.android.gms.ads.internal.zzt.zzc().zza(this.zzj));
    }

    public final boolean zzh() {
        return this.zzk;
    }

    public final boolean zzi() {
        return this.zzn;
    }

    public final boolean zzj() {
        return this.zzm;
    }

    public final boolean zzk() {
        return this.zzl;
    }
}
