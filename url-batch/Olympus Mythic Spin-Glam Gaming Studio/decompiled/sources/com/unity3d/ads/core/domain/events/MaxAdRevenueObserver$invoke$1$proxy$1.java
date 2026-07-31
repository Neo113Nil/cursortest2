package com.unity3d.ads.core.domain.events;

import android.os.Bundle;
import com.unity3d.ads.core.data.datasource.MaxAdRevenueListener;
import com.unity3d.services.core.reflection.CommunicatorSubscriberProxy;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MaxAdRevenueObserver.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class MaxAdRevenueObserver$invoke$1$proxy$1 implements CommunicatorSubscriberProxy.CommunicatorMessageListener, FunctionAdapter {
    final /* synthetic */ MaxAdRevenueListener $tmp0;

    MaxAdRevenueObserver$invoke$1$proxy$1(MaxAdRevenueListener maxAdRevenueListener) {
        this.$tmp0 = maxAdRevenueListener;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof CommunicatorSubscriberProxy.CommunicatorMessageListener) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.$tmp0, MaxAdRevenueListener.class, "onMessageReceived", "onMessageReceived(Landroid/os/Bundle;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.unity3d.services.core.reflection.CommunicatorSubscriberProxy.CommunicatorMessageListener
    public final void onMessageReceived(Bundle p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        this.$tmp0.onMessageReceived(p0);
    }
}
