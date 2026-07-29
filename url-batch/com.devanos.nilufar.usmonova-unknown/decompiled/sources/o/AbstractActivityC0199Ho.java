package o;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: o.Ho, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0199Ho extends AbstractActivityC0446Rc implements G1 {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final C0277Ko mFragments;
    boolean mResumed;
    final C0417Pz mFragmentLifecycleRegistry = new C0417Pz(this);
    boolean mStopped = true;

    public AbstractActivityC0199Ho() {
        final J4 j4 = (J4) this;
        this.mFragments = new C0277Ko(new C0173Go(j4));
        getSavedStateRegistry().c(LIFECYCLE_TAG, new C0095Do(0, j4));
        final int i = 0;
        addOnConfigurationChangedListener(new InterfaceC0655Zd() { // from class: o.Eo
            @Override // o.InterfaceC0655Zd
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        j4.mFragments.a();
                        break;
                    default:
                        j4.mFragments.a();
                        break;
                }
            }
        });
        final int i2 = 1;
        addOnNewIntentListener(new InterfaceC0655Zd() { // from class: o.Eo
            @Override // o.InterfaceC0655Zd
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        j4.mFragments.a();
                        break;
                    default:
                        j4.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new C0147Fo(j4, 0));
    }

    public static boolean d(AbstractC0588Wo abstractC0588Wo) {
        boolean z = false;
        for (AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co : abstractC0588Wo.c.y()) {
            if (abstractComponentCallbacksC0069Co != null) {
                C0173Go c0173Go = abstractComponentCallbacksC0069Co.A;
                if ((c0173Go == null ? null : c0173Go.v) != null) {
                    z |= d(abstractComponentCallbacksC0069Co.c());
                }
                if (abstractComponentCallbacksC0069Co.T.d.compareTo(EnumC0080Cz.k) >= 0) {
                    abstractComponentCallbacksC0069Co.T.g();
                    z = true;
                }
            }
        }
        return z;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.a.u.f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                AA.a(this).b(str2, printWriter);
            }
            this.mFragments.a.u.w(str, fileDescriptor, printWriter, strArr);
        }
    }

    public AbstractC0588Wo getSupportFragmentManager() {
        return this.mFragments.a.u;
    }

    @Deprecated
    public AA getSupportLoaderManager() {
        return AA.a(this);
    }

    public void markFragmentsCreated() {
        while (d(getSupportFragmentManager())) {
        }
    }

    @Override // o.AbstractActivityC0446Rc, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i2, intent);
    }

    @Override // o.AbstractActivityC0446Rc, o.AbstractActivityC0420Qc, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(EnumC0054Bz.ON_CREATE);
        C0614Xo c0614Xo = this.mFragments.a.u;
        c0614Xo.G = false;
        c0614Xo.H = false;
        c0614Xo.N.g = false;
        c0614Xo.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.a.u.l();
        this.mFragmentLifecycleRegistry.e(EnumC0054Bz.ON_DESTROY);
    }

    @Override // o.AbstractActivityC0446Rc, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.a.u.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.a.u.u(5);
        this.mFragmentLifecycleRegistry.e(EnumC0054Bz.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // o.AbstractActivityC0446Rc, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.a.u.A(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(EnumC0054Bz.ON_RESUME);
        C0614Xo c0614Xo = this.mFragments.a.u;
        c0614Xo.G = false;
        c0614Xo.H = false;
        c0614Xo.N.g = false;
        c0614Xo.u(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            C0614Xo c0614Xo = this.mFragments.a.u;
            c0614Xo.G = false;
            c0614Xo.H = false;
            c0614Xo.N.g = false;
            c0614Xo.u(4);
        }
        this.mFragments.a.u.A(true);
        this.mFragmentLifecycleRegistry.e(EnumC0054Bz.ON_START);
        C0614Xo c0614Xo2 = this.mFragments.a.u;
        c0614Xo2.G = false;
        c0614Xo2.H = false;
        c0614Xo2.N.g = false;
        c0614Xo2.u(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        C0614Xo c0614Xo = this.mFragments.a.u;
        c0614Xo.H = true;
        c0614Xo.N.g = true;
        c0614Xo.u(4);
        this.mFragmentLifecycleRegistry.e(EnumC0054Bz.ON_STOP);
    }

    public void setEnterSharedElementCallback(AbstractC1037fR abstractC1037fR) {
        E1.c(this, null);
    }

    public void setExitSharedElementCallback(AbstractC1037fR abstractC1037fR) {
        E1.d(this, null);
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
            return;
        }
        if (abstractComponentCallbacksC0069Co.A == null) {
            throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0069Co + " not attached to Activity");
        }
        AbstractC0588Wo e = abstractComponentCallbacksC0069Co.e();
        if (e.B != null) {
            e.E.addLast(new C0484So(abstractComponentCallbacksC0069Co.l, i));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            e.B.a(intent);
            return;
        }
        C0173Go c0173Go = e.v;
        c0173Go.getClass();
        AbstractC0048Bt.n(intent, "intent");
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        c0173Go.s.startActivity(intent, bundle);
    }

    @Deprecated
    public void startIntentSenderFromFragment(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        Intent intent2 = intent;
        if (abstractComponentCallbacksC0069Co.A == null) {
            throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0069Co + " not attached to Activity");
        }
        if (AbstractC0588Wo.J(2)) {
            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0069Co + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent2 + " options: " + bundle);
        }
        AbstractC0588Wo e = abstractComponentCallbacksC0069Co.e();
        if (e.C == null) {
            C0173Go c0173Go = e.v;
            c0173Go.getClass();
            AbstractC0048Bt.n(intentSender, "intent");
            if (i != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            J4 j4 = c0173Go.r;
            if (j4 == null) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            j4.startIntentSenderForResult(intentSender, i, intent2, i2, i3, i4, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (AbstractC0588Wo.J(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + abstractComponentCallbacksC0069Co);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        AbstractC0048Bt.n(intentSender, "intentSender");
        C1723pt c1723pt = new C1723pt(intentSender, intent2, i2, i3);
        e.E.addLast(new C0484So(abstractComponentCallbacksC0069Co.l, i));
        if (AbstractC0588Wo.J(2)) {
            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0069Co + "is launching an IntentSender for result ");
        }
        e.C.a(c1723pt);
    }

    public void supportFinishAfterTransition() {
        E1.a(this);
    }

    public void supportPostponeEnterTransition() {
        E1.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        E1.e(this);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co, Intent intent, int i) {
        startActivityFromFragment(abstractComponentCallbacksC0069Co, intent, i, (Bundle) null);
    }

    @Deprecated
    public void onAttachFragment(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co) {
    }

    @Override // o.G1
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }
}
