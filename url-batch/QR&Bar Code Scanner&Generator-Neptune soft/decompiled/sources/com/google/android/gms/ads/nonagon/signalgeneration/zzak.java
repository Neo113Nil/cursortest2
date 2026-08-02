package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.internal.ads.zzcbc;
import com.google.android.gms.internal.ads.zzecf;
import com.google.android.gms.internal.ads.zzfyn;
import com.google.android.gms.internal.ads.zzfzg;
import com.google.android.gms.internal.ads.zzfzp;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes.dex */
public final class zzak implements zzfyn {
    private final Executor zza;
    private final zzecf zzb;

    public zzak(Executor executor, zzecf zzecfVar) {
        this.zza = executor;
        this.zzb = zzecfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    public final /* bridge */ /* synthetic */ zzfzp zza(Object obj) throws Exception {
        final zzcbc zzcbcVar = (zzcbc) obj;
        return zzfzg.zzn(this.zzb.zzb(zzcbcVar), new zzfyn() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj2) {
                zzcbc zzcbcVar2 = zzcbc.this;
                zzam zzamVar = new zzam(new JsonReader(new InputStreamReader((InputStream) obj2)));
                try {
                    zzamVar.zzb = zzaw.zzb().zzh(zzcbcVar2.zza).toString();
                } catch (JSONException unused) {
                    zzamVar.zzb = "{}";
                }
                return zzfzg.zzi(zzamVar);
            }
        }, this.zza);
    }
}
