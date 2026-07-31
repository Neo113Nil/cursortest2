package com.sglib.easymobile.androidnative.gdpr;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.sglib.easymobile.androidnative.R;
import com.unity3d.player.UnityPlayer;

/* loaded from: classes14.dex */
public class ConsentDialogToggleUI {
    private int animationDuration;
    private Context context;
    private int descriptionMinLine;
    private TextView descriptionTextView;
    private ImageButton expandArrowButton;
    private Button expandButton;
    private Boolean expandedState;
    private Drawable lessArrow;
    private Drawable moreArrow;
    private RelativeLayout relativeLayout;
    private Resources resources;
    public LinearLayout rootLayout;
    private Switch toggle;
    private ConsentDialogToggle toggleData;

    public ConsentDialogToggleUI(Context context, ConsentDialogToggle consentDialogToggle, int i, int i2) {
        this.context = context;
        this.toggleData = consentDialogToggle;
        this.descriptionMinLine = i;
        this.animationDuration = i2;
        this.resources = context.getResources();
        this.lessArrow = getIcon(R.drawable.ic_easymobile_collapse);
        this.moreArrow = getIcon(R.drawable.ic_easymobile_expand);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.consent_toggle, (ViewGroup) null, false);
        this.rootLayout = linearLayout;
        this.relativeLayout = (RelativeLayout) linearLayout.findViewById(R.id.consentToggleRelativeLayout);
        TextView textView = (TextView) this.rootLayout.findViewById(R.id.consentToggleDescriptionText);
        this.descriptionTextView = textView;
        if (Build.VERSION.SDK_INT >= 26) {
            textView.setJustificationMode(1);
        }
        this.toggle = (Switch) this.relativeLayout.findViewById(R.id.consentToggleSwitch);
        LinearLayout linearLayout2 = (LinearLayout) this.relativeLayout.findViewById(R.id.consentDialogLinearLayout);
        this.expandButton = (Button) linearLayout2.findViewById(R.id.consentToggleButton);
        this.expandArrowButton = (ImageButton) linearLayout2.findViewById(R.id.consentToggleImageButton);
        setupOnClickToggleDescription(this.expandButton);
        setupOnClickToggleDescription(this.expandArrowButton);
        setupOnClickToggleDescription(this.relativeLayout);
        setupToggleEvent(this.toggle, consentDialogToggle);
        setDescription(consentDialogToggle.getDescription());
        this.expandButton.setText(consentDialogToggle.title);
        this.expandArrowButton.setImageDrawable(this.lessArrow);
        TextView textView2 = this.descriptionTextView;
        textView2.setMinLines(textView2.getLineCount());
        this.expandedState = Boolean.TRUE;
        this.toggle.setChecked(consentDialogToggle.getIsOn().booleanValue());
        setInteractable(consentDialogToggle.getInteractable().booleanValue());
    }

    public ConsentDialogToggleUI(Context context, ConsentDialogToggle consentDialogToggle) {
        this(context, consentDialogToggle, 0, 200);
    }

    public void CollapseDescription() {
        if (this.expandedState.booleanValue()) {
            this.expandArrowButton.setImageDrawable(this.moreArrow);
            TextView textView = this.descriptionTextView;
            animateTextView(textView, textView.getLineCount(), this.descriptionMinLine, this.animationDuration);
            this.expandedState = Boolean.FALSE;
        }
    }

    public void ExpandDescription() {
        if (this.expandedState.booleanValue()) {
            return;
        }
        this.expandArrowButton.setImageDrawable(this.lessArrow);
        TextView textView = this.descriptionTextView;
        animateTextView(textView, this.descriptionMinLine, textView.getLineCount(), this.animationDuration);
        this.expandedState = Boolean.TRUE;
    }

    public Boolean isDescriptionExpanded() {
        return this.expandedState;
    }

    public String getDescription() {
        return this.toggleData.getDescription();
    }

    public String getToggleId() {
        return this.toggleData.id;
    }

    public Boolean isToggleChecked() {
        return Boolean.valueOf(this.toggle.isChecked());
    }

    public void setInteractable(boolean z) {
        Switch r0 = this.toggle;
        if (r0 == null || this.toggleData == null) {
            return;
        }
        r0.setClickable(z);
        this.toggleData.setInteractable(Boolean.valueOf(z));
    }

    public void setIsOn(boolean z, boolean z2) {
        Switch r3 = this.toggle;
        if (r3 == null || this.toggleData == null) {
            return;
        }
        r3.setChecked(z);
        this.toggleData.setIsOn(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        Utilities.setTextViewWithHTML(this.context, this.descriptionTextView, str);
    }

    private void animateTextView(final TextView textView, int i, int i2, int i3) {
        ValueAnimator duration = ValueAnimator.ofInt(i, i2).setDuration(i3);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sglib.easymobile.androidnative.gdpr.ConsentDialogToggleUI.1
            int lastValue = -1;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (intValue == this.lastValue) {
                    return;
                }
                this.lastValue = intValue;
                textView.setMaxLines(intValue);
            }
        });
        duration.start();
    }

    private void setupOnClickToggleDescription(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: com.sglib.easymobile.androidnative.gdpr.ConsentDialogToggleUI.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (ConsentDialogToggleUI.this.isDescriptionExpanded().booleanValue()) {
                    ConsentDialogToggleUI.this.CollapseDescription();
                } else {
                    ConsentDialogToggleUI.this.ExpandDescription();
                }
            }
        });
    }

    private void setupToggleEvent(Switch r2, final ConsentDialogToggle consentDialogToggle) {
        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.sglib.easymobile.androidnative.gdpr.ConsentDialogToggleUI.3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                consentDialogToggle.setIsOn(Boolean.valueOf(z));
                ConsentDialogUnityMessagesSender.SendToggleUpdatedEvent(consentDialogToggle.id, Boolean.valueOf(z));
                if (consentDialogToggle.shouldToggleDescription.booleanValue()) {
                    ConsentDialogToggleUI.this.setDescription(consentDialogToggle.getDescription());
                }
            }
        });
    }

    private Drawable getIcon(int i) {
        Resources resources = this.resources;
        if (resources == null) {
            return null;
        }
        return resources.getDrawable(i, UnityPlayer.currentActivity.getTheme());
    }
}
