package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzjt {
    private final zznb zza;
    private final zzjs zze;
    private final zzsr zzf;
    private final zzpk zzg;
    private final HashMap zzh;
    private final Set zzi;
    private boolean zzj;
    private zzfz zzk;
    private zzuc zzl = new zzuc(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();

    public zzjt(zzjs zzjsVar, zzko zzkoVar, Handler handler, zznb zznbVar) {
        this.zza = zznbVar;
        this.zze = zzjsVar;
        zzsr zzsrVar = new zzsr();
        this.zzf = zzsrVar;
        zzpk zzpkVar = new zzpk();
        this.zzg = zzpkVar;
        this.zzh = new HashMap();
        this.zzi = new HashSet();
        zzsrVar.zzb(handler, zzkoVar);
        zzpkVar.zzb(handler, zzkoVar);
    }

    private final void zzp(int i, int i2) {
        while (i < this.zzb.size()) {
            ((zzjr) this.zzb.get(i)).zzd += i2;
            i++;
        }
    }

    private final void zzq(zzjr zzjrVar) {
        zzjq zzjqVar = (zzjq) this.zzh.get(zzjrVar);
        if (zzjqVar != null) {
            zzjqVar.zza.zzi(zzjqVar.zzb);
        }
    }

    private final void zzr() {
        Iterator it = this.zzi.iterator();
        while (it.hasNext()) {
            zzjr zzjrVar = (zzjr) it.next();
            if (zzjrVar.zzc.isEmpty()) {
                zzq(zzjrVar);
                it.remove();
            }
        }
    }

    private final void zzs(zzjr zzjrVar) {
        if (zzjrVar.zze && zzjrVar.zzc.isEmpty()) {
            zzjq zzjqVar = (zzjq) this.zzh.remove(zzjrVar);
            Objects.requireNonNull(zzjqVar);
            zzjqVar.zza.zzp(zzjqVar.zzb);
            zzjqVar.zza.zzs(zzjqVar.zzc);
            zzjqVar.zza.zzr(zzjqVar.zzc);
            this.zzi.remove(zzjrVar);
        }
    }

    private final void zzt(zzjr zzjrVar) {
        zzsd zzsdVar = zzjrVar.zza;
        zzsj zzsjVar = new zzsj() { // from class: com.google.android.gms.internal.ads.zzjo
            @Override // com.google.android.gms.internal.ads.zzsj
            public final void zza(zzsk zzskVar, zzcn zzcnVar) {
                zzjt.this.zze(zzskVar, zzcnVar);
            }
        };
        zzjp zzjpVar = new zzjp(this, zzjrVar);
        this.zzh.put(zzjrVar, new zzjq(zzsdVar, zzsjVar, zzjpVar));
        zzsdVar.zzh(new Handler(zzen.zzE(), null), zzjpVar);
        zzsdVar.zzg(new Handler(zzen.zzE(), null), zzjpVar);
        zzsdVar.zzm(zzsjVar, this.zzk, this.zza);
    }

    private final void zzu(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            zzjr zzjrVar = (zzjr) this.zzb.remove(i2);
            this.zzd.remove(zzjrVar.zzb);
            zzp(i2, -zzjrVar.zza.zzA().zzc());
            zzjrVar.zze = true;
            if (this.zzj) {
                zzs(zzjrVar);
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzcn zzb() {
        if (this.zzb.isEmpty()) {
            return zzcn.zza;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.zzb.size(); i2++) {
            zzjr zzjrVar = (zzjr) this.zzb.get(i2);
            zzjrVar.zzd = i;
            i += zzjrVar.zza.zzA().zzc();
        }
        return new zzjy(this.zzb, this.zzl, null);
    }

    final /* synthetic */ void zze(zzsk zzskVar, zzcn zzcnVar) {
        this.zze.zzh();
    }

    public final void zzf(zzfz zzfzVar) {
        zzdd.zzf(!this.zzj);
        this.zzk = zzfzVar;
        for (int i = 0; i < this.zzb.size(); i++) {
            zzjr zzjrVar = (zzjr) this.zzb.get(i);
            zzt(zzjrVar);
            this.zzi.add(zzjrVar);
        }
        this.zzj = true;
    }

    public final void zzg() {
        for (zzjq zzjqVar : this.zzh.values()) {
            try {
                zzjqVar.zza.zzp(zzjqVar.zzb);
            } catch (RuntimeException e) {
                zzdw.zzc("MediaSourceList", "Failed to release child source.", e);
            }
            zzjqVar.zza.zzs(zzjqVar.zzc);
            zzjqVar.zza.zzr(zzjqVar.zzc);
        }
        this.zzh.clear();
        this.zzi.clear();
        this.zzj = false;
    }

    public final void zzh(zzsg zzsgVar) {
        zzjr zzjrVar = (zzjr) this.zzc.remove(zzsgVar);
        Objects.requireNonNull(zzjrVar);
        zzjrVar.zza.zzB(zzsgVar);
        zzjrVar.zzc.remove(((zzsa) zzsgVar).zza);
        if (!this.zzc.isEmpty()) {
            zzr();
        }
        zzs(zzjrVar);
    }

    public final boolean zzi() {
        return this.zzj;
    }

    public final zzcn zzj(int i, List list, zzuc zzucVar) {
        if (!list.isEmpty()) {
            this.zzl = zzucVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                zzjr zzjrVar = (zzjr) list.get(i2 - i);
                if (i2 > 0) {
                    zzjr zzjrVar2 = (zzjr) this.zzb.get(i2 - 1);
                    zzjrVar.zzc(zzjrVar2.zzd + zzjrVar2.zza.zzA().zzc());
                } else {
                    zzjrVar.zzc(0);
                }
                zzp(i2, zzjrVar.zza.zzA().zzc());
                this.zzb.add(i2, zzjrVar);
                this.zzd.put(zzjrVar.zzb, zzjrVar);
                if (this.zzj) {
                    zzt(zzjrVar);
                    if (this.zzc.isEmpty()) {
                        this.zzi.add(zzjrVar);
                    } else {
                        zzq(zzjrVar);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzcn zzk(int i, int i2, int i3, zzuc zzucVar) {
        zzdd.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final zzcn zzl(int i, int i2, zzuc zzucVar) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= zza()) {
            z = true;
        }
        zzdd.zzd(z);
        this.zzl = zzucVar;
        zzu(i, i2);
        return zzb();
    }

    public final zzcn zzm(List list, zzuc zzucVar) {
        zzu(0, this.zzb.size());
        return zzj(this.zzb.size(), list, zzucVar);
    }

    public final zzcn zzn(zzuc zzucVar) {
        int zza = zza();
        if (zzucVar.zzc() != zza) {
            zzucVar = zzucVar.zzf().zzg(0, zza);
        }
        this.zzl = zzucVar;
        return zzb();
    }

    public final zzsg zzo(zzsi zzsiVar, zzwi zzwiVar, long j) {
        Object obj = ((Pair) zzsiVar.zza).first;
        zzsi zzc = zzsiVar.zzc(((Pair) zzsiVar.zza).second);
        zzjr zzjrVar = (zzjr) this.zzd.get(obj);
        Objects.requireNonNull(zzjrVar);
        this.zzi.add(zzjrVar);
        zzjq zzjqVar = (zzjq) this.zzh.get(zzjrVar);
        if (zzjqVar != null) {
            zzjqVar.zza.zzk(zzjqVar.zzb);
        }
        zzjrVar.zzc.add(zzc);
        zzsa zzD = zzjrVar.zza.zzD(zzc, zzwiVar, j);
        this.zzc.put(zzD, zzjrVar);
        zzr();
        return zzD;
    }
}
