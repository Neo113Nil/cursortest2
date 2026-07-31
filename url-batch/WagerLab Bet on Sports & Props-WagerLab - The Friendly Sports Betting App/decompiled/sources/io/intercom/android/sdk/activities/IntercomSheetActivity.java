package io.intercom.android.sdk.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.conversation.JavascriptRunner;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Sheet;
import io.intercom.android.sdk.sheets.SheetListener;
import io.intercom.android.sdk.sheets.SheetWebViewPresenter;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.views.IntercomErrorView;
import io.intercom.android.sdk.views.IntercomToolbar;
import java.util.HashMap;
import java.util.Map;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* loaded from: classes8.dex */
public class IntercomSheetActivity extends IntercomBaseActivity implements IntercomToolbar.Listener, SheetListener {
    private static final int ENTRANCE_ANIMATION_TIME_MS = 250;
    private static final int EXIT_ANIMATION_TIME_MS = 200;
    private static final String PARCEL_CARD_URI = "parcel_card_uri";
    private static final String PARCEL_CONVERSATION_ID = "parcel_conversation_id";
    private static final String PARCEL_IS_HOME_SCREEN = "parcel_is_home_screen";
    private static final String PARCEL_PARAMS = "parcel_params";
    private static final String PARCEL_SHEET_URL = "parcel_sheet_url";
    private static final int WEBVIEW_FADE_IN_TIME_MS = 300;
    private Provider<AppConfig> appConfigProvider;
    private String cardUri;
    private View containerView;
    private IntercomErrorView intercomErrorView;
    private IntercomToolbar intercomToolbar;
    private boolean isHomeScreen;
    private JavascriptRunner jsRunner;
    ProgressBar loadingBar;
    private MetricTracker metricTracker;
    private ActivityResultLauncher<Intent> pickFile;
    private SheetWebViewPresenter presenter;
    private int secondaryColor;
    public ValueCallback<Uri[]> valueCallback;
    WebView webView;
    private String sheetUrl = "";
    private String conversationId = "";
    private HashMap params = new HashMap();

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onCloseClicked() {
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onToolbarClicked() {
    }

    @Override // io.intercom.android.sdk.activities.IntercomBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Injector injector = Injector.get();
        this.metricTracker = injector.getMetricTracker();
        Provider<AppConfig> appConfigProvider = injector.getAppConfigProvider();
        this.appConfigProvider = appConfigProvider;
        this.secondaryColor = appConfigProvider.get().getSecondaryColor();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.sheetUrl = extras.getString(PARCEL_SHEET_URL, "");
            this.conversationId = extras.getString(PARCEL_CONVERSATION_ID, "");
            this.params = (HashMap) extras.getSerializable(PARCEL_PARAMS);
            this.cardUri = extras.getString(PARCEL_CARD_URI);
            this.isHomeScreen = extras.getBoolean(PARCEL_IS_HOME_SCREEN, false);
        }
        setContentView(R.layout.intercom_activity_sheet);
        setUpToolbar(this.appConfigProvider);
        this.containerView = findViewById(R.id.sheet_root);
        if (TextUtils.isEmpty(this.sheetUrl) || this.params == null) {
            closeSheet();
        }
        this.containerView.setVisibility(8);
        this.containerView.post(new Runnable() { // from class: io.intercom.android.sdk.activities.IntercomSheetActivity.1
            @Override // java.lang.Runnable
            public void run() {
                IntercomSheetActivity.this.animateWindowIn();
            }
        });
        insertWebView();
        this.jsRunner = new JavascriptRunner(this.webView);
        SheetWebViewPresenter sheetWebViewPresenter = new SheetWebViewPresenter(this.webView, this.jsRunner, this.sheetUrl, this, injector);
        this.presenter = sheetWebViewPresenter;
        sheetWebViewPresenter.setUpWebView();
        IntercomErrorView intercomErrorView = (IntercomErrorView) this.containerView.findViewById(R.id.error_layout_sheet);
        this.intercomErrorView = intercomErrorView;
        intercomErrorView.setActionButtonTextColor(ColorUtils.primaryOrDarkColor(this, this.appConfigProvider.get()));
        this.intercomErrorView.setActionButtonClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.activities.IntercomSheetActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IntercomSheetActivity.this.loadSheet(Injector.get().getApi());
            }
        });
        this.pickFile = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: io.intercom.android.sdk.activities.IntercomSheetActivity$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                IntercomSheetActivity.this.m11052x45f26e9b((ActivityResult) obj);
            }
        });
        loadSheet(injector.getApi());
    }

    /* renamed from: lambda$onCreate$0$io-intercom-android-sdk-activities-IntercomSheetActivity, reason: not valid java name */
    /* synthetic */ void m11052x45f26e9b(ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1 && activityResult.getData() != null) {
            this.valueCallback.onReceiveValue(new Uri[]{activityResult.getData().getData()});
        } else {
            this.valueCallback.onReceiveValue(null);
        }
    }

    private void setUpToolbar(Provider<AppConfig> provider) {
        AppConfig appConfig = provider.get();
        IntercomToolbar intercomToolbar = (IntercomToolbar) findViewById(R.id.intercom_toolbar);
        this.intercomToolbar = intercomToolbar;
        intercomToolbar.updateToolbarColors(appConfig);
        this.intercomToolbar.setListener(this);
        this.intercomToolbar.setSubtitleVisibility(8);
        this.intercomToolbar.setBackgroundColor(this.secondaryColor);
        this.intercomToolbar.setLeftNavigationItemVisibility(0);
        this.intercomToolbar.setCloseButtonVisibility(8);
        this.intercomToolbar.setLeftNavigationIcon(ContextCompat.getDrawable(this, R.drawable.intercom_close));
        ProgressBar progressBar = (ProgressBar) this.intercomToolbar.findViewById(R.id.toolbar_progress_bar);
        this.loadingBar = progressBar;
        progressBar.setProgressDrawable(new LayerDrawable(new Drawable[]{new ColorDrawable(appConfig.getSecondaryColorDark()), new ScaleDrawable(new ColorDrawable(-1), GravityCompat.START, 1.0f, -1.0f)}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadSheet(Api api) {
        this.loadingBar.setVisibility(0);
        this.intercomErrorView.setVisibility(8);
        api.fetchSheet(this.params, new Callback<Sheet.Builder>() { // from class: io.intercom.android.sdk.activities.IntercomSheetActivity.3
            @Override // retrofit2.Callback
            public void onResponse(Call<Sheet.Builder> call, Response<Sheet.Builder> response) {
                if (!response.isSuccessful() || response.body() == null) {
                    IntercomSheetActivity.this.showErrorView();
                    return;
                }
                IntercomSheetActivity.this.intercomErrorView.setVisibility(8);
                IntercomSheetActivity.this.presenter.loadBundle(response.body().build().getBody());
                IntercomSheetActivity.this.metricTracker.viewedMessengerSheet(IntercomSheetActivity.this.conversationId, IntercomSheetActivity.this.sheetUrl, IntercomSheetActivity.this.isHomeScreen);
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<Sheet.Builder> call, Throwable th) {
                IntercomSheetActivity.this.showErrorView();
            }
        });
    }

    private void insertWebView() {
        try {
            this.webView = new WebView(this);
        } catch (Resources.NotFoundException unused) {
            this.webView = new WebView(getApplicationContext());
        }
        this.webView.setAlpha(0.0f);
        this.webView.setId(R.id.intercom_sheet_webview);
        this.webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ((FrameLayout) findViewById(R.id.sheet_view)).addView(this.webView, 0);
        this.webView.setWebChromeClient(new WebChromeClient() { // from class: io.intercom.android.sdk.activities.IntercomSheetActivity.4
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                IntercomSheetActivity.this.loadingBar.setProgress(i);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                IntercomSheetActivity.this.valueCallback = valueCallback;
                IntercomSheetActivity.this.pickFile.launch(fileChooserParams.createIntent());
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showErrorView() {
        this.loadingBar.setVisibility(8);
        this.intercomErrorView.setVisibility(0);
    }

    void closeSheet() {
        this.metricTracker.closedMessengerSheet(this.conversationId, this.sheetUrl, this.isHomeScreen);
        hideKeyboard();
        animateWindowOut();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (this.webView.canGoBack()) {
            this.webView.goBack();
        } else {
            closeSheet();
        }
    }

    public static Intent buildIntent(Context context, String str, Map<String, Object> map, String str2, String str3) {
        Intent intent = new Intent(context, (Class<?>) IntercomSheetActivity.class);
        intent.putExtra(PARCEL_SHEET_URL, str);
        intent.putExtra(PARCEL_PARAMS, new HashMap(map));
        intent.putExtra(PARCEL_CARD_URI, str2);
        intent.putExtra(PARCEL_CONVERSATION_ID, str3);
        return intent;
    }

    private void hideKeyboard() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void animateWindowIn() {
        this.containerView.setVisibility(0);
        this.containerView.setY(findViewById(android.R.id.content).getMeasuredHeight());
        this.containerView.animate().y(0.0f).setInterpolator(new AccelerateInterpolator()).setDuration(250L).start();
    }

    private void animateWindowOut() {
        this.containerView.animate().y(getWindow().getDecorView().getHeight()).setDuration(200L).setListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.activities.IntercomSheetActivity.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IntercomSheetActivity.this.finish();
                IntercomSheetActivity.this.overridePendingTransition(0, 0);
            }
        }).start();
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onInboxClicked() {
        closeSheet();
    }

    @Override // io.intercom.android.sdk.sheets.SheetListener
    public void onWebViewFinishedLoad() {
        this.jsRunner.runPendingScripts();
        this.webView.animate().alpha(1.0f).setDuration(300L).start();
        this.loadingBar.setVisibility(8);
    }

    @Override // io.intercom.android.sdk.sheets.SheetListener
    public void onSheetTitleAction(String str) {
        this.intercomToolbar.setTitle(str);
    }

    @Override // io.intercom.android.sdk.sheets.SheetListener
    public void onCloseSheetAction() {
        closeSheet();
    }

    @Override // io.intercom.android.sdk.sheets.SheetListener
    public void onSubmitSheetAction(final Map<String, Object> map) {
        Injector.get().getApi().submitSheet(this.cardUri, map, new Callback<Void>() { // from class: io.intercom.android.sdk.activities.IntercomSheetActivity.6
            @Override // retrofit2.Callback
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.isSuccessful()) {
                    IntercomSheetActivity.this.cardUpdated();
                    IntercomSheetActivity.this.closeSheet();
                } else {
                    IntercomSheetActivity.this.showSubmitActionError(map);
                }
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<Void> call, Throwable th) {
                IntercomSheetActivity.this.showSubmitActionError(map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cardUpdated() {
        Injector.get().getDataLayer().emitEvent(IntercomEvent.CardUpdated.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSubmitActionError(final Map<String, Object> map) {
        AlertDialog create = new AlertDialog.Builder(this).setTitle(R.string.intercom_couldnt_load_content).setMessage(R.string.intercom_give_it_another_try).setPositiveButton(R.string.intercom_reload, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.activities.IntercomSheetActivity.7
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IntercomSheetActivity.this.onSubmitSheetAction(map);
            }
        }).create();
        create.show();
        create.getButton(-1).setTextColor(ColorUtils.primaryOrDarkColor(this, this.appConfigProvider.get()));
    }
}
