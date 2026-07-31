package io.branch.referral.validators;

import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import java.util.Objects;

/* loaded from: classes7.dex */
public class LinkingValidator {
    private static LinkingValidator instance;
    private LinkingValidatorDialog linkingValidatorDialog;

    private LinkingValidator(Context context) {
    }

    public static void validate(Context context) {
        if (instance == null) {
            instance = new LinkingValidator(context);
        }
        instance.linkingValidatorDialog = new LinkingValidatorDialog(context);
        instance.validateDeepLinkRouting(context);
    }

    private void validateDeepLinkRouting(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(((Window) Objects.requireNonNull(instance.linkingValidatorDialog.getWindow())).getAttributes());
        layoutParams.width = -1;
        layoutParams.height = 2000;
        instance.linkingValidatorDialog.show();
        instance.linkingValidatorDialog.getWindow().setAttributes(layoutParams);
    }
}
