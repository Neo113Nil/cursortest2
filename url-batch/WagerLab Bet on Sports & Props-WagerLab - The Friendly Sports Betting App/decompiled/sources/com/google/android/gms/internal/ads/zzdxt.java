package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdxt implements zzhpx {
    private final zzhqg zza;

    private zzdxt(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdxt zza(zzhqg zzhqgVar) {
        return new zzdxt(zzhqgVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L13;
     */
    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object zzb() {
        String valueOf;
        zzfdc zza = ((zzcvj) this.zza).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhI)).booleanValue()) {
            String str = zza.zzd.zzx;
            if (!TextUtils.isEmpty(str)) {
                try {
                    valueOf = new JSONObject(str).getString("request_id");
                } catch (JSONException unused) {
                }
            }
            com.google.android.gms.ads.internal.client.zzc zzcVar = zza.zzd.zzs;
            if (zzcVar != null) {
                try {
                    valueOf = new JSONObject(zzcVar.zza).getString("request_id");
                } catch (JSONException unused2) {
                }
            }
        }
        valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbb.zze().nextInt() & Integer.MAX_VALUE);
        zzhqf.zzb(valueOf);
        return valueOf;
    }
}
