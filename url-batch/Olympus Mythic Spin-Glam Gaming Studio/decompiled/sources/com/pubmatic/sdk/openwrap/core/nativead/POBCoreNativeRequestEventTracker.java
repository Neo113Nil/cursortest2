package com.pubmatic.sdk.openwrap.core.nativead;

import com.pubmatic.sdk.common.log.POBLog;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/pubmatic/sdk/openwrap/core/nativead/POBCoreNativeRequestEventTracker;", "", "Lcom/pubmatic/sdk/openwrap/core/nativead/POBNativeEventType;", "eventType", "", "Lcom/pubmatic/sdk/openwrap/core/nativead/POBNativeEventTrackingMethod;", "methods", "<init>", "(Lcom/pubmatic/sdk/openwrap/core/nativead/POBNativeEventType;Ljava/util/List;)V", "getType", "()Lcom/pubmatic/sdk/openwrap/core/nativead/POBNativeEventType;", "getMethods", "()Ljava/util/List;", "a", "Lcom/pubmatic/sdk/openwrap/core/nativead/POBNativeEventType;", "b", "Ljava/util/List;", "Lorg/json/JSONObject;", "getRTBJSON", "()Lorg/json/JSONObject;", "RTBJSON", "Companion", "openwrapcore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public class POBCoreNativeRequestEventTracker {

    /* renamed from: a, reason: from kotlin metadata */
    private final POBNativeEventType eventType;

    /* renamed from: b, reason: from kotlin metadata */
    private final List methods;

    public POBCoreNativeRequestEventTracker(@NotNull POBNativeEventType eventType, @NotNull List<? extends POBNativeEventTrackingMethod> methods) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(methods, "methods");
        this.eventType = eventType;
        this.methods = methods;
    }

    @NotNull
    public final List<POBNativeEventTrackingMethod> getMethods() {
        return this.methods;
    }

    @NotNull
    public final JSONObject getRTBJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", this.eventType.getEventTypeValue());
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.methods.iterator();
            while (it.hasNext()) {
                jSONArray.put(((POBNativeEventTrackingMethod) it.next()).getNativeEventTrackingMethodValue());
            }
            jSONObject.put("methods", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(POBCoreNativeConstants.NATIVE_JSON_EXCEPTION, Arrays.copyOf(new Object[]{"POBCNativeReqEventTrackr"}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            sb.append(format);
            sb.append(e.getMessage());
            POBLog.error("POBCNativeReqEventTrackr", sb.toString(), new Object[0]);
            return jSONObject;
        }
    }

    @NotNull
    /* renamed from: getType, reason: from getter */
    public final POBNativeEventType getEventType() {
        return this.eventType;
    }
}
