package io.branch.referral.validators;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class AppLinksCheck extends IntegrationValidatorCheck {
    JSONObject branchAppConfig;
    BranchIntegrationModel integrationModel;
    String name = "App Links";
    String errorMessage = "Could not find any App Link hosts to support Android AppLinks. Please add intent filter for handling AppLinks in your Android Manifest file";
    String moreInfoLink = IntegrationValidatorConstants.appLinksMoreInfoDocsLink;

    public AppLinksCheck(BranchIntegrationModel branchIntegrationModel, JSONObject jSONObject) {
        super.name = "App Links";
        super.errorMessage = this.errorMessage;
        super.moreInfoLink = this.moreInfoLink;
        this.integrationModel = branchIntegrationModel;
        this.branchAppConfig = jSONObject;
    }

    @Override // io.branch.referral.validators.IntegrationValidatorCheck
    public boolean RunTests(Context context) {
        String optString = this.branchAppConfig.optString("default_short_url_domain");
        return (this.integrationModel.applinkScheme.isEmpty() || TextUtils.isEmpty(optString) || !checkIfIntentAddedForLinkDomain(optString)) ? false : true;
    }

    @Override // io.branch.referral.validators.IntegrationValidatorCheck
    public String GetOutput(Context context, boolean z) {
        return super.GetOutput(context, RunTests(context));
    }

    private boolean checkIfIntentAddedForLinkDomain(String str) {
        if (TextUtils.isEmpty(str) || this.integrationModel.applinkScheme == null) {
            return false;
        }
        Iterator<String> it = this.integrationModel.applinkScheme.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next())) {
                return true;
            }
        }
        return false;
    }
}
