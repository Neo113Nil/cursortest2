package Y;

import E1.AbstractC0001b;
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
import c1.AbstractC0104b;
import com.luckycounter.drinkwater.R;
import g.AbstractActivityC0129i;
import java.io.PrintWriter;

/* renamed from: Y.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0051m extends AbstractComponentCallbacksC0055q implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: T, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0048j f1458T;

    /* renamed from: U, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0049k f1459U;

    /* renamed from: V, reason: collision with root package name */
    public int f1460V;

    /* renamed from: W, reason: collision with root package name */
    public int f1461W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f1462X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f1463Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f1464Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1465a0;

    /* renamed from: b0, reason: collision with root package name */
    public final A1.d f1466b0;

    /* renamed from: c0, reason: collision with root package name */
    public Dialog f1467c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1468d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1469e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1470f0;

    public DialogInterfaceOnCancelListenerC0051m() {
        new A1.e(5, this);
        this.f1458T = new DialogInterfaceOnCancelListenerC0048j(this);
        this.f1459U = new DialogInterfaceOnDismissListenerC0049k(this);
        this.f1460V = 0;
        this.f1461W = 0;
        this.f1462X = true;
        this.f1463Y = true;
        this.f1464Z = -1;
        this.f1466b0 = new A1.d(17, this);
        this.f1470f0 = false;
    }

    @Override // Y.AbstractComponentCallbacksC0055q
    public final void A(Bundle bundle) {
        Bundle bundle2;
        this.f1484C = true;
        if (this.f1467c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1467c0.onRestoreInstanceState(bundle2);
    }

    @Override // Y.AbstractComponentCallbacksC0055q
    public final void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.B(layoutInflater, viewGroup, bundle);
        if (this.f1486E != null || this.f1467c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1467c0.onRestoreInstanceState(bundle2);
    }

    public Dialog G() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new a.m(C(), this.f1461W);
    }

    @Override // Y.AbstractComponentCallbacksC0055q
    public final F1.d d() {
        return new C0050l(this, new C0053o(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1468d0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f1469e0) {
            return;
        }
        this.f1469e0 = true;
        Dialog dialog = this.f1467c0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1467c0.dismiss();
        }
        this.f1468d0 = true;
        if (this.f1464Z >= 0) {
            I j2 = j();
            int i = this.f1464Z;
            if (i < 0) {
                throw new IllegalArgumentException(AbstractC0001b.f("Bad id: ", i));
            }
            j2.w(new H(j2, i), true);
            this.f1464Z = -1;
            return;
        }
        C0039a c0039a = new C0039a(j());
        c0039a.f1422o = true;
        I i2 = this.f1513r;
        if (i2 != null && i2 != c0039a.f1423p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0039a.b(new P(3, this));
        if (c0039a.f1424q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + c0039a);
            PrintWriter printWriter = new PrintWriter(new S());
            c0039a.d("  ", printWriter, true);
            printWriter.close();
        }
        c0039a.f1424q = true;
        boolean z2 = c0039a.f1416g;
        I i3 = c0039a.f1423p;
        if (z2) {
            c0039a.f1425r = i3.i.getAndIncrement();
        } else {
            c0039a.f1425r = -1;
        }
        i3.w(c0039a, true);
    }

    @Override // Y.AbstractComponentCallbacksC0055q
    public final void p() {
        this.f1484C = true;
    }

    @Override // Y.AbstractComponentCallbacksC0055q
    public final void r(AbstractActivityC0129i abstractActivityC0129i) {
        Object obj;
        super.r(abstractActivityC0129i);
        androidx.lifecycle.y yVar = this.f1495O;
        yVar.getClass();
        androidx.lifecycle.y.a("observeForever");
        A1.d dVar = this.f1466b0;
        androidx.lifecycle.x xVar = new androidx.lifecycle.x(yVar, dVar);
        n.f fVar = yVar.f1922b;
        n.c a2 = fVar.a(dVar);
        if (a2 != null) {
            obj = a2.f3568b;
        } else {
            n.c cVar = new n.c(dVar, xVar);
            fVar.d++;
            n.c cVar2 = fVar.f3574b;
            if (cVar2 == null) {
                fVar.f3573a = cVar;
                fVar.f3574b = cVar;
            } else {
                cVar2.f3569c = cVar;
                cVar.d = cVar2;
                fVar.f3574b = cVar;
            }
            obj = null;
        }
        if (((androidx.lifecycle.x) obj) == null) {
            xVar.a(true);
        }
        this.f1469e0 = false;
    }

    @Override // Y.AbstractComponentCallbacksC0055q
    public void s(Bundle bundle) {
        super.s(bundle);
        new Handler();
        this.f1463Y = this.f1518w == 0;
        if (bundle != null) {
            this.f1460V = bundle.getInt("android:style", 0);
            this.f1461W = bundle.getInt("android:theme", 0);
            this.f1462X = bundle.getBoolean("android:cancelable", true);
            this.f1463Y = bundle.getBoolean("android:showsDialog", this.f1463Y);
            this.f1464Z = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // Y.AbstractComponentCallbacksC0055q
    public final void u() {
        this.f1484C = true;
        Dialog dialog = this.f1467c0;
        if (dialog != null) {
            this.f1468d0 = true;
            dialog.setOnDismissListener(null);
            this.f1467c0.dismiss();
            if (!this.f1469e0) {
                onDismiss(this.f1467c0);
            }
            this.f1467c0 = null;
            this.f1470f0 = false;
        }
    }

    @Override // Y.AbstractComponentCallbacksC0055q
    public final void v() {
        this.f1484C = true;
        if (!this.f1469e0) {
            this.f1469e0 = true;
        }
        androidx.lifecycle.y yVar = this.f1495O;
        yVar.getClass();
        androidx.lifecycle.y.a("removeObserver");
        androidx.lifecycle.x xVar = (androidx.lifecycle.x) yVar.f1922b.b(this.f1466b0);
        if (xVar == null) {
            return;
        }
        xVar.a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x0050, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0068), top: B:9:0x001a }] */
    @Override // Y.AbstractComponentCallbacksC0055q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater w(Bundle bundle) {
        Context h;
        LayoutInflater w2 = super.w(bundle);
        boolean z2 = this.f1463Y;
        if (!z2 || this.f1465a0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f1463Y) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return w2;
        }
        if (z2 && !this.f1470f0) {
            try {
                this.f1465a0 = true;
                Dialog G2 = G();
                this.f1467c0 = G2;
                if (this.f1463Y) {
                    int i = this.f1460V;
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            Window window = G2.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                        } else {
                            h = h();
                            if (h instanceof Activity) {
                                this.f1467c0.setOwnerActivity((Activity) h);
                            }
                            this.f1467c0.setCancelable(this.f1462X);
                            this.f1467c0.setOnCancelListener(this.f1458T);
                            this.f1467c0.setOnDismissListener(this.f1459U);
                            this.f1470f0 = true;
                        }
                    }
                    G2.requestWindowFeature(1);
                    h = h();
                    if (h instanceof Activity) {
                    }
                    this.f1467c0.setCancelable(this.f1462X);
                    this.f1467c0.setOnCancelListener(this.f1458T);
                    this.f1467c0.setOnDismissListener(this.f1459U);
                    this.f1470f0 = true;
                } else {
                    this.f1467c0 = null;
                }
                this.f1465a0 = false;
            } catch (Throwable th) {
                this.f1465a0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f1467c0;
        return dialog != null ? w2.cloneInContext(dialog.getContext()) : w2;
    }

    @Override // Y.AbstractComponentCallbacksC0055q
    public void x(Bundle bundle) {
        Dialog dialog = this.f1467c0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f1460V;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f1461W;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z2 = this.f1462X;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f1463Y;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i3 = this.f1464Z;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // Y.AbstractComponentCallbacksC0055q
    public void y() {
        this.f1484C = true;
        Dialog dialog = this.f1467c0;
        if (dialog != null) {
            this.f1468d0 = false;
            dialog.show();
            View decorView = this.f1467c0.getWindow().getDecorView();
            androidx.lifecycle.J.g(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            AbstractC0104b.w(decorView, this);
        }
    }

    @Override // Y.AbstractComponentCallbacksC0055q
    public void z() {
        this.f1484C = true;
        Dialog dialog = this.f1467c0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
