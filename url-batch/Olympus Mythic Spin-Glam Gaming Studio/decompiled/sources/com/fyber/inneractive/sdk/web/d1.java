package com.fyber.inneractive.sdk.web;

import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class d1 {
    public final String a;
    public final String b;
    public final HashMap c;

    public d1(WebResourceRequest webResourceRequest) {
        this.a = webResourceRequest.getUrl().toString();
        this.b = webResourceRequest.getMethod();
        this.c = new HashMap(webResourceRequest.getRequestHeaders() == null ? Collections.emptyMap() : webResourceRequest.getRequestHeaders());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d1.class != obj.getClass()) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (this.a.equals(d1Var.a) && this.b.equals(d1Var.b)) {
            return this.c.equals(d1Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
