package com.smaato.sdk.ng.models.request;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class Native extends JsonModel {

    @BindField
    private List<Integer> api;

    @BindField
    private List<Integer> battr;

    @BindField
    private String request;

    @BindField
    private String ver;

    public Native() {
    }

    public List<Integer> getApi() {
        return this.api;
    }

    public List<Integer> getBlockedAttr() {
        return this.battr;
    }

    public String getRequest() {
        return this.request;
    }

    public String getVer() {
        return this.ver;
    }

    public void setApi(List<Integer> list) {
        this.api = list;
    }

    public void setBlockedAttr(List<Integer> list) {
        this.battr = list;
    }

    public void setRequest(String str) {
        this.request = str;
    }

    public void setVer(String str) {
        this.ver = str;
    }

    public Native(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
