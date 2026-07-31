package com.google.android.gms.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.location.zzg;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes5.dex */
public class ActivityRecognition {
    public static final Api API;
    public static final ActivityRecognitionApi ActivityRecognitionApi;
    private static final Api.ClientKey zza;
    private static final Api.AbstractClientBuilder zzb;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zza zzaVar = new zza();
        zzb = zzaVar;
        API = new Api("ActivityRecognition.API", zzaVar, clientKey);
        ActivityRecognitionApi = new zzg();
    }

    private ActivityRecognition() {
    }
}
