package com.pairip.application;

import android.content.Context;
import com.pairip.licensecheck.LicenseClient;
import com.safedk.android.SafeDKApplication;

/* loaded from: classes2.dex */
public class Application extends SafeDKApplication {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}
