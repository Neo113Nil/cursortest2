package com.safedk.android.analytics.brandsafety;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes12.dex */
public class g implements AppLovinCommunicatorPublisher {
    private static final String a = "BrandSafetyReporter";
    private static final ExecutorService b = Executors.newSingleThreadExecutor();
    private static g c = null;

    private g() {
        d();
    }

    public static g a() {
        if (c == null) {
            c = new g();
        }
        return c;
    }

    private void d() {
        com.safedk.android.analytics.b bVar = new com.safedk.android.analytics.b() { // from class: com.safedk.android.analytics.brandsafety.g.1
            @Override // com.safedk.android.analytics.b
            public void a(String str, Bundle bundle) {
                Logger.d(g.a, "Response received, response=", bundle.toString());
            }
        };
        AppLovinBridge.registerListener(AppLovinBridge.c, bVar);
        AppLovinBridge.registerListener(AppLovinBridge.d, bVar);
        AppLovinBridge.registerListener(AppLovinBridge.f, bVar);
    }

    public static void a(final Bundle bundle) {
        Logger.d(a, "report image uploaded to server started");
        try {
            b.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.g.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (bundle == null) {
                            Logger.d(g.a, "Data argument is null, which means that the upload failed or that the validation check has failed. Nothing to report to the server.");
                            return;
                        }
                        if (bundle.size() > 0) {
                            Logger.d(g.a, "Starting image upload report event.");
                            AppLovinBridge.reportImageUploadEvent(bundle, g.c);
                            String string = bundle.getString("image_id");
                            c k = b.k(string);
                            if (k != null) {
                                for (l lVar : k.g()) {
                                    if (string.contains(lVar.a)) {
                                        g.b(lVar, k.p);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        Logger.e(g.a, "Caught exception while creating json data", th);
                        new CrashReporter().caughtException(th);
                    }
                }
            });
        } catch (Throwable th) {
            Logger.e(a, "failed during reportImageUploadedToServer. data: ", bundle.toString(), th);
            new CrashReporter().caughtException(th);
        }
    }

    public static void b(final Bundle bundle) {
        Logger.d(a, "report file uploaded to server started");
        try {
            b.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.g.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (bundle == null || bundle.size() <= 0) {
                            Logger.d(g.a, "Data argument is null, which means that the upload failed or that the validation check has failed. Nothing to report to the server.");
                        } else {
                            Logger.d(g.a, "Starting file upload report event.");
                            AppLovinBridge.reportFileUploadEvent(bundle, g.c);
                        }
                    } catch (Throwable th) {
                        Logger.e(g.a, "Caught exception while creating json data", th);
                        new CrashReporter().caughtException(th);
                    }
                }
            });
        } catch (Throwable th) {
            Logger.e(a, "failed during reportFileUploadedToServer. data: ", bundle, th);
            new CrashReporter().caughtException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(l lVar, BrandSafetyUtils.AdType adType) {
        if (lVar != null) {
            a a2 = SafeDK.getInstance().a(adType);
            if (a2 != null) {
                Logger.d(a, "Executing image cleanup request");
                a2.b(lVar);
            } else {
                Logger.d(a, "Upload: finder not found for image cleanup request");
            }
        }
    }

    public static void c(final Bundle bundle) {
        try {
            b.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.g.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (bundle == null) {
                            Logger.d(g.a, "Data argument is null, which means reporting a resolved click url is not possible. ");
                        } else if (bundle.size() > 0) {
                            Logger.d(g.a, "Starting url resolution report event.");
                            AppLovinBridge.reportClickUrlResolvedEvent(bundle, g.c);
                        }
                    } catch (Throwable th) {
                        Logger.e(g.a, "Caught exception while creating json data", th);
                        new CrashReporter().caughtException(th);
                    }
                }
            });
        } catch (Throwable th) {
            Logger.e(a, "failed during reportImageUploadedToServer. data: ", bundle.toString(), th);
            new CrashReporter().caughtException(th);
        }
    }

    public String b() {
        return AppLovinBridge.a;
    }
}
