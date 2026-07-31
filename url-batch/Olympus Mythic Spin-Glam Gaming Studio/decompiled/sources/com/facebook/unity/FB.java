package com.facebook.unity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.LoginStatusCallback;
import com.facebook.Profile;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.applinks.AppLinkData;
import com.facebook.bolts.Continuation;
import com.facebook.bolts.Task;
import com.facebook.gamingservices.GamingContext;
import com.facebook.gamingservices.GamingImageUploader;
import com.facebook.gamingservices.GamingVideoUploader;
import com.facebook.gamingservices.Tournament;
import com.facebook.gamingservices.TournamentConfig;
import com.facebook.gamingservices.TournamentFetcher;
import com.facebook.gamingservices.TournamentShareDialog;
import com.facebook.gamingservices.TournamentUpdater;
import com.facebook.gamingservices.cloudgaming.AppToUserNotificationSender;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.GameFeaturesLibrary;
import com.facebook.gamingservices.cloudgaming.InAppAdLibrary;
import com.facebook.gamingservices.cloudgaming.InAppPurchaseLibrary;
import com.facebook.gamingservices.cloudgaming.PlayableAdsLibrary;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.internal.TournamentScoreType;
import com.facebook.gamingservices.internal.TournamentSortOrder;
import com.facebook.internal.BundleJSONConverter;
import com.facebook.internal.InternalSettings;
import com.facebook.internal.Utility;
import com.facebook.login.LoginManager;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.widget.ShareDialog;
import com.facebook.unity.FBUnityLoginActivity;
import com.inmobi.unification.sdk.InitializationStatus;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class FB {
    static final String FB_UNITY_OBJECT = "UnityFacebookSDKPlugin";
    static final String TAG = "com.facebook.unity.FB";
    private static AppEventsLogger appEventsLogger;
    private static Intent clearedIntent;
    private static Intent intent;
    private static AtomicBoolean activateAppCalled = new AtomicBoolean();
    private static CallbackManager callbackManager = CallbackManager.Factory.create();
    static ShareDialog.Mode ShareDialogMode = ShareDialog.Mode.AUTOMATIC;

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.facebook");
        p0.startActivity(p1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AppEventsLogger getAppEventsLogger() {
        if (appEventsLogger == null) {
            appEventsLogger = AppEventsLogger.newLogger(getUnityActivity().getApplicationContext());
        }
        return appEventsLogger;
    }

    public static Activity getUnityActivity() {
        return UnityReflection.GetUnityActivity();
    }

    @UnityCallable
    public static void Init(String str) {
        final String metadataApplicationId;
        String str2 = TAG;
        Log.v(str2, "Init(" + str + ")");
        StringBuilder sb = new StringBuilder();
        sb.append("couldn't parse init params: ");
        sb.append(str);
        UnityParams parse = UnityParams.parse(str, sb.toString());
        if (parse.hasString("appId").booleanValue()) {
            metadataApplicationId = parse.getString("appId");
        } else {
            metadataApplicationId = Utility.getMetadataApplicationId(getUnityActivity());
        }
        if (FacebookSdk.isInitialized()) {
            OnInitialized(metadataApplicationId);
            return;
        }
        Log.w(str2, "Missing AppID or ClientToken in AndroidManifest.xml - Please update FacebookSettings in the Unity Editor and then hit \"Regenerate Android Manifest\"");
        FacebookSdk.setClientToken(parse.getString("clientToken"));
        FacebookSdk.setApplicationId(metadataApplicationId);
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.fullyInitialize();
        FacebookSdk.sdkInitialize(getUnityActivity(), new FacebookSdk.InitializeCallback() { // from class: com.facebook.unity.FB.1
            @Override // com.facebook.FacebookSdk.InitializeCallback
            public void onInitialized() {
                FB.OnInitialized(metadataApplicationId);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void OnInitialized(String str) {
        UnityMessage unityMessage = new UnityMessage("OnInitComplete");
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        if (currentAccessToken != null) {
            FBLogin.addLoginParametersToMessage(unityMessage, currentAccessToken, null, null);
        } else {
            unityMessage.put("key_hash", getKeyHash());
        }
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            ActivateApp(str);
        }
        unityMessage.send();
    }

    @UnityCallable
    public static void LoginWithReadPermissions(String str) {
        Log.v(TAG, "LoginWithReadPermissions(" + str + ")");
        Intent intent2 = new Intent(getUnityActivity(), (Class<?>) FBUnityLoginActivity.class);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_PARAMS, str);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_TYPE, FBUnityLoginActivity.LoginType.READ);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(getUnityActivity(), intent2);
    }

    @UnityCallable
    public static void LoginWithPublishPermissions(String str) {
        Log.v(TAG, "LoginWithPublishPermissions(" + str + ")");
        Intent intent2 = new Intent(getUnityActivity(), (Class<?>) FBUnityLoginActivity.class);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_PARAMS, str);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_TYPE, FBUnityLoginActivity.LoginType.PUBLISH);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(getUnityActivity(), intent2);
    }

    @UnityCallable
    public static void Logout(String str) {
        Log.v(TAG, "Logout(" + str + ")");
        LoginManager.getInstance().logOut();
        UnityMessage unityMessage = new UnityMessage("OnLogoutComplete");
        unityMessage.put("did_complete", Boolean.TRUE);
        unityMessage.send();
    }

    @UnityCallable
    public static void RetrieveLoginStatus(String str) {
        final String str2;
        String str3 = TAG;
        Log.v(str3, "RetrieveLoginStatus(" + str + ")");
        if (!FacebookSdk.isInitialized()) {
            Log.w(str3, "Facebook SDK not initialized. Call init() before calling login()");
            return;
        }
        final UnityMessage unityMessage = new UnityMessage("OnLoginStatusRetrieved");
        unityMessage.put("key_hash", getKeyHash());
        UnityParams parse = UnityParams.parse(str, "couldn't parse login params: " + str);
        if (parse.has(Constants.CALLBACK_ID_KEY)) {
            str2 = parse.getString(Constants.CALLBACK_ID_KEY);
            unityMessage.put(Constants.CALLBACK_ID_KEY, str2);
        } else {
            str2 = null;
        }
        LoginManager.getInstance().retrieveLoginStatus(getUnityActivity(), new LoginStatusCallback() { // from class: com.facebook.unity.FB.2
            @Override // com.facebook.LoginStatusCallback
            public void onCompleted(AccessToken accessToken) {
                FBLogin.addLoginParametersToMessage(UnityMessage.this, accessToken, null, str2);
                UnityMessage.this.send();
            }

            @Override // com.facebook.LoginStatusCallback
            public void onFailure() {
                UnityMessage.this.put(X3.i.t, Boolean.TRUE);
                UnityMessage.this.send();
            }

            @Override // com.facebook.LoginStatusCallback
            public void onError(Exception exc) {
                UnityMessage.this.sendError(exc.getMessage());
            }
        });
    }

    @UnityCallable
    public static void loginForTVWithReadPermissions(String str) {
        Log.v(TAG, "loginForTVWithReadPermissions(" + str + ")");
        Intent intent2 = new Intent(getUnityActivity(), (Class<?>) FBUnityLoginActivity.class);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_PARAMS, str);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_TYPE, FBUnityLoginActivity.LoginType.TV_READ);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(getUnityActivity(), intent2);
    }

    @UnityCallable
    public static void LoginForTVWithPublishPermissions(String str) {
        Log.v(TAG, "LoginForTVWithPublishPermissions(" + str + ")");
        Intent intent2 = new Intent(getUnityActivity(), (Class<?>) FBUnityLoginActivity.class);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_PARAMS, str);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_TYPE, FBUnityLoginActivity.LoginType.TV_PUBLISH);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(getUnityActivity(), intent2);
    }

    @UnityCallable
    public static void AppRequest(String str) {
        Log.v(TAG, "AppRequest(" + str + ")");
        Intent intent2 = new Intent(getUnityActivity(), (Class<?>) FBUnityGameRequestActivity.class);
        intent2.putExtra(FBUnityGameRequestActivity.GAME_REQUEST_PARAMS, UnityParams.parse(str).getStringParams());
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(getUnityActivity(), intent2);
    }

    @UnityCallable
    public static void ShareLink(String str) {
        Log.v(TAG, "ShareLink(" + str + ")");
        Bundle stringParams = UnityParams.parse(str).getStringParams();
        Intent intent2 = new Intent(getUnityActivity(), (Class<?>) FBUnityDialogsActivity.class);
        intent2.putExtra(FBUnityDialogsActivity.DIALOG_TYPE, ShareDialogMode);
        intent2.putExtra(FBUnityDialogsActivity.SHARE_DIALOG_PARAMS, stringParams);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(getUnityActivity(), intent2);
    }

    @UnityCallable
    public static void FeedShare(String str) {
        Log.v(TAG, "FeedShare(" + str + ")");
        Bundle stringParams = UnityParams.parse(str).getStringParams();
        Intent intent2 = new Intent(getUnityActivity(), (Class<?>) FBUnityDialogsActivity.class);
        intent2.putExtra(FBUnityDialogsActivity.DIALOG_TYPE, ShareDialog.Mode.FEED);
        intent2.putExtra(FBUnityDialogsActivity.FEED_DIALOG_PARAMS, stringParams);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(getUnityActivity(), intent2);
    }

    @UnityCallable
    public static void SetUserID(String str) {
        Log.v(TAG, "SetUserID(" + str + ")");
        AppEventsLogger.setUserID(str);
    }

    @UnityCallable
    public static String GetUserID() {
        if (FacebookSdk.isInitialized()) {
            return AppEventsLogger.getUserID();
        }
        return null;
    }

    @UnityCallable
    public static String GetCurrentProfile() {
        if (!FacebookSdk.isInitialized()) {
            return null;
        }
        Profile currentProfile = Profile.getCurrentProfile();
        try {
            JSONObject jSONObject = new JSONObject();
            if (currentProfile != null) {
                String id = currentProfile.getId();
                String firstName = currentProfile.getFirstName();
                String middleName = currentProfile.getMiddleName();
                String lastName = currentProfile.getLastName();
                String name = currentProfile.getName();
                Uri linkUri = currentProfile.getLinkUri();
                if (id != null) {
                    jSONObject.put(SDKConstants.PARAM_USER_ID, id);
                }
                if (firstName != null) {
                    jSONObject.put("firstName", firstName);
                }
                if (middleName != null) {
                    jSONObject.put("middleName", middleName);
                }
                if (lastName != null) {
                    jSONObject.put("lastName", lastName);
                }
                if (name != null) {
                    jSONObject.put("name", name);
                }
                if (linkUri != null) {
                    jSONObject.put("linkURL", linkUri.toString());
                }
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @UnityCallable
    public static String GetCurrentAuthenticationToken() {
        AuthenticationToken currentAuthenticationToken;
        if (!FacebookSdk.isInitialized() || (currentAuthenticationToken = AuthenticationToken.getCurrentAuthenticationToken()) == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("auth_token_string", currentAuthenticationToken.getToken());
            jSONObject.put("auth_nonce", currentAuthenticationToken.getExpectedNonce());
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.e(TAG, e.getLocalizedMessage());
            return null;
        }
    }

    @UnityCallable
    public static void SetDataProcessingOptions(String str) {
        Log.v(TAG, "SetDataProcessingOptions(" + str + ")");
        try {
            JSONObject jSONObject = UnityParams.parse(str).json;
            JSONArray jSONArray = jSONObject.getJSONArray(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
            int optInt = jSONObject.optInt("country", 0);
            int optInt2 = jSONObject.optInt("state", 0);
            String[] strArr = new String[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                strArr[i] = jSONArray.getString(i);
            }
            FacebookSdk.setDataProcessingOptions(strArr, optInt, optInt2);
        } catch (Exception unused) {
        }
    }

    public static void SetIntent(Intent intent2) {
        intent = intent2;
    }

    public static void SetLimitEventUsage(String str) {
        Log.v(TAG, "SetLimitEventUsage(" + str + ")");
        FacebookSdk.setLimitEventAndDataUsage(getUnityActivity().getApplicationContext(), Boolean.valueOf(str).booleanValue());
    }

    @UnityCallable
    public static void LogAppEvent(final String str) {
        new Thread(new Runnable() { // from class: com.facebook.unity.FB.3
            @Override // java.lang.Runnable
            public void run() {
                String str2 = FB.TAG;
                Log.v(str2, "LogAppEvent(" + str + ")");
                UnityParams parse = UnityParams.parse(str);
                Bundle bundle = new Bundle();
                if (parse.has("parameters")) {
                    bundle = parse.getParamsObject("parameters").getStringParams();
                }
                if (parse.has("logPurchase")) {
                    FB.getAppEventsLogger().logPurchase(new BigDecimal(parse.getDouble("logPurchase")), Currency.getInstance(parse.getString("currency")), bundle);
                    return;
                }
                if (parse.hasString("logEvent").booleanValue()) {
                    if (parse.has("valueToSum")) {
                        FB.getAppEventsLogger().logEvent(parse.getString("logEvent"), parse.getDouble("valueToSum"), bundle);
                        return;
                    } else {
                        FB.getAppEventsLogger().logEvent(parse.getString("logEvent"), bundle);
                        return;
                    }
                }
                Log.e(str2, "couldn't logPurchase or logEvent params: " + str);
            }
        }).start();
    }

    @UnityCallable
    public static boolean IsImplicitPurchaseLoggingEnabled() {
        return AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled();
    }

    @UnityCallable
    public static void SetShareDialogMode(String str) {
        Log.v(TAG, "SetShareDialogMode(" + str + ")");
        if (str.equalsIgnoreCase("NATIVE")) {
            ShareDialogMode = ShareDialog.Mode.NATIVE;
            return;
        }
        if (str.equalsIgnoreCase("WEB")) {
            ShareDialogMode = ShareDialog.Mode.WEB;
        } else if (str.equalsIgnoreCase("FEED")) {
            ShareDialogMode = ShareDialog.Mode.FEED;
        } else {
            ShareDialogMode = ShareDialog.Mode.AUTOMATIC;
        }
    }

    @UnityCallable
    public static void SetAutoLogAppEventsEnabled(String str) {
        Log.v(TAG, "SetAutoLogAppEventsEnabled(" + str + ")");
        FacebookSdk.setAutoLogAppEventsEnabled(Boolean.valueOf(str).booleanValue());
    }

    @UnityCallable
    public static void SetAdvertiserIDCollectionEnabled(String str) {
        Log.v(TAG, "SetAdvertiserIDCollectionEnabled(" + str + ")");
        FacebookSdk.setAdvertiserIDCollectionEnabled(Boolean.valueOf(str).booleanValue());
    }

    @UnityCallable
    public static String GetSdkVersion() {
        return FacebookSdk.getSdkVersion();
    }

    @UnityCallable
    public static void SetUserAgentSuffix(String str) {
        Log.v(TAG, "SetUserAgentSuffix(" + str + ")");
        InternalSettings.setCustomUserAgent(str);
    }

    @UnityCallable
    public static void FetchDeferredAppLinkData(String str) {
        LogMethodCall("FetchDeferredAppLinkData", str);
        UnityParams parse = UnityParams.parse(str);
        final UnityMessage unityMessage = new UnityMessage("OnFetchDeferredAppLinkComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        AppLinkData.fetchDeferredAppLinkData(getUnityActivity(), new AppLinkData.CompletionHandler() { // from class: com.facebook.unity.FB.4
            @Override // com.facebook.applinks.AppLinkData.CompletionHandler
            public void onDeferredAppLinkDataFetched(AppLinkData appLinkData) {
                FB.addAppLinkToMessage(UnityMessage.this, appLinkData);
                UnityMessage.this.send();
            }
        });
    }

    @UnityCallable
    public static void GetAppLink(String str) {
        Log.v(TAG, "GetAppLink(" + str + ")");
        UnityMessage createWithCallbackFromParams = UnityMessage.createWithCallbackFromParams("OnGetAppLinkComplete", UnityParams.parse(str));
        Intent intent2 = intent;
        if (intent2 == null) {
            createWithCallbackFromParams.put("did_complete", Boolean.TRUE);
            createWithCallbackFromParams.send();
            return;
        }
        if (intent2 == clearedIntent) {
            createWithCallbackFromParams.put("did_complete", Boolean.TRUE);
            createWithCallbackFromParams.send();
            return;
        }
        AppLinkData createFromAlApplinkData = AppLinkData.createFromAlApplinkData(intent2);
        if (createFromAlApplinkData != null) {
            addAppLinkToMessage(createWithCallbackFromParams, createFromAlApplinkData);
            createWithCallbackFromParams.put("url", intent.getDataString());
        } else if (intent.getData() != null) {
            createWithCallbackFromParams.put("url", intent.getDataString());
        } else {
            createWithCallbackFromParams.put("did_complete", Boolean.TRUE);
        }
        createWithCallbackFromParams.send();
    }

    @UnityCallable
    public static void ClearAppLink() {
        Log.v(TAG, "ClearAppLink");
        clearedIntent = intent;
    }

    @UnityCallable
    public static void RefreshCurrentAccessToken(String str) {
        LogMethodCall("RefreshCurrentAccessToken", str);
        UnityParams parse = UnityParams.parse(str);
        final UnityMessage unityMessage = new UnityMessage("OnRefreshCurrentAccessTokenComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        AccessToken.refreshCurrentAccessTokenAsync(new AccessToken.AccessTokenRefreshCallback() { // from class: com.facebook.unity.FB.5
            @Override // com.facebook.AccessToken.AccessTokenRefreshCallback
            public void OnTokenRefreshed(AccessToken accessToken) {
                FBLogin.addLoginParametersToMessage(UnityMessage.this, accessToken, null, null);
                UnityMessage.this.send();
            }

            @Override // com.facebook.AccessToken.AccessTokenRefreshCallback
            public void OnTokenRefreshFailed(FacebookException facebookException) {
                UnityMessage.this.sendError(facebookException.getMessage());
            }
        });
    }

    @TargetApi(8)
    public static String getKeyHash() {
        Activity unityActivity;
        try {
            unityActivity = getUnityActivity();
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
        }
        if (unityActivity == null) {
            return "";
        }
        Signature[] signatureArr = unityActivity.getPackageManager().getPackageInfo(unityActivity.getPackageName(), 64).signatures;
        if (signatureArr.length > 0) {
            Signature signature = signatureArr[0];
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(signature.toByteArray());
            String encodeToString = Base64.encodeToString(messageDigest.digest(), 0);
            Log.d(TAG, "KeyHash: " + encodeToString);
            return encodeToString;
        }
        return "";
    }

    @UnityCallable
    public static void ActivateApp() {
        AppEventsLogger.activateApp(getUnityActivity().getApplication());
    }

    @UnityCallable
    public static void OpenFriendFinderDialog(String str) {
        Log.v(TAG, "OpenFriendFinderDialog(" + str + ")");
        Bundle stringParams = UnityParams.parse(str).getStringParams();
        Intent intent2 = new Intent(getUnityActivity(), (Class<?>) FBUnityGamingServicesFriendFinderActivity.class);
        intent2.putExtra(FBUnityGamingServicesFriendFinderActivity.DIALOG_PARAMS, stringParams);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(getUnityActivity(), intent2);
    }

    @UnityCallable
    public static void UploadImageToMediaLibrary(String str) {
        Log.v(TAG, "UploadImageToMediaLibrary(" + str + ")");
        UnityParams parse = UnityParams.parse(str);
        String string = parse.getString(ShareConstants.FEED_CAPTION_PARAM);
        Uri parse2 = Uri.parse(parse.getString("imageUri"));
        if (parse2.getScheme() == null) {
            parse2 = parse2.buildUpon().scheme("file").build();
        }
        boolean parseBoolean = Boolean.parseBoolean(parse.getString("shouldLaunchMediaDialog"));
        final UnityMessage unityMessage = new UnityMessage("OnUploadImageToMediaLibraryComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            new GamingImageUploader(getUnityActivity()).uploadToMediaLibrary(string, parse2, parseBoolean, new GraphRequest.Callback() { // from class: com.facebook.unity.FB.6
                @Override // com.facebook.GraphRequest.Callback
                public void onCompleted(GraphResponse graphResponse) {
                    if (graphResponse.getError() != null) {
                        UnityMessage.this.sendError(graphResponse.getError().toString());
                        return;
                    }
                    String optString = graphResponse.getGraphObject().optString("id", null);
                    if (optString == null) {
                        UnityMessage.this.sendError("Response did not contain ImageID");
                    } else {
                        UnityMessage.this.put("id", optString);
                        UnityMessage.this.send();
                    }
                }
            });
        } catch (FileNotFoundException e) {
            unityMessage.sendError(e.toString());
        }
    }

    @UnityCallable
    public static void UploadVideoToMediaLibrary(String str) {
        Log.v(TAG, "UploadVideoToMediaLibrary(" + str + ")");
        UnityParams parse = UnityParams.parse(str);
        String string = parse.getString(ShareConstants.FEED_CAPTION_PARAM);
        Uri parse2 = Uri.parse(parse.getString("videoUri"));
        if (parse2.getScheme() == null) {
            parse2 = parse2.buildUpon().scheme("file").build();
        }
        final UnityMessage unityMessage = new UnityMessage("OnUploadVideoToMediaLibraryComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            new GamingVideoUploader(getUnityActivity()).uploadToMediaLibrary(string, parse2, new GraphRequest.OnProgressCallback() { // from class: com.facebook.unity.FB.7
                @Override // com.facebook.GraphRequest.OnProgressCallback
                public void onProgress(long j, long j2) {
                }

                @Override // com.facebook.GraphRequest.Callback
                public void onCompleted(GraphResponse graphResponse) {
                    if (graphResponse.getError() != null) {
                        UnityMessage.this.sendError(graphResponse.getError().toString());
                        return;
                    }
                    String optString = graphResponse.getGraphObject().optString("video_id", null);
                    if (optString == null) {
                        UnityMessage.this.sendError("Response did not contain ImageID");
                    } else {
                        UnityMessage.this.put("video_id", optString);
                        UnityMessage.this.send();
                    }
                }
            });
        } catch (FileNotFoundException e) {
            unityMessage.sendError(e.toString());
        }
    }

    @UnityCallable
    public static void OnIAPReady(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnOnIAPReadyComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        InAppPurchaseLibrary.onReady(getUnityActivity().getApplicationContext(), createDaemonCallback(unityMessage));
    }

    @UnityCallable
    public static void GetCatalog(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnGetCatalogComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        InAppPurchaseLibrary.getCatalog(getUnityActivity().getApplicationContext(), createDaemonCallback(unityMessage));
    }

    @UnityCallable
    public static void GetPurchases(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnGetPurchasesComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        InAppPurchaseLibrary.getPurchases(getUnityActivity().getApplicationContext(), createDaemonCallback(unityMessage));
    }

    @UnityCallable
    public static void Purchase(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnPurchaseComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        String string = parse.getString(SDKConstants.PARAM_PRODUCT_ID);
        String string2 = parse.getString(SDKConstants.PARAM_DEVELOPER_PAYLOAD);
        Context applicationContext = getUnityActivity().getApplicationContext();
        if (string2.isEmpty()) {
            string2 = null;
        }
        InAppPurchaseLibrary.purchase(applicationContext, string, string2, createDaemonCallback(unityMessage));
    }

    @UnityCallable
    public static void ConsumePurchase(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnConsumePurchaseComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        InAppPurchaseLibrary.consumePurchase(getUnityActivity().getApplicationContext(), parse.getString(SDKConstants.PARAM_PURCHASE_TOKEN), createDaemonCallback(unityMessage));
    }

    @UnityCallable
    public static void InitCloudGame(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnInitCloudGameComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            AccessToken init = CloudGameLoginHandler.init(getUnityActivity().getApplicationContext(), 25);
            UnityMessage unityMessage2 = new UnityMessage("OnLoginComplete");
            if (init == null) {
                unityMessage.sendError("Failed to receive access token.");
                return;
            }
            FBLogin.addLoginParametersToMessage(unityMessage2, init, null, null);
            unityMessage2.send();
            unityMessage.put("success", "");
            unityMessage.send();
        } catch (FacebookException e) {
            unityMessage.sendError(e.getMessage());
        }
    }

    @UnityCallable
    public static void GameLoadComplete(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnGameLoadCompleteComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        CloudGameLoginHandler.gameLoadComplete(getUnityActivity().getApplicationContext(), createDaemonCallback(unityMessage));
    }

    @UnityCallable
    public static void ScheduleAppToUserNotification(String str) {
        UnityParams parse = UnityParams.parse(str);
        final UnityMessage unityMessage = new UnityMessage("OnScheduleAppToUserNotificationComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        String string = parse.getString("title");
        String string2 = parse.getString("body");
        Uri parse2 = Uri.parse(parse.getString("media"));
        if (parse2.getScheme() == null) {
            parse2 = parse2.buildUpon().scheme("file").build();
        }
        Uri uri = parse2;
        try {
            int parseInt = Integer.parseInt(parse.getString("timeInterval"));
            String string3 = parse.getString("payload");
            if (string3.equals(POBCommonConstants.NULL_VALUE)) {
                string3 = null;
            }
            try {
                AppToUserNotificationSender.scheduleAppToUserNotification(string, string2, uri, parseInt, string3, new GraphRequest.Callback() { // from class: com.facebook.unity.FB.8
                    @Override // com.facebook.GraphRequest.Callback
                    public void onCompleted(GraphResponse graphResponse) {
                        if (graphResponse.getError() != null) {
                            UnityMessage.this.sendError(graphResponse.getError().toString());
                        } else {
                            UnityMessage.this.put("success", "");
                            UnityMessage.this.send();
                        }
                    }
                });
            } catch (FileNotFoundException e) {
                unityMessage.sendError(String.format(e.getMessage(), new Object[0]));
            }
        } catch (NumberFormatException e2) {
            unityMessage.sendError(String.format("Invalid timeInterval: %s", e2.getMessage()));
        }
    }

    @UnityCallable
    public static void LoadInterstitialAd(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnLoadInterstitialAdComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        InAppAdLibrary.loadInterstitialAd(getUnityActivity().getApplicationContext(), parse.getString(SDKConstants.PARAM_PLACEMENT_ID), createDaemonCallback(unityMessage));
    }

    @UnityCallable
    public static void ShowInterstitialAd(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnShowInterstitialAdComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        InAppAdLibrary.showInterstitialAd(getUnityActivity().getApplicationContext(), parse.getString(SDKConstants.PARAM_PLACEMENT_ID), createDaemonCallback(unityMessage));
    }

    @UnityCallable
    public static void LoadRewardedVideo(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnLoadRewardedVideoComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        InAppAdLibrary.loadRewardedVideo(getUnityActivity().getApplicationContext(), parse.getString(SDKConstants.PARAM_PLACEMENT_ID), createDaemonCallback(unityMessage));
    }

    @UnityCallable
    public static void ShowRewardedVideo(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnShowRewardedVideoComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        InAppAdLibrary.showRewardedVideo(getUnityActivity().getApplicationContext(), parse.getString(SDKConstants.PARAM_PLACEMENT_ID), createDaemonCallback(unityMessage));
    }

    @UnityCallable
    public static void GetPayload(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnGetPayloadComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        GameFeaturesLibrary.getPayload(getUnityActivity().getApplicationContext(), new JSONObject(), createDaemonCallback(unityMessage));
    }

    @UnityCallable
    public static void PostSessionScore(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnPostSessionScoreComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            GameFeaturesLibrary.postSessionScoreAsync(getUnityActivity().getApplicationContext(), Integer.parseInt(parse.getString("score")), createDaemonCallback(unityMessage));
        } catch (NumberFormatException e) {
            unityMessage.sendError(String.format("Invalid score: %s", e.getMessage()));
        }
    }

    @UnityCallable
    public static void PostTournamentScore(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnPostTournamentScoreComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            try {
                GameFeaturesLibrary.postTournamentScoreAsync(getUnityActivity().getApplicationContext(), Integer.parseInt(parse.getString("score")), createDaemonCallback(unityMessage));
            } catch (JSONException e) {
                unityMessage.sendError(e.getMessage());
            }
        } catch (NumberFormatException e2) {
            unityMessage.sendError(String.format("Invalid score: %s", e2.getMessage()));
        }
    }

    @UnityCallable
    public static void GetTournament(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnGetTournamentComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        GameFeaturesLibrary.getTournamentAsync(getUnityActivity().getApplicationContext(), createDaemonCallback(unityMessage));
    }

    @UnityCallable
    public static void ShareTournament(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnShareTournamentComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            int parseInt = Integer.parseInt(parse.getString("score"));
            JSONObject jSONObject = new JSONObject();
            Bundle stringParams = parse.getParamsObject("data").getStringParams();
            for (String str2 : stringParams.keySet()) {
                try {
                    jSONObject.put(str2, stringParams.get(str2));
                } catch (JSONException e) {
                    unityMessage.sendError(String.format("Invalid data payload: %s", e.getMessage()));
                }
            }
            GameFeaturesLibrary.shareTournamentAsync(getUnityActivity().getApplicationContext(), Integer.valueOf(parseInt), jSONObject, createDaemonCallback(unityMessage));
        } catch (NumberFormatException e2) {
            unityMessage.sendError(String.format("Invalid score: %s", e2.getMessage()));
        }
    }

    @UnityCallable
    public static void CreateTournament(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnCreateTournamentComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            int parseInt = Integer.parseInt(parse.getString(SDKConstants.PARAM_INITIAL_SCORE));
            String string = parse.getString("title");
            String string2 = parse.getString("imageBase64DataUrl");
            String string3 = parse.getString(SDKConstants.PARAM_SORT_ORDER);
            String string4 = parse.getString(SDKConstants.PARAM_SCORE_FORMAT);
            Bundle stringParams = parse.getParamsObject("data").getStringParams();
            JSONObject jSONObject = new JSONObject();
            for (String str2 : stringParams.keySet()) {
                try {
                    jSONObject.put(str2, stringParams.get(str2));
                } catch (JSONException e) {
                    unityMessage.sendError(String.format("Invalid data payload: %s", e.getMessage()));
                }
            }
            GameFeaturesLibrary.createTournamentAsync(getUnityActivity().getApplicationContext(), parseInt, string, string2, string3, string4, null, jSONObject, createDaemonCallback(unityMessage));
        } catch (NumberFormatException e2) {
            unityMessage.sendError(String.format("Invalid initialScore: %s", e2.getMessage()));
        }
    }

    @UnityCallable
    public static void GetTournaments(String str) {
        final UnityMessage createWithCallbackFromParams = UnityMessage.createWithCallbackFromParams("OnGetTournamentsComplete", UnityParams.parse(str));
        new TournamentFetcher().fetchTournaments().getTask().continueWith(new Continuation<List<Tournament>, Void>() { // from class: com.facebook.unity.FB.9
            @Override // com.facebook.bolts.Continuation
            public Void then(Task<List<Tournament>> task) throws Exception {
                if (task.isFaulted()) {
                    UnityMessage.this.sendError(String.format("Tournaments fetcher failed with Error: \n%s", task.getError()));
                    return null;
                }
                if (task.isCancelled()) {
                    UnityMessage.this.sendError("Tournaments fetcher cancelled");
                    return null;
                }
                List<Tournament> result = task.getResult();
                new Bundle();
                UnityMessage.this.put("tournaments", task.getResult().toString());
                UnityMessage.this.put("count", Integer.valueOf(result.size()));
                for (Tournament tournament : result) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(SDKConstants.PARAM_TOURNAMENTS_TITLE, tournament.title);
                    jSONObject.put("payload", tournament.payload);
                    jSONObject.put(SDKConstants.PARAM_TOURNAMENTS_END_TIME, tournament.endTime);
                    jSONObject.put(SDKConstants.PARAM_TOURNAMENTS_ID, tournament.identifier);
                    UnityMessage.this.put(Integer.toString(0), jSONObject.toString());
                }
                UnityMessage.this.send();
                return null;
            }
        });
    }

    @UnityCallable
    public static void UpdateTournament(String str) {
        UnityParams parse = UnityParams.parse(str);
        final UnityMessage createWithCallbackFromParams = UnityMessage.createWithCallbackFromParams("OnUpdateTournamentComplete", parse);
        new TournamentUpdater().update(parse.getString("tournamentID"), Integer.valueOf(Integer.parseInt(parse.getString("score")))).getTask().continueWith(new Continuation<Boolean, Void>() { // from class: com.facebook.unity.FB.10
            @Override // com.facebook.bolts.Continuation
            public Void then(Task<Boolean> task) throws Exception {
                if (task.isFaulted()) {
                    UnityMessage.this.sendError(String.format("Tournaments updater failed with Error: \n%s", task.getError()));
                    return null;
                }
                if (task.isCancelled()) {
                    UnityMessage.this.putCancelled();
                    UnityMessage.this.send();
                    return null;
                }
                UnityMessage.this.put(InitializationStatus.SUCCESS, task.getResult());
                UnityMessage.this.send();
                return null;
            }
        });
    }

    @UnityCallable
    public static void UpdateAndShareTournament(String str) {
        UnityMessage.createWithCallbackFromParams("OnTournamentDialogError", UnityParams.parse(str)).sendError("Update and Share is not yet supported on Android.");
    }

    @UnityCallable
    public static void CreateAndShareTournament(String str) {
        TournamentConfig build;
        Instant ofEpochSecond;
        final UnityParams parse = UnityParams.parse(str);
        int parseInt = Integer.parseInt(parse.getString(SDKConstants.PARAM_INITIAL_SCORE));
        final String string = parse.getString("title");
        final String string2 = parse.getString("payload");
        final long parseLong = Long.parseLong(parse.getString("endTime"));
        TournamentScoreType tournamentScoreType = parse.getString("scoreType").equals("Numeric") ? TournamentScoreType.NUMERIC : TournamentScoreType.TIME;
        TournamentSortOrder tournamentSortOrder = parse.getString(SDKConstants.PARAM_SORT_ORDER).equals("HigherIsBetter") ? TournamentSortOrder.HigherIsBetter : TournamentSortOrder.LowerIsBetter;
        if (Build.VERSION.SDK_INT >= 26) {
            ofEpochSecond = Instant.ofEpochSecond(parseLong);
            build = new TournamentConfig.Builder().setTournamentTitle(string).setTournamentSortOrder(tournamentSortOrder).setTournamentScoreType(tournamentScoreType).setTournamentPayload(string2).setTournamentEndTime(ofEpochSecond).build();
        } else {
            build = new TournamentConfig.Builder().setTournamentTitle(string).setTournamentSortOrder(tournamentSortOrder).setTournamentScoreType(tournamentScoreType).setTournamentPayload(string2).build();
        }
        TournamentConfig tournamentConfig = build;
        TournamentShareDialog tournamentShareDialog = new TournamentShareDialog(getUnityActivity());
        tournamentShareDialog.registerCallback(callbackManager, new FacebookCallback<TournamentShareDialog.Result>() { // from class: com.facebook.unity.FB.11
            @Override // com.facebook.FacebookCallback
            public void onSuccess(TournamentShareDialog.Result result) {
                UnityMessage createWithCallbackFromParams = UnityMessage.createWithCallbackFromParams("OnTournamentDialogSuccess", UnityParams.this);
                createWithCallbackFromParams.put(SDKConstants.PARAM_TOURNAMENTS_ID, result.getTournamentID());
                createWithCallbackFromParams.put(SDKConstants.PARAM_TOURNAMENTS_END_TIME, Long.valueOf(parseLong));
                createWithCallbackFromParams.put(SDKConstants.PARAM_TOURNAMENTS_TITLE, string);
                createWithCallbackFromParams.put("payload", string2);
                createWithCallbackFromParams.send();
            }

            @Override // com.facebook.FacebookCallback
            public void onCancel() {
                UnityMessage createWithCallbackFromParams = UnityMessage.createWithCallbackFromParams("OnTournamentDialogCancel", UnityParams.this);
                createWithCallbackFromParams.putCancelled();
                createWithCallbackFromParams.send();
            }

            @Override // com.facebook.FacebookCallback
            public void onError(FacebookException facebookException) {
                UnityMessage.createWithCallbackFromParams("OnTournamentDialogError", UnityParams.this).sendError(facebookException.toString());
            }
        });
        tournamentShareDialog.show(Integer.valueOf(parseInt), tournamentConfig);
    }

    public static void OpenAppStore(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnOpenAppStoreComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        PlayableAdsLibrary.openAppStore(getUnityActivity().getApplicationContext(), new JSONObject(), createDaemonCallback(unityMessage));
    }

    @UnityCallable
    public static void CreateGamingContext(String str) {
        Log.v(TAG, "CreateGamingContext(" + str + ")");
        startActivity(FBUnityCreateGamingContextActivity.class, str);
    }

    @UnityCallable
    public static void SwitchGamingContext(String str) {
        Log.v(TAG, "SwitchGamingContext(" + str + ")");
        startActivity(FBUnitySwitchGamingContextActivity.class, str);
    }

    @UnityCallable
    public static void ChooseGamingContext(String str) {
        Log.v(TAG, "ChooseGamingContext(" + str + ")");
        startActivity(FBUnityChooseGamingContextActivity.class, str);
    }

    @UnityCallable
    public static void GetCurrentGamingContext(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnCreateTournamentComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            unityMessage.put("contextId", GamingContext.getCurrentGamingContext().getContextID());
            unityMessage.send();
        } catch (Exception e) {
            unityMessage.sendError(String.format("Fail to get current gaming context: %s", e.getMessage()));
        }
    }

    private static DaemonRequest.Callback createDaemonCallback(final UnityMessage unityMessage) {
        return new DaemonRequest.Callback() { // from class: com.facebook.unity.FB.12
            @Override // com.facebook.gamingservices.cloudgaming.DaemonRequest.Callback
            public void onCompleted(GraphResponse graphResponse) {
                FacebookRequestError error = graphResponse.getError();
                if (error != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, error.getErrorCode());
                        jSONObject.put("subErrorCode", error.getSubErrorCode());
                        jSONObject.put("errorType", error.getErrorType());
                        jSONObject.put("errorMessage", error.getErrorMessage());
                        UnityMessage.this.sendError(jSONObject.toString());
                        return;
                    } catch (JSONException unused) {
                        UnityMessage.this.sendError(error.toString());
                        return;
                    }
                }
                if (graphResponse.getGraphObject() != null) {
                    UnityMessage.this.put("success", graphResponse.getGraphObject().toString());
                    UnityMessage.this.send();
                } else if (graphResponse.getGraphObjectArray() != null) {
                    UnityMessage.this.put("success", graphResponse.getGraphObjectArray().toString());
                    UnityMessage.this.send();
                } else {
                    UnityMessage.this.sendError("invalid response");
                }
            }
        };
    }

    private static void ActivateApp(String str) {
        if (!activateAppCalled.compareAndSet(false, true)) {
            Log.w(TAG, "Activite app only needs to be called once");
            return;
        }
        final Activity unityActivity = getUnityActivity();
        if (str != null) {
            AppEventsLogger.activateApp(unityActivity.getApplication(), str);
        } else {
            AppEventsLogger.activateApp(unityActivity.getApplication());
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.unity.FB.13
            @Override // java.lang.Runnable
            public void run() {
                ActivityLifecycleTracker.onActivityCreated(unityActivity);
                ActivityLifecycleTracker.onActivityResumed(unityActivity);
            }
        });
    }

    private static void startActivity(Class<?> cls, String str) {
        Intent intent2 = new Intent(getUnityActivity(), cls);
        intent2.putExtra(BaseActivity.ACTIVITY_PARAMS, UnityParams.parse(str).getStringParams());
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(getUnityActivity(), intent2);
    }

    private static void LogMethodCall(String str, String str2) {
        Log.v(TAG, String.format(Locale.ROOT, "%s(%s)", str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void addAppLinkToMessage(UnityMessage unityMessage, AppLinkData appLinkData) {
        if (appLinkData == null) {
            unityMessage.put("did_complete", Boolean.TRUE);
            return;
        }
        unityMessage.put("ref", appLinkData.getRef());
        unityMessage.put("target_url", appLinkData.getTargetUri().toString());
        try {
            if (appLinkData.getArgumentBundle() != null) {
                unityMessage.put("extras", BundleJSONConverter.convertToJSON(appLinkData.getArgumentBundle()).toString());
            }
        } catch (JSONException e) {
            Log.e(TAG, e.getLocalizedMessage());
        }
    }

    @UnityCallable
    public static void GetSubscribableCatalog(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnGetSubscribableCatalogComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        InAppPurchaseLibrary.getSubscribableCatalog(getUnityActivity().getApplicationContext(), createDaemonCallback(unityMessage));
    }

    @UnityCallable
    public static void GetSubscriptions(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnGetSubscriptionsComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        InAppPurchaseLibrary.getSubscriptions(getUnityActivity().getApplicationContext(), createDaemonCallback(unityMessage));
    }

    @UnityCallable
    public static void PurchaseSubscription(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnPurchaseSubscriptionComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        InAppPurchaseLibrary.purchaseSubscription(getUnityActivity().getApplicationContext(), parse.getString(SDKConstants.PARAM_PRODUCT_ID), createDaemonCallback(unityMessage));
    }

    @UnityCallable
    public static void CancelSubscription(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnCancelSubscriptionComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        InAppPurchaseLibrary.cancelSubscription(getUnityActivity().getApplicationContext(), parse.getString(SDKConstants.PARAM_PURCHASE_TOKEN), createDaemonCallback(unityMessage));
    }
}
