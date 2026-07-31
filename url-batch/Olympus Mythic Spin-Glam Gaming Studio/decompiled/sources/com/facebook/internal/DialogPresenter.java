package com.facebook.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import com.facebook.CallbackManager;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.NativeProtocol;
import com.ironsource.X3;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.sglib.easymobile.androidnative.notification.NotificationRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DialogPresenter.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u00016B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\"\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0007J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J$\u0010#\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010\u000f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0007J\u001a\u0010'\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010)H\u0007J \u0010*\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001a\u0010-\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010.\u001a\u0004\u0018\u00010)H\u0007J$\u0010/\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0007J\"\u00100\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J*\u00101\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0007¨\u00067"}, d2 = {"Lcom/facebook/internal/DialogPresenter;", "", "()V", "canPresentNativeDialogWithFeature", "", "feature", "Lcom/facebook/internal/DialogFeature;", "canPresentWebFallbackDialogWithFeature", "getDialogWebFallbackUri", "Landroid/net/Uri;", "getProtocolVersionForNativeDialog", "Lcom/facebook/internal/NativeProtocol$ProtocolVersionQueryResult;", "getVersionSpecForFeature", "", "applicationId", "", X3.i.v0, "logDialogActivity", "", "context", "Landroid/content/Context;", X3.i.j0, "outcome", "present", "appCall", "Lcom/facebook/internal/AppCall;", "activity", "Landroid/app/Activity;", "registry", "Landroidx/activity/result/ActivityResultRegistry;", "callbackManager", "Lcom/facebook/CallbackManager;", "fragmentWrapper", "Lcom/facebook/internal/FragmentWrapper;", "setupAppCallForCannotShowError", "setupAppCallForCustomTabDialog", "action", "parameters", "Landroid/os/Bundle;", "setupAppCallForErrorResult", TelemetryCategory.EXCEPTION, "Lcom/facebook/FacebookException;", "setupAppCallForNativeDialog", "parameterProvider", "Lcom/facebook/internal/DialogPresenter$ParameterProvider;", "setupAppCallForValidationError", "validationError", "setupAppCallForWebDialog", "setupAppCallForWebFallbackDialog", "startActivityForResultWithAndroidX", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", NotificationRequest.REQUEST_CODE_KEY, "", "ParameterProvider", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DialogPresenter {

    @NotNull
    public static final DialogPresenter INSTANCE = new DialogPresenter();

    /* compiled from: DialogPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/facebook/internal/DialogPresenter$ParameterProvider;", "", "legacyParameters", "Landroid/os/Bundle;", "getLegacyParameters", "()Landroid/os/Bundle;", "parameters", "getParameters", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface ParameterProvider {
        @Nullable
        Bundle getLegacyParameters();

        @Nullable
        Bundle getParameters();
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.facebook");
        p0.startActivityForResult(p1, p2);
    }

    public static void safedk_FragmentWrapper_startActivityForResult_51accca8f1bb017fcda2a6aac31602e6(FragmentWrapper p0, Intent p1, int p2) {
        com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Lcom/facebook/internal/FragmentWrapper;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.facebook");
        p0.startActivityForResult(p1, p2);
    }

    private DialogPresenter() {
    }

    public static final void setupAppCallForCannotShowError(@NotNull AppCall appCall) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        setupAppCallForValidationError(appCall, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
    }

    public static final void setupAppCallForValidationError(@NotNull AppCall appCall, @Nullable FacebookException validationError) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        setupAppCallForErrorResult(appCall, validationError);
    }

    public static final void present(@NotNull AppCall appCall, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(activity, "activity");
        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity, appCall.getRequestIntent(), appCall.getRequestCode());
        appCall.setPending();
    }

    public static final void present(@NotNull AppCall appCall, @NotNull FragmentWrapper fragmentWrapper) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(fragmentWrapper, "fragmentWrapper");
        safedk_FragmentWrapper_startActivityForResult_51accca8f1bb017fcda2a6aac31602e6(fragmentWrapper, appCall.getRequestIntent(), appCall.getRequestCode());
        appCall.setPending();
    }

    public static final void present(@NotNull AppCall appCall, @NotNull ActivityResultRegistry registry, @Nullable CallbackManager callbackManager) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intent requestIntent = appCall.getRequestIntent();
        if (requestIntent == null) {
            return;
        }
        startActivityForResultWithAndroidX(registry, callbackManager, requestIntent, appCall.getRequestCode());
        appCall.setPending();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, androidx.activity.result.ActivityResultLauncher] */
    public static final void startActivityForResultWithAndroidX(@NotNull ActivityResultRegistry registry, @Nullable final CallbackManager callbackManager, @NotNull Intent intent, final int requestCode) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(intent, "intent");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? register = registry.register(Intrinsics.stringPlus("facebook-dialog-request-", Integer.valueOf(requestCode)), new ActivityResultContract<Intent, Pair<Integer, Intent>>() { // from class: com.facebook.internal.DialogPresenter$startActivityForResultWithAndroidX$1
            @Override // androidx.activity.result.contract.ActivityResultContract
            @NotNull
            public Intent createIntent(@NotNull Context context, @NotNull Intent input) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                return input;
            }

            @Override // androidx.activity.result.contract.ActivityResultContract
            @NotNull
            public Pair<Integer, Intent> parseResult(int resultCode, @Nullable Intent intent2) {
                Pair<Integer, Intent> create = Pair.create(Integer.valueOf(resultCode), intent2);
                Intrinsics.checkNotNullExpressionValue(create, "create(resultCode, intent)");
                return create;
            }
        }, new ActivityResultCallback() { // from class: com.facebook.internal.DialogPresenter$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                DialogPresenter.m3419startActivityForResultWithAndroidX$lambda2(CallbackManager.this, requestCode, ref$ObjectRef, (Pair) obj);
            }
        });
        ref$ObjectRef.element = register;
        if (register == 0) {
            return;
        }
        register.launch(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: startActivityForResultWithAndroidX$lambda-2, reason: not valid java name */
    public static final void m3419startActivityForResultWithAndroidX$lambda2(CallbackManager callbackManager, int i, Ref$ObjectRef launcher, Pair pair) {
        Intrinsics.checkNotNullParameter(launcher, "$launcher");
        if (callbackManager == null) {
            callbackManager = new CallbackManagerImpl();
        }
        Object obj = pair.first;
        Intrinsics.checkNotNullExpressionValue(obj, "result.first");
        callbackManager.onActivityResult(i, ((Number) obj).intValue(), (Intent) pair.second);
        ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) launcher.element;
        if (activityResultLauncher == null) {
            return;
        }
        synchronized (activityResultLauncher) {
            activityResultLauncher.unregister();
            launcher.element = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final boolean canPresentNativeDialogWithFeature(@NotNull DialogFeature feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return getProtocolVersionForNativeDialog(feature).getProtocolVersion() != -1;
    }

    public static final boolean canPresentWebFallbackDialogWithFeature(@NotNull DialogFeature feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return INSTANCE.getDialogWebFallbackUri(feature) != null;
    }

    public static final void setupAppCallForErrorResult(@NotNull AppCall appCall, @Nullable FacebookException exception) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        if (exception == null) {
            return;
        }
        Validate validate = Validate.INSTANCE;
        Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
        Intent intent = new Intent();
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(FacebookActivity.PASS_THROUGH_CANCEL_ACTION);
        NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
        NativeProtocol.setupProtocolRequestIntent(intent, appCall.getCallId().toString(), null, NativeProtocol.getLatestKnownVersion(), NativeProtocol.createBundleForException(exception));
        appCall.setRequestIntent(intent);
    }

    public static final void setupAppCallForWebDialog(@NotNull AppCall appCall, @Nullable String actionName, @Nullable Bundle parameters) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Validate validate = Validate.INSTANCE;
        Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
        Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
        Bundle bundle = new Bundle();
        bundle.putString("action", actionName);
        bundle.putBundle("params", parameters);
        Intent intent = new Intent();
        NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
        NativeProtocol.setupProtocolRequestIntent(intent, appCall.getCallId().toString(), actionName, NativeProtocol.getLatestKnownVersion(), bundle);
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(FacebookDialogFragment.TAG);
        appCall.setRequestIntent(intent);
    }

    public static final void setupAppCallForWebFallbackDialog(@NotNull AppCall appCall, @Nullable Bundle parameters, @NotNull DialogFeature feature) {
        Uri buildUri;
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(feature, "feature");
        Validate validate = Validate.INSTANCE;
        Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
        Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
        String name = feature.name();
        Uri dialogWebFallbackUri = INSTANCE.getDialogWebFallbackUri(feature);
        if (dialogWebFallbackUri == null) {
            throw new FacebookException("Unable to fetch the Url for the DialogFeature : '" + name + '\'');
        }
        int latestKnownVersion = NativeProtocol.getLatestKnownVersion();
        ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
        String uuid = appCall.getCallId().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "appCall.callId.toString()");
        Bundle queryParamsForPlatformActivityIntentWebFallback = ServerProtocol.getQueryParamsForPlatformActivityIntentWebFallback(uuid, latestKnownVersion, parameters);
        if (queryParamsForPlatformActivityIntentWebFallback == null) {
            throw new FacebookException("Unable to fetch the app's key-hash");
        }
        if (dialogWebFallbackUri.isRelative()) {
            Utility utility = Utility.INSTANCE;
            buildUri = Utility.buildUri(ServerProtocol.getDialogAuthority(), dialogWebFallbackUri.toString(), queryParamsForPlatformActivityIntentWebFallback);
        } else {
            Utility utility2 = Utility.INSTANCE;
            buildUri = Utility.buildUri(dialogWebFallbackUri.getAuthority(), dialogWebFallbackUri.getPath(), queryParamsForPlatformActivityIntentWebFallback);
        }
        Bundle bundle = new Bundle();
        bundle.putString("url", buildUri.toString());
        bundle.putBoolean(NativeProtocol.WEB_DIALOG_IS_FALLBACK, true);
        Intent intent = new Intent();
        NativeProtocol.setupProtocolRequestIntent(intent, appCall.getCallId().toString(), feature.getAction(), NativeProtocol.getLatestKnownVersion(), bundle);
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(FacebookDialogFragment.TAG);
        appCall.setRequestIntent(intent);
    }

    public static final void setupAppCallForNativeDialog(@NotNull AppCall appCall, @NotNull ParameterProvider parameterProvider, @NotNull DialogFeature feature) {
        Bundle legacyParameters;
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(parameterProvider, "parameterProvider");
        Intrinsics.checkNotNullParameter(feature, "feature");
        Context applicationContext = FacebookSdk.getApplicationContext();
        String action = feature.getAction();
        NativeProtocol.ProtocolVersionQueryResult protocolVersionForNativeDialog = getProtocolVersionForNativeDialog(feature);
        int protocolVersion = protocolVersionForNativeDialog.getProtocolVersion();
        if (protocolVersion == -1) {
            throw new FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
        }
        if (NativeProtocol.isVersionCompatibleWithBucketedIntent(protocolVersion)) {
            legacyParameters = parameterProvider.getParameters();
        } else {
            legacyParameters = parameterProvider.getLegacyParameters();
        }
        if (legacyParameters == null) {
            legacyParameters = new Bundle();
        }
        Intent createPlatformActivityIntent = NativeProtocol.createPlatformActivityIntent(applicationContext, appCall.getCallId().toString(), action, protocolVersionForNativeDialog, legacyParameters);
        if (createPlatformActivityIntent == null) {
            throw new FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        appCall.setRequestIntent(createPlatformActivityIntent);
    }

    public static final void setupAppCallForCustomTabDialog(@NotNull AppCall appCall, @Nullable String action, @Nullable Bundle parameters) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Validate validate = Validate.INSTANCE;
        Validate.hasCustomTabRedirectActivity(FacebookSdk.getApplicationContext(), CustomTabUtils.getDefaultRedirectURI());
        Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
        Intent intent = new Intent(FacebookSdk.getApplicationContext(), (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.EXTRA_ACTION, action);
        intent.putExtra(CustomTabMainActivity.EXTRA_PARAMS, parameters);
        intent.putExtra(CustomTabMainActivity.EXTRA_CHROME_PACKAGE, CustomTabUtils.getChromePackage());
        NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
        NativeProtocol.setupProtocolRequestIntent(intent, appCall.getCallId().toString(), action, NativeProtocol.getLatestKnownVersion(), null);
        appCall.setRequestIntent(intent);
    }

    private final Uri getDialogWebFallbackUri(DialogFeature feature) {
        String name = feature.name();
        String action = feature.getAction();
        FetchedAppSettings.DialogFeatureConfig dialogFeatureConfig = FetchedAppSettings.INSTANCE.getDialogFeatureConfig(FacebookSdk.getApplicationId(), action, name);
        if (dialogFeatureConfig != null) {
            return dialogFeatureConfig.getFallbackUrl();
        }
        return null;
    }

    @NotNull
    public static final NativeProtocol.ProtocolVersionQueryResult getProtocolVersionForNativeDialog(@NotNull DialogFeature feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        String applicationId = FacebookSdk.getApplicationId();
        String action = feature.getAction();
        return NativeProtocol.getLatestAvailableProtocolVersionForAction(action, INSTANCE.getVersionSpecForFeature(applicationId, action, feature));
    }

    private final int[] getVersionSpecForFeature(String applicationId, String actionName, DialogFeature feature) {
        FetchedAppSettings.DialogFeatureConfig dialogFeatureConfig = FetchedAppSettings.INSTANCE.getDialogFeatureConfig(applicationId, actionName, feature.name());
        int[] versionSpec = dialogFeatureConfig == null ? null : dialogFeatureConfig.getVersionSpec();
        return versionSpec == null ? new int[]{feature.getMinVersion()} : versionSpec;
    }

    public static final void logDialogActivity(@NotNull Context context, @NotNull String eventName, @NotNull String outcome) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(context);
        Bundle bundle = new Bundle();
        bundle.putString(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME, outcome);
        internalAppEventsLogger.logEventImplicitly(eventName, bundle);
    }
}
