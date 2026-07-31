package io.branch.referral.validators;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import io.branch.referral.Branch;
import io.branch.referral.R;

/* loaded from: classes7.dex */
public class IntegrationValidatorDialog extends Dialog {
    IntegrationValidatorDialogRowItem alternateDomainIntentFiltersRowItem;
    IntegrationValidatorDialogRowItem autoInstanceValidatorRowItem;
    IntegrationValidatorDialogRowItem domainIntentFiltersRowItem;
    Button exportLogsButton;
    Button testDeepLinkingButton;
    IntegrationValidatorDialogRowItem verifyAppLinksRowItem;
    IntegrationValidatorDialogRowItem verifyBranchKeysRowItem;
    IntegrationValidatorDialogRowItem verifyCustomDomainRowItem;
    IntegrationValidatorDialogRowItem verifyPackageNameRowItem;
    IntegrationValidatorDialogRowItem verifyURISchemeRowItem;

    public IntegrationValidatorDialog(final Context context) {
        super(context);
        requestWindowFeature(1);
        setContentView(R.layout.dialog_integration_validator);
        ((TextView) findViewById(R.id.sdk_version)).setText("SDK Version: " + Branch.getSdkVersionNumber());
        this.autoInstanceValidatorRowItem = (IntegrationValidatorDialogRowItem) findViewById(R.id.test_1_auto_instance_validator_row);
        this.verifyBranchKeysRowItem = (IntegrationValidatorDialogRowItem) findViewById(R.id.test_2_verify_branch_keys);
        this.verifyPackageNameRowItem = (IntegrationValidatorDialogRowItem) findViewById(R.id.test_3_verify_package_name);
        this.verifyURISchemeRowItem = (IntegrationValidatorDialogRowItem) findViewById(R.id.test_4_verify_uri_scheme);
        this.verifyAppLinksRowItem = (IntegrationValidatorDialogRowItem) findViewById(R.id.test_5_verify_app_links);
        this.verifyCustomDomainRowItem = (IntegrationValidatorDialogRowItem) findViewById(R.id.test_6_verify_custom_domain);
        this.domainIntentFiltersRowItem = (IntegrationValidatorDialogRowItem) findViewById(R.id.test_7_domain_intent_filters);
        this.alternateDomainIntentFiltersRowItem = (IntegrationValidatorDialogRowItem) findViewById(R.id.test_8_alternate_domain_intent_filters);
        this.exportLogsButton = (Button) findViewById(R.id.export_logs_button);
        this.testDeepLinkingButton = (Button) findViewById(R.id.test_deep_linking_button);
        this.exportLogsButton.setOnClickListener(new View.OnClickListener() { // from class: io.branch.referral.validators.IntegrationValidatorDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntegrationValidatorDialog.this.m11015x9b05c8bb(context, view);
            }
        });
        this.testDeepLinkingButton.setOnClickListener(new View.OnClickListener() { // from class: io.branch.referral.validators.IntegrationValidatorDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LinkingValidator.validate(context);
            }
        });
    }

    /* renamed from: lambda$new$0$io-branch-referral-validators-IntegrationValidatorDialog, reason: not valid java name */
    /* synthetic */ void m11015x9b05c8bb(Context context, View view) {
        shareLogsAsText(context);
    }

    public void SetTestResultForRowItem(int i, String str, boolean z, String str2, String str3) {
        switch (i) {
            case 1:
                setResult(this.autoInstanceValidatorRowItem, str, z, str2, str3);
                break;
            case 2:
                setResult(this.verifyBranchKeysRowItem, str, z, str2, str3);
                break;
            case 3:
                setResult(this.verifyPackageNameRowItem, str, z, str2, str3);
                break;
            case 4:
                setResult(this.verifyURISchemeRowItem, str, z, str2, str3);
                break;
            case 5:
                setResult(this.verifyAppLinksRowItem, str, z, str2, str3);
                break;
            case 6:
                setResult(this.verifyCustomDomainRowItem, str, z, str2, str3);
                break;
            case 7:
                setResult(this.domainIntentFiltersRowItem, str, z, str2, str3);
                break;
            case 8:
                setResult(this.alternateDomainIntentFiltersRowItem, str, z, str2, str3);
                break;
        }
    }

    private void setResult(IntegrationValidatorDialogRowItem integrationValidatorDialogRowItem, String str, boolean z, String str2, String str3) {
        integrationValidatorDialogRowItem.SetTitleText(str);
        integrationValidatorDialogRowItem.SetTestResult(z);
        integrationValidatorDialogRowItem.SetDetailsMessage(str2);
        integrationValidatorDialogRowItem.SetMoreInfoLink(str3);
    }

    private void shareLogsAsText(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", IntegrationValidator.getLogs());
        intent.setType("text/plain");
        context.startActivity(Intent.createChooser(intent, null));
    }
}
