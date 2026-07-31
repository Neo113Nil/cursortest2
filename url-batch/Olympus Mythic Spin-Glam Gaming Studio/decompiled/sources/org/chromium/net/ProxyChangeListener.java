package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import com.pubmatic.sdk.common.POBCommonConstants;
import internal.org.chromium.build.BuildConfig;
import internal.org.jni_zero.CalledByNative;
import java.util.Locale;
import org.chromium.base.ContextUtils;
import org.chromium.base.Log;
import org.chromium.base.ResettersForTesting;
import org.chromium.base.TraceEvent;
import org.chromium.base.metrics.RecordHistogram;
import org.chromium.net.ProxyChangeListener;

/* loaded from: classes11.dex */
public class ProxyChangeListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ProxyChangeListener";
    private Delegate mDelegate;
    private final Handler mHandler;
    private final Looper mLooper;
    private long mNativePtr;
    private ProxyReceiver mProxyReceiver;
    private BroadcastReceiver mRealProxyReceiver;

    public interface Delegate {
        void proxySettingsChanged();
    }

    interface Natives {
        void proxySettingsChanged(long j);

        void proxySettingsChangedTo(long j, String str, int i, String str2, String[] strArr);
    }

    private static class ProxyConfig {
        public static final ProxyConfig DIRECT = new ProxyConfig("", 0, "", new String[0]);
        public final String[] mExclusionList;
        public final String mHost;
        public final String mPacUrl;
        public final int mPort;

        public ProxyConfig(String str, int i, String str2, String[] strArr) {
            this.mHost = str;
            this.mPort = i;
            this.mPacUrl = str2;
            this.mExclusionList = strArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ProxyConfig fromProxyInfo(ProxyInfo proxyInfo) {
            if (proxyInfo == null) {
                return null;
            }
            String host = proxyInfo.getHost();
            Uri pacFileUrl = proxyInfo.getPacFileUrl();
            if (host == null) {
                host = "";
            }
            return new ProxyConfig(host, proxyInfo.getPort(), Uri.EMPTY.equals(pacFileUrl) ? null : pacFileUrl.toString(), proxyInfo.getExclusionList());
        }

        public String toString() {
            return String.format(Locale.US, "ProxyConfig [mHost=\"%s\", mPort=%d, mPacUrl=%s]", (this.mHost.equals("localhost") || this.mHost.isEmpty()) ? this.mHost : "<redacted>", Integer.valueOf(this.mPort), this.mPacUrl == null ? POBCommonConstants.NULL_VALUE : "\"<redacted>\"");
        }
    }

    private ProxyChangeListener() {
        Looper myLooper = Looper.myLooper();
        this.mLooper = myLooper;
        this.mHandler = new Handler(myLooper);
    }

    public void setDelegateForTesting(Delegate delegate) {
        final Delegate delegate2 = this.mDelegate;
        this.mDelegate = delegate;
        ResettersForTesting.register(new Runnable() { // from class: org.chromium.net.ProxyChangeListener$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ProxyChangeListener.this.lambda$setDelegateForTesting$0(delegate2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDelegateForTesting$0(Delegate delegate) {
        this.mDelegate = delegate;
    }

    @CalledByNative
    public static ProxyChangeListener create() {
        return new ProxyChangeListener();
    }

    @CalledByNative
    public static String getProperty(String str) {
        return System.getProperty(str);
    }

    @CalledByNative
    public void start(long j) {
        TraceEvent scoped = TraceEvent.scoped("ProxyChangeListener.start");
        try {
            assertOnThread();
            this.mNativePtr = j;
            registerBroadcastReceiver();
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @CalledByNative
    public void stop() {
        assertOnThread();
        this.mNativePtr = 0L;
        unregisterBroadcastReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    class ProxyReceiver extends BroadcastReceiver {
        private ProxyReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            TraceEvent scoped = TraceEvent.scoped("ProxyChangeListener.ProxyReceiver#onReceive");
            try {
                RecordHistogram.recordBooleanHistogram("Net.ProxyChangeListener.ReflectedCall", false);
                if ("android.intent.action.PROXY_CHANGE".equals(intent.getAction())) {
                    ProxyChangeListener.this.runOnThread(new Runnable() { // from class: org.chromium.net.ProxyChangeListener$ProxyReceiver$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ProxyChangeListener.ProxyReceiver.this.lambda$onReceive$0(intent);
                        }
                    });
                }
                if (scoped != null) {
                    scoped.close();
                }
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceive$0(Intent intent) {
            ProxyChangeListener.this.proxySettingsChanged(ProxyChangeListener.extractNewProxy(intent));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ProxyConfig extractNewProxy(Intent intent) {
        TraceEvent scoped = TraceEvent.scoped("ProxyChangeListener#extractNewProxy");
        try {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                if (scoped == null) {
                    return null;
                }
                scoped.close();
                return null;
            }
            ProxyConfig fromProxyInfo = ProxyConfig.fromProxyInfo((ProxyInfo) extras.get("android.intent.extra.PROXY_INFO"));
            if (scoped != null) {
                scoped.close();
            }
            return fromProxyInfo;
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void proxySettingsChanged(ProxyConfig proxyConfig) {
        TraceEvent scoped = TraceEvent.scoped("ProxyChangeListener#proxySettingsChanged");
        try {
            assertOnThread();
            Delegate delegate = this.mDelegate;
            if (delegate != null) {
                delegate.proxySettingsChanged();
            }
            if (this.mNativePtr == 0) {
                if (scoped != null) {
                    scoped.close();
                }
            } else {
                if (proxyConfig != null) {
                    ProxyChangeListenerJni.get().proxySettingsChangedTo(this.mNativePtr, proxyConfig.mHost, proxyConfig.mPort, proxyConfig.mPacUrl, proxyConfig.mExclusionList);
                } else {
                    ProxyChangeListenerJni.get().proxySettingsChanged(this.mNativePtr);
                }
                if (scoped != null) {
                    scoped.close();
                }
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @RequiresApi
    private ProxyConfig getProxyConfig(Intent intent) {
        TraceEvent scoped = TraceEvent.scoped("ProxyChangeListener#getProxyConfig");
        try {
            ProxyConfig fromProxyInfo = ProxyConfig.fromProxyInfo(((ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity")).getDefaultProxy());
            if (fromProxyInfo == null) {
                ProxyConfig proxyConfig = ProxyConfig.DIRECT;
                if (scoped != null) {
                    scoped.close();
                }
                return proxyConfig;
            }
            if (Build.VERSION.SDK_INT < 29 || !fromProxyInfo.mHost.equals("localhost") || fromProxyInfo.mPort != -1) {
                if (scoped != null) {
                    scoped.close();
                }
                return fromProxyInfo;
            }
            ProxyConfig extractNewProxy = extractNewProxy(intent);
            Log.i(TAG, "configFromConnectivityManager = %s, configFromIntent = %s", fromProxyInfo, extractNewProxy);
            if (extractNewProxy == null) {
                if (scoped == null) {
                    return null;
                }
                scoped.close();
                return null;
            }
            ProxyConfig proxyConfig2 = new ProxyConfig(extractNewProxy.mHost, extractNewProxy.mPort, fromProxyInfo.mPacUrl, fromProxyInfo.mExclusionList);
            if (scoped != null) {
                scoped.close();
            }
            return proxyConfig2;
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateProxyConfigFromConnectivityManager$1(Intent intent) {
        proxySettingsChanged(getProxyConfig(intent));
    }

    @RequiresApi
    void updateProxyConfigFromConnectivityManager(final Intent intent) {
        runOnThread(new Runnable() { // from class: org.chromium.net.ProxyChangeListener$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ProxyChangeListener.this.lambda$updateProxyConfigFromConnectivityManager$1(intent);
            }
        });
    }

    private void registerBroadcastReceiver() {
        assertOnThread();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PROXY_CHANGE");
        this.mProxyReceiver = new ProxyReceiver();
        if (!ContextUtils.isSdkSandboxProcess()) {
            ContextUtils.registerNonExportedBroadcastReceiver(ContextUtils.getApplicationContext(), this.mProxyReceiver, new IntentFilter());
        }
        this.mRealProxyReceiver = new ProxyBroadcastReceiver(this);
        ContextUtils.registerProtectedBroadcastReceiver(ContextUtils.getApplicationContext(), this.mRealProxyReceiver, intentFilter);
    }

    private void unregisterBroadcastReceiver() {
        assertOnThread();
        ContextUtils.getApplicationContext().unregisterReceiver(this.mProxyReceiver);
        if (this.mRealProxyReceiver != null) {
            ContextUtils.getApplicationContext().unregisterReceiver(this.mRealProxyReceiver);
        }
        this.mProxyReceiver = null;
        this.mRealProxyReceiver = null;
    }

    private boolean onThread() {
        return this.mLooper == Looper.myLooper();
    }

    private void assertOnThread() {
        if (BuildConfig.ENABLE_ASSERTS && !onThread()) {
            throw new IllegalStateException("Must be called on ProxyChangeListener thread.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnThread(Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(runnable);
        }
    }
}
