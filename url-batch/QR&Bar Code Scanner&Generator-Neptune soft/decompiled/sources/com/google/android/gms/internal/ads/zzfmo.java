package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfmo extends zzfmj {
    public zzfmo(zzfmc zzfmcVar, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(zzfmcVar, hashSet, jSONObject, j, null);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzflw.zzj(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfmk, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfmk
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzflg zza;
        if (!TextUtils.isEmpty(str) && (zza = zzflg.zza()) != null) {
            for (zzfkv zzfkvVar : zza.zzc()) {
                if (this.zza.contains(zzfkvVar.zzh())) {
                    zzfkvVar.zzg().zze(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
