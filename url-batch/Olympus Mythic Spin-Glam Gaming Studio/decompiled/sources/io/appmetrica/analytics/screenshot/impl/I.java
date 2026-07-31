package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.screenshot.internal.config.RemoteScreenshotConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class I implements JsonParser {
    public final V a;
    public final U b;

    /* JADX WARN: Multi-variable type inference failed */
    public I() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final RemoteScreenshotConfig b(@NotNull JSONObject jSONObject) {
        return (RemoteScreenshotConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (RemoteScreenshotConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public I(@NotNull V v, @NotNull U u) {
        this.a = v;
        this.b = u;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoteScreenshotConfig parse(@NotNull JSONObject jSONObject) {
        K k;
        M m;
        N n;
        boolean extractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject, "screenshot", AbstractC5878o.a);
        V v = this.a;
        U u = this.b;
        u.getClass();
        JSONObject optJSONObject = jSONObject.optJSONObject("screenshot");
        if (optJSONObject == null) {
            n = new N();
            n.a = new K();
            n.b = new M();
            L l = new L();
            l.c = AbstractC5878o.b;
            n.c = l;
        } else {
            N n2 = new N();
            u.a.getClass();
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("api_captor_config");
            L l2 = null;
            if (optJSONObject2 == null) {
                k = null;
            } else {
                k = new K();
                Boolean optBooleanOrNull = JsonUtils.optBooleanOrNull(optJSONObject2, "enabled");
                if (optBooleanOrNull != null) {
                    k.a = optBooleanOrNull.booleanValue();
                }
            }
            if (k != null) {
                n2.a = k;
            }
            u.b.getClass();
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("service_captor_config");
            if (optJSONObject3 == null) {
                m = null;
            } else {
                m = new M();
                Boolean optBooleanOrNull2 = JsonUtils.optBooleanOrNull(optJSONObject3, "enabled");
                if (optBooleanOrNull2 != null) {
                    m.a = optBooleanOrNull2.booleanValue();
                }
                Long optLongOrNull = JsonUtils.optLongOrNull(optJSONObject3, "delay_seconds");
                if (optLongOrNull != null) {
                    m.b = optLongOrNull.longValue();
                }
            }
            if (m != null) {
                n2.b = m;
            }
            u.c.getClass();
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("content_observer_captor_config");
            if (optJSONObject4 != null) {
                l2 = new L();
                Boolean optBooleanOrNull3 = JsonUtils.optBooleanOrNull(optJSONObject4, "enabled");
                if (optBooleanOrNull3 != null) {
                    l2.a = optBooleanOrNull3.booleanValue();
                }
                JSONArray optJSONArray = optJSONObject4.optJSONArray("media_store_column_names");
                if (optJSONArray != null) {
                    IntRange until = RangesKt.until(0, optJSONArray.length());
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
                    Iterator it = until.iterator();
                    while (it.hasNext()) {
                        arrayList.add(optJSONArray.getString(((IntIterator) it).nextInt()));
                    }
                    l2.c = (String[]) arrayList.toArray(new String[0]);
                }
                Long optLongOrNull2 = JsonUtils.optLongOrNull(optJSONObject4, "detect_window_seconds");
                if (optLongOrNull2 != null) {
                    l2.b = optLongOrNull2.longValue();
                }
            }
            if (l2 != null) {
                n2.c = l2;
            }
            n = n2;
        }
        return new RemoteScreenshotConfig(extractFeature, v.toModel(n));
    }

    public /* synthetic */ I(V v, U u, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new V(null, null, null, 7, null) : v, (i & 2) != 0 ? new U() : u);
    }
}
