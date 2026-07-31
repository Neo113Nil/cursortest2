package com.ironsource.mediationsdk;

import com.ironsource.C4966x5;
import com.ironsource.EnumC4984y5;
import com.ironsource.G9;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class t implements AdapterNetworkData {

    @NotNull
    private final String a;

    @NotNull
    private final JSONObject b;

    public t(@NotNull String networkName, @NotNull JSONObject data) {
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        Intrinsics.checkNotNullParameter(data, "data");
        this.a = networkName;
        this.b = IronSourceNetworkBridge.jsonObjectInit(data.toString());
    }

    private final void b(Collection<? extends AdapterBaseWrapper> collection) {
        List filterNotNull = CollectionsKt.filterNotNull(collection);
        ArrayList arrayList = new ArrayList();
        for (Object obj : filterNotNull) {
            if (c.a(this.a, (AdapterBaseWrapper) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AdapterBaseWrapper) it.next()).getAdapterBaseInterface());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof AdapterNetworkDataInterface) {
                arrayList3.add(obj2);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            ((AdapterNetworkDataInterface) it2.next()).setNetworkData(this);
        }
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    @NotNull
    public JSONObject allData() {
        return this.b;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    @Nullable
    public <T> T dataByKeyIgnoreCase(@NotNull String desiredKey, @NotNull Class<T> valueType) {
        Object obj;
        Intrinsics.checkNotNullParameter(desiredKey, "desiredKey");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        Iterator<String> keys = allData().keys();
        Intrinsics.checkNotNullExpressionValue(keys, "allData()\n          .keys()");
        Iterator it = SequencesKt.asSequence(keys).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (StringsKt.equals((String) obj, desiredKey, true)) {
                break;
            }
        }
        String str = (String) obj;
        if (str == null) {
            return null;
        }
        Object opt = allData().opt(str);
        if (!valueType.isInstance(opt)) {
            opt = null;
        }
        if (opt != null) {
            return valueType.cast(opt);
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    @NotNull
    public JSONObject networkDataByAdUnit(@NotNull IronSource.a adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        JSONObject optJSONObject = this.b.optJSONObject(adUnit.toString());
        return optJSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject;
    }

    @NotNull
    public String toString() {
        return "NetworkData(networkName=" + this.a + ", networkData=" + this.b + ")";
    }

    public final void a(@NotNull Collection<? extends AbstractAdapter> adapters, @NotNull Collection<? extends AdapterBaseWrapper> networkAdapters) {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        Intrinsics.checkNotNullParameter(networkAdapters, "networkAdapters");
        try {
            a(adapters);
            b(networkAdapters);
        } catch (Exception e) {
            IronLog.INTERNAL.error("error while setting network data: " + e.getMessage());
        }
    }

    private final void a(Collection<? extends AbstractAdapter> collection) {
        List filterNotNull = CollectionsKt.filterNotNull(collection);
        ArrayList arrayList = new ArrayList();
        for (Object obj : filterNotNull) {
            if (c.a(this.a, (AbstractAdapter) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractAdapter) it.next()).setNetworkData(this);
        }
    }

    public final void b() {
        Iterator<String> keys = this.b.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "networkData.keys()");
        String joinToString$default = CollectionsKt.joinToString$default(SequencesKt.toList(SequencesKt.asSequence(keys)), StringUtils.COMMA, null, null, 0, null, null, 62, null);
        G9.i().a(new C4966x5(EnumC4984y5.SET_NETWORK_DATA, IronSourceUtils.b(false).put(IronSourceConstants.EVENTS_EXT1, this.a + " - " + joinToString$default)));
    }
}
