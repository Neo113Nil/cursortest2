package com.pubmatic.sdk.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class POBDataProvider {
    private final String a;
    private final String b;
    private int c;
    private final Map d;
    private JSONObject e;

    public POBDataProvider(@NonNull String str) {
        this(str, null);
    }

    public void addSegment(@NonNull POBSegment pOBSegment) {
        if (pOBSegment == null || POBUtils.isNullOrEmpty(pOBSegment.getSegId())) {
            POBLog.warn("POBDataProvider", POBCommonConstants.MSG_INVALID_DATA, "segments");
            return;
        }
        String segId = pOBSegment.getSegId();
        if (this.d.containsKey(segId)) {
            POBLog.warn("POBDataProvider", POBCommonConstants.MSG_DUPLICATE_FIELD, "segments", "id");
        } else {
            this.d.put(segId, pOBSegment);
        }
    }

    @Nullable
    public JSONObject getExt() {
        return this.e;
    }

    @Nullable
    public String getId() {
        return this.a;
    }

    @NonNull
    public String getName() {
        return this.b;
    }

    public int getSegTax() {
        return this.c;
    }

    @Nullable
    public POBSegment getSegment(@NonNull String str) {
        return (POBSegment) this.d.get(str);
    }

    @NonNull
    public Map<String, POBSegment> getSegments() {
        return this.d;
    }

    public void removeAllSegments() {
        this.d.clear();
    }

    @Nullable
    public POBSegment removeSegment(@NonNull String str) {
        return (POBSegment) this.d.remove(str);
    }

    public void setExt(@NonNull JSONObject jSONObject) {
        this.e = jSONObject;
    }

    public void setSegTax(int i) {
        this.c = i;
    }

    public POBDataProvider(@NonNull String str, @Nullable String str2) {
        this.a = str2;
        this.b = str;
        this.c = 0;
        this.d = Collections.synchronizedMap(new HashMap());
    }
}
