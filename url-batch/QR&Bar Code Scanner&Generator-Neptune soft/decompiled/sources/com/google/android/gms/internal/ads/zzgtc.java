package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgtc {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgtc() {
    }

    static /* bridge */ /* synthetic */ zzgpw zza(zzgtc zzgtcVar, zzgpw zzgpwVar, zzgpw zzgpwVar2) {
        zzgtcVar.zzb(zzgpwVar);
        zzgtcVar.zzb(zzgpwVar2);
        zzgpw zzgpwVar3 = (zzgpw) zzgtcVar.zza.pop();
        while (!zzgtcVar.zza.isEmpty()) {
            zzgpwVar3 = new zzgtg((zzgpw) zzgtcVar.zza.pop(), zzgpwVar3);
        }
        return zzgpwVar3;
    }

    private final void zzb(zzgpw zzgpwVar) {
        zzgtf zzgtfVar;
        if (!zzgpwVar.zzh()) {
            if (!(zzgpwVar instanceof zzgtg)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(zzgpwVar.getClass()))));
            }
            zzgtg zzgtgVar = (zzgtg) zzgpwVar;
            zzb(zzgtgVar.zzd);
            zzb(zzgtgVar.zze);
            return;
        }
        int zzc = zzc(zzgpwVar.zzd());
        int zzc2 = zzgtg.zzc(zzc + 1);
        if (this.zza.isEmpty() || ((zzgpw) this.zza.peek()).zzd() >= zzc2) {
            this.zza.push(zzgpwVar);
            return;
        }
        int zzc3 = zzgtg.zzc(zzc);
        zzgpw zzgpwVar2 = (zzgpw) this.zza.pop();
        while (true) {
            zzgtfVar = null;
            if (this.zza.isEmpty() || ((zzgpw) this.zza.peek()).zzd() >= zzc3) {
                break;
            } else {
                zzgpwVar2 = new zzgtg((zzgpw) this.zza.pop(), zzgpwVar2);
            }
        }
        zzgtg zzgtgVar2 = new zzgtg(zzgpwVar2, zzgpwVar);
        while (!this.zza.isEmpty()) {
            if (((zzgpw) this.zza.peek()).zzd() >= zzgtg.zzc(zzc(zzgtgVar2.zzd()) + 1)) {
                break;
            } else {
                zzgtgVar2 = new zzgtg((zzgpw) this.zza.pop(), zzgtgVar2);
            }
        }
        this.zza.push(zzgtgVar2);
    }

    private static final int zzc(int i) {
        int binarySearch = Arrays.binarySearch(zzgtg.zza, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* synthetic */ zzgtc(zzgtb zzgtbVar) {
    }
}
