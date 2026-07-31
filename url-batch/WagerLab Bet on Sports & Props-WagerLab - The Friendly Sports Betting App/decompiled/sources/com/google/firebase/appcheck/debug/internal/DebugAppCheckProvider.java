package com.google.firebase.appcheck.debug.internal;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.AppCheckProvider;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.debug.InternalDebugSecretProvider;
import com.google.firebase.appcheck.internal.AppCheckTokenResponse;
import com.google.firebase.appcheck.internal.DefaultAppCheckToken;
import com.google.firebase.appcheck.internal.NetworkClient;
import com.google.firebase.appcheck.internal.RetryManager;
import com.google.firebase.inject.Provider;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public class DebugAppCheckProvider implements AppCheckProvider {
    private static final String TAG = "com.google.firebase.appcheck.debug.internal.DebugAppCheckProvider";
    private static final String UTF_8 = "UTF-8";
    private final Executor blockingExecutor;
    private final Task<String> debugSecretTask;
    private final Executor liteExecutor;
    private final NetworkClient networkClient;
    private final RetryManager retryManager;

    public DebugAppCheckProvider(FirebaseApp firebaseApp, Provider<InternalDebugSecretProvider> provider, Executor executor, Executor executor2, Executor executor3) {
        Task<String> forResult;
        Preconditions.checkNotNull(firebaseApp);
        this.networkClient = new NetworkClient(firebaseApp);
        this.liteExecutor = executor;
        this.blockingExecutor = executor3;
        this.retryManager = new RetryManager();
        String debugSecret = provider.get() != null ? provider.get().getDebugSecret() : null;
        if (debugSecret == null) {
            forResult = determineDebugSecret(firebaseApp, executor2);
        } else {
            forResult = Tasks.forResult(debugSecret);
        }
        this.debugSecretTask = forResult;
    }

    DebugAppCheckProvider(String str, NetworkClient networkClient, Executor executor, Executor executor2, RetryManager retryManager) {
        this.networkClient = networkClient;
        this.liteExecutor = executor;
        this.blockingExecutor = executor2;
        this.retryManager = retryManager;
        this.debugSecretTask = Tasks.forResult(str);
    }

    static Task<String> determineDebugSecret(final FirebaseApp firebaseApp, Executor executor) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: com.google.firebase.appcheck.debug.internal.DebugAppCheckProvider$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                DebugAppCheckProvider.lambda$determineDebugSecret$0(FirebaseApp.this, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    static /* synthetic */ void lambda$determineDebugSecret$0(FirebaseApp firebaseApp, TaskCompletionSource taskCompletionSource) {
        StorageHelper storageHelper = new StorageHelper(firebaseApp.getApplicationContext(), firebaseApp.getPersistenceKey());
        String retrieveDebugSecret = storageHelper.retrieveDebugSecret();
        if (retrieveDebugSecret == null) {
            retrieveDebugSecret = UUID.randomUUID().toString();
            storageHelper.saveDebugSecret(retrieveDebugSecret);
        }
        Log.d(TAG, "Enter this debug secret into the allow list in the Firebase Console for your project: " + retrieveDebugSecret);
        taskCompletionSource.setResult(retrieveDebugSecret);
    }

    @Override // com.google.firebase.appcheck.AppCheckProvider
    public Task<AppCheckToken> getToken() {
        return this.debugSecretTask.onSuccessTask(this.liteExecutor, new SuccessContinuation() { // from class: com.google.firebase.appcheck.debug.internal.DebugAppCheckProvider$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return DebugAppCheckProvider.this.m10191xab777867((String) obj);
            }
        }).onSuccessTask(this.liteExecutor, new SuccessContinuation() { // from class: com.google.firebase.appcheck.debug.internal.DebugAppCheckProvider$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task forResult;
                forResult = Tasks.forResult(DefaultAppCheckToken.constructFromAppCheckTokenResponse((AppCheckTokenResponse) obj));
                return forResult;
            }
        });
    }

    /* renamed from: lambda$getToken$2$com-google-firebase-appcheck-debug-internal-DebugAppCheckProvider, reason: not valid java name */
    /* synthetic */ Task m10191xab777867(String str) throws Exception {
        final ExchangeDebugTokenRequest exchangeDebugTokenRequest = new ExchangeDebugTokenRequest(str);
        return Tasks.call(this.blockingExecutor, new Callable() { // from class: com.google.firebase.appcheck.debug.internal.DebugAppCheckProvider$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DebugAppCheckProvider.this.m10190xcfb5fca6(exchangeDebugTokenRequest);
            }
        });
    }

    /* renamed from: lambda$getToken$1$com-google-firebase-appcheck-debug-internal-DebugAppCheckProvider, reason: not valid java name */
    /* synthetic */ AppCheckTokenResponse m10190xcfb5fca6(ExchangeDebugTokenRequest exchangeDebugTokenRequest) throws Exception {
        return this.networkClient.exchangeAttestationForAppCheckToken(exchangeDebugTokenRequest.toJsonString().getBytes("UTF-8"), 2, this.retryManager);
    }
}
