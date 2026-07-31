package io.invertase.firebase.database;

import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.MutableData;
import com.google.firebase.database.Transaction;
import io.invertase.firebase.common.ReactNativeFirebaseEventEmitter;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import javax.annotation.Nonnull;

/* loaded from: classes8.dex */
public class ReactNativeFirebaseDatabaseTransactionModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "DatabaseTransaction";
    private static SparseArray<ReactNativeFirebaseDatabaseTransactionHandler> transactionHandlers = new SparseArray<>();

    ReactNativeFirebaseDatabaseTransactionModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
    }

    @ReactMethod
    public void transactionStart(final String str, final String str2, final String str3, final int i, final Boolean bool) {
        AsyncTask.execute(new Runnable() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseTransactionModule$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ReactNativeFirebaseDatabaseTransactionModule.this.lambda$transactionStart$0(str, str2, str3, i, bool);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transactionStart$0(String str, String str2, String str3, int i, Boolean bool) {
        UniversalFirebaseDatabaseCommon.getDatabaseForApp(str, str2).getReference(str3).runTransaction(new AnonymousClass1(i, str, str2), bool.booleanValue());
    }

    /* renamed from: io.invertase.firebase.database.ReactNativeFirebaseDatabaseTransactionModule$1, reason: invalid class name */
    class AnonymousClass1 implements Transaction.Handler {
        final /* synthetic */ String val$app;
        final /* synthetic */ String val$dbURL;
        final /* synthetic */ int val$transactionId;

        AnonymousClass1(int i, String str, String str2) {
            this.val$transactionId = i;
            this.val$app = str;
            this.val$dbURL = str2;
        }

        @Override // com.google.firebase.database.Transaction.Handler
        @Nonnull
        public Transaction.Result doTransaction(@Nonnull MutableData mutableData) {
            ReactNativeFirebaseDatabaseTransactionHandler reactNativeFirebaseDatabaseTransactionHandler = new ReactNativeFirebaseDatabaseTransactionHandler(this.val$transactionId, this.val$app, this.val$dbURL);
            ReactNativeFirebaseDatabaseTransactionModule.transactionHandlers.put(this.val$transactionId, reactNativeFirebaseDatabaseTransactionHandler);
            final WritableMap createUpdateMap = reactNativeFirebaseDatabaseTransactionHandler.createUpdateMap(mutableData);
            final String str = this.val$app;
            final int i = this.val$transactionId;
            AsyncTask.execute(new Runnable() { // from class: io.invertase.firebase.database.ReactNativeFirebaseDatabaseTransactionModule$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ReactNativeFirebaseEventEmitter.getSharedInstance().sendEvent(new ReactNativeFirebaseTransactionEvent("database_transaction_event", WritableMap.this, str, i));
                }
            });
            try {
                reactNativeFirebaseDatabaseTransactionHandler.await();
                if (reactNativeFirebaseDatabaseTransactionHandler.abort) {
                    return Transaction.abort();
                }
                if (reactNativeFirebaseDatabaseTransactionHandler.timeout) {
                    return Transaction.abort();
                }
                mutableData.setValue(reactNativeFirebaseDatabaseTransactionHandler.value);
                return Transaction.success(mutableData);
            } catch (InterruptedException unused) {
                reactNativeFirebaseDatabaseTransactionHandler.interrupted = true;
                return Transaction.abort();
            }
        }

        @Override // com.google.firebase.database.Transaction.Handler
        public void onComplete(DatabaseError databaseError, boolean z, DataSnapshot dataSnapshot) {
            ReactNativeFirebaseEventEmitter.getSharedInstance().sendEvent(new ReactNativeFirebaseTransactionEvent("database_transaction_event", ((ReactNativeFirebaseDatabaseTransactionHandler) ReactNativeFirebaseDatabaseTransactionModule.transactionHandlers.get(this.val$transactionId)).createResultMap(databaseError, z, dataSnapshot), this.val$app, this.val$transactionId));
            ReactNativeFirebaseDatabaseTransactionModule.transactionHandlers.delete(this.val$transactionId);
        }
    }

    @ReactMethod
    public void transactionTryCommit(String str, String str2, int i, ReadableMap readableMap) {
        ReactNativeFirebaseDatabaseTransactionHandler reactNativeFirebaseDatabaseTransactionHandler = transactionHandlers.get(i);
        if (reactNativeFirebaseDatabaseTransactionHandler != null) {
            reactNativeFirebaseDatabaseTransactionHandler.signalUpdateReceived(readableMap);
        }
    }
}
