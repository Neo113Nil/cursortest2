package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfki extends zzfke {
    public zzfki(zzfjx zzfjxVar, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(zzfjxVar, hashSet, jSONObject, j, null);
    }

    private final void zzc(String str) {
        zzfja zza = zzfja.zza();
        if (zza != null) {
            for (zzfip zzfipVar : zza.zzc()) {
                if (this.zza.contains(zzfipVar.zzh())) {
                    zzfipVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfkf, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfkf
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
