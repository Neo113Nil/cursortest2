package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzats;
import com.google.android.gms.internal.ads.zzaty;
import com.google.android.gms.internal.ads.zzaup;
import com.google.android.gms.internal.ads.zzcgo;
import com.ironsource.C4701ic;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzbk extends zzats {
    private final zzcgo zza;
    private final com.google.android.gms.ads.internal.util.client.zzl zzb;

    public zzbk(String str, Map map, zzcgo zzcgoVar) {
        super(0, str, new zzbj(zzcgoVar));
        this.zza = zzcgoVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.zzb = zzlVar;
        zzlVar.zzb(str, C4701ic.a, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzats
    protected final zzaty zzr(zzato zzatoVar) {
        return zzaty.zza(zzatoVar, zzaup.zza(zzatoVar));
    }

    @Override // com.google.android.gms.internal.ads.zzats
    protected final /* bridge */ /* synthetic */ void zzs(Object obj) {
        zzato zzatoVar = (zzato) obj;
        Map map = zzatoVar.zzc;
        int i = zzatoVar.zza;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = this.zzb;
        zzlVar.zzd(map, i);
        byte[] bArr = zzatoVar.zzb;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj() && bArr != null) {
            zzlVar.zzf(bArr);
        }
        this.zza.zzc(zzatoVar);
    }
}
