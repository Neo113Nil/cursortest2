package o;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lo/CN;", "Landroid/app/Fragment;", "<init>", "()V", "o/rJ", "o/AN", "a", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class CN extends Fragment {
    public static final /* synthetic */ int i = 0;
    public C1818rJ h;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final BN Companion = new BN();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            AbstractC0048Bt.n(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC0048Bt.n(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC0048Bt.n(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC0048Bt.n(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            AbstractC0048Bt.n(activity, "activity");
            int i = CN.i;
            AN.a(activity, EnumC0054Bz.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC0048Bt.n(activity, "activity");
            int i = CN.i;
            AN.a(activity, EnumC0054Bz.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC0048Bt.n(activity, "activity");
            int i = CN.i;
            AN.a(activity, EnumC0054Bz.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            AbstractC0048Bt.n(activity, "activity");
            int i = CN.i;
            AN.a(activity, EnumC0054Bz.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            AbstractC0048Bt.n(activity, "activity");
            int i = CN.i;
            AN.a(activity, EnumC0054Bz.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            AbstractC0048Bt.n(activity, "activity");
            int i = CN.i;
            AN.a(activity, EnumC0054Bz.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC0048Bt.n(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC0048Bt.n(activity, "activity");
            AbstractC0048Bt.n(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC0048Bt.n(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC0048Bt.n(activity, "activity");
        }
    }

    public final void a(EnumC0054Bz enumC0054Bz) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC0048Bt.m(activity, "activity");
            AN.a(activity, enumC0054Bz);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0054Bz.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0054Bz.ON_DESTROY);
        this.h = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0054Bz.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C1818rJ c1818rJ = this.h;
        if (c1818rJ != null) {
            ((C1884sJ) c1818rJ.i).a();
        }
        a(EnumC0054Bz.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C1818rJ c1818rJ = this.h;
        if (c1818rJ != null) {
            C1884sJ c1884sJ = (C1884sJ) c1818rJ.i;
            int i2 = c1884sJ.h + 1;
            c1884sJ.h = i2;
            if (i2 == 1 && c1884sJ.k) {
                c1884sJ.m.e(EnumC0054Bz.ON_START);
                c1884sJ.k = false;
            }
        }
        a(EnumC0054Bz.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0054Bz.ON_STOP);
    }
}
