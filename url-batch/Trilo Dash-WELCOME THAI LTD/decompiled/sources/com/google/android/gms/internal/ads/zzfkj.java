package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfkj extends zzfke {
    public zzfkj(zzfjx zzfjxVar, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(zzfjxVar, hashSet, jSONObject, j, null);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfjr.zzi(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfkf, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfkf
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzfja zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfja.zza()) != null) {
            for (zzfip zzfipVar : zza.zzc()) {
                if (this.zza.contains(zzfipVar.zzh())) {
                    zzfipVar.zzg().zze(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
