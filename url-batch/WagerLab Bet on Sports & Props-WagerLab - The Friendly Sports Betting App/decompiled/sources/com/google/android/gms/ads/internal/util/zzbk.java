package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzapd;
import com.google.android.gms.internal.ads.zzaph;
import com.google.android.gms.internal.ads.zzapn;
import com.google.android.gms.internal.ads.zzaqe;
import com.google.android.gms.internal.ads.zzbzm;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes4.dex */
public final class zzbk extends zzaph {
    private final zzbzm zza;
    private final com.google.android.gms.ads.internal.util.client.zzl zzb;

    public zzbk(String str, Map map, zzbzm zzbzmVar) {
        super(0, str, new zzbj(zzbzmVar));
        this.zza = zzbzmVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.zzb = zzlVar;
        zzlVar.zzb(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaph
    protected final zzapn zzr(zzapd zzapdVar) {
        return zzapn.zza(zzapdVar, zzaqe.zza(zzapdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaph
    protected final /* bridge */ /* synthetic */ void zzs(Object obj) {
        zzapd zzapdVar = (zzapd) obj;
        Map map = zzapdVar.zzc;
        int i = zzapdVar.zza;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = this.zzb;
        zzlVar.zzd(map, i);
        byte[] bArr = zzapdVar.zzb;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj() && bArr != null) {
            zzlVar.zzf(bArr);
        }
        this.zza.zzc(zzapdVar);
    }
}
