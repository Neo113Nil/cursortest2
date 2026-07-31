package com.my.target;

import com.my.target.e;
import com.my.target.internal.api.internalnativead.models.adchoices.InternalNativeAdMenuAction;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class s7 implements InternalNativeAdMenuAction {
    private final e.a a;

    public s7(e.a aVar) {
        this.a = aVar;
    }

    public String a() {
        return this.a.b;
    }

    public String b() {
        return this.a.c;
    }

    public String c() {
        return this.a.a;
    }

    public String getAlias() {
        return this.a.e.alias;
    }

    public String getTitle() {
        return this.a.e.title;
    }

    public String getType() {
        return this.a.e.type;
    }

    public boolean isAdShouldClose() {
        return this.a.d;
    }
}
