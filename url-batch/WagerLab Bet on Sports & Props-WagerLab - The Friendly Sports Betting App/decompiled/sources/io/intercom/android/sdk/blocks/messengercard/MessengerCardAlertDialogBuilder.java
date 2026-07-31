package io.intercom.android.sdk.blocks.messengercard;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.ViewCompat;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import io.intercom.android.sdk.R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/* loaded from: classes8.dex */
class MessengerCardAlertDialogBuilder extends AlertDialog.Builder {
    MessengerCardAlertDialogBuilder(Context context, Map<String, Object> map, int i, WebView webView) {
        super(context);
        setUp(context, map, i, webView);
    }

    private void setUp(Context context, final Map<String, Object> map, int i, final WebView webView) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.intercom_webview_card_input, (ViewGroup) null, false);
        setTitle((CharSequence) map.get("label"));
        final AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) inflate.findViewById(R.id.input);
        autoCompleteTextView.setText((CharSequence) map.get("currentValue"));
        autoCompleteTextView.setHint((CharSequence) map.get(ReactTextInputShadowNode.PROP_PLACEHOLDER));
        ViewCompat.setBackgroundTintList(autoCompleteTextView, ColorStateList.valueOf(i));
        setView(inflate);
        setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.blocks.messengercard.MessengerCardAlertDialogBuilder.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                MessengerCardAlertDialogBuilder.this.sendResultToWebview(webView, autoCompleteTextView.getText().toString(), map);
                ((InputMethodManager) autoCompleteTextView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(autoCompleteTextView.getWindowToken(), 0);
                dialogInterface.dismiss();
            }
        });
        setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.blocks.messengercard.MessengerCardAlertDialogBuilder.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                ((InputMethodManager) autoCompleteTextView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(autoCompleteTextView.getWindowToken(), 0);
                dialogInterface.cancel();
            }
        });
    }

    void sendResultToWebview(WebView webView, String str, Map<String, Object> map) {
        String str2;
        try {
            str2 = URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            str2 = "";
        }
        webView.evaluateJavascript("window.fallbackApp.bridgeEvent('UPDATE_TEXT', { value:'" + str2 + "', id:'" + map.get("id") + "'})", null);
    }
}
