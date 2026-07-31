package com.google.android.ump;

import android.app.Activity;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes6.dex */
public interface ConsentForm {

    /* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
    public interface OnConsentFormDismissedListener {
        void onConsentFormDismissed(@Nullable FormError formError);
    }

    void show(@RecentlyNonNull Activity activity, @RecentlyNonNull OnConsentFormDismissedListener onConsentFormDismissedListener);
}
