package com.five_corp.ad.internal;

import com.five_corp.ad.FiveAdCustomLayout;
import com.five_corp.ad.FiveAdCustomLayoutEventListener;
import com.five_corp.ad.FiveAdNative;
import com.five_corp.ad.FiveAdNativeEventListener;

/* loaded from: classes3.dex */
public interface i {
    static i a(final FiveAdCustomLayoutEventListener fiveAdCustomLayoutEventListener, final FiveAdCustomLayout fiveAdCustomLayout) {
        return new i() { // from class: com.five_corp.ad.internal.i$$ExternalSyntheticLambda0
            @Override // com.five_corp.ad.internal.i
            public final void a() {
                FiveAdCustomLayoutEventListener.this.onRemove(fiveAdCustomLayout);
            }
        };
    }

    void a();

    static i a(final FiveAdNativeEventListener fiveAdNativeEventListener, final FiveAdNative fiveAdNative) {
        return new i() { // from class: com.five_corp.ad.internal.i$$ExternalSyntheticLambda1
            @Override // com.five_corp.ad.internal.i
            public final void a() {
                FiveAdNativeEventListener.this.onRemove(fiveAdNative);
            }
        };
    }
}
