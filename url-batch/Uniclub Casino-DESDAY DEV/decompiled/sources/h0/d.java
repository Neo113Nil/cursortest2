package h0;

import K.C0011l;
import K.S;
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
import androidx.lifecycle.C0065i;
import g.C0136g;
import java.util.LinkedHashSet;
import l.AbstractC0239n0;
import l.C0250t;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2376a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2377b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2378c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable f2379e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2380f;

    public /* synthetic */ d(TextView textView) {
        this.f2379e = null;
        this.f2380f = null;
        this.f2376a = false;
        this.f2377b = false;
        this.d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.d;
        Drawable a2 = Q.c.a(compoundButton);
        if (a2 != null) {
            if (this.f2376a || this.f2377b) {
                Drawable mutate = a2.mutate();
                if (this.f2376a) {
                    D.a.h(mutate, (ColorStateList) this.f2379e);
                }
                if (this.f2377b) {
                    D.a.i(mutate, (PorterDuff.Mode) this.f2380f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        C0250t c0250t = (C0250t) this.d;
        Drawable checkMarkDrawable = c0250t.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f2376a || this.f2377b) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f2376a) {
                    D.a.h(mutate, (ColorStateList) this.f2379e);
                }
                if (this.f2377b) {
                    D.a.i(mutate, (PorterDuff.Mode) this.f2380f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c0250t.getDrawableState());
                }
                c0250t.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.f2377b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f2379e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f2379e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f2379e;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f2379e = null;
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
        int[] iArr = f.a.f1937m;
        C0011l r2 = C0011l.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) r2.f414c;
        S.k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) r2.f414c, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(q1.d.u(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    Q.b.c(compoundButton, r2.g(2));
                }
                if (typedArray.hasValue(3)) {
                    Q.b.d(compoundButton, AbstractC0239n0.b(typedArray.getInt(3, -1), null));
                }
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(q1.d.u(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
        } finally {
            r2.t();
        }
    }

    public void e(String str, c cVar) {
        Object obj;
        X0.d.e(cVar, "provider");
        n.f fVar = (n.f) this.d;
        n.c a2 = fVar.a(str);
        if (a2 != null) {
            obj = a2.f3278b;
        } else {
            n.c cVar2 = new n.c(str, cVar);
            fVar.d++;
            n.c cVar3 = fVar.f3284b;
            if (cVar3 == null) {
                fVar.f3283a = cVar2;
                fVar.f3284b = cVar2;
            } else {
                cVar3.f3279c = cVar2;
                cVar2.d = cVar3;
                fVar.f3284b = cVar2;
            }
            obj = null;
        }
        if (((c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void f() {
        if (!this.f2378c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0136g c0136g = (C0136g) this.f2380f;
        if (c0136g == null) {
            c0136g = new C0136g(this);
        }
        this.f2380f = c0136g;
        try {
            C0065i.class.getDeclaredConstructor(null);
            C0136g c0136g2 = (C0136g) this.f2380f;
            if (c0136g2 != null) {
                ((LinkedHashSet) c0136g2.f2325b).add(C0065i.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + C0065i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }

    public d() {
        this.d = new n.f();
        this.f2378c = true;
    }
}
