package io.branch.referral.validators;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class PackageNameCheck extends IntegrationValidatorCheck {
    JSONObject branchAppConfig;
    BranchIntegrationModel integrationModel;
    String name = "Package Name";
    String errorMessage = "Incorrect package name in Branch dashboard. Please correct your package name in dashboard -> Configuration page.";
    String moreInfoLink = IntegrationValidatorConstants.packageNameMoreInfoDocsLink;

    public PackageNameCheck(BranchIntegrationModel branchIntegrationModel, JSONObject jSONObject) {
        super.name = "Package Name";
        super.errorMessage = this.errorMessage;
        super.moreInfoLink = this.moreInfoLink;
        this.integrationModel = branchIntegrationModel;
        this.branchAppConfig = jSONObject;
    }

    @Override // io.branch.referral.validators.IntegrationValidatorCheck
    public boolean RunTests(Context context) {
        return this.integrationModel.packageName.equals(this.branchAppConfig.optString("android_package_name"));
    }

    @Override // io.branch.referral.validators.IntegrationValidatorCheck
    public String GetOutput(Context context, boolean z) {
        return super.GetOutput(context, RunTests(context));
    }
}
