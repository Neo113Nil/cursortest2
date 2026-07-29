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
public final class zzcki extends zzek {
    private final Context zza;
    private final zzer zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbcx zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private zzfvj zzo;
    private final AtomicLong zzp;
    private final zzckl zzq;

    public zzcki(Context context, zzer zzerVar, String str, int i, zzft zzftVar, zzckl zzcklVar, byte[] bArr) {
        super(false);
        this.zza = context;
        this.zzb = zzerVar;
        this.zzq = zzcklVar;
        this.zzc = str;
        this.zzd = i;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = 0L;
        this.zzp = new AtomicLong(-1L);
        this.zzo = null;
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbB)).booleanValue();
        zzf(zzftVar);
    }

    private final boolean zzr() {
        if (!this.zze) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdr)).booleanValue() || this.zzl) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzds)).booleanValue() && !this.zzm;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzp
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
    @Override // com.google.android.gms.internal.ads.zzer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzew zzewVar) throws IOException {
        zzbcu zzbcuVar;
        Long l;
        boolean z;
        boolean z2;
        long elapsedRealtime;
        zzbdj zzbdjVar;
        String str = "ms";
        if (this.zzg) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        boolean z3 = true;
        this.zzg = true;
        this.zzh = zzewVar.zza;
        if (!this.zze) {
            zzj(zzewVar);
        }
        this.zzi = zzbcx.zza(zzewVar.zza);
        ?? r4 = -1;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdo)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzewVar.zzf;
                this.zzi.zzi = zzfpg.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbcuVar = com.google.android.gms.ads.internal.zzt.zzc().zzb(this.zzi);
            } else {
                zzbcuVar = null;
            }
            if (zzbcuVar != null && zzbcuVar.zze()) {
                this.zzj = zzbcuVar.zzd();
                this.zzl = zzbcuVar.zzg();
                this.zzm = zzbcuVar.zzf();
                this.zzn = zzbcuVar.zza();
                this.zzk = true;
                if (!zzr()) {
                    this.zzf = zzbcuVar.zzc();
                    if (this.zze) {
                        zzj(zzewVar);
                    }
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzewVar.zzf;
            this.zzi.zzi = zzfpg.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l = (Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdq);
            } else {
                l = (Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdp);
            }
            long longValue = l.longValue();
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzd();
            Future zza = zzbdi.zza(this.zza, this.zzi);
            try {
                try {
                    zzbdjVar = (zzbdj) zza.get(longValue, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    th = th;
                    z3 = r4;
                }
                try {
                    this.zzj = zzbdjVar.zzd();
                    this.zzl = zzbdjVar.zzf();
                    this.zzm = zzbdjVar.zze();
                    this.zzn = zzbdjVar.zza();
                } catch (InterruptedException unused) {
                    z2 = true;
                    zza.cancel(true);
                    Thread.currentThread().interrupt();
                    elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime2;
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
                    return this.zzb.zzb(zzewVar);
                } catch (ExecutionException | TimeoutException unused2) {
                    z = true;
                    zza.cancel(true);
                    elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime2;
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
                    return this.zzb.zzb(zzewVar);
                } catch (Throwable th2) {
                    th = th2;
                    long elapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime2;
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
                this.zzf = zzbdjVar.zzc();
                if (this.zze) {
                    zzj(zzewVar);
                }
                long elapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime2;
                this.zzq.zza.zzX(true, elapsedRealtime4);
                this.zzk = true;
                com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + elapsedRealtime4 + "ms");
                return -1L;
            }
            long elapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime2;
            this.zzq.zza.zzX(true, elapsedRealtime5);
            this.zzk = true;
            str = "Cache connection took " + elapsedRealtime5 + "ms";
            com.google.android.gms.ads.internal.util.zze.zza(str);
        }
        this.zzk = false;
        if (this.zzi != null) {
            Uri parse = Uri.parse(this.zzi.zza);
            byte[] bArr = zzewVar.zzc;
            long j = zzewVar.zze;
            long j2 = zzewVar.zzf;
            long j3 = zzewVar.zzg;
            String str2 = zzewVar.zzh;
            zzewVar = new zzew(parse, null, j, j2, j3, null, zzewVar.zzi);
        }
        return this.zzb.zzb(zzewVar);
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzer
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
                this.zzo = zzcfv.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzckh
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzcki.this.zzm();
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
