package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public interface X7<T> {
    T a(@NotNull String str);

    void a(T t);

    void a(@NotNull String str, T t);

    public static final class a implements X7<ISDemandOnlyInterstitialListener> {

        @NotNull
        private W7 a = new W7();

        @NotNull
        private final Map<String, W7> b = new HashMap();

        @Override // com.ironsource.X7
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyInterstitialListener a(@NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            W7 w7 = this.b.get(instanceId);
            return w7 != null ? w7 : this.a;
        }

        @Override // com.ironsource.X7
        public void a(@NotNull ISDemandOnlyInterstitialListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.a.a(listener);
            Iterator<String> it = this.b.keySet().iterator();
            while (it.hasNext()) {
                W7 w7 = this.b.get(it.next());
                if (w7 != null) {
                    w7.a(listener);
                }
            }
        }

        @Override // com.ironsource.X7
        public void a(@NotNull String instanceId, @NotNull ISDemandOnlyInterstitialListener listener) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (this.b.containsKey(instanceId)) {
                W7 w7 = this.b.get(instanceId);
                if (w7 != null) {
                    w7.a(listener);
                    return;
                }
                return;
            }
            this.b.put(instanceId, new W7(listener));
        }
    }

    public static final class b implements X7<ISDemandOnlyRewardedVideoListener> {

        @NotNull
        private Z7 a = new Z7();

        @NotNull
        private final Map<String, Z7> b = new HashMap();

        @Override // com.ironsource.X7
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyRewardedVideoListener a(@NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Z7 z7 = this.b.get(instanceId);
            return z7 != null ? z7 : this.a;
        }

        @Override // com.ironsource.X7
        public void a(@NotNull ISDemandOnlyRewardedVideoListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.a.a(listener);
            Iterator<String> it = this.b.keySet().iterator();
            while (it.hasNext()) {
                Z7 z7 = this.b.get(it.next());
                if (z7 != null) {
                    z7.a(listener);
                }
            }
        }

        @Override // com.ironsource.X7
        public void a(@NotNull String instanceId, @NotNull ISDemandOnlyRewardedVideoListener listener) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (this.b.containsKey(instanceId)) {
                Z7 z7 = this.b.get(instanceId);
                if (z7 != null) {
                    z7.a(listener);
                    return;
                }
                return;
            }
            this.b.put(instanceId, new Z7(listener));
        }
    }
}
