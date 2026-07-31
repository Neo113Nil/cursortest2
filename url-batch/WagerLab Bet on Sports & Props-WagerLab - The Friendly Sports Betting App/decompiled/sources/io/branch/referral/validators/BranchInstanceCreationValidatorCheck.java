package io.branch.referral.validators;

import android.content.Context;
import io.branch.referral.Branch;

/* loaded from: classes7.dex */
public class BranchInstanceCreationValidatorCheck extends IntegrationValidatorCheck {
    String name = "Branch instance";
    String errorMessage = "Branch is not initialised from your Application class. Please add `Branch.getAutoInstance(this);` to your Application#onCreate() method.";
    String moreInfoLink = IntegrationValidatorConstants.branchInstanceCreationMoreInfoDocsLink;

    public BranchInstanceCreationValidatorCheck() {
        super.name = "Branch instance";
        super.errorMessage = this.errorMessage;
        super.moreInfoLink = this.moreInfoLink;
    }

    @Override // io.branch.referral.validators.IntegrationValidatorCheck
    public boolean RunTests(Context context) {
        return Branch.getInstance() != null;
    }

    @Override // io.branch.referral.validators.IntegrationValidatorCheck
    public String GetOutput(Context context, boolean z) {
        return super.GetOutput(context, RunTests(context));
    }

    @Override // io.branch.referral.validators.IntegrationValidatorCheck
    public String GetMoreInfoLink() {
        return this.moreInfoLink;
    }
}
