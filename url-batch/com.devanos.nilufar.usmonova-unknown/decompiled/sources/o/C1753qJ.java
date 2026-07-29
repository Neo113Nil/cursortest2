package o;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* renamed from: o.qJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1753qJ extends AbstractC0859ck {
    final /* synthetic */ C1884sJ this$0;

    /* renamed from: o.qJ$a */
    public static final class a extends AbstractC0859ck {
        final /* synthetic */ C1884sJ this$0;

        public a(C1884sJ c1884sJ) {
            this.this$0 = c1884sJ;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC0048Bt.n(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC0048Bt.n(activity, "activity");
            C1884sJ c1884sJ = this.this$0;
            int i = c1884sJ.h + 1;
            c1884sJ.h = i;
            if (i == 1 && c1884sJ.k) {
                c1884sJ.m.e(EnumC0054Bz.ON_START);
                c1884sJ.k = false;
            }
        }
    }

    public C1753qJ(C1884sJ c1884sJ) {
        this.this$0 = c1884sJ;
    }

    @Override // o.AbstractC0859ck, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC0048Bt.n(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = CN.i;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC0048Bt.l(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((CN) findFragmentByTag).h = this.this$0.f218o;
        }
    }

    @Override // o.AbstractC0859ck, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC0048Bt.n(activity, "activity");
        C1884sJ c1884sJ = this.this$0;
        int i = c1884sJ.i - 1;
        c1884sJ.i = i;
        if (i == 0) {
            Handler handler = c1884sJ.l;
            AbstractC0048Bt.k(handler);
            handler.postDelayed(c1884sJ.n, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC0048Bt.n(activity, "activity");
        AbstractC1687pJ.a(activity, new a(this.this$0));
    }

    @Override // o.AbstractC0859ck, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC0048Bt.n(activity, "activity");
        C1884sJ c1884sJ = this.this$0;
        int i = c1884sJ.h - 1;
        c1884sJ.h = i;
        if (i == 0 && c1884sJ.j) {
            c1884sJ.m.e(EnumC0054Bz.ON_STOP);
            c1884sJ.k = true;
        }
    }
}
