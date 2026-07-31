package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class RemoteConfigResolutions extends JsonModel {

    @BindField
    public String audience_id;

    @BindField
    public Integer end_time;

    @BindField
    public Integer start_time;

    @BindField
    public List<String> taxonomy_2_ids;

    @BindField
    public List<String> taxonomy_3_ids;

    @BindField
    public Integer upper_limit;

    public RemoteConfigResolutions() {
    }

    public RemoteConfigResolutions(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
