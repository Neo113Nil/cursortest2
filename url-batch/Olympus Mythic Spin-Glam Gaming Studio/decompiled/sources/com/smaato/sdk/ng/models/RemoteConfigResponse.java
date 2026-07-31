package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class RemoteConfigResponse extends JsonModel {

    @BindField
    public SdkConfig configs;

    @BindField
    public String error_message;

    @BindField
    public String status;

    public interface Status {
        public static final String ERROR = "error";
        public static final String OK = "ok";
    }

    public RemoteConfigResponse() {
    }

    public RemoteConfigResponse(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
