package com.smaato.sdk.ng.utils.browser;

import android.os.SystemClock;
import android.view.View;

/* loaded from: classes13.dex */
public abstract class DoubleClickPreventionListener implements View.OnClickListener {
    private long a;
    a b;

    interface a {
        long a();
    }

    public DoubleClickPreventionListener() {
        this(new a() { // from class: com.smaato.sdk.ng.utils.browser.DoubleClickPreventionListener$$ExternalSyntheticLambda0
            @Override // com.smaato.sdk.ng.utils.browser.DoubleClickPreventionListener.a
            public final long a() {
                return SystemClock.elapsedRealtime();
            }
        });
    }

    protected abstract void a();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long a2 = this.b.a();
        if (a2 - this.a < 1000) {
            return;
        }
        this.a = a2;
        a();
    }

    public DoubleClickPreventionListener(a aVar) {
        this.b = aVar;
    }
}
