package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfmn extends zzfmj {
    public zzfmn(zzfmc zzfmcVar, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(zzfmcVar, hashSet, jSONObject, j, null);
    }

    private final void zzc(String str) {
        zzflg zza = zzflg.zza();
        if (zza != null) {
            for (zzfkv zzfkvVar : zza.zzc()) {
                if (this.zza.contains(zzfkvVar.zzh())) {
                    zzfkvVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfmk, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfmk
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
