package o;

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
import com.devanos.nilufar.usmonova.R;

/* renamed from: o.vi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC2107vi extends AbstractComponentCallbacksC0069Co implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public final DialogInterfaceOnCancelListenerC1909si Z;
    public final DialogInterfaceOnDismissListenerC1975ti a0;
    public int b0;
    public int c0;
    public boolean d0;
    public boolean e0;
    public int f0;
    public boolean g0;
    public final Y1 h0;
    public Dialog i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;

    public DialogInterfaceOnCancelListenerC2107vi() {
        new R2(2, this);
        this.Z = new DialogInterfaceOnCancelListenerC1909si(this);
        this.a0 = new DialogInterfaceOnDismissListenerC1975ti(this);
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = true;
        this.e0 = true;
        this.f0 = -1;
        this.h0 = new Y1(23, this);
        this.m0 = false;
    }

    @Override // o.AbstractComponentCallbacksC0069Co
    public final AbstractC1305jX a() {
        return new C2041ui(this, new C2041ui(this));
    }

    @Override // o.AbstractComponentCallbacksC0069Co
    public final void j() {
        this.K = true;
    }

    @Override // o.AbstractComponentCallbacksC0069Co
    public final void l(Context context) {
        Object obj;
        super.l(context);
        BD bd = this.U;
        bd.getClass();
        BD.a("observeForever");
        Y1 y1 = this.h0;
        C2337zA c2337zA = new C2337zA(bd, y1);
        C2088vP c2088vP = bd.b;
        C1890sP j = c2088vP.j(y1);
        if (j != null) {
            obj = j.i;
        } else {
            C1890sP c1890sP = new C1890sP(y1, c2337zA);
            c2088vP.k++;
            C1890sP c1890sP2 = c2088vP.i;
            if (c1890sP2 == null) {
                c2088vP.h = c1890sP;
                c2088vP.i = c1890sP;
            } else {
                c1890sP2.j = c1890sP;
                c1890sP.k = c1890sP2;
                c2088vP.i = c1890sP;
            }
            obj = null;
        }
        if (((C2337zA) obj) == null) {
            c2337zA.a(true);
        }
        if (this.l0) {
            return;
        }
        this.k0 = false;
    }

    @Override // o.AbstractComponentCallbacksC0069Co
    public final void m(Bundle bundle) {
        Bundle bundle2;
        this.K = true;
        Bundle bundle3 = this.i;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.B.U(bundle2);
            C0614Xo c0614Xo = this.B;
            c0614Xo.G = false;
            c0614Xo.H = false;
            c0614Xo.N.g = false;
            c0614Xo.u(1);
        }
        C0614Xo c0614Xo2 = this.B;
        if (c0614Xo2.u < 1) {
            c0614Xo2.G = false;
            c0614Xo2.H = false;
            c0614Xo2.N.g = false;
            c0614Xo2.u(1);
        }
        new Handler();
        this.e0 = this.E == 0;
        if (bundle != null) {
            this.b0 = bundle.getInt("android:style", 0);
            this.c0 = bundle.getInt("android:theme", 0);
            this.d0 = bundle.getBoolean("android:cancelable", true);
            this.e0 = bundle.getBoolean("android:showsDialog", this.e0);
            this.f0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // o.AbstractComponentCallbacksC0069Co
    public final void n() {
        this.K = true;
        Dialog dialog = this.i0;
        if (dialog != null) {
            this.j0 = true;
            dialog.setOnDismissListener(null);
            this.i0.dismiss();
            if (!this.k0) {
                onDismiss(this.i0);
            }
            this.i0 = null;
            this.m0 = false;
        }
    }

    @Override // o.AbstractComponentCallbacksC0069Co
    public final void o() {
        this.K = true;
        if (!this.l0 && !this.k0) {
            this.k0 = true;
        }
        BD bd = this.U;
        bd.getClass();
        BD.a("removeObserver");
        C2337zA c2337zA = (C2337zA) bd.b.k(this.h0);
        if (c2337zA == null) {
            return;
        }
        c2337zA.a(false);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.j0) {
            return;
        }
        if (AbstractC0588Wo.J(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.k0) {
            return;
        }
        this.k0 = true;
        this.l0 = false;
        Dialog dialog = this.i0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.i0.dismiss();
        }
        this.j0 = true;
        if (this.f0 >= 0) {
            AbstractC0588Wo e = e();
            int i = this.f0;
            if (i < 0) {
                throw new IllegalArgumentException(AbstractC2188wx.g(i, "Bad id: "));
            }
            e.y(new C0536Uo(e, i), true);
            this.f0 = -1;
            return;
        }
        Q7 q7 = new Q7(e());
        q7.f88o = true;
        AbstractC0588Wo abstractC0588Wo = this.z;
        if (abstractC0588Wo == null || abstractC0588Wo == q7.p) {
            q7.b(new C1258ip(3, this));
            q7.d(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0027, B:18:0x003f, B:22:0x0048, B:23:0x0050, B:25:0x0044, B:26:0x0031, B:28:0x0037, B:29:0x003c, B:30:0x0068), top: B:9:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0027, B:18:0x003f, B:22:0x0048, B:23:0x0050, B:25:0x0044, B:26:0x0031, B:28:0x0037, B:29:0x003c, B:30:0x0068), top: B:9:0x001a }] */
    @Override // o.AbstractComponentCallbacksC0069Co
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater p(Bundle bundle) {
        C0173Go c0173Go;
        LayoutInflater p = super.p(bundle);
        boolean z = this.e0;
        if (z && !this.g0) {
            if (z && !this.m0) {
                try {
                    this.g0 = true;
                    Dialog w = w();
                    this.i0 = w;
                    J4 j4 = null;
                    if (this.e0) {
                        int i = this.b0;
                        if (i != 1 && i != 2) {
                            if (i == 3) {
                                Window window = w.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            } else {
                                c0173Go = this.A;
                                if (c0173Go == null) {
                                    j4 = c0173Go.s;
                                }
                                if (j4 != null) {
                                    this.i0.setOwnerActivity(j4);
                                }
                                this.i0.setCancelable(this.d0);
                                this.i0.setOnCancelListener(this.Z);
                                this.i0.setOnDismissListener(this.a0);
                                this.m0 = true;
                            }
                        }
                        w.requestWindowFeature(1);
                        c0173Go = this.A;
                        if (c0173Go == null) {
                        }
                        if (j4 != null) {
                        }
                        this.i0.setCancelable(this.d0);
                        this.i0.setOnCancelListener(this.Z);
                        this.i0.setOnDismissListener(this.a0);
                        this.m0 = true;
                    } else {
                        this.i0 = null;
                    }
                    this.g0 = false;
                } catch (Throwable th) {
                    this.g0 = false;
                    throw th;
                }
            }
            if (AbstractC0588Wo.J(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.i0;
            if (dialog != null) {
                return p.cloneInContext(dialog.getContext());
            }
        } else if (AbstractC0588Wo.J(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.e0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return p;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return p;
    }

    @Override // o.AbstractComponentCallbacksC0069Co
    public final void q(Bundle bundle) {
        Dialog dialog = this.i0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.b0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.c0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.d0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.e0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // o.AbstractComponentCallbacksC0069Co
    public final void r() {
        this.K = true;
        Dialog dialog = this.i0;
        if (dialog != null) {
            this.j0 = false;
            dialog.show();
            View decorView = this.i0.getWindow().getDecorView();
            ON.q(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            AbstractC1494mO.k(decorView, this);
        }
    }

    @Override // o.AbstractComponentCallbacksC0069Co
    public final void s() {
        this.K = true;
        Dialog dialog = this.i0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // o.AbstractComponentCallbacksC0069Co
    public final void t(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.t(layoutInflater, viewGroup, bundle);
        if (this.i0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.i0.onRestoreInstanceState(bundle2);
    }

    public Dialog w() {
        if (AbstractC0588Wo.J(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC0498Tc(u(), this.c0);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
