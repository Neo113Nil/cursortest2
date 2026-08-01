package i0;

import K.C0019l;
import K.T;
import a1.AbstractC0067d;
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
import androidx.lifecycle.C0076i;
import g.C0127g;
import java.util.LinkedHashSet;
import l.AbstractC0266n0;
import l.C0277t;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3031a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3032b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3033c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable f3034e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3035f;

    public /* synthetic */ d(TextView textView) {
        this.f3034e = null;
        this.f3035f = null;
        this.f3031a = false;
        this.f3032b = false;
        this.d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.d;
        Drawable a2 = Q.c.a(compoundButton);
        if (a2 != null) {
            if (this.f3031a || this.f3032b) {
                Drawable mutate = a2.mutate();
                if (this.f3031a) {
                    D.a.h(mutate, (ColorStateList) this.f3034e);
                }
                if (this.f3032b) {
                    D.a.i(mutate, (PorterDuff.Mode) this.f3035f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        C0277t c0277t = (C0277t) this.d;
        Drawable checkMarkDrawable = c0277t.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f3031a || this.f3032b) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f3031a) {
                    D.a.h(mutate, (ColorStateList) this.f3034e);
                }
                if (this.f3032b) {
                    D.a.i(mutate, (PorterDuff.Mode) this.f3035f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c0277t.getDrawableState());
                }
                c0277t.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.f3032b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f3034e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f3034e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f3034e;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f3034e = null;
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.d;
        Context context = compoundButton.getContext();
        int[] iArr = f.a.f2568m;
        C0019l i2 = C0019l.i(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) i2.f684b;
        T.k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) i2.f684b, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC0067d.k(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    Q.b.c(compoundButton, i2.b(2));
                }
                if (typedArray.hasValue(3)) {
                    Q.b.d(compoundButton, AbstractC0266n0.b(typedArray.getInt(3, -1), null));
                }
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC0067d.k(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
        } finally {
            i2.k();
        }
    }

    public void e(String str, c cVar) {
        Object obj;
        i1.f.e(cVar, "provider");
        n.f fVar = (n.f) this.d;
        n.c a2 = fVar.a(str);
        if (a2 != null) {
            obj = a2.f3568b;
        } else {
            n.c cVar2 = new n.c(str, cVar);
            fVar.d++;
            n.c cVar3 = fVar.f3574b;
            if (cVar3 == null) {
                fVar.f3573a = cVar2;
                fVar.f3574b = cVar2;
            } else {
                cVar3.f3569c = cVar2;
                cVar2.d = cVar3;
                fVar.f3574b = cVar2;
            }
            obj = null;
        }
        if (((c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void f() {
        if (!this.f3033c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0127g c0127g = (C0127g) this.f3035f;
        if (c0127g == null) {
            c0127g = new C0127g(this);
        }
        this.f3035f = c0127g;
        try {
            C0076i.class.getDeclaredConstructor(null);
            C0127g c0127g2 = (C0127g) this.f3035f;
            if (c0127g2 != null) {
                ((LinkedHashSet) c0127g2.f2672b).add(C0076i.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + C0076i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }

    public d() {
        this.d = new n.f();
        this.f3033c = true;
    }
}
