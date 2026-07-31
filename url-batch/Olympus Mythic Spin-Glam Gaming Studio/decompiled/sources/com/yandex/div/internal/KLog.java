package com.yandex.div.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.yandex.div.logging.Severity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KLog.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0086\bJ'\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0086\bJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0086\bJ+\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0086\bJ\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0086\bJ'\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0086\bJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0001J \u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0001J\u000e\u0010\u001b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u001f\u0010\u001c\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0086\bJ'\u0010\u001c\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0086\bJ\u001f\u0010\u001d\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0086\bJ'\u0010\u001d\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0086\bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/yandex/div/internal/KLog;", "", "()V", "listeners", "", "Lcom/yandex/div/internal/LogListener;", "getListeners", "()Ljava/util/List;", "addListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "d", "tag", "", "message", "Lkotlin/Function0;", "th", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "i", "isAtLeast", "", "minLevel", "Lcom/yandex/div/logging/Severity;", "print", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "removeListener", "v", "w", "logging_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class KLog {

    @NotNull
    public static final KLog INSTANCE = new KLog();

    @NotNull
    private static final List<LogListener> listeners = new ArrayList();

    private KLog() {
    }

    @NotNull
    public final List<LogListener> getListeners() {
        return listeners;
    }

    public final void v(@NotNull String tag, @NotNull Function0 message) {
        if (isAtLeast(Severity.VERBOSE)) {
            print(2, tag, (String) message.mo4828invoke());
        }
    }

    public final void v(@NotNull String tag, @NotNull Throwable th, @NotNull Function0 message) {
        if (isAtLeast(Severity.VERBOSE)) {
            android.util.Log.v(tag, (String) message.mo4828invoke(), th);
        }
    }

    public final void d(@NotNull String tag, @NotNull Function0 message) {
        if (isAtLeast(Severity.DEBUG)) {
            print(3, tag, (String) message.mo4828invoke());
        }
    }

    public final void d(@NotNull String tag, @NotNull Throwable th, @NotNull Function0 message) {
        if (isAtLeast(Severity.DEBUG)) {
            android.util.Log.d(tag, (String) message.mo4828invoke(), th);
        }
    }

    public final void w(@NotNull String tag, @NotNull Function0 message) {
        if (isAtLeast(Severity.WARNING)) {
            print(5, tag, (String) message.mo4828invoke());
        }
    }

    public final void w(@NotNull String tag, @NotNull Throwable th, @NotNull Function0 message) {
        if (isAtLeast(Severity.WARNING)) {
            android.util.Log.w(tag, (String) message.mo4828invoke(), th);
        }
    }

    public final void i(@NotNull String tag, @NotNull Function0 message) {
        if (isAtLeast(Severity.INFO)) {
            print(4, tag, (String) message.mo4828invoke());
        }
    }

    public final void i(@NotNull String tag, @NotNull Throwable th, @NotNull Function0 message) {
        if (isAtLeast(Severity.INFO)) {
            android.util.Log.i(tag, (String) message.mo4828invoke(), th);
        }
    }

    public final void e(@NotNull String tag, @NotNull Function0 message) {
        if (isAtLeast(Severity.ERROR)) {
            print(6, tag, (String) message.mo4828invoke());
        }
    }

    public static /* synthetic */ void e$default(KLog kLog, String str, Throwable th, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: com.yandex.div.internal.KLog$e$1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "";
                }
            };
        }
        if (kLog.isAtLeast(Severity.ERROR)) {
            android.util.Log.e(str, (String) function0.mo4828invoke(), th);
        }
    }

    public final void e(@NotNull String tag, @Nullable Throwable th, @NotNull Function0 message) {
        if (isAtLeast(Severity.ERROR)) {
            android.util.Log.e(tag, (String) message.mo4828invoke(), th);
        }
    }

    public final void addListener(@NotNull LogListener listener) {
        List<LogListener> list = listeners;
        synchronized (list) {
            list.add(listener);
        }
    }

    public final void removeListener(@NotNull LogListener listener) {
        List<LogListener> list = listeners;
        synchronized (list) {
            list.remove(listener);
        }
    }

    public final boolean isAtLeast(@NotNull Severity minLevel) {
        return Log.isAtLeast(minLevel);
    }

    public final void print(int priority, @NotNull String tag, @NotNull String message) {
        android.util.Log.println(priority, tag, message);
        List<LogListener> list = listeners;
        synchronized (list) {
            try {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((LogListener) it.next()).onNewMessage(priority, tag, message);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
