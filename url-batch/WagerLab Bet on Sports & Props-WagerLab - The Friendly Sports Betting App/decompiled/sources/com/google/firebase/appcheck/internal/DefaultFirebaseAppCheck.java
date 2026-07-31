package com.google.firebase.appcheck.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseException;
import com.google.firebase.appcheck.AppCheckProvider;
import com.google.firebase.appcheck.AppCheckProviderFactory;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.FirebaseAppCheck;
import com.google.firebase.appcheck.internal.util.Clock;
import com.google.firebase.appcheck.interop.AppCheckTokenListener;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public class DefaultFirebaseAppCheck extends FirebaseAppCheck {
    private static final long BUFFER_TIME_MILLIS = 300000;
    private final List<FirebaseAppCheck.AppCheckListener> appCheckListenerList;
    private AppCheckProvider appCheckProvider;
    private AppCheckProviderFactory appCheckProviderFactory;
    private final List<AppCheckTokenListener> appCheckTokenListenerList;
    private final Executor backgroundExecutor;
    private AppCheckToken cachedToken;
    private Task<AppCheckToken> cachedTokenTask;
    private final Clock clock;
    private final FirebaseApp firebaseApp;
    private final Provider<HeartBeatController> heartbeatControllerProvider;
    private final Executor liteExecutor;
    private final Task<Void> retrieveStoredTokenTask;
    private final StorageHelper storageHelper;
    private final TokenRefreshManager tokenRefreshManager;
    private final Executor uiExecutor;

    public DefaultFirebaseAppCheck(FirebaseApp firebaseApp, Provider<HeartBeatController> provider, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(provider);
        this.firebaseApp = firebaseApp;
        this.heartbeatControllerProvider = provider;
        this.appCheckTokenListenerList = new ArrayList();
        this.appCheckListenerList = new ArrayList();
        this.storageHelper = new StorageHelper(firebaseApp.getApplicationContext(), firebaseApp.getPersistenceKey());
        this.tokenRefreshManager = new TokenRefreshManager(firebaseApp.getApplicationContext(), this, executor2, scheduledExecutorService);
        this.uiExecutor = executor;
        this.liteExecutor = executor2;
        this.backgroundExecutor = executor3;
        this.retrieveStoredTokenTask = retrieveStoredAppCheckTokenInBackground(executor3);
        this.clock = new Clock.DefaultClock();
    }

    private Task<Void> retrieveStoredAppCheckTokenInBackground(Executor executor) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: com.google.firebase.appcheck.internal.DefaultFirebaseAppCheck$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                DefaultFirebaseAppCheck.this.m10195x441be3b8(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: lambda$retrieveStoredAppCheckTokenInBackground$0$com-google-firebase-appcheck-internal-DefaultFirebaseAppCheck, reason: not valid java name */
    /* synthetic */ void m10195x441be3b8(TaskCompletionSource taskCompletionSource) {
        AppCheckToken retrieveAppCheckToken = this.storageHelper.retrieveAppCheckToken();
        if (retrieveAppCheckToken != null) {
            setCachedToken(retrieveAppCheckToken);
        }
        taskCompletionSource.setResult(null);
    }

    @Override // com.google.firebase.appcheck.FirebaseAppCheck
    public void installAppCheckProviderFactory(AppCheckProviderFactory appCheckProviderFactory) {
        installAppCheckProviderFactory(appCheckProviderFactory, this.firebaseApp.isDataCollectionDefaultEnabled());
    }

    @Override // com.google.firebase.appcheck.FirebaseAppCheck
    public void installAppCheckProviderFactory(AppCheckProviderFactory appCheckProviderFactory, boolean z) {
        Preconditions.checkNotNull(appCheckProviderFactory);
        this.appCheckProviderFactory = appCheckProviderFactory;
        this.appCheckProvider = appCheckProviderFactory.create(this.firebaseApp);
        this.tokenRefreshManager.setIsAutoRefreshEnabled(z);
    }

    public AppCheckProviderFactory getInstalledAppCheckProviderFactory() {
        return this.appCheckProviderFactory;
    }

    @Override // com.google.firebase.appcheck.FirebaseAppCheck
    public void setTokenAutoRefreshEnabled(boolean z) {
        this.tokenRefreshManager.setIsAutoRefreshEnabled(z);
    }

    public void resetAppCheckState() {
        this.appCheckProviderFactory = null;
        this.appCheckProvider = null;
        this.cachedToken = null;
        this.storageHelper.clearSharedPrefs();
    }

    @Override // com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider
    public void addAppCheckTokenListener(AppCheckTokenListener appCheckTokenListener) {
        Preconditions.checkNotNull(appCheckTokenListener);
        this.appCheckTokenListenerList.add(appCheckTokenListener);
        this.tokenRefreshManager.onListenerCountChanged(this.appCheckTokenListenerList.size() + this.appCheckListenerList.size());
        if (hasValidToken()) {
            appCheckTokenListener.onAppCheckTokenChanged(DefaultAppCheckTokenResult.constructFromAppCheckToken(this.cachedToken));
        }
    }

    @Override // com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider
    public void removeAppCheckTokenListener(AppCheckTokenListener appCheckTokenListener) {
        Preconditions.checkNotNull(appCheckTokenListener);
        this.appCheckTokenListenerList.remove(appCheckTokenListener);
        this.tokenRefreshManager.onListenerCountChanged(this.appCheckTokenListenerList.size() + this.appCheckListenerList.size());
    }

    @Override // com.google.firebase.appcheck.FirebaseAppCheck
    public void addAppCheckListener(FirebaseAppCheck.AppCheckListener appCheckListener) {
        Preconditions.checkNotNull(appCheckListener);
        this.appCheckListenerList.add(appCheckListener);
        this.tokenRefreshManager.onListenerCountChanged(this.appCheckTokenListenerList.size() + this.appCheckListenerList.size());
        if (hasValidToken()) {
            appCheckListener.onAppCheckTokenChanged(this.cachedToken);
        }
    }

    @Override // com.google.firebase.appcheck.FirebaseAppCheck
    public void removeAppCheckListener(FirebaseAppCheck.AppCheckListener appCheckListener) {
        Preconditions.checkNotNull(appCheckListener);
        this.appCheckListenerList.remove(appCheckListener);
        this.tokenRefreshManager.onListenerCountChanged(this.appCheckTokenListenerList.size() + this.appCheckListenerList.size());
    }

    @Override // com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider
    public Task<AppCheckTokenResult> getToken(final boolean z) {
        return this.retrieveStoredTokenTask.continueWithTask(this.liteExecutor, new Continuation() { // from class: com.google.firebase.appcheck.internal.DefaultFirebaseAppCheck$$ExternalSyntheticLambda5
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return DefaultFirebaseAppCheck.this.m10194x47a9aab1(z, task);
            }
        });
    }

    /* renamed from: lambda$getToken$2$com-google-firebase-appcheck-internal-DefaultFirebaseAppCheck, reason: not valid java name */
    /* synthetic */ Task m10194x47a9aab1(boolean z, Task task) throws Exception {
        if (!z && hasValidToken()) {
            return Tasks.forResult(DefaultAppCheckTokenResult.constructFromAppCheckToken(this.cachedToken));
        }
        if (this.appCheckProvider == null) {
            return Tasks.forResult(DefaultAppCheckTokenResult.constructFromError(new FirebaseException("No AppCheckProvider installed.")));
        }
        Task<AppCheckToken> task2 = this.cachedTokenTask;
        if (task2 == null || task2.isComplete() || this.cachedTokenTask.isCanceled()) {
            this.cachedTokenTask = fetchTokenFromProvider();
        }
        return this.cachedTokenTask.continueWithTask(this.liteExecutor, new Continuation() { // from class: com.google.firebase.appcheck.internal.DefaultFirebaseAppCheck$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                return DefaultFirebaseAppCheck.lambda$getToken$1(task3);
            }
        });
    }

    static /* synthetic */ Task lambda$getToken$1(Task task) throws Exception {
        if (task.isSuccessful()) {
            return Tasks.forResult(DefaultAppCheckTokenResult.constructFromAppCheckToken((AppCheckToken) task.getResult()));
        }
        return Tasks.forResult(DefaultAppCheckTokenResult.constructFromError(new FirebaseException(task.getException().getMessage(), task.getException())));
    }

    @Override // com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider
    public Task<AppCheckTokenResult> getLimitedUseToken() {
        return getLimitedUseAppCheckToken().continueWithTask(this.liteExecutor, new Continuation() { // from class: com.google.firebase.appcheck.internal.DefaultFirebaseAppCheck$$ExternalSyntheticLambda4
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return DefaultFirebaseAppCheck.lambda$getLimitedUseToken$3(task);
            }
        });
    }

    static /* synthetic */ Task lambda$getLimitedUseToken$3(Task task) throws Exception {
        if (task.isSuccessful()) {
            return Tasks.forResult(DefaultAppCheckTokenResult.constructFromAppCheckToken((AppCheckToken) task.getResult()));
        }
        return Tasks.forResult(DefaultAppCheckTokenResult.constructFromError(new FirebaseException(task.getException().getMessage(), task.getException())));
    }

    @Override // com.google.firebase.appcheck.FirebaseAppCheck
    public Task<AppCheckToken> getAppCheckToken(final boolean z) {
        return this.retrieveStoredTokenTask.continueWithTask(this.liteExecutor, new Continuation() { // from class: com.google.firebase.appcheck.internal.DefaultFirebaseAppCheck$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return DefaultFirebaseAppCheck.this.m10193x96eae50c(z, task);
            }
        });
    }

    /* renamed from: lambda$getAppCheckToken$4$com-google-firebase-appcheck-internal-DefaultFirebaseAppCheck, reason: not valid java name */
    /* synthetic */ Task m10193x96eae50c(boolean z, Task task) throws Exception {
        if (!z && hasValidToken()) {
            return Tasks.forResult(this.cachedToken);
        }
        if (this.appCheckProvider == null) {
            return Tasks.forException(new FirebaseException("No AppCheckProvider installed."));
        }
        Task<AppCheckToken> task2 = this.cachedTokenTask;
        if (task2 == null || task2.isComplete() || this.cachedTokenTask.isCanceled()) {
            this.cachedTokenTask = fetchTokenFromProvider();
        }
        return this.cachedTokenTask;
    }

    @Override // com.google.firebase.appcheck.FirebaseAppCheck
    public Task<AppCheckToken> getLimitedUseAppCheckToken() {
        AppCheckProvider appCheckProvider = this.appCheckProvider;
        if (appCheckProvider == null) {
            return Tasks.forException(new FirebaseException("No AppCheckProvider installed."));
        }
        return appCheckProvider.getToken();
    }

    Task<AppCheckToken> fetchTokenFromProvider() {
        return this.appCheckProvider.getToken().onSuccessTask(this.uiExecutor, new SuccessContinuation() { // from class: com.google.firebase.appcheck.internal.DefaultFirebaseAppCheck$$ExternalSyntheticLambda6
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return DefaultFirebaseAppCheck.this.m10192x5efa4d2b((AppCheckToken) obj);
            }
        });
    }

    /* renamed from: lambda$fetchTokenFromProvider$5$com-google-firebase-appcheck-internal-DefaultFirebaseAppCheck, reason: not valid java name */
    /* synthetic */ Task m10192x5efa4d2b(AppCheckToken appCheckToken) throws Exception {
        updateStoredToken(appCheckToken);
        Iterator<FirebaseAppCheck.AppCheckListener> it = this.appCheckListenerList.iterator();
        while (it.hasNext()) {
            it.next().onAppCheckTokenChanged(appCheckToken);
        }
        DefaultAppCheckTokenResult constructFromAppCheckToken = DefaultAppCheckTokenResult.constructFromAppCheckToken(appCheckToken);
        Iterator<AppCheckTokenListener> it2 = this.appCheckTokenListenerList.iterator();
        while (it2.hasNext()) {
            it2.next().onAppCheckTokenChanged(constructFromAppCheckToken);
        }
        return Tasks.forResult(appCheckToken);
    }

    Provider<HeartBeatController> getHeartbeatControllerProvider() {
        return this.heartbeatControllerProvider;
    }

    void setCachedToken(AppCheckToken appCheckToken) {
        this.cachedToken = appCheckToken;
    }

    private void updateStoredToken(final AppCheckToken appCheckToken) {
        this.backgroundExecutor.execute(new Runnable() { // from class: com.google.firebase.appcheck.internal.DefaultFirebaseAppCheck$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                DefaultFirebaseAppCheck.this.m10196xd2625b25(appCheckToken);
            }
        });
        setCachedToken(appCheckToken);
        this.tokenRefreshManager.maybeScheduleTokenRefresh(appCheckToken);
    }

    /* renamed from: lambda$updateStoredToken$6$com-google-firebase-appcheck-internal-DefaultFirebaseAppCheck, reason: not valid java name */
    /* synthetic */ void m10196xd2625b25(AppCheckToken appCheckToken) {
        this.storageHelper.saveAppCheckToken(appCheckToken);
    }

    private boolean hasValidToken() {
        AppCheckToken appCheckToken = this.cachedToken;
        return appCheckToken != null && appCheckToken.getExpireTimeMillis() - this.clock.currentTimeMillis() > 300000;
    }
}
