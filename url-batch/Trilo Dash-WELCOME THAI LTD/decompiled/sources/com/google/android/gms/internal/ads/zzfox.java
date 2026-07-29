package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfox extends zzfpc {
    final /* synthetic */ zzfoy zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfox(zzfoy zzfoyVar, zzfpe zzfpeVar, CharSequence charSequence) {
        super(zzfpeVar, charSequence);
        this.zza = zzfoyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpc
    final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfpc
    final int zzd(int i) {
        zzfof zzfofVar = this.zza.zza;
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzfos.zzb(i, length, "index");
        while (i < length) {
            if (zzfofVar.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
