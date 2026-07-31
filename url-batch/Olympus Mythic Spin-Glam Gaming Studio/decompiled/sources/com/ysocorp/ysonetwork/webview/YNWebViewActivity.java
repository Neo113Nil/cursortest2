package com.ysocorp.ysonetwork.webview;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.webkit.WebView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.ironsource.X3;
import com.ysocorp.ysonetwork.R;
import com.ysocorp.ysonetwork.YNManager;
import com.ysocorp.ysonetwork.enums.YNEnumPlacementType;
import com.ysocorp.ysonetwork.utils.YNLog;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class YNWebViewActivity extends Activity {
    WebView webView;
    YNWebToAndroid ynWebToAndroid;
    String key = "";
    String id = "";
    YNEnumPlacementType type = null;
    String path = "";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCreate$0() {
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (bundle == null && YNManager.getInstance() != null) {
            getWindow().setFlags(1024, 1024);
            getWindow().setFlags(512, 512);
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                getWindow().setFlags(2, 2);
            }
            setRequestedOrientation(getIntent().getIntExtra(X3.i.n, -1));
            setContentView(R.layout.activity_webview);
            applyImmersiveMode();
            Intent intent = getIntent();
            this.key = intent.getStringExtra("key");
            this.id = intent.getStringExtra("id");
            String stringExtra = intent.getStringExtra("type");
            Objects.requireNonNull(stringExtra);
            this.type = YNEnumPlacementType.stringToType(stringExtra);
            this.path = intent.getStringExtra("path");
            YNLog.Info("[YNWebViewActivity] :: getIntent : key = " + this.key + ", id = " + this.id + ", type = " + this.type + ", path = " + this.path);
            WebView webView = (WebView) findViewById(R.id.webview);
            this.webView = webView;
            webView.setVisibility(4);
            setRequestedOrientation(4);
            if (YNManager.getInstance() == null) {
                YNLog.Info("[YNWebViewActivity] :: YNManager instance is null");
                finish();
                return;
            }
            YNManager.YNRequest requestById = YNManager.getInstance().getRequestById(this.key, this.id);
            if (requestById == null) {
                YNLog.Info("[YNWebViewActivity] :: req is null");
                finish();
                return;
            }
            this.ynWebToAndroid = new YNWebToAndroid(requestById, this.type, this.path, this, this.webView) { // from class: com.ysocorp.ysonetwork.webview.YNWebViewActivity.1
                @Override // com.ysocorp.ysonetwork.webview.YNWebToAndroid
                public void finish() {
                    YNWebViewActivity.this.finish();
                }
            };
            if (i >= 33) {
                onBackInvokedDispatcher = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher.registerOnBackInvokedCallback(0, new OnBackInvokedCallback() { // from class: com.ysocorp.ysonetwork.webview.YNWebViewActivity$$ExternalSyntheticLambda1
                    public final void onBackInvoked() {
                        YNWebViewActivity.lambda$onCreate$0();
                    }
                });
                return;
            }
            return;
        }
        finish();
    }

    private void applyImmersiveMode() {
        WindowInsetsController insetsController;
        int statusBars;
        int navigationBars;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setDecorFitsSystemWindows(false);
            insetsController = getWindow().getInsetsController();
            if (insetsController != null) {
                statusBars = WindowInsets.Type.statusBars();
                navigationBars = WindowInsets.Type.navigationBars();
                insetsController.hide(statusBars | navigationBars);
                insetsController.setSystemBarsBehavior(2);
                return;
            }
            return;
        }
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        applyImmersiveMode();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            applyImmersiveMode();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        YNLog.Info("[YNWebViewActivity] :: destroy");
        super.onDestroy();
        YNManager.YNRequest requestById = YNManager.getInstance().getRequestById(this.key, this.id);
        if (requestById != null) {
            YNLog.Info("[YNWebViewActivity] :: destroy, req is not null");
            JSONObject optJSONObject = requestById.data.optJSONObject("setting");
            if (optJSONObject != null && optJSONObject.has("rso") && optJSONObject.optInt("rso", 0) == 1) {
                if (this.ynWebToAndroid != null) {
                    YNLog.Info("[YNWebViewActivity] :: destroy, req setting skip observing, call close");
                    this.ynWebToAndroid.closeEvent(false);
                }
            } else {
                requestById.isWebViewDestroyed = true;
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        YNLog.Warning("DO NOT REMOVE");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }
}
