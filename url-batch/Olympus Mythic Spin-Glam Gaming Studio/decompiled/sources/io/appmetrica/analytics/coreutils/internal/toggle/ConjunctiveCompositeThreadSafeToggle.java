package io.appmetrica.analytics.coreutils.internal.toggle;

import androidx.annotation.VisibleForTesting;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0001\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u001f\b\u0016\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\"\u0010\u0011\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/toggle/ConjunctiveCompositeThreadSafeToggle;", "Lio/appmetrica/analytics/coreapi/internal/control/Toggle;", "Lio/appmetrica/analytics/coreapi/internal/control/ToggleObserver;", "toggleObserver", "", "sticky", "", "registerObserver", "removeObserver", "", "toString", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Z", "getActualState", "()Z", "setActualState", "(Z)V", "actualState", "", "toggles", "tagPostfix", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/concurrent/locks/ReentrantLock;)V", "(Ljava/util/List;Ljava/lang/String;)V", "core-utils_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ConjunctiveCompositeThreadSafeToggle implements Toggle {
    private final ReentrantLock a;
    private final ArrayList b;
    private final HashMap c;
    private final String d;

    /* renamed from: e, reason: from kotlin metadata */
    private volatile boolean actualState;

    @VisibleForTesting
    public ConjunctiveCompositeThreadSafeToggle(@NotNull List<? extends Toggle> list, @NotNull String str, @NotNull ReentrantLock reentrantLock) {
        this.a = reentrantLock;
        this.b = new ArrayList();
        this.c = new HashMap();
        this.d = "[ConjunctiveCompositeToggle-" + str + ']';
        try {
            access$acquireLock(this);
            for (final Toggle toggle : list) {
                ToggleObserver toggleObserver = new ToggleObserver() { // from class: io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle$1$1$observer$1
                    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
                    public void onStateChanged(boolean incomingState) {
                        ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle = ConjunctiveCompositeThreadSafeToggle.this;
                        Toggle toggle2 = toggle;
                        try {
                            ConjunctiveCompositeThreadSafeToggle.access$acquireLock(conjunctiveCompositeThreadSafeToggle);
                            ConjunctiveCompositeThreadSafeToggle.access$updateState(conjunctiveCompositeThreadSafeToggle, this, incomingState, String.valueOf(Reflection.getOrCreateKotlinClass(toggle2.getClass()).getSimpleName()));
                        } finally {
                            ConjunctiveCompositeThreadSafeToggle.access$releaseLock(conjunctiveCompositeThreadSafeToggle);
                        }
                    }
                };
                this.c.put(toggleObserver, Boolean.valueOf(toggle.getActualState()));
                toggle.registerObserver(toggleObserver, false);
            }
            setActualState(a(this.c.values()));
            access$releaseLock(this);
        } catch (Throwable th) {
            access$releaseLock(this);
            throw th;
        }
    }

    private static boolean a(Collection collection) {
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final void access$acquireLock(ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle) {
        conjunctiveCompositeThreadSafeToggle.getClass();
        boolean z = false;
        while (!z) {
            try {
                Result.Companion companion = Result.INSTANCE;
                z = conjunctiveCompositeThreadSafeToggle.a.tryLock(100L, TimeUnit.MILLISECONDS);
                Result.m8023constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            if (!z) {
                try {
                    Thread.sleep(100L);
                    Result.m8023constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.INSTANCE;
                    Result.m8023constructorimpl(ResultKt.createFailure(th2));
                }
            }
        }
    }

    public static final void access$releaseLock(ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle) {
        conjunctiveCompositeThreadSafeToggle.a.unlock();
    }

    public static final void access$updateState(ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle, ToggleObserver toggleObserver, boolean z, String str) {
        conjunctiveCompositeThreadSafeToggle.c.put(toggleObserver, Boolean.valueOf(z));
        boolean a = a(conjunctiveCompositeThreadSafeToggle.c.values());
        if (a != conjunctiveCompositeThreadSafeToggle.getActualState()) {
            conjunctiveCompositeThreadSafeToggle.setActualState(a);
            Iterator it = conjunctiveCompositeThreadSafeToggle.b.iterator();
            while (it.hasNext()) {
                ((ToggleObserver) it.next()).onStateChanged(a);
            }
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public boolean getActualState() {
        return this.actualState;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public void registerObserver(@NotNull ToggleObserver toggleObserver, boolean sticky) {
        try {
            access$acquireLock(this);
            this.b.add(toggleObserver);
            if (sticky) {
                toggleObserver.onStateChanged(getActualState());
            }
        } finally {
            access$releaseLock(this);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public void removeObserver(@NotNull ToggleObserver toggleObserver) {
        try {
            access$acquireLock(this);
            this.b.remove(toggleObserver);
        } finally {
            access$releaseLock(this);
        }
    }

    public void setActualState(boolean z) {
        this.actualState = z;
    }

    @NotNull
    public String toString() {
        return "ConjunctiveCompositeThreadSafeToggle(toggleStates=" + this.c + ", tag='" + this.d + "', actualState=" + getActualState() + ')';
    }

    public ConjunctiveCompositeThreadSafeToggle(@NotNull List<? extends Toggle> list, @NotNull String str) {
        this(list, str, new ReentrantLock());
    }
}
