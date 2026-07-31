package com.pubmatic.sdk.openwrap.core.rewarded;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBAdFormat;
import com.pubmatic.sdk.common.POBDataType;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBAdRendererListener;
import com.pubmatic.sdk.common.cache.POBAdViewCacheService;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.log.POBLogConstants;
import com.pubmatic.sdk.common.ui.POBFullScreenActivityBackPressListener;
import com.pubmatic.sdk.common.ui.POBFullScreenActivityListener;
import com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener;
import com.pubmatic.sdk.common.ui.POBRewardedAdRendering;
import com.pubmatic.sdk.openwrap.core.POBRenderer;
import com.pubmatic.sdk.openwrap.core.R;
import com.pubmatic.sdk.video.player.POBVastPlayer;
import com.pubmatic.sdk.video.renderer.POBVideoRendering;
import com.pubmatic.sdk.video.renderer.POBVideoRenderingListener;
import com.pubmatic.sdk.video.renderer.POBVideoSkipEventListener;
import com.pubmatic.sdk.webrendering.ui.POBFullScreenActivity;

/* loaded from: classes13.dex */
public class POBRewardedAdRenderer implements POBRewardedAdRendering, POBAdRendererListener, POBVideoRenderingListener, POBVideoSkipEventListener, POBFullScreenActivityBackPressListener {
    private POBVideoRendering a;
    private POBRewardedAdRendererListener b;
    private POBAdDescriptor c;
    private int d;
    private final int e;
    private final Context f;
    private POBFullScreenActivityListener g;
    private View h;
    private Activity i;
    private boolean j;
    private AlertDialog k;
    private final POBSkipConfirmationInfo l;
    private String m;
    private final View.OnClickListener n = new a();

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (POBRewardedAdRenderer.this.k != null) {
                POBRewardedAdRenderer.this.k.dismiss();
                if (view.getId() == R.id.pob_skip_alert_resume_btn) {
                    POBRewardedAdRenderer.this.a(false);
                } else if (view.getId() == R.id.pob_skip_alert_close_btn) {
                    POBRewardedAdRenderer.this.a(true);
                }
            }
        }
    }

    class b implements POBFullScreenActivityListener {
        final /* synthetic */ View a;

        b(View view) {
            this.a = view;
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenActivityListener
        public void onCreate(Activity activity) {
            POBRewardedAdRenderer.this.i = activity;
            View view = this.a;
            if (view instanceof POBVastPlayer) {
                ((POBVastPlayer) view).setBaseContext(activity);
            }
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenActivityListener
        public void onDestroy() {
            POBRewardedAdRenderer.this.b();
            View view = this.a;
            if (view instanceof POBVastPlayer) {
                ((POBVastPlayer) view).setBaseContext(POBRewardedAdRenderer.this.f.getApplicationContext());
            }
        }
    }

    public POBRewardedAdRenderer(@NonNull Context context, int i, @NonNull POBSkipConfirmationInfo pOBSkipConfirmationInfo) {
        this.f = context;
        this.e = i;
        this.l = pOBSkipConfirmationInfo;
    }

    private void d() {
        POBVideoRendering pOBVideoRendering = this.a;
        if (pOBVideoRendering != null) {
            pOBVideoRendering.invalidateExpiration();
        }
    }

    @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendering
    public void destroy() {
        POBVideoRendering pOBVideoRendering = this.a;
        if (pOBVideoRendering != null) {
            pOBVideoRendering.destroy();
            this.a = null;
        }
        this.b = null;
        AlertDialog alertDialog = this.k;
        if (alertDialog != null) {
            if (alertDialog.isShowing()) {
                this.k.dismiss();
            }
            this.k = null;
        }
        POBInstanceProvider.getAdViewCacheService().popStoredAdView(Integer.valueOf(hashCode()));
        this.g = null;
        Intent intent = new Intent(POBFullScreenActivity.ACTIONS.POB_CLOSE.name());
        intent.putExtra(POBFullScreenActivity.RENDERER_IDENTIFIER, hashCode());
        try {
            POBFullScreenActivity.sendBroadcast(this.f, intent);
        } catch (Exception e) {
            POBLog.warn("POBRewardedAdRenderer", "Unable to send broadcast to full screen activity to close the ad for %s. Error: %s", intent.getAction(), e.getMessage());
        }
        this.i = null;
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRenderingListener
    public void notifyAdEvent(@NonNull POBDataType.POBVideoAdEventType pOBVideoAdEventType) {
        if (pOBVideoAdEventType == POBDataType.POBVideoAdEventType.COMPLETE) {
            this.j = true;
            POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.b;
            if (pOBRewardedAdRendererListener != null) {
                pOBRewardedAdRendererListener.onReceiveReward(null);
            }
        }
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoSkipEventListener
    public void onAdAboutToSkip() {
        c();
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdExpired() {
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.b;
        if (pOBRewardedAdRendererListener != null) {
            pOBRewardedAdRendererListener.onAdExpired();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdImpression() {
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.b;
        if (pOBRewardedAdRendererListener != null) {
            pOBRewardedAdRendererListener.onAdImpression();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdInteractionStarted() {
        a();
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdInteractionStopped() {
        b();
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdReadyToRefresh(int i) {
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdRender(@NonNull View view, @Nullable POBAdDescriptor pOBAdDescriptor) {
        this.h = view;
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.b;
        if (pOBRewardedAdRendererListener != null) {
            pOBRewardedAdRendererListener.onAdRender(pOBAdDescriptor);
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdRenderingFailed(@NonNull POBError pOBError) {
        this.j = true;
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.b;
        if (pOBRewardedAdRendererListener != null) {
            pOBRewardedAdRendererListener.onAdRenderingFailed(pOBError);
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdUnload() {
    }

    @Override // com.pubmatic.sdk.common.ui.POBFullScreenActivityBackPressListener
    public void onBackPressed() {
        c();
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onLeavingApplication() {
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.b;
        if (pOBRewardedAdRendererListener != null) {
            pOBRewardedAdRendererListener.onLeavingApplication();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onRenderAdClick() {
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.b;
        if (pOBRewardedAdRendererListener != null) {
            pOBRewardedAdRendererListener.onAdClicked();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onRenderProcessGone() {
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRenderingListener
    public void onSkipOptionUpdate(boolean z) {
        POBFullScreenActivity.updateBackButtonState(this.f, hashCode(), z);
    }

    @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendering
    public void renderAd(@NonNull POBAdDescriptor pOBAdDescriptor) {
        POBLog.debug("POBRewardedAdRenderer", POBLogConstants.MSG_RENDERING_ON_START, new Object[0]);
        this.c = pOBAdDescriptor;
        this.a = POBRenderer.videoRenderer(this.f, pOBAdDescriptor, this.e, POBAdFormat.REWARDEDAD);
        if (pOBAdDescriptor.getRenderableContent() != null) {
            this.a.setAdRendererListener(this);
            this.a.setVideoRenderingListener(this);
            this.a.setVideoSkipEventListener(this);
            this.a.setWatermark(this.m);
            this.a.renderAd(pOBAdDescriptor);
            return;
        }
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.b;
        if (pOBRewardedAdRendererListener != null) {
            pOBRewardedAdRendererListener.onAdRenderingFailed(new POBError(1009, POBLogConstants.MSG_RENDERING_FAILED_ERROR + pOBAdDescriptor));
        }
    }

    @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendering
    public void setAdRendererListener(@Nullable POBRewardedAdRendererListener pOBRewardedAdRendererListener) {
        this.b = pOBRewardedAdRendererListener;
    }

    @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendering
    public void setWatermark(@Nullable String str) {
        this.m = str;
    }

    @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendering
    public void show() {
        View view;
        POBLog.info("POBRewardedAdRenderer", POBLogConstants.MSG_SHOW_REWARDED_AD, new Object[0]);
        POBAdDescriptor pOBAdDescriptor = this.c;
        if (pOBAdDescriptor == null || (view = this.h) == null) {
            return;
        }
        a(pOBAdDescriptor, view);
        if (POBInstanceProvider.getAdViewCacheService().getStoredAdView(Integer.valueOf(hashCode())) != null) {
            try {
                POBFullScreenActivity.startFullScreenActivity(this.f, this.c.isVideo(), com.pubmatic.sdk.webrendering.R.style.POBBlackTheme, hashCode());
                a();
                return;
            } catch (Exception e) {
                POBLog.error("POBRewardedAdRenderer", "Unable to start full screen activity for ad renderer %s. Error: %s", Integer.valueOf(hashCode()), e.getMessage());
                onAdRenderingFailed(new POBError(1009, POBLogConstants.REWARDED_AD_SHOW_ERROR + e.getMessage()));
                return;
            }
        }
        String str = POBLogConstants.MSG_REWARDED_AD_SHOW_ERROR + this.c;
        POBLog.error("POBRewardedAdRenderer", str, new Object[0]);
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.b;
        if (pOBRewardedAdRendererListener != null) {
            pOBRewardedAdRendererListener.onAdRenderingFailed(new POBError(1009, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        int i = this.d - 1;
        this.d = i;
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.b;
        if (pOBRewardedAdRendererListener == null || i != 0) {
            return;
        }
        pOBRewardedAdRendererListener.onAdInteractionStopped();
        destroy();
    }

    private void c() {
        if (this.j) {
            Activity activity = this.i;
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        Activity activity2 = this.i;
        if (activity2 == null || activity2.isFinishing() || this.i.isDestroyed()) {
            return;
        }
        if (this.k == null) {
            View inflate = LayoutInflater.from(this.i).inflate(R.layout.pob_layout_rewardedad_skip_alert, (ViewGroup) null);
            AlertDialog.Builder cancelable = new AlertDialog.Builder(this.i, R.style.SkipAlertDialog).setView(inflate).setCancelable(false);
            ((TextView) inflate.findViewById(R.id.pob_skip_alert_title_txt)).setText(this.l.getTitle());
            ((TextView) inflate.findViewById(R.id.pob_skip_alert_msg_txt)).setText(this.l.getMessage());
            Button button = (Button) inflate.findViewById(R.id.pob_skip_alert_resume_btn);
            button.setText(this.l.getResumeText());
            button.setOnClickListener(this.n);
            Button button2 = (Button) inflate.findViewById(R.id.pob_skip_alert_close_btn);
            button2.setText(this.l.getCloseText());
            button2.setOnClickListener(this.n);
            this.k = cancelable.create();
        }
        this.k.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        POBVideoRendering pOBVideoRendering = this.a;
        if (pOBVideoRendering != null) {
            pOBVideoRendering.proceedAdSkip(z);
        }
    }

    private void a(POBAdDescriptor pOBAdDescriptor, View view) {
        this.g = new b(view);
        ViewGroup viewGroup = pOBAdDescriptor.isVideo() ? (ViewGroup) view : null;
        if (viewGroup != null) {
            POBAdViewCacheService.AdViewConfig adViewConfig = new POBAdViewCacheService.AdViewConfig(viewGroup, this.g);
            adViewConfig.setBackPressListener(this);
            POBInstanceProvider.getAdViewCacheService().storeAdView(Integer.valueOf(hashCode()), adViewConfig);
            return;
        }
        POBLog.warn("POBRewardedAdRenderer", POBLogConstants.MSG_CONTAINER_VIEW_ERROOR, new Object[0]);
    }

    private void a() {
        if (this.b != null && this.d == 0) {
            d();
            this.b.onAdInteractionStarted();
        }
        this.d++;
    }
}
