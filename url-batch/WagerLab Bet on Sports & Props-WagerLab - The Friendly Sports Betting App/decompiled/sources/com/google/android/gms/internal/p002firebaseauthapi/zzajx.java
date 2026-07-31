package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Comparator;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
final class zzajx implements Comparator<zzajv> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzajv zzajvVar, zzajv zzajvVar2) {
        zzajv zzajvVar3 = zzajvVar;
        zzajv zzajvVar4 = zzajvVar2;
        zzakb zzakbVar = (zzakb) zzajvVar3.iterator();
        zzakb zzakbVar2 = (zzakb) zzajvVar4.iterator();
        while (zzakbVar.hasNext() && zzakbVar2.hasNext()) {
            int compare = Integer.compare(zzajv.zza(zzakbVar.zza()), zzajv.zza(zzakbVar2.zza()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzajvVar3.zzb(), zzajvVar4.zzb());
    }

    zzajx() {
    }
}
