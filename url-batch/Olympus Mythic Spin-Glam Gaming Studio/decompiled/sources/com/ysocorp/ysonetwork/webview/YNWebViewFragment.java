package com.ysocorp.ysonetwork.webview;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewFragment;
import com.ysocorp.ysonetwork.YNManager;
import com.ysocorp.ysonetwork.enums.YNEnumPlacementType;
import com.ysocorp.ysonetwork.utils.YNLog;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class YNWebViewFragment extends WebViewFragment {
    WebView webView;
    YNWebToAndroid ynWebToAndroid;
    String key = "";
    String id = "";
    YNEnumPlacementType type = null;
    String path = "";

    public static YNWebViewFragment newInstance(String str, String str2, YNEnumPlacementType yNEnumPlacementType, String str3) {
        YNWebViewFragment yNWebViewFragment = new YNWebViewFragment();
        Bundle bundle = new Bundle();
        bundle.putString("key", str);
        bundle.putString("id", str2);
        bundle.putString("type", yNEnumPlacementType.toString());
        bundle.putString("path", str3);
        yNWebViewFragment.setArguments(bundle);
        return yNWebViewFragment;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle == null && YNManager.getInstance() != null) {
            this.webView = getWebView();
            getActivity().runOnUiThread(new Runnable() { // from class: com.ysocorp.ysonetwork.webview.YNWebViewFragment$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    YNWebViewFragment.this.lambda$onActivityCreated$0();
                }
            });
            if (getArguments() != null) {
                this.key = getArguments().getString("key");
                this.id = getArguments().getString("id");
                String string = getArguments().getString("type");
                Objects.requireNonNull(string);
                this.type = YNEnumPlacementType.stringToType(string);
                this.path = getArguments().getString("path");
            }
            YNLog.Info("[YNWebViewFragment] :: getIntent : key = " + this.key + ", id = " + this.id + ", type = " + this.type + ", path = " + this.path);
            if (YNManager.getInstance() == null) {
                YNLog.Info("[YNWebViewFragment] :: YNManager instance is null");
                finish();
                return;
            }
            final YNManager.YNRequest requestById = YNManager.getInstance().getRequestById(this.key, this.id);
            if (requestById == null) {
                YNLog.Info("[YNWebViewFragment] :: req is null");
                finish();
                return;
            } else {
                getActivity().runOnUiThread(new Runnable() { // from class: com.ysocorp.ysonetwork.webview.YNWebViewFragment$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        YNWebViewFragment.this.lambda$onActivityCreated$1(requestById);
                    }
                });
                return;
            }
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivityCreated$0() {
        this.webView.setVisibility(4);
        this.webView.bringToFront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivityCreated$1(YNManager.YNRequest yNRequest) {
        this.ynWebToAndroid = new YNWebToAndroid(yNRequest, this.type, this.path, getActivity(), this.webView) { // from class: com.ysocorp.ysonetwork.webview.YNWebViewFragment.1
            @Override // com.ysocorp.ysonetwork.webview.YNWebToAndroid
            public void finish() {
                YNWebViewFragment.this.finish();
            }
        };
    }

    @Override // android.webkit.WebViewFragment, android.app.Fragment
    public void onDestroyView() {
        YNLog.Info("[YNWebViewFragment] :: destroy");
        super.onDestroyView();
        YNManager.YNRequest requestById = YNManager.getInstance().getRequestById(this.key, this.id);
        if (requestById != null) {
            YNLog.Info("[YNWebViewFragment] :: destroy, req is not null");
            JSONObject optJSONObject = requestById.data.optJSONObject("setting");
            if (optJSONObject != null && optJSONObject.has("rso") && optJSONObject.optInt("rso", 0) == 1) {
                if (this.ynWebToAndroid != null) {
                    YNLog.Info("[YNWebViewFragment] :: destroy, req setting skip observing, call close");
                    this.ynWebToAndroid.closeEvent(false);
                }
            } else {
                requestById.isWebViewDestroyed = true;
            }
        }
        finish();
    }

    public void finish() {
        if (getActivity() == null || getActivity().isFinishing()) {
            return;
        }
        getActivity().getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }
}
