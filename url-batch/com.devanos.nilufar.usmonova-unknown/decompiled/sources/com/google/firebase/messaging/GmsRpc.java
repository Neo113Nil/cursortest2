package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import o.C0998es;
import o.C1097gL;
import o.C1623oL;
import o.DY;
import o.ExecutorC2239xi;
import o.ExecutorC2280yJ;
import o.KX;
import o.MU;
import o.TO;
import o.ZO;
import o.l30;
import o.n30;
import o.p30;

/* loaded from: classes.dex */
class GmsRpc {
    static final String CMD_RST = "RST";
    static final String CMD_RST_FULL = "RST_FULL";
    static final String CMD_SYNC = "SYNC";
    static final String ERROR_INSTANCE_ID_RESET = "INSTANCE_ID_RESET";
    static final String ERROR_INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
    static final String ERROR_INTERNAL_SERVER_ERROR_ALT = "InternalServerError";
    static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    private static final String EXTRA_DELETE = "delete";
    private static final String EXTRA_ERROR = "error";
    private static final String EXTRA_IID_OPERATION = "iid-operation";
    private static final String EXTRA_REGISTRATION_ID = "registration_id";
    private static final String EXTRA_SCOPE = "scope";
    private static final String EXTRA_SENDER = "sender";
    private static final String EXTRA_SUBTYPE = "subtype";
    private static final String EXTRA_TOPIC = "gcm.topic";
    private static final String EXTRA_UNREGISTERED = "unregistered";
    static final String FIREBASE_IID_HEARTBEAT_TAG = "fire-iid";
    private static final String PARAM_APP_VER_CODE = "app_ver";
    private static final String PARAM_APP_VER_NAME = "app_ver_name";
    private static final String PARAM_CLIENT_VER = "cliv";
    private static final String PARAM_FIREBASE_APP_NAME_HASH = "firebase-app-name-hash";
    private static final String PARAM_FIS_AUTH_TOKEN = "Goog-Firebase-Installations-Auth";
    private static final String PARAM_GMP_APP_ID = "gmp_app_id";
    private static final String PARAM_GMS_VER = "gmsv";
    private static final String PARAM_HEARTBEAT_CODE = "Firebase-Client-Log-Type";
    private static final String PARAM_INSTANCE_ID = "appid";
    private static final String PARAM_OS_VER = "osv";
    private static final String PARAM_USER_AGENT = "Firebase-Client";
    private static final String SCOPE_ALL = "*";
    static final String TAG = "FirebaseMessaging";
    static final String TOO_MANY_SUBSCRIBERS = "TOO_MANY_SUBSCRIBERS";
    private static final String TOPIC_PREFIX = "/topics/";
    private final FirebaseApp app;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final Provider<HeartBeatInfo> heartbeatInfo;
    private final Metadata metadata;
    private final TO rpc;
    private final Provider<UserAgentPublisher> userAgentPublisher;

    public GmsRpc(FirebaseApp firebaseApp, Metadata metadata, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, metadata, new TO(firebaseApp.getApplicationContext()), provider, provider2, firebaseInstallationsApi);
    }

    private static String base64UrlSafe(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private MU extractResponseWhenComplete(MU mu) {
        return mu.d(new ExecutorC2280yJ(), new c(1, this));
    }

    private String getHashedFirebaseAppName() {
        try {
            return base64UrlSafe(MessageDigest.getInstance("SHA-1").digest(this.app.getName().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String handleResponse(Bundle bundle) {
        if (bundle == null) {
            throw new IOException(ERROR_SERVICE_NOT_AVAILABLE);
        }
        String string = bundle.getString(EXTRA_REGISTRATION_ID);
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString(EXTRA_UNREGISTERED);
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if (CMD_RST.equals(string3)) {
            throw new IOException(ERROR_INSTANCE_ID_RESET);
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException(ERROR_SERVICE_NOT_AVAILABLE);
    }

    public static boolean isErrorMessageForRetryableError(String str) {
        return ERROR_SERVICE_NOT_AVAILABLE.equals(str) || ERROR_INTERNAL_SERVER_ERROR.equals(str) || ERROR_INTERNAL_SERVER_ERROR_ALT.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String lambda$extractResponseWhenComplete$0(MU mu) {
        Object obj;
        p30 p30Var = (p30) mu;
        synchronized (p30Var.a) {
            if (!p30Var.c) {
                throw new IllegalStateException("Task is not yet complete");
            }
            if (p30Var.d) {
                throw new CancellationException("Task is already canceled.");
            }
            if (IOException.class.isInstance(p30Var.f)) {
                throw ((Throwable) IOException.class.cast(p30Var.f));
            }
            Exception exc = p30Var.f;
            if (exc != null) {
                throw new ZO(exc);
            }
            obj = p30Var.e;
        }
        return handleResponse((Bundle) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00af A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setDefaultAttributesToBundle(String str, String str2, Bundle bundle) {
        HeartBeatInfo heartBeatInfo;
        HeartBeatInfo.HeartBeat heartBeatCode;
        bundle.putString(EXTRA_SCOPE, str2);
        bundle.putString(EXTRA_SENDER, str);
        bundle.putString(EXTRA_SUBTYPE, str);
        bundle.putString(PARAM_GMP_APP_ID, this.app.getOptions().getApplicationId());
        bundle.putString(PARAM_GMS_VER, Integer.toString(this.metadata.getGmsVersionCode()));
        bundle.putString(PARAM_OS_VER, Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString(PARAM_APP_VER_CODE, this.metadata.getAppVersionCode());
        bundle.putString(PARAM_APP_VER_NAME, this.metadata.getAppVersionName());
        bundle.putString(PARAM_FIREBASE_APP_NAME_HASH, getHashedFirebaseAppName());
        try {
            String token = ((InstallationTokenResult) DY.b(this.firebaseInstallations.getToken(false))).getToken();
            if (TextUtils.isEmpty(token)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString(PARAM_FIS_AUTH_TOKEN, token);
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString(PARAM_INSTANCE_ID, (String) DY.b(this.firebaseInstallations.getId()));
            bundle.putString(PARAM_CLIENT_VER, "fcm-24.1.0");
            heartBeatInfo = this.heartbeatInfo.get();
            UserAgentPublisher userAgentPublisher = this.userAgentPublisher.get();
            if (heartBeatInfo == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e2) {
            e = e2;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString(PARAM_INSTANCE_ID, (String) DY.b(this.firebaseInstallations.getId()));
            bundle.putString(PARAM_CLIENT_VER, "fcm-24.1.0");
            heartBeatInfo = this.heartbeatInfo.get();
            UserAgentPublisher userAgentPublisher2 = this.userAgentPublisher.get();
            if (heartBeatInfo == null) {
            }
        }
        bundle.putString(PARAM_INSTANCE_ID, (String) DY.b(this.firebaseInstallations.getId()));
        bundle.putString(PARAM_CLIENT_VER, "fcm-24.1.0");
        heartBeatInfo = this.heartbeatInfo.get();
        UserAgentPublisher userAgentPublisher22 = this.userAgentPublisher.get();
        if (heartBeatInfo == null || userAgentPublisher22 == null || (heartBeatCode = heartBeatInfo.getHeartBeatCode(FIREBASE_IID_HEARTBEAT_TAG)) == HeartBeatInfo.HeartBeat.NONE) {
            return;
        }
        bundle.putString(PARAM_HEARTBEAT_CODE, Integer.toString(heartBeatCode.getCode()));
        bundle.putString(PARAM_USER_AGENT, userAgentPublisher22.getUserAgent());
    }

    private MU startRpc(String str, String str2, Bundle bundle) {
        int i;
        try {
            setDefaultAttributesToBundle(str, str2, bundle);
            TO to = this.rpc;
            ExecutorC2239xi executorC2239xi = ExecutorC2239xi.k;
            C0998es c0998es = to.c;
            if (c0998es.a() >= 12000000) {
                n30 a = n30.a(to.b);
                synchronized (a) {
                    i = a.a;
                    a.a = i + 1;
                }
                return a.b(new l30(i, 1, bundle, 1)).d(executorC2239xi, C1097gL.r);
            }
            if (c0998es.b() != 0) {
                return to.a(bundle).e(executorC2239xi, new KX(to, bundle));
            }
            IOException iOException = new IOException("MISSING_INSTANCEID_SERVICE");
            p30 p30Var = new p30();
            p30Var.j(iOException);
            return p30Var;
        } catch (InterruptedException | ExecutionException e) {
            p30 p30Var2 = new p30();
            p30Var2.j(e);
            return p30Var2;
        }
    }

    public MU deleteToken() {
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_DELETE, "1");
        return extractResponseWhenComplete(startRpc(Metadata.getDefaultSenderId(this.app), SCOPE_ALL, bundle));
    }

    public MU getProxyNotificationData() {
        int i;
        TO to = this.rpc;
        if (to.c.a() < 241100000) {
            IOException iOException = new IOException(ERROR_SERVICE_NOT_AVAILABLE);
            p30 p30Var = new p30();
            p30Var.j(iOException);
            return p30Var;
        }
        n30 a = n30.a(to.b);
        Bundle bundle = Bundle.EMPTY;
        synchronized (a) {
            i = a.a;
            a.a = i + 1;
        }
        return a.b(new l30(i, 5, bundle, 1)).d(ExecutorC2239xi.k, C1623oL.t);
    }

    public MU getToken() {
        return extractResponseWhenComplete(startRpc(Metadata.getDefaultSenderId(this.app), SCOPE_ALL, new Bundle()));
    }

    public MU setRetainProxiedNotifications(boolean z) {
        int i;
        TO to = this.rpc;
        if (to.c.a() < 241100000) {
            IOException iOException = new IOException(ERROR_SERVICE_NOT_AVAILABLE);
            p30 p30Var = new p30();
            p30Var.j(iOException);
            return p30Var;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z);
        n30 a = n30.a(to.b);
        synchronized (a) {
            i = a.a;
            a.a = i + 1;
        }
        return a.b(new l30(i, 4, bundle, 0));
    }

    public MU subscribeToTopic(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_TOPIC, TOPIC_PREFIX + str2);
        return extractResponseWhenComplete(startRpc(str, TOPIC_PREFIX + str2, bundle));
    }

    public MU unsubscribeFromTopic(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_TOPIC, TOPIC_PREFIX + str2);
        bundle.putString(EXTRA_DELETE, "1");
        return extractResponseWhenComplete(startRpc(str, TOPIC_PREFIX + str2, bundle));
    }

    public GmsRpc(FirebaseApp firebaseApp, Metadata metadata, TO to, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this.app = firebaseApp;
        this.metadata = metadata;
        this.rpc = to;
        this.userAgentPublisher = provider;
        this.heartbeatInfo = provider2;
        this.firebaseInstallations = firebaseInstallationsApi;
    }
}
