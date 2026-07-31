package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.model.vast.a0;
import com.fyber.inneractive.sdk.model.vast.r;
import com.fyber.inneractive.sdk.model.vast.u;
import com.fyber.inneractive.sdk.model.vast.y;
import com.fyber.inneractive.sdk.model.vast.z;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.s;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* loaded from: classes8.dex */
public final class d extends b {
    public g e;
    public r0 f;
    public com.fyber.inneractive.sdk.model.vast.f g;
    public final ArrayList h;
    public int i;
    public z j;
    public final boolean k;

    public d() {
        this.k = true;
        this.h = new ArrayList();
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final e a() {
        g gVar = new g();
        this.a = gVar;
        this.e = gVar;
        return gVar;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final boolean b() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final void a(String str, r0 r0Var) {
        this.f = r0Var;
        if (r0Var != null && r0Var.f != null) {
            this.e.M = System.currentTimeMillis();
            this.e.z = this.f.b;
            this.i = IAConfigManager.N.i.b;
            try {
                a(str, 0);
                a(this.g, this.h);
                return;
            } catch (com.fyber.inneractive.sdk.flow.vast.h e) {
                this.e.i = e.getMessage();
                this.e.j = e.getCause().getMessage();
                return;
            } catch (InterruptedException e2) {
                throw e2;
            } catch (Exception e3) {
                this.e.j = e3.getMessage();
                g gVar = this.e;
                gVar.i = "VastErrorInvalidFile";
                gVar.w = e3;
                if (IAlog.a == 2) {
                    e3.printStackTrace();
                    return;
                }
                return;
            }
        }
        this.a.i = "ErrorConfigurationMismatch";
    }

    public d(boolean z) {
        this();
        this.k = z;
    }

    public final void a(String str, int i) {
        u uVar;
        try {
            String replaceFirst = str.replaceFirst("<\\?.*\\?>", "");
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setCoalescing(true);
            Document parse = newInstance.newDocumentBuilder().parse(new InputSource(new StringReader(replaceFirst)));
            if (parse != null) {
                Node firstChild = parse.getFirstChild();
                if (firstChild.getNodeName().equalsIgnoreCase(VastTagName.VAST)) {
                    uVar = u.a(firstChild);
                } else {
                    IAlog.a("XML does not contain a VAST tag as its first child!", new Object[0]);
                    throw new Exception("XML does not contain a VAST tag as its first child!");
                }
            } else {
                uVar = null;
            }
            try {
                if (this.j == null) {
                    this.j = new z(uVar.a);
                } else {
                    z zVar = new z(uVar.a);
                    if (zVar.compareTo(this.j) >= 0) {
                        this.j = zVar;
                    }
                }
            } catch (y unused) {
            }
            ArrayList arrayList = uVar.b;
            if (arrayList != null && !arrayList.isEmpty()) {
                com.fyber.inneractive.sdk.model.vast.f fVar = (com.fyber.inneractive.sdk.model.vast.f) arrayList.get(0);
                a0 a0Var = fVar.b;
                if (a0Var != null) {
                    IAlog.a("Vast response parser: found VAST wrapper #%d", Integer.valueOf(this.h.size()));
                    int size = this.h.size();
                    int i2 = this.i;
                    if (size < i2) {
                        this.h.add(fVar);
                        String str2 = a0Var.i;
                        if (!TextUtils.isEmpty(str2)) {
                            if (h0.f(str2)) {
                                String a = s.a(str2, 3000, 5000);
                                if (!TextUtils.isEmpty(a)) {
                                    int i3 = this.i - i;
                                    if (i3 > 0) {
                                        a0Var.f = i3;
                                        this.e.R.put(str2, a);
                                        a(a, i + 1);
                                        return;
                                    }
                                    throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "Invalid level for wrapper");
                                }
                                throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "Failed getting data from ad tag URI");
                            }
                            IAlog.a("Vast response parser: Unsecure Wrapper URL. Aborting! url: %s", str2);
                            throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorUnsecure", "Unsecure ad tag URI for wrapper");
                        }
                        IAlog.a("Vast response parser: found an empty tag uri in wrapper! aborting!", new Object[0]);
                        throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "No ad tag URI for wrapper");
                    }
                    IAlog.a("Vast response parser: too many vast wrappers! Only %d allowed. stopping", Integer.valueOf(i2));
                    throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorTooManyWrappers", "More than " + this.i + " found");
                }
                if (fVar.c != null) {
                    this.g = fVar;
                    return;
                }
                throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "A top level ad with no wrapper on inline found!");
            }
            IAlog.a("Vast response parser: no ads found in model. aborting", new Object[0]);
            throw new com.fyber.inneractive.sdk.flow.vast.h("ErrorNoMediaFiles", "No ads found in model. Empty Vast?");
        } catch (Exception e) {
            IAlog.a("Failed parsing Vast file! parsing error = %s", e.getMessage());
            throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", e.getMessage());
        }
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.f fVar, List list) {
        String str;
        com.fyber.inneractive.sdk.flow.vast.c cVar = new com.fyber.inneractive.sdk.flow.vast.c(this.k);
        int intValue = this.f.f.c.intValue();
        int intValue2 = this.f.f.b.intValue();
        int intValue3 = this.f.f.g.intValue();
        cVar.b = intValue;
        cVar.c = intValue2;
        cVar.d = intValue3;
        if (UnitDisplayType.VERTICAL.equals(this.f.f.j)) {
            cVar.e = true;
        }
        if (this.f.f.k.contains(2)) {
            cVar.f = true;
        }
        try {
            z zVar = this.j;
            if (zVar == null) {
                str = "";
            } else {
                str = zVar.b;
            }
            this.e.N = cVar.a(fVar, list, str);
        } catch (com.fyber.inneractive.sdk.flow.vast.h e) {
            g gVar = this.e;
            gVar.getClass();
            gVar.i = e.getMessage();
        }
        com.fyber.inneractive.sdk.model.vast.b bVar = this.e.N;
        if (bVar != null) {
            String str2 = bVar.n;
            if (!TextUtils.isEmpty(str2) && h0.f(str2)) {
                w wVar = new w(com.fyber.inneractive.sdk.network.u.VAST_EVENT_DVC_DETECTED, (InneractiveAdRequest) null, this.a);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("templateURL", str2);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str2);
                }
                wVar.f.put(jSONObject);
                wVar.a((String) null);
            } else if (!TextUtils.isEmpty(str2)) {
                this.e.N.n = "";
                com.fyber.inneractive.sdk.network.events.a.a(t.VAST_ERROR_DVC_FAILURE, com.fyber.inneractive.sdk.network.events.b.SSL_ERROR, (InneractiveAdRequest) null, this.a, "Unsecured URL", str2, Boolean.FALSE);
            }
        }
        g gVar2 = this.e;
        LinkedHashMap linkedHashMap = cVar.g;
        if (linkedHashMap != null) {
            gVar2.O.putAll(linkedHashMap);
        } else {
            gVar2.getClass();
        }
        g gVar3 = this.e;
        ArrayList arrayList = cVar.h;
        if (arrayList != null) {
            gVar3.P.addAll(arrayList);
        } else {
            gVar3.getClass();
        }
        g gVar4 = this.e;
        ArrayList arrayList2 = cVar.k;
        if (arrayList2 != null) {
            gVar4.Q.addAll(arrayList2);
        } else {
            gVar4.getClass();
        }
        if (IAlog.a == 2) {
            LinkedHashMap linkedHashMap2 = cVar.g;
            if (linkedHashMap2.size() > 0) {
                IAlog.e(" VParser: Unsupported media files:", new Object[0]);
                for (r rVar : linkedHashMap2.keySet()) {
                    IAlog.e("VParser: %s", rVar);
                    IAlog.e("VParser: reason = %s", linkedHashMap2.get(rVar));
                }
                return;
            }
            IAlog.e("VParser: Unsupported media files: none", new Object[0]);
        }
    }
}
