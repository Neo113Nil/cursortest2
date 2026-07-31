package io.invertase.firebase.firestore;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.LoadBundleTask;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import io.invertase.firebase.common.ReactNativeFirebaseEventEmitter;
import io.invertase.firebase.common.UniversalFirebaseModule;
import io.invertase.firebase.common.UniversalFirebasePreferences;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public class UniversalFirebaseFirestoreModule extends UniversalFirebaseModule {
    private static SparseArray<ListenerRegistration> onSnapshotInSyncListeners = new SparseArray<>();
    private static HashMap<String, String> emulatorConfigs = new HashMap<>();

    UniversalFirebaseFirestoreModule(Context context, String str) {
        super(context, str);
    }

    void addSnapshotsInSync(final String str, final String str2, final int i) {
        onSnapshotInSyncListeners.put(i, UniversalFirebaseFirestoreCommon.getFirestoreForApp(str, str2).addSnapshotsInSyncListener(new Runnable() { // from class: io.invertase.firebase.firestore.UniversalFirebaseFirestoreModule$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ReactNativeFirebaseEventEmitter.getSharedInstance().sendEvent(new ReactNativeFirebaseFirestoreEvent("firestore_snapshots_in_sync_event", Arguments.createMap(), str, str2, i));
            }
        }));
    }

    void removeSnapshotsInSync(String str, String str2, int i) {
        ListenerRegistration listenerRegistration = onSnapshotInSyncListeners.get(i);
        if (listenerRegistration != null) {
            listenerRegistration.remove();
            onSnapshotInSyncListeners.remove(i);
        }
    }

    Task<Void> disableNetwork(String str, String str2) {
        return UniversalFirebaseFirestoreCommon.getFirestoreForApp(str, str2).disableNetwork();
    }

    Task<Void> enableNetwork(String str, String str2) {
        return UniversalFirebaseFirestoreCommon.getFirestoreForApp(str, str2).enableNetwork();
    }

    Task<Void> useEmulator(final String str, final String str2, final String str3, final int i) {
        return Tasks.call(getExecutor(), new Callable() { // from class: io.invertase.firebase.firestore.UniversalFirebaseFirestoreModule$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UniversalFirebaseFirestoreModule.lambda$useEmulator$1(str, str2, str3, i);
            }
        });
    }

    static /* synthetic */ Void lambda$useEmulator$1(String str, String str2, String str3, int i) throws Exception {
        String createFirestoreKey = UniversalFirebaseFirestoreCommon.createFirestoreKey(str, str2);
        if (emulatorConfigs.get(createFirestoreKey) != null) {
            return null;
        }
        emulatorConfigs.put(createFirestoreKey, "true");
        UniversalFirebaseFirestoreCommon.getFirestoreForApp(str, str2).useEmulator(str3, i);
        return null;
    }

    Task<Void> settings(final String str, final Map<String, Object> map) {
        return Tasks.call(getExecutor(), new Callable() { // from class: io.invertase.firebase.firestore.UniversalFirebaseFirestoreModule$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UniversalFirebaseFirestoreModule.lambda$settings$2(map, str);
            }
        });
    }

    static /* synthetic */ Void lambda$settings$2(Map map, String str) throws Exception {
        if (map.containsKey("cacheSizeBytes")) {
            UniversalFirebasePreferences.getSharedInstance().setIntValue(UniversalFirebaseFirestoreStatics.FIRESTORE_CACHE_SIZE + "_" + str, ((Double) Objects.requireNonNull((Double) map.get("cacheSizeBytes"))).intValue());
        }
        if (map.containsKey(DiagnosticsTracker.HOST_KEY)) {
            UniversalFirebasePreferences.getSharedInstance().setStringValue(UniversalFirebaseFirestoreStatics.FIRESTORE_HOST + "_" + str, (String) map.get(DiagnosticsTracker.HOST_KEY));
        }
        if (map.containsKey("persistence")) {
            UniversalFirebasePreferences.getSharedInstance().setBooleanValue(UniversalFirebaseFirestoreStatics.FIRESTORE_PERSISTENCE + "_" + str, ((Boolean) map.get("persistence")).booleanValue());
        }
        if (map.containsKey("ssl")) {
            UniversalFirebasePreferences.getSharedInstance().setBooleanValue(UniversalFirebaseFirestoreStatics.FIRESTORE_SSL + "_" + str, ((Boolean) map.get("ssl")).booleanValue());
        }
        if (!map.containsKey("serverTimestampBehavior")) {
            return null;
        }
        UniversalFirebasePreferences.getSharedInstance().setStringValue(UniversalFirebaseFirestoreStatics.FIRESTORE_SERVER_TIMESTAMP_BEHAVIOR + "_" + str, (String) map.get("serverTimestampBehavior"));
        return null;
    }

    LoadBundleTask loadBundle(String str, String str2, String str3) {
        return UniversalFirebaseFirestoreCommon.getFirestoreForApp(str, str2).loadBundle(str3.getBytes(StandardCharsets.UTF_8));
    }

    Task<Void> clearPersistence(String str, String str2) {
        return UniversalFirebaseFirestoreCommon.getFirestoreForApp(str, str2).clearPersistence();
    }

    Task<Void> waitForPendingWrites(String str, String str2) {
        return UniversalFirebaseFirestoreCommon.getFirestoreForApp(str, str2).waitForPendingWrites();
    }

    Task<Void> terminate(String str, String str2) {
        FirebaseFirestore firestoreForApp = UniversalFirebaseFirestoreCommon.getFirestoreForApp(str, str2);
        String createFirestoreKey = UniversalFirebaseFirestoreCommon.createFirestoreKey(str, str2);
        if (UniversalFirebaseFirestoreCommon.instanceCache.get(createFirestoreKey) != null) {
            UniversalFirebaseFirestoreCommon.instanceCache.get(createFirestoreKey).clear();
            UniversalFirebaseFirestoreCommon.instanceCache.remove(createFirestoreKey);
        }
        return firestoreForApp.terminate();
    }
}
