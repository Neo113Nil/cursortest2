package com.sglib.easymobile.androidnative.gdpr;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.sglib.easymobile.androidnative.Helper;
import com.sglib.easymobile.androidnative.R;
import com.sglib.easymobile.androidnative.gdpr.ConsentDialogSetting;
import com.sglib.easymobile.androidnative.gdpr.SplitContent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes13.dex */
public class ConsentDialog extends DialogFragment {
    protected boolean closedViaDialogButton;
    protected Context context;
    public HashMap<ConsentDialogButton, Button> createdButtons;
    public HashMap<ConsentDialogToggle, ConsentDialogToggleUI> createdToggles;
    protected LinearLayout dialogLayout;
    protected View rootView;
    protected ScrollView scrollView;
    protected Toolbar titleBar;

    public static ConsentDialog newInstance(String str, String str2, boolean z) {
        ConsentDialog consentDialog = new ConsentDialog();
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        bundle.putString("contents", str2);
        bundle.putBoolean(POBCTAOverlayData.KEY_CTA_DISMISSIBLE, z);
        consentDialog.setArguments(bundle);
        return consentDialog;
    }

    public void show(FragmentManager fragmentManager) {
        show(fragmentManager, "consent_dialog");
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.Theme_ConsentDialog);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.rootView = layoutInflater.inflate(R.layout.consent_dialog_layout, viewGroup, false);
        String string = getArguments().getString("title");
        String string2 = getArguments().getString("contents");
        boolean z = getArguments().getBoolean(POBCTAOverlayData.KEY_CTA_DISMISSIBLE);
        this.context = getActivity();
        Dialog dialog = getDialog();
        this.createdToggles = new HashMap<>();
        this.createdButtons = new HashMap<>();
        this.scrollView = (ScrollView) this.rootView.findViewById(R.id.consent_dialog_scrollview);
        this.dialogLayout = (LinearLayout) this.rootView.findViewById(R.id.consent_dialog_main_content);
        this.titleBar = (Toolbar) this.rootView.findViewById(R.id.consent_dialog_titlebar);
        dialog.getWindow().requestFeature(1);
        this.titleBar.setTitle(string);
        setCancelable(z);
        if (z) {
            this.titleBar.setNavigationIcon(R.drawable.ic_action_back);
            this.titleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.sglib.easymobile.androidnative.gdpr.ConsentDialog.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ConsentDialog consentDialog = ConsentDialog.this;
                    if (consentDialog.closedViaDialogButton) {
                        return;
                    }
                    consentDialog.dismiss();
                    ConsentDialogUnityMessagesSender.SendDismissedEvent();
                }
            });
        }
        List<SplitContent> parseSplitContentToArray = parseSplitContentToArray(string2);
        if (string2 == null) {
            Helper.Log("There was an error when parsing contents.");
            return this.rootView;
        }
        for (SplitContent splitContent : parseSplitContentToArray) {
            SplitContent.Type type = splitContent.type;
            if (type == SplitContent.Type.PlainText) {
                addPlainText(splitContent.content);
            } else if (type == SplitContent.Type.Button) {
                ConsentDialogButton fromJson = ConsentDialogButton.fromJson(splitContent.content);
                if (fromJson != null) {
                    addButton(fromJson);
                } else {
                    Helper.Log("Ignored a null button content when building dialog.");
                }
            } else if (type == SplitContent.Type.Toggle) {
                ConsentDialogToggle fromJson2 = ConsentDialogToggle.fromJson(splitContent.content);
                if (fromJson2 != null) {
                    addToggle(fromJson2);
                } else {
                    Helper.Log("Ignored a null toggle content when building dialog.");
                }
            } else {
                Helper.Log("Ignored a content with unknown type.");
            }
        }
        return this.rootView;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        if (this.closedViaDialogButton) {
            return;
        }
        ConsentDialogUnityMessagesSender.SendDismissedEvent();
    }

    public ConsentDialog setTitle(String str) {
        this.titleBar.setTitle(str);
        return this;
    }

    public ConsentDialogToggleUI addToggle(ConsentDialogToggle consentDialogToggle) {
        ConsentDialogToggleUI consentDialogToggleUI = new ConsentDialogToggleUI(this.context, consentDialogToggle);
        this.createdToggles.put(consentDialogToggle, consentDialogToggleUI);
        this.dialogLayout.addView(consentDialogToggleUI.rootLayout);
        return consentDialogToggleUI;
    }

    public Button addButton(final ConsentDialogButton consentDialogButton) {
        Button createButton = createButton(consentDialogButton);
        createButton.setOnClickListener(new View.OnClickListener() { // from class: com.sglib.easymobile.androidnative.gdpr.ConsentDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ConsentDialog consentDialog = ConsentDialog.this;
                consentDialog.closedViaDialogButton = true;
                consentDialog.dismiss();
                ConsentDialogUnityMessagesSender.SendCompletedEvent(consentDialogButton.id, ConsentDialog.this.createTogglesResult());
            }
        });
        createButton.setClickable(consentDialogButton.getInteractable().booleanValue());
        this.createdButtons.put(consentDialogButton, createButton);
        this.dialogLayout.addView(createButton);
        return createButton;
    }

    public TextView addPlainText(String str) {
        if (Helper.IsNullOrEmptyString(str) || str.equals(" ") || str.equals("\n")) {
            return null;
        }
        TextView textView = new TextView(this.context);
        setPlainTextColor(textView);
        if (Build.VERSION.SDK_INT >= 26) {
            textView.setJustificationMode(1);
        }
        Utilities.setTextViewWithHTML(this.context, textView, str);
        this.dialogLayout.addView(textView);
        return textView;
    }

    public void setButtonInteractable(String str, Boolean bool) {
        HashMap<ConsentDialogButton, Button> hashMap;
        if (Helper.IsNullOrEmptyString(str) || (hashMap = this.createdButtons) == null) {
            return;
        }
        for (Map.Entry<ConsentDialogButton, Button> entry : hashMap.entrySet()) {
            ConsentDialogButton key = entry.getKey();
            Button value = entry.getValue();
            if (key != null && value != null && key.id.equals(str)) {
                key.setInteractable(bool);
                value.setClickable(key.getInteractable().booleanValue());
                value.setTextColor(key.getTextColor());
                value.setBackgroundColor(key.getBackgroundColor());
            }
        }
    }

    public void setToggleInteractable(String str, boolean z) {
        Map.Entry<ConsentDialogToggle, ConsentDialogToggleUI> FindToggleWithId = FindToggleWithId(str);
        if (FindToggleWithId == null) {
            return;
        }
        FindToggleWithId.getValue().setInteractable(z);
    }

    public void setToggleIsOn(String str, boolean z, boolean z2) {
        Map.Entry<ConsentDialogToggle, ConsentDialogToggleUI> FindToggleWithId = FindToggleWithId(str);
        if (FindToggleWithId == null) {
            return;
        }
        FindToggleWithId.getValue().setIsOn(z, z2);
    }

    protected static List<SplitContent> parseSplitContentToArray(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                SplitContent fromJson = SplitContent.fromJson(jSONArray.getString(i));
                if (fromJson == null) {
                    Helper.Log("Ignored a null content when parsing array.");
                } else {
                    arrayList.add(fromJson);
                }
            }
            return arrayList;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    protected Button createButton(ConsentDialogButton consentDialogButton) {
        Button button = new Button(this.context);
        button.setText(consentDialogButton.title);
        button.setTextColor(consentDialogButton.getTextColor());
        button.setBackgroundColor(consentDialogButton.getBackgroundColor());
        button.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(ConsentDialogSetting.Button.getLeftPad(), ConsentDialogSetting.Button.getTopPad(), ConsentDialogSetting.Button.getRightPad(), ConsentDialogSetting.Button.getBottomPad());
        button.setLayoutParams(layoutParams);
        return button;
    }

    protected HashMap<String, Boolean> createTogglesResult() {
        HashMap<String, Boolean> hashMap = new HashMap<>();
        for (ConsentDialogToggleUI consentDialogToggleUI : this.createdToggles.values()) {
            hashMap.put(consentDialogToggleUI.getToggleId(), consentDialogToggleUI.isToggleChecked());
        }
        return hashMap;
    }

    protected Map.Entry<ConsentDialogToggle, ConsentDialogToggleUI> FindToggleWithId(String str) {
        HashMap<ConsentDialogToggle, ConsentDialogToggleUI> hashMap;
        if (!Helper.IsNullOrEmptyString(str) && (hashMap = this.createdToggles) != null) {
            for (Map.Entry<ConsentDialogToggle, ConsentDialogToggleUI> entry : hashMap.entrySet()) {
                ConsentDialogToggle key = entry.getKey();
                ConsentDialogToggleUI value = entry.getValue();
                if (key != null && value != null && key.id.equals(str)) {
                    return entry;
                }
            }
        }
        return null;
    }

    protected void setPlainTextColor(TextView textView) {
        textView.setTextAppearance(R.style.Theme_ConsentDialogBodyText);
    }
}
