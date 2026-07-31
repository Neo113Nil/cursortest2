package io.intercom.android.sdk.helpcenter.api;

import io.intercom.android.sdk.Injector;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HelpCenterApi.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0016\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/helpcenter/api/HelpCenterApiHelper;", "", "<init>", "()V", "addDefaultOptions", "", "", "kotlin.jvm.PlatformType", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HelpCenterApiHelper {
    public static final int $stable = 0;
    public static final HelpCenterApiHelper INSTANCE = new HelpCenterApiHelper();

    private HelpCenterApiHelper() {
    }

    public final Map<String, String> addDefaultOptions() {
        Injector injector = Injector.get();
        Map<String, Object> map = injector.getUserIdentity().toMap();
        injector.getApi().addSecureHash(map);
        Intrinsics.checkNotNullExpressionValue(map, "apply(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return linkedHashMap;
    }
}
