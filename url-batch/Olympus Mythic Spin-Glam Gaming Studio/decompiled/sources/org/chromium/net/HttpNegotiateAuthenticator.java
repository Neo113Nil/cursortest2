package org.chromium.net;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import androidx.annotation.VisibleForTesting;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import internal.org.jni_zero.CalledByNative;
import java.io.IOException;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ContextUtils;
import org.chromium.base.Log;
import org.chromium.base.ThreadUtils;

/* loaded from: classes9.dex */
public class HttpNegotiateAuthenticator {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "net_auth";
    private final String mAccountType;
    private Bundle mSpnegoContext;

    interface Natives {
        void setResult(long j, int i, String str);
    }

    static class RequestData {
        public Account account;
        public final AccountManager accountManager;
        public final String authTokenType;
        public final long nativeResultObject;
        public final Bundle options;

        RequestData(long j, AccountManager accountManager, Bundle bundle, String str) {
            this.nativeResultObject = j;
            this.accountManager = accountManager;
            this.options = bundle;
            this.authTokenType = str;
        }
    }

    @VisibleForTesting
    class GetAccountsCallback implements AccountManagerCallback<Account[]> {
        private final RequestData mRequestData;

        public GetAccountsCallback(RequestData requestData) {
            this.mRequestData = requestData;
        }

        @Override // android.accounts.AccountManagerCallback
        public void run(AccountManagerFuture<Account[]> accountManagerFuture) {
            try {
                Account[] result = accountManagerFuture.getResult();
                if (result.length == 0) {
                    Log.w(HttpNegotiateAuthenticator.TAG, "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ");
                    HttpNegotiateAuthenticatorJni.get().setResult(this.mRequestData.nativeResultObject, NetError.ERR_MISSING_AUTH_CREDENTIALS, null);
                    return;
                }
                if (result.length > 1) {
                    Log.w(HttpNegotiateAuthenticator.TAG, "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", Integer.valueOf(result.length));
                    HttpNegotiateAuthenticatorJni.get().setResult(this.mRequestData.nativeResultObject, NetError.ERR_MISSING_AUTH_CREDENTIALS, null);
                } else if (HttpNegotiateAuthenticator.this.lacksPermission(ContextUtils.getApplicationContext(), "android.permission.USE_CREDENTIALS", true)) {
                    Log.e(HttpNegotiateAuthenticator.TAG, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.");
                    HttpNegotiateAuthenticatorJni.get().setResult(this.mRequestData.nativeResultObject, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
                } else {
                    RequestData requestData = this.mRequestData;
                    Account account = result[0];
                    requestData.account = account;
                    requestData.accountManager.getAuthToken(account, requestData.authTokenType, requestData.options, true, (AccountManagerCallback<Bundle>) HttpNegotiateAuthenticator.this.new GetTokenCallback(requestData), new Handler(ThreadUtils.getUiThreadLooper()));
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                Log.w(HttpNegotiateAuthenticator.TAG, "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e);
                HttpNegotiateAuthenticatorJni.get().setResult(this.mRequestData.nativeResultObject, -9, null);
            }
        }
    }

    @VisibleForTesting
    class GetTokenCallback implements AccountManagerCallback<Bundle> {
        private final RequestData mRequestData;

        public GetTokenCallback(RequestData requestData) {
            this.mRequestData = requestData;
        }

        @Override // android.accounts.AccountManagerCallback
        public void run(AccountManagerFuture<Bundle> accountManagerFuture) {
            try {
                Bundle result = accountManagerFuture.getResult();
                if (result.containsKey(SDKConstants.PARAM_INTENT)) {
                    final Context applicationContext = ContextUtils.getApplicationContext();
                    ContextUtils.registerProtectedBroadcastReceiver(applicationContext, new BroadcastReceiver(this) { // from class: org.chromium.net.HttpNegotiateAuthenticator.GetTokenCallback.1
                        final /* synthetic */ GetTokenCallback this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context, Intent intent) {
                            applicationContext.unregisterReceiver(this);
                            AccountManager accountManager = this.this$1.mRequestData.accountManager;
                            Account account = this.this$1.mRequestData.account;
                            String str = this.this$1.mRequestData.authTokenType;
                            Bundle bundle = this.this$1.mRequestData.options;
                            GetTokenCallback getTokenCallback = this.this$1;
                            accountManager.getAuthToken(account, str, bundle, true, (AccountManagerCallback<Bundle>) HttpNegotiateAuthenticator.this.new GetTokenCallback(getTokenCallback.mRequestData), (Handler) null);
                        }
                    }, new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
                } else {
                    HttpNegotiateAuthenticator.this.processResult(result, this.mRequestData);
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                Log.w(HttpNegotiateAuthenticator.TAG, "ERR_UNEXPECTED: Error while attempting to obtain a token.", e);
                HttpNegotiateAuthenticatorJni.get().setResult(this.mRequestData.nativeResultObject, -9, null);
            }
        }
    }

    protected HttpNegotiateAuthenticator(String str) {
        this.mAccountType = str;
    }

    @CalledByNative
    @VisibleForTesting
    static HttpNegotiateAuthenticator create(String str) {
        return new HttpNegotiateAuthenticator(str);
    }

    @CalledByNative
    @VisibleForTesting
    void getNextAuthToken(long j, String str, String str2, boolean z) {
        Context applicationContext = ContextUtils.getApplicationContext();
        String[] strArr = {HttpNegotiateConstants.SPNEGO_FEATURE};
        Bundle bundle = new Bundle();
        if (str2 != null) {
            bundle.putString(HttpNegotiateConstants.KEY_INCOMING_AUTH_TOKEN, str2);
        }
        Bundle bundle2 = this.mSpnegoContext;
        if (bundle2 != null) {
            bundle.putBundle(HttpNegotiateConstants.KEY_SPNEGO_CONTEXT, bundle2);
        }
        bundle.putBoolean(HttpNegotiateConstants.KEY_CAN_DELEGATE, z);
        RequestData requestData = new RequestData(j, AccountManager.get(applicationContext), bundle, HttpNegotiateConstants.SPNEGO_TOKEN_TYPE_BASE + str);
        Activity lastTrackedFocusedActivity = ApplicationStatus.getLastTrackedFocusedActivity();
        if (lastTrackedFocusedActivity == null) {
            requestTokenWithoutActivity(applicationContext, requestData, strArr);
        } else {
            requestTokenWithActivity(applicationContext, lastTrackedFocusedActivity, requestData, strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processResult(Bundle bundle, RequestData requestData) {
        this.mSpnegoContext = bundle.getBundle(HttpNegotiateConstants.KEY_SPNEGO_CONTEXT);
        int i = -9;
        switch (bundle.getInt(HttpNegotiateConstants.KEY_SPNEGO_RESULT, 1)) {
            case 0:
                i = 0;
                break;
            case 2:
                i = -3;
                break;
            case 3:
                i = NetError.ERR_UNEXPECTED_SECURITY_LIBRARY_STATUS;
                break;
            case 4:
                i = NetError.ERR_INVALID_RESPONSE;
                break;
            case 5:
                i = NetError.ERR_INVALID_AUTH_CREDENTIALS;
                break;
            case 6:
                i = NetError.ERR_UNSUPPORTED_AUTH_SCHEME;
                break;
            case 7:
                i = NetError.ERR_MISSING_AUTH_CREDENTIALS;
                break;
            case 8:
                i = NetError.ERR_UNDOCUMENTED_SECURITY_LIBRARY_STATUS;
                break;
            case 9:
                i = NetError.ERR_MALFORMED_IDENTITY;
                break;
        }
        HttpNegotiateAuthenticatorJni.get().setResult(requestData.nativeResultObject, i, bundle.getString("authtoken"));
    }

    private void requestTokenWithoutActivity(Context context, RequestData requestData, String[] strArr) {
        if (lacksPermission(context, "android.permission.GET_ACCOUNTS", true)) {
            Log.e(TAG, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: GET_ACCOUNTS permission not granted. Aborting authentication.");
            HttpNegotiateAuthenticatorJni.get().setResult(requestData.nativeResultObject, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
        } else {
            requestData.accountManager.getAccountsByTypeAndFeatures(this.mAccountType, strArr, new GetAccountsCallback(requestData), new Handler(ThreadUtils.getUiThreadLooper()));
        }
    }

    private void requestTokenWithActivity(Context context, Activity activity, RequestData requestData, String[] strArr) {
        if (lacksPermission(context, "android.permission.GET_ACCOUNTS", false)) {
            Log.e(TAG, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: %s permission not granted. Aborting authentication", "android.permission.GET_ACCOUNTS");
            HttpNegotiateAuthenticatorJni.get().setResult(requestData.nativeResultObject, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
        } else {
            requestData.accountManager.getAuthTokenByFeatures(this.mAccountType, requestData.authTokenType, strArr, activity, null, requestData.options, new GetTokenCallback(requestData), new Handler(ThreadUtils.getUiThreadLooper()));
        }
    }

    @VisibleForTesting
    boolean lacksPermission(Context context, String str, boolean z) {
        return (z || context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) ? false : true;
    }
}
