package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class hu implements jt {
    public x7 f;
    public boolean g;
    public int h;

    @Override // defpackage.jt
    public final boolean c(vs vsVar) {
        return false;
    }

    @Override // defpackage.jt
    public final void e(Parcelable parcelable) {
        if (parcelable instanceof gu) {
            x7 x7Var = this.f;
            gu guVar = (gu) parcelable;
            int i = guVar.f;
            int size = x7Var.R.b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem a = x7Var.R.a(i2);
                if (i == a.getItemId()) {
                    x7Var.m = i;
                    x7Var.n = i2;
                    x7Var.setCheckedItem(a);
                    break;
                }
                i2++;
            }
            Context context = this.f.getContext();
            cw cwVar = guVar.g;
            SparseArray sparseArray = new SparseArray(cwVar.size());
            for (int i3 = 0; i3 < cwVar.size(); i3++) {
                int keyAt = cwVar.keyAt(i3);
                a7 a7Var = (a7) cwVar.valueAt(i3);
                sparseArray.put(keyAt, a7Var != null ? new z6(context, a7Var) : null);
            }
            x7 x7Var2 = this.f;
            SparseArray sparseArray2 = x7Var2.A;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                int keyAt2 = sparseArray.keyAt(i4);
                if (sparseArray2.indexOfKey(keyAt2) < 0) {
                    sparseArray2.append(keyAt2, (z6) sparseArray.get(keyAt2));
                }
            }
            eu[] euVarArr = x7Var2.l;
            if (euVarArr != null) {
                for (eu euVar : euVarArr) {
                    if (euVar instanceof bu) {
                        bu buVar = (bu) euVar;
                        z6 z6Var = (z6) sparseArray2.get(buVar.getId());
                        if (z6Var != null) {
                            buVar.setBadge(z6Var);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.jt
    public final boolean g(vs vsVar) {
        return false;
    }

    @Override // defpackage.jt
    public final int getId() {
        return this.h;
    }

    @Override // defpackage.jt
    public final void i(Context context, ss ssVar) {
        this.f.b(ssVar);
    }

    @Override // defpackage.jt
    public final void j(boolean z) {
        du duVar;
        int i;
        v6 v6Var;
        if (this.g) {
            return;
        }
        x7 x7Var = this.f;
        if (z) {
            x7Var.a();
            return;
        }
        du duVar2 = x7Var.R;
        if (duVar2 == null || x7Var.l == null) {
            return;
        }
        x7Var.Q.g = true;
        duVar2.b();
        x7Var.Q.g = false;
        if (x7Var.l != null && (duVar = x7Var.R) != null && duVar.b.size() == x7Var.l.length) {
            for (0; i < x7Var.l.length; i + 1) {
                if (!(x7Var.R.a(i) instanceof sf) || (x7Var.l[i] instanceof yt)) {
                    i = ((x7Var.R.a(i) instanceof sf) || !((x7Var.R.a(i).hasSubMenu() && !(x7Var.l[i] instanceof iu)) || ((x7Var.R.a(i).hasSubMenu() || (x7Var.l[i] instanceof bu)) ? false : true))) ? i + 1 : 0;
                }
            }
            int i2 = x7Var.m;
            int size = x7Var.R.b.size();
            for (int i3 = 0; i3 < size; i3++) {
                MenuItem a = x7Var.R.a(i3);
                if (a.isChecked()) {
                    x7Var.setCheckedItem(a);
                    x7Var.m = a.getItemId();
                    x7Var.n = i3;
                }
            }
            if (i2 != x7Var.m && (v6Var = x7Var.f) != null) {
                d60.a(x7Var, v6Var);
            }
            int i4 = x7Var.j;
            boolean z2 = i4 != -1 ? i4 == 0 : x7Var.getCurrentVisibleContentItemCount() > 3;
            for (int i5 = 0; i5 < size; i5++) {
                x7Var.Q.g = true;
                x7Var.l[i5].setExpanded(x7Var.W);
                eu euVar = x7Var.l[i5];
                if (euVar instanceof bu) {
                    bu buVar = (bu) euVar;
                    buVar.setLabelVisibilityMode(x7Var.j);
                    buVar.setItemIconGravity(x7Var.k);
                    buVar.setItemGravity(x7Var.M);
                    buVar.setShifting(z2);
                }
                if (x7Var.R.a(i5) instanceof vs) {
                    x7Var.l[i5].c((vs) x7Var.R.a(i5));
                }
                x7Var.Q.g = false;
            }
            return;
        }
        x7Var.a();
    }

    @Override // defpackage.jt
    public final boolean k(v30 v30Var) {
        return false;
    }

    @Override // defpackage.jt
    public final boolean l() {
        return false;
    }

    @Override // defpackage.jt
    public final Parcelable m() {
        gu guVar = new gu();
        guVar.f = this.f.getSelectedItemId();
        SparseArray<z6> badgeDrawables = this.f.getBadgeDrawables();
        cw cwVar = new cw();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int keyAt = badgeDrawables.keyAt(i);
            z6 valueAt = badgeDrawables.valueAt(i);
            cwVar.put(keyAt, valueAt != null ? valueAt.j.a : null);
        }
        guVar.g = cwVar;
        return guVar;
    }

    @Override // defpackage.jt
    public final void a(ss ssVar, boolean z) {
    }
}
