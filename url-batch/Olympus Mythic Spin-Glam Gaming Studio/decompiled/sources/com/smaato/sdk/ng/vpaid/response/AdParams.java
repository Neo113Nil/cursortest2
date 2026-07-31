package com.smaato.sdk.ng.vpaid.response;

import com.smaato.sdk.ng.models.AdData;
import com.smaato.sdk.ng.models.EndCardData;
import com.smaato.sdk.ng.viewability.baseom.BaseVerificationScriptResource;
import com.smaato.sdk.ng.vpaid.models.vast.AdServingId;
import com.smaato.sdk.ng.vpaid.models.vast.Category;
import com.smaato.sdk.ng.vpaid.models.vast.Icon;
import com.smaato.sdk.ng.vpaid.models.vast.Tracking;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class AdParams {
    private String a;
    private Integer b;
    private String c;
    private String d;
    private boolean e;
    private String f;
    private String g;
    private String h;
    private String i;
    private Icon j;
    private int k = -1;
    private final List<String> l = new ArrayList();
    private final List<EndCardData> m = new ArrayList();
    private final List<String> n = new ArrayList();
    private final List<String> o = new ArrayList();
    private final List<String> p = new ArrayList();
    private final List<String> q = new ArrayList();
    private final List<String> r = new ArrayList();
    private final List<Tracking> s = new ArrayList();
    private final List<AdServingId> t = new ArrayList();
    private final List<Category> u = new ArrayList();
    private final List<BaseVerificationScriptResource> v = new ArrayList();

    public void addAdCategories(List<Category> list) {
        if (list != null) {
            this.u.addAll(list);
        }
    }

    public void addAdServingId(AdServingId adServingId) {
        if (adServingId != null) {
            this.t.add(adServingId);
        }
    }

    public void addEvents(List<Tracking> list) {
        if (list != null) {
            this.s.addAll(list);
        }
    }

    public void addVerificationScriptResources(List<BaseVerificationScriptResource> list) {
        if (list != null) {
            this.v.addAll(list);
        }
    }

    public List<Category> getAdCategories() {
        return this.u;
    }

    public Icon getAdIcon() {
        return this.j;
    }

    public String getAdParams() {
        return this.f;
    }

    public List<AdServingId> getAdServingIds() {
        return this.t;
    }

    public List<AdData> getCompanionCreativeViewEvents() {
        ArrayList arrayList = new ArrayList();
        if (!this.o.isEmpty()) {
            Iterator<String> it = this.o.iterator();
            while (it.hasNext()) {
                arrayList.add(new AdData("url", "impression", it.next()));
            }
        }
        return arrayList;
    }

    public List<String> getCtaExtensionClicks() {
        return this.r;
    }

    public String getCtaExtensionHtml() {
        return this.h;
    }

    @Deprecated
    public int getDuration() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public Integer getDurationInteger() {
        return this.b;
    }

    public List<String> getEndCardClicks() {
        return this.q;
    }

    public List<EndCardData> getEndCardList() {
        return this.m;
    }

    public String getEndCardRedirectUrl() {
        return this.c;
    }

    public List<Tracking> getEvents() {
        return this.s;
    }

    public String getId() {
        return this.a;
    }

    public List<String> getImpressions() {
        return this.n;
    }

    public int getPublisherSkipSeconds() {
        return this.k;
    }

    public String getSkipTime() {
        return this.i;
    }

    public List<BaseVerificationScriptResource> getVerificationScriptResources() {
        return this.v;
    }

    public List<String> getVideoClicks() {
        return this.p;
    }

    public List<String> getVideoFileUrlsList() {
        return this.l;
    }

    public String getVideoRedirectUrl() {
        return this.d;
    }

    public String getVpaidJsUrl() {
        return this.g;
    }

    public boolean isVpaid() {
        return this.e;
    }

    public void setAdIcon(Icon icon) {
        this.j = icon;
    }

    public void setAdParams(String str) {
        this.f = str;
    }

    public void setCompanionCreativeViewEvents(List<String> list) {
        if (list != null) {
            this.o.addAll(list);
        }
    }

    public void setCtaExtensionClicks(List<String> list) {
        if (list != null) {
            this.r.addAll(list);
        }
    }

    public void setCtaExtensionHtml(String str) {
        this.h = str;
    }

    public void setDuration(Integer num) {
        this.b = num;
    }

    public void setEndCardClicks(List<String> list) {
        if (list != null) {
            this.q.addAll(list);
        }
    }

    public void setEndCardList(List<EndCardData> list) {
        if (list != null) {
            this.m.addAll(list);
        }
    }

    public void setEndCardRedirectUrl(String str) {
        this.c = str;
    }

    public void setId(String str) {
        this.a = str;
    }

    public void setImpressions(List<String> list) {
        if (list != null) {
            this.n.addAll(list);
        }
    }

    public void setPublisherSkipSeconds(int i) {
        this.k = i;
    }

    public void setSkipTime(String str) {
        this.i = str;
    }

    public void setVideoClicks(List<String> list) {
        if (list != null) {
            this.p.addAll(list);
        }
    }

    public void setVideoFileUrlsList(List<String> list) {
        if (list != null) {
            this.l.addAll(list);
        }
    }

    public void setVideoRedirectUrl(String str) {
        this.d = str;
    }

    public void setVpaid() {
        this.e = true;
    }

    public void setVpaidJsUrl(String str) {
        this.g = str;
    }
}
