package com.smaato.sdk.core;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.log.LogLevel;
import com.smaato.sdk.core.om.SmaatoViewabilityManager;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.UserDataManager;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.sdkmanager.DisplayManager;
import com.smaato.sdk.ng.utils.sdkmanager.SdkManager;

/* loaded from: classes11.dex */
public final class SmaatoSdk {
    private static boolean sIsLgpdEnabled;

    public interface SmaatoSdkInitialisationListener {
        void onInitialisationFailure(String str);

        void onInitialisationSuccess();
    }

    @Deprecated
    public static String getLanguage() {
        return null;
    }

    @Deprecated
    public static LatLng getLatLng() {
        return null;
    }

    @Deprecated
    public static String getRegion() {
        return null;
    }

    @Deprecated
    public static String getSearchQuery() {
        return null;
    }

    @Deprecated
    public static String getZip() {
        return null;
    }

    @Deprecated
    public static boolean isWatermarkEnabled() {
        return false;
    }

    @Deprecated
    public static void setLanguage(String str) {
    }

    @Deprecated
    public static void setLatLng(LatLng latLng) {
    }

    @Deprecated
    public static void setRegion(String str) {
    }

    @Deprecated
    public static void setSearchQuery(String str) {
    }

    @Deprecated
    public static void setUnityVersion(String str) {
    }

    @Deprecated
    public static void setWatermarkEnabled(boolean z) {
    }

    @Deprecated
    public static void setZip(String str) {
    }

    private SmaatoSdk() {
    }

    public static void init(Application application, String str) {
        init(application, Config.builder().build(), str);
    }

    public static void init(Application application, Config config, String str) {
        init(application, config, str, null);
    }

    public static void init(Application application, Config config, String str, final SmaatoSdkInitialisationListener smaatoSdkInitialisationListener) {
        mapLogLevel(config);
        SmaatoViewabilityManager smaatoViewabilityManager = new SmaatoViewabilityManager(application);
        NextGen.setSdkManager(SdkManager.builder().visibilityManager(smaatoViewabilityManager).displayManager(DisplayManager.builder().setIsWrapped(Boolean.TRUE).setDisplayManagerName(smaatoViewabilityManager.getPartnerName()).setDisplayManagerVersion(String.format("%s_%s", "sdk", "23.1.0")).build()).build());
        NextGen.initialize(str, application, new NextGen.InitialisationListener() { // from class: com.smaato.sdk.core.SmaatoSdk$$ExternalSyntheticLambda0
            @Override // com.smaato.sdk.ng.NextGen.InitialisationListener
            public final void onInitialisationFinished(boolean z) {
                SmaatoSdk.lambda$init$0(SmaatoSdk.SmaatoSdkInitialisationListener.this, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$init$0(SmaatoSdkInitialisationListener smaatoSdkInitialisationListener, boolean z) {
        NextGen.getApiClient().setApiUrl(com.smaato.sdk.ng.BuildConfig.BASE_URL);
        if (smaatoSdkInitialisationListener != null) {
            if (z) {
                smaatoSdkInitialisationListener.onInitialisationSuccess();
            } else {
                smaatoSdkInitialisationListener.onInitialisationFailure("Smaato SDK failed to initialize. Please verify the initialization steps in the Smaato documentation.");
            }
        }
    }

    private static void mapLogLevel(Config config) {
        LogLevel consoleLogLevel;
        Logger.Level level;
        if (config == null || (consoleLogLevel = config.getConsoleLogLevel()) == null) {
            return;
        }
        int i = AnonymousClass1.$SwitchMap$com$smaato$sdk$core$log$LogLevel[consoleLogLevel.ordinal()];
        if (i == 1) {
            level = Logger.Level.debug;
        } else if (i == 2) {
            level = Logger.Level.info;
        } else if (i == 3) {
            level = Logger.Level.warning;
        } else if (i == 4) {
            level = Logger.Level.error;
        } else {
            level = Logger.Level.none;
        }
        NextGen.setLogLevel(level);
    }

    /* renamed from: com.smaato.sdk.core.SmaatoSdk$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$log$LogLevel;

        static {
            int[] iArr = new int[LogLevel.values().length];
            $SwitchMap$com$smaato$sdk$core$log$LogLevel = iArr;
            try {
                iArr[LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$smaato$sdk$core$log$LogLevel[LogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$smaato$sdk$core$log$LogLevel[LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$smaato$sdk$core$log$LogLevel[LogLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static String getVersion() {
        return "23.1.0";
    }

    public static String getKeywords() {
        return NextGen.getKeywords();
    }

    public static void setKeywords(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        NextGen.setKeywords(str);
    }

    public static Gender getGender() {
        if (TextUtils.isEmpty(NextGen.getGender())) {
            return null;
        }
        return Gender.fromString(NextGen.getGender());
    }

    public static void setGender(Gender gender) {
        if (gender != null) {
            NextGen.setGender(gender.toString());
        }
    }

    public static Integer getAge() {
        String age = NextGen.getAge();
        if (!TextUtils.isEmpty(age)) {
            try {
                return Integer.valueOf(age);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static void setAge(Integer num) {
        if (num != null) {
            NextGen.setAge(String.valueOf(num));
        }
    }

    public static boolean isGPSEnabled() {
        return NextGen.isLocationTrackingEnabled();
    }

    public static void setGPSEnabled(boolean z) {
        NextGen.setLocationTrackingEnabled(z);
    }

    public static Boolean isLGPDConsentEnabled() {
        if (NextGen.getUserDataManager() != null) {
            return Boolean.valueOf(!r0.isConsentDenied());
        }
        return Boolean.FALSE;
    }

    public static void setLgpdConsentEnabled(Boolean bool) {
        UserDataManager userDataManager = NextGen.getUserDataManager();
        if (userDataManager == null || !isLgpdEnabled()) {
            return;
        }
        if (bool.booleanValue()) {
            userDataManager.grantConsent();
        } else {
            userDataManager.revokeConsent();
        }
    }

    public static void setLgpdEnabled(boolean z) {
        sIsLgpdEnabled = z;
    }

    public static boolean isLgpdEnabled() {
        return sIsLgpdEnabled;
    }

    public static String getPublisherId() {
        return NextGen.getAppToken();
    }

    public static String collectSignals(Context context) {
        return NextGen.getEncodedCustomRequestSignalData(context, null);
    }

    public static boolean getCoppa() {
        return NextGen.isCoppaEnabled();
    }

    public static void setCoppa(boolean z) {
        NextGen.setCoppaEnabled(z);
    }

    public static boolean isAgeRestrictedUser() {
        return NextGen.isCoppaEnabled();
    }

    public static void setAgeRestrictedUser(boolean z) {
        NextGen.setCoppaEnabled(z);
    }

    public static String getUsPrivacyString() {
        if (!NextGen.isInitialized() || NextGen.getUserDataManager() == null) {
            return null;
        }
        return NextGen.getUserDataManager().getIABUSPrivacyString();
    }

    public static boolean isSmaatoSdkInitialised() {
        return NextGen.isInitialized();
    }
}
