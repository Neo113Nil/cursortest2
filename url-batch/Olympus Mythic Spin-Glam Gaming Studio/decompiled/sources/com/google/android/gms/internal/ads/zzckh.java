package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzckh extends zzhk {
    private final Context zza;
    private final zzhs zzb;
    private final zzckf zzc;
    private final String zzd;
    private final int zze;
    private final boolean zzf;
    private InputStream zzg;
    private boolean zzh;
    private Uri zzi;
    private volatile zzbhr zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private long zzo;
    private ListenableFuture zzp;
    private final AtomicLong zzq;

    public zzckh(Context context, zzhs zzhsVar, String str, int i, zziq zziqVar, zzckf zzckfVar) {
        super(false);
        this.zza = context;
        this.zzb = zzhsVar;
        this.zzc = zzckfVar;
        this.zzd = str;
        this.zze = i;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = 0L;
        this.zzq = new AtomicLong(-1L);
        this.zzp = null;
        this.zzf = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcG)).booleanValue();
        zze(zziqVar);
    }

    private final boolean zzr() {
        if (!this.zzf) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfv)).booleanValue() || this.zzm) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfw)).booleanValue() && !this.zzn;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (!this.zzh) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.zzg;
        int read = inputStream != null ? inputStream.read(bArr, i, i2) : this.zzb.zza(bArr, i, i2);
        if (!this.zzf || this.zzg != null) {
            zzh(read);
        }
        return read;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0208  */
    @Override // com.google.android.gms.internal.ads.zzhs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzhw zzhwVar) throws IOException {
        zzbho zzbhoVar;
        Long l;
        boolean z;
        boolean z2;
        long elapsedRealtime;
        StringBuilder sb;
        zzbid zzbidVar;
        if (this.zzh) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        boolean z3 = true;
        this.zzh = true;
        Uri uri = zzhwVar.zza;
        this.zzi = uri;
        boolean z4 = this.zzf;
        if (!z4) {
            zzg(zzhwVar);
        }
        this.zzj = zzbhr.zza(uri);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfs)).booleanValue()) {
            if (this.zzj != null) {
                this.zzj.zzh = zzhwVar.zze;
                this.zzj.zzi = zzgvb.zza(this.zzd);
                this.zzj.zzj = this.zze;
                zzbhoVar = com.google.android.gms.ads.internal.zzt.zzj().zzc(this.zzj);
            } else {
                zzbhoVar = null;
            }
            if (zzbhoVar != null && zzbhoVar.zza()) {
                this.zzk = zzbhoVar.zzd();
                this.zzm = zzbhoVar.zzg();
                this.zzn = zzbhoVar.zze();
                this.zzo = zzbhoVar.zzf();
                this.zzl = true;
                if (!zzr()) {
                    this.zzg = zzbhoVar.zzb();
                    if (this.zzf) {
                        zzg(zzhwVar);
                    }
                    return -1L;
                }
            }
        } else if (this.zzj != null) {
            this.zzj.zzh = zzhwVar.zze;
            this.zzj.zzi = zzgvb.zza(this.zzd);
            this.zzj.zzj = this.zze;
            if (this.zzj.zzg) {
                l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfu);
            } else {
                l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzft);
            }
            long longValue = l.longValue();
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzz();
            Future zza = zzbic.zza(this.zza, this.zzj);
            try {
                try {
                    zzbidVar = (zzbid) zza.get(longValue, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    th = th;
                    z3 = z4;
                }
            } catch (InterruptedException unused) {
                z2 = false;
            } catch (ExecutionException | TimeoutException unused2) {
                z = false;
            } catch (Throwable th2) {
                th = th2;
                z3 = false;
            }
            try {
                this.zzk = zzbidVar.zzc();
                this.zzm = zzbidVar.zzd();
                this.zzn = zzbidVar.zzf();
                this.zzo = zzbidVar.zze();
            } catch (InterruptedException unused3) {
                z2 = true;
                zza.cancel(true);
                Thread.currentThread().interrupt();
                elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime2;
                this.zzc.zza(z2, elapsedRealtime);
                this.zzl = z2;
                int length = String.valueOf(elapsedRealtime).length() + 24;
                sb = new StringBuilder(length);
                z4 = length;
                sb.append("Cache connection took ");
                sb.append(elapsedRealtime);
                sb.append("ms");
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                this.zzl = false;
                if (this.zzj != null) {
                }
                return this.zzb.zzb(zzhwVar);
            } catch (ExecutionException | TimeoutException unused4) {
                z = true;
                zza.cancel(true);
                elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime2;
                this.zzc.zza(z, elapsedRealtime);
                this.zzl = z;
                int length2 = String.valueOf(elapsedRealtime).length() + 24;
                sb = new StringBuilder(length2);
                z4 = length2;
                sb.append("Cache connection took ");
                sb.append(elapsedRealtime);
                sb.append("ms");
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                this.zzl = false;
                if (this.zzj != null) {
                }
                return this.zzb.zzb(zzhwVar);
            } catch (Throwable th3) {
                th = th3;
                long elapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime2;
                this.zzc.zza(z3, elapsedRealtime3);
                this.zzl = z3;
                StringBuilder sb2 = new StringBuilder(String.valueOf(elapsedRealtime3).length() + 24);
                sb2.append("Cache connection took ");
                sb2.append(elapsedRealtime3);
                sb2.append("ms");
                com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                throw th;
            }
            if (!zzr()) {
                this.zzg = zzbidVar.zzb();
                if (z4) {
                    zzg(zzhwVar);
                }
                long elapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime2;
                this.zzc.zza(true, elapsedRealtime4);
                this.zzl = true;
                StringBuilder sb3 = new StringBuilder(String.valueOf(elapsedRealtime4).length() + 24);
                sb3.append("Cache connection took ");
                sb3.append(elapsedRealtime4);
                sb3.append("ms");
                com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                return -1L;
            }
            long elapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime2;
            this.zzc.zza(true, elapsedRealtime5);
            this.zzl = true;
            sb = new StringBuilder(String.valueOf(elapsedRealtime5).length() + 24);
            sb.append("Cache connection took ");
            sb.append(elapsedRealtime5);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        this.zzl = false;
        if (this.zzj != null) {
            zzhv zzb = zzhwVar.zzb();
            zzb.zza(Uri.parse(this.zzj.zza));
            zzhwVar = zzb.zze();
        }
        return this.zzb.zzb(zzhwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Uri zzc() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() throws IOException {
        if (!this.zzh) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.zzh = false;
        this.zzi = null;
        boolean z = (this.zzf && this.zzg == null) ? false : true;
        InputStream inputStream = this.zzg;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.zzg = null;
        } else {
            this.zzb.zzd();
        }
        if (z) {
            zzi();
        }
    }

    public final boolean zzk() {
        return this.zzk;
    }

    public final boolean zzl() {
        return this.zzl;
    }

    public final boolean zzm() {
        return this.zzm;
    }

    public final boolean zzn() {
        return this.zzn;
    }

    public final long zzo() {
        return this.zzo;
    }

    public final long zzp() {
        if (this.zzj != null) {
            AtomicLong atomicLong = this.zzq;
            if (atomicLong.get() != -1) {
                return atomicLong.get();
            }
            synchronized (this) {
                try {
                    if (this.zzp == null) {
                        this.zzp = zzcgj.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzckg
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                return zzckh.this.zzq();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.zzp.isDone()) {
                try {
                    this.zzq.compareAndSet(-1L, ((Long) this.zzp.get()).longValue());
                    return this.zzq.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    final /* synthetic */ Long zzq() {
        return Long.valueOf(com.google.android.gms.ads.internal.zzt.zzj().zzd(this.zzj));
    }
}
