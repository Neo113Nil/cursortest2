package org.chromium.base;

import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import internal.org.jni_zero.CalledByNative;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public class EarlyTraceEvent {
    static List sAsyncEvents;
    private static boolean sCachedBackgroundStartupTracingFlag;
    static List sEvents;
    static volatile int sState;
    static final Object sLock = new Object();
    static final List sActivityStartupEvents = new ArrayList();
    static final List sActivityLaunchCauseEvents = new ArrayList();

    interface Natives {
        void recordEarlyAsyncBeginEvent(String str, long j, long j2);

        void recordEarlyAsyncEndEvent(long j, long j2);

        void recordEarlyBeginEvent(String str, long j, int i, long j2);

        void recordEarlyEndEvent(String str, long j, int i, long j2);

        void recordEarlyToplevelBeginEvent(String str, long j, int i, long j2);

        void recordEarlyToplevelEndEvent(String str, long j, int i, long j2);
    }

    static final class Event {
        final boolean mIsStart;
        final boolean mIsToplevel;
        final String mName;
        final int mThreadId = Process.myTid();
        final long mTimeNanos = System.nanoTime();
        final long mThreadTimeMillis = SystemClock.currentThreadTimeMillis();

        Event(String str, boolean z, boolean z2) {
            this.mIsStart = z;
            this.mIsToplevel = z2;
            this.mName = str;
        }
    }

    static final class AsyncEvent {
        final long mId;
        final boolean mIsStart;
        final String mName;
        final long mTimeNanos = System.nanoTime();

        AsyncEvent(String str, long j, boolean z) {
            this.mName = str;
            this.mId = j;
            this.mIsStart = z;
        }
    }

    static void disable() {
        synchronized (sLock) {
            try {
                if (enabled()) {
                    if (!sEvents.isEmpty()) {
                        dumpEvents(sEvents);
                        sEvents.clear();
                    }
                    if (!sAsyncEvents.isEmpty()) {
                        dumpAsyncEvents(sAsyncEvents);
                        sAsyncEvents.clear();
                    }
                    sState = 2;
                    sEvents = null;
                    sAsyncEvents = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static boolean enabled() {
        return sState == 1;
    }

    @CalledByNative
    static void setBackgroundStartupTracingFlag(boolean z) {
        StrictModeContext allowDiskWrites = StrictModeContext.allowDiskWrites();
        try {
            ContextUtils.getAppSharedPreferences().edit().putBoolean("bg_startup_tracing", z).apply();
            if (allowDiskWrites != null) {
                allowDiskWrites.close();
            }
        } catch (Throwable th) {
            if (allowDiskWrites != null) {
                try {
                    allowDiskWrites.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @CalledByNative
    public static boolean getBackgroundStartupTracingFlag() {
        return sCachedBackgroundStartupTracingFlag;
    }

    public static void begin(String str, boolean z) {
        if (enabled()) {
            Event event = new Event(str, true, z);
            synchronized (sLock) {
                try {
                    if (enabled()) {
                        sEvents.add(event);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void end(String str, boolean z) {
        if (enabled()) {
            Event event = new Event(str, false, z);
            synchronized (sLock) {
                try {
                    if (enabled()) {
                        sEvents.add(event);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void finishAsync(String str, long j) {
        if (enabled()) {
            AsyncEvent asyncEvent = new AsyncEvent(str, j, false);
            synchronized (sLock) {
                try {
                    if (enabled()) {
                        sAsyncEvents.add(asyncEvent);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static void dumpEvents(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Event event = (Event) it.next();
            if (event.mIsStart) {
                if (event.mIsToplevel) {
                    EarlyTraceEventJni.get().recordEarlyToplevelBeginEvent(event.mName, event.mTimeNanos, event.mThreadId, event.mThreadTimeMillis);
                } else {
                    EarlyTraceEventJni.get().recordEarlyBeginEvent(event.mName, event.mTimeNanos, event.mThreadId, event.mThreadTimeMillis);
                }
            } else if (event.mIsToplevel) {
                EarlyTraceEventJni.get().recordEarlyToplevelEndEvent(event.mName, event.mTimeNanos, event.mThreadId, event.mThreadTimeMillis);
            } else {
                EarlyTraceEventJni.get().recordEarlyEndEvent(event.mName, event.mTimeNanos, event.mThreadId, event.mThreadTimeMillis);
            }
        }
    }

    private static void dumpAsyncEvents(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AsyncEvent asyncEvent = (AsyncEvent) it.next();
            if (asyncEvent.mIsStart) {
                EarlyTraceEventJni.get().recordEarlyAsyncBeginEvent(asyncEvent.mName, asyncEvent.mId, asyncEvent.mTimeNanos);
            } else {
                EarlyTraceEventJni.get().recordEarlyAsyncEndEvent(asyncEvent.mId, asyncEvent.mTimeNanos);
            }
        }
    }

    public static void dumpActivityStartupEvents() {
        synchronized (sLock) {
            try {
                List list = sActivityStartupEvents;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                        TraceEventJni.get();
                        throw null;
                    }
                    list.clear();
                }
                List list2 = sActivityLaunchCauseEvents;
                if (!list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    if (it2.hasNext()) {
                        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(it2.next());
                        TraceEventJni.get();
                        throw null;
                    }
                    list2.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
