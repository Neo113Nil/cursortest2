package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes5.dex */
public final class zzboh implements zzbnt {
    private final zzbnv zza;
    private final zzbnw zzb;
    private final zzbnp zzc;
    private final String zzd;

    zzboh(zzbnp zzbnpVar, String str, zzbnw zzbnwVar, zzbnv zzbnvVar) {
        this.zzc = zzbnpVar;
        this.zzd = str;
        this.zzb = zzbnwVar;
        this.zza = zzbnvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbnt
    public final ListenableFuture zzb(Object obj) {
        zzbzm zzbzmVar = new zzbzm();
        zzbnj zzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzb.zze(new zzboe(this, zzb, obj, zzbzmVar), new zzbof(this, zzbzmVar, zzb));
        return zzbzmVar;
    }

    final /* synthetic */ void zzc(zzbnj zzbnjVar, zzbnq zzbnqVar, Object obj, zzbzm zzbzmVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            String uuid = UUID.randomUUID().toString();
            zzbjk.zzo.zzb(uuid, new zzbog(this, zzbnjVar, zzbzmVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", this.zzb.zzb(obj));
            zzbnqVar.zzb(this.zzd, jSONObject);
        } catch (Exception e) {
            try {
                zzbzmVar.zzd(e);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to invokeJavascript", e);
            } finally {
                zzbnjVar.zza();
            }
        }
    }

    final /* synthetic */ zzbnv zzd() {
        return this.zza;
    }
}
