package com.ironsource;

import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.lc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4754lc {

    @NotNull
    private final ConcurrentHashMap<String, JSONObject> a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4754lc() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final ConcurrentHashMap<String, JSONObject> a() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4754lc) && Intrinsics.areEqual(this.a, ((C4754lc) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return "NetworkDataStore(networkDataMap=" + this.a + ")";
    }

    public C4754lc(@NotNull ConcurrentHashMap<String, JSONObject> networkDataMap) {
        Intrinsics.checkNotNullParameter(networkDataMap, "networkDataMap");
        this.a = networkDataMap;
    }

    @NotNull
    public final C4754lc a(@NotNull ConcurrentHashMap<String, JSONObject> networkDataMap) {
        Intrinsics.checkNotNullParameter(networkDataMap, "networkDataMap");
        return new C4754lc(networkDataMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4754lc a(C4754lc c4754lc, ConcurrentHashMap concurrentHashMap, int i, Object obj) {
        if ((i & 1) != 0) {
            concurrentHashMap = c4754lc.a;
        }
        return c4754lc.a((ConcurrentHashMap<String, JSONObject>) concurrentHashMap);
    }

    public /* synthetic */ C4754lc(ConcurrentHashMap concurrentHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ConcurrentHashMap() : concurrentHashMap);
    }

    public final void a(@NotNull com.ironsource.mediationsdk.t networkData) {
        Intrinsics.checkNotNullParameter(networkData, "networkData");
        if (!this.a.containsKey(networkData.a())) {
            this.a.put(networkData.a(), networkData.allData());
            return;
        }
        try {
            ConcurrentHashMap<String, JSONObject> concurrentHashMap = this.a;
            String a = networkData.a();
            JSONObject jSONObject = this.a.get(networkData.a());
            if (jSONObject == null) {
                jSONObject = IronSourceNetworkBridge.jsonObjectInit();
            }
            JSONObject a2 = IronSourceUtils.a(jSONObject, networkData.allData());
            Intrinsics.checkNotNullExpressionValue(a2, "deepMergeJSONObjects(\n  …), networkData.allData())");
            concurrentHashMap.put(a, a2);
        } catch (Exception e) {
            IronLog.INTERNAL.error("error while merging network data: " + e.getMessage());
        }
    }

    public final void a(@NotNull AbstractAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Set<Map.Entry<String, JSONObject>> entrySet = this.a.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "networkDataMap.entries");
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if (com.ironsource.mediationsdk.c.a((String) ((Map.Entry) obj).getKey(), adapter)) {
                arrayList.add(obj);
            }
        }
        for (Map.Entry entry : arrayList) {
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "it.key");
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "it.value");
            adapter.setNetworkData(new com.ironsource.mediationsdk.t((String) key, (JSONObject) value));
        }
    }

    public final void a(@Nullable AdapterBaseWrapper adapterBaseWrapper) {
        Set<Map.Entry<String, JSONObject>> entrySet = this.a.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "networkDataMap.entries");
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if (com.ironsource.mediationsdk.c.a((String) ((Map.Entry) obj).getKey(), adapterBaseWrapper)) {
                arrayList.add(obj);
            }
        }
        for (Map.Entry entry : arrayList) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper != null ? adapterBaseWrapper.getAdapterBaseInterface() : null;
            Intrinsics.checkNotNull(adapterBaseInterface, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface");
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "it.key");
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "it.value");
            ((AdapterNetworkDataInterface) adapterBaseInterface).setNetworkData(new com.ironsource.mediationsdk.t((String) key, (JSONObject) value));
        }
    }
}
