package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.s5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C5662s5 {
    public final C5611q5 a;
    public final C5636r5 b;

    @NonNull
    protected final Context c;
    public final C5351g5 d;
    public final F4 e;
    public final AbstractC5480l5 f;

    @NonNull
    protected final C5783wm g;
    public final InterfaceC5726uh h;
    public final C5226b9 i;
    public final ICommonExecutor j;
    public final C5229bc k;
    public final M9 l;
    public final int m;

    public C5662s5(Context context, C5351g5 c5351g5, F4 f4, AbstractC5480l5 abstractC5480l5, C5783wm c5783wm, InterfaceC5726uh interfaceC5726uh, ICommonExecutor iCommonExecutor, int i, C5229bc c5229bc, M9 m9) {
        this(context, c5351g5, f4, abstractC5480l5, c5783wm, interfaceC5726uh, iCommonExecutor, new C5226b9(), i, new C5611q5(f4.a), new C5636r5(context, c5351g5), c5229bc, m9);
    }

    public static C5640r9 c(C5532n5 c5532n5) {
        return new C5640r9(c5532n5);
    }

    public final C5355g9 a() {
        Context context = this.c;
        C5351g5 c5351g5 = this.d;
        return new C5355g9(new C5484l9(context, c5351g5), this.m);
    }

    public final C5250c7 b(C5532n5 c5532n5) {
        return new C5250c7(c5532n5, Ka.I.B().c(this.c, this.d), new Z6(c5532n5.b()), new C5768w7());
    }

    public final C5611q5 d() {
        return this.a;
    }

    public final C5636r5 e() {
        return this.b;
    }

    public final Po f() {
        Po po;
        To c5823ya;
        So D = Ka.I.D();
        C5351g5 c5351g5 = this.d;
        synchronized (D) {
            try {
                String valueOf = String.valueOf(c5351g5);
                LinkedHashMap linkedHashMap = D.b;
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    C5621qf c5621qf = new C5621qf(Ka.I.B().b(D.a, c5351g5));
                    IHandlerExecutor e = Ka.I.d.e();
                    if (c5351g5.d()) {
                        String str = "appmetrica_vital_" + c5351g5.b + ".dat";
                        c5823ya = new C5766w5(CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(str, new C5823ya(D.a, str, e, 0L, 8, null)), TuplesKt.to("appmetrica_vital_main.dat", new C5823ya(D.a, "appmetrica_vital_main.dat", e, 0L, 8, null))}));
                    } else {
                        c5823ya = new C5823ya(D.a, "appmetrica_vital_" + c5351g5.b + ".dat", e, 0L, 8, null);
                    }
                    obj = new Po(c5621qf, c5823ya, valueOf);
                    linkedHashMap.put(valueOf, obj);
                }
                po = (Po) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return po;
    }

    public C5662s5(Context context, C5351g5 c5351g5, F4 f4, AbstractC5480l5 abstractC5480l5, C5783wm c5783wm, InterfaceC5726uh interfaceC5726uh, ICommonExecutor iCommonExecutor, C5226b9 c5226b9, int i, C5611q5 c5611q5, C5636r5 c5636r5, C5229bc c5229bc, M9 m9) {
        this.c = context;
        this.d = c5351g5;
        this.e = f4;
        this.f = abstractC5480l5;
        this.g = c5783wm;
        this.h = interfaceC5726uh;
        this.j = iCommonExecutor;
        this.i = c5226b9;
        this.m = i;
        this.a = c5611q5;
        this.b = c5636r5;
        this.k = c5229bc;
        this.l = m9;
    }

    public final C5238bl c() {
        return new C5238bl(this.c, this.d);
    }

    public final Ii d(C5532n5 c5532n5) {
        Ii ii = new Ii(c5532n5, this.f.a(), this.j);
        C5229bc c5229bc = this.k;
        synchronized (c5229bc) {
            c5229bc.c.add(ii);
        }
        return ii;
    }

    public final Zg a(C5532n5 c5532n5) {
        return new Zg(new C5752vh(c5532n5, this.h, new T3()), this.g, new C5674sh(this.e));
    }

    public static C5470kl a(C5532n5 c5532n5, Po po, C5506m5 c5506m5) {
        C5444jl c5444jl = new C5444jl(po);
        return new C5470kl(c5532n5, c5506m5, new Ea(c5532n5, c5444jl, new C5574ol(c5532n5.h(), "foreground"), AbstractC5840z1.a(), new SystemTimeProvider()), new M2(c5532n5, c5444jl, new C5574ol(c5532n5.h(), M2.g), AbstractC5840z1.a(), new SystemTimeProvider()), new C5418il(c5532n5, c5444jl));
    }

    public static C5403i5 b() {
        return new C5403i5();
    }

    public final D3 b(C5621qf c5621qf) {
        Context context = this.c;
        return new D3(context, c5621qf, context.getPackageName(), new SafePackageManager());
    }

    public final E9 a(C5621qf c5621qf, Po po, C5470kl c5470kl, C5250c7 c5250c7, C5475l0 c5475l0, C5238bl c5238bl, Ii ii) {
        return new E9(c5621qf, po, c5470kl, c5250c7, c5475l0, this.i, c5238bl, this.m, new C5584p5(ii), new SystemTimeProvider());
    }

    public static Gi a(C5532n5 c5532n5, C5640r9 c5640r9) {
        return new Gi(c5640r9, c5532n5);
    }

    public K9 a(P9 p9, C5250c7 c5250c7, Zg zg, F4 f4, C5351g5 c5351g5, C5621qf c5621qf) {
        return this.l.a(p9, c5250c7, zg, f4, c5351g5, c5621qf).a();
    }

    public final C2 a(C5621qf c5621qf) {
        return new C2(this.d, c5621qf);
    }
}
