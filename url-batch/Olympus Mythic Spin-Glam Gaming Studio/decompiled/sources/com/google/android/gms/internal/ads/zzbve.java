package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzbve implements zzbuq {
    private final zzbus zza;
    private final zzbut zzb;
    private final zzbum zzc;
    private final String zzd;

    zzbve(zzbum zzbumVar, String str, zzbut zzbutVar, zzbus zzbusVar) {
        this.zzc = zzbumVar;
        this.zzd = str;
        this.zzb = zzbutVar;
        this.zza = zzbusVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final ListenableFuture zza(@Nullable Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbuq
    public final ListenableFuture zzb(Object obj) {
        zzcgo zzcgoVar = new zzcgo();
        zzbug zzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzb.zze(new zzbvb(this, zzb, obj, zzcgoVar), new zzbvc(this, zzcgoVar, zzb));
        return zzcgoVar;
    }

    final /* synthetic */ void zzc(zzbug zzbugVar, zzbun zzbunVar, Object obj, zzcgo zzcgoVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            String uuid = UUID.randomUUID().toString();
            zzbqg.zzo.zzb(uuid, new zzbvd(this, zzbugVar, zzcgoVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", this.zzb.zzb(obj));
            zzbunVar.zzb(this.zzd, jSONObject);
        } catch (Exception e) {
            try {
                zzcgoVar.zzd(e);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to invokeJavascript", e);
            } finally {
                zzbugVar.zza();
            }
        }
    }

    final /* synthetic */ zzbus zzd() {
        return this.zza;
    }
}
