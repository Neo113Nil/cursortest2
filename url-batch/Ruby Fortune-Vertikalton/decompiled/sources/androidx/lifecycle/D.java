package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class D extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1332b = 0;

    /* renamed from: a, reason: collision with root package name */
    public B0.d f1333a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final C Companion = new C();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            X0.e.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            X0.e.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            X0.e.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            X0.e.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            X0.e.e(activity, "activity");
            int i = D.f1332b;
            B.a(activity, EnumC0068l.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            X0.e.e(activity, "activity");
            int i = D.f1332b;
            B.a(activity, EnumC0068l.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            X0.e.e(activity, "activity");
            int i = D.f1332b;
            B.a(activity, EnumC0068l.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            X0.e.e(activity, "activity");
            int i = D.f1332b;
            B.a(activity, EnumC0068l.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            X0.e.e(activity, "activity");
            int i = D.f1332b;
            B.a(activity, EnumC0068l.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            X0.e.e(activity, "activity");
            int i = D.f1332b;
            B.a(activity, EnumC0068l.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            X0.e.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            X0.e.e(activity, "activity");
            X0.e.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            X0.e.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            X0.e.e(activity, "activity");
        }
    }

    public final void a(EnumC0068l enumC0068l) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            X0.e.d(activity, "activity");
            B.a(activity, enumC0068l);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0068l.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0068l.ON_DESTROY);
        this.f1333a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0068l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        B0.d dVar = this.f1333a;
        if (dVar != null) {
            ((A) dVar.f59b).a();
        }
        a(EnumC0068l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        B0.d dVar = this.f1333a;
        if (dVar != null) {
            A a2 = (A) dVar.f59b;
            int i = a2.f1326a + 1;
            a2.f1326a = i;
            if (i == 1 && a2.d) {
                a2.f1330f.d(EnumC0068l.ON_START);
                a2.d = false;
            }
        }
        a(EnumC0068l.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0068l.ON_STOP);
    }
}
