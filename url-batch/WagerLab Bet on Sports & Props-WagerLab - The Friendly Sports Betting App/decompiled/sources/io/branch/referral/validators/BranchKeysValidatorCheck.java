package io.branch.referral.validators;

import android.content.Context;
import android.text.TextUtils;
import io.branch.referral.BranchUtil;

/* loaded from: classes7.dex */
public class BranchKeysValidatorCheck extends IntegrationValidatorCheck {
    String name = "Branch Keys";
    String errorMessage = "Unable to read Branch keys from your application. Did you forget to add Branch keys in your application?.";
    String moreInfoLink = IntegrationValidatorConstants.branchKeysMoreInfoDocsLink;

    public BranchKeysValidatorCheck() {
        super.name = "Branch Keys";
        super.errorMessage = this.errorMessage;
        super.moreInfoLink = this.moreInfoLink;
    }

    @Override // io.branch.referral.validators.IntegrationValidatorCheck
    public boolean RunTests(Context context) {
        return !TextUtils.isEmpty(BranchUtil.readBranchKey(context));
    }

    @Override // io.branch.referral.validators.IntegrationValidatorCheck
    public String GetOutput(Context context, boolean z) {
        return super.GetOutput(context, RunTests(context));
    }
}
