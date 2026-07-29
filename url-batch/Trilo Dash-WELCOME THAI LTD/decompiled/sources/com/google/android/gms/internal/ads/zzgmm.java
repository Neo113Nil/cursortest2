package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzgmm {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgmm() {
    }

    static /* bridge */ /* synthetic */ zzgjg zza(zzgmm zzgmmVar, zzgjg zzgjgVar, zzgjg zzgjgVar2) {
        zzgmmVar.zzb(zzgjgVar);
        zzgmmVar.zzb(zzgjgVar2);
        zzgjg zzgjgVar3 = (zzgjg) zzgmmVar.zza.pop();
        while (!zzgmmVar.zza.isEmpty()) {
            zzgjgVar3 = new zzgmq((zzgjg) zzgmmVar.zza.pop(), zzgjgVar3);
        }
        return zzgjgVar3;
    }

    private final void zzb(zzgjg zzgjgVar) {
        zzgmp zzgmpVar;
        if (!zzgjgVar.zzh()) {
            if (!(zzgjgVar instanceof zzgmq)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(zzgjgVar.getClass()))));
            }
            zzgmq zzgmqVar = (zzgmq) zzgjgVar;
            zzb(zzgmqVar.zzd);
            zzb(zzgmqVar.zze);
            return;
        }
        int zzc = zzc(zzgjgVar.zzd());
        int zzc2 = zzgmq.zzc(zzc + 1);
        if (this.zza.isEmpty() || ((zzgjg) this.zza.peek()).zzd() >= zzc2) {
            this.zza.push(zzgjgVar);
            return;
        }
        int zzc3 = zzgmq.zzc(zzc);
        zzgjg zzgjgVar2 = (zzgjg) this.zza.pop();
        while (true) {
            zzgmpVar = null;
            if (this.zza.isEmpty() || ((zzgjg) this.zza.peek()).zzd() >= zzc3) {
                break;
            } else {
                zzgjgVar2 = new zzgmq((zzgjg) this.zza.pop(), zzgjgVar2);
            }
        }
        zzgmq zzgmqVar2 = new zzgmq(zzgjgVar2, zzgjgVar);
        while (!this.zza.isEmpty()) {
            if (((zzgjg) this.zza.peek()).zzd() >= zzgmq.zzc(zzc(zzgmqVar2.zzd()) + 1)) {
                break;
            } else {
                zzgmqVar2 = new zzgmq((zzgjg) this.zza.pop(), zzgmqVar2);
            }
        }
        this.zza.push(zzgmqVar2);
    }

    private static final int zzc(int i) {
        int binarySearch = Arrays.binarySearch(zzgmq.zza, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* synthetic */ zzgmm(zzgml zzgmlVar) {
    }
}
