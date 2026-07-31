package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.pubmatic.sdk.common.POBCommonConstants;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.inmobi.media.w1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4432w1 {
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4379u1 a(String placementType, Map map) {
        C4406v1 c4406v1;
        List split$default;
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Map map2 = map != null ? MapsKt.toMap(map) : null;
        if (map2 == null || map2.isEmpty() || !N3.a((String) map2.get("ab-type")) || !N3.a((String) map2.get("ab-ad-slot"))) {
            return new C4379u1(map2, null);
        }
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        TimeoutConfigurations.MediationConfig a0 = ((AdConfig) AbstractC4015g4.a.a(AdConfig.class)).getTimeouts().a0();
        if (!(Intrinsics.areEqual(placementType, "AB") ? a0.getAb().getBanner().isAdaptiveBannerEnabled((String) map2.get("tp")) : a0.getNonAb().getBanner().isAdaptiveBannerEnabled((String) map2.get("tp")))) {
            Map mutableMap = MapsKt.toMutableMap(map2);
            mutableMap.remove("ab-type");
            mutableMap.remove("ab-ad-slot");
            return new C4379u1(mutableMap, null);
        }
        String str = (String) map2.get("ab-type");
        if (!(Intrinsics.areEqual(str, POBCommonConstants.BANNER_PLACEMENT_TYPE) || Intrinsics.areEqual(str, "anchored"))) {
            return new C4379u1(map2, null);
        }
        String str2 = (String) map2.get("ab-ad-slot");
        if (str2 != null && (split$default = StringsKt.split$default((CharSequence) str2, new String[]{VastAttributes.HORIZONTAL_POSITION}, false, 2, 2, (Object) null)) != null) {
            if (split$default.size() != 2) {
                split$default = null;
            }
            if (split$default != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = split$default.iterator();
                while (it.hasNext()) {
                    Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
                    if (intOrNull != null) {
                        arrayList.add(intOrNull);
                    }
                }
                if (arrayList.size() == 2) {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (((Number) it2.next()).intValue() > 0) {
                            }
                        }
                    }
                    if (arrayList != null) {
                        c4406v1 = new C4406v1(((Number) arrayList.get(0)).intValue(), ((Number) arrayList.get(1)).intValue());
                        if (c4406v1 == null) {
                            return new C4379u1(map2, c4406v1);
                        }
                        Map mutableMap2 = MapsKt.toMutableMap(map2);
                        mutableMap2.remove("ab-type");
                        mutableMap2.remove("ab-ad-slot");
                        return new C4379u1(mutableMap2, null);
                    }
                }
                arrayList = null;
                if (arrayList != null) {
                }
            }
        }
        c4406v1 = null;
        if (c4406v1 == null) {
        }
    }
}
