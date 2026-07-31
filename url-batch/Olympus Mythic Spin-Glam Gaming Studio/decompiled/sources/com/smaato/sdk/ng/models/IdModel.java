package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class IdModel extends JsonModel {

    @BindField
    public List<IdApp> apps;

    @BindField
    public IdDevice device;

    @BindField
    public List<IdUser> users;

    public IdModel() {
    }

    public IdModel(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
