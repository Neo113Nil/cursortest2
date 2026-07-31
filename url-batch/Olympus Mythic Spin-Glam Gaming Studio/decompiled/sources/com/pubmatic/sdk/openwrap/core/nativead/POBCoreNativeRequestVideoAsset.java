package com.pubmatic.sdk.openwrap.core.nativead;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.same.report.j;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.common.log.POBLog;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 @2\u00020\u0001:\u0001@B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JR\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0010J\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0005\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0016R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0018R$\u00107\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010;\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u00106R\u0014\u0010?\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/pubmatic/sdk/openwrap/core/nativead/POBCoreNativeRequestVideoAsset;", "Lcom/pubmatic/sdk/openwrap/core/nativead/POBCoreNativeRequestAsset;", "", "assetId", "", "isAssetRequired", "minDuration", "maxDuration", "", "protocols", "", "", "mimes", "<init>", "(IZII[I[Ljava/lang/String;)V", "component1", "()I", "component2", "()Z", "component3", "component4", "component5", "()[I", "component6", "()[Ljava/lang/String;", "copy", "(IZII[I[Ljava/lang/String;)Lcom/pubmatic/sdk/openwrap/core/nativead/POBCoreNativeRequestVideoAsset;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "I", "getAssetId", "d", "Z", EidRequestBuilder.REQUEST_FIELD_EMAIL, "getMinDuration", InneractiveMediationDefs.GENDER_FEMALE, "getMaxDuration", "g", "[I", "getProtocols", "h", "[Ljava/lang/String;", "getMimes", "i", "Ljava/lang/Integer;", "getWidth", "()Ljava/lang/Integer;", "setWidth", "(Ljava/lang/Integer;)V", "width", j.b, "getHeight", "setHeight", "height", "Lorg/json/JSONObject;", "getRTBJSON", "()Lorg/json/JSONObject;", "RTBJSON", "Companion", "openwrapcore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class POBCoreNativeRequestVideoAsset extends POBCoreNativeRequestAsset {

    /* renamed from: c, reason: from kotlin metadata and from toString */
    private final int assetId;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean isAssetRequired;

    /* renamed from: e, reason: from kotlin metadata and from toString */
    private final int minDuration;

    /* renamed from: f, reason: from kotlin metadata and from toString */
    private final int maxDuration;

    /* renamed from: g, reason: from kotlin metadata and from toString */
    private final int[] protocols;

    /* renamed from: h, reason: from kotlin metadata and from toString */
    private final String[] mimes;

    /* renamed from: i, reason: from kotlin metadata */
    private Integer width;

    /* renamed from: j, reason: from kotlin metadata */
    private Integer height;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public POBCoreNativeRequestVideoAsset(int i, boolean z, int i2, int i3, @NotNull int[] protocols, @NotNull String[] mimes) {
        super(i, z);
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(mimes, "mimes");
        this.assetId = i;
        this.isAssetRequired = z;
        this.minDuration = i2;
        this.maxDuration = i3;
        this.protocols = protocols;
        this.mimes = mimes;
    }

    public static /* synthetic */ POBCoreNativeRequestVideoAsset copy$default(POBCoreNativeRequestVideoAsset pOBCoreNativeRequestVideoAsset, int i, boolean z, int i2, int i3, int[] iArr, String[] strArr, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = pOBCoreNativeRequestVideoAsset.assetId;
        }
        if ((i4 & 2) != 0) {
            z = pOBCoreNativeRequestVideoAsset.isAssetRequired;
        }
        boolean z2 = z;
        if ((i4 & 4) != 0) {
            i2 = pOBCoreNativeRequestVideoAsset.minDuration;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = pOBCoreNativeRequestVideoAsset.maxDuration;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            iArr = pOBCoreNativeRequestVideoAsset.protocols;
        }
        int[] iArr2 = iArr;
        if ((i4 & 32) != 0) {
            strArr = pOBCoreNativeRequestVideoAsset.mimes;
        }
        return pOBCoreNativeRequestVideoAsset.copy(i, z2, i5, i6, iArr2, strArr);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAssetId() {
        return this.assetId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsAssetRequired() {
        return this.isAssetRequired;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMinDuration() {
        return this.minDuration;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMaxDuration() {
        return this.maxDuration;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final int[] getProtocols() {
        return this.protocols;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String[] getMimes() {
        return this.mimes;
    }

    @NotNull
    public final POBCoreNativeRequestVideoAsset copy(int assetId, boolean isAssetRequired, int minDuration, int maxDuration, @NotNull int[] protocols, @NotNull String[] mimes) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(mimes, "mimes");
        return new POBCoreNativeRequestVideoAsset(assetId, isAssetRequired, minDuration, maxDuration, protocols, mimes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof POBCoreNativeRequestVideoAsset)) {
            return false;
        }
        POBCoreNativeRequestVideoAsset pOBCoreNativeRequestVideoAsset = (POBCoreNativeRequestVideoAsset) other;
        return this.assetId == pOBCoreNativeRequestVideoAsset.assetId && this.isAssetRequired == pOBCoreNativeRequestVideoAsset.isAssetRequired && this.minDuration == pOBCoreNativeRequestVideoAsset.minDuration && this.maxDuration == pOBCoreNativeRequestVideoAsset.maxDuration && Intrinsics.areEqual(this.protocols, pOBCoreNativeRequestVideoAsset.protocols) && Intrinsics.areEqual(this.mimes, pOBCoreNativeRequestVideoAsset.mimes);
    }

    public final int getAssetId() {
        return this.assetId;
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
            String format = String.format(POBCoreNativeConstants.NATIVE_JSON_EXCEPTION, Arrays.copyOf(new Object[]{"POBCoreNativeRequestVideoAsset"}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            sb.append(format);
            sb.append(e.getMessage());
            POBLog.debug("POBCoreNativeRequestVideoAsset", sb.toString(), new Object[0]);
            return jSONObject;
        }
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.assetId) * 31;
        boolean z = this.isAssetRequired;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((((hashCode + i) * 31) + Integer.hashCode(this.minDuration)) * 31) + Integer.hashCode(this.maxDuration)) * 31) + Arrays.hashCode(this.protocols)) * 31) + Arrays.hashCode(this.mimes);
    }

    public final boolean isAssetRequired() {
        return this.isAssetRequired;
    }

    public final void setHeight(@Nullable Integer num) {
        this.height = num;
    }

    public final void setWidth(@Nullable Integer num) {
        this.width = num;
    }

    @NotNull
    public String toString() {
        return "POBCoreNativeRequestVideoAsset(assetId=" + this.assetId + ", isAssetRequired=" + this.isAssetRequired + ", minDuration=" + this.minDuration + ", maxDuration=" + this.maxDuration + ", protocols=" + Arrays.toString(this.protocols) + ", mimes=" + Arrays.toString(this.mimes) + ')';
    }
}
