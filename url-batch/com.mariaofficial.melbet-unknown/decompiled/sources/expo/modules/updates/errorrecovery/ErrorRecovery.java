package expo.modules.updates.errorrecovery;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.react.bridge.DefaultJSExceptionHandler;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.devsupport.ReleaseDevSupportManager;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import expo.modules.updates.errorrecovery.ErrorRecoveryDelegate;
import expo.modules.updates.logging.UpdatesErrorCode;
import expo.modules.updates.logging.UpdatesLogger;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorRecovery.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 42\u00020\u0001:\u00014B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0014J\u0019\u0010\u001e\u001a\u00020\u00192\n\u0010\u001f\u001a\u00060 j\u0002`!H\u0000¢\u0006\u0002\b\"J\u000e\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%J\u0019\u0010&\u001a\u00020\u00192\n\u0010\u001f\u001a\u00060 j\u0002`!H\u0000¢\u0006\u0002\b'J\r\u0010(\u001a\u00020\u0019H\u0000¢\u0006\u0002\b)J\b\u0010,\u001a\u00020\u0019H\u0002J\b\u0010-\u001a\u00020\u0019H\u0002J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0014H\u0002J\b\u0010/\u001a\u00020\u0019H\u0002J\u0010\u00100\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0014H\u0002J\b\u00101\u001a\u00020\u0019H\u0002J\b\u00102\u001a\u00020\u0019H\u0002J\b\u00103\u001a\u00020\u0019H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lexpo/modules/updates/errorrecovery/ErrorRecovery;", "", "logger", "Lexpo/modules/updates/logging/UpdatesLogger;", "enableBridgelessArchitecture", "", "<init>", "(Lexpo/modules/updates/logging/UpdatesLogger;Z)V", "handlerThread", "Landroid/os/HandlerThread;", "getHandlerThread$expo_updates_release", "()Landroid/os/HandlerThread;", "handler", "Landroid/os/Handler;", "getHandler$expo_updates_release", "()Landroid/os/Handler;", "setHandler$expo_updates_release", "(Landroid/os/Handler;)V", "weakDevSupportManager", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "previousExceptionHandler", "Lcom/facebook/react/bridge/DefaultJSExceptionHandler;", "shouldHandleReactInstanceException", "initialize", "", "delegate", "Lexpo/modules/updates/errorrecovery/ErrorRecoveryDelegate;", "startMonitoring", "devSupportManager", "onReactInstanceException", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onReactInstanceException$expo_updates_release", "notifyNewRemoteLoadStatus", "newStatus", "Lexpo/modules/updates/errorrecovery/ErrorRecoveryDelegate$RemoteLoadStatus;", "handleException", "handleException$expo_updates_release", "handleContentAppeared", "handleContentAppeared$expo_updates_release", "contentAppearedListener", "Lcom/facebook/react/bridge/ReactMarker$MarkerListener;", "registerContentAppearedListener", "unregisterContentAppearedListener", "registerErrorHandler", "registerErrorHandlerImplBridgeless", "registerErrorHandlerImplBridge", "unregisterErrorHandler", "unregisterErrorHandlerImplBridgeless", "unregisterErrorHandlerImplBridge", "Companion", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ErrorRecovery {
    private static final String TAG = "ErrorRecovery";
    private final ReactMarker.MarkerListener contentAppearedListener;
    private final boolean enableBridgelessArchitecture;
    public Handler handler;
    private final HandlerThread handlerThread;
    private final UpdatesLogger logger;
    private DefaultJSExceptionHandler previousExceptionHandler;
    private boolean shouldHandleReactInstanceException;
    private WeakReference<DevSupportManager> weakDevSupportManager;

    public ErrorRecovery(UpdatesLogger logger, boolean z) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        this.enableBridgelessArchitecture = z;
        this.handlerThread = new HandlerThread("expo-updates-error-recovery");
        this.contentAppearedListener = new ReactMarker.MarkerListener() { // from class: expo.modules.updates.errorrecovery.ErrorRecovery$$ExternalSyntheticLambda0
            @Override // com.facebook.react.bridge.ReactMarker.MarkerListener
            public final void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i) {
                ErrorRecovery.contentAppearedListener$lambda$1(ErrorRecovery.this, reactMarkerConstants, str, i);
            }
        };
    }

    public /* synthetic */ ErrorRecovery(UpdatesLogger updatesLogger, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(updatesLogger, (i & 2) != 0 ? true : z);
    }

    /* renamed from: getHandlerThread$expo_updates_release, reason: from getter */
    public final HandlerThread getHandlerThread() {
        return this.handlerThread;
    }

    public final Handler getHandler$expo_updates_release() {
        Handler handler = this.handler;
        if (handler != null) {
            return handler;
        }
        Intrinsics.throwUninitializedPropertyAccessException("handler");
        return null;
    }

    public final void setHandler$expo_updates_release(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<set-?>");
        this.handler = handler;
    }

    public final void initialize(ErrorRecoveryDelegate delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        if (this.handler == null) {
            this.handlerThread.start();
            Looper looper = this.handlerThread.getLooper();
            Intrinsics.checkNotNullExpressionValue(looper, "getLooper(...)");
            setHandler$expo_updates_release(new ErrorRecoveryHandler(looper, delegate, this.logger));
        }
    }

    public final void startMonitoring(DevSupportManager devSupportManager) {
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
        registerContentAppearedListener();
        registerErrorHandler(devSupportManager);
    }

    public final void onReactInstanceException$expo_updates_release(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (this.shouldHandleReactInstanceException) {
            handleException$expo_updates_release(exception);
        }
    }

    public final void notifyNewRemoteLoadStatus(ErrorRecoveryDelegate.RemoteLoadStatus newStatus) {
        Intrinsics.checkNotNullParameter(newStatus, "newStatus");
        UpdatesLogger.info$default(this.logger, "ErrorRecovery: remote load status changed: " + newStatus, null, 2, null);
        getHandler$expo_updates_release().sendMessage(getHandler$expo_updates_release().obtainMessage(2, newStatus));
    }

    public final void handleException$expo_updates_release(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.logger.error("ErrorRecovery: exception encountered: " + exception.getLocalizedMessage(), exception, UpdatesErrorCode.Unknown);
        getHandler$expo_updates_release().sendMessage(getHandler$expo_updates_release().obtainMessage(0, exception));
    }

    public final void handleContentAppeared$expo_updates_release() {
        getHandler$expo_updates_release().sendMessage(getHandler$expo_updates_release().obtainMessage(1));
        unregisterContentAppearedListener();
        getHandler$expo_updates_release().postDelayed(new Runnable() { // from class: expo.modules.updates.errorrecovery.ErrorRecovery$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ErrorRecovery.this.unregisterErrorHandler();
            }
        }, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void contentAppearedListener$lambda$1(ErrorRecovery errorRecovery, ReactMarkerConstants name, String str, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name == ReactMarkerConstants.CONTENT_APPEARED) {
            errorRecovery.handleContentAppeared$expo_updates_release();
        }
    }

    private final void registerContentAppearedListener() {
        ReactMarker.addListener(this.contentAppearedListener);
    }

    private final void unregisterContentAppearedListener() {
        ReactMarker.removeListener(this.contentAppearedListener);
    }

    private final void registerErrorHandler(DevSupportManager devSupportManager) {
        if (this.enableBridgelessArchitecture) {
            registerErrorHandlerImplBridgeless();
        } else {
            registerErrorHandlerImplBridge(devSupportManager);
        }
    }

    private final void registerErrorHandlerImplBridgeless() {
        this.shouldHandleReactInstanceException = true;
    }

    private final void registerErrorHandlerImplBridge(DevSupportManager devSupportManager) {
        if (!(devSupportManager instanceof ReleaseDevSupportManager)) {
            UpdatesLogger.debug$default(this.logger, "Unexpected type of ReactInstanceManager.DevSupportManager. expo-updates error recovery will not behave properly.", null, 2, null);
            return;
        }
        JSExceptionHandler jSExceptionHandler = new JSExceptionHandler() { // from class: expo.modules.updates.errorrecovery.ErrorRecovery$$ExternalSyntheticLambda1
            @Override // com.facebook.react.bridge.JSExceptionHandler
            public final void handleException(Exception exc) {
                ErrorRecovery.registerErrorHandlerImplBridge$lambda$2(ErrorRecovery.this, exc);
            }
        };
        Field declaredField = devSupportManager.getClass().getDeclaredField("defaultJSExceptionHandler");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(devSupportManager);
        declaredField.set(devSupportManager, jSExceptionHandler);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.facebook.react.bridge.DefaultJSExceptionHandler");
        this.previousExceptionHandler = (DefaultJSExceptionHandler) obj;
        this.weakDevSupportManager = new WeakReference<>(devSupportManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerErrorHandlerImplBridge$lambda$2(ErrorRecovery errorRecovery, Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        errorRecovery.handleException$expo_updates_release(e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterErrorHandler() {
        if (this.enableBridgelessArchitecture) {
            unregisterErrorHandlerImplBridgeless();
        } else {
            unregisterErrorHandlerImplBridge();
        }
    }

    private final void unregisterErrorHandlerImplBridgeless() {
        this.shouldHandleReactInstanceException = false;
    }

    private final void unregisterErrorHandlerImplBridge() {
        DevSupportManager devSupportManager;
        WeakReference<DevSupportManager> weakReference = this.weakDevSupportManager;
        if (weakReference != null && (devSupportManager = weakReference.get()) != null) {
            if (!(devSupportManager instanceof ReleaseDevSupportManager)) {
                UpdatesLogger.debug$default(this.logger, "Unexpected type of ReactInstanceManager.DevSupportManager. expo-updates could not unregister its error handler", null, 2, null);
                return;
            } else {
                if (this.previousExceptionHandler == null) {
                    return;
                }
                Field declaredField = devSupportManager.getClass().getDeclaredField("defaultJSExceptionHandler");
                declaredField.setAccessible(true);
                declaredField.set(devSupportManager, this.previousExceptionHandler);
                this.weakDevSupportManager = null;
            }
        }
        getHandler$expo_updates_release().postDelayed(new Runnable() { // from class: expo.modules.updates.errorrecovery.ErrorRecovery$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                ErrorRecovery.unregisterErrorHandlerImplBridge$lambda$6(ErrorRecovery.this);
            }
        }, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterErrorHandlerImplBridge$lambda$6(ErrorRecovery errorRecovery) {
        errorRecovery.handlerThread.quitSafely();
    }
}
