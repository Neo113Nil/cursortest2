package net.pubnative.lite.sdk.models.request;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class Publisher extends JsonModel {

    @BindField
    private List<String> cat;

    @BindField
    private String domain;

    @BindField
    private String id;

    @BindField
    private String name;

    public Publisher() {
    }

    public List<String> getCategories() {
        return this.cat;
    }

    public String getDomain() {
        return this.domain;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setCategories(List<String> list) {
        this.cat = list;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public Publisher(JSONObject jSONObject) {
        fromJson(jSONObject);
    }
}
