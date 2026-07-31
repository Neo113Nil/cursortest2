package com.smaato.sdk.ng.models.request;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class BrandVersion extends JsonModel {

    @BindField
    private String brand;

    @BindField
    private List<String> version;

    public BrandVersion() {
    }

    public String getBrand() {
        return this.brand;
    }

    public List<String> getVersion() {
        return this.version;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setVersion(List<String> list) {
        this.version = list;
    }

    public BrandVersion(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
