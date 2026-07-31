package com.pubmatic.sdk.openwrap.core.nativead;

import com.pubmatic.sdk.common.log.POBLog;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/pubmatic/sdk/openwrap/core/nativead/POBCoreNativeRequestTitleAsset;", "Lcom/pubmatic/sdk/openwrap/core/nativead/POBCoreNativeRequestAsset;", "", "id", "", "isRequired", "length", "<init>", "(IZI)V", "getLength", "()I", "c", "I", "Lorg/json/JSONObject;", "getRTBJSON", "()Lorg/json/JSONObject;", "RTBJSON", "Companion", "openwrapcore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes12.dex */
public final class POBCoreNativeRequestTitleAsset extends POBCoreNativeRequestAsset {

    /* renamed from: c, reason: from kotlin metadata */
    private final int length;

    public /* synthetic */ POBCoreNativeRequestTitleAsset(int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, (i3 & 4) != 0 ? 0 : i2);
    }

    public final int getLength() {
        return this.length;
    }

    @Override // com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeRequestAsset
    @NotNull
    public JSONObject getRTBJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", getId());
            jSONObject.put("required", getIsRequired() ? 1 : 0);
            JSONObject jSONObject2 = new JSONObject();
            int i = this.length;
            if (i > 0) {
                jSONObject2.put("len", i);
            }
            jSONObject.put("title", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(POBCoreNativeConstants.NATIVE_JSON_EXCEPTION, Arrays.copyOf(new Object[]{"POBCNativeReqTitleAsset"}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            sb.append(format);
            sb.append(e.getMessage());
            POBLog.error("POBCNativeReqTitleAsset", sb.toString(), new Object[0]);
            return jSONObject;
        }
    }

    public POBCoreNativeRequestTitleAsset(int i, boolean z, int i2) {
        super(i, z);
        this.length = i2;
    }
}
