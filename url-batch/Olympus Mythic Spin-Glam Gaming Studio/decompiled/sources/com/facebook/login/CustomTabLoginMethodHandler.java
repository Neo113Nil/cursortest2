package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessTokenSource;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.internal.CustomTab;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.InstagramCustomTab;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.login.LoginClient;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.sglib.easymobile.androidnative.notification.NotificationRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CustomTabLoginMethodHandler.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u00010B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0014J\n\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0014J\"\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\t2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020,H\u0002J\u0018\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0018H\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/facebook/login/CustomTabLoginMethodHandler;", "Lcom/facebook/login/WebLoginMethodHandler;", "loginClient", "Lcom/facebook/login/LoginClient;", "(Lcom/facebook/login/LoginClient;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "chromePackage", "", "getChromePackage", "()Ljava/lang/String;", "currentPackage", "developerDefinedRedirectURI", "getDeveloperDefinedRedirectURI", "expectedChallenge", "nameForLogging", "getNameForLogging", "tokenSource", "Lcom/facebook/AccessTokenSource;", "getTokenSource", "()Lcom/facebook/AccessTokenSource;", "validRedirectURI", "describeContents", "", "getRedirectUrl", "getSSODevice", "onActivityResult", "", NotificationRequest.REQUEST_CODE_KEY, X3.f.f, "data", "Landroid/content/Intent;", "onCustomTabComplete", "", "url", "request", "Lcom/facebook/login/LoginClient$Request;", "putChallengeParam", "param", "Lorg/json/JSONObject;", "tryAuthorize", "validateChallengeParam", "values", "Landroid/os/Bundle;", "writeToParcel", "dest", "flags", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes15.dex */
public final class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    private static final int API_EC_DIALOG_CANCEL = 4201;
    private static final int CHALLENGE_LENGTH = 20;
    private static final int CUSTOM_TAB_REQUEST_CODE = 1;

    @NotNull
    public static final String OAUTH_DIALOG = "oauth";
    public static boolean calledThroughLoggedOutAppSwitch;

    @Nullable
    private String currentPackage;

    @Nullable
    private String expectedChallenge;

    @NotNull
    private final String nameForLogging;

    @NotNull
    private final AccessTokenSource tokenSource;

    @NotNull
    private String validRedirectURI;

    @NotNull
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new Parcelable.Creator<CustomTabLoginMethodHandler>() { // from class: com.facebook.login.CustomTabLoginMethodHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CustomTabLoginMethodHandler createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new CustomTabLoginMethodHandler(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CustomTabLoginMethodHandler[] newArray(int size) {
            return new CustomTabLoginMethodHandler[size];
        }
    };

    public static void safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(Fragment p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.facebook");
        p0.startActivityForResult(p1, p2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.nameForLogging = "custom_tab";
        this.tokenSource = AccessTokenSource.CHROME_CUSTOM_TAB;
        this.expectedChallenge = Utility.generateRandomString(20);
        calledThroughLoggedOutAppSwitch = false;
        CustomTabUtils customTabUtils = CustomTabUtils.INSTANCE;
        this.validRedirectURI = CustomTabUtils.getValidRedirectURI(getDeveloperDefinedRedirectURI());
    }

    @Override // com.facebook.login.LoginMethodHandler
    @NotNull
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    @NotNull
    public AccessTokenSource getTokenSource() {
        return this.tokenSource;
    }

    private final String getDeveloperDefinedRedirectURI() {
        return super.getValidRedirectURI();
    }

    @Override // com.facebook.login.LoginMethodHandler
    @NotNull
    /* renamed from: getRedirectUrl, reason: from getter */
    protected String getValidRedirectURI() {
        return this.validRedirectURI;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    @Nullable
    protected String getSSODevice() {
        return "chrome_custom_tab";
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int tryAuthorize(@NotNull LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        LoginClient loginClient = getLoginClient();
        if (getValidRedirectURI().length() == 0) {
            return 0;
        }
        Bundle addExtraParameters = addExtraParameters(getParameters(request), request);
        if (calledThroughLoggedOutAppSwitch) {
            addExtraParameters.putString(ServerProtocol.DIALOG_PARAM_CCT_OVER_LOGGED_OUT_APP_SWITCH, "1");
        }
        if (FacebookSdk.hasCustomTabsPrefetching) {
            if (request.isInstagramLogin()) {
                CustomTabPrefetchHelper.INSTANCE.mayLaunchUrl(InstagramCustomTab.INSTANCE.getURIForAction(OAUTH_DIALOG, addExtraParameters));
            } else {
                CustomTabPrefetchHelper.INSTANCE.mayLaunchUrl(CustomTab.INSTANCE.getURIForAction(OAUTH_DIALOG, addExtraParameters));
            }
        }
        FragmentActivity activity = loginClient.getActivity();
        if (activity == null) {
            return 0;
        }
        Intent intent = new Intent(activity, (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.EXTRA_ACTION, OAUTH_DIALOG);
        intent.putExtra(CustomTabMainActivity.EXTRA_PARAMS, addExtraParameters);
        intent.putExtra(CustomTabMainActivity.EXTRA_CHROME_PACKAGE, getChromePackage());
        intent.putExtra(CustomTabMainActivity.EXTRA_TARGET_APP, request.getLoginTargetApp().getTargetApp());
        Fragment fragment = loginClient.getFragment();
        if (fragment != null) {
            safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(fragment, intent, 1);
        }
        return 1;
    }

    private final String getChromePackage() {
        String str = this.currentPackage;
        if (str != null) {
            return str;
        }
        String chromePackage = CustomTabUtils.getChromePackage();
        this.currentPackage = chromePackage;
        return chromePackage;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (data != null && data.getBooleanExtra(CustomTabMainActivity.NO_ACTIVITY_EXCEPTION, false)) {
            return super.onActivityResult(requestCode, resultCode, data);
        }
        if (requestCode != 1) {
            return super.onActivityResult(requestCode, resultCode, data);
        }
        LoginClient.Request pendingRequest = getLoginClient().getPendingRequest();
        if (pendingRequest == null) {
            return false;
        }
        if (resultCode == -1) {
            onCustomTabComplete(data != null ? data.getStringExtra(CustomTabMainActivity.EXTRA_URL) : null, pendingRequest);
            return true;
        }
        super.onComplete(pendingRequest, null, new FacebookOperationCanceledException());
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onCustomTabComplete(String url, final LoginClient.Request request) {
        int parseInt;
        if (url == null) {
            return;
        }
        if (!StringsKt.startsWith$default(url, Validate.CUSTOM_TAB_REDIRECT_URI_PREFIX, false, 2, (Object) null) && !StringsKt.startsWith$default(url, super.getValidRedirectURI(), false, 2, (Object) null)) {
            return;
        }
        Uri parse = Uri.parse(url);
        Utility utility = Utility.INSTANCE;
        final Bundle parseUrlQueryString = Utility.parseUrlQueryString(parse.getQuery());
        parseUrlQueryString.putAll(Utility.parseUrlQueryString(parse.getFragment()));
        if (!validateChallengeParam(parseUrlQueryString)) {
            super.onComplete(request, null, new FacebookException("Invalid state parameter"));
            return;
        }
        String string = parseUrlQueryString.getString("error");
        if (string == null) {
            string = parseUrlQueryString.getString("error_type");
        }
        String string2 = parseUrlQueryString.getString("error_msg");
        if (string2 == null) {
            string2 = parseUrlQueryString.getString("error_message");
        }
        if (string2 == null) {
            string2 = parseUrlQueryString.getString(NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION);
        }
        String string3 = parseUrlQueryString.getString("error_code");
        if (string3 != null) {
            try {
                parseInt = Integer.parseInt(string3);
            } catch (NumberFormatException unused) {
            }
            if (!Utility.isNullOrEmpty(string) && Utility.isNullOrEmpty(string2) && parseInt == -1) {
                if (parseUrlQueryString.containsKey("access_token")) {
                    super.onComplete(request, parseUrlQueryString, null);
                    return;
                } else {
                    FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.login.CustomTabLoginMethodHandler$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            CustomTabLoginMethodHandler.m3472onCustomTabComplete$lambda0(CustomTabLoginMethodHandler.this, request, parseUrlQueryString);
                        }
                    });
                    return;
                }
            }
            if (string == null && (Intrinsics.areEqual(string, "access_denied") || Intrinsics.areEqual(string, "OAuthAccessDeniedException"))) {
                super.onComplete(request, null, new FacebookOperationCanceledException());
                return;
            } else if (parseInt != API_EC_DIALOG_CANCEL) {
                super.onComplete(request, null, new FacebookOperationCanceledException());
                return;
            } else {
                super.onComplete(request, null, new FacebookServiceException(new FacebookRequestError(parseInt, string, string2), string2));
                return;
            }
        }
        parseInt = -1;
        if (!Utility.isNullOrEmpty(string)) {
        }
        if (string == null) {
        }
        if (parseInt != API_EC_DIALOG_CANCEL) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCustomTabComplete$lambda-0, reason: not valid java name */
    public static final void m3472onCustomTabComplete$lambda0(CustomTabLoginMethodHandler this$0, LoginClient.Request request, Bundle values) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(values, "$values");
        try {
            this$0.onComplete(request, this$0.processCodeExchange(request, values), null);
        } catch (FacebookException e) {
            this$0.onComplete(request, null, e);
        }
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void putChallengeParam(@NotNull JSONObject param) throws JSONException {
        Intrinsics.checkNotNullParameter(param, "param");
        param.put(LoginLogger.EVENT_PARAM_CHALLENGE, this.expectedChallenge);
    }

    private final boolean validateChallengeParam(Bundle values) {
        try {
            String string = values.getString("state");
            if (string == null) {
                return false;
            }
            return Intrinsics.areEqual(new JSONObject(string).getString(LoginLogger.EVENT_PARAM_CHALLENGE), this.expectedChallenge);
        } catch (JSONException unused) {
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(@NotNull Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.nameForLogging = "custom_tab";
        this.tokenSource = AccessTokenSource.CHROME_CUSTOM_TAB;
        this.expectedChallenge = source.readString();
        CustomTabUtils customTabUtils = CustomTabUtils.INSTANCE;
        this.validRedirectURI = CustomTabUtils.getValidRedirectURI(getDeveloperDefinedRedirectURI());
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, flags);
        dest.writeString(this.expectedChallenge);
    }
}
