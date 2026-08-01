package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class F extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1871b = 0;

    /* renamed from: a, reason: collision with root package name */
    public A1.d f1872a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final E Companion = new E();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            i1.f.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            i1.f.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            i1.f.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            i1.f.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            i1.f.e(activity, "activity");
            int i = F.f1871b;
            D.a(activity, EnumC0079l.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            i1.f.e(activity, "activity");
            int i = F.f1871b;
            D.a(activity, EnumC0079l.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            i1.f.e(activity, "activity");
            int i = F.f1871b;
            D.a(activity, EnumC0079l.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            i1.f.e(activity, "activity");
            int i = F.f1871b;
            D.a(activity, EnumC0079l.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            i1.f.e(activity, "activity");
            int i = F.f1871b;
            D.a(activity, EnumC0079l.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            i1.f.e(activity, "activity");
            int i = F.f1871b;
            D.a(activity, EnumC0079l.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            i1.f.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            i1.f.e(activity, "activity");
            i1.f.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            i1.f.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            i1.f.e(activity, "activity");
        }
    }

    public final void a(EnumC0079l enumC0079l) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            i1.f.d(activity, "activity");
            D.a(activity, enumC0079l);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0079l.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0079l.ON_DESTROY);
        this.f1872a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0079l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        A1.d dVar = this.f1872a;
        if (dVar != null) {
            ((C) dVar.f38b).a();
        }
        a(EnumC0079l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        A1.d dVar = this.f1872a;
        if (dVar != null) {
            C c2 = (C) dVar.f38b;
            int i = c2.f1865a + 1;
            c2.f1865a = i;
            if (i == 1 && c2.d) {
                c2.f1869f.d(EnumC0079l.ON_START);
                c2.d = false;
            }
        }
        a(EnumC0079l.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0079l.ON_STOP);
    }
}
