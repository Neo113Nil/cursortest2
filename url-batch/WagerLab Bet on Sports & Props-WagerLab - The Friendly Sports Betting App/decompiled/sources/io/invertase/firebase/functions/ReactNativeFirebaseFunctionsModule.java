package io.invertase.firebase.functions;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.functions.FirebaseFunctionsException;
import io.invertase.firebase.common.RCTConvertFirebase;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.io.IOException;

/* loaded from: classes8.dex */
public class ReactNativeFirebaseFunctionsModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "Functions";
    private final UniversalFirebaseFunctionsModule module;

    ReactNativeFirebaseFunctionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
        this.module = new UniversalFirebaseFunctionsModule(reactApplicationContext, SERVICE_NAME);
    }

    @ReactMethod
    public void httpsCallable(String str, String str2, String str3, Integer num, String str4, ReadableMap readableMap, ReadableMap readableMap2, final Promise promise) {
        Task<Object> httpsCallable = this.module.httpsCallable(str, str2, str3, num, str4, readableMap.toHashMap().get("data"), readableMap2);
        httpsCallable.addOnSuccessListener(getExecutor(), new OnSuccessListener() { // from class: io.invertase.firebase.functions.ReactNativeFirebaseFunctionsModule$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Promise.this.resolve(RCTConvertFirebase.mapPutValue("data", obj, Arguments.createMap()));
            }
        });
        httpsCallable.addOnFailureListener(getExecutor(), new OnFailureListener() { // from class: io.invertase.firebase.functions.ReactNativeFirebaseFunctionsModule$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                ReactNativeFirebaseFunctionsModule.lambda$httpsCallable$1(Promise.this, exc);
            }
        });
    }

    static /* synthetic */ void lambda$httpsCallable$1(Promise promise, Exception exc) {
        Object obj;
        String str;
        String message = exc.getMessage();
        WritableMap createMap = Arguments.createMap();
        if (!(exc.getCause() instanceof FirebaseFunctionsException)) {
            obj = null;
            str = "UNKNOWN";
        } else {
            FirebaseFunctionsException firebaseFunctionsException = (FirebaseFunctionsException) exc.getCause();
            obj = firebaseFunctionsException.getDetails();
            str = firebaseFunctionsException.getCode().name();
            String message2 = firebaseFunctionsException.getMessage();
            Boolean valueOf = Boolean.valueOf(str.contains(FirebaseFunctionsException.Code.DEADLINE_EXCEEDED.name()));
            if (!(firebaseFunctionsException.getCause() instanceof IOException) || valueOf.booleanValue()) {
                message = message2;
            } else {
                str = FirebaseFunctionsException.Code.UNAVAILABLE.name();
                message = FirebaseFunctionsException.Code.UNAVAILABLE.name();
            }
        }
        RCTConvertFirebase.mapPutValue(UniversalFirebaseFunctionsModule.CODE_KEY, str, createMap);
        RCTConvertFirebase.mapPutValue("message", message, createMap);
        RCTConvertFirebase.mapPutValue(UniversalFirebaseFunctionsModule.DETAILS_KEY, obj, createMap);
        promise.reject(str, message, exc, createMap);
    }

    @ReactMethod
    public void httpsCallableFromUrl(String str, String str2, String str3, Integer num, String str4, ReadableMap readableMap, ReadableMap readableMap2, final Promise promise) {
        Task<Object> httpsCallableFromUrl = this.module.httpsCallableFromUrl(str, str2, str3, num, str4, readableMap.toHashMap().get("data"), readableMap2);
        httpsCallableFromUrl.addOnSuccessListener(getExecutor(), new OnSuccessListener() { // from class: io.invertase.firebase.functions.ReactNativeFirebaseFunctionsModule$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Promise.this.resolve(RCTConvertFirebase.mapPutValue("data", obj, Arguments.createMap()));
            }
        });
        httpsCallableFromUrl.addOnFailureListener(getExecutor(), new OnFailureListener() { // from class: io.invertase.firebase.functions.ReactNativeFirebaseFunctionsModule$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                ReactNativeFirebaseFunctionsModule.lambda$httpsCallableFromUrl$3(Promise.this, exc);
            }
        });
    }

    static /* synthetic */ void lambda$httpsCallableFromUrl$3(Promise promise, Exception exc) {
        Object obj;
        String str;
        String message = exc.getMessage();
        WritableMap createMap = Arguments.createMap();
        if (!(exc.getCause() instanceof FirebaseFunctionsException)) {
            obj = null;
            str = "UNKNOWN";
        } else {
            FirebaseFunctionsException firebaseFunctionsException = (FirebaseFunctionsException) exc.getCause();
            obj = firebaseFunctionsException.getDetails();
            str = firebaseFunctionsException.getCode().name();
            String message2 = firebaseFunctionsException.getMessage();
            Boolean valueOf = Boolean.valueOf(str.contains(FirebaseFunctionsException.Code.DEADLINE_EXCEEDED.name()));
            if (!(firebaseFunctionsException.getCause() instanceof IOException) || valueOf.booleanValue()) {
                message = message2;
            } else {
                str = FirebaseFunctionsException.Code.UNAVAILABLE.name();
                message = FirebaseFunctionsException.Code.UNAVAILABLE.name();
            }
        }
        RCTConvertFirebase.mapPutValue(UniversalFirebaseFunctionsModule.CODE_KEY, str, createMap);
        RCTConvertFirebase.mapPutValue("message", message, createMap);
        RCTConvertFirebase.mapPutValue(UniversalFirebaseFunctionsModule.DETAILS_KEY, obj, createMap);
        promise.reject(str, message, exc, createMap);
    }
}
