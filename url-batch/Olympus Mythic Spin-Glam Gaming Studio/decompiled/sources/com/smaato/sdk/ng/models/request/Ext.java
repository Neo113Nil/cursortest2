package com.smaato.sdk.ng.models.request;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class Ext extends JsonModel {

    @BindField
    private Integer gdpr;

    @BindField
    private String gpp;

    @BindField
    private List<Integer> gpp_sid;

    @BindField
    private String us_privacy;

    public Ext() {
    }

    public void setGdpr(Integer num) {
        this.gdpr = num;
    }

    public void setGpp(String str) {
        this.gpp = str;
    }

    public void setGppSid(List<Integer> list) {
        this.gpp_sid = list;
    }

    public void setUsPrivacy(String str) {
        this.us_privacy = str;
    }

    public Ext(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }

    public Ext(Integer num, String str, List<Integer> list, String str2) {
        this.gdpr = num;
        this.gpp = str;
        this.gpp_sid = list;
        this.us_privacy = str2;
    }
}
