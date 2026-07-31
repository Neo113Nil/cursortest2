package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzpu {
    private final zzbd zza;
    private zzgxm zzb = zzgxm.zzi();
    private zzgxp zzc = zzgxp.zza();

    @Nullable
    private zzxo zzd;
    private zzxo zze;
    private zzxo zzf;

    public zzpu(zzbd zzbdVar) {
        this.zza = zzbdVar;
    }

    private final void zzj(zzbf zzbfVar) {
        zzgxo zzgxoVar = new zzgxo();
        if (this.zzb.isEmpty()) {
            zzk(zzgxoVar, this.zze, zzbfVar);
            if (!Objects.equals(this.zzf, this.zze)) {
                zzk(zzgxoVar, this.zzf, zzbfVar);
            }
            if (!Objects.equals(this.zzd, this.zze) && !Objects.equals(this.zzd, this.zzf)) {
                zzk(zzgxoVar, this.zzd, zzbfVar);
            }
        } else {
            for (int i = 0; i < this.zzb.size(); i++) {
                zzk(zzgxoVar, (zzxo) this.zzb.get(i), zzbfVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzgxoVar, this.zzd, zzbfVar);
            }
        }
        this.zzc = zzgxoVar.zzc();
    }

    private final void zzk(zzgxo zzgxoVar, @Nullable zzxo zzxoVar, zzbf zzbfVar) {
        if (zzxoVar == null) {
            return;
        }
        if (zzbfVar.zze(zzxoVar.zza) != -1) {
            zzgxoVar.zza(zzxoVar, zzbfVar);
            return;
        }
        zzbf zzbfVar2 = (zzbf) this.zzc.get(zzxoVar);
        if (zzbfVar2 != null) {
            zzgxoVar.zza(zzxoVar, zzbfVar2);
        }
    }

    @Nullable
    private static zzxo zzl(zzbb zzbbVar, zzgxm zzgxmVar, @Nullable zzxo zzxoVar, zzbd zzbdVar) {
        zzbf zzq = zzbbVar.zzq();
        int zzr = zzbbVar.zzr();
        Object zzf = zzq.zzg() ? null : zzq.zzf(zzr);
        int zzf2 = (zzbbVar.zzx() || zzq.zzg()) ? -1 : zzq.zzd(zzr, zzbdVar, false).zzf(zzfm.zzt(zzbbVar.zzu()));
        for (int i = 0; i < zzgxmVar.size(); i++) {
            zzxo zzxoVar2 = (zzxo) zzgxmVar.get(i);
            if (zzm(zzxoVar2, zzf, zzbbVar.zzx(), zzbbVar.zzy(), zzbbVar.zzz(), zzf2)) {
                return zzxoVar2;
            }
        }
        if (zzgxmVar.isEmpty() && zzxoVar != null) {
            if (zzm(zzxoVar, zzf, zzbbVar.zzx(), zzbbVar.zzy(), zzbbVar.zzz(), zzf2)) {
                return zzxoVar;
            }
        }
        return null;
    }

    private static boolean zzm(zzxo zzxoVar, @Nullable Object obj, boolean z, int i, int i2, int i3) {
        if (!zzxoVar.zza.equals(obj)) {
            return false;
        }
        if (z) {
            if (zzxoVar.zzb != i || zzxoVar.zzc != i2) {
                return false;
            }
        } else if (zzxoVar.zzb != -1 || zzxoVar.zze != i3) {
            return false;
        }
        return true;
    }

    @Nullable
    public final zzxo zza() {
        return this.zzd;
    }

    @Nullable
    public final zzxo zzb() {
        return this.zze;
    }

    @Nullable
    public final zzxo zzc() {
        return this.zzf;
    }

    @Nullable
    public final zzxo zzd() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        List list = this.zzb;
        if (list != null) {
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = list.get(list.size() - 1);
        } else if (list instanceof SortedSet) {
            obj = ((SortedSet) list).last();
        } else {
            Iterator it = list.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        }
        return (zzxo) obj;
    }

    @Nullable
    public final zzbf zze(zzxo zzxoVar) {
        return (zzbf) this.zzc.get(zzxoVar);
    }

    public final void zzf(zzbb zzbbVar) {
        this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
    }

    public final void zzg(zzbb zzbbVar) {
        this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
        zzj(zzbbVar.zzq());
    }

    public final void zzh(List list, @Nullable zzxo zzxoVar, zzbb zzbbVar) {
        this.zzb = zzgxm.zzq(list);
        if (!list.isEmpty()) {
            this.zze = (zzxo) list.get(0);
            zzxoVar.getClass();
            this.zzf = zzxoVar;
        }
        if (this.zzd == null) {
            this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
        }
        zzj(zzbbVar.zzq());
    }

    final /* synthetic */ zzgxm zzi() {
        return this.zzb;
    }
}
