package io.appmetrica.analytics.networktasks.internal;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C4834q2;
import com.unity3d.services.core.fid.Constants;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.network.internal.NetworkClientServiceLocator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLocator;", "Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLifecycleObserver;", "", "onCreate", "onDestroy", "Lio/appmetrica/analytics/networktasks/internal/NetworkCore;", "a", "Lio/appmetrica/analytics/networktasks/internal/NetworkCore;", "getNetworkCore", "()Lio/appmetrica/analytics/networktasks/internal/NetworkCore;", "networkCore", "Lio/appmetrica/analytics/coreapi/internal/io/IExecutionPolicy;", "executionPolicy", "<init>", "(Lio/appmetrica/analytics/coreapi/internal/io/IExecutionPolicy;)V", "Companion", "network-tasks_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class NetworkServiceLocator implements NetworkServiceLifecycleObserver {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static volatile NetworkServiceLocator b;

    /* renamed from: a, reason: from kotlin metadata */
    private final NetworkCore networkCore;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0007R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLocator$Companion;", "", "Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLocator;", Constants.GET_INSTANCE, "Landroid/content/Context;", "context", "Lio/appmetrica/analytics/coreapi/internal/io/IExecutionPolicy;", "executionPolicy", "", "init", "networkServiceLocator", C4834q2.p, "Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLocator;", "network-tasks_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NetworkServiceLocator getInstance() {
            NetworkServiceLocator networkServiceLocator = NetworkServiceLocator.b;
            if (networkServiceLocator != null) {
                return networkServiceLocator;
            }
            Intrinsics.throwUninitializedPropertyAccessException(C4834q2.p);
            return null;
        }

        @AnyThread
        public final void init(@NotNull Context context, @NotNull IExecutionPolicy executionPolicy) {
            if (NetworkServiceLocator.b == null) {
                synchronized (NetworkServiceLocator.class) {
                    try {
                        if (NetworkServiceLocator.b == null) {
                            NetworkServiceLocator.b = new NetworkServiceLocator(executionPolicy);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            NetworkClientServiceLocator.init(context);
        }

        private Companion() {
        }

        @VisibleForTesting
        public final void init(@NotNull NetworkServiceLocator networkServiceLocator) {
            NetworkServiceLocator.b = networkServiceLocator;
        }
    }

    @AnyThread
    @VisibleForTesting
    public NetworkServiceLocator(@NotNull IExecutionPolicy iExecutionPolicy) {
        NetworkCore networkCore = new NetworkCore(iExecutionPolicy);
        networkCore.setName("IAA-NC");
        networkCore.start();
        this.networkCore = networkCore;
    }

    @NotNull
    public static final NetworkServiceLocator getInstance() {
        return INSTANCE.getInstance();
    }

    @AnyThread
    public static final void init(@NotNull Context context, @NotNull IExecutionPolicy iExecutionPolicy) {
        INSTANCE.init(context, iExecutionPolicy);
    }

    @NotNull
    public final NetworkCore getNetworkCore() {
        return this.networkCore;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onCreate() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onDestroy() {
        this.networkCore.stopTasks();
    }

    @VisibleForTesting
    public static final void init(@NotNull NetworkServiceLocator networkServiceLocator) {
        INSTANCE.init(networkServiceLocator);
    }
}
