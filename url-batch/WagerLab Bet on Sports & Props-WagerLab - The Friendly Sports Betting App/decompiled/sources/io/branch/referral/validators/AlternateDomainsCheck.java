package io.branch.referral.validators;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class AlternateDomainsCheck extends IntegrationValidatorCheck {
    JSONObject branchAppConfig;
    BranchIntegrationModel integrationModel;
    String name = "Alt Domains";
    String errorMessage = "Could not find intent filter to support alternate link domain. Please add intent filter for handling alternate link domain in your Android Manifest file";
    String moreInfoLink = IntegrationValidatorConstants.alternateDomainsMoreInfoDocsLink;

    public AlternateDomainsCheck(BranchIntegrationModel branchIntegrationModel, JSONObject jSONObject) {
        super.name = "Alt Domains";
        super.errorMessage = this.errorMessage;
        super.moreInfoLink = this.moreInfoLink;
        this.integrationModel = branchIntegrationModel;
        this.branchAppConfig = jSONObject;
    }

    @Override // io.branch.referral.validators.IntegrationValidatorCheck
    public boolean RunTests(Context context) {
        String optString = this.branchAppConfig.optString("alternate_short_url_domain");
        return TextUtils.isEmpty(optString) || checkIfIntentAddedForLinkDomain(optString);
    }

    @Override // io.branch.referral.validators.IntegrationValidatorCheck
    public String GetOutput(Context context, boolean z) {
        return super.GetOutput(context, RunTests(context));
    }

    private boolean checkIfIntentAddedForLinkDomain(String str) {
        if (TextUtils.isEmpty(str)) {
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
