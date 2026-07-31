package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.υ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0520 extends AbstractRunnableC0913 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0506 f490;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC0558 f491;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0542 f492;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f493;

    public C0520(C0506 c0506, ViewGroup viewGroup, C0542 c0542, ViewOnLayoutChangeListenerC0558 viewOnLayoutChangeListenerC0558) {
        this.f490 = c0506;
        this.f493 = viewGroup;
        this.f492 = c0542;
        this.f491 = viewOnLayoutChangeListenerC0558;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0506 c0506 = this.f490;
        ViewGroup viewGroup = this.f493;
        C0542 c0542 = this.f492;
        c0506.getClass();
        View.OnTouchListener m4258 = AbstractC0967.m4258(viewGroup);
        if (!(m4258 instanceof ViewOnTouchListenerC1165)) {
            viewGroup.setOnTouchListener(new ViewOnTouchListenerC1165(m4258, c0542));
        }
        for (int i = 0; i < this.f493.getChildCount(); i++) {
            View childAt = this.f493.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                C0506 c05062 = this.f490;
                ViewOnLayoutChangeListenerC0558 viewOnLayoutChangeListenerC0558 = this.f491;
                c05062.getClass();
                new Handler(Looper.getMainLooper()).post(new C0520(c05062, (ViewGroup) childAt, new C0542(c05062), viewOnLayoutChangeListenerC0558));
            } else {
                C0506 c05063 = this.f490;
                C0542 c05422 = this.f492;
                c05063.getClass();
                View.OnTouchListener m42582 = AbstractC0967.m4258(childAt);
                if (!(m42582 instanceof ViewOnTouchListenerC1165)) {
                    childAt.setOnTouchListener(new ViewOnTouchListenerC1165(m42582, c05422));
                }
            }
        }
        this.f493.removeOnLayoutChangeListener(this.f491);
        this.f493.addOnLayoutChangeListener(this.f491);
    }
}
