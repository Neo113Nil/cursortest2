package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdxb implements zzhfc {
    private final zzhfu zza;

    public zzdxb(zzhfu zzhfuVar) {
        this.zza = zzhfuVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object zzb() {
        String valueOf;
        zzffg zza = ((zzcwh) this.zza).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgy)).booleanValue()) {
            String str = zza.zzd.zzx;
            if (!TextUtils.isEmpty(str)) {
                try {
                    valueOf = new JSONObject(str).getString("request_id");
                } catch (JSONException unused) {
                }
            }
            if (zza.zzd.zzs != null) {
                try {
                    valueOf = new JSONObject(zza.zzd.zzs.zza).getString("request_id");
                } catch (JSONException unused2) {
                }
            }
        }
        valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzay.zze().nextInt() & Integer.MAX_VALUE);
        zzhfk.zzb(valueOf);
        return valueOf;
    }
}
