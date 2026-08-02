package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzsr {
    public final int zza;
    public final zzsi zzb;
    private final CopyOnWriteArrayList zzc;

    public zzsr() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    private zzsr(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzsi zzsiVar, long j) {
        this.zzc = copyOnWriteArrayList;
        this.zza = i;
        this.zzb = zzsiVar;
    }

    private static final long zzn(long j) {
        long zzz = zzen.zzz(j);
        if (zzz == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzz;
    }

    public final zzsr zza(int i, zzsi zzsiVar, long j) {
        return new zzsr(this.zzc, i, zzsiVar, 0L);
    }

    public final void zzc(final zzse zzseVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsq zzsqVar = (zzsq) it.next();
            final zzss zzssVar = zzsqVar.zzb;
            zzen.zzY(zzsqVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsl
                @Override // java.lang.Runnable
                public final void run() {
                    zzsr zzsrVar = zzsr.this;
                    zzssVar.zzaf(zzsrVar.zza, zzsrVar.zzb, zzseVar);
                }
            });
        }
    }

    public final void zzd(int i, zzaf zzafVar, int i2, Object obj, long j) {
        zzc(new zzse(1, i, zzafVar, 0, null, zzn(j), -9223372036854775807L));
    }

    public final void zze(final zzrz zzrzVar, final zzse zzseVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsq zzsqVar = (zzsq) it.next();
            final zzss zzssVar = zzsqVar.zzb;
            zzen.zzY(zzsqVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsm
                @Override // java.lang.Runnable
                public final void run() {
                    zzsr zzsrVar = zzsr.this;
                    zzssVar.zzag(zzsrVar.zza, zzsrVar.zzb, zzrzVar, zzseVar);
                }
            });
        }
    }

    public final void zzf(zzrz zzrzVar, int i, int i2, zzaf zzafVar, int i3, Object obj, long j, long j2) {
        zze(zzrzVar, new zzse(1, -1, null, 0, null, zzn(j), zzn(j2)));
    }

    public final void zzg(final zzrz zzrzVar, final zzse zzseVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsq zzsqVar = (zzsq) it.next();
            final zzss zzssVar = zzsqVar.zzb;
            zzen.zzY(zzsqVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsp
                @Override // java.lang.Runnable
                public final void run() {
                    zzsr zzsrVar = zzsr.this;
                    zzssVar.zzah(zzsrVar.zza, zzsrVar.zzb, zzrzVar, zzseVar);
                }
            });
        }
    }

    public final void zzh(zzrz zzrzVar, int i, int i2, zzaf zzafVar, int i3, Object obj, long j, long j2) {
        zzg(zzrzVar, new zzse(1, -1, null, 0, null, zzn(j), zzn(j2)));
    }

    public final void zzi(final zzrz zzrzVar, final zzse zzseVar, final IOException iOException, final boolean z) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsq zzsqVar = (zzsq) it.next();
            final zzss zzssVar = zzsqVar.zzb;
            zzen.zzY(zzsqVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsn
                @Override // java.lang.Runnable
                public final void run() {
                    zzsr zzsrVar = zzsr.this;
                    zzssVar.zzai(zzsrVar.zza, zzsrVar.zzb, zzrzVar, zzseVar, iOException, z);
                }
            });
        }
    }

    public final void zzj(zzrz zzrzVar, int i, int i2, zzaf zzafVar, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        zzi(zzrzVar, new zzse(1, -1, null, 0, null, zzn(j), zzn(j2)), iOException, z);
    }

    public final void zzk(final zzrz zzrzVar, final zzse zzseVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsq zzsqVar = (zzsq) it.next();
            final zzss zzssVar = zzsqVar.zzb;
            zzen.zzY(zzsqVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzso
                @Override // java.lang.Runnable
                public final void run() {
                    zzsr zzsrVar = zzsr.this;
                    zzssVar.zzaj(zzsrVar.zza, zzsrVar.zzb, zzrzVar, zzseVar);
                }
            });
        }
    }

    public final void zzl(zzrz zzrzVar, int i, int i2, zzaf zzafVar, int i3, Object obj, long j, long j2) {
        zzk(zzrzVar, new zzse(1, -1, null, 0, null, zzn(j), zzn(j2)));
    }

    public final void zzm(zzss zzssVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsq zzsqVar = (zzsq) it.next();
            if (zzsqVar.zzb == zzssVar) {
                this.zzc.remove(zzsqVar);
            }
        }
    }

    public final void zzb(Handler handler, zzss zzssVar) {
        Objects.requireNonNull(zzssVar);
        this.zzc.add(new zzsq(handler, zzssVar));
    }
}
