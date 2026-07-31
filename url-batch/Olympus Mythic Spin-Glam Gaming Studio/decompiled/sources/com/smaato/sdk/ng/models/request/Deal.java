package com.smaato.sdk.ng.models.request;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class Deal extends JsonModel {

    @BindField
    private Integer at;

    @BindField
    private Float bidfloor = Float.valueOf(0.0f);

    @BindField
    private String bidfloorcur = "USD";

    @BindField
    private String id;

    @BindField
    private List<String> wadomain;

    @BindField
    private List<String> wseat;

    public Deal() {
    }

    public Integer getAuctionType() {
        return this.at;
    }

    public Float getBidFloor() {
        return this.bidfloor;
    }

    public String getBidFloorCurrency() {
        return this.bidfloorcur;
    }

    public String getId() {
        return this.id;
    }

    public List<String> getWAdomain() {
        return this.wadomain;
    }

    public List<String> getWSeat() {
        return this.wseat;
    }

    public void setAuctionType(Integer num) {
        this.at = num;
    }

    public void setBidFloor(Float f) {
        this.bidfloor = f;
    }

    public void setBidFloorCurrency(String str) {
        this.bidfloorcur = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setWAdomain(List<String> list) {
        this.wadomain = list;
    }

    public void setWSeat(List<String> list) {
        this.wseat = list;
    }

    public Deal(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
