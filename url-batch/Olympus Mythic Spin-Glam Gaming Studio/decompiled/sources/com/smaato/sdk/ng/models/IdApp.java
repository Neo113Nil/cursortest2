package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class IdApp extends JsonModel {

    @BindField
    public String bundle_id;

    @BindField
    public IdPrivacy privacy;

    @BindField
    public List<IdAppUser> users;

    public IdApp() {
    }

    public IdApp(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
