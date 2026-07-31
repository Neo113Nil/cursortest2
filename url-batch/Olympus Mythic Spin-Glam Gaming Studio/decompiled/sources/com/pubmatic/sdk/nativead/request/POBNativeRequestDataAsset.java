package com.pubmatic.sdk.nativead.request;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.nativead.POBNativeLogConstants;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeDataAssetType;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class POBNativeRequestDataAsset extends POBBaseNativeRequestAsset {
    private final POBNativeDataAssetType c;
    private int d;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[POBNativeDataAssetType.values().length];
            a = iArr;
            try {
                iArr[POBNativeDataAssetType.DESCRIPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[POBNativeDataAssetType.CTA_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[POBNativeDataAssetType.SPONSORED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[POBNativeDataAssetType.RATING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[POBNativeDataAssetType.PRICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public POBNativeRequestDataAsset(@NonNull POBNativeDataAssetType pOBNativeDataAssetType, boolean z) {
        super(a(pOBNativeDataAssetType), z);
        this.c = pOBNativeDataAssetType;
    }

    private static int a(POBNativeDataAssetType pOBNativeDataAssetType) {
        int i = a.a[pOBNativeDataAssetType.ordinal()];
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 8;
        }
        if (i != 4) {
            return i != 5 ? 0 : 7;
        }
        return 6;
    }

    public int getLength() {
        return this.d;
    }

    @Override // com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeRequestAsset
    @NonNull
    public JSONObject getRTBJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", getId());
            jSONObject.put("required", getIsRequired() ? 1 : 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", this.c.getDataAssetTypeValue());
            int i = this.d;
            if (i > 0) {
                jSONObject2.put("len", i);
            }
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            POBLog.error("POBNativeReqDataAsset", POBNativeLogConstants.NATIVE_JSON_EXCEPTION, "POBNativeReqDataAsset", e.getMessage());
            return jSONObject;
        }
    }

    @NonNull
    public POBNativeDataAssetType getType() {
        return this.c;
    }

    public void setLength(int i) {
        this.d = i;
    }
}
