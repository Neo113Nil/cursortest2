package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzq extends AsyncTask {
    final /* synthetic */ zzs zza;

    /* synthetic */ zzq(zzs zzsVar, byte[] bArr) {
        Objects.requireNonNull(zzsVar);
        this.zza = zzsVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zza.zzM();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        zzs zzsVar = this.zza;
        String str = (String) obj;
        if (zzsVar.zzV() == null || str == null) {
            return;
        }
        AdMobNetworkBridge.webviewLoadUrl(zzsVar.zzV(), str);
    }
}
