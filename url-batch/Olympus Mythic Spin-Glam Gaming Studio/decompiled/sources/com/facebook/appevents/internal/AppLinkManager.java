package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.C4834q2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: AppLinkManager.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001b"}, d2 = {"Lcom/facebook/appevents/internal/AppLinkManager;", "", "()V", "preferences", "Landroid/content/SharedPreferences;", "getPreferences", "()Landroid/content/SharedPreferences;", "preferences$delegate", "Lkotlin/Lazy;", "getCampaignIDFromIntentExtra", "", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "getCampaignIDFromUri", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "getInfo", "key", "handleURL", "", "activity", "Landroid/app/Activity;", "processCampaignIds", "setupLifecycleListener", "application", "Landroid/app/Application;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class AppLinkManager {

    @NotNull
    public static final String APPLINK_DATA_KEY = "al_applink_data";

    @NotNull
    public static final String APPLINK_INFO = "com.facebook.sdk.APPLINK_INFO";

    @NotNull
    public static final String CAMPAIGN_IDS_KEY = "campaign_ids";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static volatile AppLinkManager instance;

    /* renamed from: preferences$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy preferences;

    public /* synthetic */ AppLinkManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AppLinkManager() {
        this.preferences = LazyKt.lazy(new Function0() { // from class: com.facebook.appevents.internal.AppLinkManager$preferences$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final SharedPreferences mo4828invoke() {
                return FacebookSdk.getApplicationContext().getSharedPreferences(AppLinkManager.APPLINK_INFO, 0);
            }
        });
    }

    public static final /* synthetic */ AppLinkManager access$getInstance$cp() {
        if (CrashShieldHandler.isObjectCrashing(AppLinkManager.class)) {
            return null;
        }
        try {
            return instance;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppLinkManager.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$setInstance$cp(AppLinkManager appLinkManager) {
        if (CrashShieldHandler.isObjectCrashing(AppLinkManager.class)) {
            return;
        }
        try {
            instance = appLinkManager;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppLinkManager.class);
        }
    }

    private final SharedPreferences getPreferences() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Object value = this.preferences.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-preferences>(...)");
            return (SharedPreferences) value;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* compiled from: AppLinkManager.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/appevents/internal/AppLinkManager$Companion;", "", "()V", "APPLINK_DATA_KEY", "", "APPLINK_INFO", "CAMPAIGN_IDS_KEY", C4834q2.p, "Lcom/facebook/appevents/internal/AppLinkManager;", com.unity3d.services.core.fid.Constants.GET_INSTANCE, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Nullable
        public final AppLinkManager getInstance() {
            AppLinkManager access$getInstance$cp = AppLinkManager.access$getInstance$cp();
            if (access$getInstance$cp == null) {
                synchronized (this) {
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    if (!FacebookSdk.isInitialized()) {
                        return null;
                    }
                    access$getInstance$cp = AppLinkManager.access$getInstance$cp();
                    if (access$getInstance$cp == null) {
                        access$getInstance$cp = new AppLinkManager(defaultConstructorMarker);
                        AppLinkManager.access$setInstance$cp(access$getInstance$cp);
                    }
                }
            }
            return access$getInstance$cp;
        }
    }

    public final void handleURL(@NotNull Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Uri data = activity.getIntent().getData();
            if (data == null) {
                return;
            }
            Intent intent = activity.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "activity.intent");
            processCampaignIds(data, intent);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void processCampaignIds(@NotNull Uri uri, @NotNull Intent intent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(intent, "intent");
            String campaignIDFromUri = getCampaignIDFromUri(uri);
            if (campaignIDFromUri == null) {
                campaignIDFromUri = getCampaignIDFromIntentExtra(intent);
            }
            if (campaignIDFromUri != null) {
                getPreferences().edit().putString(CAMPAIGN_IDS_KEY, campaignIDFromUri).apply();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Nullable
    public final String getCampaignIDFromUri(@NotNull Uri uri) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(uri, "uri");
            String queryParameter = uri.getQueryParameter("al_applink_data");
            if (queryParameter == null) {
                return null;
            }
            try {
                return new JSONObject(queryParameter).getString(CAMPAIGN_IDS_KEY);
            } catch (Exception unused) {
                Log.d("AppLinkManager", "Fail to parse Applink data from Uri");
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @Nullable
    public final String getCampaignIDFromIntentExtra(@NotNull Intent intent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
            if (bundleExtra == null) {
                return null;
            }
            return bundleExtra.getString(CAMPAIGN_IDS_KEY);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @Nullable
    public final String getInfo(@NotNull String key) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(key, "key");
            return getPreferences().getString(key, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final void setupLifecycleListener(@NotNull Application application) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(application, "application");
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.appevents.internal.AppLinkManager$setupLifecycleListener$1
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(@NotNull Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(@NotNull Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Intrinsics.checkNotNullParameter(bundle, "bundle");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(@NotNull Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(@NotNull Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    AppLinkManager companion = AppLinkManager.INSTANCE.getInstance();
                    if (companion == null) {
                        return;
                    }
                    companion.handleURL(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(@NotNull Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    AppLinkManager companion = AppLinkManager.INSTANCE.getInstance();
                    if (companion == null) {
                        return;
                    }
                    companion.handleURL(activity);
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
