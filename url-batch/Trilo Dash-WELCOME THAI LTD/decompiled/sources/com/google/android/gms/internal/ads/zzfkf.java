package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzfkf extends AsyncTask {
    private zzfkg zza;
    protected final zzfjx zzd;

    public zzfkf(zzfjx zzfjxVar, byte[] bArr) {
        this.zzd = zzfjxVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfkg zzfkgVar = this.zza;
        if (zzfkgVar != null) {
            zzfkgVar.zza(this);
        }
    }

    public final void zzb(zzfkg zzfkgVar) {
        this.zza = zzfkgVar;
    }
}
