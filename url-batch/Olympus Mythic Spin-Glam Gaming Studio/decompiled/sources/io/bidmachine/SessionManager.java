package io.bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.bidmachine.core.Logger;
import io.bidmachine.core.TimeManager;
import io.bidmachine.core.Utils;
import io.bidmachine.internal.Q;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes14.dex */
public class SessionManager {

    @NonNull
    public static final String SESSION_ID_EMPTY = "";

    @NonNull
    private static final String TAG = "SessionManager";

    @Nullable
    private static volatile SessionManager instance;

    @Nullable
    private volatile Context applicationContext;
    private long pauseTime;
    private long resumeTime;
    private long sessionResetAfterSec;
    private long sessionStartTime;

    @NonNull
    private final Q versionManager = new Q();

    @NonNull
    private final SessionManagerKtWrapper sessionManagerKtWrapper = new SessionManagerKtWrapper(this);

    @NonNull
    private String sessionId = "";

    @NonNull
    private final CopyOnWriteArraySet<Observer> observers = new CopyOnWriteArraySet<>();

    public interface Observer {
        void onSessionEvent(@NonNull Status status);
    }

    public enum Status {
        START,
        RESUME,
        PAUSE
    }

    private SessionManager() {
        startNewSession();
    }

    @NonNull
    static SessionManager get() {
        SessionManager sessionManager = instance;
        if (sessionManager == null) {
            synchronized (SessionManager.class) {
                try {
                    sessionManager = instance;
                    if (sessionManager == null) {
                        sessionManager = new SessionManager();
                        instance = sessionManager;
                    }
                } finally {
                }
            }
        }
        return sessionManager;
    }

    private long getLastSessionDurationMs() {
        Context context = this.applicationContext;
        if (context != null) {
            return n.r(context);
        }
        Logger.w(TAG, "Context not attached");
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNewSessionStarted$0(Context context) {
        this.versionManager.c(context, this.sessionManagerKtWrapper);
        n.A(context);
        n.a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSessionPaused$1(Context context) {
        this.versionManager.b(context, this.sessionManagerKtWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveCurrentSessionDuration$2(Context context) {
        n.c(context, getSessionDurationMs());
    }

    private void notifyObservers(@NonNull Status status) {
        Iterator<Observer> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().onSessionEvent(status);
        }
    }

    private void onContextAttached() {
        onNewSessionStarted();
    }

    private void onNewSessionStarted() {
        Utils.ifNotNull(this.applicationContext, new Executable() { // from class: io.bidmachine.SessionManager$$ExternalSyntheticLambda0
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                SessionManager.this.lambda$onNewSessionStarted$0((Context) obj);
            }
        });
        notifyObservers(Status.START);
        Logger.d(TAG, "New session started");
    }

    private void onSessionPaused() {
        Utils.ifNotNull(this.applicationContext, new Executable() { // from class: io.bidmachine.SessionManager$$ExternalSyntheticLambda2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                SessionManager.this.lambda$onSessionPaused$1((Context) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveCurrentSessionDuration(@NonNull final Context context) {
        Utils.onBackgroundThread(new Runnable() { // from class: io.bidmachine.SessionManager$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                SessionManager.this.lambda$saveCurrentSessionDuration$2(context);
            }
        });
    }

    void addObserver(@NonNull Observer observer) {
        this.observers.add(observer);
    }

    synchronized void attachContext(@NonNull Context context) {
        boolean z = this.applicationContext == null;
        this.applicationContext = context.getApplicationContext();
        if (z) {
            onContextAttached();
        }
    }

    int getLastSessionDurationSec() {
        return (int) (getLastSessionDurationMs() / 1000);
    }

    @WorkerThread
    int getSessionCount() {
        Context context = this.applicationContext;
        if (context != null) {
            return n.u(context);
        }
        Logger.w(TAG, "Context not attached");
        return 0;
    }

    long getSessionDurationMs() {
        if (this.resumeTime == 0) {
            return 0L;
        }
        return TimeManager.currentTimeMillis() - this.sessionStartTime;
    }

    int getSessionDurationSec() {
        return (int) (getSessionDurationMs() / 1000);
    }

    @NonNull
    String getSessionId() {
        return this.sessionId;
    }

    long getSessionStartTime() {
        return this.sessionStartTime;
    }

    void pause() {
        if (this.resumeTime == 0) {
            return;
        }
        this.pauseTime = TimeManager.currentTimeMillis();
        onSessionPaused();
        notifyObservers(Status.PAUSE);
        Utils.ifNotNull(this.applicationContext, new Executable() { // from class: io.bidmachine.SessionManager$$ExternalSyntheticLambda1
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                SessionManager.this.saveCurrentSessionDuration((Context) obj);
            }
        });
        Logger.d(TAG, "Session paused: " + getSessionDurationSec() + " sec.");
    }

    void removeObserver(@NonNull Observer observer) {
        this.observers.remove(observer);
    }

    void resume() {
        long currentTimeMillis = TimeManager.currentTimeMillis();
        long j = this.sessionResetAfterSec;
        if (j > 0) {
            long j2 = this.pauseTime;
            if (j2 > 0 && currentTimeMillis - j2 >= j * 1000) {
                startNewSession();
                this.resumeTime = currentTimeMillis;
            }
        }
        notifyObservers(Status.RESUME);
        Logger.d(TAG, "Session resumed");
        this.resumeTime = currentTimeMillis;
    }

    void setSessionResetAfter(long j) {
        this.sessionResetAfterSec = j;
    }

    @VisibleForTesting
    void startNewSession() {
        this.sessionId = UUID.randomUUID().toString();
        this.sessionStartTime = TimeManager.currentTimeMillis();
        this.pauseTime = 0L;
        this.resumeTime = 0L;
        onNewSessionStarted();
    }
}
