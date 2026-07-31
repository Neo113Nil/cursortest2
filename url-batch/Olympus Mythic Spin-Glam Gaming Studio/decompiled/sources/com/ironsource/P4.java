package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public interface P4 {

    public static final class a {

        @NotNull
        private final Map<String, Object> a;

        public a(@NotNull String providerName) {
            Intrinsics.checkNotNullParameter(providerName, "providerName");
            this.a = MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_PROVIDER, providerName), TuplesKt.to(IronSourceConstants.EVENTS_DEMAND_ONLY, 1));
        }

        public final void a(@NotNull String key, @NotNull Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.a.put(key, value);
        }

        @NotNull
        public final Map<String, Object> a() {
            return MapsKt.toMutableMap(this.a);
        }
    }

    void a(@NotNull EnumC4984y5 enumC4984y5, @Nullable Ee ee);

    void a(@NotNull EnumC4984y5 enumC4984y5, @NotNull String str);

    public static final class b implements P4 {

        @NotNull
        private final C7 a;

        @NotNull
        private final a b;

        public b(@NotNull C7 eventManager, @NotNull a eventBaseData) {
            Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
            this.a = eventManager;
            this.b = eventBaseData;
        }

        @Override // com.ironsource.P4
        public void a(@NotNull EnumC4984y5 eventName, @NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Map<String, Object> a = this.b.a();
            a.put("spId", instanceId);
            this.a.a(new C4966x5(eventName, new JSONObject(MapsKt.toMap(a))));
        }

        @Override // com.ironsource.P4
        public void a(@NotNull EnumC4984y5 eventName, @Nullable Ee ee) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Map<String, Object> a = this.b.a();
            if (ee != null) {
                a.put(IronSourceConstants.EVENTS_EXT1, ee.toString());
            }
            this.a.a(new C4966x5(eventName, new JSONObject(MapsKt.toMap(a))));
        }
    }
}
