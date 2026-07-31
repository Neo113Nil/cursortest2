package net.pubnative.lite.sdk.models.request;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class Format extends JsonModel {

    @BindField
    private Integer h;

    @BindField
    private Integer hratio;

    @BindField
    private Integer w;

    @BindField
    private Integer wmin;

    @BindField
    private Integer wratio;

    public Format() {
    }

    public Integer getHeight() {
        return this.h;
    }

    public Integer getHeightRatio() {
        return this.hratio;
    }

    public Integer getWidth() {
        return this.w;
    }

    public Integer getWidthMin() {
        return this.wmin;
    }

    public Integer getWidthRatio() {
        return this.wratio;
    }

    public void setHeight(Integer num) {
        this.h = num;
    }

    public void setHeightRatio(Integer num) {
        this.hratio = num;
    }

    public void setWidth(Integer num) {
        this.w = num;
    }

    public void setWidthMin(Integer num) {
        this.wmin = num;
    }

    public void setWidthRatio(Integer num) {
        this.wratio = num;
    }

    public Format(JSONObject jSONObject) {
        fromJson(jSONObject);
    }
}
