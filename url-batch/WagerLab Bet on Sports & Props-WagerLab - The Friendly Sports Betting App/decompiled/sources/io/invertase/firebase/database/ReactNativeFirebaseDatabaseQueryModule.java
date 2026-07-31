package io.invertase.firebase.database;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import io.invertase.firebase.common.RCTConvertFirebase;
import io.invertase.firebase.common.ReactNativeFirebaseEventEmitter;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import io.invertase.firebase.database.ReactNativeFirebaseDatabaseQueryModule;
import io.invertase.firebase.functions.UniversalFirebaseFunctionsModule;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes8.dex */
public class ReactNativeFirebaseDatabaseQueryModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "DatabaseQuery";
    private HashMap<String, ReactNativeFirebaseDatabaseQuery> queryMap;

    ReactNativeFirebaseDatabaseQueryModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
        this.queryMap = new HashMap<>();
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        Iterator<Map.Entry<String, ReactNativeFirebaseDatabaseQuery>> it = this.queryMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().removeAllEventListeners();
            it.remove();
        }
    }

    private ReactNativeFirebaseDatabaseQuery getDatabaseQueryInstance(DatabaseReference databaseReference, ReadableArray readableArray) {
        return new ReactNativeFirebaseDatabaseQuery(databaseReference, readableArray);
    }

    private ReactNativeFirebaseDatabaseQuery getDatabaseQueryInstance(String str, DatabaseReference databaseReference, ReadableArray readableArray) {
        ReactNativeFirebaseDatabaseQuery reactNativeFirebaseDatabaseQuery = this.queryMap.get(str);
        if (reactNativeFirebaseDatabaseQuery != null) {
            return reactNativeFirebaseDatabaseQuery;
        }
        ReactNativeFirebaseDatabaseQuery reactNativeFirebaseDatabaseQuery2 = new ReactNativeFirebaseDatabaseQuery(databaseReference, readableArray);
        this.queryMap.put(str, reactNativeFirebaseDatabaseQuery2);
        return reactNativeFirebaseDatabaseQuery2;
    }

    /* renamed from: io.invertase.firebase.database.ReactNativeFirebaseDatabaseQueryModule$1, reason: invalid class name */
    class AnonymousClass1 implements ValueEventListener {
        final /* synthetic */ Promise val$promise;

        AnonymousClass1(Promise promise) {
            this.val$promise = promise;
        }

        @Override // com.google.firebase.database.ValueEventListener
        public void onDataChange(@Nonnull final DataSnapshot dataSnapshot) {
            Task call = Tasks.call(ReactNativeFirebaseDatabaseQueryModule.this.getExecutor(), new Callable() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseQueryModule$1$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    WritableMap snapshotToMap;
                    snapshotToMap = ReactNativeFirebaseDatabaseCommon.snapshotToMap(DataSnapshot.this);
                    return snapshotToMap;
                }
            });
            final Promise promise = this.val$promise;
            call.addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseQueryModule$1$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseDatabaseQueryModule.AnonymousClass1.lambda$onDataChange$1(Promise.this, task);
                }
            });
        }

        static /* synthetic */ void lambda$onDataChange$1(Promise promise, Task task) {
            if (task.isSuccessful()) {
                promise.resolve(task.getResult());
            } else {
                ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
            }
        }

        @Override // com.google.firebase.database.ValueEventListener
        public void onCancelled(@Nonnull DatabaseError databaseError) {
            ReactNativeFirebaseDatabaseCommon.rejectPromiseDatabaseException(this.val$promise, new UniversalDatabaseException(databaseError.getCode(), databaseError.getMessage(), databaseError.toException()));
        }
    }

    private void addOnceValueEventListener(ReactNativeFirebaseDatabaseQuery reactNativeFirebaseDatabaseQuery, Promise promise) {
        reactNativeFirebaseDatabaseQuery.addSingleValueEventListener(new AnonymousClass1(promise));
    }

    /* renamed from: io.invertase.firebase.database.ReactNativeFirebaseDatabaseQueryModule$2, reason: invalid class name */
    class AnonymousClass2 implements ChildEventListener {
        final /* synthetic */ ReactNativeFirebaseDatabaseQuery val$databaseQuery;
        final /* synthetic */ String val$eventType;
        final /* synthetic */ Promise val$promise;

        AnonymousClass2(String str, ReactNativeFirebaseDatabaseQuery reactNativeFirebaseDatabaseQuery, Promise promise) {
            this.val$eventType = str;
            this.val$databaseQuery = reactNativeFirebaseDatabaseQuery;
            this.val$promise = promise;
        }

        @Override // com.google.firebase.database.ChildEventListener
        public void onChildAdded(@Nonnull final DataSnapshot dataSnapshot, final String str) {
            if ("child_added".equals(this.val$eventType)) {
                this.val$databaseQuery.removeEventListener(this);
                Task call = Tasks.call(ReactNativeFirebaseDatabaseQueryModule.this.getExecutor(), new Callable() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseQueryModule$2$$ExternalSyntheticLambda0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        WritableMap snapshotWithPreviousChildToMap;
                        snapshotWithPreviousChildToMap = ReactNativeFirebaseDatabaseCommon.snapshotWithPreviousChildToMap(DataSnapshot.this, str);
                        return snapshotWithPreviousChildToMap;
                    }
                });
                final Promise promise = this.val$promise;
                call.addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseQueryModule$2$$ExternalSyntheticLambda1
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        ReactNativeFirebaseDatabaseQueryModule.AnonymousClass2.lambda$onChildAdded$1(Promise.this, task);
                    }
                });
            }
        }

        static /* synthetic */ void lambda$onChildAdded$1(Promise promise, Task task) {
            if (task.isSuccessful()) {
                promise.resolve(task.getResult());
            } else {
                ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
            }
        }

        @Override // com.google.firebase.database.ChildEventListener
        public void onChildChanged(@Nonnull final DataSnapshot dataSnapshot, final String str) {
            if ("child_changed".equals(this.val$eventType)) {
                this.val$databaseQuery.removeEventListener(this);
                Task call = Tasks.call(ReactNativeFirebaseDatabaseQueryModule.this.getExecutor(), new Callable() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseQueryModule$2$$ExternalSyntheticLambda6
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        WritableMap snapshotWithPreviousChildToMap;
                        snapshotWithPreviousChildToMap = ReactNativeFirebaseDatabaseCommon.snapshotWithPreviousChildToMap(DataSnapshot.this, str);
                        return snapshotWithPreviousChildToMap;
                    }
                });
                final Promise promise = this.val$promise;
                call.addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseQueryModule$2$$ExternalSyntheticLambda7
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        ReactNativeFirebaseDatabaseQueryModule.AnonymousClass2.lambda$onChildChanged$3(Promise.this, task);
                    }
                });
            }
        }

        static /* synthetic */ void lambda$onChildChanged$3(Promise promise, Task task) {
            if (task.isSuccessful()) {
                promise.resolve(task.getResult());
            } else {
                ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
            }
        }

        @Override // com.google.firebase.database.ChildEventListener
        public void onChildRemoved(@Nonnull final DataSnapshot dataSnapshot) {
            if ("child_removed".equals(this.val$eventType)) {
                this.val$databaseQuery.removeEventListener(this);
                Task call = Tasks.call(ReactNativeFirebaseDatabaseQueryModule.this.getExecutor(), new Callable() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseQueryModule$2$$ExternalSyntheticLambda2
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        WritableMap snapshotWithPreviousChildToMap;
                        snapshotWithPreviousChildToMap = ReactNativeFirebaseDatabaseCommon.snapshotWithPreviousChildToMap(DataSnapshot.this, null);
                        return snapshotWithPreviousChildToMap;
                    }
                });
                final Promise promise = this.val$promise;
                call.addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseQueryModule$2$$ExternalSyntheticLambda3
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        ReactNativeFirebaseDatabaseQueryModule.AnonymousClass2.lambda$onChildRemoved$5(Promise.this, task);
                    }
                });
            }
        }

        static /* synthetic */ void lambda$onChildRemoved$5(Promise promise, Task task) {
            if (task.isSuccessful()) {
                promise.resolve(task.getResult());
            } else {
                ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
            }
        }

        @Override // com.google.firebase.database.ChildEventListener
        public void onChildMoved(@Nonnull final DataSnapshot dataSnapshot, final String str) {
            if ("child_moved".equals(this.val$eventType)) {
                this.val$databaseQuery.removeEventListener(this);
                Task call = Tasks.call(ReactNativeFirebaseDatabaseQueryModule.this.getExecutor(), new Callable() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseQueryModule$2$$ExternalSyntheticLambda4
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        WritableMap snapshotWithPreviousChildToMap;
                        snapshotWithPreviousChildToMap = ReactNativeFirebaseDatabaseCommon.snapshotWithPreviousChildToMap(DataSnapshot.this, str);
                        return snapshotWithPreviousChildToMap;
                    }
                });
                final Promise promise = this.val$promise;
                call.addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseQueryModule$2$$ExternalSyntheticLambda5
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        ReactNativeFirebaseDatabaseQueryModule.AnonymousClass2.lambda$onChildMoved$7(Promise.this, task);
                    }
                });
            }
        }

        static /* synthetic */ void lambda$onChildMoved$7(Promise promise, Task task) {
            if (task.isSuccessful()) {
                promise.resolve(task.getResult());
            } else {
                ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
            }
        }

        @Override // com.google.firebase.database.ChildEventListener
        public void onCancelled(@Nonnull DatabaseError databaseError) {
            this.val$databaseQuery.removeEventListener(this);
            ReactNativeFirebaseDatabaseCommon.rejectPromiseDatabaseException(this.val$promise, new UniversalDatabaseException(databaseError.getCode(), databaseError.getMessage(), databaseError.toException()));
        }
    }

    private void addChildOnceEventListener(String str, ReactNativeFirebaseDatabaseQuery reactNativeFirebaseDatabaseQuery, Promise promise) {
        reactNativeFirebaseDatabaseQuery.addSingleChildEventListener(new AnonymousClass2(str, reactNativeFirebaseDatabaseQuery, promise));
    }

    private void addValueEventListener(final String str, final ReactNativeFirebaseDatabaseQuery reactNativeFirebaseDatabaseQuery, final ReadableMap readableMap) {
        final String string = readableMap.getString("eventRegistrationKey");
        if (reactNativeFirebaseDatabaseQuery.hasEventListener(string).booleanValue()) {
            return;
        }
        reactNativeFirebaseDatabaseQuery.addEventListener(string, new ValueEventListener() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseQueryModule.3
            @Override // com.google.firebase.database.ValueEventListener
            public void onDataChange(@Nonnull DataSnapshot dataSnapshot) {
                ReactNativeFirebaseDatabaseQueryModule.this.handleDatabaseEvent(str, "value", readableMap, dataSnapshot, null);
            }

            @Override // com.google.firebase.database.ValueEventListener
            public void onCancelled(@Nonnull DatabaseError databaseError) {
                reactNativeFirebaseDatabaseQuery.removeEventListener(string);
                ReactNativeFirebaseDatabaseQueryModule.this.handleDatabaseEventError(str, readableMap, databaseError);
            }
        });
    }

    private void addChildEventListener(final String str, final String str2, final ReactNativeFirebaseDatabaseQuery reactNativeFirebaseDatabaseQuery, final ReadableMap readableMap) {
        final String string = readableMap.getString("eventRegistrationKey");
        if (reactNativeFirebaseDatabaseQuery.hasEventListener(string).booleanValue()) {
            return;
        }
        reactNativeFirebaseDatabaseQuery.addEventListener(string, new ChildEventListener() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseQueryModule.4
            @Override // com.google.firebase.database.ChildEventListener
            public void onChildAdded(@Nonnull DataSnapshot dataSnapshot, String str3) {
                if ("child_added".equals(str2)) {
                    ReactNativeFirebaseDatabaseQueryModule.this.handleDatabaseEvent(str, "child_added", readableMap, dataSnapshot, str3);
                }
            }

            @Override // com.google.firebase.database.ChildEventListener
            public void onChildChanged(@Nonnull DataSnapshot dataSnapshot, String str3) {
                if ("child_changed".equals(str2)) {
                    ReactNativeFirebaseDatabaseQueryModule.this.handleDatabaseEvent(str, "child_changed", readableMap, dataSnapshot, str3);
                }
            }

            @Override // com.google.firebase.database.ChildEventListener
            public void onChildRemoved(@Nonnull DataSnapshot dataSnapshot) {
                if ("child_removed".equals(str2)) {
                    ReactNativeFirebaseDatabaseQueryModule.this.handleDatabaseEvent(str, "child_removed", readableMap, dataSnapshot, null);
                }
            }

            @Override // com.google.firebase.database.ChildEventListener
            public void onChildMoved(@Nonnull DataSnapshot dataSnapshot, String str3) {
                if ("child_moved".equals(str2)) {
                    ReactNativeFirebaseDatabaseQueryModule.this.handleDatabaseEvent(str, "child_moved", readableMap, dataSnapshot, str3);
                }
            }

            @Override // com.google.firebase.database.ChildEventListener
            public void onCancelled(@Nonnull DatabaseError databaseError) {
                reactNativeFirebaseDatabaseQuery.removeEventListener(string);
                ReactNativeFirebaseDatabaseQueryModule.this.handleDatabaseEventError(str, readableMap, databaseError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleDatabaseEvent(final String str, final String str2, final ReadableMap readableMap, final DataSnapshot dataSnapshot, @Nullable final String str3) {
        Tasks.call(getTransactionalExecutor(readableMap.getString("eventRegistrationKey")), new Callable() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseQueryModule$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactNativeFirebaseDatabaseQueryModule.lambda$handleDatabaseEvent$0(str2, dataSnapshot, str3);
            }
        }).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseQueryModule$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseDatabaseQueryModule.lambda$handleDatabaseEvent$1(str, str2, readableMap, task);
            }
        });
    }

    static /* synthetic */ WritableMap lambda$handleDatabaseEvent$0(String str, DataSnapshot dataSnapshot, String str2) throws Exception {
        if (str.equals("value")) {
            return ReactNativeFirebaseDatabaseCommon.snapshotToMap(dataSnapshot);
        }
        return ReactNativeFirebaseDatabaseCommon.snapshotWithPreviousChildToMap(dataSnapshot, str2);
    }

    static /* synthetic */ void lambda$handleDatabaseEvent$1(String str, String str2, ReadableMap readableMap, Task task) {
        if (task.isSuccessful()) {
            WritableMap writableMap = (WritableMap) task.getResult();
            WritableMap createMap = Arguments.createMap();
            createMap.putMap("data", writableMap);
            createMap.putString("key", str);
            createMap.putString("eventType", str2);
            createMap.putMap("registration", RCTConvertFirebase.readableMapToWritableMap(readableMap));
            ReactNativeFirebaseEventEmitter.getSharedInstance().sendEvent(new ReactNativeFirebaseDatabaseEvent("database_sync_event", createMap));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleDatabaseEventError(String str, ReadableMap readableMap, DatabaseError databaseError) {
        WritableMap createMap = Arguments.createMap();
        UniversalDatabaseException universalDatabaseException = new UniversalDatabaseException(databaseError.getCode(), databaseError.getMessage(), databaseError.toException());
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString(UniversalFirebaseFunctionsModule.CODE_KEY, universalDatabaseException.getCode());
        createMap2.putString("message", universalDatabaseException.getMessage());
        createMap.putString("key", str);
        createMap.putMap("error", createMap2);
        createMap.putMap("registration", RCTConvertFirebase.readableMapToWritableMap(readableMap));
        ReactNativeFirebaseEventEmitter.getSharedInstance().sendEvent(new ReactNativeFirebaseDatabaseEvent("database_sync_event", createMap));
    }

    @ReactMethod
    public void once(String str, String str2, String str3, ReadableArray readableArray, String str4, Promise promise) {
        DatabaseReference reference = UniversalFirebaseDatabaseCommon.getDatabaseForApp(str, str2).getReference(str3);
        if (str4.equals("value")) {
            addOnceValueEventListener(getDatabaseQueryInstance(reference, readableArray), promise);
        } else {
            addChildOnceEventListener(str4, getDatabaseQueryInstance(reference, readableArray), promise);
        }
    }

    @ReactMethod
    public void on(String str, String str2, ReadableMap readableMap) {
        String string = readableMap.getString("key");
        ReadableArray array = readableMap.getArray("modifiers");
        String str3 = (String) Objects.requireNonNull(readableMap.getString("path"));
        String str4 = (String) Objects.requireNonNull(readableMap.getString("eventType"));
        ReadableMap readableMap2 = (ReadableMap) Objects.requireNonNull(readableMap.getMap("registration"));
        DatabaseReference reference = UniversalFirebaseDatabaseCommon.getDatabaseForApp(str, str2).getReference(str3);
        if (str4.equals("value")) {
            addValueEventListener(string, getDatabaseQueryInstance(string, reference, array), readableMap2);
        } else {
            addChildEventListener(string, str4, getDatabaseQueryInstance(string, reference, array), readableMap2);
        }
    }

    @ReactMethod
    public void off(String str, String str2) {
        ReactNativeFirebaseDatabaseQuery reactNativeFirebaseDatabaseQuery = this.queryMap.get(str);
        if (reactNativeFirebaseDatabaseQuery != null) {
            reactNativeFirebaseDatabaseQuery.removeEventListener(str2);
            removeEventListeningExecutor(str2);
            if (reactNativeFirebaseDatabaseQuery.hasListeners().booleanValue()) {
                return;
            }
            this.queryMap.remove(str);
        }
    }

    @ReactMethod
    public void keepSynced(String str, String str2, String str3, String str4, ReadableArray readableArray, Boolean bool, Promise promise) {
        getDatabaseQueryInstance(str3, UniversalFirebaseDatabaseCommon.getDatabaseForApp(str, str2).getReference(str4), readableArray).query.keepSynced(bool.booleanValue());
        promise.resolve(null);
    }
}
