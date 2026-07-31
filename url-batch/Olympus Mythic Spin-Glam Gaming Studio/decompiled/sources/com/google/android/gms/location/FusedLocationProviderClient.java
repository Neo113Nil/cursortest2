package com.google.android.gms.location;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes3.dex */
public class FusedLocationProviderClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    public FusedLocationProviderClient(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) LocationServices.API, Api.ApiOptions.NO_OPTIONS, new ApiExceptionMapper());
    }
}
