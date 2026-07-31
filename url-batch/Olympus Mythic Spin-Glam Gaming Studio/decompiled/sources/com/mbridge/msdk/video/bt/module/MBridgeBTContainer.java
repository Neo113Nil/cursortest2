package com.mbridge.msdk.video.bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.d0;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.video.bt.module.orglistener.h;
import com.mbridge.msdk.video.signal.container.AbstractJSContainer;
import com.mbridge.msdk.video.signal.impl.a;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.widget.FeedBackButton;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.events.CrashEvent;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import io.bidmachine.ads.networks.nast.NastAdapter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class MBridgeBTContainer extends AbstractJSContainer implements com.mbridge.msdk.video.signal.c {
    private static final String V = "MBridgeBTContainer";
    private boolean A;
    private boolean B;
    private String C;
    private boolean D;
    private List<CampaignEx> E;
    private List<com.mbridge.msdk.videocommon.download.a> F;
    private com.mbridge.msdk.video.bt.module.listener.a G;
    private h H;
    private h I;
    private com.mbridge.msdk.video.bt.module.listener.b J;
    private String K;
    private String L;
    private String M;
    private boolean N;
    private int O;
    private String P;
    private com.mbridge.msdk.video.dynview.listener.d Q;
    private com.mbridge.msdk.foundation.same.report.metrics.c R;
    private AdSession S;
    private MediaEvents T;
    private AdEvents U;
    private int r;
    private int s;
    private FrameLayout t;
    private MBridgeBTLayout u;
    private WindVaneWebView v;
    private LayoutInflater w;
    private Context x;
    private TextView y;
    private ImageView z;

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeBTContainer.this.onAdClose();
        }
    }

    private static final class e implements Runnable {
        private List<CampaignEx> a;
        private Context b;
        private String c;
        private String d;

        public e(List<CampaignEx> list, Context context, String str, String str2) {
            this.a = list;
            this.b = context;
            this.c = str;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<CampaignEx> list = this.a;
            if (list == null || list.size() <= 0) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.db.e.a(g.a(this.b)).a(this.c, this.a);
                com.mbridge.msdk.videocommon.cache.a.a().b(this.d, this.a.get(0).getAdType());
            } catch (Exception unused) {
                q0.a(MBridgeBTContainer.V, "remove campaign failed");
            }
        }
    }

    private class f extends a.C1498a {
        private f() {
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C1498a, com.mbridge.msdk.video.signal.a.InterfaceC1497a
        public void a(boolean z) {
            super.a(z);
            if (MBridgeBTContainer.this.T != null) {
                try {
                    MBridgeBTContainer.this.T.adUserInteraction(InteractionType.CLICK);
                    q0.a("omsdk", "btc adUserInteraction click");
                } catch (Exception e) {
                    q0.a("omsdk", e.getMessage());
                }
            }
            MBridgeBTContainer.this.I.a(z, ((AbstractJSContainer) MBridgeBTContainer.this).e, ((AbstractJSContainer) MBridgeBTContainer.this).d);
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C1498a, com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            super.onFinishRedirection(campaign, str);
            u0.a(campaign, MBridgeBTContainer.this.t);
            if (campaign == null || !(campaign instanceof CampaignEx)) {
                return;
            }
            try {
                CampaignEx campaignEx = (CampaignEx) campaign;
                String optString = MintegralNetworkBridge.jsonObjectInit(MBridgeBTContainer.this.getJSVideoModule().getCurrentProgress()).optString("progress", "");
                if (campaignEx.getLinkType() == 3 && campaignEx.getEndcard_click_result() == 2 && optString.equals(NastAdapter.ADAPTER_SDK_VERSION_NAME) && ((AbstractJSContainer) MBridgeBTContainer.this).c != null) {
                    if (MBridgeBTContainer.this.B) {
                        MBridgeBTContainer.this.onAdClose();
                    } else {
                        ((AbstractJSContainer) MBridgeBTContainer.this).c.finish();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C1498a, com.mbridge.msdk.video.signal.a.InterfaceC1497a
        public void onInitSuccess() {
            super.onInitSuccess();
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C1498a, com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            super.onRedirectionFailed(campaign, str);
            u0.a(campaign, MBridgeBTContainer.this.t);
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C1498a, com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            super.onStartRedirection(campaign, str);
            u0.b(campaign, MBridgeBTContainer.this.t);
        }

        /* synthetic */ f(MBridgeBTContainer mBridgeBTContainer, a aVar) {
            this();
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C1498a, com.mbridge.msdk.video.signal.a.InterfaceC1497a
        public void a(int i, String str) {
            super.a(i, str);
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C1498a, com.mbridge.msdk.video.signal.a.InterfaceC1497a
        public void a() {
            super.a();
        }
    }

    public MBridgeBTContainer(Context context) {
        super(context);
        this.r = 0;
        this.s = 1;
        this.A = false;
        this.B = true;
        this.D = false;
        this.S = null;
        this.T = null;
        this.U = null;
        init(context);
    }

    public void addNativeCloseButtonWhenWebViewCrash() {
        try {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            int a2 = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 48.0f);
            int a3 = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 20.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
            layoutParams.setMargins(a3, a3, a3, a3);
            layoutParams.gravity = 5;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_close", "drawable"));
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setOnClickListener(new d());
            addView(imageView);
        } catch (Throwable th) {
            q0.b(V, th.getMessage());
        }
    }

    public void appendSubView(MBridgeBTContainer mBridgeBTContainer, MBTempContainer mBTempContainer, JSONObject jSONObject) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (jSONObject != null) {
                Context d2 = com.mbridge.msdk.foundation.controller.c.n().d();
                int optInt = jSONObject.optInt("left", -999);
                int optInt2 = jSONObject.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -999);
                int optInt3 = jSONObject.optInt("right", -999);
                int optInt4 = jSONObject.optInt("bottom", -999);
                if (optInt != -999 && d2 != null) {
                    layoutParams.leftMargin = v0.a(d2, optInt);
                }
                if (optInt2 != -999 && d2 != null) {
                    layoutParams.topMargin = v0.a(d2, optInt2);
                }
                if (optInt3 != -999 && d2 != null) {
                    layoutParams.rightMargin = v0.a(d2, optInt3);
                }
                if (optInt4 != -999 && d2 != null) {
                    layoutParams.bottomMargin = v0.a(d2, optInt4);
                }
                int optInt5 = jSONObject.optInt("width");
                int optInt6 = jSONObject.optInt("height");
                if (optInt5 > 0) {
                    layoutParams.width = optInt5;
                }
                if (optInt6 > 0) {
                    layoutParams.height = optInt6;
                }
            }
            mBridgeBTContainer.addView(mBTempContainer, layoutParams);
            mBTempContainer.setActivity(this.c);
            mBTempContainer.setMute(this.j);
            mBTempContainer.setBidCampaign(this.A);
            mBTempContainer.setIV(this.k);
            mBTempContainer.setBigOffer(this.B);
            mBTempContainer.setIVRewardEnable(this.m, this.n, this.o);
            mBTempContainer.setShowRewardListener(this.I);
            mBTempContainer.setCampaignDownLoadTask(c(mBTempContainer.getCampaign()));
            mBTempContainer.setMBridgeTempCallback(k());
            mBTempContainer.setWebViewFront(getJSCommon().b());
            mBTempContainer.init(this.x);
            mBTempContainer.onCreate();
        } catch (Throwable th) {
            q0.a(V, th.getMessage());
        }
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.v != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", this.r);
                jSONObject2.put("id", this.C);
                jSONObject2.put(X3.i.j0, str);
                jSONObject2.put("data", jSONObject);
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.v, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.mbridge.msdk.video.bt.component.d.c().a((WebView) this.v, "broadcast", this.C);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i, String str) {
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    public int findID(String str) {
        return i0.a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return i0.a(getContext(), str, "layout");
    }

    public AdEvents getAdEvents() {
        return this.U;
    }

    public AdSession getAdSession() {
        return this.S;
    }

    public List<CampaignEx> getCampaigns() {
        return this.E;
    }

    public MediaEvents getVideoEvents() {
        return this.T;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i, String str) {
    }

    public void init(Context context) {
        this.x = context;
        this.w = LayoutInflater.from(context);
    }

    public void onAdClose() {
        Activity activity = this.c;
        if (activity != null) {
            activity.finish();
        }
    }

    public void onBackPressed() {
        try {
            LinkedHashMap<String, View> b2 = com.mbridge.msdk.video.bt.component.d.c().b(this.d, this.L);
            if (b2 == null || b2.size() <= 0) {
                return;
            }
            for (View view : b2.values()) {
                if (view instanceof MBTempContainer) {
                    ((MBTempContainer) view).onBackPressed();
                } else if (view instanceof MBridgeBTWebView) {
                    ((MBridgeBTWebView) view).onBackPressed();
                } else if (view instanceof MBridgeBTLayout) {
                    ((MBridgeBTLayout) view).onBackPressed();
                }
            }
        } catch (Throwable th) {
            q0.a(V, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        try {
            LinkedHashMap<String, View> b2 = com.mbridge.msdk.video.bt.component.d.c().b(this.d, this.L);
            if (b2 == null || b2.size() <= 0) {
                return;
            }
            for (View view : b2.values()) {
                if (view instanceof MBTempContainer) {
                    ((MBTempContainer) view).onConfigurationChanged(configuration);
                } else if (view instanceof MBridgeBTWebView) {
                    ((MBridgeBTWebView) view).onConfigurationChanged(configuration);
                } else if (view instanceof MBridgeBTLayout) {
                    ((MBridgeBTLayout) view).onConfigurationChanged(configuration);
                }
            }
        } catch (Throwable th) {
            q0.a(V, th.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(boolean z) {
        String str;
        CampaignEx campaignEx;
        try {
            int findLayout = findLayout("mbridge_bt_container");
            if (!i0.a(findLayout)) {
                b("mbridge_bt_container layout null");
                return;
            }
            FrameLayout frameLayout = (FrameLayout) this.w.inflate(findLayout, this);
            this.t = frameLayout;
            if (frameLayout == null) {
                b("ViewIds null");
                return;
            }
            this.L = "";
            List<CampaignEx> list = this.E;
            if (list == null || list.size() <= 0) {
                str = "";
            } else {
                CampaignEx campaignEx2 = this.E.get(0);
                str = campaignEx2.getCMPTEntryUrl();
                this.L = campaignEx2.getRequestId();
                this.M = campaignEx2.getCurrentLocalRid();
            }
            this.v = c(this.d + "_" + this.L + "_" + str);
            com.mbridge.msdk.videocommon.a.e(this.d + "_" + this.L + "_" + str);
            l();
            WindVaneWebView windVaneWebView = this.v;
            if (windVaneWebView == null) {
                List<CampaignEx> list2 = this.E;
                if (list2 == null || list2.size() <= 0 || (campaignEx = this.E.get(0)) == null || !(z || campaignEx.isDynamicView())) {
                    b("big template webview is null");
                    return;
                } else {
                    a(this.x);
                    return;
                }
            }
            com.mbridge.msdk.video.signal.factory.b bVar = new com.mbridge.msdk.video.signal.factory.b(this.c, this, windVaneWebView);
            registerJsFactory(bVar);
            this.v.setApiManagerJSFactory(bVar);
            if (this.v.getParent() != null) {
                b("preload template webview is null or load error");
                return;
            }
            RelativeLayout.LayoutParams layoutParams = null;
            if (this.v.getObject() instanceof k) {
                bVar.a((k) this.v.getObject());
                if (this.v != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(com.mbridge.msdk.foundation.same.a.l, v0.d(getContext()));
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("name", this.h.c());
                        jSONObject2.put("amount", this.h.a());
                        jSONObject2.put("id", this.i);
                        jSONObject.put("userId", this.g);
                        jSONObject.put("reward", jSONObject2);
                        jSONObject.put("playVideoMute", this.j);
                        jSONObject.put("extra", this.P);
                    } catch (JSONException e2) {
                        q0.a(V, e2.getMessage());
                    } catch (Exception e3) {
                        q0.a(V, e3.getMessage());
                    }
                    this.I = new com.mbridge.msdk.video.bt.module.orglistener.c(k(), "");
                    String jSONObject3 = jSONObject.toString();
                    try {
                        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                        eVar.a("type", 1);
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000133", this.E, eVar);
                    } catch (Exception unused) {
                    }
                    getJSNotifyProxy().a(jSONObject3);
                    getJSCommon().b(true);
                    getJSCommon().a(new f(this, null == true ? 1 : 0));
                }
                ((com.mbridge.msdk.video.signal.impl.d) getJSCommon()).m.onInitSuccess();
            }
            this.v.setBackgroundColor(0);
            LinkedHashMap<String, View> b2 = com.mbridge.msdk.video.bt.component.d.c().b(this.d, this.L);
            if (b2 == null || !b2.containsKey(this.C)) {
                b("big template webviewLayout is null");
                return;
            }
            View view = b2.get(this.C);
            if (view instanceof MBridgeBTLayout) {
                MBridgeBTLayout mBridgeBTLayout = (MBridgeBTLayout) view;
                this.u = mBridgeBTLayout;
                try {
                    WindVaneWebView windVaneWebView2 = (WindVaneWebView) mBridgeBTLayout.getBtWebView();
                    k kVar = (k) windVaneWebView2.getObject();
                    kVar.setAdEvents(this.U);
                    kVar.setVideoEvents(this.T);
                    kVar.setAdSession(this.S);
                    windVaneWebView2.setObject(kVar);
                } catch (Exception e4) {
                    q0.b(V, e4.getMessage());
                }
                com.mbridge.msdk.foundation.feedback.b.b().a(this.d + "_1", new a());
                this.u.addView(this.v, 0, new FrameLayout.LayoutParams(-1, -1));
                com.mbridge.msdk.foundation.feedback.b.b().d(this.d + "_2");
                FeedBackButton a2 = com.mbridge.msdk.foundation.feedback.b.b().a(this.d + "_1");
                if (com.mbridge.msdk.foundation.feedback.b.b().a() && a2 != null) {
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) a2.getLayoutParams();
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.feedback.b.e, com.mbridge.msdk.foundation.feedback.b.d);
                    }
                    layoutParams.topMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 10.0f);
                    layoutParams.leftMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 10.0f);
                    a2.setLayoutParams(layoutParams);
                    ViewGroup viewGroup = (ViewGroup) a2.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(a2);
                    }
                    this.u.addView(a2);
                }
                this.u.setTag(this.C);
                b2.put(this.C, this.u);
                Iterator<View> it = b2.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    View next = it.next();
                    if (next instanceof MBridgeBTRootLayout) {
                        MBridgeBTRootLayout mBridgeBTRootLayout = (MBridgeBTRootLayout) next;
                        this.K = mBridgeBTRootLayout.getInstanceId();
                        this.t.addView(mBridgeBTRootLayout, new FrameLayout.LayoutParams(-1, -1));
                        break;
                    }
                }
                b2.remove(this.K);
                b2.put(this.K, this);
            }
            com.mbridge.msdk.video.bt.component.d.c().a(this.d, this.j);
            com.mbridge.msdk.video.bt.component.d.c().d(this.C, this.L);
            com.mbridge.msdk.video.bt.component.d.c().d(this.K, this.L);
            com.mbridge.msdk.video.bt.component.d.c().a(this.d + "_" + this.L, this.c);
            try {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(this.E, getContext().getApplicationContext(), this.d, this.e));
            } catch (Throwable unused2) {
                q0.a(V, "remove campaign failed");
            }
            List<CampaignEx> list3 = this.E;
            if (list3 == null || list3.size() <= 0) {
                return;
            }
            a(this.f, this.E.get(0));
        } catch (Throwable th) {
            b("onCreate exception " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        if (this.D) {
            return;
        }
        this.D = true;
        if (this.S != null) {
            q0.b("omsdk", "btc onDestroy");
            this.S.finish();
        }
        super.onDestroy();
        com.mbridge.msdk.video.bt.component.d.c().h(this.d + "_" + this.L);
        try {
            WindVaneWebView windVaneWebView = this.v;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.v.clearWebView();
                this.v.release();
            }
            if (this.J != null) {
                this.J = null;
            }
            if (this.G != null) {
                this.G = null;
            }
            if (this.x != null) {
                this.x = null;
            }
            List<CampaignEx> list = this.E;
            if (list != null && list.size() > 0) {
                for (CampaignEx campaignEx : this.E) {
                    if (campaignEx != null && campaignEx.getRewardTemplateMode() != null) {
                        com.mbridge.msdk.videocommon.a.e(this.d + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j());
                    }
                }
                com.mbridge.msdk.video.dynview.energize.a.a().d();
            }
            com.mbridge.msdk.video.bt.component.d.c().a(this.C);
            com.mbridge.msdk.video.bt.component.d.c().b(this.d);
            com.mbridge.msdk.video.bt.component.d.c().b(this.d, this.L).remove(this.C);
            com.mbridge.msdk.video.bt.component.d.c().b(this.d, this.L).remove(this.K);
            com.mbridge.msdk.video.bt.component.d.c().b(this.d, this.L).clear();
        } catch (Throwable th) {
            q0.a(V, th.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onPause() {
        CampaignEx campaignEx;
        super.onPause();
        List<CampaignEx> list = this.E;
        if (list != null && list.size() > 0 && (campaignEx = this.E.get(0)) != null && campaignEx.isDynamicView()) {
            com.mbridge.msdk.video.dynview.energize.a.a().b();
        }
        try {
            LinkedHashMap<String, View> b2 = com.mbridge.msdk.video.bt.component.d.c().b(this.d, this.L);
            if (b2 == null || b2.size() <= 0) {
                return;
            }
            for (View view : b2.values()) {
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).onPause();
                }
            }
        } catch (Throwable th) {
            q0.a(V, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onResume() {
        CampaignEx campaignEx;
        super.onResume();
        List<CampaignEx> list = this.E;
        if (list != null && list.size() > 0 && (campaignEx = this.E.get(0)) != null && campaignEx.isDynamicView()) {
            com.mbridge.msdk.video.dynview.energize.a.a().c();
        }
        if (com.mbridge.msdk.foundation.feedback.b.f) {
            return;
        }
        try {
            LinkedHashMap<String, View> b2 = com.mbridge.msdk.video.bt.component.d.c().b(this.d, this.L);
            if (b2 == null || b2.size() <= 0) {
                return;
            }
            for (View view : b2.values()) {
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).onResume();
                }
            }
        } catch (Throwable th) {
            q0.a(V, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onStop() {
        CampaignEx campaignEx;
        super.onStop();
        List<CampaignEx> list = this.E;
        if (list != null && list.size() > 0 && (campaignEx = this.E.get(0)) != null && campaignEx.isDynamicView()) {
            com.mbridge.msdk.video.dynview.energize.a.a().d();
        }
        try {
            LinkedHashMap<String, View> b2 = com.mbridge.msdk.video.bt.component.d.c().b(this.d, this.L);
            if (b2 == null || b2.size() <= 0) {
                return;
            }
            for (View view : b2.values()) {
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).onStop();
                }
            }
        } catch (Throwable th) {
            q0.a(V, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.c
    public void reactDeveloper(Object obj, String str) {
        JSONObject jSONObject;
        int i;
        if (this.G == null || TextUtils.isEmpty(str)) {
            a(obj, "listener is null");
        }
        try {
            JSONObject jsonObjectInit = MintegralNetworkBridge.jsonObjectInit(str);
            int optInt = jsonObjectInit.optInt("type");
            String optString = jsonObjectInit.optString("unitId", getUnitId());
            String optString2 = jsonObjectInit.optString(MBridgeConstans.PLACEMENT_ID, getPlacementId());
            JSONObject optJSONObject = jsonObjectInit.optJSONObject("data");
            CampaignEx campaignEx = this.E.get(0);
            boolean z = true;
            if (optInt == 1 && optJSONObject != null) {
                boolean optBoolean = optJSONObject.optBoolean("expired");
                if (campaignEx != null) {
                    if (optBoolean) {
                        campaignEx.setSpareOfferFlag(1);
                    } else {
                        campaignEx.setSpareOfferFlag(0);
                    }
                }
            }
            setCBT(campaignEx);
            switch (optInt) {
                case 1:
                    this.G.a();
                    this.G.a(2, optString2, optString);
                    a(obj);
                    break;
                case 2:
                    JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject("error") : null;
                    this.G.a(optJSONObject2 != null ? optJSONObject2.optString("msg") : "");
                    this.G.a(4, optString2, optString);
                    a(obj);
                    break;
                case 3:
                    this.G.b(optString2, optString);
                    this.G.a(5, optString2, optString);
                    a(obj);
                    break;
                case 4:
                    try {
                        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                        eVar.a("type", 2);
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000147", this.E, eVar);
                    } catch (Throwable th) {
                        q0.b(V, th.getMessage());
                    }
                    this.G.a(optString2, optString);
                    this.G.a(6, optString2, optString);
                    a(obj);
                    break;
                case 5:
                    this.G.a(jsonObjectInit.optBoolean("isAutoClick"), optString2, optString);
                    a(obj);
                    break;
                case 6:
                    if (optJSONObject != null) {
                        if (optJSONObject.optInt("convert") != 1) {
                            z = false;
                        }
                        jSONObject = optJSONObject.optJSONObject("reward");
                        String optString3 = optJSONObject.optString("extra");
                        if (!TextUtils.isEmpty(optString3)) {
                            this.P = optString3;
                        }
                    } else {
                        z = false;
                        jSONObject = null;
                    }
                    CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject.optJSONObject(MBInterstitialActivity.INTENT_CAMAPIGN));
                    com.mbridge.msdk.videocommon.entity.c a2 = com.mbridge.msdk.videocommon.entity.c.a(jSONObject);
                    if (a2 == null) {
                        a2 = this.h;
                    }
                    this.G.a(7, optString2, optString);
                    try {
                        com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                        eVar2.a("type", 2);
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar2);
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            e2.printStackTrace();
                        }
                    }
                    if (this.k && ((i = this.m) == com.mbridge.msdk.foundation.same.a.H || i == com.mbridge.msdk.foundation.same.a.I)) {
                        this.G.a(this.N, this.O);
                    }
                    if (!z) {
                        a2.a(0);
                        q0.a("omsdk", "bt videoEvents :" + this.T);
                        MediaEvents mediaEvents = this.T;
                        if (mediaEvents != null) {
                            try {
                                mediaEvents.skipped();
                                this.T = null;
                            } catch (Exception e3) {
                                q0.a("omsdk", e3.getMessage());
                            }
                        }
                    }
                    this.G.a(z, a2);
                    q0.a(V, "sendToServerRewardInfo");
                    if (!this.k && z) {
                        if (parseCampaignWithBackData != null) {
                            com.mbridge.msdk.video.module.report.b.a(parseCampaignWithBackData, a2, optString, this.g, this.P);
                        } else {
                            com.mbridge.msdk.video.module.report.b.a(campaignEx, a2, optString, this.g, this.P);
                        }
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000134", parseCampaignWithBackData);
                    a(obj);
                    break;
                default:
                    a(obj);
                    break;
            }
        } catch (JSONException e4) {
            a(obj, e4.getMessage());
            q0.a(V, e4.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.c
    public void reportUrls(Object obj, String str) {
        q0.a(V, "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int optInt = jSONObject.optInt("type");
                String a2 = v0.a(jSONObject.optString("url"), "&tun=", m0.A() + "");
                int optInt2 = jSONObject.optInt(CrashEvent.e);
                if (optInt2 == 0) {
                    Context d2 = com.mbridge.msdk.foundation.controller.c.n().d();
                    List<CampaignEx> list = this.E;
                    com.mbridge.msdk.click.a.a(d2, list != null ? list.get(0) : null, "", a2, false, optInt != 0);
                } else {
                    Context d3 = com.mbridge.msdk.foundation.controller.c.n().d();
                    List<CampaignEx> list2 = this.E;
                    com.mbridge.msdk.click.a.a(d3, list2 != null ? list2.get(0) : null, "", a2, false, optInt != 0, optInt2);
                }
            }
            b(obj, "");
        } catch (Throwable th) {
            q0.b(V, "reportUrls", th);
        }
    }

    public void setAdEvents(AdEvents adEvents) {
        this.U = adEvents;
    }

    public void setAdSession(AdSession adSession) {
        this.S = adSession;
    }

    public void setBTContainerCallback(com.mbridge.msdk.video.bt.module.listener.a aVar) {
        this.G = aVar;
    }

    public void setCBT(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (campaignEx.getSpareOfferFlag() != 1) {
                campaignEx.setCbt(0);
                return;
            }
            com.mbridge.msdk.videocommon.setting.c cVar = this.f;
            if (cVar != null) {
                if (cVar.A() == 1) {
                    campaignEx.setCbt(1);
                } else {
                    campaignEx.setCbt(0);
                }
            }
        }
    }

    public void setCampaignDownLoadTasks(List<com.mbridge.msdk.videocommon.download.a> list) {
        this.F = list;
    }

    public void setCampaigns(List<CampaignEx> list) {
        CampaignEx campaignEx;
        this.E = list;
        String str = "";
        if (list != null) {
            try {
                if (list.size() > 0 && (campaignEx = list.get(0)) != null) {
                    str = campaignEx.getCurrentLocalRid();
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            this.R = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(str);
        }
        if (this.R == null) {
            this.R = new com.mbridge.msdk.foundation.same.report.metrics.c();
        }
        this.R.i(str);
        this.R.b(list);
    }

    public void setChoiceOneCallback(com.mbridge.msdk.video.dynview.listener.d dVar) {
        this.Q = dVar;
    }

    public void setDeveloperExtraData(String str) {
        this.P = str;
    }

    public void setJSFactory(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.q = bVar;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) {
        try {
            String a2 = d0.a(i, i2, i3, i4, i5);
            q0.b(V, a2);
            WindVaneWebView windVaneWebView = this.v;
            if (windVaneWebView != null && (windVaneWebView.getObject() instanceof k) && !TextUtils.isEmpty(a2)) {
                ((k) this.v.getObject()).a(a2);
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.v, "oncutoutfetched", Base64.encodeToString(a2.getBytes(), 0));
            }
            a(i2, i4, i3, i5);
            com.mbridge.msdk.video.bt.component.d.c().a(i, i2, i3, i4, i5);
            LinkedHashMap<String, View> b2 = com.mbridge.msdk.video.bt.component.d.c().b(this.d, this.L);
            if (b2 == null || b2.size() <= 0) {
                return;
            }
            for (View view : b2.values()) {
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).setNotchPadding(i2, i3, i4, i5);
                }
                if (view instanceof MBTempContainer) {
                    ((MBTempContainer) view).setNotchPadding(i, i2, i3, i4, i5);
                }
                if ((view instanceof WindVaneWebView) && !TextUtils.isEmpty(a2)) {
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(view, "oncutoutfetched", Base64.encodeToString(a2.getBytes(), 0));
                }
            }
        } catch (Throwable th) {
            q0.a(V, th.getMessage());
        }
    }

    public void setShowRewardVideoListener(h hVar) {
        this.H = hVar;
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.T = mediaEvents;
    }

    class a implements com.mbridge.msdk.foundation.feedback.a {
        a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                q0.b(MBridgeBTContainer.V, th.getMessage(), th);
                str = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeBTContainer.this.v, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                q0.b(MBridgeBTContainer.V, th.getMessage(), th);
                str = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeBTContainer.this.v, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String str2;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                str2 = jSONObject.toString();
            } catch (Throwable th) {
                q0.b(MBridgeBTContainer.V, th.getMessage(), th);
                str2 = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeBTContainer.this.v, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
        }
    }

    private WindVaneWebView c(String str) {
        a.C1499a b2 = com.mbridge.msdk.videocommon.a.b(str);
        if (b2 == null) {
            return null;
        }
        this.C = b2.a();
        q0.a(V, "get BT wraper.getTag = " + this.C);
        b2.a("");
        return b2.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                HashMap hashMap = new HashMap();
                List<com.mbridge.msdk.foundation.entity.d> a2 = com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getCampaignUnitId(), campaignEx.getRequestId());
                if (a2 == null || a2.size() <= 0 || a2.get(0) == null) {
                    return;
                }
                int c2 = a2.get(0).c();
                String b2 = a2.get(0).b();
                if (c2 == 1) {
                    hashMap.put("encrypt_p=", "encrypt_p=" + b2);
                    hashMap.put("irlfa=", "irlfa=1");
                    for (Map.Entry entry : hashMap.entrySet()) {
                        campaignEx.setOnlyImpressionURL(campaignEx.getOnlyImpressionURL().replaceAll((String) entry.getKey(), (String) entry.getValue()));
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private com.mbridge.msdk.video.bt.module.listener.b k() {
        if (this.J == null) {
            this.J = new c();
        }
        return this.J;
    }

    private void l() {
        AdSession adSession = this.S;
        if (adSession != null) {
            try {
                adSession.registerAdView(this);
                this.S.start();
                q0.a("omsdk", "btc:  adSession.start();");
                if (this.U != null) {
                    q0.a("omsdk", "btc:   adEvents.loaded");
                    this.U.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
                    q0.a("omsdk", "btc:   adEvents.impressionOccurred");
                    this.U.impressionOccurred();
                }
            } catch (Exception e2) {
                q0.a("omsdk", e2.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    protected void b(String str) {
        h hVar = this.H;
        if (hVar != null) {
            hVar.a(this.R, str);
        }
        super.b(str);
    }

    protected void e(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, this.d, it.next(), false, true);
                }
            } catch (Throwable th) {
                q0.b(V, th.getMessage());
            }
        }
    }

    private void a(Context context) {
        if (this.Q == null) {
            b("ChoiceOneCallback is null");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("choice_one_callback", this.Q);
        com.mbridge.msdk.video.dynview.b.a().a(context, this.E, new b(), hashMap);
    }

    private com.mbridge.msdk.videocommon.download.a c(CampaignEx campaignEx) {
        List<com.mbridge.msdk.videocommon.download.a> list = this.F;
        if (list == null || campaignEx == null) {
            return null;
        }
        for (com.mbridge.msdk.videocommon.download.a aVar : list) {
            if (aVar.h().getId().equals(campaignEx.getId())) {
                q0.a(V, "tempContainer task initSuccess");
                return aVar;
            }
        }
        return null;
    }

    class c implements com.mbridge.msdk.video.bt.module.listener.b {
        c() {
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.b
        public void a(String str) {
            if (MBridgeBTContainer.this.v != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(MBridgeConstans.PLACEMENT_ID, ((AbstractJSContainer) MBridgeBTContainer.this).e);
                    jSONObject2.put("unitId", ((AbstractJSContainer) MBridgeBTContainer.this).d);
                    jSONObject.put("data", jSONObject2);
                    q0.a(MBridgeBTContainer.V, " BT Call H5 onAdShow " + jSONObject.toString());
                } catch (JSONException e) {
                    q0.a(MBridgeBTContainer.V, e.getMessage());
                }
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeBTContainer.this.v, "onSubPlayTemplateViewPlayStart", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.b
        public void b(String str, String str2, String str3) {
            if (MBridgeBTContainer.this.v != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                    jSONObject2.put("unitId", str3);
                    jSONObject.put("data", jSONObject2);
                    q0.a(MBridgeBTContainer.V, " BT Call H5 onVideoAdClicked " + jSONObject.toString());
                } catch (JSONException e) {
                    q0.a(MBridgeBTContainer.V, e.getMessage());
                }
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeBTContainer.this.v, "onSubPlayTemplateViewClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.b
        public void c(String str, String str2, String str3) {
            if (MBridgeBTContainer.this.v != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                    jSONObject2.put("unitId", str3);
                    jSONObject.put("data", jSONObject2);
                    q0.a(MBridgeBTContainer.V, " BT Call H5 onEndcardShow " + jSONObject.toString());
                } catch (JSONException e) {
                    q0.a(MBridgeBTContainer.V, e.getMessage());
                }
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeBTContainer.this.v, "onSubPlayTemplateViewEndcardShowSuccess", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.b
        public void a(String str, boolean z, com.mbridge.msdk.videocommon.entity.c cVar) {
            if (MBridgeBTContainer.this.v != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    JSONObject jSONObject2 = new JSONObject();
                    if (cVar != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("name", cVar.c());
                        jSONObject3.put("amount", cVar.a());
                        jSONObject2.put("reward", jSONObject3);
                    }
                    jSONObject2.put("isComplete", z);
                    jSONObject2.put("convert", z ? 1 : 2);
                    jSONObject.put("data", jSONObject2);
                    q0.a(MBridgeBTContainer.V, " BT Call H5 onAdClose " + jSONObject.toString());
                } catch (JSONException e) {
                    q0.a(MBridgeBTContainer.V, e.getMessage());
                }
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeBTContainer.this.v, "onSubPlayTemplateViewCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeBTContainer.this.v, "onSubPlayTemplateViewDismissed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.b
        public void a(boolean z, int i) {
            MBridgeBTContainer.this.N = z;
            MBridgeBTContainer.this.O = i;
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.b
        public void a(String str, String str2) {
            if (MBridgeBTContainer.this.v != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(MBridgeConstans.PLACEMENT_ID, ((AbstractJSContainer) MBridgeBTContainer.this).e);
                    jSONObject2.put("unitId", ((AbstractJSContainer) MBridgeBTContainer.this).d);
                    jSONObject2.put("error", str2);
                    jSONObject.put("data", jSONObject2);
                    q0.a(MBridgeBTContainer.V, " BT Call H5 onShowFail " + jSONObject.toString());
                } catch (JSONException e) {
                    q0.a(MBridgeBTContainer.V, e.getMessage());
                }
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeBTContainer.this.v, "onSubPlayTemplateViewPlayFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.b
        public void a(String str, String str2, String str3) {
            if (MBridgeBTContainer.this.v != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("convert", true);
                    jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                    jSONObject2.put("unitId", str3);
                    jSONObject.put("data", jSONObject2);
                    q0.a(MBridgeBTContainer.V, " BT Call H5 onVideoComplete " + jSONObject.toString());
                } catch (JSONException e) {
                    q0.a(MBridgeBTContainer.V, e.getMessage());
                }
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeBTContainer.this.v, "onSubPlayTemplateViewPlayCompleted", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.b
        public void a(String str, int i, String str2, String str3) {
            if (MBridgeBTContainer.this.H != null) {
                MBridgeBTContainer.this.H.a(i, str2, str3);
            }
        }
    }

    private void a(int i, int i2, int i3, int i4) {
        TextView textView;
        FrameLayout.LayoutParams layoutParams;
        List<CampaignEx> list = this.E;
        if (list == null || list.size() <= 0) {
            return;
        }
        try {
            if (!this.E.get(0).isDynamicView() || (textView = this.y) == null || (layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams()) == null) {
                return;
            }
            if (i > 0) {
                layoutParams.leftMargin = i;
            }
            if (i3 > 0) {
                layoutParams.rightMargin = i3;
            }
            if (i2 > 0) {
                layoutParams.topMargin = i2;
            }
            if (i4 > 0) {
                layoutParams.bottomMargin = i4;
            }
            this.y.setLayoutParams(layoutParams);
            if (this.z != null) {
                try {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.z.getLayoutParams());
                    layoutParams2.leftMargin = layoutParams.rightMargin;
                    layoutParams2.topMargin = layoutParams.topMargin;
                    this.z.setLayoutParams(layoutParams2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } catch (Exception e3) {
            q0.b(V, e3.getMessage());
        }
    }

    class b implements com.mbridge.msdk.video.dynview.listener.h {
        b() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.a aVar) {
            CampaignEx campaignEx;
            String str;
            if (aVar != null) {
                if (MBridgeBTContainer.this.t == null || aVar.b() == null) {
                    MBridgeBTContainer.this.b("nativeview is null");
                    return;
                }
                MBridgeBTContainer.this.t.removeAllViews();
                MBridgeBTContainer.this.t.addView(aVar.b());
                MBridgeBTContainer mBridgeBTContainer = MBridgeBTContainer.this;
                mBridgeBTContainer.y = (TextView) mBridgeBTContainer.findViewById(mBridgeBTContainer.findID("mbridge_choice_one_countdown_tv"));
                MBridgeBTContainer mBridgeBTContainer2 = MBridgeBTContainer.this;
                mBridgeBTContainer2.z = (ImageView) mBridgeBTContainer2.findViewById(mBridgeBTContainer2.findID("mbridge_iv_link"));
                if (MBridgeBTContainer.this.G != null) {
                    MBridgeBTContainer.this.G.a();
                    MBridgeBTContainer.this.G.a(2, ((AbstractJSContainer) MBridgeBTContainer.this).e, ((AbstractJSContainer) MBridgeBTContainer.this).d);
                }
                if (MBridgeBTContainer.this.E == null || MBridgeBTContainer.this.E.size() <= 0 || (campaignEx = (CampaignEx) MBridgeBTContainer.this.E.get(0)) == null) {
                    return;
                }
                if (campaignEx.isBidCampaign()) {
                    MBridgeBTContainer.this.d(campaignEx);
                }
                String onlyImpressionURL = campaignEx.getOnlyImpressionURL();
                com.mbridge.msdk.videocommon.setting.c c = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), ((AbstractJSContainer) MBridgeBTContainer.this).d);
                int A = c != null ? c.A() : 1;
                if (campaignEx.getSpareOfferFlag() == 1) {
                    str = onlyImpressionURL + "&to=1&cbt=" + campaignEx.getCbt() + "&tmorl=" + A;
                } else {
                    str = onlyImpressionURL + "&to=0&cbt=" + campaignEx.getCbt() + "&tmorl=" + A;
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, ((AbstractJSContainer) MBridgeBTContainer.this).d, str, false, true, com.mbridge.msdk.click.retry.a.n);
                com.mbridge.msdk.foundation.same.buffer.b.l.put(campaignEx.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
                MBridgeBTContainer.this.e(campaignEx);
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("type", "choseFromTwoShow");
                    com.mbridge.msdk.video.module.report.a.a("2000103", campaignEx, eVar);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.error.a aVar) {
            String str;
            if (aVar == null) {
                str = "";
            } else {
                str = "errorCode:" + aVar.g() + "Msg:" + aVar.h();
            }
            MBridgeBTContainer.this.b("nativeview is null" + str);
        }
    }

    public MBridgeBTContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = 0;
        this.s = 1;
        this.A = false;
        this.B = true;
        this.D = false;
        this.S = null;
        this.T = null;
        this.U = null;
        init(context);
    }
}
