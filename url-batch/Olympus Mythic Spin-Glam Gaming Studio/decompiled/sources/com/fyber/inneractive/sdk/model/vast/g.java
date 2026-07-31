package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.w1;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes5.dex */
public abstract class g {
    public String a;
    public o e;
    public v g;
    public final ArrayList d = new ArrayList();
    public int f = 0;
    public final ArrayList h = new ArrayList(1);
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public final void a(Node node) {
        w wVar;
        Node d = w1.d(node, "AdVerifications");
        if (d != null) {
            Iterator it = w1.c(d, VastTagName.VERIFICATION).iterator();
            while (it.hasNext()) {
                Node node2 = (Node) it.next();
                com.fyber.inneractive.sdk.measurement.h hVar = null;
                if (node2 != null) {
                    com.fyber.inneractive.sdk.measurement.h hVar2 = new com.fyber.inneractive.sdk.measurement.h();
                    hVar2.e = w1.b(node2, VastAttributes.VENDOR);
                    Node d2 = w1.d(node2, VastTagName.JAVA_SCRIPT_RESOURCE);
                    if (d2 != null) {
                        hVar2.g = true;
                        try {
                            hVar2.f = w1.a(d2);
                            hVar2.b = w1.b(d2, VastAttributes.API_FRAMEWORK);
                            hVar2.a = new URL(hVar2.f);
                        } catch (MalformedURLException unused) {
                        }
                    }
                    Node d3 = w1.d(node2, "TrackingEvents");
                    if (d3 != null) {
                        Iterator it2 = w1.c(d3, "Tracking").iterator();
                        while (it2.hasNext()) {
                            Node node3 = (Node) it2.next();
                            if (node3 == null) {
                                wVar = null;
                            } else {
                                wVar = new w();
                                wVar.a = w1.b(node3, "event");
                                wVar.b = w1.a(node3);
                                wVar.c = w1.b(node3, "offset");
                            }
                            if (node3 != null && wVar.a.equalsIgnoreCase("verificationNotExecuted")) {
                                hVar2.a(x.EVENT_VERIFICATION_NOT_EXECUTED, wVar.b);
                            }
                        }
                    }
                    Node d4 = w1.d(node2, VastTagName.VERIFICATION_PARAMETERS);
                    if (d4 != null) {
                        hVar2.d = w1.a(d4);
                    }
                    hVar = hVar2;
                }
                if (hVar != null) {
                    IAlog.a("Verification Found - %s", hVar.toString());
                    this.d.add(hVar);
                }
            }
        }
    }

    public void b(Node node) {
        Node d;
        NodeList childNodes;
        NodeList childNodes2;
        m mVar;
        Iterator it;
        h hVar;
        Iterator it2;
        w wVar;
        w wVar2;
        Iterator it3;
        Iterator it4;
        r rVar;
        g gVar = this;
        Node d2 = w1.d(node, "AdSystem");
        if (d2 != null) {
            w1.b(d2, "version");
            w1.a(d2);
        }
        Node d3 = w1.d(node, "Error");
        if (d3 != null) {
            String a = w1.a(d3);
            if (!TextUtils.isEmpty(a)) {
                gVar.a = a;
            }
        }
        Iterator it5 = w1.c(node, "Impression").iterator();
        while (it5.hasNext()) {
            String a2 = w1.a((Node) it5.next());
            if (!TextUtils.isEmpty(a2)) {
                gVar.b.add(a2);
            }
        }
        Node d4 = w1.d(node, "Creatives");
        if (d4 != null) {
            Iterator it6 = w1.c(d4, "Creative").iterator();
            while (it6.hasNext()) {
                Node node2 = (Node) it6.next();
                if (node2 == null) {
                    it = it6;
                    mVar = null;
                } else {
                    mVar = new m();
                    if (TextUtils.isEmpty(w1.b(node2, "AdID"))) {
                        w1.b(node2, "adId");
                    }
                    w1.b(node2, "id");
                    w1.a(node2, "sequence");
                    Node d5 = w1.d(node2, "Linear");
                    if (d5 != null) {
                        q qVar = new q();
                        it = it6;
                        Node d6 = w1.d(d5, "MediaFiles");
                        if (d6 != null) {
                            ArrayList c = w1.c(d6, "MediaFile");
                            if (!c.isEmpty()) {
                                qVar.a = new ArrayList();
                                Iterator it7 = c.iterator();
                                while (it7.hasNext()) {
                                    Node node3 = (Node) it7.next();
                                    if (node3 == null) {
                                        it4 = it7;
                                        rVar = null;
                                    } else {
                                        it4 = it7;
                                        rVar = new r();
                                        rVar.a = w1.b(node3, "delivery");
                                        rVar.b = w1.a(node3, "width");
                                        rVar.c = w1.a(node3, "height");
                                        rVar.d = w1.b(node3, "type");
                                        w1.b(node3, "id");
                                        rVar.f = w1.b(node3, VastAttributes.API_FRAMEWORK);
                                        rVar.e = w1.a(node3, VastAttributes.BITRATE);
                                        String b = w1.b(node3, VastAttributes.MAINTAIN_ASPECT_RATION);
                                        if (!TextUtils.isEmpty(b)) {
                                            try {
                                                Boolean.valueOf(b);
                                            } catch (Exception unused) {
                                            }
                                        }
                                        String b2 = w1.b(node3, VastAttributes.SCALABLE);
                                        if (!TextUtils.isEmpty(b2)) {
                                            try {
                                                Boolean.valueOf(b2);
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        rVar.g = w1.a(node3);
                                    }
                                    if (rVar != null) {
                                        qVar.a.add(rVar);
                                    }
                                    it7 = it4;
                                }
                            }
                        }
                        Node d7 = w1.d(d5, "VideoClicks");
                        if (d7 != null) {
                            qVar.c = w1.a(w1.d(d7, "ClickThrough"));
                            ArrayList c2 = w1.c(d7, "ClickTracking");
                            if (!c2.isEmpty()) {
                                qVar.d = new ArrayList();
                                Iterator it8 = c2.iterator();
                                while (it8.hasNext()) {
                                    String a3 = w1.a((Node) it8.next());
                                    if (!TextUtils.isEmpty(a3)) {
                                        qVar.d.add(a3);
                                    }
                                }
                            }
                        }
                        Node d8 = w1.d(d5, "TrackingEvents");
                        if (d8 != null) {
                            ArrayList c3 = w1.c(d8, "Tracking");
                            if (!c3.isEmpty()) {
                                qVar.b = new ArrayList();
                                Iterator it9 = c3.iterator();
                                while (it9.hasNext()) {
                                    Node node4 = (Node) it9.next();
                                    if (node4 == null) {
                                        it3 = it9;
                                        wVar2 = null;
                                    } else {
                                        wVar2 = new w();
                                        it3 = it9;
                                        wVar2.a = w1.b(node4, "event");
                                        wVar2.b = w1.a(node4);
                                        wVar2.c = w1.b(node4, "offset");
                                    }
                                    if (wVar2 != null) {
                                        qVar.b.add(wVar2);
                                    }
                                    it9 = it3;
                                }
                            }
                        }
                        Node d9 = w1.d(d5, "Duration");
                        if (d9 != null) {
                            qVar.e = w1.a(d9);
                        }
                        mVar.a = qVar;
                    } else {
                        it = it6;
                    }
                    Node d10 = w1.d(node2, "CompanionAds");
                    if (d10 != null) {
                        j jVar = new j();
                        String b3 = w1.b(d10, "required");
                        if (!"all".equalsIgnoreCase(b3)) {
                            "none".equalsIgnoreCase(b3);
                        }
                        ArrayList c4 = w1.c(d10, "Companion");
                        jVar.a.clear();
                        Iterator it10 = c4.iterator();
                        while (it10.hasNext()) {
                            Node node5 = (Node) it10.next();
                            if (node5 == null) {
                                it2 = it10;
                                hVar = null;
                            } else {
                                hVar = new h();
                                hVar.a = w1.a(node5, "width");
                                hVar.b = w1.a(node5, "height");
                                hVar.c = w1.b(node5, "id");
                                w1.b(node5, VastAttributes.API_FRAMEWORK);
                                w1.a(node5, VastAttributes.EXPANDED_WIDTH);
                                w1.a(node5, VastAttributes.EXPANDED_HEIGHT);
                                Node d11 = w1.d(node5, "StaticResource");
                                if (d11 != null) {
                                    l lVar = new l();
                                    it2 = it10;
                                    lVar.a = w1.b(d11, "creativeType");
                                    lVar.b = w1.a(d11);
                                    hVar.d = lVar;
                                } else {
                                    it2 = it10;
                                }
                                Node d12 = w1.d(node5, "HTMLResource");
                                if (d12 != null) {
                                    hVar.f = w1.a(d12);
                                }
                                Node d13 = w1.d(node5, "IFrameResource");
                                if (d13 != null) {
                                    hVar.e = w1.a(d13);
                                }
                                Node d14 = w1.d(node5, "CompanionClickThrough");
                                if (d14 != null) {
                                    hVar.g = w1.a(d14);
                                }
                                hVar.h.clear();
                                ArrayList c5 = w1.c(node5, "CompanionClickTracking");
                                if (c5.size() > 0) {
                                    Iterator it11 = c5.iterator();
                                    while (it11.hasNext()) {
                                        String a4 = w1.a((Node) it11.next());
                                        if (!TextUtils.isEmpty(a4)) {
                                            hVar.h.add(a4);
                                        }
                                    }
                                }
                                hVar.j.clear();
                                Node d15 = w1.d(node5, "TrackingEvents");
                                if (d15 != null) {
                                    ArrayList c6 = w1.c(d15, "Tracking");
                                    if (!c6.isEmpty()) {
                                        Iterator it12 = c6.iterator();
                                        while (it12.hasNext()) {
                                            Node node6 = (Node) it12.next();
                                            if (node6 == null) {
                                                wVar = null;
                                            } else {
                                                wVar = new w();
                                                wVar.a = w1.b(node6, "event");
                                                wVar.b = w1.a(node6);
                                                wVar.c = w1.b(node6, "offset");
                                            }
                                            if (wVar != null) {
                                                hVar.j.add(wVar);
                                            }
                                        }
                                    }
                                }
                            }
                            if (hVar != null) {
                                jVar.a.add(hVar);
                            }
                            it10 = it2;
                        }
                        mVar.b = jVar;
                    }
                }
                gVar = this;
                if (mVar != null) {
                    gVar.c.add(mVar);
                }
                it6 = it;
            }
        }
        Node d16 = w1.d(node, VastTagName.EXTENSIONS);
        if (d16 != null) {
            Iterator it13 = w1.c(d16, VastTagName.EXTENSION).iterator();
            while (it13.hasNext()) {
                Node node7 = (Node) it13.next();
                if ("AdVerifications".equalsIgnoreCase(w1.b(node7, "type"))) {
                    gVar.a(node7);
                }
                if ("FMPCompanionAssets".equalsIgnoreCase(w1.b(node7, "type"))) {
                    IAlog.a("parseFMPCompanionAssetsTag", new Object[0]);
                    Node d17 = w1.d(node7, "FMPCompanionAssets");
                    if (d17 != null) {
                        o oVar = new o();
                        String b4 = w1.b(d17, "enableMultipleCompanions");
                        if ("false".equalsIgnoreCase(b4) || "0".equals(b4)) {
                            oVar.d = false;
                        }
                        Node d18 = w1.d(d17, "Name");
                        if (d18 != null) {
                            oVar.a = w1.a(d18);
                        }
                        Node d19 = w1.d(d17, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j);
                        if (d19 != null) {
                            w1.a(d19);
                        }
                        oVar.b.clear();
                        Node d20 = w1.d(d17, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.B);
                        if (d20 != null) {
                            Iterator it14 = w1.c(d20, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C).iterator();
                            while (it14.hasNext()) {
                                oVar.b.add(w1.a((Node) it14.next()));
                            }
                        }
                        Node d21 = w1.d(d17, "Rating");
                        if (d21 != null) {
                            try {
                                Float.parseFloat(w1.a(d21));
                            } catch (Exception unused3) {
                            }
                        }
                        Node d22 = w1.d(d17, "Screenshots");
                        if (d22 != null) {
                            oVar.c = new ArrayList();
                            Iterator it15 = w1.c(d22, "Screenshot").iterator();
                            while (it15.hasNext()) {
                                String a5 = w1.a((Node) it15.next());
                                if (!TextUtils.isEmpty(a5)) {
                                    oVar.c.add(a5);
                                }
                            }
                        }
                        gVar.e = oVar;
                    }
                }
                if ("DynamicVideoControlsURL".equalsIgnoreCase(w1.b(node7, "type"))) {
                    Node d23 = w1.d(node7, "DynamicVideoControlsURL");
                    n nVar = new n();
                    if (d23 != null) {
                        nVar.a = w1.a(d23);
                    }
                    if (!TextUtils.isEmpty(nVar.a)) {
                        gVar.h.add(nVar);
                    }
                }
                if ("StorePromoAssets".equalsIgnoreCase(w1.b(node7, "type")) && (d = w1.d(node7, "DTSPR")) != null) {
                    v vVar = new v();
                    Node d24 = w1.d(d, "DTSPNm");
                    if (d24 != null) {
                        vVar.b = w1.a(d24);
                    }
                    Node d25 = w1.d(d, "DTSPTUrl");
                    if (d25 != null) {
                        vVar.c = w1.a(d25);
                    }
                    Node d26 = w1.d(d, "DTSPPNm");
                    if (d26 != null) {
                        vVar.i = w1.a(d26);
                    }
                    Node d27 = w1.d(d, "DTSPIap");
                    if (d27 != null) {
                        vVar.d = w1.a(d27);
                    }
                    Node d28 = w1.d(d, "DTSPCads");
                    if (d28 != null) {
                        vVar.e = w1.a(d28);
                    }
                    Node d29 = w1.d(d, "DTSPMedia");
                    if (d29 != null && (childNodes2 = d29.getChildNodes()) != null && childNodes2.getLength() != 0) {
                        for (int i = 0; i < childNodes2.getLength(); i++) {
                            Node item = childNodes2.item(i);
                            if (item != null) {
                                String nodeName = item.getNodeName();
                                String a6 = w1.a(item);
                                if (!TextUtils.isEmpty(a6)) {
                                    if ("DTSPScrn".equalsIgnoreCase(nodeName)) {
                                        vVar.f.add(a6);
                                    } else if ("DTSPVid".equalsIgnoreCase(nodeName)) {
                                        vVar.g.add(a6);
                                    } else if ("DTSPIcon".equalsIgnoreCase(nodeName)) {
                                        vVar.a = a6;
                                    }
                                }
                            }
                        }
                    }
                    Node d30 = w1.d(d, "DTSPMetadata");
                    if (d30 != null && (childNodes = d30.getChildNodes()) != null && childNodes.getLength() != 0) {
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
                            Node item2 = childNodes.item(i2);
                            if (item2 != null) {
                                String nodeName2 = item2.getNodeName();
                                if ("DTSPLabel".equalsIgnoreCase(nodeName2)) {
                                    str = w1.a(item2);
                                } else if ("DTSPRating".equalsIgnoreCase(nodeName2)) {
                                    str2 = w1.a(item2);
                                } else if ("DTSPSize".equalsIgnoreCase(nodeName2)) {
                                    str3 = w1.a(item2);
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                            vVar.h = new com.fyber.inneractive.sdk.flow.storepromo.model.d(str2, str, str3);
                        }
                    }
                    gVar.g = vVar;
                }
            }
        }
        a(node);
    }
}
