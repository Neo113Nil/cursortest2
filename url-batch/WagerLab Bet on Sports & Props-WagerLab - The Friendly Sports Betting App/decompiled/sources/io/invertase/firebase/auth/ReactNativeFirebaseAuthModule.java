package io.invertase.firebase.auth;

import android.app.Activity;
import android.net.Uri;
import android.os.Parcel;
import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseException;
import com.google.firebase.FirebaseNetworkException;
import com.google.firebase.FirebaseTooManyRequestsException;
import com.google.firebase.auth.ActionCodeResult;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthMultiFactorException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.GithubAuthProvider;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.OAuthProvider;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.PhoneMultiFactorAssertion;
import com.google.firebase.auth.PhoneMultiFactorGenerator;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.SignInMethodQueryResult;
import com.google.firebase.auth.TotpMultiFactorAssertion;
import com.google.firebase.auth.TotpMultiFactorGenerator;
import com.google.firebase.auth.TotpSecret;
import com.google.firebase.auth.TwitterAuthProvider;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.auth.UserProfileChangeRequest;
import io.intercom.android.sdk.models.Participant;
import io.invertase.firebase.app.ReactNativeFirebaseAppModule;
import io.invertase.firebase.auth.ReactNativeFirebaseAuthModule;
import io.invertase.firebase.common.ReactNativeFirebaseEvent;
import io.invertase.firebase.common.ReactNativeFirebaseEventEmitter;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import io.invertase.firebase.common.SharedUtils;
import io.invertase.firebase.functions.UniversalFirebaseFunctionsModule;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* loaded from: classes8.dex */
class ReactNativeFirebaseAuthModule extends ReactNativeFirebaseModule {
    private static final String TAG = "Auth";
    private HashMap<String, AuthCredential> credentials;
    private final HashMap<String, MultiFactorResolver> mCachedResolvers;
    private PhoneAuthCredential mCredential;
    private PhoneAuthProvider.ForceResendingToken mForceResendingToken;
    private String mLastPhoneNumber;
    private final HashMap<String, MultiFactorSession> mMultiFactorSessions;
    private final HashMap<String, TotpSecret> mTotpSecrets;
    private String mVerificationId;
    public static final SimpleDateFormat ISO_8601_FORMATTER = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
    private static HashMap<String, FirebaseAuth.AuthStateListener> mAuthListeners = new HashMap<>();
    private static HashMap<String, FirebaseAuth.IdTokenListener> mIdTokenListeners = new HashMap<>();
    private static HashMap<String, String> emulatorConfigs = new HashMap<>();

    ReactNativeFirebaseAuthModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
        this.mCachedResolvers = new HashMap<>();
        this.mMultiFactorSessions = new HashMap<>();
        this.mTotpSecrets = new HashMap<>();
        this.credentials = new HashMap<>();
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        Log.d(TAG, "instance-initialized");
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        Log.d(TAG, "instance-destroyed");
        Iterator<Map.Entry<String, FirebaseAuth.AuthStateListener>> it = mAuthListeners.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, FirebaseAuth.AuthStateListener> next = it.next();
            FirebaseAuth.getInstance(FirebaseApp.getInstance(next.getKey())).removeAuthStateListener(next.getValue());
            it.remove();
        }
        Iterator<Map.Entry<String, FirebaseAuth.IdTokenListener>> it2 = mIdTokenListeners.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, FirebaseAuth.IdTokenListener> next2 = it2.next();
            FirebaseAuth.getInstance(FirebaseApp.getInstance(next2.getKey())).removeIdTokenListener(next2.getValue());
            it2.remove();
        }
        this.mCachedResolvers.clear();
        this.mMultiFactorSessions.clear();
        this.mTotpSecrets.clear();
    }

    @ReactMethod
    public void configureAuthDomain(String str) {
        Log.d(TAG, "configureAuthDomain");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        String str2 = ReactNativeFirebaseAppModule.authDomains.get(str);
        Log.d(TAG, "configureAuthDomain - app " + str + " domain? " + str2);
        if (str2 != null) {
            firebaseAuth.setCustomAuthDomain(str2);
        }
    }

    @ReactMethod
    public void getCustomAuthDomain(String str, Promise promise) {
        Log.d(TAG, "configureAuthDomain");
        promise.resolve(FirebaseAuth.getInstance(FirebaseApp.getInstance(str)).getCustomAuthDomain());
    }

    @ReactMethod
    public void addAuthStateListener(final String str) {
        Log.d(TAG, "addAuthStateListener");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        if (mAuthListeners.get(str) == null) {
            FirebaseAuth.AuthStateListener authStateListener = new FirebaseAuth.AuthStateListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda14
                @Override // com.google.firebase.auth.FirebaseAuth.AuthStateListener
                public final void onAuthStateChanged(FirebaseAuth firebaseAuth2) {
                    ReactNativeFirebaseAuthModule.this.lambda$addAuthStateListener$0(str, firebaseAuth2);
                }
            };
            firebaseAuth.addAuthStateListener(authStateListener);
            mAuthListeners.put(str, authStateListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addAuthStateListener$0(String str, FirebaseAuth firebaseAuth) {
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        WritableMap createMap = Arguments.createMap();
        ReactNativeFirebaseEventEmitter sharedInstance = ReactNativeFirebaseEventEmitter.getSharedInstance();
        if (currentUser != null) {
            createMap.putString("appName", str);
            createMap.putMap(Participant.USER_TYPE, firebaseUserToMap(currentUser));
        } else {
            createMap.putString("appName", str);
        }
        Log.d(TAG, "addAuthStateListener:eventBody " + createMap.toString());
        sharedInstance.sendEvent(new ReactNativeFirebaseEvent("auth_state_changed", createMap, str));
    }

    @ReactMethod
    public void removeAuthStateListener(String str) {
        Log.d(TAG, "removeAuthStateListener");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        FirebaseAuth.AuthStateListener authStateListener = mAuthListeners.get(str);
        if (authStateListener != null) {
            firebaseAuth.removeAuthStateListener(authStateListener);
            mAuthListeners.remove(str);
        }
    }

    @ReactMethod
    public void addIdTokenListener(final String str) {
        Log.d(TAG, "addIdTokenListener");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        if (mIdTokenListeners.containsKey(str)) {
            return;
        }
        FirebaseAuth.IdTokenListener idTokenListener = new FirebaseAuth.IdTokenListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda52
            @Override // com.google.firebase.auth.FirebaseAuth.IdTokenListener
            public final void onIdTokenChanged(FirebaseAuth firebaseAuth2) {
                ReactNativeFirebaseAuthModule.this.lambda$addIdTokenListener$1(str, firebaseAuth2);
            }
        };
        firebaseAuth.addIdTokenListener(idTokenListener);
        mIdTokenListeners.put(str, idTokenListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addIdTokenListener$1(String str, FirebaseAuth firebaseAuth) {
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        ReactNativeFirebaseEventEmitter sharedInstance = ReactNativeFirebaseEventEmitter.getSharedInstance();
        WritableMap createMap = Arguments.createMap();
        if (currentUser != null) {
            createMap.putBoolean("authenticated", true);
            createMap.putString("appName", str);
            createMap.putMap(Participant.USER_TYPE, firebaseUserToMap(currentUser));
        } else {
            createMap.putString("appName", str);
            createMap.putBoolean("authenticated", false);
        }
        sharedInstance.sendEvent(new ReactNativeFirebaseEvent("auth_id_token_changed", createMap, str));
    }

    @ReactMethod
    public void removeIdTokenListener(String str) {
        Log.d(TAG, "removeIdTokenListener");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        FirebaseAuth.IdTokenListener idTokenListener = mIdTokenListeners.get(str);
        if (idTokenListener != null) {
            firebaseAuth.removeIdTokenListener(idTokenListener);
            mIdTokenListeners.remove(str);
        }
    }

    @ReactMethod
    public void forceRecaptchaFlowForTesting(String str, boolean z, Promise promise) {
        Log.d(TAG, "forceRecaptchaFlowForTesting");
        FirebaseAuth.getInstance(FirebaseApp.getInstance(str)).getFirebaseAuthSettings().forceRecaptchaFlowForTesting(z);
        promise.resolve(null);
    }

    @ReactMethod
    public void setAutoRetrievedSmsCodeForPhoneNumber(String str, String str2, String str3, Promise promise) {
        Log.d(TAG, "setAutoRetrievedSmsCodeForPhoneNumber");
        FirebaseAuth.getInstance(FirebaseApp.getInstance(str)).getFirebaseAuthSettings().setAutoRetrievedSmsCodeForPhoneNumber(str2, str3);
        promise.resolve(null);
    }

    @ReactMethod
    public void setAppVerificationDisabledForTesting(String str, boolean z, Promise promise) {
        Log.d(TAG, "setAppVerificationDisabledForTesting");
        FirebaseAuth.getInstance(FirebaseApp.getInstance(str)).getFirebaseAuthSettings().setAppVerificationDisabledForTesting(z);
        promise.resolve(null);
    }

    @ReactMethod
    public void signOut(String str, Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        Log.d(TAG, "signOut");
        if (firebaseAuth == null || firebaseAuth.getCurrentUser() == null) {
            promiseNoUser(promise, true);
        } else {
            firebaseAuth.signOut();
            promiseNoUser(promise, false);
        }
    }

    @ReactMethod
    private void signInAnonymously(String str, final Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        Log.d(TAG, "signInAnonymously");
        firebaseAuth.signInAnonymously().addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda45
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                ReactNativeFirebaseAuthModule.this.lambda$signInAnonymously$2(promise, (AuthResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda46
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                ReactNativeFirebaseAuthModule.this.lambda$signInAnonymously$3(promise, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInAnonymously$2(Promise promise, AuthResult authResult) {
        Log.d(TAG, "signInAnonymously:onComplete:success");
        promiseWithAuthResult(authResult, promise);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInAnonymously$3(Promise promise, Exception exc) {
        Log.e(TAG, "signInAnonymously:onComplete:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    @ReactMethod
    private void createUserWithEmailAndPassword(String str, String str2, String str3, final Promise promise) {
        Log.d(TAG, "createUserWithEmailAndPassword");
        FirebaseAuth.getInstance(FirebaseApp.getInstance(str)).createUserWithEmailAndPassword(str2, str3).addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda28
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                ReactNativeFirebaseAuthModule.this.lambda$createUserWithEmailAndPassword$4(promise, (AuthResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda29
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                ReactNativeFirebaseAuthModule.this.lambda$createUserWithEmailAndPassword$5(promise, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createUserWithEmailAndPassword$4(Promise promise, AuthResult authResult) {
        Log.d(TAG, "createUserWithEmailAndPassword:onComplete:success");
        promiseWithAuthResult(authResult, promise);
        Log.d(TAG, "createUserWithEmailAndPassword:onComplete:promiseResolved");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createUserWithEmailAndPassword$5(Promise promise, Exception exc) {
        Log.e(TAG, "createUserWithEmailAndPassword:onComplete:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    @ReactMethod
    public void isSignInWithEmailLink(String str, String str2, Promise promise) {
        Log.d(TAG, "isSignInWithEmailLink");
        promise.resolve(Boolean.valueOf(FirebaseAuth.getInstance(FirebaseApp.getInstance(str)).isSignInWithEmailLink(str2)));
    }

    @ReactMethod
    private void signInWithEmailAndPassword(String str, String str2, String str3, final Promise promise) {
        Log.d(TAG, "signInWithEmailAndPassword");
        FirebaseAuth.getInstance(FirebaseApp.getInstance(str)).signInWithEmailAndPassword(str2, str3).addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda39
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                ReactNativeFirebaseAuthModule.this.lambda$signInWithEmailAndPassword$6(promise, (AuthResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda40
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                ReactNativeFirebaseAuthModule.this.lambda$signInWithEmailAndPassword$7(promise, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithEmailAndPassword$6(Promise promise, AuthResult authResult) {
        Log.d(TAG, "signInWithEmailAndPassword:onComplete:success");
        promiseWithAuthResult(authResult, promise);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithEmailAndPassword$7(Promise promise, Exception exc) {
        Log.e(TAG, "signInWithEmailAndPassword:onComplete:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    @ReactMethod
    private void signInWithEmailLink(String str, String str2, String str3, final Promise promise) {
        Log.d(TAG, "signInWithEmailLink");
        try {
            FirebaseAuth.getInstance(FirebaseApp.getInstance(str)).signInWithEmailLink(str2, str3).addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    ReactNativeFirebaseAuthModule.this.lambda$signInWithEmailLink$8(promise, (AuthResult) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda2
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    ReactNativeFirebaseAuthModule.this.lambda$signInWithEmailLink$9(promise, exc);
                }
            });
        } catch (Exception e) {
            Log.e(TAG, "signInWithEmailLink:onComplete:totalfailure", e);
            promiseRejectAuthException(promise, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithEmailLink$8(Promise promise, AuthResult authResult) {
        Log.d(TAG, "signInWithEmailLink:onComplete:success");
        promiseWithAuthResult(authResult, promise);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithEmailLink$9(Promise promise, Exception exc) {
        Log.e(TAG, "signInWithEmailLink:onComplete:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    @ReactMethod
    private void signInWithCustomToken(String str, String str2, final Promise promise) {
        Log.d(TAG, "signInWithCustomToken");
        FirebaseAuth.getInstance(FirebaseApp.getInstance(str)).signInWithCustomToken(str2).addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda42
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                ReactNativeFirebaseAuthModule.this.lambda$signInWithCustomToken$10(promise, (AuthResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda43
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                ReactNativeFirebaseAuthModule.this.lambda$signInWithCustomToken$11(promise, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithCustomToken$10(Promise promise, AuthResult authResult) {
        Log.d(TAG, "signInWithCustomToken:onComplete:success");
        promiseWithAuthResult(authResult, promise);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithCustomToken$11(Promise promise, Exception exc) {
        Log.e(TAG, "signInWithCustomToken:onComplete:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    @ReactMethod
    public void revokeToken(String str, String str2, Promise promise) {
        Log.d(TAG, "revokeToken");
        Log.e(TAG, "revokeToken:failure:noCurrentUser");
        promiseNoUser(promise, false);
    }

    @ReactMethod
    public void sendPasswordResetEmail(String str, String str2, ReadableMap readableMap, final Promise promise) {
        Log.d(TAG, "sendPasswordResetEmail");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        OnCompleteListener<Void> onCompleteListener = new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda36
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$sendPasswordResetEmail$12(promise, task);
            }
        };
        if (readableMap == null) {
            firebaseAuth.sendPasswordResetEmail(str2).addOnCompleteListener(getExecutor(), onCompleteListener);
        } else {
            firebaseAuth.sendPasswordResetEmail(str2, buildActionCodeSettings(readableMap)).addOnCompleteListener(getExecutor(), onCompleteListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendPasswordResetEmail$12(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "sendPasswordResetEmail:onComplete:success");
            promiseNoUser(promise, false);
        } else {
            Exception exception = task.getException();
            Log.e(TAG, "sendPasswordResetEmail:onComplete:failure", exception);
            promiseRejectAuthException(promise, exception);
        }
    }

    @ReactMethod
    public void sendSignInLinkToEmail(String str, String str2, ReadableMap readableMap, final Promise promise) {
        Log.d(TAG, "sendSignInLinkToEmail");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        firebaseAuth.sendSignInLinkToEmail(str2, buildActionCodeSettings(readableMap)).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda27
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$sendSignInLinkToEmail$13(promise, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendSignInLinkToEmail$13(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "sendSignInLinkToEmail:onComplete:success");
            promiseNoUser(promise, false);
        } else {
            Exception exception = task.getException();
            Log.e(TAG, "sendSignInLinkToEmail:onComplete:failure", exception);
            promiseRejectAuthException(promise, exception);
        }
    }

    @ReactMethod
    public void delete(String str, final Promise promise) {
        FirebaseUser currentUser = FirebaseAuth.getInstance(FirebaseApp.getInstance(str)).getCurrentUser();
        Log.d(TAG, "delete");
        if (currentUser != null) {
            currentUser.delete().addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda16
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$delete$14(promise, task);
                }
            });
        } else {
            Log.e(TAG, "delete:failure:noCurrentUser");
            promiseNoUser(promise, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$delete$14(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "delete:onComplete:success");
            promiseNoUser(promise, false);
        } else {
            Exception exception = task.getException();
            Log.e(TAG, "delete:onComplete:failure", exception);
            promiseRejectAuthException(promise, exception);
        }
    }

    @ReactMethod
    public void reload(String str, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        Log.d(TAG, "reload");
        if (currentUser == null) {
            promiseNoUser(promise, false);
            Log.e(TAG, "reload:failure:noCurrentUser");
        } else {
            currentUser.reload().addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda25
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$reload$15(firebaseAuth, promise, task);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reload$15(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "reload:onComplete:success");
            promiseWithUser(firebaseAuth.getCurrentUser(), promise);
        } else {
            Exception exception = task.getException();
            Log.e(TAG, "reload:onComplete:failure", exception);
            promiseRejectAuthException(promise, exception);
        }
    }

    @ReactMethod
    public void sendEmailVerification(String str, ReadableMap readableMap, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        Log.d(TAG, "sendEmailVerification");
        if (currentUser == null) {
            promiseNoUser(promise, false);
            Log.e(TAG, "sendEmailVerification:failure:noCurrentUser");
            return;
        }
        OnCompleteListener<Void> onCompleteListener = new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda31
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$sendEmailVerification$16(firebaseAuth, promise, task);
            }
        };
        if (readableMap == null) {
            currentUser.sendEmailVerification().addOnCompleteListener(getExecutor(), onCompleteListener);
        } else {
            currentUser.sendEmailVerification(buildActionCodeSettings(readableMap)).addOnCompleteListener(getExecutor(), onCompleteListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendEmailVerification$16(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "sendEmailVerification:onComplete:success");
            promiseWithUser(firebaseAuth.getCurrentUser(), promise);
        } else {
            Exception exception = task.getException();
            Log.e(TAG, "sendEmailVerification:onComplete:failure", exception);
            promiseRejectAuthException(promise, exception);
        }
    }

    @ReactMethod
    public void verifyBeforeUpdateEmail(String str, String str2, ReadableMap readableMap, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        Log.d(TAG, "verifyBeforeUpdateEmail");
        if (currentUser == null) {
            promiseNoUser(promise, false);
            Log.e(TAG, "verifyBeforeUpdateEmail:failure:noCurrentUser");
            return;
        }
        OnCompleteListener<Void> onCompleteListener = new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda37
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$verifyBeforeUpdateEmail$17(firebaseAuth, promise, task);
            }
        };
        if (readableMap == null) {
            currentUser.verifyBeforeUpdateEmail(str2).addOnCompleteListener(getExecutor(), onCompleteListener);
        } else {
            currentUser.verifyBeforeUpdateEmail(str2, buildActionCodeSettings(readableMap)).addOnCompleteListener(getExecutor(), onCompleteListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$verifyBeforeUpdateEmail$17(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "verifyBeforeUpdateEmail:onComplete:success");
            promiseWithUser(firebaseAuth.getCurrentUser(), promise);
        } else {
            Exception exception = task.getException();
            Log.e(TAG, "verifyBeforeUpdateEmail:onComplete:failure", exception);
            promiseRejectAuthException(promise, exception);
        }
    }

    @ReactMethod
    public void updateEmail(String str, String str2, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        Log.d(TAG, "updateEmail");
        if (currentUser == null) {
            promiseNoUser(promise, false);
            Log.e(TAG, "updateEmail:failure:noCurrentUser");
        } else {
            currentUser.updateEmail(str2).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda32
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$updateEmail$18(firebaseAuth, promise, task);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateEmail$18(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "updateEmail:onComplete:success");
            promiseWithUser(firebaseAuth.getCurrentUser(), promise);
        } else {
            Exception exception = task.getException();
            Log.e(TAG, "updateEmail:onComplete:failure", exception);
            promiseRejectAuthException(promise, exception);
        }
    }

    @ReactMethod
    public void updatePassword(String str, String str2, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        Log.d(TAG, "updatePassword");
        if (currentUser == null) {
            promiseNoUser(promise, false);
            Log.e(TAG, "updatePassword:failure:noCurrentUser");
        } else {
            currentUser.updatePassword(str2).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda15
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$updatePassword$19(firebaseAuth, promise, task);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updatePassword$19(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "updatePassword:onComplete:success");
            promiseWithUser(firebaseAuth.getCurrentUser(), promise);
        } else {
            Exception exception = task.getException();
            Log.e(TAG, "updatePassword:onComplete:failure", exception);
            promiseRejectAuthException(promise, exception);
        }
    }

    @ReactMethod
    private void updatePhoneNumber(String str, String str2, String str3, String str4, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        if (!str2.equals("phone")) {
            rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential does not have a phone provider.");
        }
        PhoneAuthCredential phoneAuthCredential = getPhoneAuthCredential(str3, str4);
        if (phoneAuthCredential == null) {
            rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
        } else if (currentUser != null) {
            Log.d(TAG, "updatePhoneNumber");
            currentUser.updatePhoneNumber(phoneAuthCredential).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda6
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$updatePhoneNumber$20(firebaseAuth, promise, task);
                }
            });
        } else {
            promiseNoUser(promise, false);
            Log.e(TAG, "updatePhoneNumber:failure:noCurrentUser");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updatePhoneNumber$20(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "updatePhoneNumber:onComplete:success");
            promiseWithUser(firebaseAuth.getCurrentUser(), promise);
        } else {
            Exception exception = task.getException();
            Log.e(TAG, "updatePhoneNumber:onComplete:failure", exception);
            promiseRejectAuthException(promise, exception);
        }
    }

    @ReactMethod
    public void updateProfile(String str, ReadableMap readableMap, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        Log.d(TAG, "updateProfile");
        if (currentUser == null) {
            promiseNoUser(promise, false);
            Log.e(TAG, "updateProfile:failure:noCurrentUser");
            return;
        }
        UserProfileChangeRequest.Builder builder = new UserProfileChangeRequest.Builder();
        if (readableMap.hasKey("displayName")) {
            builder.setDisplayName(readableMap.getString("displayName"));
        }
        if (readableMap.hasKey("photoURL")) {
            String string = readableMap.getString("photoURL");
            builder.setPhotoUri(string == null ? null : Uri.parse(string));
        }
        currentUser.updateProfile(builder.build()).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda41
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$updateProfile$21(firebaseAuth, promise, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateProfile$21(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "updateProfile:onComplete:success");
            promiseWithUser(firebaseAuth.getCurrentUser(), promise);
        } else {
            Exception exception = task.getException();
            Log.e(TAG, "updateProfile:onComplete:failure", exception);
            promiseRejectAuthException(promise, exception);
        }
    }

    @ReactMethod
    private void signInWithCredential(String str, String str2, String str3, String str4, final Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        AuthCredential credentialForProvider = getCredentialForProvider(str2, str3, str4);
        if (credentialForProvider == null) {
            rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
        } else {
            Log.d(TAG, "signInWithCredential");
            firebaseAuth.signInWithCredential(credentialForProvider).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda51
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$signInWithCredential$22(promise, task);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithCredential$22(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "signInWithCredential:onComplete:success");
            promiseWithAuthResult((AuthResult) task.getResult(), promise);
        } else {
            Exception exception = task.getException();
            Log.e(TAG, "signInWithCredential:onComplete:failure", exception);
            promiseRejectAuthException(promise, exception);
        }
    }

    @ReactMethod
    private void signInWithProvider(String str, ReadableMap readableMap, final Promise promise) {
        ReadableMap map;
        ReadableArray array;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        if (readableMap.getString("providerId") == null) {
            rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
            return;
        }
        OAuthProvider.Builder newBuilder = OAuthProvider.newBuilder(readableMap.getString("providerId"), firebaseAuth);
        if (readableMap.hasKey("scopes") && (array = readableMap.getArray("scopes")) != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < array.size(); i++) {
                arrayList.add(array.getString(i));
            }
            newBuilder.setScopes(arrayList);
        }
        if (readableMap.hasKey("customParameters") && (map = readableMap.getMap("customParameters")) != null) {
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                newBuilder.addCustomParameter(nextKey, map.getString(nextKey));
            }
        }
        Task<AuthResult> pendingAuthResult = firebaseAuth.getPendingAuthResult();
        if (pendingAuthResult != null) {
            pendingAuthResult.addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda9
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    ReactNativeFirebaseAuthModule.this.lambda$signInWithProvider$23(promise, (AuthResult) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda10
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    ReactNativeFirebaseAuthModule.this.lambda$signInWithProvider$24(promise, exc);
                }
            });
        } else {
            firebaseAuth.startActivityForSignInWithProvider(getCurrentActivity(), newBuilder.build()).addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda12
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    ReactNativeFirebaseAuthModule.this.lambda$signInWithProvider$25(promise, (AuthResult) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda13
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    ReactNativeFirebaseAuthModule.this.lambda$signInWithProvider$26(promise, exc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithProvider$23(Promise promise, AuthResult authResult) {
        Log.d(TAG, "signInWithProvider:success");
        promiseWithAuthResult(authResult, promise);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithProvider$24(Promise promise, Exception exc) {
        Log.d(TAG, "signInWithProvider:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithProvider$25(Promise promise, AuthResult authResult) {
        Log.d(TAG, "signInWithProvider:success");
        promiseWithAuthResult(authResult, promise);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithProvider$26(Promise promise, Exception exc) {
        Log.d(TAG, "signInWithProvider:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    @ReactMethod
    public void signInWithPhoneNumber(String str, String str2, boolean z, Promise promise) {
        Log.d(TAG, "signInWithPhoneNumber");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        Activity currentActivity = getCurrentActivity();
        if (!str2.equals(this.mLastPhoneNumber)) {
            this.mForceResendingToken = null;
            this.mLastPhoneNumber = str2;
        }
        this.mVerificationId = null;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(firebaseAuth, promise);
        if (currentActivity != null) {
            if (z && this.mForceResendingToken != null) {
                PhoneAuthProvider.getInstance(firebaseAuth).verifyPhoneNumber(str2, 60L, TimeUnit.SECONDS, currentActivity, anonymousClass1, this.mForceResendingToken);
            } else {
                PhoneAuthProvider.getInstance(firebaseAuth).verifyPhoneNumber(str2, 60L, TimeUnit.SECONDS, currentActivity, anonymousClass1);
            }
        }
    }

    /* renamed from: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$1, reason: invalid class name */
    class AnonymousClass1 extends PhoneAuthProvider.OnVerificationStateChangedCallbacks {
        private boolean promiseResolved = false;
        final /* synthetic */ FirebaseAuth val$firebaseAuth;
        final /* synthetic */ Promise val$promise;

        AnonymousClass1(FirebaseAuth firebaseAuth, Promise promise) {
            this.val$firebaseAuth = firebaseAuth;
            this.val$promise = promise;
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
        public void onVerificationCompleted(final PhoneAuthCredential phoneAuthCredential) {
            Task<AuthResult> signInWithCredential = this.val$firebaseAuth.signInWithCredential(phoneAuthCredential);
            ExecutorService executor = ReactNativeFirebaseAuthModule.this.getExecutor();
            final Promise promise = this.val$promise;
            signInWithCredential.addOnCompleteListener(executor, new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$1$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.AnonymousClass1.this.lambda$onVerificationCompleted$0(phoneAuthCredential, promise, task);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVerificationCompleted$0(PhoneAuthCredential phoneAuthCredential, Promise promise, Task task) {
            if (task.isSuccessful()) {
                Log.d(ReactNativeFirebaseAuthModule.TAG, "signInWithPhoneNumber:autoVerified:signInWithCredential:onComplete:success");
                if (this.promiseResolved) {
                    return;
                }
                WritableMap createMap = Arguments.createMap();
                Parcel obtain = Parcel.obtain();
                phoneAuthCredential.writeToParcel(obtain, 0);
                obtain.setDataPosition(16);
                String readString = obtain.readString();
                ReactNativeFirebaseAuthModule.this.mVerificationId = readString;
                obtain.recycle();
                createMap.putString("verificationId", readString);
                promise.resolve(createMap);
                return;
            }
            Exception exception = task.getException();
            Log.e(ReactNativeFirebaseAuthModule.TAG, "signInWithPhoneNumber:autoVerified:signInWithCredential:onComplete:failure", exception);
            if (this.promiseResolved) {
                return;
            }
            ReactNativeFirebaseAuthModule.this.promiseRejectAuthException(promise, exception);
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
        public void onVerificationFailed(FirebaseException firebaseException) {
            Log.d(ReactNativeFirebaseAuthModule.TAG, "signInWithPhoneNumber:verification:failed");
            ReactNativeFirebaseAuthModule.this.promiseRejectAuthException(this.val$promise, firebaseException);
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
        public void onCodeSent(String str, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            ReactNativeFirebaseAuthModule.this.mVerificationId = str;
            ReactNativeFirebaseAuthModule.this.mForceResendingToken = forceResendingToken;
            WritableMap createMap = Arguments.createMap();
            createMap.putString("verificationId", str);
            this.val$promise.resolve(createMap);
            this.promiseResolved = true;
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
        public void onCodeAutoRetrievalTimeOut(String str) {
            super.onCodeAutoRetrievalTimeOut(str);
        }
    }

    @ReactMethod
    public void getSession(String str, final Promise promise) {
        FirebaseAuth.getInstance(FirebaseApp.getInstance(str)).getCurrentUser().getMultiFactor().getSession().addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda30
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$getSession$27(promise, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getSession$27(Promise promise, Task task) {
        if (!task.isSuccessful()) {
            rejectPromiseWithExceptionMap(promise, task.getException());
            return;
        }
        MultiFactorSession multiFactorSession = (MultiFactorSession) task.getResult();
        String num = Integer.toString(multiFactorSession.hashCode());
        this.mMultiFactorSessions.put(num, multiFactorSession);
        promise.resolve(num);
    }

    @ReactMethod
    public void unenrollMultiFactor(String str, String str2, final Promise promise) {
        FirebaseAuth.getInstance(FirebaseApp.getInstance(str)).getCurrentUser().getMultiFactor().unenroll(str2).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda7
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.lambda$unenrollMultiFactor$28(Promise.this, task);
            }
        });
    }

    static /* synthetic */ void lambda$unenrollMultiFactor$28(Promise promise, Task task) {
        if (!task.isSuccessful()) {
            rejectPromiseWithExceptionMap(promise, task.getException());
        } else {
            promise.resolve(null);
        }
    }

    @ReactMethod
    public void verifyPhoneNumberWithMultiFactorInfo(String str, String str2, final String str3, final Promise promise) {
        MultiFactorInfo multiFactorInfo;
        MultiFactorResolver multiFactorResolver = this.mCachedResolvers.get(str3);
        if (multiFactorResolver == null) {
            rejectPromiseWithCodeAndMessage(promise, "invalid-multi-factor-session", "No resolver for session found. Is the session id correct?");
            return;
        }
        Iterator<MultiFactorInfo> it = multiFactorResolver.getHints().iterator();
        while (true) {
            if (!it.hasNext()) {
                multiFactorInfo = null;
                break;
            } else {
                multiFactorInfo = it.next();
                if (str2.equals(multiFactorInfo.getUid())) {
                    break;
                }
            }
        }
        if (multiFactorInfo == null) {
            rejectPromiseWithCodeAndMessage(promise, "multi-factor-info-not-found", "The user does not have a second factor matching the identifier provided.");
        } else {
            if (!"phone".equals(multiFactorInfo.getFactorId())) {
                rejectPromiseWithCodeAndMessage(promise, "unknown", "Unsupported second factor. Only phone factors are supported.");
                return;
            }
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
            PhoneAuthProvider.verifyPhoneNumber(PhoneAuthOptions.newBuilder(firebaseAuth).setActivity(getCurrentActivity()).setMultiFactorHint((PhoneMultiFactorInfo) multiFactorInfo).setTimeout(30L, TimeUnit.SECONDS).setMultiFactorSession(multiFactorResolver.getSession()).setCallbacks(new PhoneAuthProvider.OnVerificationStateChangedCallbacks() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule.2
                @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
                public void onCodeSent(String str4, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                    promise.resolve(str4);
                }

                @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
                public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
                    ReactNativeFirebaseAuthModule.this.resolveMultiFactorCredential(phoneAuthCredential, str3, promise);
                }

                @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
                public void onVerificationFailed(FirebaseException firebaseException) {
                    ReactNativeFirebaseAuthModule.this.promiseRejectAuthException(promise, firebaseException);
                }
            }).build());
        }
    }

    @ReactMethod
    public void verifyPhoneNumberForMultiFactor(String str, String str2, String str3, final Promise promise) {
        MultiFactorSession multiFactorSession = this.mMultiFactorSessions.get(str3);
        if (multiFactorSession == null) {
            rejectPromiseWithCodeAndMessage(promise, "invalid-multi-factor-session", "can't find session for provided key");
        } else {
            PhoneAuthProvider.verifyPhoneNumber(PhoneAuthOptions.newBuilder(FirebaseAuth.getInstance(FirebaseApp.getInstance(str))).setPhoneNumber(str2).setActivity(getCurrentActivity()).setTimeout(30L, TimeUnit.SECONDS).setMultiFactorSession(multiFactorSession).requireSmsValidation(true).setCallbacks(new PhoneAuthProvider.OnVerificationStateChangedCallbacks() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule.3
                @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
                public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
                    ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "not-implemented", "This is currently not supported.");
                }

                @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
                public void onVerificationFailed(FirebaseException firebaseException) {
                    ReactNativeFirebaseAuthModule.this.promiseRejectAuthException(promise, firebaseException);
                }

                @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
                public void onCodeSent(String str4, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                    promise.resolve(str4);
                }
            }).build());
        }
    }

    @ReactMethod
    public void finalizeMultiFactorEnrollment(String str, String str2, String str3, @Nullable String str4, final Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        firebaseAuth.getCurrentUser().getMultiFactor().enroll(PhoneMultiFactorGenerator.getAssertion(PhoneAuthProvider.getCredential(str2, str3)), str4).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda24
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$finalizeMultiFactorEnrollment$29(promise, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$finalizeMultiFactorEnrollment$29(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "finalizeMultiFactorEnrollment:onComplete:success");
            promise.resolve(null);
        } else {
            Exception exception = task.getException();
            Log.e(TAG, "finalizeMultiFactorEnrollment:onComplete:failure", exception);
            promiseRejectAuthException(promise, exception);
        }
    }

    @ReactMethod
    public void generateQrCodeUrl(String str, String str2, String str3, String str4, Promise promise) {
        TotpSecret totpSecret = this.mTotpSecrets.get(str2);
        if (totpSecret == null) {
            rejectPromiseWithCodeAndMessage(promise, "invalid-multi-factor-secret", "can't find secret for provided key");
        } else {
            promise.resolve(totpSecret.generateQrCodeUrl(str3, str4));
        }
    }

    @ReactMethod
    public void openInOtpApp(String str, String str2, String str3) {
        TotpSecret totpSecret = this.mTotpSecrets.get(str2);
        if (totpSecret != null) {
            totpSecret.openInOtpApp(str3);
        }
    }

    @ReactMethod
    public void finalizeTotpEnrollment(String str, String str2, String str3, @Nullable String str4, final Promise promise) {
        TotpSecret totpSecret = this.mTotpSecrets.get(str2);
        if (totpSecret == null) {
            rejectPromiseWithCodeAndMessage(promise, "invalid-multi-factor-secret", "can't find secret for provided key");
        } else {
            FirebaseAuth.getInstance(FirebaseApp.getInstance(str)).getCurrentUser().getMultiFactor().enroll(TotpMultiFactorGenerator.getAssertionForEnrollment(totpSecret, str3), str4).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda22
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.lambda$finalizeTotpEnrollment$30(Promise.this, task);
                }
            });
        }
    }

    static /* synthetic */ void lambda$finalizeTotpEnrollment$30(Promise promise, Task task) {
        if (!task.isSuccessful()) {
            rejectPromiseWithExceptionMap(promise, task.getException());
        } else {
            promise.resolve(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resolveMultiFactorCredential(PhoneAuthCredential phoneAuthCredential, String str, final Promise promise) {
        PhoneMultiFactorAssertion assertion = PhoneMultiFactorGenerator.getAssertion(phoneAuthCredential);
        MultiFactorResolver multiFactorResolver = this.mCachedResolvers.get(str);
        if (multiFactorResolver == null) {
            rejectPromiseWithCodeAndMessage(promise, "invalid-multi-factor-session", "No resolver for session found. Is the session id correct?");
        } else {
            multiFactorResolver.resolveSignIn(assertion).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda47
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$resolveMultiFactorCredential$31(promise, task);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resolveMultiFactorCredential$31(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promiseWithAuthResult((AuthResult) task.getResult(), promise);
        } else {
            promiseRejectAuthException(promise, task.getException());
        }
    }

    @ReactMethod
    public void resolveMultiFactorSignIn(String str, String str2, String str3, String str4, Promise promise) {
        resolveMultiFactorCredential(PhoneAuthProvider.getCredential(str3, str4), str2, promise);
    }

    @ReactMethod
    public void resolveTotpSignIn(String str, String str2, String str3, String str4, final Promise promise) {
        TotpMultiFactorAssertion assertionForSignIn = TotpMultiFactorGenerator.getAssertionForSignIn(str3, str4);
        MultiFactorResolver multiFactorResolver = this.mCachedResolvers.get(str2);
        if (multiFactorResolver == null) {
            rejectPromiseWithCodeAndMessage(promise, "invalid-multi-factor-session", "No resolver for session found. Is the session id correct?");
        } else {
            multiFactorResolver.resolveSignIn(assertionForSignIn).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda35
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$resolveTotpSignIn$32(promise, task);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resolveTotpSignIn$32(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promiseWithAuthResult((AuthResult) task.getResult(), promise);
        } else {
            promiseRejectAuthException(promise, task.getException());
        }
    }

    @ReactMethod
    public void generateTotpSecret(String str, String str2, final Promise promise) {
        MultiFactorSession multiFactorSession = this.mMultiFactorSessions.get(str2);
        if (multiFactorSession == null) {
            rejectPromiseWithCodeAndMessage(promise, "invalid-multi-factor-session", "No resolver for session found. Is the session id correct?");
        } else {
            TotpMultiFactorGenerator.generateSecret(multiFactorSession).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda5
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$generateTotpSecret$33(promise, task);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$generateTotpSecret$33(Promise promise, Task task) {
        if (task.isSuccessful()) {
            TotpSecret totpSecret = (TotpSecret) task.getResult();
            String sharedSecretKey = totpSecret.getSharedSecretKey();
            this.mTotpSecrets.put(sharedSecretKey, totpSecret);
            WritableMap createMap = Arguments.createMap();
            createMap.putString("secretKey", sharedSecretKey);
            promise.resolve(createMap);
            return;
        }
        promiseRejectAuthException(promise, task.getException());
    }

    @ReactMethod
    public void confirmationResultConfirm(String str, String str2, final Promise promise) {
        try {
            FirebaseAuth.getInstance(FirebaseApp.getInstance(str)).signInWithCredential(PhoneAuthProvider.getCredential(this.mVerificationId, str2)).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda3
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$confirmationResultConfirm$34(promise, task);
                }
            });
        } catch (Exception e) {
            Log.d(TAG, "confirmationResultConfirm::getCredential::failure", e);
            promiseRejectAuthException(promise, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$confirmationResultConfirm$34(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "confirmationResultConfirm:signInWithCredential:onComplete:success");
            promiseWithAuthResult((AuthResult) Objects.requireNonNull((AuthResult) task.getResult()), promise);
        } else {
            Exception exception = task.getException();
            Log.e(TAG, "confirmationResultConfirm:signInWithCredential:onComplete:failure", exception);
            promiseRejectAuthException(promise, exception);
        }
    }

    @ReactMethod
    public void verifyPhoneNumber(final String str, String str2, final String str3, int i, boolean z) {
        Log.d(TAG, "verifyPhoneNumber:" + str2);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        Activity currentActivity = getCurrentActivity();
        if (!str2.equals(this.mLastPhoneNumber)) {
            this.mForceResendingToken = null;
            this.mLastPhoneNumber = str2;
        }
        this.mCredential = null;
        PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule.4
            @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
            public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
                ReactNativeFirebaseAuthModule.this.mCredential = phoneAuthCredential;
                Log.d(ReactNativeFirebaseAuthModule.TAG, "verifyPhoneNumber:verification:onVerificationCompleted");
                WritableMap createMap = Arguments.createMap();
                Parcel obtain = Parcel.obtain();
                phoneAuthCredential.writeToParcel(obtain, 0);
                obtain.setDataPosition(16);
                String readString = obtain.readString();
                obtain.setDataPosition(obtain.dataPosition() + 8);
                createMap.putString(UniversalFirebaseFunctionsModule.CODE_KEY, obtain.readString());
                createMap.putString("verificationId", readString);
                obtain.recycle();
                ReactNativeFirebaseAuthModule.this.sendPhoneStateEvent(str, str3, "onVerificationComplete", createMap);
            }

            @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
            public void onVerificationFailed(FirebaseException firebaseException) {
                Log.d(ReactNativeFirebaseAuthModule.TAG, "verifyPhoneNumber:verification:onVerificationFailed");
                WritableMap createMap = Arguments.createMap();
                createMap.putMap("error", ReactNativeFirebaseAuthModule.this.getJSError(firebaseException));
                ReactNativeFirebaseAuthModule.this.sendPhoneStateEvent(str, str3, "onVerificationFailed", createMap);
            }

            @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
            public void onCodeSent(String str4, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                Log.d(ReactNativeFirebaseAuthModule.TAG, "verifyPhoneNumber:verification:onCodeSent");
                ReactNativeFirebaseAuthModule.this.mForceResendingToken = forceResendingToken;
                WritableMap createMap = Arguments.createMap();
                createMap.putString("verificationId", str4);
                createMap.putString("verificationId", str4);
                ReactNativeFirebaseAuthModule.this.sendPhoneStateEvent(str, str3, "onCodeSent", createMap);
            }

            @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
            public void onCodeAutoRetrievalTimeOut(String str4) {
                super.onCodeAutoRetrievalTimeOut(str4);
                Log.d(ReactNativeFirebaseAuthModule.TAG, "verifyPhoneNumber:verification:onCodeAutoRetrievalTimeOut");
                WritableMap createMap = Arguments.createMap();
                createMap.putString("verificationId", str4);
                ReactNativeFirebaseAuthModule.this.sendPhoneStateEvent(str, str3, "onCodeAutoRetrievalTimeout", createMap);
            }
        };
        if (currentActivity != null) {
            if (z && this.mForceResendingToken != null) {
                PhoneAuthProvider.getInstance(firebaseAuth).verifyPhoneNumber(str2, i, TimeUnit.SECONDS, currentActivity, onVerificationStateChangedCallbacks, this.mForceResendingToken);
            } else {
                PhoneAuthProvider.getInstance(firebaseAuth).verifyPhoneNumber(str2, i, TimeUnit.SECONDS, currentActivity, onVerificationStateChangedCallbacks);
            }
        }
    }

    @ReactMethod
    public void confirmPasswordReset(String str, String str2, String str3, final Promise promise) {
        Log.d(TAG, "confirmPasswordReset");
        FirebaseAuth.getInstance(FirebaseApp.getInstance(str)).confirmPasswordReset(str2, str3).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda50
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$confirmPasswordReset$35(promise, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$confirmPasswordReset$35(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "confirmPasswordReset:onComplete:success");
            promiseNoUser(promise, false);
        } else {
            Exception exception = task.getException();
            Log.e(TAG, "confirmPasswordReset:onComplete:failure", exception);
            promiseRejectAuthException(promise, exception);
        }
    }

    @ReactMethod
    public void applyActionCode(String str, String str2, final Promise promise) {
        Log.d(TAG, "applyActionCode");
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        firebaseAuth.applyActionCode(str2).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$applyActionCode$36(firebaseAuth, promise, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyActionCode$36(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "applyActionCode:onComplete:success");
            promiseWithUser(firebaseAuth.getCurrentUser(), promise);
        } else {
            Exception exception = task.getException();
            Log.e(TAG, "applyActionCode:onComplete:failure", exception);
            promiseRejectAuthException(promise, exception);
        }
    }

    @ReactMethod
    public void checkActionCode(String str, String str2, final Promise promise) {
        Log.d(TAG, "checkActionCode");
        FirebaseAuth.getInstance(FirebaseApp.getInstance(str)).checkActionCode(str2).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda17
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$checkActionCode$37(promise, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkActionCode$37(Promise promise, Task task) {
        String str;
        if (task.isSuccessful()) {
            Log.d(TAG, "checkActionCode:onComplete:success");
            ActionCodeResult actionCodeResult = (ActionCodeResult) Objects.requireNonNull((ActionCodeResult) task.getResult());
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString("email", actionCodeResult.getData(0));
            createMap2.putString("fromEmail", actionCodeResult.getData(1));
            createMap.putMap("data", createMap2);
            int operation = actionCodeResult.getOperation();
            if (operation == 0) {
                str = "PASSWORD_RESET";
            } else if (operation == 1) {
                str = "VERIFY_EMAIL";
            } else if (operation == 2) {
                str = "RECOVER_EMAIL";
            } else if (operation == 3) {
                str = "ERROR";
            } else {
                str = operation != 4 ? "UNKNOWN" : "EMAIL_SIGNIN";
            }
            createMap.putString("operation", str);
            promise.resolve(createMap);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "checkActionCode:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    @ReactMethod
    private void linkWithCredential(String str, String str2, String str3, String str4, final Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        AuthCredential credentialForProvider = getCredentialForProvider(str2, str3, str4);
        if (credentialForProvider == null) {
            rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
            return;
        }
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        Log.d(TAG, "link");
        if (currentUser != null) {
            currentUser.linkWithCredential(credentialForProvider).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda8
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$linkWithCredential$38(promise, task);
                }
            });
        } else {
            promiseNoUser(promise, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$linkWithCredential$38(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "link:onComplete:success");
            promiseWithAuthResult((AuthResult) task.getResult(), promise);
            return;
        }
        Exception exception = task.getException();
        if (exception instanceof FirebaseAuthUserCollisionException) {
            FirebaseAuthUserCollisionException firebaseAuthUserCollisionException = (FirebaseAuthUserCollisionException) exception;
            AuthCredential updatedCredential = firebaseAuthUserCollisionException.getUpdatedCredential();
            Log.d(TAG, "link:onComplete:collisionFailure", firebaseAuthUserCollisionException);
            if (updatedCredential != null) {
                Log.d(TAG, "link:onComplete:collisionFailure had credential", firebaseAuthUserCollisionException);
                promiseRejectLinkAuthException(promise, firebaseAuthUserCollisionException, updatedCredential);
                return;
            }
        }
        Log.e(TAG, "link:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    @ReactMethod
    private void linkWithProvider(String str, ReadableMap readableMap, final Promise promise) {
        ReadableMap map;
        ReadableArray array;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        if (readableMap.getString("providerId") == null) {
            rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
            return;
        }
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        Log.d(TAG, "linkWithProvider");
        if (currentUser == null) {
            promiseNoUser(promise, true);
            return;
        }
        OAuthProvider.Builder newBuilder = OAuthProvider.newBuilder(readableMap.getString("providerId"), firebaseAuth);
        if (readableMap.hasKey("scopes") && (array = readableMap.getArray("scopes")) != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < array.size(); i++) {
                arrayList.add(array.getString(i));
            }
            newBuilder.setScopes(arrayList);
        }
        if (readableMap.hasKey("customParameters") && (map = readableMap.getMap("customParameters")) != null) {
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                newBuilder.addCustomParameter(nextKey, map.getString(nextKey));
            }
        }
        Task<AuthResult> pendingAuthResult = firebaseAuth.getPendingAuthResult();
        if (pendingAuthResult != null) {
            pendingAuthResult.addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda33
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    ReactNativeFirebaseAuthModule.this.lambda$linkWithProvider$39(promise, (AuthResult) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda44
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    ReactNativeFirebaseAuthModule.this.lambda$linkWithProvider$40(promise, exc);
                }
            });
        } else {
            currentUser.startActivityForLinkWithProvider(getCurrentActivity(), newBuilder.build()).addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda48
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    ReactNativeFirebaseAuthModule.this.lambda$linkWithProvider$41(promise, (AuthResult) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda49
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    ReactNativeFirebaseAuthModule.this.lambda$linkWithProvider$42(promise, exc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$linkWithProvider$39(Promise promise, AuthResult authResult) {
        Log.d(TAG, "linkWithProvider:success");
        promiseWithAuthResult(authResult, promise);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$linkWithProvider$40(Promise promise, Exception exc) {
        Log.d(TAG, "linkWithProvider:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$linkWithProvider$41(Promise promise, AuthResult authResult) {
        Log.d(TAG, "linkWithProvider:success");
        promiseWithAuthResult(authResult, promise);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$linkWithProvider$42(Promise promise, Exception exc) {
        Log.d(TAG, "linkWithProvider:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    @ReactMethod
    public void unlink(String str, String str2, final Promise promise) {
        FirebaseUser currentUser = FirebaseAuth.getInstance(FirebaseApp.getInstance(str)).getCurrentUser();
        Log.d(TAG, "unlink");
        if (currentUser != null) {
            currentUser.unlink(str2).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda38
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$unlink$43(promise, task);
                }
            });
        } else {
            promiseNoUser(promise, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$unlink$43(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "unlink:onComplete:success");
            promiseWithUser(((AuthResult) Objects.requireNonNull((AuthResult) task.getResult())).getUser(), promise);
        } else {
            Exception exception = task.getException();
            Log.e(TAG, "unlink:onComplete:failure", exception);
            promiseRejectAuthException(promise, exception);
        }
    }

    @ReactMethod
    private void reauthenticateWithCredential(String str, String str2, String str3, String str4, final Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        AuthCredential credentialForProvider = getCredentialForProvider(str2, str3, str4);
        if (credentialForProvider == null) {
            rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
            return;
        }
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        Log.d(TAG, "reauthenticate");
        if (currentUser != null) {
            currentUser.reauthenticateAndRetrieveData(credentialForProvider).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda34
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$reauthenticateWithCredential$44(promise, task);
                }
            });
        } else {
            promiseNoUser(promise, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reauthenticateWithCredential$44(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "reauthenticate:onComplete:success");
            promiseWithAuthResult((AuthResult) task.getResult(), promise);
        } else {
            Exception exception = task.getException();
            Log.e(TAG, "reauthenticate:onComplete:failure", exception);
            promiseRejectAuthException(promise, exception);
        }
    }

    @ReactMethod
    private void reauthenticateWithProvider(String str, ReadableMap readableMap, final Promise promise) {
        ReadableMap map;
        ReadableArray array;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        if (readableMap.getString("providerId") == null) {
            rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
            return;
        }
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        Log.d(TAG, "reauthenticateWithProvider");
        if (currentUser == null) {
            promiseNoUser(promise, true);
            return;
        }
        OAuthProvider.Builder newBuilder = OAuthProvider.newBuilder(readableMap.getString("providerId"), firebaseAuth);
        if (readableMap.hasKey("scopes") && (array = readableMap.getArray("scopes")) != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < array.size(); i++) {
                arrayList.add(array.getString(i));
            }
            newBuilder.setScopes(arrayList);
        }
        if (readableMap.hasKey("customParameters") && (map = readableMap.getMap("customParameters")) != null) {
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                newBuilder.addCustomParameter(nextKey, map.getString(nextKey));
            }
        }
        Task<AuthResult> pendingAuthResult = firebaseAuth.getPendingAuthResult();
        if (pendingAuthResult != null) {
            pendingAuthResult.addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda18
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    ReactNativeFirebaseAuthModule.this.lambda$reauthenticateWithProvider$45(promise, (AuthResult) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda19
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    ReactNativeFirebaseAuthModule.this.lambda$reauthenticateWithProvider$46(promise, exc);
                }
            });
        } else {
            currentUser.startActivityForReauthenticateWithProvider(getCurrentActivity(), newBuilder.build()).addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda20
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    ReactNativeFirebaseAuthModule.this.lambda$reauthenticateWithProvider$47(promise, (AuthResult) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda21
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    ReactNativeFirebaseAuthModule.this.lambda$reauthenticateWithProvider$48(promise, exc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reauthenticateWithProvider$45(Promise promise, AuthResult authResult) {
        Log.d(TAG, "reauthenticateWithProvider:success");
        promiseWithAuthResult(authResult, promise);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reauthenticateWithProvider$46(Promise promise, Exception exc) {
        Log.d(TAG, "reauthenticateWithProvider:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reauthenticateWithProvider$47(Promise promise, AuthResult authResult) {
        Log.d(TAG, "reauthenticateWithProvider:success");
        promiseWithAuthResult(authResult, promise);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reauthenticateWithProvider$48(Promise promise, Exception exc) {
        Log.d(TAG, "reauthenticateWithProvider:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    private AuthCredential getCredentialForProvider(String str, String str2, String str3) {
        if (str.startsWith("oidc.")) {
            return OAuthProvider.newCredentialBuilder(str).setIdToken(str2).build();
        }
        if (this.credentials.containsKey(str2) && this.credentials.get(str2) != null) {
            return this.credentials.get(str2);
        }
        str.hashCode();
        switch (str) {
            case "apple.com":
                return OAuthProvider.newCredentialBuilder(str).setIdTokenWithRawNonce(str2, str3).build();
            case "twitter.com":
                return TwitterAuthProvider.getCredential(str2, str3);
            case "google.com":
                return GoogleAuthProvider.getCredential(str2, str3);
            case "facebook.com":
                return FacebookAuthProvider.getCredential(str2);
            case "oauth":
                return OAuthProvider.getCredential(str, str2, str3);
            case "phone":
                return getPhoneAuthCredential(str2, str3);
            case "password":
                return EmailAuthProvider.getCredential(str2, str3);
            case "github.com":
                return GithubAuthProvider.getCredential(str2);
            case "emailLink":
                return EmailAuthProvider.getCredentialWithLink(str2, str3);
            default:
                return null;
        }
    }

    private PhoneAuthCredential getPhoneAuthCredential(String str, String str2) {
        PhoneAuthCredential phoneAuthCredential;
        if (str == null && (phoneAuthCredential = this.mCredential) != null) {
            this.mCredential = null;
            return phoneAuthCredential;
        }
        if (str != null) {
            return PhoneAuthProvider.getCredential(str, str2);
        }
        return null;
    }

    @ReactMethod
    public void getIdToken(String str, Boolean bool, final Promise promise) {
        Log.d(TAG, "getIdToken");
        FirebaseUser currentUser = FirebaseAuth.getInstance(FirebaseApp.getInstance(str)).getCurrentUser();
        if (currentUser == null) {
            promiseNoUser(promise, true);
        } else {
            currentUser.getIdToken(bool.booleanValue()).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda11
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$getIdToken$49(promise, task);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getIdToken$49(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "getIdToken:onComplete:success");
            promise.resolve(((GetTokenResult) Objects.requireNonNull((GetTokenResult) task.getResult())).getToken());
        } else {
            Exception exception = task.getException();
            Log.e(TAG, "getIdToken:onComplete:failure", exception);
            promiseRejectAuthException(promise, exception);
        }
    }

    @ReactMethod
    public void getIdTokenResult(String str, Boolean bool, final Promise promise) {
        Log.d(TAG, "getIdTokenResult");
        FirebaseUser currentUser = FirebaseAuth.getInstance(FirebaseApp.getInstance(str)).getCurrentUser();
        if (currentUser == null) {
            promiseNoUser(promise, true);
        } else {
            currentUser.getIdToken(bool.booleanValue()).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda26
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$getIdTokenResult$50(promise, task);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getIdTokenResult$50(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "getIdTokenResult:onComplete:success");
            GetTokenResult getTokenResult = (GetTokenResult) task.getResult();
            WritableMap createMap = Arguments.createMap();
            SharedUtils.mapPutValue("authTime", SharedUtils.timestampToUTC(((GetTokenResult) Objects.requireNonNull(getTokenResult)).getAuthTimestamp()), createMap);
            SharedUtils.mapPutValue(SDKConstants.PARAM_EXPIRATION_TIME, SharedUtils.timestampToUTC(getTokenResult.getExpirationTimestamp()), createMap);
            SharedUtils.mapPutValue("issuedAtTime", SharedUtils.timestampToUTC(getTokenResult.getIssuedAtTimestamp()), createMap);
            SharedUtils.mapPutValue("claims", getTokenResult.getClaims(), createMap);
            SharedUtils.mapPutValue("signInProvider", getTokenResult.getSignInProvider(), createMap);
            SharedUtils.mapPutValue("token", getTokenResult.getToken(), createMap);
            promise.resolve(createMap);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "getIdTokenResult:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    @ReactMethod
    public void fetchSignInMethodsForEmail(String str, String str2, final Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        Log.d(TAG, "fetchProvidersForEmail");
        firebaseAuth.fetchSignInMethodsForEmail(str2).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda23
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$fetchSignInMethodsForEmail$51(promise, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchSignInMethodsForEmail$51(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "fetchProvidersForEmail:onComplete:success");
            List<String> signInMethods = ((SignInMethodQueryResult) Objects.requireNonNull((SignInMethodQueryResult) task.getResult())).getSignInMethods();
            WritableArray createArray = Arguments.createArray();
            if (signInMethods != null) {
                Iterator<String> it = signInMethods.iterator();
                while (it.hasNext()) {
                    createArray.pushString(it.next());
                }
            }
            promise.resolve(createArray);
            return;
        }
        Exception exception = task.getException();
        Log.d(TAG, "fetchProvidersForEmail:onComplete:failure", exception);
        promiseRejectAuthException(promise, exception);
    }

    @ReactMethod
    public void setLanguageCode(String str, String str2) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(str));
        if (str2 == null) {
            firebaseAuth.useAppLanguage();
        } else {
            firebaseAuth.setLanguageCode(str2);
        }
    }

    @ReactMethod
    public void setTenantId(String str, String str2) {
        FirebaseAuth.getInstance(FirebaseApp.getInstance(str)).setTenantId(str2);
    }

    @ReactMethod
    public void useDeviceLanguage(String str) {
        FirebaseAuth.getInstance(FirebaseApp.getInstance(str)).useAppLanguage();
    }

    @ReactMethod
    public void verifyPasswordResetCode(String str, String str2, final Promise promise) {
        Log.d(TAG, "verifyPasswordResetCode");
        FirebaseAuth.getInstance(FirebaseApp.getInstance(str)).verifyPasswordResetCode(str2).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule$$ExternalSyntheticLambda4
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$verifyPasswordResetCode$52(promise, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$verifyPasswordResetCode$52(Promise promise, Task task) {
        if (task.isSuccessful()) {
            Log.d(TAG, "verifyPasswordResetCode:onComplete:success");
            promise.resolve(task.getResult());
        } else {
            Exception exception = task.getException();
            Log.e(TAG, "verifyPasswordResetCode:onComplete:failure", exception);
            promiseRejectAuthException(promise, exception);
        }
    }

    @ReactMethod
    public void useEmulator(String str, String str2, int i) {
        if (emulatorConfigs.get(str) == null) {
            emulatorConfigs.put(str, "true");
            FirebaseAuth.getInstance(FirebaseApp.getInstance(str)).useEmulator(str2, i);
        }
    }

    private void promiseNoUser(Promise promise, Boolean bool) {
        if (bool.booleanValue()) {
            rejectPromiseWithCodeAndMessage(promise, "no-current-user", "No user currently signed in.");
        } else {
            promise.resolve(null);
        }
    }

    private void promiseWithUser(@Nullable FirebaseUser firebaseUser, Promise promise) {
        if (firebaseUser != null) {
            promise.resolve(firebaseUserToMap(firebaseUser));
        } else {
            promiseNoUser(promise, true);
        }
    }

    private void promiseWithAuthResult(AuthResult authResult, Promise promise) {
        if (authResult != null && authResult.getUser() != null) {
            WritableMap createMap = Arguments.createMap();
            WritableMap firebaseUserToMap = firebaseUserToMap(authResult.getUser());
            if (authResult.getAdditionalUserInfo() != null) {
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putBoolean("isNewUser", authResult.getAdditionalUserInfo().isNewUser());
                if (authResult.getAdditionalUserInfo().getProfile() != null) {
                    SharedUtils.mapPutValue(Scopes.PROFILE, authResult.getAdditionalUserInfo().getProfile(), createMap2);
                }
                if (authResult.getAdditionalUserInfo().getProviderId() != null) {
                    createMap2.putString("providerId", authResult.getAdditionalUserInfo().getProviderId());
                }
                if (authResult.getAdditionalUserInfo().getUsername() != null) {
                    createMap2.putString(HintConstants.AUTOFILL_HINT_USERNAME, authResult.getAdditionalUserInfo().getUsername());
                }
                createMap.putMap("additionalUserInfo", createMap2);
            }
            createMap.putMap(Participant.USER_TYPE, firebaseUserToMap);
            promise.resolve(createMap);
            return;
        }
        promiseNoUser(promise, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void promiseRejectAuthException(Promise promise, Exception exc) {
        WritableMap jSError = getJSError(exc);
        String string = jSError.hasKey("sessionId") ? jSError.getString("sessionId") : null;
        MultiFactorResolver multiFactorResolver = this.mCachedResolvers.get(string);
        WritableMap createMap = Arguments.createMap();
        if (multiFactorResolver != null) {
            createMap = resolverToMap(string, multiFactorResolver);
        }
        rejectPromiseWithCodeAndMessage(promise, jSError.getString(UniversalFirebaseFunctionsModule.CODE_KEY), jSError.getString("message"), createMap);
    }

    private void promiseRejectLinkAuthException(Promise promise, Exception exc, AuthCredential authCredential) {
        WritableMap jSError = getJSError(exc);
        String valueOf = String.valueOf(authCredential.hashCode());
        WritableMap createMap = Arguments.createMap();
        createMap.putString("providerId", authCredential.getProvider());
        createMap.putString("token", valueOf);
        createMap.putString("secret", null);
        this.credentials.put(valueOf, authCredential);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString(UniversalFirebaseFunctionsModule.CODE_KEY, jSError.getString(UniversalFirebaseFunctionsModule.CODE_KEY));
        createMap2.putString("message", jSError.getString("message"));
        createMap2.putMap("authCredential", createMap);
        promise.reject(jSError.getString(UniversalFirebaseFunctionsModule.CODE_KEY), jSError.getString("message"), createMap2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x019f, code lost:
    
        if (r0.equals("ERROR_UNVERIFIED_EMAIL") == false) goto L117;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WritableMap getJSError(Exception exc) {
        String str;
        char c;
        String str2 = "INVALID_EMAIL";
        WritableMap createMap = Arguments.createMap();
        String message = exc.getMessage();
        String str3 = "The email address is badly formatted.";
        char c2 = 2;
        try {
            FirebaseAuthException firebaseAuthException = (FirebaseAuthException) exc;
            str = firebaseAuthException.getErrorCode();
            try {
                createMap.putString("nativeErrorCode", str);
                message = firebaseAuthException.getMessage();
            } catch (Exception unused) {
                Matcher matcher = Pattern.compile("([A-Z]*_[A-Z]*)").matcher(message);
                if (matcher.find()) {
                    str = matcher.group(1).trim();
                    str.hashCode();
                    switch (str.hashCode()) {
                        case -2127468245:
                            if (str.equals("USER_TOKEN_EXPIRED")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1971163201:
                            if (str.equals("INVALID_CREDENTIAL")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1112393964:
                            if (str.equals("INVALID_EMAIL")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1035666916:
                            if (str.equals("CREDENTIAL_ALREADY_IN_USE")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -333672188:
                            if (str.equals("OPERATION_NOT_ALLOWED")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -324930558:
                            if (str.equals("CUSTOM_TOKEN_MISMATCH")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -311841705:
                            if (str.equals("EMAIL_ALREADY_IN_USE")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -75433118:
                            if (str.equals("USER_NOT_FOUND")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case -49749054:
                            if (str.equals("USER_MISMATCH")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -40686718:
                            if (str.equals("WEAK_PASSWORD")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 583750925:
                            if (str.equals("WRONG_PASSWORD")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 748182870:
                            if (str.equals("REQUIRES_RECENT_LOGIN")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 864281573:
                            if (str.equals("ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1072360691:
                            if (str.equals("INVALID_CUSTOM_TOKEN")) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1388786705:
                            if (str.equals("INVALID_IDENTIFIER")) {
                                c = 14;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1433767024:
                            if (str.equals("USER_DISABLED")) {
                                c = 15;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1563975629:
                            if (str.equals("INVALID_USER_TOKEN")) {
                                c = 16;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                        case 16:
                            message = "The user's credential is no longer valid. The user must sign in again.";
                            break;
                        case 1:
                            message = "The supplied auth credential is malformed or has expired.";
                            break;
                        case 2:
                            message = "The email address is badly formatted.";
                            break;
                        case 3:
                            message = "This credential is already associated with a different user account.";
                            break;
                        case 4:
                            message = "This operation is not allowed. You must enable this service in the console.";
                            break;
                        case 5:
                            message = "The custom token corresponds to a different audience.";
                            break;
                        case 6:
                            message = "The email address is already in use by another account.";
                            break;
                        case 7:
                            message = "There is no user record corresponding to this identifier. The user may have been deleted.";
                            break;
                        case '\b':
                            message = "The supplied credentials do not correspond to the previously signed in user.";
                            break;
                        case '\t':
                            message = "The given password is invalid.";
                            break;
                        case '\n':
                            message = "The password is invalid or the user does not have a password.";
                            break;
                        case 11:
                            message = "This operation is sensitive and requires recent authentication. Log in again before retrying this request.";
                            break;
                        case '\f':
                            message = "An account already exists with the same email address but different sign-in credentials. Sign in using a provider associated with this email address.";
                            break;
                        case '\r':
                            message = "The custom token format is incorrect. Please check the documentation.";
                            break;
                        case 14:
                            str = "INVALID_EMAIL";
                            message = "The email address is badly formatted.";
                            break;
                        case 15:
                            message = "The user account has been disabled by an administrator.";
                            break;
                    }
                }
                if (exc instanceof FirebaseAuthMultiFactorException) {
                }
                if (str.equals("UNKNOWN")) {
                }
                str3 = message;
                str2 = str;
                str2.hashCode();
                switch (str2.hashCode()) {
                    case -1904937287:
                        break;
                    case -282314177:
                        break;
                    case -51368043:
                        break;
                }
                switch (c2) {
                }
                createMap.putString(UniversalFirebaseFunctionsModule.CODE_KEY, str2.toLowerCase(Locale.ROOT).replace("error_", "").replace('_', '-'));
                createMap.putString("message", str3);
                createMap.putString("nativeErrorMessage", exc.getMessage());
                return createMap;
            }
        } catch (Exception unused2) {
            str = "UNKNOWN";
        }
        if (exc instanceof FirebaseAuthMultiFactorException) {
            MultiFactorResolver resolver = ((FirebaseAuthMultiFactorException) exc).getResolver();
            String num = Integer.toString(resolver.getSession().hashCode());
            this.mCachedResolvers.put(num, resolver);
            createMap.putString("sessionId", num);
            str = "MULTI_FACTOR_AUTH_REQUIRED";
        }
        if (str.equals("UNKNOWN")) {
            if (!(exc instanceof FirebaseAuthInvalidCredentialsException)) {
                if (exc instanceof FirebaseNetworkException) {
                    str2 = "NETWORK_REQUEST_FAILED";
                } else if (exc instanceof FirebaseTooManyRequestsException) {
                    str2 = "TOO_MANY_REQUESTS";
                }
                str3 = message;
            }
            str2.hashCode();
            switch (str2.hashCode()) {
                case -1904937287:
                    if (str2.equals("ERROR_INVALID_PHONE_NUMBER")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -282314177:
                    if (str2.equals("ERROR_UNSUPPORTED_FIRST_FACTOR")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -51368043:
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    str3 = "The format of the phone number provided is incorrect. Please enter the phone number in a format that can be parsed into E.164 format. E.164 phone numbers are written in the format [+][country code][subscriber number including area code].";
                    break;
                case 1:
                    str3 = "Enrolling a second factor or signing in with a multi-factor account requires sign-in with a supported first factor.";
                    break;
                case 2:
                    str3 = "This operation requires a verified email.";
                    break;
            }
            createMap.putString(UniversalFirebaseFunctionsModule.CODE_KEY, str2.toLowerCase(Locale.ROOT).replace("error_", "").replace('_', '-'));
            createMap.putString("message", str3);
            createMap.putString("nativeErrorMessage", exc.getMessage());
            return createMap;
        }
        str3 = message;
        str2 = str;
        str2.hashCode();
        switch (str2.hashCode()) {
            case -1904937287:
                break;
            case -282314177:
                break;
            case -51368043:
                break;
        }
        switch (c2) {
        }
        createMap.putString(UniversalFirebaseFunctionsModule.CODE_KEY, str2.toLowerCase(Locale.ROOT).replace("error_", "").replace('_', '-'));
        createMap.putString("message", str3);
        createMap.putString("nativeErrorMessage", exc.getMessage());
        return createMap;
    }

    private WritableArray convertProviderData(List<? extends UserInfo> list, FirebaseUser firebaseUser) {
        WritableArray createArray = Arguments.createArray();
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            UserInfo userInfo = (UserInfo) it.next();
            if (!"firebase".equals(userInfo.getProviderId())) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("providerId", userInfo.getProviderId());
                createMap.putString("uid", userInfo.getUid());
                createMap.putString("displayName", userInfo.getDisplayName());
                Uri photoUrl = userInfo.getPhotoUrl();
                if (photoUrl != null && !"".equals(photoUrl.toString())) {
                    createMap.putString("photoURL", photoUrl.toString());
                } else {
                    createMap.putNull("photoURL");
                }
                String phoneNumber = userInfo.getPhoneNumber();
                if ("phone".equals(userInfo.getProviderId()) && (userInfo.getPhoneNumber() == null || "".equals(userInfo.getPhoneNumber()))) {
                    createMap.putString(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, firebaseUser.getPhoneNumber());
                } else if (phoneNumber != null && !"".equals(phoneNumber)) {
                    createMap.putString(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, phoneNumber);
                } else {
                    createMap.putNull(HintConstants.AUTOFILL_HINT_PHONE_NUMBER);
                }
                if ("password".equals(userInfo.getProviderId()) && (userInfo.getEmail() == null || "".equals(userInfo.getEmail()))) {
                    createMap.putString("email", userInfo.getUid());
                } else if (userInfo.getEmail() != null && !"".equals(userInfo.getEmail())) {
                    createMap.putString("email", userInfo.getEmail());
                } else {
                    createMap.putNull("email");
                }
                createArray.pushMap(createMap);
            }
        }
        return createArray;
    }

    private WritableMap firebaseUserToMap(FirebaseUser firebaseUser) {
        WritableMap createMap = Arguments.createMap();
        String uid = firebaseUser.getUid();
        String email = firebaseUser.getEmail();
        Uri photoUrl = firebaseUser.getPhotoUrl();
        String displayName = firebaseUser.getDisplayName();
        String providerId = firebaseUser.getProviderId();
        boolean isEmailVerified = firebaseUser.isEmailVerified();
        String phoneNumber = firebaseUser.getPhoneNumber();
        String tenantId = firebaseUser.getTenantId();
        createMap.putString("uid", uid);
        createMap.putString("providerId", providerId);
        createMap.putBoolean("emailVerified", isEmailVerified);
        createMap.putBoolean("isAnonymous", firebaseUser.isAnonymous());
        if (email != null && !"".equals(email)) {
            createMap.putString("email", email);
        } else {
            createMap.putNull("email");
        }
        if (displayName != null && !"".equals(displayName)) {
            createMap.putString("displayName", displayName);
        } else {
            createMap.putNull("displayName");
        }
        if (photoUrl != null && !"".equals(photoUrl.toString())) {
            createMap.putString("photoURL", photoUrl.toString());
        } else {
            createMap.putNull("photoURL");
        }
        if (phoneNumber != null && !"".equals(phoneNumber)) {
            createMap.putString(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, phoneNumber);
        } else {
            createMap.putNull(HintConstants.AUTOFILL_HINT_PHONE_NUMBER);
        }
        if (tenantId != null && !"".equals(tenantId)) {
            createMap.putString("tenantId", tenantId);
        } else {
            createMap.putNull("tenantId");
        }
        createMap.putArray("providerData", convertProviderData(firebaseUser.getProviderData(), firebaseUser));
        WritableMap createMap2 = Arguments.createMap();
        if (firebaseUser.getMetadata() != null) {
            createMap2.putDouble("creationTime", r2.getCreationTimestamp());
            createMap2.putDouble("lastSignInTime", r2.getLastSignInTimestamp());
        }
        createMap.putMap(TtmlNode.TAG_METADATA, createMap2);
        WritableArray createArray = Arguments.createArray();
        Iterator<MultiFactorInfo> it = firebaseUser.getMultiFactor().getEnrolledFactors().iterator();
        while (it.hasNext()) {
            createArray.pushMap(multiFactorInfoToMap(it.next()));
        }
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putArray("enrolledFactors", createArray);
        createMap.putMap("multiFactor", createMap3);
        return createMap;
    }

    private WritableMap resolverToMap(String str, MultiFactorResolver multiFactorResolver) {
        WritableMap createMap = Arguments.createMap();
        WritableArray createArray = Arguments.createArray();
        Iterator<MultiFactorInfo> it = multiFactorResolver.getHints().iterator();
        while (it.hasNext()) {
            createArray.pushMap(multiFactorInfoToMap(it.next()));
        }
        createMap.putArray("hints", createArray);
        createMap.putString("session", str);
        return createMap;
    }

    private WritableMap multiFactorInfoToMap(MultiFactorInfo multiFactorInfo) {
        WritableMap createMap = Arguments.createMap();
        Date date = new Date(multiFactorInfo.getEnrollmentTimestamp() * 1000);
        createMap.putString("displayName", multiFactorInfo.getDisplayName());
        createMap.putString("enrollmentTime", ISO_8601_FORMATTER.format(date));
        createMap.putString("factorId", multiFactorInfo.getFactorId());
        createMap.putString("uid", multiFactorInfo.getUid());
        if (multiFactorInfo.getFactorId().equals("phone")) {
            createMap.putString(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, ((PhoneMultiFactorInfo) multiFactorInfo).getPhoneNumber());
        }
        return createMap;
    }

    private ActionCodeSettings buildActionCodeSettings(ReadableMap readableMap) {
        ActionCodeSettings.Builder url = ActionCodeSettings.newBuilder().setUrl((String) Objects.requireNonNull(readableMap.getString("url")));
        if (readableMap.hasKey("handleCodeInApp")) {
            url = url.setHandleCodeInApp(readableMap.getBoolean("handleCodeInApp"));
        }
        if (readableMap.hasKey("linkDomain")) {
            url = url.setLinkDomain((String) Objects.requireNonNull(readableMap.getString("linkDomain")));
        }
        if (readableMap.hasKey("android")) {
            ReadableMap map = readableMap.getMap("android");
            url = url.setAndroidPackageName((String) Objects.requireNonNull(map.getString("packageName")), ((ReadableMap) Objects.requireNonNull(map)).hasKey("installApp") && map.getBoolean("installApp"), map.hasKey("minimumVersion") ? map.getString("minimumVersion") : null);
        }
        if (readableMap.hasKey("iOS")) {
            url = url.setIOSBundleId((String) Objects.requireNonNull(readableMap.getMap("iOS").getString("bundleId")));
        }
        return url.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPhoneStateEvent(String str, String str2, String str3, WritableMap writableMap) {
        WritableMap createMap = Arguments.createMap();
        ReactNativeFirebaseEventEmitter sharedInstance = ReactNativeFirebaseEventEmitter.getSharedInstance();
        createMap.putString("appName", str);
        createMap.putString("requestKey", str2);
        createMap.putString("type", str3);
        createMap.putMap("state", writableMap);
        sharedInstance.sendEvent(new ReactNativeFirebaseEvent("phone_auth_state_changed", createMap, str));
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        List<FirebaseApp> apps = FirebaseApp.getApps(getReactApplicationContext());
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        Iterator<FirebaseApp> it = apps.iterator();
        while (it.hasNext()) {
            String name = it.next().getName();
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(name));
            FirebaseUser currentUser = firebaseAuth.getCurrentUser();
            hashMap2.put(name, firebaseAuth.getLanguageCode());
            if (currentUser != null) {
                hashMap3.put(name, firebaseUserToMap(currentUser));
            }
        }
        hashMap.put("APP_LANGUAGE", hashMap2);
        hashMap.put("APP_USER", hashMap3);
        return hashMap;
    }
}
