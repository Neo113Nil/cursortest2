package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.widget.FeedBackButton;
import com.pubmatic.sdk.omsdk.POBOMSDKUtil;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class MBridgeBTVideoView extends BTBaseView {
    private static boolean P;
    private static long Q;
    private AdSession A;
    private AdEvents B;
    private MediaEvents C;
    private d D;
    private int E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private String J;
    private boolean K;
    private boolean L;
    private boolean M;
    private RelativeLayout N;
    private ProgressBar O;
    private PlayerView p;
    private SoundImageView q;
    private TextView r;
    private View s;
    private FeedBackButton t;
    private ImageView u;
    private WebView v;
    private com.mbridge.msdk.videocommon.download.a w;
    private int x;
    private int y;
    private int z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean isSilent = MBridgeBTVideoView.this.p.isSilent();
            if (MBridgeBTVideoView.this.v != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.n);
                    jSONObject.put("id", MBridgeBTVideoView.this.d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("mute", MBridgeBTVideoView.this.E);
                    jSONObject.put("data", jSONObject2);
                    f.a().a(MBridgeBTVideoView.this.v, "onPlayerMuteBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    q0.a("OperateViews", "onPlayerMuteBtnClicked isMute = " + isSilent + " mute = " + MBridgeBTVideoView.this.E);
                } catch (Exception e) {
                    com.mbridge.msdk.video.bt.component.d.c().a(MBridgeBTVideoView.this.v, e.getMessage());
                }
            }
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeBTVideoView.this.v != null) {
                BTBaseView.a(MBridgeBTVideoView.this.v, "onPlayerCloseBtnClicked", MBridgeBTVideoView.this.d);
            }
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeBTVideoView.this.C != null) {
                try {
                    MBridgeBTVideoView.this.C.adUserInteraction(InteractionType.CLICK);
                    q0.a("omsdk", "btv adUserInteraction click");
                } catch (Exception e) {
                    q0.b("omsdk", e.getMessage());
                }
            }
            if (MBridgeBTVideoView.this.v != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.n);
                    jSONObject.put("id", MBridgeBTVideoView.this.d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(VastAttributes.HORIZONTAL_POSITION, String.valueOf(view.getX()));
                    jSONObject2.put(VastAttributes.VERTICAL_POSITION, String.valueOf(view.getY()));
                    jSONObject.put("data", jSONObject2);
                    f.a().a(MBridgeBTVideoView.this.v, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception unused) {
                    com.mbridge.msdk.video.bt.component.d.c().a(MBridgeBTVideoView.this.v, "onClicked", MBridgeBTVideoView.this.d);
                }
            }
        }
    }

    private static final class d extends DefaultVideoPlayerStatusListener {
        private MBridgeBTVideoView a;
        private WebView b;
        private MediaEvents c;
        private String d;
        private String e;
        private int f;
        private int g;
        private boolean h;
        private int l;
        private int m;
        private boolean i = false;
        private boolean j = false;
        private boolean k = false;
        private boolean n = false;
        private boolean o = false;

        public d(MBridgeBTVideoView mBridgeBTVideoView, WebView webView, MediaEvents mediaEvents) {
            this.a = mBridgeBTVideoView;
            this.b = webView;
            this.c = mediaEvents;
            if (mBridgeBTVideoView != null) {
                this.d = mBridgeBTVideoView.d;
                this.e = mBridgeBTVideoView.c;
            }
        }

        public void b(int i, int i2) {
            this.l = i;
            this.m = i2;
            a();
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                if (this.c == null || !this.o) {
                    return;
                }
                q0.b("omsdk", "bt onBufferingEnd");
                this.o = false;
                this.c.bufferFinish();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingStart(String str) {
            try {
                q0.b("omsdk", "bt onBufferingStart1");
                super.onBufferingStart(str);
                if (this.c != null) {
                    q0.b("omsdk", "bt onBufferingStart");
                    this.c.bufferStart();
                    this.o = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingTimeOut(String str) {
            try {
                if (!str.equals(PlayerErrorConstant.PREPARE_TIMEOUT) && !str.equals(PlayerErrorConstant.PLAYERING_TIMEOUT)) {
                    return;
                }
                if (this.b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.n);
                        jSONObject.put("id", this.d);
                        jSONObject.put("data", new JSONObject());
                        f.a().a(this.b, "onPlayerTimeout", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        com.mbridge.msdk.video.bt.component.d.c().a(this.b, e.getMessage());
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayCompleted() {
            super.onPlayCompleted();
            MBridgeBTVideoView mBridgeBTVideoView = this.a;
            CampaignEx campaignEx = mBridgeBTVideoView.b;
            if (campaignEx == null) {
                mBridgeBTVideoView.r.setText("0");
            } else if (campaignEx.getVideoCompleteTime() > 0) {
                this.a.r.setText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_complete", "string"));
            } else {
                this.a.r.setText("0");
            }
            this.a.p.setClickable(false);
            WebView webView = this.b;
            if (webView != null) {
                BTBaseView.a(webView, "onPlayerFinish", this.d);
            }
            MediaEvents mediaEvents = this.c;
            if (mediaEvents != null) {
                mediaEvents.complete();
                q0.a("omsdk", "play:  videoEvents.complete()");
            }
            this.f = this.g;
            boolean unused = MBridgeBTVideoView.P = true;
            this.a.stop();
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayError(String str) {
            super.onPlayError(str);
            if (this.b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.o);
                    jSONObject.put("id", this.d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error", str);
                    jSONObject2.put("id", this.d);
                    jSONObject.put("data", jSONObject2);
                    f.a().a(this.b, "onPlayerFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    com.mbridge.msdk.video.bt.component.d.c().a(this.b, e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayProgress(int i, int i2) {
            int i3;
            StringBuilder sb;
            String str;
            String sb2;
            super.onPlayProgress(i, i2);
            if (MBridgeBTVideoView.Q == 0) {
                long unused = MBridgeBTVideoView.Q = System.currentTimeMillis();
            }
            MBridgeBTVideoView mBridgeBTVideoView = this.a;
            if (mBridgeBTVideoView.h) {
                CampaignEx campaignEx = mBridgeBTVideoView.b;
                if (campaignEx != null) {
                    i3 = campaignEx.getVideoCompleteTime();
                    com.mbridge.msdk.foundation.feedback.b.b().b(this.a.b.getCampaignUnitId() + "_1", i);
                } else {
                    i3 = 0;
                }
                if (i3 > i2 || i3 <= 0) {
                    i3 = i2;
                }
                int i4 = i3 <= 0 ? i2 - i : i3 - i;
                if (i4 <= 0) {
                    sb2 = i3 <= 0 ? "0" : (String) this.a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_complete", "string"));
                } else {
                    if (i3 <= 0) {
                        sb = new StringBuilder();
                        sb.append(i4);
                        str = "";
                    } else {
                        sb = new StringBuilder();
                        sb.append(i4);
                        str = (String) this.a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left", "string"));
                    }
                    sb.append(str);
                    sb2 = sb.toString();
                }
                CampaignEx campaignEx2 = this.a.b;
                if (campaignEx2 != null && campaignEx2.getUseSkipTime() == 1) {
                    int min = Math.min(this.a.b.getVst(), i2);
                    if (min >= i3 || min < 0) {
                        int i5 = i3 - i;
                        if (this.a.b.getAdType() == 287) {
                            if (i5 > 0) {
                                sb2 = i5 + ((String) this.a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left_skip_time", "string")));
                            } else if (i5 == 0) {
                                this.a.r.setVisibility(4);
                            }
                        }
                    } else {
                        int i6 = min - i;
                        if (i6 > 0) {
                            sb2 = i6 + ((String) this.a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left_skip_time", "string")));
                        } else if (this.a.b.getAdType() == 287 && i6 == 0) {
                            this.a.r.setVisibility(4);
                        }
                    }
                }
                this.a.r.setText(sb2);
            }
            this.g = i2;
            this.f = i;
            this.a.O.setMax(this.g);
            this.a.O.setProgress(this.f);
            if (this.b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.n);
                    jSONObject.put("id", this.d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", this.d);
                    jSONObject2.put("progress", MBridgeBTVideoView.b(i, i2));
                    jSONObject2.put("time", String.valueOf(i));
                    jSONObject2.put(IronSourceConstants.EVENTS_DURATION, String.valueOf(i2));
                    jSONObject.put("data", jSONObject2);
                    f.a().a(this.b, "onPlayerProgressChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    com.mbridge.msdk.video.bt.component.d.c().a(this.b, e.getMessage());
                }
            }
            MediaEvents mediaEvents = this.c;
            if (mediaEvents != null) {
                int i7 = (i * 100) / i2;
                int i8 = ((i + 1) * 100) / i2;
                if (i7 <= 25 && 25 < i8 && !this.i) {
                    this.i = true;
                    mediaEvents.firstQuartile();
                    q0.a("omsdk", "play:  videoEvents.firstQuartile()");
                } else if (i7 <= 50 && 50 < i8 && !this.j) {
                    this.j = true;
                    mediaEvents.midpoint();
                    q0.a("omsdk", "play:  videoEvents.midpoint()");
                } else if (i7 <= 75 && 75 < i8 && !this.k) {
                    this.k = true;
                    mediaEvents.thirdQuartile();
                    q0.a("omsdk", "play:  videoEvents.thirdQuartile()");
                }
            }
            a(i, i2);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayStarted(int i) {
            super.onPlayStarted(i);
            if (!this.h) {
                this.a.O.setMax(i);
                WebView webView = this.b;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.d);
                }
                this.h = true;
                if (this.c != null) {
                    try {
                        MBridgeBTVideoView mBridgeBTVideoView = this.a;
                        this.c.start(i, (mBridgeBTVideoView == null || mBridgeBTVideoView.p == null) ? 0.0f : this.a.p.getVolume());
                        q0.a("omsdk", "play2: videoEvents.start()");
                    } catch (Exception e) {
                        q0.b("omsdk", e.getMessage());
                    }
                }
            }
            boolean unused = MBridgeBTVideoView.P = false;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00a2 A[Catch: Exception -> 0x006a, TryCatch #0 {Exception -> 0x006a, blocks: (B:17:0x002a, B:19:0x0032, B:22:0x003f, B:23:0x0096, B:25:0x00a2, B:27:0x00ac, B:32:0x006c), top: B:16:0x002a }] */
        /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void a() {
            int i;
            MBridgeBTVideoView mBridgeBTVideoView;
            CampaignEx campaignEx;
            String str;
            com.mbridge.msdk.videocommon.download.a a;
            if (!s0.a().a("h_c_r_w_p_c", false) || (i = this.l) == 100 || this.m != 0 || this.n || i == 0 || (mBridgeBTVideoView = this.a) == null || (campaignEx = mBridgeBTVideoView.b) == null) {
                return;
            }
            try {
                if (campaignEx.getAdType() != 94 && this.a.b.getAdType() != 287) {
                    str = this.a.b.getId() + this.a.b.getVideoUrlEncode() + this.a.b.getBidToken();
                    a = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.e, str);
                    if (a == null) {
                        a.A();
                        this.n = true;
                        if (MBridgeConstans.DEBUG) {
                            q0.b("DefaultVideoPlayerStatusListener", "CDRate is : 0  and start download when player create!");
                            return;
                        }
                        return;
                    }
                    return;
                }
                str = this.a.b.getRequestId() + this.a.b.getId() + this.a.b.getVideoUrlEncode();
                a = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.e, str);
                if (a == null) {
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("DefaultVideoPlayerStatusListener", e.getMessage());
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0093 A[Catch: Exception -> 0x005b, TRY_LEAVE, TryCatch #0 {Exception -> 0x005b, blocks: (B:3:0x0002, B:5:0x0008, B:10:0x000f, B:12:0x0013, B:14:0x0017, B:16:0x0023, B:19:0x0030, B:20:0x0087, B:22:0x0093, B:26:0x005d), top: B:2:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void a(int i, int i2) {
            int i3;
            int i4;
            String str;
            com.mbridge.msdk.videocommon.download.a a;
            try {
                int i5 = this.l;
                if (i5 == 100 || this.n || i5 == 0 || (i3 = this.m) < 0 || i < (i4 = (i2 * i3) / 100)) {
                    return;
                }
                if (this.a.b.getAdType() != 94 && this.a.b.getAdType() != 287) {
                    str = this.a.b.getId() + this.a.b.getVideoUrlEncode() + this.a.b.getBidToken();
                    a = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.e, str);
                    if (a == null) {
                        a.A();
                        this.n = true;
                        q0.b("DefaultVideoPlayerStatusListener", "CDRate is : " + i4 + " and start download !");
                        return;
                    }
                    return;
                }
                str = this.a.b.getRequestId() + this.a.b.getId() + this.a.b.getVideoUrlEncode();
                a = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.e, str);
                if (a == null) {
                }
            } catch (Exception e) {
                q0.b("DefaultVideoPlayerStatusListener", e.getMessage());
            }
        }
    }

    public MBridgeBTVideoView(Context context) {
        super(context);
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.E = 2;
        this.G = false;
        this.H = 2;
        this.I = 1;
        this.K = false;
        this.L = false;
        this.M = false;
    }

    private int getBufferTimeout() {
        try {
            com.mbridge.msdk.videocommon.setting.a c2 = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (c2 == null) {
                com.mbridge.msdk.videocommon.setting.b.b().a();
            }
            r0 = c2 != null ? (int) c2.i() : 5;
            q0.c(BTBaseView.TAG, "MBridgeBaseView buffetTimeout:" + r0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return r0;
    }

    private int getCDRate() {
        return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.c, false).g();
    }

    private String getPlayURL() {
        String str = "";
        try {
            str = this.b.getVideoUrlEncode();
            com.mbridge.msdk.videocommon.download.a aVar = this.w;
            if (aVar == null) {
                return str;
            }
            String p = aVar.p();
            return !a1.a(p) ? new File(p).exists() ? p : str : str;
        } catch (Throwable th) {
            q0.b(BTBaseView.TAG, th.getMessage(), th);
            return str;
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    public AdEvents getAdEvents() {
        return this.B;
    }

    public AdSession getAdSession() {
        return this.A;
    }

    public int getMute() {
        return this.E;
    }

    public MediaEvents getVideoEvents() {
        return this.C;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_videoview_item");
        if (i0.a(findLayout)) {
            this.f.inflate(findLayout, this);
            boolean e = e();
            this.h = e;
            if (!e) {
                q0.b(BTBaseView.TAG, "MBridgeVideoView init fail");
            }
            b();
        }
        P = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        View rootView;
        super.onAttachedToWindow();
        if (!this.M) {
            this.H = com.mbridge.msdk.video.bt.component.d.c().g(this.c);
        }
        View view = this.s;
        if (view != null) {
            view.setVisibility(this.y == 0 ? 8 : 0);
        }
        SoundImageView soundImageView = this.q;
        if (soundImageView != null) {
            soundImageView.setVisibility(this.z == 0 ? 8 : 0);
        }
        CampaignEx campaignEx = this.b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.c);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.c + "_1", this.b);
        }
        TextView textView = this.r;
        if (textView != null) {
            textView.setVisibility(this.x == 0 ? 8 : 0);
            if (this.r.getVisibility() == 0 && com.mbridge.msdk.foundation.feedback.b.b().a()) {
                com.mbridge.msdk.foundation.feedback.b.b().a(this.c + "_1", this.t);
            }
        }
        if (this.A == null || (rootView = getRootView()) == null) {
            return;
        }
        this.A.removeFriendlyObstruction(rootView);
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
        try {
            if (this.p != null) {
                AdSession adSession = this.A;
                if (adSession != null) {
                    adSession.finish();
                }
                this.p.setOnClickListener(null);
                this.p.release();
                this.p = null;
                if (!TextUtils.isEmpty(this.J)) {
                    e eVar = new e();
                    long j = Q;
                    if (j != 0) {
                        j = System.currentTimeMillis() - Q;
                    }
                    eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000146", this.b, eVar);
                }
            }
            SoundImageView soundImageView = this.q;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(null);
            }
            View view = this.s;
            if (view != null) {
                view.setOnClickListener(null);
            }
            if (this.v != null) {
                this.v = null;
            }
            if (this.A != null) {
                this.A = null;
            }
            if (this.C != null) {
                this.C = null;
            }
            setOnClickListener(null);
        } catch (Throwable th) {
            q0.a(BTBaseView.TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void onPause() {
        PlayerView playerView = this.p;
        if (playerView != null) {
            boolean isPlayIng = playerView.isPlayIng();
            this.L = isPlayIng;
            this.p.setIsBTVideoPlaying(isPlayIng);
            MediaEvents mediaEvents = this.C;
            if (mediaEvents != null) {
                this.p.setVideoEvents(mediaEvents);
            }
            this.p.onPause();
        }
    }

    public void onResume() {
        PlayerView playerView = this.p;
        if (playerView != null) {
            playerView.setDesk(true);
            this.p.setIsCovered(false);
            if (this.L) {
                this.p.start(true);
            }
            this.p.resumeOMSDK();
        }
    }

    public void onStop() {
        PlayerView playerView = this.p;
        if (playerView != null) {
            playerView.setIsCovered(true);
        }
    }

    public void pause() {
        try {
            PlayerView playerView = this.p;
            if (playerView != null) {
                playerView.pause();
                WebView webView = this.v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPause", this.d);
                }
            }
        } catch (Exception e) {
            q0.b(BTBaseView.TAG, e.getMessage(), e);
        }
    }

    public void play() {
        d dVar;
        try {
            if (this.M) {
                if (this.G) {
                    this.p.playVideo(0);
                    this.G = false;
                } else {
                    this.p.start(false);
                }
                try {
                    MediaEvents mediaEvents = this.C;
                    if (mediaEvents != null) {
                        mediaEvents.resume();
                        q0.a("omsdk", "btv play2:  videoEvents.resume()");
                    }
                } catch (Throwable th) {
                    q0.a(BTBaseView.TAG, th.getMessage());
                }
                WebView webView = this.v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.d);
                    return;
                }
                return;
            }
            String playURL = getPlayURL();
            this.J = playURL;
            this.p.initVFPData(playURL, this.b.getVideoUrlEncode(), this.D);
            if (this.H == 1) {
                playMute();
            } else {
                playUnMute();
            }
            try {
                if (this.B != null) {
                    q0.b("omsdk", "bt impressionOccurred");
                    this.B.impressionOccurred();
                }
            } catch (Throwable th2) {
                q0.a(BTBaseView.TAG, th2.getMessage());
            }
            if (!this.p.playVideo() && (dVar = this.D) != null) {
                dVar.onPlayError("play video failed");
            }
            this.M = true;
            return;
        } catch (Exception e) {
            q0.b(BTBaseView.TAG, e.getMessage(), e);
        }
        q0.b(BTBaseView.TAG, e.getMessage(), e);
    }

    public boolean playMute() {
        try {
            PlayerView playerView = this.p;
            if (playerView != null && this.v != null) {
                playerView.closeSound();
                this.q.setSoundStatus(false);
                this.E = 1;
                try {
                    MediaEvents mediaEvents = this.C;
                    if (mediaEvents != null) {
                        mediaEvents.volumeChange(0.0f);
                    }
                } catch (Exception e) {
                    q0.a(POBOMSDKUtil.TAG, e.getMessage());
                }
                BTBaseView.a(this.v, "onPlayerMute", this.d);
                return true;
            }
        } catch (Exception e2) {
            q0.b(BTBaseView.TAG, e2.getMessage());
        }
        return false;
    }

    public boolean playUnMute() {
        try {
            PlayerView playerView = this.p;
            if (playerView == null || this.v == null) {
                return false;
            }
            playerView.openSound();
            this.q.setSoundStatus(true);
            this.E = 2;
            try {
                MediaEvents mediaEvents = this.C;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(1.0f);
                }
            } catch (Exception e) {
                q0.a(POBOMSDKUtil.TAG, e.getMessage());
            }
            BTBaseView.a(this.v, "onUnmute", this.d);
            return true;
        } catch (Exception e2) {
            q0.b(BTBaseView.TAG, e2.getMessage());
            return false;
        }
    }

    public void preLoadData() {
        d();
        this.F = getBufferTimeout();
        String playURL = getPlayURL();
        this.J = playURL;
        if (this.h && !TextUtils.isEmpty(playURL) && this.b != null) {
            AdSession adSession = this.A;
            if (adSession != null) {
                adSession.registerAdView(this.p);
                AdSession adSession2 = this.A;
                SoundImageView soundImageView = this.q;
                FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                adSession2.addFriendlyObstruction(soundImageView, friendlyObstructionPurpose, null);
                this.A.addFriendlyObstruction(this.r, friendlyObstructionPurpose, null);
                this.A.addFriendlyObstruction(this.s, FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
            }
            d dVar = new d(this, this.v, this.C);
            this.D = dVar;
            dVar.b(a(this.b), getCDRate());
            this.p.setDesk(false);
            this.p.initBufferIngParam(this.F);
            soundOperate(this.E, -1, null);
        }
        P = false;
    }

    public void resume() {
        try {
            PlayerView playerView = this.p;
            if (playerView != null) {
                if (this.G) {
                    playerView.playVideo(0);
                    this.G = false;
                } else {
                    playerView.onResume();
                }
                try {
                    MediaEvents mediaEvents = this.C;
                    if (mediaEvents != null) {
                        mediaEvents.resume();
                        q0.a("omsdk", "btv play3:  videoEvents.resume()");
                    }
                } catch (Throwable th) {
                    q0.a(BTBaseView.TAG, th.getMessage());
                }
                WebView webView = this.v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerResume", this.d);
                }
            }
        } catch (Exception e) {
            q0.b(BTBaseView.TAG, e.getMessage());
        }
    }

    public void setAdEvents(AdEvents adEvents) {
        this.B = adEvents;
    }

    public void setAdSession(AdSession adSession) {
        this.A = adSession;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setCampaign(CampaignEx campaignEx) {
        super.setCampaign(campaignEx);
        if (campaignEx == null || campaignEx.getVideoCompleteTime() <= 0) {
            this.r.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_shape_progress", "drawable"));
            this.r.setWidth(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 30.0f));
            return;
        }
        this.r.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_time_count_num_bg", "drawable"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 30.0f));
        int a2 = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 5.0f);
        layoutParams.setMargins(a2, 0, 0, 0);
        this.r.setPadding(a2, 0, a2, 0);
        this.r.setLayoutParams(layoutParams);
    }

    public void setCloseViewVisable(int i) {
        this.s.setVisibility(i == 0 ? 4 : 0);
    }

    public void setCountDownTextViewVisable(int i) {
        this.r.setVisibility(i == 0 ? 4 : 0);
    }

    public void setCreateWebView(WebView webView) {
        this.v = webView;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        if (i <= 0) {
            i = this.N.getPaddingLeft();
        }
        if (i2 <= 0) {
            i2 = this.N.getPaddingRight();
        }
        if (i3 <= 0) {
            i3 = this.N.getPaddingTop();
        }
        if (i4 <= 0) {
            i4 = this.N.getPaddingBottom();
        }
        q0.b(BTBaseView.TAG, "NOTCH BTVideoView " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
        this.N.setPadding(i, i3, i2, i4);
    }

    public void setOrientation(int i) {
        this.I = i;
    }

    public void setPlaybackParams(float f) {
        PlayerView playerView = this.p;
        if (playerView != null) {
            playerView.setPlaybackParams(f);
        }
    }

    public void setProgressBarState(int i) {
        ProgressBar progressBar = this.O;
        if (progressBar != null) {
            progressBar.setVisibility(i == 0 ? 8 : 0);
            CampaignEx campaignEx = this.b;
            if (campaignEx == null || campaignEx.getProgressBarShow() != 1) {
                return;
            }
            this.O.setVisibility(0);
        }
    }

    public void setShowClose(int i) {
        this.y = i;
    }

    public void setShowMute(int i) {
        this.z = i;
    }

    public void setShowTime(int i) {
        this.x = i;
    }

    public void setSoundImageViewVisble(int i) {
        this.q.setVisibility(i == 0 ? 4 : 0);
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.C = mediaEvents;
        d dVar = this.D;
        if (dVar != null) {
            dVar.c = mediaEvents;
        }
        PlayerView playerView = this.p;
        if (playerView != null) {
            playerView.setVideoEvents(mediaEvents);
        }
    }

    public void setVolume(float f, float f2) {
        PlayerView playerView = this.p;
        if (playerView != null) {
            playerView.setVolume(f, f2);
        }
    }

    public void soundOperate(int i, int i2, String str) {
        if (this.h) {
            this.E = i;
            if (i == 1) {
                this.q.setSoundStatus(false);
                this.p.closeSound();
            } else if (i == 2) {
                this.q.setSoundStatus(true);
                this.p.openSound();
            }
            if (i2 == 1) {
                this.q.setVisibility(8);
            } else if (i2 == 2) {
                this.q.setVisibility(0);
            }
            MediaEvents mediaEvents = this.C;
            if (mediaEvents != null) {
                try {
                    mediaEvents.volumeChange(this.p.getVolume());
                } catch (Exception e) {
                    q0.b("omsdk", e.getMessage());
                }
            }
        }
    }

    public void stop() {
        try {
            PlayerView playerView = this.p;
            if (playerView != null) {
                playerView.pause();
                this.p.stop();
                this.G = true;
                WebView webView = this.v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerStop", this.d);
                }
            }
        } catch (Exception e) {
            q0.b(BTBaseView.TAG, e.getMessage(), e);
        }
    }

    private void d() {
        String str;
        if (this.b.getAdType() == 94 || this.b.getAdType() == 287) {
            str = this.b.getRequestId() + this.b.getId() + this.b.getVideoUrlEncode();
        } else {
            str = this.b.getId() + this.b.getVideoUrlEncode() + this.b.getBidToken();
        }
        com.mbridge.msdk.videocommon.download.a a2 = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.c, str);
        if (a2 != null) {
            this.w = a2;
        }
    }

    private boolean e() {
        try {
            this.p = (PlayerView) findViewById(findID("mbridge_vfpv"));
            this.q = (SoundImageView) findViewById(findID("mbridge_sound_switch"));
            this.r = (TextView) findViewById(findID("mbridge_tv_count"));
            this.s = findViewById(findID("mbridge_rl_playing_close"));
            this.N = (RelativeLayout) findViewById(findID("mbridge_top_control"));
            this.O = (ProgressBar) findViewById(findID("mbridge_video_progress_bar"));
            this.p.setIsBTVideo(true);
            this.t = (FeedBackButton) findViewById(findID("mbridge_native_endcard_feed_btn"));
            this.u = (ImageView) findViewById(findID("mbridge_iv_link"));
            return isNotNULL(this.p, this.q, this.r, this.s);
        } catch (Throwable th) {
            q0.b(BTBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    protected void b() {
        super.b();
        if (this.h) {
            this.q.setOnClickListener(new a());
            this.s.setOnClickListener(new b());
            setOnClickListener(new c());
        }
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (campaignEx.getReady_rate() != -1) {
                return campaignEx.getReady_rate();
            }
            return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.c, false).w();
        }
        return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.c, false).w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i, int i2) {
        if (i2 != 0) {
            try {
                return v0.a(Double.valueOf(i / i2)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i2 + "";
    }

    public MBridgeBTVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.E = 2;
        this.G = false;
        this.H = 2;
        this.I = 1;
        this.K = false;
        this.L = false;
        this.M = false;
    }
}
