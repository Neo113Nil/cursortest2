package Y;

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
import androidx.fragment.app.FragmentActivity;
import com.football.transfertrivia.R;
import java.io.PrintWriter;

/* renamed from: Y.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0045m extends AbstractComponentCallbacksC0049q implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: T, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0042j f1077T;

    /* renamed from: U, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0043k f1078U;

    /* renamed from: V, reason: collision with root package name */
    public int f1079V;

    /* renamed from: W, reason: collision with root package name */
    public int f1080W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f1081X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f1082Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f1083Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1084a0;

    /* renamed from: b0, reason: collision with root package name */
    public final A0.h f1085b0;

    /* renamed from: c0, reason: collision with root package name */
    public Dialog f1086c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1087d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1088e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1089f0;

    public DialogInterfaceOnCancelListenerC0045m() {
        new Q.b(4, this);
        this.f1077T = new DialogInterfaceOnCancelListenerC0042j(this);
        this.f1078U = new DialogInterfaceOnDismissListenerC0043k(this);
        this.f1079V = 0;
        this.f1080W = 0;
        this.f1081X = true;
        this.f1082Y = true;
        this.f1083Z = -1;
        this.f1085b0 = new A0.h(14, this);
        this.f1089f0 = false;
    }

    @Override // Y.AbstractComponentCallbacksC0049q
    public final void A(Bundle bundle) {
        Bundle bundle2;
        this.f1103C = true;
        if (this.f1086c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1086c0.onRestoreInstanceState(bundle2);
    }

    @Override // Y.AbstractComponentCallbacksC0049q
    public final void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.B(layoutInflater, viewGroup, bundle);
        if (this.f1105E != null || this.f1086c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1086c0.onRestoreInstanceState(bundle2);
    }

    public Dialog G() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new a.l(C(), this.f1080W);
    }

    @Override // Y.AbstractComponentCallbacksC0049q
    public final T.e e() {
        return new C0044l(this, new C0047o(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1087d0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f1088e0) {
            return;
        }
        this.f1088e0 = true;
        Dialog dialog = this.f1086c0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1086c0.dismiss();
        }
        this.f1087d0 = true;
        if (this.f1083Z >= 0) {
            I j2 = j();
            int i = this.f1083Z;
            if (i >= 0) {
                j2.w(new H(j2, i), true);
                this.f1083Z = -1;
                return;
            } else {
                throw new IllegalArgumentException("Bad id: " + i);
            }
        }
        C0033a c0033a = new C0033a(j());
        c0033a.f1041o = true;
        I i2 = this.f1132r;
        if (i2 != null && i2 != c0033a.f1042p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0033a.b(new P(3, this));
        if (c0033a.f1043q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + c0033a);
            PrintWriter printWriter = new PrintWriter(new S());
            c0033a.d("  ", printWriter, true);
            printWriter.close();
        }
        c0033a.f1043q = true;
        boolean z2 = c0033a.f1035g;
        I i3 = c0033a.f1042p;
        if (z2) {
            c0033a.f1044r = i3.i.getAndIncrement();
        } else {
            c0033a.f1044r = -1;
        }
        i3.w(c0033a, true);
    }

    @Override // Y.AbstractComponentCallbacksC0049q
    public final void p() {
        this.f1103C = true;
    }

    @Override // Y.AbstractComponentCallbacksC0049q
    public final void r(FragmentActivity fragmentActivity) {
        Object obj;
        super.r(fragmentActivity);
        androidx.lifecycle.y yVar = this.f1114O;
        yVar.getClass();
        androidx.lifecycle.y.a("observeForever");
        A0.h hVar = this.f1085b0;
        androidx.lifecycle.x xVar = new androidx.lifecycle.x(yVar, hVar);
        n.f fVar = yVar.f1543b;
        n.c a2 = fVar.a(hVar);
        if (a2 != null) {
            obj = a2.f3142b;
        } else {
            n.c cVar = new n.c(hVar, xVar);
            fVar.d++;
            n.c cVar2 = fVar.f3148b;
            if (cVar2 == null) {
                fVar.f3147a = cVar;
                fVar.f3148b = cVar;
            } else {
                cVar2.f3143c = cVar;
                cVar.d = cVar2;
                fVar.f3148b = cVar;
            }
            obj = null;
        }
        if (((androidx.lifecycle.x) obj) == null) {
            xVar.a(true);
        }
        this.f1088e0 = false;
    }

    @Override // Y.AbstractComponentCallbacksC0049q
    public void s(Bundle bundle) {
        super.s(bundle);
        new Handler();
        this.f1082Y = this.f1137w == 0;
        if (bundle != null) {
            this.f1079V = bundle.getInt("android:style", 0);
            this.f1080W = bundle.getInt("android:theme", 0);
            this.f1081X = bundle.getBoolean("android:cancelable", true);
            this.f1082Y = bundle.getBoolean("android:showsDialog", this.f1082Y);
            this.f1083Z = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // Y.AbstractComponentCallbacksC0049q
    public final void u() {
        this.f1103C = true;
        Dialog dialog = this.f1086c0;
        if (dialog != null) {
            this.f1087d0 = true;
            dialog.setOnDismissListener(null);
            this.f1086c0.dismiss();
            if (!this.f1088e0) {
                onDismiss(this.f1086c0);
            }
            this.f1086c0 = null;
            this.f1089f0 = false;
        }
    }

    @Override // Y.AbstractComponentCallbacksC0049q
    public final void v() {
        this.f1103C = true;
        if (!this.f1088e0) {
            this.f1088e0 = true;
        }
        androidx.lifecycle.y yVar = this.f1114O;
        yVar.getClass();
        androidx.lifecycle.y.a("removeObserver");
        androidx.lifecycle.x xVar = (androidx.lifecycle.x) yVar.f1543b.b(this.f1085b0);
        if (xVar == null) {
            return;
        }
        xVar.a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x0050, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0068), top: B:9:0x001a }] */
    @Override // Y.AbstractComponentCallbacksC0049q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater w(Bundle bundle) {
        Context h;
        LayoutInflater w2 = super.w(bundle);
        boolean z2 = this.f1082Y;
        if (!z2 || this.f1084a0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f1082Y) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return w2;
        }
        if (z2 && !this.f1089f0) {
            try {
                this.f1084a0 = true;
                Dialog G2 = G();
                this.f1086c0 = G2;
                if (this.f1082Y) {
                    int i = this.f1079V;
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            Window window = G2.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                        } else {
                            h = h();
                            if (h instanceof Activity) {
                                this.f1086c0.setOwnerActivity((Activity) h);
                            }
                            this.f1086c0.setCancelable(this.f1081X);
                            this.f1086c0.setOnCancelListener(this.f1077T);
                            this.f1086c0.setOnDismissListener(this.f1078U);
                            this.f1089f0 = true;
                        }
                    }
                    G2.requestWindowFeature(1);
                    h = h();
                    if (h instanceof Activity) {
                    }
                    this.f1086c0.setCancelable(this.f1081X);
                    this.f1086c0.setOnCancelListener(this.f1077T);
                    this.f1086c0.setOnDismissListener(this.f1078U);
                    this.f1089f0 = true;
                } else {
                    this.f1086c0 = null;
                }
                this.f1084a0 = false;
            } catch (Throwable th) {
                this.f1084a0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f1086c0;
        return dialog != null ? w2.cloneInContext(dialog.getContext()) : w2;
    }

    @Override // Y.AbstractComponentCallbacksC0049q
    public void x(Bundle bundle) {
        Dialog dialog = this.f1086c0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f1079V;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f1080W;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z2 = this.f1081X;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f1082Y;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i3 = this.f1083Z;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // Y.AbstractComponentCallbacksC0049q
    public void y() {
        this.f1103C = true;
        Dialog dialog = this.f1086c0;
        if (dialog != null) {
            this.f1087d0 = false;
            dialog.show();
            View decorView = this.f1086c0.getWindow().getDecorView();
            androidx.lifecycle.J.g(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            h0.f.m(decorView, this);
        }
    }

    @Override // Y.AbstractComponentCallbacksC0049q
    public void z() {
        this.f1103C = true;
        Dialog dialog = this.f1086c0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
