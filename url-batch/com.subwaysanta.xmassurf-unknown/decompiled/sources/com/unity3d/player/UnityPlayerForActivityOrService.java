package com.unity3d.player;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.view.Surface;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.unity3d.player.a.AbstractC0120t;
import com.unity3d.player.a.C0105d;
import com.unity3d.player.a.C0108g;
import com.unity3d.player.a.C0117p;
import com.unity3d.player.a.EnumC0116o;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class UnityPlayerForActivityOrService extends UnityPlayer {
    private boolean mMainDisplayOverride;
    private com.unity3d.player.a.y mOnHandleFocusListener;
    private boolean mProcessKillRequested;
    private com.unity3d.player.a.r mSoftInput;
    private long mSoftInputTimeoutMilliSeconds;
    private int m_IsNoWindowMode;
    private W m_MainThread;

    private final native boolean nativeDone();

    private final native boolean nativeGetNoWindowMode();

    private final native void nativeMemoryUsageChanged(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeOnApplyWindowInsets(WindowInsets windowInsets);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean nativePause();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeRecreateGfxState(int i, Surface surface);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeReportKeyboardConfigChanged();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeResume();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSendSurfaceChangedEvent();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputArea(int i, int i2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputSelection(int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputString(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetKeyboardIsVisible(boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputCanceled();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputClosed();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputLostFocus();

    final native void nativeConfigurationChanged(Configuration configuration);

    final native void nativeFocusChanged(boolean z);

    final native void nativeOrientationChanged(int i, int i2);

    final native boolean nativeRender();

    public void onTrimMemory(MemoryUsage memoryUsage) {
        if (com.unity3d.player.a.T.e) {
            nativeMemoryUsageChanged(memoryUsage.value);
        }
    }

    public enum SynchronizationTimeout {
        Pause(0),
        SurfaceDetach(1),
        Destroy(2);

        private int m_TimeoutMilliseconds = 2000;
        final int value;

        SynchronizationTimeout(int i) {
            this.value = i;
        }

        public void setTimeout(int i) {
            this.m_TimeoutMilliseconds = i;
        }

        public static void setTimeoutForAll(int i) {
            for (SynchronizationTimeout synchronizationTimeout : (SynchronizationTimeout[]) SynchronizationTimeout.class.getEnumConstants()) {
                synchronizationTimeout.setTimeout(i);
            }
        }

        public int getTimeout() {
            return this.m_TimeoutMilliseconds;
        }
    }

    public enum MemoryUsage {
        Low(1),
        Medium(2),
        High(3),
        Critical(4);

        public final int value;

        MemoryUsage(int i) {
            this.value = i;
        }
    }

    public UnityPlayerForActivityOrService(Context context) {
        this(context, null, "", new C0105d());
    }

    public UnityPlayerForActivityOrService(Context context, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents) {
        this(context, iUnityPlayerLifecycleEvents, "", new C0105d());
    }

    public UnityPlayerForActivityOrService(Context context, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents, String str) {
        this(context, iUnityPlayerLifecycleEvents, str, new C0105d());
    }

    UnityPlayerForActivityOrService(Context context, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents, String str, C0105d c0105d) {
        super(context, EnumC0116o.b, iUnityPlayerLifecycleEvents);
        W w = new W(this);
        this.m_MainThread = w;
        this.mMainDisplayOverride = false;
        C0117p c0117p = null;
        this.mSoftInput = null;
        this.m_IsNoWindowMode = -1;
        this.mProcessKillRequested = true;
        this.mSoftInputTimeoutMilliSeconds = 1000L;
        w.start();
        if (c0105d.a) {
            c0117p = new C0117p(context, this);
            c0117p.setOnApplyWindowInsetsListener(new B0(this));
        }
        initialize(c0117p, str);
        W w2 = this.m_MainThread;
        w2.getClass();
        try {
            w2.b.await();
        } catch (InterruptedException e) {
            AbstractC0120t.Log(6, "UnityMainThread was interrupted:" + e.toString());
        }
    }

    public void setOnHandleFocusListener(com.unity3d.player.a.y yVar) {
        this.mOnHandleFocusListener = yVar;
    }

    @Override // com.unity3d.player.UnityPlayer
    public void configurationChanged(Configuration configuration) {
        super.configurationChanged(configuration);
        if (isNativeInitialized()) {
            invokeOnMainThread(new E0(this, new Configuration(configuration)));
        }
    }

    void sendSurfaceChangedEvent() {
        if (isNativeInitialized()) {
            Message.obtain(this.m_MainThread.c, new F0(this)).sendToTarget();
        }
    }

    void updateGLDisplay(int i, Surface surface) {
        if (this.mMainDisplayOverride) {
            return;
        }
        updateDisplayInternal(i, surface);
    }

    private boolean updateDisplayInternal(int i, Surface surface) {
        if (!isNativeInitialized()) {
            return false;
        }
        Semaphore semaphore = new Semaphore(0);
        G0 g0 = new G0(this, i, surface, semaphore);
        boolean isMainWindow = isMainWindow(i);
        if (!isMainWindow) {
            g0.run();
        } else if (surface == null) {
            W w = this.m_MainThread;
            Message.obtain(w.c, 2269, V.d).sendToTarget();
            Message.obtain(w.c, g0).sendToTarget();
        } else {
            W w2 = this.m_MainThread;
            Message.obtain(w2.c, g0).sendToTarget();
            Message.obtain(w2.c, 2269, V.e).sendToTarget();
        }
        if (!isMainWindow || surface != null) {
            return true;
        }
        try {
            SynchronizationTimeout synchronizationTimeout = SynchronizationTimeout.SurfaceDetach;
            if (semaphore.tryAcquire(synchronizationTimeout.getTimeout(), TimeUnit.MILLISECONDS)) {
                return true;
            }
            AbstractC0120t.Log(5, "Timeout (" + synchronizationTimeout.getTimeout() + " ms) while trying detaching primary window.");
            return true;
        } catch (InterruptedException unused) {
            AbstractC0120t.Log(5, "UI thread got interrupted while trying to detach the primary window from the Unity Engine.");
            return true;
        }
    }

    private boolean isMainWindow(int i) {
        return i == nativeGetMainWindowIndex();
    }

    public boolean displayChanged(int i, Surface surface) {
        if (isMainWindow(i) && getFrameLayout() != null) {
            this.mMainDisplayOverride = surface != null;
            runOnUiThread(new H0(this));
        }
        return updateDisplayInternal(i, surface);
    }

    private void raiseFocusListener(boolean z) {
        com.unity3d.player.a.y yVar = this.mOnHandleFocusListener;
        if (yVar != null) {
            RunnableC0155r0 runnableC0155r0 = ((C0151p0) yVar).a;
            runnableC0155r0.b = true;
            if (runnableC0155r0.a) {
                runnableC0155r0.c.release();
            }
        }
    }

    @Override // com.unity3d.player.UnityPlayer
    boolean handleFocus(boolean z) {
        com.unity3d.player.a.r rVar;
        W w;
        V v;
        if (this.mState.d && ((rVar = this.mSoftInput) == null || rVar.isConsumeOutsideTouchesEnabled())) {
            if (z) {
                w = this.m_MainThread;
                v = V.g;
            } else {
                w = this.m_MainThread;
                v = V.f;
            }
            Message.obtain(w.c, 2269, v).sendToTarget();
            raiseFocusListener(z);
            return true;
        }
        raiseFocusListener(z);
        return false;
    }

    @Override // com.unity3d.player.UnityPlayer
    void resumeUnity() {
        super.resumeUnity();
        invokeOnMainThread(new I0(this));
        W w = this.m_MainThread;
        Message.obtain(w.c, 2269, V.b).sendToTarget();
    }

    @Override // com.unity3d.player.UnityPlayer
    void hidePreservedContent() {
        if (getFrameLayout() == null) {
            return;
        }
        runOnUiThread(new J0(this));
    }

    @Override // com.unity3d.player.UnityPlayer
    public void setMainSurfaceViewAspectRatio(float f) {
        if (getFrameLayout() == null) {
            return;
        }
        runOnUiThread(new K0(this, f));
    }

    @Override // com.unity3d.player.UnityPlayer
    public boolean runningOnMainThread() {
        return Thread.currentThread() == this.m_MainThread;
    }

    protected void showSoftInput(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6) {
        Semaphore semaphore = new Semaphore(0);
        postOnUiThread(new M0(this, this, str, i, z, z2, z3, z4, str2, i2, z5, z6, semaphore));
        try {
            if (semaphore.tryAcquire(getSoftInputTimeout(), TimeUnit.MILLISECONDS)) {
                return;
            }
            AbstractC0120t.Log(6, "Timeout (" + getSoftInputTimeout() + " ms) while waiting softinput showing operation.");
        } catch (InterruptedException unused) {
            AbstractC0120t.Log(6, "UI thread got interrupted while waiting softinput showing operation.");
        }
    }

    private long getSoftInputTimeout() {
        return Math.round(this.mSoftInputTimeoutMilliSeconds * Math.max(1.0f, Settings.System.getFloat(this.mContext.getContentResolver(), "animator_duration_scale", 0.0f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissSoftInput() {
        com.unity3d.player.a.r rVar = this.mSoftInput;
        if (rVar != null) {
            rVar.hide();
            nativeReportKeyboardConfigChanged();
        }
    }

    protected void resetSoftInput() {
        this.mSoftInput = null;
    }

    protected void hideSoftInput() {
        if (this.mSoftInput == null) {
            return;
        }
        reportSoftInputArea(new Rect());
        reportSoftInputIsVisible(false);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            dismissSoftInput();
            resetSoftInput();
            return;
        }
        Semaphore semaphore = new Semaphore(0);
        postOnUiThread(new RunnableC0155r0(this, semaphore, this));
        try {
            if (!semaphore.tryAcquire(getSoftInputTimeout(), TimeUnit.MILLISECONDS)) {
                AbstractC0120t.Log(6, "Timeout (" + getSoftInputTimeout() + " ms) while waiting softinput hiding operation.");
            }
        } catch (InterruptedException unused) {
            AbstractC0120t.Log(6, "UI thread got interrupted while waiting softinput hiding operation.");
        } finally {
            this.mSoftInput = null;
        }
    }

    protected void setSoftInputStr(String str) {
        runOnUiThread(new RunnableC0157s0(this, str));
    }

    protected void setCharacterLimit(int i) {
        runOnUiThread(new RunnableC0159t0(this, i));
    }

    protected void setHideInputField(boolean z) {
        runOnUiThread(new RunnableC0161u0(this, z));
    }

    protected void setSelection(int i, int i2) {
        runOnUiThread(new RunnableC0163v0(this, i, i2));
    }

    protected void reportSoftInputStr(String str, int i, boolean z) {
        if (i == 1) {
            hideSoftInput();
        }
        invokeOnMainThread((Runnable) new C0165w0(this, z, str, i));
    }

    protected void reportSoftInputSelection(int i, int i2) {
        invokeOnMainThread((Runnable) new C0167x0(this, i, i2));
    }

    protected void reportSoftInputArea(Rect rect) {
        invokeOnMainThread((Runnable) new C0169y0(this, rect));
    }

    protected void reportSoftInputIsVisible(boolean z) {
        invokeOnMainThread((Runnable) new C0171z0(this, z));
    }

    boolean getHaveAndroidWindowSupport() {
        if (this.m_IsNoWindowMode == -1) {
            this.m_IsNoWindowMode = nativeGetNoWindowMode() ? 1 : 0;
        }
        return this.m_IsNoWindowMode == 1;
    }

    @Override // com.unity3d.player.UnityPlayer
    void cleanupResourcesForDestroy() {
        Message.obtain(this.m_MainThread.c, 2269, V.c).sendToTarget();
        try {
            this.m_MainThread.join(SynchronizationTimeout.Destroy.getTimeout());
        } catch (InterruptedException unused) {
            this.m_MainThread.interrupt();
        }
        if (com.unity3d.player.a.T.e && getFrameLayout() != null) {
            getFrameLayout().removeAllViews();
        }
        if (this.mProcessKillRequested) {
            this.m_UnityPlayerLifecycleEvents.onUnityPlayerQuitted();
            kill();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void queueDestroy() {
        AbstractC0120t.Log(4, "Queue Destroy");
        runOnUiThread(new A0(this));
    }

    @Override // com.unity3d.player.UnityPlayer
    void pauseUnity() {
        Runnable d0;
        super.pauseUnity();
        reportSoftInputStr(null, 1, true);
        com.unity3d.player.a.T t = this.mState;
        t.b = false;
        t.c = true;
        if (com.unity3d.player.a.T.e) {
            Semaphore semaphore = new Semaphore(0);
            if (isFinishing()) {
                d0 = new C0(this, semaphore);
            } else {
                d0 = new D0(this, semaphore);
            }
            W w = this.m_MainThread;
            Message.obtain(w.c, 2269, V.a).sendToTarget();
            Message.obtain(w.c, d0).sendToTarget();
            try {
                SynchronizationTimeout synchronizationTimeout = SynchronizationTimeout.Pause;
                if (!semaphore.tryAcquire(synchronizationTimeout.getTimeout(), TimeUnit.MILLISECONDS)) {
                    AbstractC0120t.Log(5, "Timeout (" + synchronizationTimeout.getTimeout() + " ms) while trying to pause the Unity Engine.");
                }
            } catch (InterruptedException unused) {
                AbstractC0120t.Log(5, "UI thread got interrupted while trying to pause the Unity Engine.");
            }
        }
        if (this.m_AddPhoneCallListener) {
            this.m_TelephonyManager.listen(this.m_PhoneCallListener, 0);
        }
    }

    @Override // com.unity3d.player.UnityPlayer
    void shutdown() {
        this.mProcessKillRequested = nativeDone();
        super.shutdown();
    }

    @Override // com.unity3d.player.UnityPlayer
    void onOrientationChanged(int i, int i2) {
        W w = this.m_MainThread;
        w.h = this.mNaturalOrientation;
        w.i = i2;
        Message.obtain(w.c, 2269, V.i).sendToTarget();
    }

    @Override // com.unity3d.player.UnityPlayer
    public T getView() {
        FrameLayout frameLayout = getFrameLayout();
        if (frameLayout == null) {
            return null;
        }
        return ((C0117p) frameLayout).b;
    }

    @Override // com.unity3d.player.UnityPlayer
    public C0108g getSurfaceView() {
        T view = getView();
        if (view == null) {
            return null;
        }
        return view.a;
    }

    @Override // com.unity3d.player.UnityPlayer
    View getViewForPadding() {
        T view = getView();
        C0108g c0108g = view.a;
        return (c0108g == null || c0108g.a <= 0.0f) ? super.getViewForPadding() : view;
    }
}
