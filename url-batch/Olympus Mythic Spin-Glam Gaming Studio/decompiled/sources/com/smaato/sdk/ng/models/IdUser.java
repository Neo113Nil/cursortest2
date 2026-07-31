package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class IdUser extends JsonModel {

    @BindField
    public String SUID;

    @BindField
    public List<IdAudience> audiences;

    @BindField
    public List<IdEmail> emails;

    @BindField
    public List<IdLocation> locations;

    @BindField
    public IdUserVendor vendors;

    public IdUser() {
    }

    public IdUser(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
