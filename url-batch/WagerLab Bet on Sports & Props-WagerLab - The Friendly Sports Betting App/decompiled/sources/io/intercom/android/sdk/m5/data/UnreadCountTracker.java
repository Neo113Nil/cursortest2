package io.intercom.android.sdk.m5.data;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.intercom.android.sdk.UnreadConversationCountListener;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* compiled from: UnreadCountTracker.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/m5/data/UnreadCountTracker;", "", "dataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "<init>", "(Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "getDataLayer", "()Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "listeners", "Ljava/util/concurrent/ConcurrentHashMap;", "Lio/intercom/android/sdk/UnreadConversationCountListener;", "Lkotlinx/coroutines/Job;", "getListeners", "()Ljava/util/concurrent/ConcurrentHashMap;", "addListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "removeListener", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UnreadCountTracker {
    public static final int $stable = 8;
    private final IntercomDataLayer dataLayer;
    private final ConcurrentHashMap<UnreadConversationCountListener, Job> listeners;

    public UnreadCountTracker(IntercomDataLayer dataLayer) {
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        this.dataLayer = dataLayer;
        this.listeners = new ConcurrentHashMap<>();
    }

    public final IntercomDataLayer getDataLayer() {
        return this.dataLayer;
    }

    public final ConcurrentHashMap<UnreadConversationCountListener, Job> getListeners() {
        return this.listeners;
    }

    public static /* synthetic */ void addListener$default(UnreadCountTracker unreadCountTracker, UnreadConversationCountListener unreadConversationCountListener, CoroutineDispatcher coroutineDispatcher, int i, Object obj) {
        if ((i & 2) != 0) {
            coroutineDispatcher = Dispatchers.getDefault();
        }
        unreadCountTracker.addListener(unreadConversationCountListener, coroutineDispatcher);
    }

    public final void addListener(UnreadConversationCountListener listener, CoroutineDispatcher dispatcher) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(dispatcher), null, null, new UnreadCountTracker$addListener$job$1(this, listener, null), 3, null);
        this.listeners.put(listener, launch$default);
    }

    public final void removeListener(UnreadConversationCountListener listener) {
        Job remove;
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (!this.listeners.containsKey(listener) || (remove = this.listeners.remove(listener)) == null) {
            return;
        }
        Job.DefaultImpls.cancel$default(remove, (CancellationException) null, 1, (Object) null);
    }
}
