package com.ogury.ad.internal;

import com.ogury.ad.OguryBidTokenListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes10.dex */
public final class e9 extends Lambda implements Function1 {
    public final /* synthetic */ OguryBidTokenListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(OguryBidTokenListener oguryBidTokenListener) {
        super(1);
        this.a = oguryBidTokenListener;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        if (str != null) {
            this.a.onBidTokenGenerated(str);
        }
        return Unit.INSTANCE;
    }
}
