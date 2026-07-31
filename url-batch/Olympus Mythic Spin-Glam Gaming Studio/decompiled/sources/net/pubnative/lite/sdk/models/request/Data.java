package net.pubnative.lite.sdk.models.request;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class Data extends JsonModel {

    @BindField
    private DataExtension ext;

    @BindField
    private String id;

    @BindField
    private String name;

    @BindField
    private List<Segment> segment;

    public Data() {
    }

    public DataExtension getExt() {
        return this.ext;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<Segment> getSegment() {
        return this.segment;
    }

    public void setExt(DataExtension dataExtension) {
        this.ext = dataExtension;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSegment(List<Segment> list) {
        this.segment = list;
    }

    public Data(JSONObject jSONObject) {
        fromJson(jSONObject);
    }
}
