package com.mbridge.msdk.reward.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.video.bt.module.MBridgeBTLayout;
import com.mbridge.msdk.video.bt.module.MBridgeBTRootLayout;
import com.mbridge.msdk.videocommon.a;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* compiled from: RewardCampaignsResourceManager.java */
/* loaded from: classes8.dex */
public final class b {
    private static ConcurrentHashMap<String, f> g;
    private final m a;
    private boolean b;
    private final String c;
    private final String d;
    private final String e;
    private volatile List<WindVaneWebView> f;

    /* compiled from: RewardCampaignsResourceManager.java */
    class a implements Runnable {
        final /* synthetic */ CopyOnWriteArrayList a;
        final /* synthetic */ Context b;
        final /* synthetic */ String c;
        final /* synthetic */ int d;
        final /* synthetic */ String e;
        final /* synthetic */ String f;
        final /* synthetic */ String g;
        final /* synthetic */ n h;

        a(CopyOnWriteArrayList copyOnWriteArrayList, Context context, String str, int i, String str2, String str3, String str4, n nVar) {
            this.a = copyOnWriteArrayList;
            this.b = context;
            this.c = str;
            this.d = i;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = nVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:133:0x02a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:140:0x0272 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:171:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0250  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x02d2  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x038c  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            String str;
            Iterator it;
            String str2;
            String str3;
            CharSequence charSequence;
            String str4;
            String iconUrl;
            String imageUrl;
            CampaignEx campaignEx;
            List<CampaignEx.c.a> d;
            List<String> list;
            int i;
            String str5;
            n nVar;
            CopyOnWriteArrayList copyOnWriteArrayList;
            String str6 = "_";
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.a;
            if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.size() <= 0) {
                return;
            }
            try {
                ResDownloadCheckManager.getInstance().setCampaignList(this.a);
                com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.b, this.c, this.a, this.d, new k(b.this.a, this.e, this.c, this.f, this.g));
                com.mbridge.msdk.videocommon.download.b.getInstance().load(this.c);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                }
            }
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                CampaignEx campaignEx2 = (CampaignEx) it2.next();
                if (campaignEx2 != null) {
                    try {
                        Message obtain = Message.obtain();
                        obtain.what = 106;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.e);
                        bundle.putString("request_id", this.f);
                        bundle.putString("key", this.c + str6 + this.f + str6 + campaignEx2.getSecondRequestIndex());
                        obtain.setData(bundle);
                        b.this.a.sendMessage(obtain);
                    } catch (Exception unused) {
                    }
                    CampaignEx.c rewardTemplateMode = campaignEx2.getRewardTemplateMode();
                    if (rewardTemplateMode != null) {
                        String j = rewardTemplateMode.j();
                        int k = rewardTemplateMode.k();
                        if (campaignEx2.isDynamicView() && v0.c(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, j)) {
                            b.this.a(1, campaignEx2, k + "", j);
                        } else if (!TextUtils.isEmpty(j) && !j.contains(CampaignEx.KEY_IS_CMPT_ENTRY)) {
                            com.mbridge.msdk.foundation.same.report.metrics.c a = b.this.a(campaignEx2, 2);
                            if (j.contains(".zip")) {
                                try {
                                    H5DownLoadManager h5DownLoadManager = H5DownLoadManager.getInstance();
                                    Context context = this.b;
                                    String str7 = this.e;
                                    String str8 = this.c;
                                    String str9 = this.f;
                                    str = str6;
                                    try {
                                        m mVar = b.this.a;
                                        try {
                                            nVar = this.h;
                                            copyOnWriteArrayList = this.a;
                                            it = it2;
                                            str5 = "";
                                            str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                            charSequence = ".zip";
                                        } catch (Exception e2) {
                                            e = e2;
                                            it = it2;
                                            str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                            charSequence = ".zip";
                                            str5 = "";
                                        }
                                        try {
                                            h5DownLoadManager.downloadH5Res(a, j, new l(context, str7, str8, str9, campaignEx2, 859, mVar, nVar, copyOnWriteArrayList));
                                        } catch (Exception e3) {
                                            e = e3;
                                            if (MBridgeConstans.DEBUG) {
                                                q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                            }
                                            str3 = str5;
                                            str4 = campaignEx2.getendcard_url();
                                            boolean isDynamicView = campaignEx2.isDynamicView();
                                            boolean l = v0.l(str4);
                                            if (!TextUtils.isEmpty(str4)) {
                                            }
                                            if (!TextUtils.isEmpty(campaignEx2.getEndScreenUrl())) {
                                            }
                                            iconUrl = campaignEx2.getIconUrl();
                                            if (!TextUtils.isEmpty(iconUrl)) {
                                            }
                                            imageUrl = campaignEx2.getImageUrl();
                                            if (!TextUtils.isEmpty(imageUrl)) {
                                            }
                                            if (rewardTemplateMode != null) {
                                            }
                                            str6 = str;
                                            it2 = it;
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        it = it2;
                                        str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                        str5 = "";
                                        charSequence = ".zip";
                                        if (MBridgeConstans.DEBUG) {
                                        }
                                        str3 = str5;
                                        str4 = campaignEx2.getendcard_url();
                                        boolean isDynamicView2 = campaignEx2.isDynamicView();
                                        boolean l2 = v0.l(str4);
                                        if (!TextUtils.isEmpty(str4)) {
                                        }
                                        if (!TextUtils.isEmpty(campaignEx2.getEndScreenUrl())) {
                                        }
                                        iconUrl = campaignEx2.getIconUrl();
                                        if (!TextUtils.isEmpty(iconUrl)) {
                                        }
                                        imageUrl = campaignEx2.getImageUrl();
                                        if (!TextUtils.isEmpty(imageUrl)) {
                                        }
                                        if (rewardTemplateMode != null) {
                                        }
                                        str6 = str;
                                        it2 = it;
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    str = str6;
                                }
                                str3 = str5;
                            } else {
                                str = str6;
                                it = it2;
                                str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                charSequence = ".zip";
                                q0.a("RewardCampaignsResourceManager", "开始下载 html 类型的 template");
                                try {
                                    str3 = "";
                                } catch (Exception e6) {
                                    e = e6;
                                    str3 = "";
                                }
                                try {
                                    H5DownLoadManager.getInstance().downloadH5Res(a, j, new i(859, this.e, this.c, this.f, campaignEx2, this.h, b.this.a, this.a));
                                } catch (Exception e7) {
                                    e = e7;
                                    if (MBridgeConstans.DEBUG) {
                                        q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                    }
                                    str4 = campaignEx2.getendcard_url();
                                    boolean isDynamicView22 = campaignEx2.isDynamicView();
                                    boolean l22 = v0.l(str4);
                                    if (!TextUtils.isEmpty(str4)) {
                                    }
                                    if (!TextUtils.isEmpty(campaignEx2.getEndScreenUrl())) {
                                    }
                                    iconUrl = campaignEx2.getIconUrl();
                                    if (!TextUtils.isEmpty(iconUrl)) {
                                    }
                                    imageUrl = campaignEx2.getImageUrl();
                                    if (!TextUtils.isEmpty(imageUrl)) {
                                    }
                                    if (rewardTemplateMode != null) {
                                    }
                                    str6 = str;
                                    it2 = it;
                                }
                            }
                            str4 = campaignEx2.getendcard_url();
                            boolean isDynamicView222 = campaignEx2.isDynamicView();
                            boolean l222 = v0.l(str4);
                            if (!TextUtils.isEmpty(str4)) {
                                if (!isDynamicView222) {
                                    b.this.a(this.b, this.e, this.c, this.f, campaignEx2, str4, this.h, (CopyOnWriteArrayList<CampaignEx>) this.a);
                                } else if (l222) {
                                    b.this.a(this.b, this.e, this.c, this.f, campaignEx2, str4, this.h, (CopyOnWriteArrayList<CampaignEx>) this.a);
                                } else if (v0.c(str2, str4)) {
                                    try {
                                        i = Integer.parseInt(c1.a(str4, "ecid"));
                                    } catch (Throwable th) {
                                        q0.b("RewardCampaignsResourceManager", th.getMessage());
                                        i = 404;
                                    }
                                    b.this.a(2, campaignEx2, i + str3, str4);
                                }
                            }
                            if (!TextUtils.isEmpty(campaignEx2.getEndScreenUrl()) && !campaignEx2.isDynamicView()) {
                                H5DownLoadManager.getInstance().download(b.this.a(campaignEx2, 6), campaignEx2.getEndScreenUrl());
                            }
                            iconUrl = campaignEx2.getIconUrl();
                            if (!TextUtils.isEmpty(iconUrl)) {
                                try {
                                    com.mbridge.msdk.foundation.same.image.b.a(this.b).a(iconUrl, new j(b.this.a, 0, this.e, this.c, this.f, campaignEx2));
                                } catch (Exception e8) {
                                    if (MBridgeConstans.DEBUG) {
                                        q0.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                                    }
                                }
                            }
                            imageUrl = campaignEx2.getImageUrl();
                            if (!TextUtils.isEmpty(imageUrl)) {
                                try {
                                    com.mbridge.msdk.foundation.same.image.b.a(this.b).a(imageUrl, new j(b.this.a, 0, this.e, this.c, this.f, campaignEx2));
                                } catch (Exception e9) {
                                    if (MBridgeConstans.DEBUG) {
                                        q0.b("RewardCampaignsResourceManager", e9.getLocalizedMessage());
                                    }
                                }
                            }
                            if (rewardTemplateMode != null) {
                                String h = rewardTemplateMode.h();
                                if (TextUtils.isEmpty(h) || campaignEx2.isDynamicView()) {
                                    campaignEx = campaignEx2;
                                } else {
                                    int i2 = campaignEx2.getAabEntity() != null ? campaignEx2.getAabEntity().h3c : 0;
                                    com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c(true);
                                    cVar.f(i2);
                                    if (h.contains(charSequence)) {
                                        q0.a("RewardCampaignsResourceManager", "开始下载 zip 类型的 pause");
                                        try {
                                            campaignEx = campaignEx2;
                                        } catch (Exception e10) {
                                            e = e10;
                                            campaignEx = campaignEx2;
                                        }
                                        try {
                                            H5DownLoadManager.getInstance().downloadH5Res(cVar, h, new l(this.b, this.e, this.c, this.f, campaignEx2, Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE, b.this.a, this.h, this.a));
                                        } catch (Exception e11) {
                                            e = e11;
                                            if (MBridgeConstans.DEBUG) {
                                                q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                            }
                                            d = rewardTemplateMode.d();
                                            if (d != null) {
                                                while (r2.hasNext()) {
                                                }
                                            }
                                            str6 = str;
                                            it2 = it;
                                        }
                                    } else {
                                        campaignEx = campaignEx2;
                                        try {
                                            H5DownLoadManager.getInstance().downloadH5Res(cVar, h, new i(Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE, this.e, this.c, this.f, campaignEx, this.h, b.this.a, this.a));
                                        } catch (Exception e12) {
                                            if (MBridgeConstans.DEBUG) {
                                                q0.b("RewardCampaignsResourceManager", e12.getLocalizedMessage());
                                            }
                                        }
                                    }
                                }
                                d = rewardTemplateMode.d();
                                if (d != null && d.size() > 0) {
                                    for (CampaignEx.c.a aVar : d) {
                                        if (aVar != null && (list = aVar.a) != null && list.size() > 0) {
                                            for (String str10 : aVar.a) {
                                                if (!TextUtils.isEmpty(str10)) {
                                                    try {
                                                        com.mbridge.msdk.foundation.same.image.b.a(this.b).a(str10, new j(b.this.a, 1, this.e, this.c, this.f, campaignEx));
                                                    } catch (Exception e13) {
                                                        if (MBridgeConstans.DEBUG) {
                                                            q0.b("RewardCampaignsResourceManager", e13.getLocalizedMessage());
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            str6 = str;
                            it2 = it;
                        }
                    }
                    str = str6;
                    it = it2;
                    str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                    str3 = "";
                    charSequence = ".zip";
                    str4 = campaignEx2.getendcard_url();
                    boolean isDynamicView2222 = campaignEx2.isDynamicView();
                    boolean l2222 = v0.l(str4);
                    if (!TextUtils.isEmpty(str4)) {
                    }
                    if (!TextUtils.isEmpty(campaignEx2.getEndScreenUrl())) {
                        H5DownLoadManager.getInstance().download(b.this.a(campaignEx2, 6), campaignEx2.getEndScreenUrl());
                    }
                    iconUrl = campaignEx2.getIconUrl();
                    if (!TextUtils.isEmpty(iconUrl)) {
                    }
                    imageUrl = campaignEx2.getImageUrl();
                    if (!TextUtils.isEmpty(imageUrl)) {
                    }
                    if (rewardTemplateMode != null) {
                    }
                    str6 = str;
                    it2 = it;
                }
            }
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    class c implements H5DownLoadManager.ZipDownloadListener {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ CampaignEx d;
        final /* synthetic */ n e;
        final /* synthetic */ Context f;

        c(String str, String str2, String str3, CampaignEx campaignEx, n nVar, Context context) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = campaignEx;
            this.e = nVar;
            this.f = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onFailed(String str, String str2) {
            String str3;
            String str4;
            String str5;
            String str6;
            Exception exc;
            String str7;
            try {
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
                Message obtain = Message.obtain();
                obtain.what = 205;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.a);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.b);
                bundle.putString("request_id", this.c);
                bundle.putString("url", str2);
                bundle.putString("key", this.a + "_" + this.c + "_" + this.d.getSecondRequestIndex());
                bundle.putString("message", str);
                obtain.setData(bundle);
                b.this.a.sendMessage(obtain);
                if (this.e != null) {
                    try {
                    } catch (Exception e) {
                        e = e;
                    }
                    try {
                        this.e.a(str2, this.c, b.b(880005, new MBridgeIds(this.b, this.a, this.c), "", null, null));
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            q0.b("RewardCampaignsResourceManager", e.getMessage());
                            b bVar = b.this;
                            Context context = this.f;
                            CampaignEx campaignEx = this.d;
                            String str8 = this.a;
                            str3 = "_";
                            str4 = "RewardCampaignsResourceManager";
                            str5 = "";
                            str6 = MBridgeConstans.PROPERTIES_UNIT_ID;
                            bVar.a(context, 3, campaignEx, str2, str, str8, "");
                        } catch (Exception e3) {
                            exc = e3;
                            str3 = "_";
                            str4 = "RewardCampaignsResourceManager";
                            str5 = "";
                            str6 = MBridgeConstans.PROPERTIES_UNIT_ID;
                            ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
                            Message obtain2 = Message.obtain();
                            obtain2.what = 105;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(str6, this.a);
                            bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.b);
                            bundle2.putString("request_id", this.c);
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.a);
                            String str9 = str3;
                            sb.append(str9);
                            sb.append(this.c);
                            sb.append(str9);
                            sb.append(this.d.getSecondRequestIndex());
                            bundle2.putString("key", sb.toString());
                            bundle2.putString("url", str2);
                            bundle2.putString("message", exc.getMessage());
                            obtain2.setData(bundle2);
                            b.this.a.sendMessage(obtain2);
                            if (this.e != null) {
                                try {
                                    this.e.a(str2, this.c, b.b(880005, new MBridgeIds(this.b, this.a, this.c), str5, exc, null));
                                } catch (Exception e4) {
                                    str7 = str4;
                                    q0.b(str7, e4.getMessage());
                                    q0.b(str7, exc.getLocalizedMessage());
                                }
                            }
                            str7 = str4;
                            q0.b(str7, exc.getLocalizedMessage());
                        }
                    }
                }
                b bVar2 = b.this;
                Context context2 = this.f;
                CampaignEx campaignEx2 = this.d;
                String str82 = this.a;
                str3 = "_";
                str4 = "RewardCampaignsResourceManager";
                str5 = "";
                str6 = MBridgeConstans.PROPERTIES_UNIT_ID;
                try {
                    bVar2.a(context2, 3, campaignEx2, str2, str, str82, "");
                } catch (Exception e5) {
                    e = e5;
                    exc = e;
                    ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
                    Message obtain22 = Message.obtain();
                    obtain22.what = 105;
                    Bundle bundle22 = new Bundle();
                    bundle22.putString(str6, this.a);
                    bundle22.putString(MBridgeConstans.PLACEMENT_ID, this.b);
                    bundle22.putString("request_id", this.c);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.a);
                    String str92 = str3;
                    sb2.append(str92);
                    sb2.append(this.c);
                    sb2.append(str92);
                    sb2.append(this.d.getSecondRequestIndex());
                    bundle22.putString("key", sb2.toString());
                    bundle22.putString("url", str2);
                    bundle22.putString("message", exc.getMessage());
                    obtain22.setData(bundle22);
                    b.this.a.sendMessage(obtain22);
                    if (this.e != null) {
                    }
                    str7 = str4;
                    q0.b(str7, exc.getLocalizedMessage());
                }
            } catch (Exception e6) {
                e = e6;
                str3 = "_";
                str4 = "RewardCampaignsResourceManager";
                str5 = "";
                str6 = MBridgeConstans.PROPERTIES_UNIT_ID;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onSuccess(String str, String str2, boolean z) {
            String str3;
            String str4;
            String str5;
            try {
                q0.a("RewardCampaignsResourceManager", "zip btl template download success");
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
                Message obtain = Message.obtain();
                obtain.what = 105;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.a);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.b);
                bundle.putString("request_id", this.c);
                bundle.putString("key", this.a + "_" + this.c + "_" + this.d.getSecondRequestIndex());
                bundle.putString("url", str);
                obtain.setData(bundle);
                b.this.a.sendMessage(obtain);
                n nVar = this.e;
                if (nVar != null) {
                    nVar.a(this.b, this.a, this.c, str);
                }
                if (z) {
                    return;
                }
                str3 = "RewardCampaignsResourceManager";
                str4 = "_";
                try {
                    b.this.a(this.f, 1, this.d, str, "", this.a, str2);
                } catch (Exception e) {
                    e = e;
                    Exception exc = e;
                    ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
                    Message obtain2 = Message.obtain();
                    obtain2.what = 205;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.a);
                    bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.b);
                    bundle2.putString("request_id", this.c);
                    bundle2.putString("key", this.a + str4 + this.c + str4 + this.d.getSecondRequestIndex());
                    bundle2.putString("url", str);
                    obtain2.setData(bundle2);
                    b.this.a.sendMessage(obtain2);
                    if (this.e != null) {
                        try {
                            this.e.a(str, this.c, b.b(880005, new MBridgeIds(this.b, this.a, this.c), "", exc, null));
                        } catch (Exception e2) {
                            str5 = str3;
                            q0.b(str5, e2.getMessage());
                            b.this.a(this.f, 3, this.d, str, exc.getLocalizedMessage(), this.a, str2);
                            if (MBridgeConstans.DEBUG) {
                            }
                        }
                    }
                    str5 = str3;
                    b.this.a(this.f, 3, this.d, str, exc.getLocalizedMessage(), this.a, str2);
                    if (MBridgeConstans.DEBUG) {
                        return;
                    }
                    q0.b(str5, exc.getLocalizedMessage());
                }
            } catch (Exception e3) {
                e = e3;
                str3 = "RewardCampaignsResourceManager";
                str4 = "_";
            }
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    class d implements Runnable {
        final /* synthetic */ CampaignEx a;
        final /* synthetic */ Context b;
        final /* synthetic */ int c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;
        final /* synthetic */ String f;
        final /* synthetic */ String g;

        d(CampaignEx campaignEx, Context context, int i, String str, String str2, String str3, String str4) {
            this.a = campaignEx;
            this.b = context;
            this.c = i;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a == null || this.b == null) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                nVar.j("m_download_end");
                Context context = this.b;
                if (context != null) {
                    nVar.c(m0.s(context.getApplicationContext()));
                }
                nVar.d(this.c);
                CampaignEx campaignEx = this.a;
                if (campaignEx != null) {
                    nVar.b(campaignEx.getId());
                    nVar.n(this.a.getRequestId());
                    nVar.k(this.a.getCurrentLocalRid());
                    nVar.o(this.a.getRequestIdNotice());
                }
                nVar.b("url", this.d);
                nVar.t(this.d);
                nVar.m(this.e);
                nVar.u(this.f);
                if (!TextUtils.isEmpty(this.g)) {
                    nVar.q(this.g);
                }
                nVar.e(1);
                nVar.b("scenes", "1");
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.a);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                }
            }
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    class e implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ WindVaneWebView b;
        final /* synthetic */ CampaignEx c;
        final /* synthetic */ CopyOnWriteArrayList d;
        final /* synthetic */ String e;
        final /* synthetic */ com.mbridge.msdk.videocommon.setting.c f;
        final /* synthetic */ String g;

        e(boolean z, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str, com.mbridge.msdk.videocommon.setting.c cVar, String str2) {
            this.a = z;
            this.b = windVaneWebView;
            this.c = campaignEx;
            this.d = copyOnWriteArrayList;
            this.e = str;
            this.f = cVar;
            this.g = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.a, this.b, this.c.getRewardTemplateMode().j(), 0, this.c, (CopyOnWriteArrayList<CampaignEx>) this.d, H5DownLoadManager.getInstance().getH5ResAddress(this.c.getRewardTemplateMode().j()), this.e, this.f, this.g, b.this.b);
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static class f {
        boolean a;
        boolean b;
        int c;
        int d;
        String e;
        String f;
        int g;
        CopyOnWriteArrayList<CampaignEx> h;
        CopyOnWriteArrayList<CampaignEx> i;

        public f(boolean z, boolean z2, int i, int i2, String str, String str2, int i3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.a = z;
            this.b = z2;
            this.c = i;
            this.d = i2;
            this.e = str;
            this.f = str2;
            this.g = i3;
            this.h = copyOnWriteArrayList;
            this.i = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    public interface h {
        void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList);

        void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar);
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static final class i implements H5DownLoadManager.IH5SourceDownloadListener {
        private int b;
        private final String c;
        private final String d;
        private final String e;
        private CampaignEx f;
        private n g;
        private Handler h;
        private CopyOnWriteArrayList<CampaignEx> i;
        private boolean a = false;
        private final long j = System.currentTimeMillis();

        /* compiled from: RewardCampaignsResourceManager.java */
        class a implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ long b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ String e;

            a(int i, long j, String str, String str2, String str3) {
                this.a = i;
                this.b = j;
                this.c = str;
                this.d = str2;
                this.e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (i.this.f == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("m_download_end", this.a, this.b + "", this.c, i.this.f.getId(), i.this.d, this.d, "2");
                    nVar.n(i.this.f.getRequestId());
                    nVar.k(i.this.f.getCurrentLocalRid());
                    nVar.o(i.this.f.getRequestIdNotice());
                    nVar.b(i.this.f.getId());
                    nVar.a(i.this.f.getAdSpaceT());
                    nVar.b("scenes", "1");
                    nVar.b("url", this.c);
                    if (i.this.f.getAdType() == 287) {
                        nVar.a("3");
                    } else if (i.this.f.getAdType() == 94) {
                        nVar.a("1");
                    }
                    if (!TextUtils.isEmpty(this.e)) {
                        nVar.q(this.e);
                    }
                    b.b(nVar, i.this.f);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, i.this.d, i.this.f);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                    }
                }
            }
        }

        public i(int i, String str, String str2, String str3, CampaignEx campaignEx, n nVar, Handler handler, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.b = i;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = campaignEx;
            this.g = nVar;
            this.h = handler;
            this.i = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
            int i = this.b;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = 201;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.c);
                bundle.putString("request_id", this.e);
                bundle.putString("key", this.d + "_" + this.e + "_" + this.f.getSecondRequestIndex());
                bundle.putString("url", str);
                bundle.putString("message", str2);
                obtain.setData(bundle);
                this.h.sendMessage(obtain);
                return;
            }
            if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.c);
                bundle2.putString("request_id", this.e);
                bundle2.putString("key", this.d + "_" + this.e + "_" + this.f.getSecondRequestIndex());
                bundle2.putString("url", str);
                bundle2.putString("message", str2);
                obtain2.setData(bundle2);
                this.h.sendMessage(obtain2);
                if (this.a) {
                    a(3, System.currentTimeMillis() - this.j, str, "url download failed", "");
                    return;
                }
                return;
            }
            if (i != 859) {
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 205;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.c);
            bundle3.putString("request_id", this.e);
            bundle3.putString("key", this.d + "_" + this.e + "_" + this.f.getSecondRequestIndex());
            bundle3.putString("message", str2);
            obtain3.setData(bundle3);
            this.h.sendMessage(obtain3);
            if (this.g != null) {
                try {
                    this.g.a(str, this.e, b.b(880006, new MBridgeIds(this.c, this.d, this.e), str2, null, null));
                } catch (Exception e) {
                    q0.b("RewardCampaignsResourceManager", e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            int i = this.b;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.c);
                bundle.putString("request_id", this.e);
                bundle.putString("key", this.d + "_" + this.e + "_" + this.f.getSecondRequestIndex());
                bundle.putString("url", str);
                obtain.setData(bundle);
                this.h.sendMessage(obtain);
                return;
            }
            if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.c);
                bundle2.putString("request_id", this.e);
                bundle2.putString("key", this.d + "_" + this.e + "_" + this.f.getSecondRequestIndex());
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                this.h.sendMessage(obtain2);
                if (this.a) {
                    a(1, System.currentTimeMillis() - this.j, str, "", str2);
                    return;
                }
                return;
            }
            if (i != 859) {
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 105;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.c);
            bundle3.putString("request_id", this.e);
            bundle3.putString("key", this.d + "_" + this.e + "_" + this.f.getSecondRequestIndex());
            obtain3.setData(bundle3);
            this.h.sendMessage(obtain3);
            n nVar = this.g;
            if (nVar != null) {
                nVar.a(this.c, this.d, this.e, str);
            }
        }

        public void a(boolean z) {
            this.a = z;
        }

        private void a(int i, long j, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a(i, j, str, str2, str3));
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static final class j implements com.mbridge.msdk.foundation.same.image.c {
        private Handler a;
        private int b;
        private String c;
        private String d;
        private String e;
        private CampaignEx f;

        /* compiled from: RewardCampaignsResourceManager.java */
        class a implements Runnable {
            final /* synthetic */ String a;

            a(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (j.this.f != null) {
                    try {
                        com.mbridge.msdk.foundation.db.n a = com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                        q0.a("RewardCampaignsResourceManager", "campaign is null");
                        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                        nVar.j("2000044");
                        nVar.c(m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
                        nVar.b(j.this.f.getId());
                        nVar.i(j.this.f.getImageUrl());
                        nVar.n(j.this.f.getRequestId());
                        nVar.k(j.this.f.getCurrentLocalRid());
                        nVar.o(j.this.f.getRequestIdNotice());
                        nVar.u(j.this.c);
                        nVar.m(this.a);
                        nVar.b("scenes", "1");
                        a.a(nVar);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                }
            }
        }

        public j(Handler handler, int i, String str, String str2, String str3, CampaignEx campaignEx) {
            this.a = handler;
            this.b = i;
            this.d = str;
            this.c = str2;
            this.e = str3;
            this.f = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            Message obtain = Message.obtain();
            obtain.what = this.b == 0 ? 202 : 204;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.d);
            bundle.putString("request_id", this.e);
            bundle.putString("key", this.c + "_" + this.e + "_" + this.f.getSecondRequestIndex());
            obtain.setData(bundle);
            this.a.sendMessage(obtain);
            a aVar = new a(str);
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
            } else {
                aVar.run();
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            ResDownloadCheckManager.getInstance().setImageDownloadDone(str, true);
            Message obtain = Message.obtain();
            obtain.what = this.b == 0 ? 102 : 104;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.d);
            bundle.putString("request_id", this.e);
            bundle.putString("key", this.c + "_" + this.e + "_" + this.f.getSecondRequestIndex());
            obtain.setData(bundle);
            this.a.sendMessage(obtain);
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static final class l implements H5DownLoadManager.ZipDownloadListener {
        private Context b;
        private String c;
        private String d;
        private String e;
        private CampaignEx f;
        private int g;
        private Handler h;
        private n i;
        private CopyOnWriteArrayList<CampaignEx> j;
        private boolean a = false;
        private long k = System.currentTimeMillis();

        /* compiled from: RewardCampaignsResourceManager.java */
        class a implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;

            a(int i, String str, String str2, String str3) {
                this.a = i;
                this.b = str;
                this.c = str2;
                this.d = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (l.this.f == null || l.this.b == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                    nVar.j("m_download_end");
                    if (l.this.b != null) {
                        nVar.c(m0.s(l.this.b.getApplicationContext()));
                    }
                    nVar.d(this.a);
                    if (l.this.f != null) {
                        nVar.b(l.this.f.getId());
                        nVar.n(l.this.f.getRequestId());
                        nVar.k(l.this.f.getCurrentLocalRid());
                        nVar.o(l.this.f.getRequestIdNotice());
                    }
                    nVar.t(this.b);
                    nVar.m(this.c);
                    nVar.u(l.this.c);
                    if (!TextUtils.isEmpty(this.d)) {
                        nVar.q(this.d);
                    }
                    nVar.e(2);
                    nVar.b("scenes", "1");
                    nVar.b("url", this.b);
                    b.b(nVar, l.this.f);
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, l.this.f);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                    }
                }
            }
        }

        /* compiled from: RewardCampaignsResourceManager.java */
        /* renamed from: com.mbridge.msdk.reward.adapter.b$l$b, reason: collision with other inner class name */
        class RunnableC1448b implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ long b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ String e;

            RunnableC1448b(int i, long j, String str, String str2, String str3) {
                this.a = i;
                this.b = j;
                this.c = str;
                this.d = str2;
                this.e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (l.this.f == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("m_download_end", this.a, this.b + "", this.c, l.this.f.getId(), l.this.c, this.d, "1");
                    nVar.n(l.this.f.getRequestId());
                    nVar.k(l.this.f.getCurrentLocalRid());
                    nVar.o(l.this.f.getRequestIdNotice());
                    nVar.b(l.this.f.getId());
                    nVar.a(l.this.f.getAdSpaceT());
                    nVar.q(this.e);
                    nVar.b("scenes", "1");
                    if (l.this.f.getAdType() == 287) {
                        nVar.a("3");
                    } else if (l.this.f.getAdType() == 94) {
                        nVar.a("1");
                    }
                    nVar.b("url", this.c);
                    nVar.e(3);
                    b.b(nVar, l.this.f);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, l.this.c, l.this.f);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                    }
                }
            }
        }

        public l(Context context, String str, String str2, String str3, CampaignEx campaignEx, int i, Handler handler, n nVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.b = context;
            this.d = str;
            this.c = str2;
            this.e = str3;
            this.f = campaignEx;
            this.g = i;
            this.h = handler;
            this.i = nVar;
            this.j = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
            long currentTimeMillis = System.currentTimeMillis() - this.k;
            int i = this.g;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.d);
                bundle.putString("request_id", this.e);
                bundle.putString("key", this.c + "_" + this.e + "_" + this.f.getSecondRequestIndex());
                bundle.putString("url", str2);
                bundle.putString("message", str);
                obtain.setData(bundle);
                this.h.sendMessage(obtain);
                return;
            }
            if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.d);
                bundle2.putString("request_id", this.e);
                bundle2.putString("url", str2);
                bundle2.putString("key", this.c + "_" + this.e + "_" + this.f.getSecondRequestIndex());
                bundle2.putString("message", str);
                obtain2.setData(bundle2);
                this.h.sendMessage(obtain2);
                if (this.a) {
                    a(3, currentTimeMillis, str2, "zip download failed", "");
                    return;
                }
                return;
            }
            if (i != 859) {
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 203;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.d);
            bundle3.putString("request_id", this.e);
            bundle3.putString("url", str2);
            bundle3.putString("key", this.c + "_" + this.e + "_" + this.f.getSecondRequestIndex());
            bundle3.putString("message", str);
            obtain3.setData(bundle3);
            this.h.sendMessage(obtain3);
            if (this.i != null) {
                try {
                    this.i.a(str2, this.e, b.b(880006, new MBridgeIds(this.d, this.c, this.e), "", null, null));
                } catch (Exception e) {
                    q0.b("RewardCampaignsResourceManager", e.getMessage());
                }
            }
            a(3, str2, str, "");
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            long currentTimeMillis = System.currentTimeMillis() - this.k;
            int i = this.g;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.d);
                bundle.putString("request_id", this.e);
                bundle.putString("key", this.c + "_" + this.e + "_" + this.f.getSecondRequestIndex());
                bundle.putString("url", str);
                obtain.setData(bundle);
                this.h.sendMessage(obtain);
                return;
            }
            if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.d);
                bundle2.putString("request_id", this.e);
                bundle2.putString("key", this.c + "_" + this.e + "_" + this.f.getSecondRequestIndex());
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                this.h.sendMessage(obtain2);
                if (this.a) {
                    a(1, currentTimeMillis, str, "", str2);
                    return;
                }
                return;
            }
            if (i != 859) {
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 103;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.d);
            bundle3.putString("request_id", this.e);
            bundle3.putString("key", this.c + "_" + this.e + "_" + this.f.getSecondRequestIndex());
            obtain3.setData(bundle3);
            this.h.sendMessage(obtain3);
            n nVar = this.i;
            if (nVar != null) {
                nVar.a(this.d, this.c, this.e, str);
            }
            if (z) {
                return;
            }
            a(1, str, "", str2);
        }

        public void a(boolean z) {
            this.a = z;
        }

        private void a(int i, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a(i, str, str2, str3));
        }

        private void a(int i, long j, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new RunnableC1448b(i, j, str, str2, str3));
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static final class m extends Handler {
        private Context a;
        private ConcurrentHashMap<String, h> b;
        private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> c;

        public m(Looper looper) {
            super(looper);
            this.b = new ConcurrentHashMap<>();
            this.c = new ConcurrentHashMap<>();
        }

        public void a(String str, h hVar) {
            this.b.put(str, hVar);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(16:6|(1:8)|9|(1:244)(1:13)|14|15|16|17|(3:67|68|(3:70|(6:(2:77|(2:79|(2:81|(2:83|(2:86|(0)(2:89|(2:93|(0))))(1:85))(2:98|(0)))(2:101|(0)))(2:104|(0)))|107|108|109|110|111)(10:119|120|121|122|(2:124|(2:126|(2:128|(1:(1:139)(1:137)))(1:(4:172|(4:175|(2:179|180)|181|173)|184|185)(1:170)))(1:(4:195|(6:198|(1:202)|203|(2:207|208)|209|196)|212|213)(1:193)))(1:(4:223|(4:226|(2:228|229)(1:231)|230|224)|232|233)(1:221))|140|141|142|143|(2:152|153)(2:145|(4:147|148|149|31)))|28))|19|20|21|22|(1:24)(5:(2:39|(2:41|(2:43|(2:45|(0))(2:51|(0)))(2:54|(0)))(2:57|(0)))|60|61|62|63)|25|31) */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x03b3, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x03b4, code lost:
        
            r6 = r12;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:257:0x0478  */
        /* JADX WARN: Removed duplicated region for block: B:259:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r12v1, types: [int] */
        /* JADX WARN: Type inference failed for: r12v11 */
        /* JADX WARN: Type inference failed for: r12v2 */
        /* JADX WARN: Type inference failed for: r12v3 */
        /* JADX WARN: Type inference failed for: r12v4 */
        /* JADX WARN: Type inference failed for: r12v5 */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r12v8 */
        /* JADX WARN: Type inference failed for: r15v12, types: [boolean] */
        /* JADX WARN: Type inference failed for: r15v9 */
        /* JADX WARN: Type inference failed for: r20v0, types: [com.mbridge.msdk.videocommon.download.b] */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v13 */
        /* JADX WARN: Type inference failed for: r6v14, types: [int] */
        /* JADX WARN: Type inference failed for: r6v16 */
        /* JADX WARN: Type inference failed for: r6v17 */
        /* JADX WARN: Type inference failed for: r6v18 */
        /* JADX WARN: Type inference failed for: r6v4 */
        /* JADX WARN: Type inference failed for: r6v5 */
        /* JADX WARN: Type inference failed for: r6v6, types: [int] */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference failed for: r6v8 */
        /* JADX WARN: Type inference failed for: r6v9 */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void handleMessage(Message message) {
            String str;
            boolean z;
            ?? r6;
            CampaignEx campaignEx;
            Bundle data = message.getData();
            String string = data.getString(MBridgeConstans.PLACEMENT_ID);
            String string2 = data.getString(MBridgeConstans.PROPERTIES_UNIT_ID);
            String string3 = data.getString("request_id");
            String string4 = data.getString("key");
            f fVar = (f) b.g.get(string4);
            h hVar = this.b.get(string4);
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.c.get(string4);
            int i = message.what;
            String str2 = "RewardCampaignsResourceManager";
            switch (i) {
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                    break;
                default:
                    switch (i) {
                        case 200:
                        case 201:
                        case 203:
                        case 205:
                            if (fVar != null && hVar != null) {
                                String string5 = data.getString("message");
                                if (string5 == null) {
                                    string5 = "";
                                }
                                ?? c = b.c(message.what);
                                String str3 = "resource download failed " + b.d(message.what) + " " + string5;
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = fVar.h;
                                CampaignEx campaignEx2 = (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.size() <= 0) ? null : fVar.h.get(0);
                                try {
                                    try {
                                    } catch (Exception e) {
                                        e = e;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    r6 = c;
                                }
                                if (fVar.a) {
                                    try {
                                    } catch (Exception e3) {
                                        e = e3;
                                        str2 = c;
                                    }
                                    if (fVar.i != null) {
                                        if (fVar.c == 1) {
                                            if (campaignEx2 != null && campaignEx2.getRsIgnoreCheckRule() != null && campaignEx2.getRsIgnoreCheckRule().size() > 0) {
                                                int i2 = message.what;
                                                if (i2 != 200) {
                                                    if (i2 != 201) {
                                                        if (i2 != 203) {
                                                            if (i2 == 205) {
                                                                if (!campaignEx2.getRsIgnoreCheckRule().contains(3)) {
                                                                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList3 = fVar.h;
                                                                    if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
                                                                        CampaignEx campaignEx3 = fVar.h.get(0);
                                                                        if (campaignEx3.getCMPTEntryUrl().equals(campaignEx3.getendcard_url()) && campaignEx2.getRsIgnoreCheckRule().contains(2)) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else if (campaignEx2.getRsIgnoreCheckRule().contains(1)) {
                                                        }
                                                    } else if (campaignEx2.getRsIgnoreCheckRule().contains(2)) {
                                                    }
                                                } else if (campaignEx2.getRsIgnoreCheckRule().contains(0)) {
                                                }
                                            }
                                            try {
                                                campaignEx = null;
                                                try {
                                                    hVar.a(fVar.h, b.b(c, new MBridgeIds(string, string2, string3), str3, null, null));
                                                    this.b.remove(string4);
                                                    b.g.remove(string4);
                                                    this.c.remove(string4);
                                                    break;
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    r6 = c;
                                                    hVar.a(fVar.h, b.b(r6, new MBridgeIds(string, string2, string3), str3, e, campaignEx));
                                                    return;
                                                }
                                            } catch (Exception e5) {
                                                e = e5;
                                                campaignEx = null;
                                            }
                                        } else {
                                            try {
                                                String string6 = data.getString("url");
                                                int i3 = message.what;
                                                try {
                                                    if (i3 == 200) {
                                                        if (campaignEx2 != null && campaignEx2.getRsIgnoreCheckRule() != null && campaignEx2.getRsIgnoreCheckRule().size() > 0 && campaignEx2.getRsIgnoreCheckRule().contains(0)) {
                                                            q0.c("RewardCampaignsResourceManager", "Is TPL but  video download fail but hit ignoreCheckRule");
                                                            break;
                                                        } else {
                                                            for (int i4 = 0; i4 < fVar.i.size(); i4++) {
                                                                if (fVar.i.get(i4).getVideoUrlEncode().equals(string6)) {
                                                                    fVar.i.remove(i4);
                                                                }
                                                            }
                                                            b.g.remove(string4);
                                                            b.g.put(string4, fVar);
                                                        }
                                                    } else if (i3 == 201) {
                                                        if (campaignEx2 != null && campaignEx2.getRsIgnoreCheckRule() != null && campaignEx2.getRsIgnoreCheckRule().size() > 0 && campaignEx2.getRsIgnoreCheckRule().contains(2)) {
                                                            q0.c("RewardCampaignsResourceManager", "Is TPL but download endcard fail but hit ignoreCheckRule");
                                                            break;
                                                        } else {
                                                            for (int i5 = 0; i5 < fVar.i.size(); i5++) {
                                                                CampaignEx campaignEx4 = fVar.i.get(i5);
                                                                if (campaignEx4.getRewardTemplateMode() != null && campaignEx4.getRewardTemplateMode().h().equals(string6)) {
                                                                    fVar.i.remove(i5);
                                                                }
                                                                if (!TextUtils.isEmpty(campaignEx4.getendcard_url()) && campaignEx4.getendcard_url().equals(string6)) {
                                                                    fVar.i.remove(i5);
                                                                }
                                                            }
                                                            b.g.remove(string4);
                                                            b.g.put(string4, fVar);
                                                        }
                                                    } else if (i3 == 203) {
                                                        if (campaignEx2 != null && campaignEx2.getRsIgnoreCheckRule() != null && campaignEx2.getRsIgnoreCheckRule().size() > 0 && campaignEx2.getRsIgnoreCheckRule().contains(1)) {
                                                            q0.c("RewardCampaignsResourceManager", "Is TPL but download template fail but hit ignoreCheckRule");
                                                            break;
                                                        } else {
                                                            for (int i6 = 0; i6 < fVar.i.size(); i6++) {
                                                                CampaignEx campaignEx5 = fVar.i.get(i6);
                                                                if (campaignEx5.getRewardTemplateMode() != null && campaignEx5.getRewardTemplateMode().j().equals(string6)) {
                                                                    fVar.i.remove(i6);
                                                                }
                                                            }
                                                            b.g.remove(string4);
                                                            b.g.put(string4, fVar);
                                                        }
                                                    } else if (i3 == 205) {
                                                        if (campaignEx2 != null && campaignEx2.getRsIgnoreCheckRule() != null && campaignEx2.getRsIgnoreCheckRule().size() > 0 && campaignEx2.getRsIgnoreCheckRule().contains(3)) {
                                                            q0.c("RewardCampaignsResourceManager", "Is TPL but download BTL Template fail but hit ignoreCheckRule");
                                                            break;
                                                        } else {
                                                            fVar.i.clear();
                                                            b.g.remove(string4);
                                                            b.g.put(string4, fVar);
                                                        }
                                                    }
                                                    try {
                                                        if (com.mbridge.msdk.videocommon.download.b.getInstance().a(94, fVar.e, fVar.b, fVar.d, fVar.a, fVar.c, copyOnWriteArrayList)) {
                                                            try {
                                                                hVar.a(string, string2, string3, fVar.h);
                                                                this.b.remove(string4);
                                                                b.g.remove(string4);
                                                                this.c.remove(string4);
                                                                break;
                                                            } catch (Exception e6) {
                                                                e = e6;
                                                                r6 = c;
                                                                campaignEx = null;
                                                                hVar.a(fVar.h, b.b(r6, new MBridgeIds(string, string2, string3), str3, e, campaignEx));
                                                                return;
                                                            }
                                                        } else if (fVar.i.size() == 0) {
                                                            ?? r15 = c;
                                                            c = 0;
                                                            hVar.a(fVar.h, b.b(r15 == true ? 1 : 0, new MBridgeIds(string, string2, string3), str3, null, null));
                                                            this.b.remove(string4);
                                                            b.g.remove(string4);
                                                            this.c.remove(string4);
                                                            str2 = r15;
                                                            break;
                                                        }
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                        str2 = c;
                                                        c = 0;
                                                        campaignEx = c;
                                                        r6 = str2;
                                                        hVar.a(fVar.h, b.b(r6, new MBridgeIds(string, string2, string3), str3, e, campaignEx));
                                                        return;
                                                    }
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    r6 = c;
                                                    campaignEx = null;
                                                }
                                            } catch (Exception e9) {
                                                e = e9;
                                                str2 = c;
                                                c = 0;
                                                campaignEx = c;
                                                r6 = str2;
                                                hVar.a(fVar.h, b.b(r6, new MBridgeIds(string, string2, string3), str3, e, campaignEx));
                                                return;
                                            }
                                        }
                                        hVar.a(fVar.h, b.b(r6, new MBridgeIds(string, string2, string3), str3, e, campaignEx));
                                    }
                                }
                                ?? bVar = com.mbridge.msdk.videocommon.download.b.getInstance();
                                String str4 = fVar.e;
                                boolean z2 = fVar.b;
                                int i7 = fVar.d;
                                String str5 = str4;
                                ?? r152 = fVar.a;
                                if (bVar.a(94, str5, z2, i7, r152, fVar.c, copyOnWriteArrayList)) {
                                    hVar.a(string, string2, string3, fVar.h);
                                    r6 = c;
                                    campaignEx = null;
                                } else {
                                    if (campaignEx2 != null && campaignEx2.getRsIgnoreCheckRule() != null && campaignEx2.getRsIgnoreCheckRule().size() > 0) {
                                        int i8 = message.what;
                                        if (i8 != 200) {
                                            if (i8 != 201) {
                                                if (i8 != 203) {
                                                    if (i8 == 205 && campaignEx2.getRsIgnoreCheckRule().contains(3)) {
                                                    }
                                                } else if (campaignEx2.getRsIgnoreCheckRule().contains(1)) {
                                                }
                                            } else if (campaignEx2.getRsIgnoreCheckRule().contains(2)) {
                                            }
                                        } else if (campaignEx2.getRsIgnoreCheckRule().contains(0)) {
                                        }
                                    }
                                    r6 = c;
                                    campaignEx = null;
                                    try {
                                        hVar.a(fVar.h, b.b(r6, new MBridgeIds(string, string2, string3), str3, null, null));
                                    } catch (Exception e10) {
                                        e = e10;
                                    }
                                }
                                this.b.remove(string4);
                                b.g.remove(string4);
                                this.c.remove(string4);
                                c = str5;
                                str2 = r152;
                            }
                            break;
                    }
                    return;
            }
            if (fVar == null || hVar == null) {
                return;
            }
            try {
                str = "RewardCampaignsResourceManager";
            } catch (Exception e11) {
                e = e11;
                str = "RewardCampaignsResourceManager";
            }
            try {
                z = com.mbridge.msdk.videocommon.download.b.getInstance().a(94, fVar.e, fVar.b, fVar.d, fVar.a, fVar.c, copyOnWriteArrayList);
            } catch (Exception e12) {
                e = e12;
                if (MBridgeConstans.DEBUG) {
                    q0.b(str, e.getLocalizedMessage());
                }
                z = false;
                if (z) {
                }
            }
            if (z) {
                return;
            }
            hVar.a(string, string2, string3, fVar.h);
            this.b.remove(string4);
            b.g.remove(string4);
            this.c.remove(string4);
        }

        public void a(Context context) {
            this.a = context;
        }

        public void a(String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.c.put(str, copyOnWriteArrayList);
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    public interface n {
        void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar);

        void a(String str, String str2, String str3, String str4);
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    public interface o {
        void a(String str, String str2, String str3, a.C1499a c1499a, com.mbridge.msdk.foundation.error.b bVar);

        void a(String str, String str2, String str3, String str4, String str5, a.C1499a c1499a);
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static class p extends com.mbridge.msdk.mbsignalcommon.listener.b {
        private Handler a;
        private Runnable b;
        private final boolean c;
        private final boolean d;
        private String e;
        private final o f;
        private final WindVaneWebView g;
        private final String h;
        private final String i;
        private final String j;
        private final a.C1499a k;
        private final CampaignEx l;
        private CopyOnWriteArrayList<CampaignEx> m;
        private long n;
        private boolean o;
        private boolean p;
        private final Runnable q;
        private final Runnable r;

        /* compiled from: RewardCampaignsResourceManager.java */
        class a implements Runnable {
            final /* synthetic */ o a;
            final /* synthetic */ a.C1499a b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ String e;
            final /* synthetic */ String f;

            a(o oVar, a.C1499a c1499a, String str, String str2, String str3, String str4) {
                this.a = oVar;
                this.b = c1499a;
                this.c = str;
                this.d = str2;
                this.e = str3;
                this.f = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView b;
                a.C1499a c1499a;
                if (this.a != null && (c1499a = this.b) != null) {
                    c1499a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.c + "_" + this.d + "_" + this.e, true);
                    o oVar = this.a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.c);
                    sb.append("_");
                    sb.append(this.e);
                    oVar.a(sb.toString(), this.f, this.c, this.d, this.e, this.b);
                }
                a.C1499a c1499a2 = this.b;
                if (c1499a2 == null || (b = c1499a2.b()) == null) {
                    return;
                }
                try {
                    b.release();
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e.getMessage());
                    }
                }
            }
        }

        /* compiled from: RewardCampaignsResourceManager.java */
        /* renamed from: com.mbridge.msdk.reward.adapter.b$p$b, reason: collision with other inner class name */
        class RunnableC1449b implements Runnable {
            final /* synthetic */ o a;
            final /* synthetic */ a.C1499a b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ String e;
            final /* synthetic */ String f;

            RunnableC1449b(o oVar, a.C1499a c1499a, String str, String str2, String str3, String str4) {
                this.a = oVar;
                this.b = c1499a;
                this.c = str;
                this.d = str2;
                this.e = str3;
                this.f = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView b;
                a.C1499a c1499a;
                if (this.a != null && (c1499a = this.b) != null) {
                    c1499a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.c + "_" + this.d + "_" + this.e, true);
                    o oVar = this.a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.c);
                    sb.append("_");
                    sb.append(this.e);
                    oVar.a(sb.toString(), this.f, this.c, this.d, this.e, this.b);
                }
                a.C1499a c1499a2 = this.b;
                if (c1499a2 == null || (b = c1499a2.b()) == null) {
                    return;
                }
                try {
                    b.release();
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e.getMessage());
                    }
                }
            }
        }

        public p(Handler handler, Runnable runnable, boolean z, boolean z2, String str, o oVar, WindVaneWebView windVaneWebView, String str2, String str3, String str4, a.C1499a c1499a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, long j) {
            this.a = handler;
            this.b = runnable;
            this.c = z;
            this.d = z2;
            this.e = str;
            this.f = oVar;
            this.g = windVaneWebView;
            this.h = str2;
            this.i = str4;
            this.j = str3;
            this.k = c1499a;
            this.l = campaignEx;
            this.m = copyOnWriteArrayList;
            this.n = j;
            a aVar = new a(oVar, c1499a, str4, str, str2, str3);
            this.r = aVar;
            this.q = new RunnableC1449b(oVar, c1499a, str4, str, str2, str3);
            if (handler != null) {
                handler.postDelayed(aVar, 5000L);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i) {
            Handler handler;
            Runnable runnable;
            Runnable runnable2;
            super.a(webView, i);
            Handler handler2 = this.a;
            if (handler2 != null && (runnable2 = this.q) != null) {
                handler2.removeCallbacks(runnable2);
            }
            Handler handler3 = this.a;
            if (handler3 != null && (runnable = this.r) != null) {
                handler3.removeCallbacks(runnable);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                eVar.a("result", Integer.valueOf(i));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.l, eVar);
            } catch (Throwable th) {
                q0.b("WindVaneWebView", th.getMessage());
            }
            if (this.p) {
                return;
            }
            String str = this.i + "_" + this.h;
            if (i == 1) {
                Runnable runnable3 = this.b;
                if (runnable3 != null && (handler = this.a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.i + "_" + this.e + "_" + this.h, true);
                a.C1499a c1499a = this.k;
                if (c1499a != null) {
                    c1499a.a(true);
                }
                if (this.c) {
                    if (this.d) {
                        com.mbridge.msdk.videocommon.a.a(287, this.l.getRequestIdNotice(), this.k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(287, this.l.getRequestIdNotice(), this.k);
                    }
                } else if (this.d) {
                    com.mbridge.msdk.videocommon.a.a(94, this.l.getRequestIdNotice(), this.k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.l.getRequestIdNotice(), this.k);
                }
                o oVar = this.f;
                if (oVar != null) {
                    oVar.a(str, this.j, this.i, this.e, this.h, this.k);
                }
            } else if (this.f != null) {
                this.f.a(str, this.e, this.h, this.k, b.b(880009, new MBridgeIds(this.j, this.i, this.e), "readyState:" + i, null, this.l));
            }
            this.p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            Handler handler;
            Runnable runnable2;
            super.onPageFinished(webView, str);
            Handler handler2 = this.a;
            if (handler2 != null && (runnable2 = this.r) != null) {
                handler2.removeCallbacks(runnable2);
            }
            if (this.o) {
                return;
            }
            if (str.contains("wfr=1")) {
                Handler handler3 = this.a;
                if (handler3 != null && (runnable = this.q) != null) {
                    handler3.postDelayed(runnable, 5000L);
                }
            } else {
                String str2 = this.i + "_" + this.h;
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.i + "_" + this.e + "_" + this.h, true);
                Runnable runnable3 = this.b;
                if (runnable3 != null && (handler = this.a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                a.C1499a c1499a = this.k;
                if (c1499a != null) {
                    c1499a.a(true);
                }
                if (this.c) {
                    if (this.l.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(287, this.l.getRequestIdNotice(), this.k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(287, this.l.getRequestIdNotice(), this.k);
                    }
                } else if (this.l.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.l.getRequestIdNotice(), this.k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.l.getRequestIdNotice(), this.k);
                }
                o oVar = this.f;
                if (oVar != null) {
                    oVar.a(str2, this.j, this.i, this.e, this.h, this.k);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.o = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.i + "_" + this.e + "_" + this.h, false);
            Handler handler = this.a;
            if (handler != null) {
                if (this.q != null) {
                    handler.removeCallbacks(this.r);
                }
                Runnable runnable = this.q;
                if (runnable != null) {
                    this.a.removeCallbacks(runnable);
                }
            }
            try {
                String str3 = this.i + "_" + this.h;
                a.C1499a c1499a = this.k;
                if (c1499a != null) {
                    c1499a.a(false);
                }
                if (this.f != null) {
                    this.f.a(str3, this.e, str2, this.k, b.b(880009, new MBridgeIds(this.j, this.i, this.e), i + "#" + str, null, this.l));
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("WindVaneWebView", e.getLocalizedMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.i + "_" + this.e + "_" + this.h, false);
            Handler handler = this.a;
            if (handler != null) {
                if (this.q != null) {
                    handler.removeCallbacks(this.r);
                }
                Runnable runnable = this.q;
                if (runnable != null) {
                    this.a.removeCallbacks(runnable);
                }
            }
            try {
                String str = this.i + "_" + this.h;
                a.C1499a c1499a = this.k;
                if (c1499a != null) {
                    c1499a.a(false);
                }
                if (this.f != null) {
                    MBridgeIds mBridgeIds = new MBridgeIds(this.j, this.i, this.e);
                    StringBuilder sb = new StringBuilder();
                    sb.append("onReceivedSslError:");
                    sb.append(sslError == null ? "" : Integer.valueOf(sslError.getPrimaryError()));
                    this.f.a(str, this.e, this.h, this.k, b.b(880009, mBridgeIds, sb.toString(), null, this.l));
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("WindVaneWebView", e.getLocalizedMessage());
                }
            }
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static class q extends com.mbridge.msdk.mbsignalcommon.listener.b {
        private String a;
        private final boolean b;
        private final WindVaneWebView c;
        private final String d;
        private final String e;
        private final a.C1499a f;
        private final CampaignEx g;
        private boolean h;
        private String i;
        private boolean j;
        private boolean k;

        public q(String str, boolean z, WindVaneWebView windVaneWebView, String str2, String str3, a.C1499a c1499a, CampaignEx campaignEx, boolean z2, String str4) {
            this.b = z;
            this.c = windVaneWebView;
            this.d = str2;
            this.e = str3;
            this.f = c1499a;
            this.g = campaignEx;
            this.a = str;
            this.h = z2;
            this.i = str4;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                eVar.a("result", Integer.valueOf(i));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.g, eVar);
            } catch (Throwable th) {
                q0.b("WindVaneWebView", th.getMessage());
            }
            if (this.k) {
                return;
            }
            if (this.c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i);
                    jSONObject2.put("error", "");
                    jSONObject.put("data", jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e.getLocalizedMessage());
                    }
                }
            }
            String str = this.e + "_" + this.g.getId() + "_" + this.g.getRequestId() + "_" + this.d;
            if (i == 1) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.e + "_" + this.i + "_" + this.d, true);
                a.C1499a c1499a = this.f;
                if (c1499a != null) {
                    c1499a.a(true);
                }
                if (this.b) {
                    if (this.g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(str, this.f, false, this.h);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str, this.f, false, this.h);
                    }
                } else if (this.g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(str, this.f, false, this.h);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str, this.f, false, this.h);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.e + "_" + this.i + "_" + this.d, false);
                a.C1499a c1499a2 = this.f;
                if (c1499a2 != null) {
                    c1499a2.a(false);
                }
            }
            this.k = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            if (this.j) {
                return;
            }
            if (!str.contains("wfr=1")) {
                if (this.c != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "");
                        jSONObject.put("data", jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.c, "componentReact", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("WindVaneWebView", e.getLocalizedMessage());
                        }
                    }
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.e + "_" + this.i + "_" + this.d, true);
                a.C1499a c1499a = this.f;
                if (c1499a != null) {
                    c1499a.a(true);
                }
                String str2 = this.e + "_" + this.g.getId() + "_" + this.g.getRequestId() + "_" + this.d;
                if (this.b) {
                    if (this.g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(287, this.g.getRequestIdNotice(), this.f);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str2, this.f, false, this.h);
                    }
                } else if (this.g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.g.getRequestIdNotice(), this.f);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str2, this.f, false, this.h);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.j = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.e + "_" + this.i + "_" + this.d, false);
            a.C1499a c1499a = this.f;
            if (c1499a != null) {
                c1499a.a(false);
            }
            if (this.c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", str);
                    jSONObject.put("data", jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e.getLocalizedMessage());
                    }
                }
            }
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static final class r {
        private static final b a = new b(null);
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(int i2) {
        if (i2 == 200) {
            return 880004;
        }
        if (i2 == 201) {
            return 880007;
        }
        if (i2 != 203) {
            return i2 != 205 ? 880024 : 880005;
        }
        return 880006;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static synchronized String d(int i2) {
        synchronized (b.class) {
            return i2 != 200 ? i2 != 201 ? i2 != 203 ? i2 != 205 ? "unknown" : "tpl" : "temp" : "zip/html" : "video";
        }
    }

    public void c() {
    }

    private b() {
        this.c = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;
        this.d = "down_type";
        this.e = "h3c";
        this.f = new ArrayList(6);
        HandlerThread handlerThread = new HandlerThread("mb-reward-load-thread");
        g = new ConcurrentHashMap<>();
        handlerThread.start();
        this.a = new m(handlerThread.getLooper());
    }

    public static b b() {
        return r.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.mbridge.msdk.foundation.entity.n nVar, CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.videocommon.setting.c c2 = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), campaignEx.getCampaignUnitId());
            if (c2 != null) {
                nVar.s(c2.x());
            }
            com.mbridge.msdk.videocommon.setting.a c3 = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (c3 != null) {
                nVar.r(c3.f());
            }
        } catch (Exception e2) {
            q0.b("RewardCampaignsResourceManager", e2.getMessage());
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static final class k implements com.mbridge.msdk.videocommon.listener.a {
        private Handler a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;

        public k(Handler handler, String str, String str2, String str3, String str4) {
            this.a = handler;
            this.c = str;
            this.b = str2;
            this.d = str3;
            this.e = str4;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str, true);
            Message obtain = Message.obtain();
            obtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.c);
            bundle.putString("request_id", this.d);
            bundle.putString("key", this.e);
            bundle.putString("url", str);
            obtain.setData(bundle);
            this.a.sendMessage(obtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str2, false);
            Message obtain = Message.obtain();
            obtain.what = 200;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.c);
            bundle.putString("request_id", this.d);
            bundle.putString("url", str2);
            bundle.putString("key", this.e);
            bundle.putString("message", str);
            obtain.setData(bundle);
            this.a.sendMessage(obtain);
        }
    }

    public synchronized void a(Context context, boolean z, int i2, boolean z2, int i3, String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, h hVar, n nVar) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        String str4 = str2 + "_" + str3 + "_" + copyOnWriteArrayList2.get(0).getSecondRequestIndex();
        g.put(str4, new f(z, z2, i2, copyOnWriteArrayList2.size(), str2, str3, i3, copyOnWriteArrayList2));
        this.a.a(str4, hVar);
        this.a.a(context);
        this.a.a(str4, copyOnWriteArrayList2);
        this.a.post(new a(copyOnWriteArrayList2, context, str2, i3, str, str3, str4, nVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.mbridge.msdk.foundation.error.b b(int i2, MBridgeIds mBridgeIds, String str, Throwable th, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i2);
        bVar.a(mBridgeIds);
        bVar.a(th);
        bVar.c(str);
        bVar.a(campaignEx);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, CampaignEx campaignEx, String str, String str2) {
        z.a(i2, str, str2, new C1447b(i2, campaignEx), campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2, String str3, CampaignEx campaignEx, String str4, n nVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        if (TextUtils.isEmpty(str4) || campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.metrics.c a2 = a(campaignEx, 3);
        if (str4.contains(".zip") && str4.contains(ResourceManager.KEY_MD5FILENAME)) {
            boolean isEmpty = TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str4));
            try {
                l lVar = new l(context, str, str2, str3, campaignEx, 497, this.a, nVar, copyOnWriteArrayList);
                lVar.a(isEmpty);
                H5DownLoadManager.getInstance().downloadH5Res(a2, str4, lVar);
                return;
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                    return;
                }
                return;
            }
        }
        boolean isEmpty2 = TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str4));
        try {
            i iVar = new i(497, str, str2, str3, campaignEx, nVar, this.a, copyOnWriteArrayList);
            iVar.a(isEmpty2);
            H5DownLoadManager.getInstance().downloadH5Res(a2, str4, iVar);
        } catch (Exception e3) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardCampaignsResourceManager", e3.getLocalizedMessage());
            }
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static class g extends com.mbridge.msdk.mbsignalcommon.listener.a {
        private final Handler a;
        private final Runnable b;
        private final boolean c;
        private final boolean d;
        private int e;
        private String f;
        private String g;
        private String h;
        private String i;
        private a.C1499a j;
        private CampaignEx k;
        private CopyOnWriteArrayList<CampaignEx> l;
        private com.mbridge.msdk.videocommon.setting.c m;
        private final o n;
        private boolean o;
        private boolean p;
        private boolean q;
        private int r = 0;
        private boolean s;
        private long t;

        public g(boolean z, Handler handler, Runnable runnable, boolean z2, boolean z3, int i, String str, String str2, String str3, String str4, a.C1499a c1499a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.setting.c cVar, o oVar, boolean z4, long j) {
            this.a = handler;
            this.b = runnable;
            this.c = z2;
            this.d = z3;
            this.e = i;
            this.f = str;
            this.h = str2;
            this.g = str3;
            this.i = str4;
            this.j = c1499a;
            this.k = campaignEx;
            this.l = copyOnWriteArrayList;
            this.m = cVar;
            this.n = oVar;
            this.o = z4;
            this.s = z;
            this.t = j;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i) {
            Runnable runnable;
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 1);
                eVar.a("result", Integer.valueOf(i));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.k, eVar);
            } catch (Throwable th) {
                q0.b("RVWindVaneWebView", th.getMessage());
            }
            if (this.q) {
                return;
            }
            String str = this.g + "_" + this.f;
            if (i == 1) {
                if (this.o) {
                    com.mbridge.msdk.videocommon.a.d(this.g + "_" + this.i);
                } else {
                    com.mbridge.msdk.videocommon.a.c(this.g + "_" + this.i);
                }
                com.mbridge.msdk.videocommon.a.a(this.g + "_" + this.i + "_" + this.f, this.j, true, this.o);
                Handler handler = this.a;
                if (handler != null && (runnable = this.b) != null) {
                    handler.removeCallbacks(runnable);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.g + "_" + this.i + "_" + this.f, true);
                a.C1499a c1499a = this.j;
                if (c1499a != null) {
                    c1499a.a(true);
                }
                o oVar = this.n;
                if (oVar != null) {
                    oVar.a(str, this.h, this.g, this.i, this.f, this.j);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.g + "_" + this.i + "_" + this.f, false);
                a.C1499a c1499a2 = this.j;
                if (c1499a2 != null) {
                    c1499a2.a(false);
                }
                if (this.n != null) {
                    this.n.a(str, this.i, this.f, this.j, b.b(880008, new MBridgeIds(this.h, this.g, this.i), "readyState:" + i, null, this.k));
                }
            }
            this.q = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            super.onPageFinished(webView, str);
            if (this.p) {
                return;
            }
            String str2 = this.g + "_" + this.f;
            if (!str.contains("wfr=1")) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.g + "_" + this.i + "_" + this.f, true);
                Handler handler = this.a;
                if (handler != null && (runnable = this.b) != null) {
                    handler.removeCallbacks(runnable);
                }
                a.C1499a c1499a = this.j;
                if (c1499a != null) {
                    c1499a.a(true);
                }
                o oVar = this.n;
                if (oVar != null) {
                    oVar.a(str2, this.h, this.g, this.i, this.f, this.j);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.g + "_" + this.i + "_" + this.f, false);
            if (this.n != null) {
                String str3 = this.g + "_" + this.f;
                a.C1499a c1499a = this.j;
                if (c1499a != null) {
                    c1499a.a(false);
                }
                this.n.a(str3, this.i, this.f, this.j, b.b(880008, new MBridgeIds(this.h, this.g, this.i), "onReceivedError： " + i + "  " + str, null, this.k));
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onRenderProcessGone(WebView webView) {
            if (webView != null) {
                try {
                    com.mbridge.msdk.video.bt.component.d.c().c(this.g, this.i);
                } catch (Throwable th) {
                    q0.b("RVWindVaneWebView", th.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a
        public void a(WebView webView, String str, String str2, int i, int i2) {
            boolean z = true;
            if (i == 1) {
                try {
                    com.mbridge.msdk.reward.controller.a aVar = new com.mbridge.msdk.reward.controller.a();
                    aVar.e(false);
                    if (i2 != 2) {
                        z = false;
                    }
                    aVar.d(z);
                    aVar.c(str, str2);
                    aVar.a(new com.mbridge.msdk.video.bt.module.orglistener.a(null));
                    aVar.a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, i2, str2, true, 1));
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RVWindVaneWebView", e.getMessage());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a
        public void a(Object obj, String str) {
            if (obj != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    String optString = MintegralNetworkBridge.jsonObjectInit(str).optString("id");
                    com.mbridge.msdk.video.bt.component.d.c().b(obj, optString);
                    String f = com.mbridge.msdk.video.bt.component.d.c().f(optString);
                    CampaignEx c = com.mbridge.msdk.video.bt.component.d.c().c(optString);
                    com.mbridge.msdk.videocommon.setting.c d = com.mbridge.msdk.video.bt.component.d.c().d(optString);
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    copyOnWriteArrayList.add(c);
                    WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b;
                    if (windVaneWebView != null) {
                        b.b().a(this.s, windVaneWebView, c, (CopyOnWriteArrayList<CampaignEx>) copyOnWriteArrayList, d, f, optString, this.r == 0 ? 3 : 6);
                        this.r++;
                    }
                } catch (Throwable th) {
                    q0.b("RVWindVaneWebView", th.getMessage());
                }
            }
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    /* renamed from: com.mbridge.msdk.reward.adapter.b$b, reason: collision with other inner class name */
    class C1447b implements z.c {
        final /* synthetic */ int a;
        final /* synthetic */ CampaignEx b;

        C1447b(int i, CampaignEx campaignEx) {
            this.a = i;
            this.b = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, String str2, String str3, String str4, boolean z) {
            if (z) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                int i = this.a;
                if (i == 0) {
                    nVar.e(1);
                    nVar.d(1);
                    nVar.j("m_download_end");
                } else if (i == 1) {
                    nVar.e(2);
                    nVar.d(1);
                    nVar.j("m_download_end");
                } else if (i == 2) {
                    nVar.e(3);
                    nVar.d(1);
                    nVar.j("m_download_end");
                    nVar.b(this.b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
                    nVar.f("1");
                }
                nVar.o(this.b.getRequestIdNotice());
                nVar.b("url", str);
                nVar.b("scenes", "1");
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.b);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, DownloadError downloadError) {
            String str2 = "";
            if (downloadError != null) {
                try {
                    if (downloadError.getException() != null) {
                        str2 = downloadError.getException().getMessage();
                    }
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            int i = this.a;
            if (i == 0) {
                nVar.e(1);
                nVar.d(3);
                nVar.j("m_download_end");
            } else if (i == 1) {
                nVar.e(2);
                nVar.d(3);
                nVar.j("m_download_end");
            } else if (i == 2) {
                nVar.e(3);
                nVar.d(3);
                nVar.j("m_download_end");
                nVar.b(this.b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
                nVar.f("1");
            }
            b.b(nVar, this.b);
            nVar.o(this.b.getRequestIdNotice());
            nVar.m(str2);
            nVar.b("scenes", "1");
            nVar.b("url", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.b);
        }
    }

    public synchronized void a(Context context, CampaignEx campaignEx, String str, String str2, String str3, n nVar) {
        try {
            this.a.a(context);
            if (campaignEx != null) {
                String cMPTEntryUrl = campaignEx.getCMPTEntryUrl();
                if (campaignEx.isDynamicView()) {
                    if (v0.c(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, cMPTEntryUrl)) {
                        a(0, campaignEx, campaignEx.getMof_tplid() + "", cMPTEntryUrl);
                    }
                    ResDownloadCheckManager.getInstance().setZipDownloadDone(cMPTEntryUrl, true);
                    Message obtain = Message.obtain();
                    obtain.what = 105;
                    Bundle bundle = new Bundle();
                    bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                    bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                    bundle.putString("request_id", str3);
                    bundle.putString("key", str2 + "_" + str3 + "_" + campaignEx.getSecondRequestIndex());
                    bundle.putString("url", cMPTEntryUrl);
                    obtain.setData(bundle);
                    this.a.sendMessage(obtain);
                    if (nVar != null) {
                        nVar.a(str, str2, str3, cMPTEntryUrl);
                    }
                    return;
                }
            }
            if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.c b = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(campaignEx.getCurrentLocalRid());
                    if (b == null) {
                        b = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.c cVar = b;
                    cVar.a(campaignEx);
                    cVar.e(1);
                    cVar.f(a(campaignEx));
                    H5DownLoadManager.getInstance().downloadH5Res(cVar, campaignEx.getCMPTEntryUrl(), new c(str2, str, str3, campaignEx, nVar, context));
                } catch (Exception e2) {
                    q0.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, int i2, CampaignEx campaignEx, String str, String str2, String str3, String str4) {
        com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new d(campaignEx, context, i2, str, str2, str3, str4));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01b4 A[Catch: all -> 0x003c, TryCatch #7 {, blocks: (B:4:0x000b, B:6:0x0023, B:9:0x002b, B:13:0x0047, B:26:0x008a, B:29:0x0090, B:31:0x0096, B:33:0x00a5, B:36:0x00db, B:38:0x00f1, B:45:0x01b0, B:47:0x01b4, B:49:0x01bf, B:51:0x009f, B:56:0x0166, B:62:0x010d, B:65:0x011d, B:67:0x012f), top: B:3:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bf A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #7 {, blocks: (B:4:0x000b, B:6:0x0023, B:9:0x002b, B:13:0x0047, B:26:0x008a, B:29:0x0090, B:31:0x0096, B:33:0x00a5, B:36:0x00db, B:38:0x00f1, B:45:0x01b0, B:47:0x01b4, B:49:0x01bf, B:51:0x009f, B:56:0x0166, B:62:0x010d, B:65:0x011d, B:67:0x012f), top: B:3:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void a(boolean z, Handler handler, boolean z2, boolean z3, WindVaneWebView windVaneWebView, String str, int i2, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str2, String str3, String str4, String str5, String str6, com.mbridge.msdk.videocommon.setting.c cVar, o oVar) {
        String str7;
        String str8;
        a.C1499a c1499a;
        String str9;
        String str10;
        String str11;
        com.mbridge.msdk.video.signal.impl.k kVar;
        String str12 = str4 + "_" + str;
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e2) {
            e = e2;
            str7 = str5;
            str8 = str4;
        }
        if (v0.i(str)) {
            if (oVar != null) {
                oVar.a(str12, str3, str4, str5, str, null);
            }
            return;
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("type", 2);
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
        a.C1499a c1499a2 = new a.C1499a();
        try {
        } catch (Exception e3) {
            e = e3;
        }
        try {
            try {
                try {
                } catch (Exception e4) {
                    e = e4;
                    if (MBridgeConstans.DEBUG) {
                    }
                    if (oVar != null) {
                    }
                }
                try {
                    WindVaneWebView windVaneWebView2 = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
                    if (campaignEx != null) {
                        windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
                    }
                    windVaneWebView2.setTempTypeForMetrics(2);
                    try {
                        c1499a2.a(windVaneWebView2);
                        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                            kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
                        } else {
                            kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
                        }
                        com.mbridge.msdk.video.signal.impl.k kVar2 = kVar;
                        kVar2.g(i2);
                        kVar2.setUnitId(str4);
                        kVar2.setRewardUnitSetting(cVar);
                        kVar2.d(z);
                        try {
                            windVaneWebView2.setWebViewListener(new p(handler, null, z2, z3, str5, oVar, windVaneWebView, str, str3, str4, c1499a2, campaignEx, copyOnWriteArrayList, currentTimeMillis));
                            windVaneWebView2.setObject(kVar2);
                            MintegralNetworkBridge.webviewLoadUrl(windVaneWebView2, str2);
                            windVaneWebView2.setRid(str5);
                        } catch (Exception e5) {
                            e = e5;
                            str7 = str5;
                            str8 = str4;
                            if (MBridgeConstans.DEBUG) {
                            }
                            if (oVar != null) {
                            }
                        }
                    } catch (Exception e6) {
                        e = e6;
                        str7 = str5;
                    }
                } catch (Exception unused) {
                    str9 = str5;
                    str11 = str;
                    str10 = str4;
                    c1499a = c1499a2;
                    if (oVar != null) {
                        c1499a.a(true);
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str10 + "_" + str9 + "_" + str11, true);
                        StringBuilder sb = new StringBuilder();
                        sb.append(str10);
                        sb.append("_");
                        sb.append(str11);
                        oVar.a(sb.toString(), str3, str4, str5, str, c1499a);
                    }
                }
            } catch (Throwable unused2) {
                str7 = str5;
                if (oVar != null) {
                    c1499a2.a(true);
                    ResDownloadCheckManager resDownloadCheckManager = ResDownloadCheckManager.getInstance();
                    StringBuilder sb2 = new StringBuilder();
                    str8 = str4;
                    try {
                        sb2.append(str8);
                        sb2.append("_");
                        sb2.append(str7);
                        sb2.append("_");
                        sb2.append(str);
                        resDownloadCheckManager.setTemplatePreLoadDone(sb2.toString(), true);
                        oVar.a(str8 + "_" + str, str3, str4, str5, str, c1499a2);
                    } catch (Exception e7) {
                        e = e7;
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                        if (oVar != null) {
                            oVar.a(str12, str5, str, null, b(880009, new MBridgeIds(str3, str8, str7), "", e, campaignEx));
                        }
                    }
                }
            }
        } catch (Exception unused3) {
            c1499a = c1499a2;
            str9 = str5;
            str10 = str4;
            str11 = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01db A[Catch: all -> 0x0046, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x000d, B:7:0x0033, B:12:0x004b, B:14:0x007e, B:15:0x008b, B:17:0x00a6, B:19:0x00ac, B:21:0x00b6, B:24:0x00bd, B:26:0x00c3, B:27:0x00cd, B:29:0x00d3, B:31:0x00e7, B:33:0x00f5, B:39:0x00fe, B:41:0x0102, B:43:0x0113, B:46:0x0161, B:49:0x0175, B:52:0x0195, B:58:0x01db, B:59:0x01fd, B:61:0x0201, B:69:0x010c), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0201 A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x000d, B:7:0x0033, B:12:0x004b, B:14:0x007e, B:15:0x008b, B:17:0x00a6, B:19:0x00ac, B:21:0x00b6, B:24:0x00bd, B:26:0x00c3, B:27:0x00cd, B:29:0x00d3, B:31:0x00e7, B:33:0x00f5, B:39:0x00fe, B:41:0x0102, B:43:0x0113, B:46:0x0161, B:49:0x0175, B:52:0x0195, B:58:0x01db, B:59:0x01fd, B:61:0x0201, B:69:0x010c), top: B:3:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void a(boolean z, Handler handler, boolean z2, boolean z3, String str, String str2, String str3, String str4, String str5, int i2, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str6, String str7, com.mbridge.msdk.videocommon.setting.c cVar, o oVar, boolean z4) {
        String str8;
        String str9;
        WindVaneWebView windVaneWebView;
        String b;
        String b2;
        com.mbridge.msdk.video.signal.impl.k kVar;
        this.b = z4;
        long currentTimeMillis = System.currentTimeMillis();
        String str10 = str4 + "_" + str5;
        this.b = z4;
        if (v0.i(str5)) {
            if (oVar != null) {
                oVar.a(str10, str3, str4, str, str5, null);
            }
            return;
        }
        try {
            q0.a("RewardCampaignsResourceManager", "开始预加载大模板资源");
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", 1);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
            a.C1499a c1499a = new a.C1499a();
            windVaneWebView = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
            if (campaignEx != null) {
                windVaneWebView.setLocalRequestId(campaignEx.getCurrentLocalRid());
            }
            windVaneWebView.setTempTypeForMetrics(1);
            c1499a.a(windVaneWebView);
            b = com.mbridge.msdk.video.bt.component.d.c().b();
            b2 = com.mbridge.msdk.video.bt.component.d.c().b();
            c1499a.a(b2);
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                CopyOnWriteArrayList<CampaignEx> b3 = com.mbridge.msdk.videocommon.download.b.getInstance().b(str4);
                if (b3 != null && b3.size() > 0) {
                    for (int i3 = 0; i3 < copyOnWriteArrayList.size(); i3++) {
                        CampaignEx campaignEx2 = copyOnWriteArrayList.get(i3);
                        for (CampaignEx campaignEx3 : b3) {
                            if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                campaignEx2.setReady(true);
                                copyOnWriteArrayList.set(i3, campaignEx2);
                            }
                        }
                    }
                }
                kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
            } else {
                kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
            }
            com.mbridge.msdk.video.signal.impl.k kVar2 = kVar;
            kVar2.g(i2);
            kVar2.setUnitId(str7);
            kVar2.c(b2);
            kVar2.d(b);
            kVar2.c(true);
            kVar2.setRewardUnitSetting(cVar);
            kVar2.d(z);
            try {
                windVaneWebView.setWebViewListener(new g(z, handler, null, z2, z3, i2, str5, str3, str4, str, c1499a, campaignEx, copyOnWriteArrayList, cVar, oVar, z4, currentTimeMillis));
                windVaneWebView.setObject(kVar2);
                MintegralNetworkBridge.webviewLoadUrl(windVaneWebView, str6);
                str9 = str;
            } catch (Exception e2) {
                e = e2;
                str9 = str;
            }
        } catch (Exception e3) {
            e = e3;
            str8 = str4;
            str9 = str;
        }
        try {
            windVaneWebView.setRid(str9);
            MBridgeBTRootLayout mBridgeBTRootLayout = new MBridgeBTRootLayout(com.mbridge.msdk.foundation.controller.c.n().d());
            mBridgeBTRootLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            mBridgeBTRootLayout.setInstanceId(b);
            str8 = str4;
            try {
                mBridgeBTRootLayout.setUnitId(str8);
                MBridgeBTLayout mBridgeBTLayout = new MBridgeBTLayout(com.mbridge.msdk.foundation.controller.c.n().d());
                mBridgeBTLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                mBridgeBTLayout.setInstanceId(b2);
                mBridgeBTLayout.setUnitId(str8);
                mBridgeBTLayout.setWebView(windVaneWebView);
                AbstractMap b4 = com.mbridge.msdk.video.bt.component.d.c().b(str8, str9);
                b4.put(b2, mBridgeBTLayout);
                b4.put(b, mBridgeBTRootLayout);
                mBridgeBTRootLayout.addView(mBridgeBTLayout, new FrameLayout.LayoutParams(-1, -1));
            } catch (Exception e4) {
                e = e4;
                if (oVar != null) {
                    oVar.a(str10, str, str5, null, b(880008, new MBridgeIds(str3, str8, str9), "", e, campaignEx));
                }
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                }
            }
        } catch (Exception e5) {
            e = e5;
            str8 = str4;
            if (oVar != null) {
            }
            if (MBridgeConstans.DEBUG) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.setting.c cVar, String str, String str2, int i2) {
        if (windVaneWebView != null) {
            if (campaignEx != null && cVar != null && campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", str2);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "data is null");
                        jSONObject.put("data", jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        return;
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                            return;
                        }
                        return;
                    }
                }
                if (!TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j()) && campaignEx.getRewardTemplateMode().j().contains(CampaignEx.KEY_IS_CMPT_ENTRY)) {
                    q0.a("RewardCampaignsResourceManager", "getTeamplateUrl contains cmpt=1");
                    return;
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new e(z, windVaneWebView, campaignEx, copyOnWriteArrayList, str, cVar, str2), i2 * 1000);
                    return;
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", str2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("result", 2);
                jSONObject4.put("error", "data is null");
                jSONObject3.put("data", jSONObject4);
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            } catch (Exception e3) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e3.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, WindVaneWebView windVaneWebView, String str, int i2, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str2, String str3, com.mbridge.msdk.videocommon.setting.c cVar, String str4, boolean z2) {
        com.mbridge.msdk.video.signal.impl.k kVar;
        String str5;
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
            a.C1499a c1499a = new a.C1499a();
            WindVaneWebView windVaneWebView2 = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
            if (campaignEx != null) {
                windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
            }
            windVaneWebView2.setTempTypeForMetrics(2);
            c1499a.a(windVaneWebView2);
            String str6 = "";
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                CopyOnWriteArrayList<CampaignEx> b = com.mbridge.msdk.videocommon.download.b.getInstance().b(str3);
                if (b != null && b.size() > 0) {
                    for (int i3 = 0; i3 < copyOnWriteArrayList.size(); i3++) {
                        CampaignEx campaignEx2 = copyOnWriteArrayList.get(i3);
                        for (CampaignEx campaignEx3 : b) {
                            if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                campaignEx2.setReady(true);
                                copyOnWriteArrayList.set(i3, campaignEx2);
                            }
                        }
                    }
                }
                com.mbridge.msdk.video.signal.impl.k kVar2 = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
                str5 = copyOnWriteArrayList.get(0).getRequestId();
                kVar = kVar2;
            } else {
                com.mbridge.msdk.video.signal.impl.k kVar3 = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
                if (campaignEx != null) {
                    str6 = campaignEx.getRequestId();
                }
                kVar = kVar3;
                str5 = str6;
            }
            kVar.g(i2);
            kVar.setUnitId(str3);
            kVar.c(str4);
            kVar.setRewardUnitSetting(cVar);
            kVar.d(z);
            windVaneWebView2.setWebViewListener(new q(str4, false, windVaneWebView, str, str3, c1499a, campaignEx, z2, str5));
            windVaneWebView2.setObject(kVar);
            MintegralNetworkBridge.webviewLoadUrl(windVaneWebView2, str2);
            windVaneWebView2.setRid(str5);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
            }
        }
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (campaignEx.getAabEntity() != null) {
                    return campaignEx.getAabEntity().h3c;
                }
            } catch (Throwable th) {
                q0.b("RewardCampaignsResourceManager", th.getMessage());
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(CampaignEx campaignEx, int i2) {
        com.mbridge.msdk.foundation.same.report.metrics.c b = campaignEx != null ? com.mbridge.msdk.foundation.same.report.metrics.d.b().b(campaignEx.getCurrentLocalRid()) : null;
        if (b == null) {
            b = new com.mbridge.msdk.foundation.same.report.metrics.c();
        }
        b.a(campaignEx);
        b.f(a(campaignEx));
        b.e(i2);
        return b;
    }
}
