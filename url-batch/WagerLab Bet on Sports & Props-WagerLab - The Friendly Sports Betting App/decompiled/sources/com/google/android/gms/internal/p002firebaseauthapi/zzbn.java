package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzxh;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzbn {
    private final List<zzbq> zza = new ArrayList();
    private zzok zzb = zzok.zza;
    private boolean zzc = false;

    public final zzbn zza(zzbq zzbqVar) {
        if (zzbqVar.zze != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzbqVar.zza) {
            zzb();
        }
        zzbqVar.zze = this;
        this.zza.add(zzbqVar);
        return this;
    }

    public final zzbm zza() throws GeneralSecurityException {
        zzbm zzb;
        zzbp zzbpVar;
        int zza;
        zzbu zzbuVar;
        zzxh.zzb zzb2;
        zzbp zzbpVar2;
        zzbp zzbpVar3;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        zzxh.zza zzc = zzxh.zzc();
        ArrayList arrayList = new ArrayList(this.zza.size());
        List<zzbq> list = this.zza;
        for (int i = 0; i < list.size() - 1; i++) {
            zzbp zzbpVar4 = list.get(i).zzd;
            zzbpVar2 = zzbp.zza;
            if (zzbpVar4 == zzbpVar2) {
                zzbp zzbpVar5 = list.get(i + 1).zzd;
                zzbpVar3 = zzbp.zza;
                if (zzbpVar5 != zzbpVar3) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (zzbq zzbqVar : this.zza) {
            if (zzbqVar.zzb == null) {
                throw new GeneralSecurityException("Key Status not set.");
            }
            if (zzbqVar.zzd == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            zzbp zzbpVar6 = zzbqVar.zzd;
            zzbpVar = zzbp.zza;
            if (zzbpVar6 == zzbpVar) {
                zza = 0;
                while (true) {
                    if (zza != 0 && !hashSet.contains(Integer.valueOf(zza))) {
                        break;
                    }
                    zza = zzqn.zza();
                }
            } else {
                zza = zzbp.zza(zzbqVar.zzd);
            }
            int i2 = zza;
            if (hashSet.contains(Integer.valueOf(i2))) {
                throw new GeneralSecurityException("Id " + i2 + " is used twice in the keyset");
            }
            hashSet.add(Integer.valueOf(i2));
            zzbi zza2 = zzop.zza().zza(zzbqVar.zzc, zzbqVar.zzc.zza() ? Integer.valueOf(i2) : null);
            zzxc zza3 = zzbm.zza(zzbqVar.zzb);
            boolean z = zzbqVar.zza;
            zzbuVar = zzbs.zza;
            zzbs zzbsVar = new zzbs(zza2, zza3, i2, z, false, zzbuVar);
            zzb2 = zzbm.zzb(zza2, zzbm.zza(zzbqVar.zzb), i2);
            zzc.zza(zzb2);
            if (zzbqVar.zza) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                num = Integer.valueOf(i2);
                if (zzbqVar.zzb != zzbk.zza) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
            }
            arrayList.add(zzbsVar);
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzc.zza(num.intValue());
        zzxh zzxhVar = (zzxh) ((zzalf) zzc.zze());
        zzbm.zzd(zzxhVar);
        zzb = zzbm.zzb(new zzbm(zzxhVar, arrayList, this.zzb));
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb() {
        Iterator<zzbq> it = this.zza.iterator();
        while (it.hasNext()) {
            it.next().zza = false;
        }
    }
}
