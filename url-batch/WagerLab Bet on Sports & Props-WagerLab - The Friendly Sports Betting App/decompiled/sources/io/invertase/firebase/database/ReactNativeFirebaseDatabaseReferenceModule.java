package io.invertase.firebase.database;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.invertase.firebase.common.RCTConvertFirebase;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public class ReactNativeFirebaseDatabaseReferenceModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "DatabaseReference";
    private final UniversalFirebaseDatabaseReferenceModule module;

    ReactNativeFirebaseDatabaseReferenceModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
        this.module = new UniversalFirebaseDatabaseReferenceModule(reactApplicationContext, SERVICE_NAME);
    }

    @ReactMethod
    public void set(final String str, final String str2, final String str3, final ReadableMap readableMap, final Promise promise) {
        Tasks.call(getTransactionalExecutor(), new Callable() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseReferenceModule$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj;
                obj = RCTConvertFirebase.toHashMap(ReadableMap.this).get("value");
                return obj;
            }
        }).onSuccessTask(new SuccessContinuation() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseReferenceModule$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task lambda$set$1;
                lambda$set$1 = ReactNativeFirebaseDatabaseReferenceModule.this.lambda$set$1(str, str2, str3, obj);
                return lambda$set$1;
            }
        }).addOnCompleteListener(getTransactionalExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseReferenceModule$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseDatabaseReferenceModule.lambda$set$2(Promise.this, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$set$1(String str, String str2, String str3, Object obj) throws Exception {
        return this.module.set(str, str2, str3, obj);
    }

    static /* synthetic */ void lambda$set$2(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseDatabaseCommon.rejectPromiseDatabaseException(promise, task.getException());
        }
    }

    @ReactMethod
    public void update(final String str, final String str2, final String str3, final ReadableMap readableMap, final Promise promise) {
        Tasks.call(getTransactionalExecutor(), new Callable() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseReferenceModule$$ExternalSyntheticLambda5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj;
                obj = RCTConvertFirebase.toHashMap(ReadableMap.this).get("values");
                return obj;
            }
        }).onSuccessTask(new SuccessContinuation() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseReferenceModule$$ExternalSyntheticLambda6
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task lambda$update$4;
                lambda$update$4 = ReactNativeFirebaseDatabaseReferenceModule.this.lambda$update$4(str, str2, str3, obj);
                return lambda$update$4;
            }
        }).addOnCompleteListener(getTransactionalExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseReferenceModule$$ExternalSyntheticLambda7
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseDatabaseReferenceModule.lambda$update$5(Promise.this, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$update$4(String str, String str2, String str3, Object obj) throws Exception {
        return this.module.update(str, str2, str3, (Map) obj);
    }

    static /* synthetic */ void lambda$update$5(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseDatabaseCommon.rejectPromiseDatabaseException(promise, task.getException());
        }
    }

    @ReactMethod
    public void setWithPriority(final String str, final String str2, final String str3, final ReadableMap readableMap, final Promise promise) {
        Tasks.call(getTransactionalExecutor(), new Callable() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseReferenceModule$$ExternalSyntheticLambda8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Map hashMap;
                hashMap = RCTConvertFirebase.toHashMap(ReadableMap.this);
                return hashMap;
            }
        }).onSuccessTask(new SuccessContinuation() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseReferenceModule$$ExternalSyntheticLambda9
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task lambda$setWithPriority$7;
                lambda$setWithPriority$7 = ReactNativeFirebaseDatabaseReferenceModule.this.lambda$setWithPriority$7(str, str2, str3, (Map) obj);
                return lambda$setWithPriority$7;
            }
        }).addOnCompleteListener(getTransactionalExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseReferenceModule$$ExternalSyntheticLambda10
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseDatabaseReferenceModule.lambda$setWithPriority$8(Promise.this, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$setWithPriority$7(String str, String str2, String str3, Map map) throws Exception {
        return this.module.setWithPriority(str, str2, str3, map.get("value"), map.get("priority"));
    }

    static /* synthetic */ void lambda$setWithPriority$8(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseDatabaseCommon.rejectPromiseDatabaseException(promise, task.getException());
        }
    }

    @ReactMethod
    public void remove(String str, String str2, String str3, final Promise promise) {
        this.module.remove(str, str2, str3).addOnCompleteListener(getTransactionalExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseReferenceModule$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseDatabaseReferenceModule.lambda$remove$9(Promise.this, task);
            }
        });
    }

    static /* synthetic */ void lambda$remove$9(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseDatabaseCommon.rejectPromiseDatabaseException(promise, task.getException());
        }
    }

    @ReactMethod
    public void setPriority(String str, String str2, String str3, ReadableMap readableMap, final Promise promise) {
        this.module.setPriority(str, str2, str3, RCTConvertFirebase.toHashMap(readableMap).get("priority")).addOnCompleteListener(getTransactionalExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseReferenceModule$$ExternalSyntheticLambda4
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseDatabaseReferenceModule.lambda$setPriority$10(Promise.this, task);
            }
        });
    }

    static /* synthetic */ void lambda$setPriority$10(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseDatabaseCommon.rejectPromiseDatabaseException(promise, task.getException());
        }
    }
}
