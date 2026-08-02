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
public final class zzclp extends zzer {
    private final Context zza;
    private final zzex zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbeb zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private zzfzp zzo;
    private final AtomicLong zzp;
    private final zzcls zzq;

    public zzclp(Context context, zzex zzexVar, String str, int i, zzfz zzfzVar, zzcls zzclsVar, byte[] bArr) {
        super(false);
        this.zza = context;
        this.zzb = zzexVar;
        this.zzq = zzclsVar;
        this.zzc = str;
        this.zzd = i;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = 0L;
        this.zzp = new AtomicLong(-1L);
        this.zzo = null;
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbD)).booleanValue();
        zzf(zzfzVar);
    }

    private final boolean zzr() {
        if (!this.zze) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdx)).booleanValue() || this.zzl) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdy)).booleanValue() && !this.zzm;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        int read = inputStream != null ? inputStream.read(bArr, i, i2) : this.zzb.zza(bArr, i, i2);
        if (!this.zze || this.zzf != null) {
            zzg(read);
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
    @Override // com.google.android.gms.internal.ads.zzex
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzfc zzfcVar) throws IOException {
        zzbdy zzbdyVar;
        Long l;
        boolean z;
        boolean z2;
        long elapsedRealtime;
        zzben zzbenVar;
        String str = "ms";
        if (this.zzg) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        boolean z3 = true;
        this.zzg = true;
        this.zzh = zzfcVar.zza;
        if (!this.zze) {
            zzj(zzfcVar);
        }
        this.zzi = zzbeb.zza(zzfcVar.zza);
        ?? r4 = -1;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdu)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzfcVar.zzf;
                this.zzi.zzi = zzftm.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbdyVar = com.google.android.gms.ads.internal.zzt.zzc().zzb(this.zzi);
            } else {
                zzbdyVar = null;
            }
            if (zzbdyVar != null && zzbdyVar.zze()) {
                this.zzj = zzbdyVar.zzd();
                this.zzl = zzbdyVar.zzg();
                this.zzm = zzbdyVar.zzf();
                this.zzn = zzbdyVar.zza();
                this.zzk = true;
                if (!zzr()) {
                    this.zzf = zzbdyVar.zzc();
                    if (this.zze) {
                        zzj(zzfcVar);
                    }
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzfcVar.zzf;
            this.zzi.zzi = zzftm.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l = (Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdw);
            } else {
                l = (Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdv);
            }
            long longValue = l.longValue();
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzd();
            Future zza = zzbem.zza(this.zza, this.zzi);
            try {
                try {
                    zzbenVar = (zzben) zza.get(longValue, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    th = th;
                    z3 = r4;
                }
                try {
                    this.zzj = zzbenVar.zzd();
                    this.zzl = zzbenVar.zzf();
                    this.zzm = zzbenVar.zze();
                    this.zzn = zzbenVar.zza();
                } catch (InterruptedException unused) {
                    z2 = true;
                    zza.cancel(true);
                    Thread.currentThread().interrupt();
                    elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime2;
                    this.zzq.zza.zzX(z2, elapsedRealtime);
                    this.zzk = z2;
                    r4 = new StringBuilder();
                    r4.append("Cache connection took ");
                    r4.append(elapsedRealtime);
                    r4.append("ms");
                    str = r4.toString();
                    com.google.android.gms.ads.internal.util.zze.zza(str);
                    this.zzk = false;
                    if (this.zzi != null) {
                    }
                    return this.zzb.zzb(zzfcVar);
                } catch (ExecutionException | TimeoutException unused2) {
                    z = true;
                    zza.cancel(true);
                    elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime2;
                    this.zzq.zza.zzX(z, elapsedRealtime);
                    this.zzk = z;
                    r4 = new StringBuilder();
                    r4.append("Cache connection took ");
                    r4.append(elapsedRealtime);
                    r4.append("ms");
                    str = r4.toString();
                    com.google.android.gms.ads.internal.util.zze.zza(str);
                    this.zzk = false;
                    if (this.zzi != null) {
                    }
                    return this.zzb.zzb(zzfcVar);
                } catch (Throwable th2) {
                    th = th2;
                    long elapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime2;
                    this.zzq.zza.zzX(z3, elapsedRealtime3);
                    this.zzk = z3;
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
            if (!zzr()) {
                this.zzf = zzbenVar.zzc();
                if (this.zze) {
                    zzj(zzfcVar);
                }
                long elapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime2;
                this.zzq.zza.zzX(true, elapsedRealtime4);
                this.zzk = true;
                com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + elapsedRealtime4 + "ms");
                return -1L;
            }
            long elapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime2;
            this.zzq.zza.zzX(true, elapsedRealtime5);
            this.zzk = true;
            str = "Cache connection took " + elapsedRealtime5 + "ms";
            com.google.android.gms.ads.internal.util.zze.zza(str);
        }
        this.zzk = false;
        if (this.zzi != null) {
            Uri parse = Uri.parse(this.zzi.zza);
            byte[] bArr = zzfcVar.zzc;
            long j = zzfcVar.zze;
            long j2 = zzfcVar.zzf;
            long j3 = zzfcVar.zzg;
            String str2 = zzfcVar.zzh;
            zzfcVar = new zzfc(parse, null, j, j2, j3, null, zzfcVar.zzi);
        }
        return this.zzb.zzb(zzfcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        boolean z = (this.zze && this.zzf == null) ? false : true;
        InputStream inputStream = this.zzf;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.zzf = null;
        } else {
            this.zzb.zzd();
        }
        if (z) {
            zzh();
        }
    }

    public final long zzk() {
        return this.zzn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long zzl() {
        if (this.zzi == null) {
            return -1L;
        }
        if (this.zzp.get() != -1) {
            return this.zzp.get();
        }
        synchronized (this) {
            if (this.zzo == null) {
                this.zzo = zzchc.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzclo
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzclp.this.zzm();
                    }
                });
            }
        }
        if (!this.zzo.isDone()) {
            return -1L;
        }
        try {
            this.zzp.compareAndSet(-1L, ((Long) this.zzo.get()).longValue());
            return this.zzp.get();
        } catch (InterruptedException | ExecutionException unused) {
            return -1L;
        }
    }

    final /* synthetic */ Long zzm() throws Exception {
        return Long.valueOf(com.google.android.gms.ads.internal.zzt.zzc().zza(this.zzi));
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final boolean zzo() {
        return this.zzm;
    }

    public final boolean zzp() {
        return this.zzl;
    }

    public final boolean zzq() {
        return this.zzk;
    }
}
