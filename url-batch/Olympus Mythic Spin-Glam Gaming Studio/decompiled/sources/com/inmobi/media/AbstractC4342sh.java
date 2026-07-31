package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.div.core.DivActionHandler;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.sh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4342sh {
    public static final void a(AbstractC4316rh telemetryType) {
        Intrinsics.checkNotNullParameter(telemetryType, "telemetryType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (telemetryType instanceof C4238oh) {
            linkedHashMap.put(DivActionHandler.DivActionReason.TRIGGER, ((C4238oh) telemetryType).a);
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b("BillingClientConnectionError", linkedHashMap, EnumC4530zk.a);
        } else if (telemetryType instanceof C4264ph) {
            linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(((C4264ph) telemetryType).a));
            C4425vk c4425vk2 = C4425vk.a;
            C4425vk.b("IAPFetchFailed", linkedHashMap, EnumC4530zk.a);
        } else {
            if (!(telemetryType instanceof C4290qh)) {
                throw new NoWhenBranchMatchedException();
            }
            C4425vk c4425vk3 = C4425vk.a;
            C4425vk.b("IAPFetchSuccess", linkedHashMap, EnumC4530zk.a);
        }
    }
}
