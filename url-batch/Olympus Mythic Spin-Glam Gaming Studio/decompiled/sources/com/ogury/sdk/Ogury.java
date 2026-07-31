package com.ogury.sdk;

import android.content.Context;
import com.ogury.ad.internal.InternalAds;
import com.ogury.ad.internal.Product;
import com.ogury.core.OguryError;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.InternalCore;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.SourceTag;
import com.ogury.sdk.internal.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-d03ac3f9e324b82242ed8abc94e35cfcf54ca1b7c6df624f1ee1a6ff838e9b84 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0018J'\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/ogury/sdk/Ogury;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "assetKey", "Lcom/ogury/sdk/OguryOnStartListener;", "oguryOnStartListener", "", "start", "(Landroid/content/Context;Ljava/lang/String;Lcom/ogury/sdk/OguryOnStartListener;)V", "getSdkVersion", "()Ljava/lang/String;", "", "childPrivacyTreatment", "applyChildPrivacy", "(I)V", "key", "", "value", "setPrivacyData", "(Landroid/content/Context;Ljava/lang/String;Z)V", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "(Landroid/content/Context;Ljava/lang/String;I)V", "sdk-wrapper_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Ogury {

    @NotNull
    public static final Ogury INSTANCE = new Ogury();
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public static boolean b;

    private Ogury() {
    }

    public static final void access$handleFailedSdkStart(Ogury ogury, int i) {
        ogury.getClass();
        if (i == 1000) {
            ogury.a(new OguryError(i, "The SDK could not be started because a required SDK module is missing."));
            return;
        }
        if (i != 1001) {
            return;
        }
        OguryError oguryError = new OguryError(i, "The SDK could not be started because one of the required SDK modules failed to start.");
        synchronized (ogury) {
            try {
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    ((OguryOnStartListener) it.next()).onFailed(oguryError);
                }
                a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void access$sendOnStart(Ogury ogury) {
        synchronized (ogury) {
            try {
                b = true;
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    ((OguryOnStartListener) it.next()).onStarted();
                }
                a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void applyChildPrivacy(int childPrivacyTreatment) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3 = null;
        if (childPrivacyTreatment == 1) {
            bool = Boolean.FALSE;
        } else if (childPrivacyTreatment != 2) {
            if (childPrivacyTreatment == 4) {
                bool2 = Boolean.FALSE;
            } else if (childPrivacyTreatment != 8) {
                bool = null;
            } else {
                bool2 = Boolean.TRUE;
            }
            bool3 = bool2;
            bool = null;
        } else {
            bool = Boolean.TRUE;
        }
        InternalAds.setChildUnderCoppaTreatment(bool);
        InternalAds.setUnderAgeOfGdprConsentTreatment(bool3);
    }

    public static boolean b() {
        try {
            String version = InternalCore.getVersion();
            LogTag logTag = LogTag.PUBLISHER;
            SourceTag sourceTag = SourceTag.WRAPPER;
            IntegrationLogger.d(logTag, sourceTag, "Core module " + version + " detected");
            if (Intrinsics.areEqual(version, "2.2.1")) {
                return true;
            }
            IntegrationLogger.i(logTag, sourceTag, "Unexpected Core version: " + version + " (2.2.1 expected)");
            return true;
        } catch (NoClassDefFoundError unused) {
            IntegrationLogger.e(LogTag.PUBLISHER, SourceTag.WRAPPER, "Core module is missing!");
            return false;
        } catch (Throwable th) {
            IntegrationLogger.e(LogTag.PUBLISHER, SourceTag.WRAPPER, th);
            return false;
        }
    }

    @NotNull
    public static final String getSdkVersion() {
        return "6.2.2";
    }

    public static final void setPrivacyData(@NotNull Context context, @NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        InternalCore.storePrivacyData(context, key, value);
    }

    public static final synchronized void start(@NotNull Context context, @NotNull String assetKey, @NotNull OguryOnStartListener oguryOnStartListener) {
        String str;
        synchronized (Ogury.class) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(assetKey, "assetKey");
            Intrinsics.checkNotNullParameter(oguryOnStartListener, "oguryOnStartListener");
            if (b) {
                IntegrationLogger.d(LogTag.PUBLISHER, SourceTag.WRAPPER, "Ogury SDK is already started");
                oguryOnStartListener.onStarted();
                return;
            }
            a.add(oguryOnStartListener);
            LogTag logTag = LogTag.PUBLISHER;
            SourceTag sourceTag = SourceTag.WRAPPER;
            IntegrationLogger.d(logTag, sourceTag, "Starting Ogury SDK " + getSdkVersion() + "...");
            String packageName = context.getPackageName();
            INSTANCE.getClass();
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (Exception unused) {
                str = "";
            }
            IntegrationLogger.d(logTag, sourceTag, "[start] Package name: " + packageName + " ; version name: " + String.valueOf(str) + " ; asset key: " + assetKey);
            Context applicationContext = context.getApplicationContext();
            IntegrationLogger.d(LogTag.PUBLISHER, SourceTag.WRAPPER, "Starting modules...");
            Ogury ogury = INSTANCE;
            ogury.getClass();
            if (b() && a()) {
                Intrinsics.checkNotNull(applicationContext);
                InternalAds.start(applicationContext, assetKey, new Product("sdk", getSdkVersion()), new a());
                return;
            }
            ogury.a(1000);
        }
    }

    public final void a(int i) {
        if (i == 1000) {
            a(new OguryError(i, "The SDK could not be started because a required SDK module is missing."));
            return;
        }
        if (i != 1001) {
            return;
        }
        OguryError oguryError = new OguryError(i, "The SDK could not be started because one of the required SDK modules failed to start.");
        synchronized (this) {
            try {
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    ((OguryOnStartListener) it.next()).onFailed(oguryError);
                }
                a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void setPrivacyData(@NotNull Context context, @NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        InternalCore.storePrivacyData(context, key, value);
    }

    public static final void setPrivacyData(@NotNull Context context, @NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        InternalCore.storePrivacyData(context, key, value);
    }

    public static boolean a() {
        try {
            String version = InternalAds.getVersion();
            LogTag logTag = LogTag.PUBLISHER;
            SourceTag sourceTag = SourceTag.WRAPPER;
            IntegrationLogger.d(logTag, sourceTag, "Ads module " + version + " detected");
            if (Intrinsics.areEqual(version, "5.2.2")) {
                return true;
            }
            IntegrationLogger.i(logTag, sourceTag, "Unexpected Ad version: " + version + " (5.2.2 expected)");
            return true;
        } catch (NoClassDefFoundError unused) {
            IntegrationLogger.e(LogTag.PUBLISHER, SourceTag.WRAPPER, "Ad module is missing!");
            return false;
        } catch (Throwable th) {
            IntegrationLogger.e(LogTag.PUBLISHER, SourceTag.WRAPPER, th);
            return false;
        }
    }

    public final synchronized void a(OguryError oguryError) {
        try {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                ((OguryOnStartListener) it.next()).onFailed(oguryError);
            }
            a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }
}
