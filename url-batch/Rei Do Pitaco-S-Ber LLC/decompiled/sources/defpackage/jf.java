package defpackage;

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
import androidx.lifecycle.b;
import com.ionia.reidopitaco.libya.R;
import java.io.PrintWriter;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class jf extends dk implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public final ff Y;
    public final gf Z;
    public int a0;
    public int b0;
    public boolean c0;
    public boolean d0;
    public int e0;
    public boolean f0;
    public final j0 g0;
    public Dialog h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;

    public jf() {
        new u6(3, this);
        this.Y = new ff(this);
        this.Z = new gf(this);
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = true;
        this.d0 = true;
        this.e0 = -1;
        this.g0 = new j0(14, this);
        this.k0 = false;
    }

    @Override // defpackage.dk
    public final void A(Bundle bundle) {
        Bundle bundle2;
        this.H = true;
        if (this.h0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.h0.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.dk
    public final void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.B(layoutInflater, viewGroup, bundle);
        if (this.J != null || this.h0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.h0.onRestoreInstanceState(bundle2);
    }

    public Dialog G() {
        if (sk.G(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new rb(C(), this.b0);
    }

    @Override // defpackage.dk
    public final m60 b() {
        return new hf(this, new ak(this));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.i0) {
            return;
        }
        if (sk.G(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.j0) {
            return;
        }
        this.j0 = true;
        Dialog dialog = this.h0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.h0.dismiss();
        }
        this.i0 = true;
        if (this.e0 >= 0) {
            sk j = j();
            int i = this.e0;
            if (i < 0) {
                l8.l(n20.e("Bad id: ", i));
                return;
            } else {
                j.w(new rk(j, i), true);
                this.e0 = -1;
                return;
            }
        }
        w6 w6Var = new w6(j());
        w6Var.o = true;
        sk skVar = this.w;
        sk skVar2 = w6Var.p;
        if (skVar != null && skVar != skVar2) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        w6Var.b(new al(3, this));
        if (w6Var.q) {
            l8.u("commit already called");
            return;
        }
        if (sk.G(2)) {
            Log.v("FragmentManager", "Commit: " + w6Var);
            PrintWriter printWriter = new PrintWriter(new qq());
            w6Var.d("  ", printWriter, true);
            printWriter.close();
        }
        w6Var.q = true;
        if (w6Var.g) {
            w6Var.r = skVar2.i.getAndIncrement();
        } else {
            w6Var.r = -1;
        }
        skVar2.w(w6Var, true);
    }

    @Override // defpackage.dk
    public final void p() {
        this.H = true;
    }

    @Override // defpackage.dk
    public final void r(Context context) {
        super.r(context);
        this.T.d(this.g0);
        this.j0 = false;
    }

    @Override // defpackage.dk
    public void s(Bundle bundle) {
        super.s(bundle);
        new Handler();
        this.d0 = this.B == 0;
        if (bundle != null) {
            this.a0 = bundle.getInt("android:style", 0);
            this.b0 = bundle.getInt("android:theme", 0);
            this.c0 = bundle.getBoolean("android:cancelable", true);
            this.d0 = bundle.getBoolean("android:showsDialog", this.d0);
            this.e0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.dk
    public final void u() {
        this.H = true;
        Dialog dialog = this.h0;
        if (dialog != null) {
            this.i0 = true;
            dialog.setOnDismissListener(null);
            this.h0.dismiss();
            if (!this.j0) {
                onDismiss(this.h0);
            }
            this.h0 = null;
            this.k0 = false;
        }
    }

    @Override // defpackage.dk
    public final void v() {
        this.H = true;
        if (!this.j0) {
            this.j0 = true;
        }
        b bVar = this.T;
        bVar.getClass();
        b.a("removeObserver");
        mq mqVar = (mq) bVar.b.b(this.g0);
        if (mqVar == null) {
            return;
        }
        mqVar.d();
        mqVar.c(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0044, B:21:0x004e, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0066), top: B:9:0x001a }] */
    @Override // defpackage.dk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater w(Bundle bundle) {
        Context h;
        LayoutInflater w = super.w(bundle);
        boolean z = this.d0;
        if (z && !this.f0) {
            if (z && !this.k0) {
                try {
                    this.f0 = true;
                    Dialog G = G();
                    this.h0 = G;
                    if (this.d0) {
                        int i = this.a0;
                        if (i != 1 && i != 2) {
                            if (i == 3) {
                                Window window = G.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            } else {
                                h = h();
                                if (h != null) {
                                    this.h0.setOwnerActivity((Activity) h);
                                }
                                this.h0.setCancelable(this.c0);
                                this.h0.setOnCancelListener(this.Y);
                                this.h0.setOnDismissListener(this.Z);
                                this.k0 = true;
                            }
                        }
                        G.requestWindowFeature(1);
                        h = h();
                        if (h != null) {
                        }
                        this.h0.setCancelable(this.c0);
                        this.h0.setOnCancelListener(this.Y);
                        this.h0.setOnDismissListener(this.Z);
                        this.k0 = true;
                    } else {
                        this.h0 = null;
                    }
                    this.f0 = false;
                } catch (Throwable th) {
                    this.f0 = false;
                    throw th;
                }
            }
            if (sk.G(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.h0;
            if (dialog != null) {
                return w.cloneInContext(dialog.getContext());
            }
        } else if (sk.G(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.d0) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return w;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return w;
    }

    @Override // defpackage.dk
    public void x(Bundle bundle) {
        Dialog dialog = this.h0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.a0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.b0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.c0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.d0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.e0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.dk
    public void y() {
        this.H = true;
        Dialog dialog = this.h0;
        if (dialog != null) {
            this.i0 = false;
            dialog.show();
            View decorView = this.h0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // defpackage.dk
    public void z() {
        this.H = true;
        Dialog dialog = this.h0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
