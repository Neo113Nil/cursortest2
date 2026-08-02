package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzmr {
    private final zzck zza;
    private zzfvn zzb = zzfvn.zzo();
    private zzfvq zzc = zzfvq.zzd();
    private zzsi zzd;
    private zzsi zze;
    private zzsi zzf;

    public zzmr(zzck zzckVar) {
        this.zza = zzckVar;
    }

    private static zzsi zzj(zzcg zzcgVar, zzfvn zzfvnVar, zzsi zzsiVar, zzck zzckVar) {
        zzcn zzn = zzcgVar.zzn();
        int zzg = zzcgVar.zzg();
        Object zzf = zzn.zzo() ? null : zzn.zzf(zzg);
        int zzc = (zzcgVar.zzs() || zzn.zzo()) ? -1 : zzn.zzd(zzg, zzckVar, false).zzc(zzen.zzv(zzcgVar.zzl()));
        for (int i = 0; i < zzfvnVar.size(); i++) {
            zzsi zzsiVar2 = (zzsi) zzfvnVar.get(i);
            if (zzm(zzsiVar2, zzf, zzcgVar.zzs(), zzcgVar.zzd(), zzcgVar.zze(), zzc)) {
                return zzsiVar2;
            }
        }
        if (zzfvnVar.isEmpty() && zzsiVar != null) {
            if (zzm(zzsiVar, zzf, zzcgVar.zzs(), zzcgVar.zzd(), zzcgVar.zze(), zzc)) {
                return zzsiVar;
            }
        }
        return null;
    }

    private final void zzk(zzfvp zzfvpVar, zzsi zzsiVar, zzcn zzcnVar) {
        if (zzsiVar == null) {
            return;
        }
        if (zzcnVar.zza(zzsiVar.zza) != -1) {
            zzfvpVar.zza(zzsiVar, zzcnVar);
            return;
        }
        zzcn zzcnVar2 = (zzcn) this.zzc.get(zzsiVar);
        if (zzcnVar2 != null) {
            zzfvpVar.zza(zzsiVar, zzcnVar2);
        }
    }

    private final void zzl(zzcn zzcnVar) {
        zzfvp zzfvpVar = new zzfvp();
        if (this.zzb.isEmpty()) {
            zzk(zzfvpVar, this.zze, zzcnVar);
            if (!zzfss.zza(this.zzf, this.zze)) {
                zzk(zzfvpVar, this.zzf, zzcnVar);
            }
            if (!zzfss.zza(this.zzd, this.zze) && !zzfss.zza(this.zzd, this.zzf)) {
                zzk(zzfvpVar, this.zzd, zzcnVar);
            }
        } else {
            for (int i = 0; i < this.zzb.size(); i++) {
                zzk(zzfvpVar, (zzsi) this.zzb.get(i), zzcnVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzfvpVar, this.zzd, zzcnVar);
            }
        }
        this.zzc = zzfvpVar.zzc();
    }

    private static boolean zzm(zzsi zzsiVar, Object obj, boolean z, int i, int i2, int i3) {
        if (!zzsiVar.zza.equals(obj)) {
            return false;
        }
        if (z) {
            if (zzsiVar.zzb != i || zzsiVar.zzc != i2) {
                return false;
            }
        } else if (zzsiVar.zzb != -1 || zzsiVar.zze != i3) {
            return false;
        }
        return true;
    }

    public final zzcn zza(zzsi zzsiVar) {
        return (zzcn) this.zzc.get(zzsiVar);
    }

    public final zzsi zzb() {
        return this.zzd;
    }

    public final zzsi zzc() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfvn zzfvnVar = this.zzb;
        if (!(zzfvnVar instanceof List)) {
            Iterator<E> it = zzfvnVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else {
            if (zzfvnVar.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = zzfvnVar.get(zzfvnVar.size() - 1);
        }
        return (zzsi) obj;
    }

    public final zzsi zzd() {
        return this.zze;
    }

    public final zzsi zze() {
        return this.zzf;
    }

    public final void zzg(zzcg zzcgVar) {
        this.zzd = zzj(zzcgVar, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, zzsi zzsiVar, zzcg zzcgVar) {
        this.zzb = zzfvn.zzm(list);
        if (!list.isEmpty()) {
            this.zze = (zzsi) list.get(0);
            Objects.requireNonNull(zzsiVar);
            this.zzf = zzsiVar;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzcgVar, this.zzb, this.zze, this.zza);
        }
        zzl(zzcgVar.zzn());
    }

    public final void zzi(zzcg zzcgVar) {
        this.zzd = zzj(zzcgVar, this.zzb, this.zze, this.zza);
        zzl(zzcgVar.zzn());
    }
}
