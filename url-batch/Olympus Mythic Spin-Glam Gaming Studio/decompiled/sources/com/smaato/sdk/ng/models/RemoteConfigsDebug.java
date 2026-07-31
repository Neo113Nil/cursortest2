package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class RemoteConfigsDebug extends JsonModel {

    @BindField
    public List<Integer> configids;

    @BindField
    public List<Integer> sliceids;

    public RemoteConfigsDebug() {
    }

    public List<Integer> getConfigIds() {
        return this.configids;
    }

    public List<Integer> getSliceIds() {
        return this.sliceids;
    }

    public RemoteConfigsDebug(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
