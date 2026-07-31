package io.invertase.firebase.database;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.MutableData;
import io.intercom.android.sdk.NotificationStatuses;
import io.invertase.firebase.common.RCTConvertFirebase;
import io.invertase.firebase.functions.UniversalFirebaseFunctionsModule;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;

/* loaded from: classes8.dex */
public class ReactNativeFirebaseDatabaseTransactionHandler {
    private String appName;
    private final Condition condition;
    private Map<String, Object> data;
    private String dbURL;
    boolean interrupted;
    private final ReentrantLock lock;
    private boolean signalled;
    private int transactionId;
    public Object value;
    boolean abort = false;
    boolean timeout = false;

    ReactNativeFirebaseDatabaseTransactionHandler(int i, String str, String str2) {
        this.appName = str;
        this.dbURL = str2;
        this.transactionId = i;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
    }

    void signalUpdateReceived(ReadableMap readableMap) {
        Map<String, Object> hashMap = RCTConvertFirebase.toHashMap(readableMap);
        this.lock.lock();
        this.value = hashMap.get("value");
        this.abort = ((Boolean) hashMap.get("abort")).booleanValue();
        try {
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
        if (this.signalled) {
            throw new IllegalStateException("This transactionUpdateHandler has already been signalled.");
        }
        this.signalled = true;
        this.data = hashMap;
        this.condition.signalAll();
        this.lock.unlock();
    }

    void await() throws InterruptedException {
        boolean z;
        this.lock.lock();
        this.signalled = false;
        long currentTimeMillis = System.currentTimeMillis() + 5000;
        while (!this.timeout && !this.condition.await(250L, TimeUnit.MILLISECONDS) && !(z = this.signalled)) {
            try {
                if (!z && System.currentTimeMillis() > currentTimeMillis) {
                    this.timeout = true;
                }
            } finally {
                this.lock.unlock();
            }
        }
    }

    Map<String, Object> getUpdates() {
        return this.data;
    }

    WritableMap createUpdateMap(MutableData mutableData) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("type", "update");
        if (!mutableData.hasChildren()) {
            RCTConvertFirebase.mapPutValue("value", mutableData.getValue(), createMap);
            return createMap;
        }
        Object castValue = ReactNativeFirebaseDatabaseCommon.castValue(mutableData);
        if (castValue instanceof WritableNativeArray) {
            createMap.putArray("value", (WritableArray) castValue);
            return createMap;
        }
        createMap.putMap("value", (WritableMap) castValue);
        return createMap;
    }

    WritableMap createResultMap(@Nullable DatabaseError databaseError, boolean z, DataSnapshot dataSnapshot) {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("timeout", this.timeout);
        createMap.putBoolean("committed", z);
        createMap.putBoolean("interrupted", this.interrupted);
        if (databaseError != null || this.timeout || this.interrupted) {
            createMap.putString("type", "error");
            if (databaseError != null) {
                UniversalDatabaseException universalDatabaseException = new UniversalDatabaseException(databaseError.getCode(), databaseError.getMessage(), databaseError.toException());
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putString(UniversalFirebaseFunctionsModule.CODE_KEY, universalDatabaseException.getCode());
                createMap2.putString("message", universalDatabaseException.getMessage());
                createMap.putMap("error", createMap2);
            }
            if (databaseError == null && this.timeout) {
                WritableMap createMap3 = Arguments.createMap();
                createMap3.putString(UniversalFirebaseFunctionsModule.CODE_KEY, "database/internal-timeout");
                createMap3.putString("message", "A timeout occurred whilst waiting for React Native JavaScript thread to send transaction updates.");
                createMap.putMap("error", createMap3);
            }
            return createMap;
        }
        createMap.putString("type", NotificationStatuses.COMPLETE_STATUS);
        createMap.putMap("snapshot", ReactNativeFirebaseDatabaseCommon.snapshotToMap(dataSnapshot));
        return createMap;
    }
}
