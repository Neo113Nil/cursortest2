package com.ogury.ad.internal;

import android.view.View;
import android.view.ViewGroup;
import com.ogury.ad.async.CompositeDisposable;
import com.ogury.ad.async.Single;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class f4 implements a3 {
    public final ViewGroup a;
    public final wi b;
    public final vi c;
    public final hi d;
    public final CompositeDisposable e;
    public b3 f;
    public final ji g;

    public f4(g adContainer) {
        wi webViewHelper = new wi();
        vi overlapCalculator = new vi(webViewHelper);
        hi viewHierarchy = new hi();
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        Intrinsics.checkNotNullParameter(webViewHelper, "webViewHelper");
        Intrinsics.checkNotNullParameter(overlapCalculator, "overlapCalculator");
        Intrinsics.checkNotNullParameter(viewHierarchy, "viewHierarchy");
        this.a = adContainer;
        this.b = webViewHelper;
        this.c = overlapCalculator;
        this.d = viewHierarchy;
        this.e = new CompositeDisposable();
        this.g = new ji(adContainer);
    }

    @Override // com.ogury.ad.internal.a3
    public final void a(b3 b3Var) {
        this.f = b3Var;
    }

    @Override // com.ogury.ad.internal.a3
    public final void destroy() {
        this.f = null;
        this.e.dispose();
    }

    @Override // com.ogury.ad.internal.a3
    public final void a() {
        this.e.dispose();
        int childCount = this.a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.a.getChildAt(i);
            if (childAt instanceof y7) {
                y7 y7Var = (y7) childAt;
                if (y7Var.getContainsMraid()) {
                    this.e.add(Single.INSTANCE.fromCallable(new d4(this, y7Var)).subscribe(new e4(this, y7Var)));
                }
            }
        }
    }
}
