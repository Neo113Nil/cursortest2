package com.smaato.sdk.ng.models.response;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class BidExtension extends JsonModel {

    @BindField
    private String crtype;

    @BindField
    private List<String> imptrackers;

    @BindField
    private String signaldata;

    public BidExtension() {
    }

    public String getCrtype() {
        return this.crtype;
    }

    public List<String> getImptrackers() {
        return this.imptrackers;
    }

    public String getSignaldata() {
        return this.signaldata;
    }

    public void setCrtype(String str) {
        this.crtype = str;
    }

    public void setImptrackers(List<String> list) {
        this.imptrackers = list;
    }

    public void setSignaldata(String str) {
        this.signaldata = str;
    }

    public BidExtension(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
