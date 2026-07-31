package io.branch.referral.validators;

import android.content.Context;

/* loaded from: classes7.dex */
public abstract class IntegrationValidatorCheck {
    String errorMessage;
    String moreInfoLink;
    String name;

    public abstract boolean RunTests(Context context);

    public String GetOutput(Context context, boolean z) {
        RunTests(context);
        return this.errorMessage;
    }

    public String GetTestName() {
        return this.name;
    }

    public String GetMoreInfoLink() {
        return this.moreInfoLink;
    }
}
