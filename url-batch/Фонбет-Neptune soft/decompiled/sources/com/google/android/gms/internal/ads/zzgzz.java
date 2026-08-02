package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgzz {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgzz() {
    }

    static /* bridge */ /* synthetic */ zzgwm zza(zzgzz zzgzzVar, zzgwm zzgwmVar, zzgwm zzgwmVar2) {
        zzgzzVar.zzb(zzgwmVar);
        zzgzzVar.zzb(zzgwmVar2);
        zzgwm zzgwmVar3 = (zzgwm) zzgzzVar.zza.pop();
        while (!zzgzzVar.zza.isEmpty()) {
            zzgwmVar3 = new zzhad((zzgwm) zzgzzVar.zza.pop(), zzgwmVar3);
        }
        return zzgwmVar3;
    }

    private final void zzb(zzgwm zzgwmVar) {
        zzhac zzhacVar;
        if (!zzgwmVar.zzh()) {
            if (!(zzgwmVar instanceof zzhad)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(zzgwmVar.getClass()))));
            }
            zzhad zzhadVar = (zzhad) zzgwmVar;
            zzb(zzhadVar.zzd);
            zzb(zzhadVar.zze);
            return;
        }
        int zzc = zzc(zzgwmVar.zzd());
        ArrayDeque arrayDeque = this.zza;
        int zzc2 = zzhad.zzc(zzc + 1);
        if (arrayDeque.isEmpty() || ((zzgwm) this.zza.peek()).zzd() >= zzc2) {
            this.zza.push(zzgwmVar);
            return;
        }
        int zzc3 = zzhad.zzc(zzc);
        zzgwm zzgwmVar2 = (zzgwm) this.zza.pop();
        while (true) {
            zzhacVar = null;
            if (this.zza.isEmpty() || ((zzgwm) this.zza.peek()).zzd() >= zzc3) {
                break;
            } else {
                zzgwmVar2 = new zzhad((zzgwm) this.zza.pop(), zzgwmVar2);
            }
        }
        zzhad zzhadVar2 = new zzhad(zzgwmVar2, zzgwmVar);
        while (!this.zza.isEmpty()) {
            int zzc4 = zzc(zzhadVar2.zzd()) + 1;
            ArrayDeque arrayDeque2 = this.zza;
            if (((zzgwm) arrayDeque2.peek()).zzd() >= zzhad.zzc(zzc4)) {
                break;
            } else {
                zzhadVar2 = new zzhad((zzgwm) this.zza.pop(), zzhadVar2);
            }
        }
        this.zza.push(zzhadVar2);
    }

    private static final int zzc(int i) {
        int binarySearch = Arrays.binarySearch(zzhad.zza, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* synthetic */ zzgzz(zzgzy zzgzyVar) {
    }
}
