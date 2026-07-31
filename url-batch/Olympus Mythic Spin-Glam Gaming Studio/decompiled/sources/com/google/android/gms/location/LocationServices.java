package com.google.android.gms.location;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzaf;
import com.google.android.gms.internal.location.zzz;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes8.dex */
public class LocationServices {
    public static final Api API;
    public static final FusedLocationProviderApi FusedLocationApi;
    public static final GeofencingApi GeofencingApi;
    public static final SettingsApi SettingsApi;
    private static final Api.ClientKey zza;
    private static final Api.AbstractClientBuilder zzb;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzbh zzbhVar = new zzbh();
        zzb = zzbhVar;
        API = new Api("LocationServices.API", zzbhVar, clientKey);
        FusedLocationApi = new zzz();
        GeofencingApi = new zzaf();
        SettingsApi = new com.google.android.gms.internal.location.zzbi();
    }

    private LocationServices() {
    }

    public static com.google.android.gms.internal.location.zzaz zza(GoogleApiClient googleApiClient) {
        Preconditions.checkArgument(googleApiClient != null, "GoogleApiClient parameter is required.");
        com.google.android.gms.internal.location.zzaz zzazVar = (com.google.android.gms.internal.location.zzaz) googleApiClient.getClient(zza);
        Preconditions.checkState(zzazVar != null, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return zzazVar;
    }

    public static FusedLocationProviderClient getFusedLocationProviderClient(Context context) {
        return new FusedLocationProviderClient(context);
    }
}
