package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzfmk extends AsyncTask {
    private zzfml zza;
    protected final zzfmc zzd;

    public zzfmk(zzfmc zzfmcVar, byte[] bArr) {
        this.zzd = zzfmcVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfml zzfmlVar = this.zza;
        if (zzfmlVar != null) {
            zzfmlVar.zza(this);
        }
    }

    public final void zzb(zzfml zzfmlVar) {
        this.zza = zzfmlVar;
    }
}
