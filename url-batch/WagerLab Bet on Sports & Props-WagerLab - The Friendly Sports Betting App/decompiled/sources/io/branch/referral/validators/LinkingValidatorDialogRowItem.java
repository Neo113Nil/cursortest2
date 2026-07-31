package io.branch.referral.validators;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.branch.indexing.BranchUniversalObject;
import io.branch.referral.Branch;
import io.branch.referral.BranchError;
import io.branch.referral.R;
import io.branch.referral.util.LinkProperties;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class LinkingValidatorDialogRowItem extends LinearLayout {
    private static final String TAG = "BranchSDK";
    Button actionButton;
    String canonicalIdentifier;
    Context context;
    Button debugButton;
    String debugText;
    Button infoButton;
    String infoText;
    HashMap<String, String> linkDataParams;
    String routingKey;
    String routingValue;
    TextView titleText;

    public LinkingValidatorDialogRowItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.context = context;
    }

    public LinkingValidatorDialogRowItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.context = context;
    }

    public void InitializeRow(String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, String... strArr) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.linking_validator_dialog_row_item, (ViewGroup) null);
        addView(inflate);
        this.titleText = (TextView) inflate.findViewById(R.id.linkingValidatorRowTitleText);
        this.infoButton = (Button) inflate.findViewById(R.id.linkingValidatorRowInfoButton);
        this.actionButton = (Button) inflate.findViewById(R.id.linkingValidatorRowActionButton);
        this.debugButton = (Button) inflate.findViewById(R.id.linkingValidatorRowDebugButton);
        this.titleText.setText(str);
        this.infoText = str2;
        this.debugText = str3;
        this.routingKey = str4;
        this.routingValue = str5;
        this.canonicalIdentifier = str6;
        this.linkDataParams = new HashMap<>();
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            this.linkDataParams.put(strArr[i2], strArr[i2 + 1]);
        }
        this.linkDataParams.put(str4, str5);
        this.infoButton.setOnClickListener(new View.OnClickListener() { // from class: io.branch.referral.validators.LinkingValidatorDialogRowItem$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LinkingValidatorDialogRowItem.this.m11018x92648650(view);
            }
        });
        this.debugButton.setOnClickListener(new View.OnClickListener() { // from class: io.branch.referral.validators.LinkingValidatorDialogRowItem$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LinkingValidatorDialogRowItem.this.m11019x4cda26d1(view);
            }
        });
        if (z) {
            this.actionButton.setText("Share");
            this.actionButton.setOnClickListener(new View.OnClickListener() { // from class: io.branch.referral.validators.LinkingValidatorDialogRowItem$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LinkingValidatorDialogRowItem.this.m11020x74fc752(view);
                }
            });
            return;
        }
        this.actionButton.setText("Test");
        if (i == 4) {
            this.actionButton.setOnClickListener(new View.OnClickListener() { // from class: io.branch.referral.validators.LinkingValidatorDialogRowItem$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LinkingValidatorDialogRowItem.this.m11021xc1c567d3(view);
                }
            });
        } else if (i == 5) {
            this.actionButton.setOnClickListener(new View.OnClickListener() { // from class: io.branch.referral.validators.LinkingValidatorDialogRowItem$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LinkingValidatorDialogRowItem.this.m11022x7c3b0854(view);
                }
            });
        }
    }

    /* renamed from: lambda$InitializeRow$0$io-branch-referral-validators-LinkingValidatorDialogRowItem, reason: not valid java name */
    /* synthetic */ void m11018x92648650(View view) {
        HandleInfoButtonClicked();
    }

    /* renamed from: lambda$InitializeRow$1$io-branch-referral-validators-LinkingValidatorDialogRowItem, reason: not valid java name */
    /* synthetic */ void m11019x4cda26d1(View view) {
        HandleDebugButtonClicked();
    }

    /* renamed from: lambda$InitializeRow$2$io-branch-referral-validators-LinkingValidatorDialogRowItem, reason: not valid java name */
    /* synthetic */ void m11020x74fc752(View view) {
        HandleShareButtonClicked();
    }

    /* renamed from: lambda$InitializeRow$3$io-branch-referral-validators-LinkingValidatorDialogRowItem, reason: not valid java name */
    /* synthetic */ void m11021xc1c567d3(View view) {
        HandleWarmStartClick();
    }

    /* renamed from: lambda$InitializeRow$4$io-branch-referral-validators-LinkingValidatorDialogRowItem, reason: not valid java name */
    /* synthetic */ void m11022x7c3b0854(View view) {
        HandleForegroundLinkClick();
    }

    private void HandleInfoButtonClicked() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context);
        builder.setMessage(this.infoText).setTitle(this.titleText.getText());
        builder.create().show();
    }

    private void HandleShareButtonClicked() {
        LinkProperties linkProperties = new LinkProperties();
        for (String str : this.linkDataParams.keySet()) {
            linkProperties.addControlParameter(str, this.linkDataParams.get(str));
        }
        Branch.getInstance().share(getActivity(this.context), new BranchUniversalObject().setCanonicalIdentifier(this.canonicalIdentifier), linkProperties, new Branch.BranchNativeLinkShareListener() { // from class: io.branch.referral.validators.LinkingValidatorDialogRowItem.1
            @Override // io.branch.referral.Branch.BranchNativeLinkShareListener
            public void onChannelSelected(String str2) {
            }

            @Override // io.branch.referral.Branch.BranchNativeLinkShareListener
            public void onLinkShareResponse(String str2, BranchError branchError) {
            }
        }, this.titleText.getText().toString(), this.infoText);
    }

    private void HandleDebugButtonClicked() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context);
        builder.setMessage(this.debugText).setTitle(((Object) this.titleText.getText()) + " not working?");
        builder.create().show();
    }

    private void HandleWarmStartClick() {
        getActivity(this.context).moveTaskToBack(true);
        HandleForegroundLinkClick();
    }

    private void HandleForegroundLinkClick() {
        BranchUniversalObject canonicalIdentifier = new BranchUniversalObject().setCanonicalIdentifier(this.canonicalIdentifier);
        LinkProperties linkProperties = new LinkProperties();
        linkProperties.addControlParameter(this.routingKey, this.routingValue);
        for (int i = 0; i < this.linkDataParams.size(); i += 2) {
            linkProperties.addControlParameter(this.linkDataParams.get(Integer.valueOf(i)), this.linkDataParams.get(Integer.valueOf(i + 1)));
        }
        String shortUrl = canonicalIdentifier.getShortUrl(this.context, linkProperties);
        Intent intent = new Intent(getContext(), getActivity(this.context).getClass());
        intent.putExtra("branch", shortUrl);
        intent.putExtra("branch_force_new_session", true);
        getActivity(this.context).startActivity(intent);
    }

    public Activity getActivity(Context context) {
        if (context == null || !(context instanceof ContextWrapper)) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return getActivity(((ContextWrapper) context).getBaseContext());
    }
}
