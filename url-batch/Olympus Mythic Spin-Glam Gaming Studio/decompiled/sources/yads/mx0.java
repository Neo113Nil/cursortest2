package yads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.ironsource.O6;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;

/* loaded from: classes11.dex */
public abstract class mx0 extends i01 implements e1 {
    public final c1 d;
    public final v3 e;
    public final xw0 f;
    public final a5 g;
    public final i5 h;
    public final y43 i;
    public final b8 j;
    public final a1 k;
    public ex0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx0(Context context, t8 t8Var, v3 v3Var, yu2 yu2Var, xw0 xw0Var, a5 a5Var) {
        super(context, t8Var);
        i5 i5Var = new i5();
        if (y43.b == null) {
            synchronized (y43.c) {
                try {
                    if (y43.b == null) {
                        y43.b = new y43();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        y43 y43Var = y43.b;
        if (y43Var == null) {
            throw new IllegalStateException("Required value was null.");
        }
        x12 x12Var = new x12(v3Var);
        x12Var.d = t8Var;
        nt3 nt3Var = (nt3) yu2Var;
        Context context2 = nt3Var.a;
        b8 b8Var = new b8(context, t8Var, v3Var, i5Var, x12Var, pr.a(context2, context2));
        Context context3 = nt3Var.a;
        a1 a1Var = new a1(pr.a(context3, context3), v3Var, t8Var);
        this.d = new c1(context, v3Var, yu2Var, t8Var, this, null);
        this.e = v3Var;
        this.f = xw0Var;
        this.g = a5Var;
        this.h = i5Var;
        this.i = y43Var;
        this.j = b8Var;
        this.k = a1Var;
        h2.b.a().a("window_type_fullscreen", new b2(yu2Var));
    }

    public final Object a(Activity activity) {
        Result.Companion companion = Result.INSTANCE;
        Result.m8023constructorimpl(ResultKt.createFailure(n6.b));
        synchronized (this) {
        }
        i5 i5Var = this.h;
        h5 h5Var = h5.f;
        i5Var.a(h5Var, null);
        y43 y43Var = this.i;
        cd1 cd1Var = cd1.c;
        y43Var.b(cd1Var, this);
        Object a = this.f.a(e(), activity);
        if (Result.m8026exceptionOrNullimpl(a) != null) {
            this.h.a(h5Var);
            if (!oa.a(this)) {
                this.i.a(cd1Var, this);
                this.f.a(this.a);
                super.c();
            }
        }
        return a;
    }

    public final void b(int i, Bundle bundle) {
        boolean z = ob1.a;
        switch (i) {
            case 6:
                f();
                this.d.e();
                break;
            case 7:
                f();
                this.d.c();
                break;
            case 8:
                this.d.d();
                break;
            case 9:
                this.d.a();
                break;
        }
    }

    public final zz d() {
        a5 a5Var = this.g;
        t8 t8Var = this.b;
        v3 v3Var = this.e;
        String adInfo = this.f.getAdInfo();
        String a = this.f.a();
        List b = this.f.b();
        a5Var.getClass();
        String str = t8Var.e;
        if (str == null && (str = v3Var.c.a) == null) {
            str = "";
        }
        return new zz(str, adInfo, a, b);
    }

    public abstract mx0 e();

    public final void f() {
        ex0 ex0Var = this.l;
        if (ex0Var != null) {
            ex0Var.onAdClicked();
        }
    }

    @Override // yads.e1
    public final void onReturnedToApplication() {
    }

    public void a(int i, Bundle bundle) {
        getClass().toString();
        boolean z = ob1.a;
        if (i == 0) {
            this.h.a(h5.f);
            b8 b8Var = this.j;
            io2 a = b8Var.c.a();
            a.b(do2.a, O6.G1);
            a.a.putAll(b8Var.e.a());
            l03 l03Var = b8Var.b.d.a;
            if (l03Var != null) {
                a.b(l03Var.b().b, "size_type");
                a.b(Integer.valueOf(l03Var.getWidth()), "width");
                a.b(Integer.valueOf(l03Var.getHeight()), "height");
            }
            bu2 bu2Var = b8Var.f;
            if (bu2Var != null) {
                a.b(bu2Var.R, "banner_size_calculation_type");
            }
            c cVar = b8Var.a.i;
            a.b = cVar;
            fo2 fo2Var = fo2.c;
            b8Var.d.a(new ho2("ad_rendering_result", MapsKt.toMutableMap(a.a), cVar));
            ex0 ex0Var = this.l;
            if (ex0Var != null) {
                ex0Var.onAdShown();
                return;
            }
            return;
        }
        if (i == 16) {
            if (bundle != null) {
                Parcelable parcelable = bundle.getParcelable("impression_data_key");
                a(parcelable instanceof y4 ? (y4) parcelable : null);
                return;
            } else {
                a((y4) null);
                return;
            }
        }
        if (i == 17) {
            ex0 ex0Var2 = this.l;
            if (ex0Var2 != null) {
                ex0Var2.onAdClicked();
                return;
            }
            return;
        }
        if (i == 2) {
            this.k.b();
            return;
        }
        if (i == 3) {
            this.k.a();
            return;
        }
        if (i != 4) {
            if (i != 5) {
                b(i, bundle);
            }
        } else {
            this.i.a(cd1.c, this);
            ex0 ex0Var3 = this.l;
            if (ex0Var3 != null) {
                ex0Var3.onAdDismissed();
            }
        }
    }

    public final void a(y4 y4Var) {
        ex0 ex0Var = this.l;
        if (ex0Var != null) {
            ex0Var.a(y4Var);
        }
    }
}
