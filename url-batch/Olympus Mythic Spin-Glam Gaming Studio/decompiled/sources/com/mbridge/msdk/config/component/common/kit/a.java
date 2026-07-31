package com.mbridge.msdk.config.component.common.kit;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.omsdk.b;
import java.util.Iterator;

/* compiled from: OmSdkKit.java */
/* loaded from: classes6.dex */
public class a {
    private AdSession a;
    private AdEvents b;
    private MediaEvents c;
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a d;

    private void b() {
        if (this.c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSDKResume");
            this.c.resume();
        } catch (Exception e) {
            q0.b("OmSdkKit", e.getMessage(), e);
        }
    }

    private void c() {
        if (this.c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkBuffEnd");
            this.c.bufferFinish();
        } catch (Exception e) {
            q0.b("OmSdkKit", e.getMessage(), e);
        }
    }

    private void d() {
        if (this.c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkBuffStart");
            this.c.bufferStart();
        } catch (Exception e) {
            q0.b("OmSdkKit", e.getMessage(), e);
        }
    }

    private void e() {
    }

    private void f() {
        if (this.c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkClick");
            this.c.adUserInteraction(InteractionType.CLICK);
        } catch (Exception e) {
            q0.b("OmSdkKit", e.getMessage(), e);
        }
    }

    private void g() {
        if (this.a != null) {
            try {
                q0.b("OMSDK_TAG", "onOMSdkDestory");
                this.a.removeAllFriendlyObstructions();
                this.a.finish();
                this.a = null;
            } catch (Exception e) {
                q0.b("OmSdkKit", e.getMessage(), e);
            }
        }
    }

    private void h() {
        if (this.c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkPause");
            this.c.pause();
        } catch (Exception e) {
            q0.b("OmSdkKit", e.getMessage(), e);
        }
    }

    private void i() {
    }

    private void j() {
        if (this.c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkSkipped");
            this.c.skipped();
        } catch (Exception e) {
            q0.b("OmSdkKit", e.getMessage(), e);
        }
    }

    private void k() {
        if (this.a != null) {
            try {
                q0.b("OMSDK_TAG", "onOMSdkStart");
                this.a.start();
                if (this.b != null) {
                    this.b.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
                    this.b.impressionOccurred();
                }
                com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.d;
                if (aVar != null && !aVar.d()) {
                    Object b = this.d.b("viewTag");
                    Object b2 = this.d.b("rootView");
                    if ((b instanceof String) && (b2 instanceof ViewGroup)) {
                        String valueOf = String.valueOf(b);
                        ViewGroup viewGroup = (ViewGroup) b2;
                        this.a.registerAdView(viewGroup.findViewWithTag(valueOf));
                        Iterator<View> it = c.a(viewGroup, valueOf).iterator();
                        while (it.hasNext()) {
                            this.a.addFriendlyObstruction(it.next(), FriendlyObstructionPurpose.OTHER, null);
                        }
                    }
                }
            } catch (Exception e) {
                q0.b("OmSdkKit", e.getMessage(), e);
            }
        }
    }

    public void a(String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        this.d = aVar;
        a(str);
    }

    private void a(String str) {
        if (this.d == null) {
        }
        str.hashCode();
        switch (str) {
            case "onDestroy":
                g();
                break;
            case "PlayerPlayPlaying":
                b();
                break;
            case "PlayerPlayPause":
                h();
                break;
            case "PlayerPlayStart":
                k();
                break;
            case "onAdClick":
                f();
                break;
            case "onBufferingEnd":
                c();
                break;
            case "onCreate":
                a();
                break;
            case "PlayerPlayMuteChanged":
                e();
                break;
            case "PlayerProgressChanged":
                i();
                break;
            case "onBufferingStart":
                d();
                break;
            case "skipped":
                j();
                break;
        }
    }

    private void a() {
        try {
            if (this.d.a((Object) "g0")) {
                Object b = this.d.b("g0");
                if (b instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) b;
                    AdSession a = b.a(com.mbridge.msdk.foundation.controller.c.n().d(), false, String.valueOf(aVar.b(CampaignEx.KEY_OMID)), String.valueOf(aVar.b("requestId")), String.valueOf(aVar.b("id")), String.valueOf(aVar.b("campaignUnitId")), String.valueOf(aVar.b("videoURL")), String.valueOf(aVar.b("requestNoticeId")));
                    this.a = a;
                    if (a != null) {
                        this.b = AdEvents.createAdEvents(a);
                        this.c = MediaEvents.createMediaEvents(this.a);
                    }
                }
            }
        } catch (Exception e) {
            q0.b("OmSdkKit", e.getMessage(), e);
        }
    }
}
