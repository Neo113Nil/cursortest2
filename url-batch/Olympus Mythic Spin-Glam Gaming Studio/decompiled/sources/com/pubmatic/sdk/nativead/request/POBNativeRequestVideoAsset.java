package com.pubmatic.sdk.nativead.request;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.nativead.POBNativeLogConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 +2\u00020\u0001:\u0001+B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010&\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/pubmatic/sdk/nativead/request/POBNativeRequestVideoAsset;", "Lcom/pubmatic/sdk/nativead/request/POBBaseNativeRequestAsset;", "", "isRequired", "", "minDuration", "maxDuration", "", "protocols", "", "", "mimes", "<init>", "(ZII[I[Ljava/lang/String;)V", "c", "I", "getMinDuration", "()I", "d", "getMaxDuration", EidRequestBuilder.REQUEST_FIELD_EMAIL, "[I", "getProtocols", "()[I", InneractiveMediationDefs.GENDER_FEMALE, "[Ljava/lang/String;", "getMimes", "()[Ljava/lang/String;", "g", "Ljava/lang/Integer;", "getWidth", "()Ljava/lang/Integer;", "setWidth", "(Ljava/lang/Integer;)V", "width", "h", "getHeight", "setHeight", "height", "Lorg/json/JSONObject;", "getRTBJSON", "()Lorg/json/JSONObject;", "RTBJSON", "Companion", "nativead_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class POBNativeRequestVideoAsset extends POBBaseNativeRequestAsset {

    /* renamed from: c, reason: from kotlin metadata */
    private final int minDuration;

    /* renamed from: d, reason: from kotlin metadata */
    private final int maxDuration;

    /* renamed from: e, reason: from kotlin metadata */
    private final int[] protocols;

    /* renamed from: f, reason: from kotlin metadata */
    private final String[] mimes;

    /* renamed from: g, reason: from kotlin metadata */
    private Integer width;

    /* renamed from: h, reason: from kotlin metadata */
    private Integer height;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public POBNativeRequestVideoAsset(boolean z, int i, int i2, @NotNull int[] protocols, @NotNull String[] mimes) {
        super(9, z);
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(mimes, "mimes");
        this.minDuration = i;
        this.maxDuration = i2;
        this.protocols = protocols;
        this.mimes = mimes;
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    public final int getMaxDuration() {
        return this.maxDuration;
    }

    @NotNull
    public final String[] getMimes() {
        return this.mimes;
    }

    public final int getMinDuration() {
        return this.minDuration;
    }

    @NotNull
    public final int[] getProtocols() {
        return this.protocols;
    }

    @Override // com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeRequestAsset
    @NotNull
    public JSONObject getRTBJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", getId());
            jSONObject.put("required", getIsRequired() ? 1 : 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("minduration", this.minDuration);
            jSONObject2.put("maxduration", this.maxDuration);
            if (this.protocols.length != 0) {
                jSONObject2.put("protocols", new JSONArray(this.protocols));
            }
            if (this.mimes.length != 0) {
                jSONObject2.put("mimes", new JSONArray(this.mimes));
            }
            Integer num = this.width;
            if (num != null) {
                jSONObject2.put("w", num.intValue());
            }
            Integer num2 = this.height;
            if (num2 != null) {
                jSONObject2.put("h", num2.intValue());
            }
            jSONObject.put("video", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(POBNativeLogConstants.NATIVE_JSON_EXCEPTION, Arrays.copyOf(new Object[]{"POBNativeRequestVideoAsset"}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            sb.append(format);
            sb.append(e.getMessage());
            POBLog.debug("POBNativeRequestVideoAsset", sb.toString(), new Object[0]);
            return jSONObject;
        }
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    public final void setHeight(@Nullable Integer num) {
        this.height = num;
    }

    public final void setWidth(@Nullable Integer num) {
        this.width = num;
    }
}
