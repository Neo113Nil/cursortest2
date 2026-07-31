package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzbpj implements zzbqh {
    zzbpj() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclm zzclmVar = (zzclm) obj;
        try {
            zzgdn.zzh(zzclmVar.getContext()).zzk();
            zzgdo.zzh(zzclmVar.getContext()).zzj();
            zzgdp.zza(zzclmVar.getContext()).zzb(null);
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
