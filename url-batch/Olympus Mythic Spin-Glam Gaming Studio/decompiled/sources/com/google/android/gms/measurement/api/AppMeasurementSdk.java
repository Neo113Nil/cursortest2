package com.google.android.gms.measurement.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.measurement.internal.zzkb;
import com.google.android.gms.measurement.internal.zzkc;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes11.dex */
public class AppMeasurementSdk {
    private final zzff zza;

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
    @KeepForSdk
    public static final class ConditionalUserProperty {
        private ConditionalUserProperty() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
    @ShowFirstParty
    @KeepForSdk
    public interface EventInterceptor extends zzkb {
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
    @ShowFirstParty
    @KeepForSdk
    public interface OnEventListener extends zzkc {
    }

    public AppMeasurementSdk(zzff zzffVar) {
        this.zza = zzffVar;
    }

    public final void zza(boolean z) {
        this.zza.zzI(z);
    }
}
