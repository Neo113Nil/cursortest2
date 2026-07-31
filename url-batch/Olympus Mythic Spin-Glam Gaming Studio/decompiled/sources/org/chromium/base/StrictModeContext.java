package org.chromium.base;

import android.os.StrictMode;
import internal.org.chromium.build.BuildConfig;
import java.io.Closeable;

/* loaded from: classes13.dex */
public class StrictModeContext implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    private static class Impl extends StrictModeContext {
        private final StrictMode.ThreadPolicy mThreadPolicy;
        private final StrictMode.VmPolicy mVmPolicy;

        private Impl(StrictMode.ThreadPolicy threadPolicy, StrictMode.VmPolicy vmPolicy) {
            this.mThreadPolicy = threadPolicy;
            this.mVmPolicy = vmPolicy;
        }

        private Impl(StrictMode.ThreadPolicy threadPolicy) {
            this(threadPolicy, (StrictMode.VmPolicy) null);
        }

        private Impl(StrictMode.VmPolicy vmPolicy) {
            this((StrictMode.ThreadPolicy) null, vmPolicy);
        }

        @Override // org.chromium.base.StrictModeContext, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            StrictMode.ThreadPolicy threadPolicy = this.mThreadPolicy;
            if (threadPolicy != null) {
                StrictMode.setThreadPolicy(threadPolicy);
            }
            StrictMode.VmPolicy vmPolicy = this.mVmPolicy;
            if (vmPolicy != null) {
                StrictMode.setVmPolicy(vmPolicy);
            }
            TraceEvent.finishAsync("StrictModeContext", hashCode());
        }
    }

    public static StrictModeContext allowAllVmPolicies() {
        if (BuildConfig.DISABLE_STRICT_MODE_CONTEXT) {
            return new StrictModeContext();
        }
        TraceEvent scoped = TraceEvent.scoped("StrictModeContext.allowAllVmPolicies");
        try {
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
            Impl impl = new Impl(vmPolicy);
            if (scoped != null) {
                scoped.close();
            }
            return impl;
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

    public static StrictModeContext allowDiskWrites() {
        if (BuildConfig.DISABLE_STRICT_MODE_CONTEXT) {
            return new StrictModeContext();
        }
        TraceEvent scoped = TraceEvent.scoped("StrictModeContext.allowDiskWrites");
        try {
            Impl impl = new Impl(StrictMode.allowThreadDiskWrites());
            if (scoped != null) {
                scoped.close();
            }
            return impl;
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

    public static StrictModeContext allowDiskReads() {
        if (BuildConfig.DISABLE_STRICT_MODE_CONTEXT) {
            return new StrictModeContext();
        }
        TraceEvent scoped = TraceEvent.scoped("StrictModeContext.allowDiskReads");
        try {
            Impl impl = new Impl(StrictMode.allowThreadDiskReads());
            if (scoped != null) {
                scoped.close();
            }
            return impl;
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
}
