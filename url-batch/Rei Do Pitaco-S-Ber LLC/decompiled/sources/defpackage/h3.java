package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class h3 {
    public Parcelable a;
    public Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Object f;

    public /* synthetic */ h3(TextView textView) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.c || this.d) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.c) {
                    mutate.setTintList((ColorStateList) this.a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        g3 g3Var = (g3) this.f;
        Drawable checkMarkDrawable = g3Var.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.c || this.d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.c) {
                    mutate.setTintList((ColorStateList) this.a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(g3Var.getDrawableState());
                }
                g3Var.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.d) {
            l8.u("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
            return null;
        }
        Bundle bundle = (Bundle) this.a;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.a;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.a;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.a = null;
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0024, B:5:0x002a, B:8:0x0030, B:9:0x0056, B:11:0x005d, B:12:0x0064, B:14:0x006b, B:21:0x003f, B:23:0x0045, B:25:0x004b), top: B:2:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0024, B:5:0x002a, B:8:0x0030, B:9:0x0056, B:11:0x005d, B:12:0x0064, B:14:0x006b, B:21:0x003f, B:23:0x0045, B:25:0x004b), top: B:2:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f;
        Context context = compoundButton.getContext();
        int[] iArr = kx.m;
        y5 l = y5.l(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) l.a;
        f80.l(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) l.a, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(vv.t(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(l.e(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(vf.b(typedArray.getInt(3, -1), null));
                }
                l.n();
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(vv.t(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            l.n();
        } catch (Throwable th) {
            l.n();
            throw th;
        }
    }

    public void e(String str, v00 v00Var) {
        Object obj;
        v00Var.getClass();
        q00 q00Var = (q00) this.f;
        n00 a = q00Var.a(str);
        if (a != null) {
            obj = a.g;
        } else {
            n00 n00Var = new n00(str, v00Var);
            q00Var.i++;
            n00 n00Var2 = q00Var.g;
            if (n00Var2 == null) {
                q00Var.f = n00Var;
                q00Var.g = n00Var;
            } else {
                n00Var2.h = n00Var;
                n00Var.i = n00Var2;
                q00Var.g = n00Var;
            }
            obj = null;
        }
        if (((v00) obj) == null) {
            return;
        }
        l8.l("SavedStateProvider with the given key is already registered");
    }

    public void f() {
        if (!this.e) {
            l8.u("Can not perform this action after onSaveInstanceState");
            return;
        }
        z2 z2Var = (z2) this.b;
        if (z2Var == null) {
            z2Var = new z2(this);
        }
        this.b = z2Var;
        try {
            cp.class.getDeclaredConstructor(null);
            z2 z2Var2 = (z2) this.b;
            if (z2Var2 != null) {
                ((LinkedHashSet) z2Var2.b).add(cp.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + cp.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public h3() {
        this.f = new q00();
        this.e = true;
    }
}
