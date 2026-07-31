package com.pubmatic.sdk.nativead.request;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import com.pubmatic.sdk.nativead.POBNativeLogConstants;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeImageAssetType;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class POBNativeRequestImageAsset extends POBBaseNativeRequestAsset {
    private final POBNativeImageAssetType c;
    private final int d;
    private final int e;
    private List f;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[POBNativeImageAssetType.values().length];
            a = iArr;
            try {
                iArr[POBNativeImageAssetType.ICON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[POBNativeImageAssetType.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public POBNativeRequestImageAsset(@NonNull POBNativeImageAssetType pOBNativeImageAssetType, boolean z, int i, int i2) {
        super(a(pOBNativeImageAssetType), z);
        this.c = pOBNativeImageAssetType;
        this.d = i;
        this.e = i2;
        this.f = POBNativeConstants.MIMES;
    }

    private static int a(POBNativeImageAssetType pOBNativeImageAssetType) {
        int i = a.a[pOBNativeImageAssetType.ordinal()];
        if (i != 1) {
            return i != 2 ? 0 : 5;
        }
        return 2;
    }

    @NonNull
    public List<String> getMimes() {
        return this.f;
    }

    public int getMinimumHeight() {
        return this.e;
    }

    public int getMinimumWidth() {
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
            jSONObject2.put("type", this.c.getImageAssetTypeValue());
            jSONObject2.put("wmin", this.d);
            jSONObject2.put("hmin", this.e);
            if (!this.f.isEmpty()) {
                jSONObject2.put("mimes", new JSONArray((Collection) this.f));
            }
            jSONObject.put("img", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            POBLog.error("POBNativeReqIMGAsset", POBNativeLogConstants.NATIVE_JSON_EXCEPTION, "POBNativeReqIMGAsset", e.getMessage());
            return jSONObject;
        }
    }

    @NonNull
    public POBNativeImageAssetType getType() {
        return this.c;
    }

    public void setMimes(@NonNull List<String> list) {
        this.f = list;
    }
}
