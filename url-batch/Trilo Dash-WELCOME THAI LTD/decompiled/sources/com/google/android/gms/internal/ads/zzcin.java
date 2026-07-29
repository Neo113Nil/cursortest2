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

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzcin implements zzayi {
    private final zzayx zza;
    private final Context zzb;
    private final zzayi zzc;
    private final String zzd;
    private final int zze;
    private InputStream zzg;
    private boolean zzh;
    private Uri zzi;
    private volatile zzbcx zzj;
    private final zzciv zzr;
    private boolean zzk = false;
    private boolean zzl = false;
    private boolean zzm = false;
    private boolean zzn = false;
    private long zzo = 0;
    private final AtomicLong zzq = new AtomicLong(-1);
    private zzfvj zzp = null;
    private final boolean zzf = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbB)).booleanValue();

    public zzcin(Context context, zzayi zzayiVar, String str, int i, zzayx zzayxVar, zzciv zzcivVar, byte[] bArr) {
        this.zzb = context;
        this.zzc = zzayiVar;
        this.zza = zzayxVar;
        this.zzr = zzcivVar;
        this.zzd = str;
        this.zze = i;
    }

    private final void zzl(zzayk zzaykVar) {
        zzayx zzayxVar = this.zza;
        if (zzayxVar != null) {
            ((zzciz) zzayxVar).zzk(this, zzaykVar);
        }
    }

    private final boolean zzm() {
        if (!this.zzf) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdr)).booleanValue() || this.zzm) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzds)).booleanValue() && !this.zzn;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        zzayx zzayxVar;
        if (!this.zzh) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzg;
        int read = inputStream != null ? inputStream.read(bArr, i, i2) : this.zzc.zza(bArr, i, i2);
        if ((!this.zzf || this.zzg != null) && (zzayxVar = this.zza) != null) {
            ((zzciz) zzayxVar).zzW(this, read);
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
    @Override // com.google.android.gms.internal.ads.zzayi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzayk zzaykVar) throws IOException {
        zzbcu zzbcuVar;
        Long l;
        boolean z;
        boolean z2;
        long elapsedRealtime;
        zzbdj zzbdjVar;
        String str = "ms";
        if (this.zzh) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        boolean z3 = true;
        this.zzh = true;
        this.zzi = zzaykVar.zza;
        if (!this.zzf) {
            zzl(zzaykVar);
        }
        this.zzj = zzbcx.zza(zzaykVar.zza);
        ?? r4 = -1;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdo)).booleanValue()) {
            if (this.zzj != null) {
                this.zzj.zzh = zzaykVar.zzc;
                this.zzj.zzi = zzfpg.zzc(this.zzd);
                this.zzj.zzj = this.zze;
                zzbcuVar = com.google.android.gms.ads.internal.zzt.zzc().zzb(this.zzj);
            } else {
                zzbcuVar = null;
            }
            if (zzbcuVar != null && zzbcuVar.zze()) {
                this.zzk = zzbcuVar.zzd();
                this.zzm = zzbcuVar.zzg();
                this.zzn = zzbcuVar.zzf();
                this.zzo = zzbcuVar.zza();
                this.zzl = true;
                if (!zzm()) {
                    this.zzg = zzbcuVar.zzc();
                    if (this.zzf) {
                        zzl(zzaykVar);
                    }
                    return -1L;
                }
            }
        } else if (this.zzj != null) {
            this.zzj.zzh = zzaykVar.zzc;
            this.zzj.zzi = zzfpg.zzc(this.zzd);
            this.zzj.zzj = this.zze;
            if (this.zzj.zzg) {
                l = (Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdq);
            } else {
                l = (Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdp);
            }
            long longValue = l.longValue();
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzd();
            Future zza = zzbdi.zza(this.zzb, this.zzj);
            try {
                try {
                    zzbdjVar = (zzbdj) zza.get(longValue, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    th = th;
                    z3 = r4;
                }
                try {
                    this.zzk = zzbdjVar.zzd();
                    this.zzm = zzbdjVar.zzf();
                    this.zzn = zzbdjVar.zze();
                    this.zzo = zzbdjVar.zza();
                } catch (InterruptedException unused) {
                    z2 = true;
                    zza.cancel(true);
                    Thread.currentThread().interrupt();
                    elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime2;
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
                    return this.zzc.zzb(zzaykVar);
                } catch (ExecutionException | TimeoutException unused2) {
                    z = true;
                    zza.cancel(true);
                    elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime2;
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
                    return this.zzc.zzb(zzaykVar);
                } catch (Throwable th2) {
                    th = th2;
                    long elapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime2;
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
                this.zzg = zzbdjVar.zzc();
                if (this.zzf) {
                    zzl(zzaykVar);
                }
                long elapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime2;
                this.zzr.zza.zzV(true, elapsedRealtime4);
                this.zzl = true;
                com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + elapsedRealtime4 + "ms");
                return -1L;
            }
            long elapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime2;
            this.zzr.zza.zzV(true, elapsedRealtime5);
            this.zzl = true;
            str = "Cache connection took " + elapsedRealtime5 + "ms";
            com.google.android.gms.ads.internal.util.zze.zza(str);
        }
        this.zzl = false;
        if (this.zzj != null) {
            zzaykVar = new zzayk(Uri.parse(this.zzj.zza), null, zzaykVar.zzb, zzaykVar.zzc, zzaykVar.zzd, null, 0);
        }
        return this.zzc.zzb(zzaykVar);
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final Uri zzc() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
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
                this.zzp = zzcfv.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcim
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzcin.this.zzg();
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
