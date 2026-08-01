package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.ratebook.luckyconvert.R;
import g.AbstractActivityC0126i;
import java.io.PrintWriter;

/* renamed from: X.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0045m extends AbstractComponentCallbacksC0049q implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: T, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0042j f924T;

    /* renamed from: U, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0043k f925U;

    /* renamed from: V, reason: collision with root package name */
    public int f926V;

    /* renamed from: W, reason: collision with root package name */
    public int f927W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f928X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f929Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f930Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f931a0;

    /* renamed from: b0, reason: collision with root package name */
    public final B0.d f932b0;

    /* renamed from: c0, reason: collision with root package name */
    public Dialog f933c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f934d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f935e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f936f0;

    public DialogInterfaceOnCancelListenerC0045m() {
        new K0.B(4, this);
        this.f924T = new DialogInterfaceOnCancelListenerC0042j(this);
        this.f925U = new DialogInterfaceOnDismissListenerC0043k(this);
        this.f926V = 0;
        this.f927W = 0;
        this.f928X = true;
        this.f929Y = true;
        this.f930Z = -1;
        this.f932b0 = new B0.d(16, this);
        this.f936f0 = false;
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public final void A(Bundle bundle) {
        Bundle bundle2;
        this.f950C = true;
        if (this.f933c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f933c0.onRestoreInstanceState(bundle2);
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public final void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.B(layoutInflater, viewGroup, bundle);
        if (this.f952E != null || this.f933c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f933c0.onRestoreInstanceState(bundle2);
    }

    public Dialog G() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new a.m(C(), this.f927W);
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public final q1.d e() {
        return new C0044l(this, new C0047o(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f934d0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f935e0) {
            return;
        }
        this.f935e0 = true;
        Dialog dialog = this.f933c0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f933c0.dismiss();
        }
        this.f934d0 = true;
        if (this.f930Z >= 0) {
            I j2 = j();
            int i = this.f930Z;
            if (i < 0) {
                throw new IllegalArgumentException(V.d("Bad id: ", i));
            }
            j2.w(new H(j2, i), true);
            this.f930Z = -1;
            return;
        }
        C0033a c0033a = new C0033a(j());
        c0033a.f888o = true;
        I i2 = this.f979r;
        if (i2 != null && i2 != c0033a.f889p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0033a.b(new P(3, this));
        if (c0033a.f890q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + c0033a);
            PrintWriter printWriter = new PrintWriter(new S());
            c0033a.d("  ", printWriter, true);
            printWriter.close();
        }
        c0033a.f890q = true;
        boolean z2 = c0033a.f882g;
        I i3 = c0033a.f889p;
        if (z2) {
            c0033a.f891r = i3.i.getAndIncrement();
        } else {
            c0033a.f891r = -1;
        }
        i3.w(c0033a, true);
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public final void p() {
        this.f950C = true;
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public final void r(AbstractActivityC0126i abstractActivityC0126i) {
        Object obj;
        super.r(abstractActivityC0126i);
        androidx.lifecycle.w wVar = this.f961O;
        wVar.getClass();
        androidx.lifecycle.w.a("observeForever");
        B0.d dVar = this.f932b0;
        androidx.lifecycle.v vVar = new androidx.lifecycle.v(wVar, dVar);
        n.f fVar = wVar.f1381b;
        n.c a2 = fVar.a(dVar);
        if (a2 != null) {
            obj = a2.f3253b;
        } else {
            n.c cVar = new n.c(dVar, vVar);
            fVar.d++;
            n.c cVar2 = fVar.f3259b;
            if (cVar2 == null) {
                fVar.f3258a = cVar;
                fVar.f3259b = cVar;
            } else {
                cVar2.f3254c = cVar;
                cVar.d = cVar2;
                fVar.f3259b = cVar;
            }
            obj = null;
        }
        if (((androidx.lifecycle.v) obj) == null) {
            vVar.a(true);
        }
        this.f935e0 = false;
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public void s(Bundle bundle) {
        super.s(bundle);
        new Handler();
        this.f929Y = this.f984w == 0;
        if (bundle != null) {
            this.f926V = bundle.getInt("android:style", 0);
            this.f927W = bundle.getInt("android:theme", 0);
            this.f928X = bundle.getBoolean("android:cancelable", true);
            this.f929Y = bundle.getBoolean("android:showsDialog", this.f929Y);
            this.f930Z = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public final void u() {
        this.f950C = true;
        Dialog dialog = this.f933c0;
        if (dialog != null) {
            this.f934d0 = true;
            dialog.setOnDismissListener(null);
            this.f933c0.dismiss();
            if (!this.f935e0) {
                onDismiss(this.f933c0);
            }
            this.f933c0 = null;
            this.f936f0 = false;
        }
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public final void v() {
        this.f950C = true;
        if (!this.f935e0) {
            this.f935e0 = true;
        }
        androidx.lifecycle.w wVar = this.f961O;
        wVar.getClass();
        androidx.lifecycle.w.a("removeObserver");
        androidx.lifecycle.v vVar = (androidx.lifecycle.v) wVar.f1381b.b(this.f932b0);
        if (vVar == null) {
            return;
        }
        vVar.a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x0050, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0068), top: B:9:0x001a }] */
    @Override // X.AbstractComponentCallbacksC0049q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater w(Bundle bundle) {
        Context h;
        LayoutInflater w2 = super.w(bundle);
        boolean z2 = this.f929Y;
        if (!z2 || this.f931a0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f929Y) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return w2;
        }
        if (z2 && !this.f936f0) {
            try {
                this.f931a0 = true;
                Dialog G2 = G();
                this.f933c0 = G2;
                if (this.f929Y) {
                    int i = this.f926V;
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            Window window = G2.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                        } else {
                            h = h();
                            if (h instanceof Activity) {
                                this.f933c0.setOwnerActivity((Activity) h);
                            }
                            this.f933c0.setCancelable(this.f928X);
                            this.f933c0.setOnCancelListener(this.f924T);
                            this.f933c0.setOnDismissListener(this.f925U);
                            this.f936f0 = true;
                        }
                    }
                    G2.requestWindowFeature(1);
                    h = h();
                    if (h instanceof Activity) {
                    }
                    this.f933c0.setCancelable(this.f928X);
                    this.f933c0.setOnCancelListener(this.f924T);
                    this.f933c0.setOnDismissListener(this.f925U);
                    this.f936f0 = true;
                } else {
                    this.f933c0 = null;
                }
                this.f931a0 = false;
            } catch (Throwable th) {
                this.f931a0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f933c0;
        return dialog != null ? w2.cloneInContext(dialog.getContext()) : w2;
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public void x(Bundle bundle) {
        Dialog dialog = this.f933c0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f926V;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f927W;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z2 = this.f928X;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f929Y;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i3 = this.f930Z;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public void y() {
        this.f950C = true;
        Dialog dialog = this.f933c0;
        if (dialog != null) {
            this.f934d0 = false;
            dialog.show();
            View decorView = this.f933c0.getWindow().getDecorView();
            androidx.lifecycle.H.f(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            q1.d.j0(decorView, this);
        }
    }

    @Override // X.AbstractComponentCallbacksC0049q
    public void z() {
        this.f950C = true;
        Dialog dialog = this.f933c0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
