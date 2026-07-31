package io.branch.referral.validators;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.branch.referral.R;

/* loaded from: classes7.dex */
public class IntegrationValidatorDialogRowItem extends LinearLayout {
    Button detailsButton;
    String detailsMessage;
    String moreInfoLink;
    TextView testResultSymbol;
    TextView titleText;

    static /* synthetic */ void lambda$new$0(DialogInterface dialogInterface, int i) {
    }

    public IntegrationValidatorDialogRowItem(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.integration_validator_dialog_row_item, (ViewGroup) null);
        addView(inflate);
        this.titleText = (TextView) inflate.findViewById(R.id.title_text);
        this.testResultSymbol = (TextView) inflate.findViewById(R.id.pass_or_fail_symbol_text);
        Button button = (Button) inflate.findViewById(R.id.details_button);
        this.detailsButton = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: io.branch.referral.validators.IntegrationValidatorDialogRowItem$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntegrationValidatorDialogRowItem.this.m11016xb57d3ad3(context, view);
            }
        });
    }

    /* renamed from: lambda$new$1$io-branch-referral-validators-IntegrationValidatorDialogRowItem, reason: not valid java name */
    /* synthetic */ void m11016xb57d3ad3(Context context, View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(this.detailsMessage + "\n");
        TextView textView = new TextView(context);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setGravity(1);
        textView.setText(Html.fromHtml("<a href=" + this.moreInfoLink + "</a>"));
        builder.setView(textView);
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: io.branch.referral.validators.IntegrationValidatorDialogRowItem$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                IntegrationValidatorDialogRowItem.lambda$new$0(dialogInterface, i);
            }
        });
        builder.create().show();
    }

    public IntegrationValidatorDialogRowItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void SetTitleText(String str) {
        this.titleText.setText(str);
    }

    public void SetDetailsMessage(String str) {
        this.detailsMessage = str;
    }

    public void SetMoreInfoLink(String str) {
        this.moreInfoLink = str;
    }

    public void SetTestResult(boolean z) {
        this.testResultSymbol.setText(z ? IntegrationValidatorConstants.checkmark : IntegrationValidatorConstants.xmark);
        ToggleDetailsButton(z);
    }

    public void ToggleDetailsButton(boolean z) {
        if (z) {
            this.detailsButton.setVisibility(4);
        } else {
            this.detailsButton.setVisibility(0);
        }
    }
}
