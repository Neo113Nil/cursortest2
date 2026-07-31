package io.appmetrica.analytics.impl;

import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.r9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5640r9 extends AbstractC5207ag {
    public final Ei a;
    public final HashMap b;
    public final H4 c;

    public C5640r9(C5532n5 c5532n5) {
        Ei ei = new Ei(c5532n5);
        this.a = ei;
        this.c = new H4(ei);
        this.b = a(c5532n5);
    }

    public final HashMap a(C5532n5 c5532n5) {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC5798xb.EVENT_TYPE_ACTIVATION, new C5371h(this.a, c5532n5.b));
        hashMap.put(EnumC5798xb.EVENT_TYPE_START, new Vl(this.a));
        hashMap.put(EnumC5798xb.EVENT_TYPE_REGULAR, new Pg(this.a));
        Eb eb = new Eb(this.a);
        hashMap.put(EnumC5798xb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, eb);
        hashMap.put(EnumC5798xb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, eb);
        hashMap.put(EnumC5798xb.EVENT_TYPE_SEND_REFERRER, eb);
        hashMap.put(EnumC5798xb.EVENT_TYPE_CUSTOM_EVENT, eb);
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_SET_SESSION_EXTRA;
        Ei ei = this.a;
        hashMap.put(enumC5798xb, new Ql(ei, ei.t));
        hashMap.put(EnumC5798xb.EVENT_TYPE_APP_OPEN, new Wg(this.a));
        hashMap.put(EnumC5798xb.EVENT_TYPE_PURGE_BUFFER, new C5517mg(this.a));
        hashMap.put(EnumC5798xb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new K6(this.a));
        hashMap.put(EnumC5798xb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, new Qf(this.a));
        hashMap.put(EnumC5798xb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C5551no(this.a));
        hashMap.put(EnumC5798xb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new Rf(this.a));
        hashMap.put(EnumC5798xb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, new C5525mo(this.a));
        hashMap.put(EnumC5798xb.EVENT_TYPE_ANR, eb);
        EnumC5798xb enumC5798xb2 = EnumC5798xb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        Ei ei2 = this.a;
        hashMap.put(enumC5798xb2, new Ql(ei2, ei2.e));
        EnumC5798xb enumC5798xb3 = EnumC5798xb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        Ei ei3 = this.a;
        hashMap.put(enumC5798xb3, new Ql(ei3, ei3.f));
        hashMap.put(EnumC5798xb.EVENT_TYPE_SEND_USER_PROFILE, eb);
        EnumC5798xb enumC5798xb4 = EnumC5798xb.EVENT_TYPE_SET_USER_PROFILE_ID;
        Ei ei4 = this.a;
        hashMap.put(enumC5798xb4, new Ql(ei4, ei4.k));
        hashMap.put(EnumC5798xb.EVENT_TYPE_SEND_REVENUE_EVENT, eb);
        hashMap.put(EnumC5798xb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, eb);
        hashMap.put(EnumC5798xb.EVENT_TYPE_CLEANUP, eb);
        hashMap.put(EnumC5798xb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, eb);
        hashMap.put(EnumC5798xb.EVENT_TYPE_WEBVIEW_SYNC, eb);
        hashMap.put(EnumC5798xb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, new Z9(this.a));
        return hashMap;
    }

    public final void a(EnumC5798xb enumC5798xb, Oa oa) {
        this.b.put(enumC5798xb, oa);
    }

    public final Ei a() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5207ag
    public final AbstractC5615q9 a(int i) {
        LinkedList linkedList = new LinkedList();
        EnumC5798xb a = EnumC5798xb.a(i);
        H4 h4 = this.c;
        if (h4 != null) {
            h4.a(a, linkedList);
        }
        Oa oa = (Oa) this.b.get(a);
        if (oa != null) {
            oa.a(linkedList);
        }
        return new C5588p9(linkedList);
    }

    @VisibleForTesting
    public final Oa a(EnumC5798xb enumC5798xb) {
        return (Oa) this.b.get(enumC5798xb);
    }
}
