package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
final class zzftd extends zzfti {
    final /* synthetic */ zzfte zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzftd(zzfte zzfteVar, zzftk zzftkVar, CharSequence charSequence) {
        super(zzftkVar, charSequence);
        this.zza = zzfteVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    final int zzd(int i) {
        zzfsj zzfsjVar = this.zza.zza;
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzfsx.zzb(i, length, "index");
        while (i < length) {
            if (zzfsjVar.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
