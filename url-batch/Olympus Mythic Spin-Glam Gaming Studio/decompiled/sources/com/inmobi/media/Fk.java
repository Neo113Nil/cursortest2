package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdSet;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.div.core.DivActionHandler;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Fk {
    public final C4326s1 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public String f;

    public Fk(C4326s1 c4326s1, String str, String str2, String str3, String markupType) {
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        this.a = c4326s1;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = markupType;
    }

    public final LinkedHashMap a() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C4326s1 c4326s1 = this.a;
        if (c4326s1 != null) {
            linkedHashMap.put("adType", c4326s1.a.m());
        }
        C4326s1 c4326s12 = this.a;
        if (c4326s12 != null) {
            linkedHashMap.put("plId", Long.valueOf(c4326s12.a.l.a));
        }
        C4326s1 c4326s13 = this.a;
        if (c4326s13 != null && (str = c4326s13.a.l.f) != null) {
            linkedHashMap.put("plType", str);
        }
        C4326s1 c4326s14 = this.a;
        String str2 = null;
        if (c4326s14 != null) {
            AdSet s = c4326s14.a.s();
            Boolean valueOf = s != null ? Boolean.valueOf(s.getIsRewarded()) : null;
            if (valueOf != null) {
                linkedHashMap.put("isRewarded", valueOf);
            }
        }
        String str3 = this.c;
        if (str3 != null) {
            linkedHashMap.put("creativeId", str3);
        }
        String str4 = this.b;
        if (str4 != null) {
            linkedHashMap.put("creativeType", str4);
        }
        linkedHashMap.put("markupType", this.e);
        String str5 = this.f;
        if (str5 != null) {
            str2 = str5;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("triggerSource");
        }
        linkedHashMap.put(DivActionHandler.DivActionReason.TRIGGER, str2);
        C4326s1 c4326s15 = this.a;
        if (c4326s15 != null && c4326s15.a().length() > 0) {
            linkedHashMap.put("metadataBlob", this.a.a());
        }
        return linkedHashMap;
    }

    public final void b() {
        Gk gk;
        AtomicBoolean atomicBoolean;
        C4326s1 c4326s1 = this.a;
        if (c4326s1 == null || (gk = c4326s1.b) == null || (atomicBoolean = gk.a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap a = a();
            a.put("networkType", F5.g());
            a.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2177);
            String str = this.d;
            if (str == null) {
                str = "";
            }
            a.put("impressionId", str);
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b("AdImpressionSuccessful", a, EnumC4530zk.a);
        }
    }

    public final void c() {
        Gk gk;
        AtomicBoolean atomicBoolean;
        C4326s1 c4326s1 = this.a;
        if (c4326s1 == null || (gk = c4326s1.b) == null || (atomicBoolean = gk.a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap a = a();
            a.put("networkType", F5.g());
            a.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 0);
            String str = this.d;
            if (str == null) {
                str = "";
            }
            a.put("impressionId", str);
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b("AdImpressionSuccessful", a, EnumC4530zk.a);
        }
    }
}
