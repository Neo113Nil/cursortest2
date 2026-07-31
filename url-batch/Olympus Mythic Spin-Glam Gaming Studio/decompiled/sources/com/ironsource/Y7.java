package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public interface Y7<T> {

    public static class a<ListenerType> implements Y7<ListenerType> {

        @Nullable
        private ListenerType a;

        /* renamed from: com.ironsource.Y7$a$a, reason: collision with other inner class name */
        public static final class C0356a extends AbstractRunnableC4756le {
            final /* synthetic */ Runnable b;

            C0356a(Runnable runnable) {
                this.b = runnable;
            }

            @Override // com.ironsource.AbstractRunnableC4756le
            public void a() {
                this.b.run();
            }
        }

        @Nullable
        public final ListenerType a() {
            return this.a;
        }

        public final void b(@Nullable ListenerType listenertype) {
            this.a = listenertype;
        }

        public static /* synthetic */ void a(a aVar, Runnable runnable, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeOnUIThreadIfConditionMet");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            aVar.a(runnable, z);
        }

        public final void a(@NotNull Runnable runnable, boolean z) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            if (z) {
                IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new C0356a(runnable), 0L, 2, null);
            }
        }

        public final void a(@NotNull String instanceId, @NotNull String message) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(message, "message");
            IronLog.CALLBACK.info(message + " instanceId=" + instanceId);
        }

        @Override // com.ironsource.Y7
        public void a(ListenerType listenertype) {
            this.a = listenertype;
        }
    }

    void a(T t);
}
