package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class AdResponse extends JsonModel {

    @BindField
    public List<Ad> ads;

    @BindField
    public String error_message;

    @BindField
    public List<AdExt> ext;

    @BindField
    public String status;

    public interface Status {
        public static final String ERROR = "error";
        public static final String OK = "ok";
    }

    public AdResponse() {
    }

    public AdResponse(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
