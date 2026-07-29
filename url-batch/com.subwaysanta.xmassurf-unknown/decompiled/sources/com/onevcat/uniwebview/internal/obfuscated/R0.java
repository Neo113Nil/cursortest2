package com.onevcat.uniwebview.internal.obfuscated;

import android.webkit.WebBackForwardList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class R0 extends Lambda implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(int i) {
        super(1);
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        C0092z c0092z = it.v;
        int i = this.a;
        WebBackForwardList copyBackForwardList = c0092z.copyBackForwardList();
        Intrinsics.checkNotNullExpressionValue(copyBackForwardList, "copyBackForwardList()");
        if (i < 0 || i >= copyBackForwardList.getSize()) {
            C0058o c0058o = C0058o.b;
            c0058o.getClass();
            Intrinsics.checkNotNullParameter("Invalid index to go in back forward list.", "message");
            c0058o.a(EnumC0054n.INFO, "Invalid index to go in back forward list.");
        } else if (i == copyBackForwardList.getCurrentIndex()) {
            C0058o c0058o2 = C0058o.b;
            c0058o2.getClass();
            Intrinsics.checkNotNullParameter("Skip going to current item in back forward list.", "message");
            c0058o2.a(EnumC0054n.INFO, "Skip going to current item in back forward list.");
        } else {
            c0092z.goBackOrForward(i - copyBackForwardList.getCurrentIndex());
        }
        return Unit.INSTANCE;
    }
}
