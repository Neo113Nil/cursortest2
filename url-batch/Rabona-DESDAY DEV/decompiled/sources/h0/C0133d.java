package h0;

import K.C0012l;
import K.T;
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
import androidx.lifecycle.C0066i;
import g.C0124g;
import java.util.LinkedHashSet;
import l.AbstractC0250n0;
import l.C0261t;
import q1.l;

/* renamed from: h0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2373a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2374b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2375c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable f2376e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2377f;

    public /* synthetic */ C0133d(TextView textView) {
        this.f2376e = null;
        this.f2377f = null;
        this.f2373a = false;
        this.f2374b = false;
        this.d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.d;
        Drawable a2 = Q.c.a(compoundButton);
        if (a2 != null) {
            if (this.f2373a || this.f2374b) {
                Drawable mutate = a2.mutate();
                if (this.f2373a) {
                    D.a.h(mutate, (ColorStateList) this.f2376e);
                }
                if (this.f2374b) {
                    D.a.i(mutate, (PorterDuff.Mode) this.f2377f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        C0261t c0261t = (C0261t) this.d;
        Drawable checkMarkDrawable = c0261t.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f2373a || this.f2374b) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f2373a) {
                    D.a.h(mutate, (ColorStateList) this.f2376e);
                }
                if (this.f2374b) {
                    D.a.i(mutate, (PorterDuff.Mode) this.f2377f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c0261t.getDrawableState());
                }
                c0261t.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.f2374b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f2376e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f2376e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f2376e;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f2376e = null;
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
        int[] iArr = f.a.f1935m;
        C0012l r2 = C0012l.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) r2.f432c;
        T.k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) r2.f432c, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(l.v(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    Q.b.c(compoundButton, r2.g(2));
                }
                if (typedArray.hasValue(3)) {
                    Q.b.d(compoundButton, AbstractC0250n0.b(typedArray.getInt(3, -1), null));
                }
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(l.v(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
        } finally {
            r2.t();
        }
    }

    public void e(String str, InterfaceC0132c interfaceC0132c) {
        Object obj;
        X0.d.e(interfaceC0132c, "provider");
        n.f fVar = (n.f) this.d;
        n.c a2 = fVar.a(str);
        if (a2 != null) {
            obj = a2.f3275b;
        } else {
            n.c cVar = new n.c(str, interfaceC0132c);
            fVar.d++;
            n.c cVar2 = fVar.f3281b;
            if (cVar2 == null) {
                fVar.f3280a = cVar;
                fVar.f3281b = cVar;
            } else {
                cVar2.f3276c = cVar;
                cVar.d = cVar2;
                fVar.f3281b = cVar;
            }
            obj = null;
        }
        if (((InterfaceC0132c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void f() {
        if (!this.f2375c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0124g c0124g = (C0124g) this.f2377f;
        if (c0124g == null) {
            c0124g = new C0124g(this);
        }
        this.f2377f = c0124g;
        try {
            C0066i.class.getDeclaredConstructor(null);
            C0124g c0124g2 = (C0124g) this.f2377f;
            if (c0124g2 != null) {
                ((LinkedHashSet) c0124g2.f2322b).add(C0066i.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + C0066i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }

    public C0133d() {
        this.d = new n.f();
        this.f2375c = true;
    }
}
