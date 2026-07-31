package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import com.android.vending.billing.IInAppBillingService;

/* compiled from: com.android.billingclient:billing@@8.0.0 */
/* loaded from: classes5.dex */
public abstract class zzal extends zzaq implements zzam {
    public static zzam zzs(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(IInAppBillingService.DESCRIPTOR);
        return queryLocalInterface instanceof zzam ? (zzam) queryLocalInterface : new zzak(iBinder);
    }
}
