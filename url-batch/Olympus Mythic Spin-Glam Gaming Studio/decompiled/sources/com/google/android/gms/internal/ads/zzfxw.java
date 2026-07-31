package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public abstract class zzfxw extends AsyncTask {
    private zzfxx zza;
    protected final zzfxo zzd;

    public zzfxw(zzfxo zzfxoVar) {
        this.zzd = zzfxoVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfxx zzfxxVar = this.zza;
        if (zzfxxVar != null) {
            zzfxxVar.zzb(this);
        }
    }

    public final void zzb(zzfxx zzfxxVar) {
        this.zza = zzfxxVar;
    }
}
