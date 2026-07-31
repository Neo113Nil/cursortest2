package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class IdDevice extends JsonModel {

    @BindField
    public IdBattery battery;

    @BindField
    public String brand;

    @BindField
    public String id;

    @BindField
    public String manufacture;

    @BindField
    public String model;

    @BindField
    public IdOs os;

    public IdDevice() {
    }

    public IdDevice(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
