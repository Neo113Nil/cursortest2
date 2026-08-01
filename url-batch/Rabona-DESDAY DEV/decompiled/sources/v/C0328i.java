package v;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0328i {

    /* renamed from: a, reason: collision with root package name */
    public int f3935a;

    /* renamed from: b, reason: collision with root package name */
    public final l f3936b;

    /* renamed from: c, reason: collision with root package name */
    public final k f3937c;
    public final C0329j d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3938e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f3939f;

    public C0328i() {
        l lVar = new l();
        lVar.f4010a = 0;
        lVar.f4011b = 0;
        lVar.f4012c = 1.0f;
        lVar.d = Float.NaN;
        this.f3936b = lVar;
        k kVar = new k();
        kVar.f4004a = -1;
        kVar.f4005b = 0;
        kVar.f4006c = -1;
        kVar.d = Float.NaN;
        kVar.f4007e = Float.NaN;
        kVar.f4008f = Float.NaN;
        kVar.f4009g = -1;
        kVar.h = null;
        kVar.i = -1;
        this.f3937c = kVar;
        C0329j c0329j = new C0329j();
        c0329j.f3966a = false;
        c0329j.d = -1;
        c0329j.f3973e = -1;
        c0329j.f3975f = -1.0f;
        c0329j.f3977g = true;
        c0329j.h = -1;
        c0329j.i = -1;
        c0329j.f3981j = -1;
        c0329j.f3982k = -1;
        c0329j.f3984l = -1;
        c0329j.f3986m = -1;
        c0329j.f3988n = -1;
        c0329j.f3990o = -1;
        c0329j.f3992p = -1;
        c0329j.f3993q = -1;
        c0329j.f3994r = -1;
        c0329j.f3995s = -1;
        c0329j.f3996t = -1;
        c0329j.f3997u = -1;
        c0329j.f3998v = -1;
        c0329j.f3999w = 0.5f;
        c0329j.f4000x = 0.5f;
        c0329j.f4001y = null;
        c0329j.f4002z = -1;
        c0329j.f3941A = 0;
        c0329j.f3942B = 0.0f;
        c0329j.f3943C = -1;
        c0329j.f3944D = -1;
        c0329j.f3945E = -1;
        c0329j.F = 0;
        c0329j.f3946G = 0;
        c0329j.f3947H = 0;
        c0329j.f3948I = 0;
        c0329j.f3949J = 0;
        c0329j.f3950K = 0;
        c0329j.f3951L = 0;
        c0329j.f3952M = Integer.MIN_VALUE;
        c0329j.f3953N = Integer.MIN_VALUE;
        c0329j.f3954O = Integer.MIN_VALUE;
        c0329j.f3955P = Integer.MIN_VALUE;
        c0329j.f3956Q = Integer.MIN_VALUE;
        c0329j.f3957R = Integer.MIN_VALUE;
        c0329j.f3958S = Integer.MIN_VALUE;
        c0329j.f3959T = -1.0f;
        c0329j.f3960U = -1.0f;
        c0329j.f3961V = 0;
        c0329j.f3962W = 0;
        c0329j.f3963X = 0;
        c0329j.f3964Y = 0;
        c0329j.f3965Z = 0;
        c0329j.f3967a0 = 0;
        c0329j.f3969b0 = 0;
        c0329j.f3971c0 = 0;
        c0329j.f3972d0 = 1.0f;
        c0329j.f3974e0 = 1.0f;
        c0329j.f3976f0 = -1;
        c0329j.f3978g0 = 0;
        c0329j.f3979h0 = -1;
        c0329j.f3985l0 = false;
        c0329j.f3987m0 = false;
        c0329j.f3989n0 = true;
        c0329j.f3991o0 = 0;
        this.d = c0329j;
        m mVar = new m();
        mVar.f4014a = 0.0f;
        mVar.f4015b = 0.0f;
        mVar.f4016c = 0.0f;
        mVar.d = 1.0f;
        mVar.f4017e = 1.0f;
        mVar.f4018f = Float.NaN;
        mVar.f4019g = Float.NaN;
        mVar.h = -1;
        mVar.i = 0.0f;
        mVar.f4020j = 0.0f;
        mVar.f4021k = 0.0f;
        mVar.f4022l = false;
        mVar.f4023m = 0.0f;
        this.f3938e = mVar;
        this.f3939f = new HashMap();
    }

    public final void a(C0324e c0324e) {
        C0329j c0329j = this.d;
        c0324e.f3885e = c0329j.h;
        c0324e.f3887f = c0329j.i;
        c0324e.f3889g = c0329j.f3981j;
        c0324e.h = c0329j.f3982k;
        c0324e.i = c0329j.f3984l;
        c0324e.f3893j = c0329j.f3986m;
        c0324e.f3894k = c0329j.f3988n;
        c0324e.f3896l = c0329j.f3990o;
        c0324e.f3898m = c0329j.f3992p;
        c0324e.f3900n = c0329j.f3993q;
        c0324e.f3902o = c0329j.f3994r;
        c0324e.f3908s = c0329j.f3995s;
        c0324e.f3909t = c0329j.f3996t;
        c0324e.f3910u = c0329j.f3997u;
        c0324e.f3911v = c0329j.f3998v;
        ((ViewGroup.MarginLayoutParams) c0324e).leftMargin = c0329j.F;
        ((ViewGroup.MarginLayoutParams) c0324e).rightMargin = c0329j.f3946G;
        ((ViewGroup.MarginLayoutParams) c0324e).topMargin = c0329j.f3947H;
        ((ViewGroup.MarginLayoutParams) c0324e).bottomMargin = c0329j.f3948I;
        c0324e.f3853A = c0329j.f3957R;
        c0324e.f3854B = c0329j.f3956Q;
        c0324e.f3913x = c0329j.f3953N;
        c0324e.f3915z = c0329j.f3955P;
        c0324e.f3857E = c0329j.f3999w;
        c0324e.F = c0329j.f4000x;
        c0324e.f3904p = c0329j.f4002z;
        c0324e.f3906q = c0329j.f3941A;
        c0324e.f3907r = c0329j.f3942B;
        c0324e.f3858G = c0329j.f4001y;
        c0324e.f3871T = c0329j.f3943C;
        c0324e.f3872U = c0329j.f3944D;
        c0324e.f3860I = c0329j.f3959T;
        c0324e.f3859H = c0329j.f3960U;
        c0324e.f3862K = c0329j.f3962W;
        c0324e.f3861J = c0329j.f3961V;
        c0324e.f3874W = c0329j.f3985l0;
        c0324e.f3875X = c0329j.f3987m0;
        c0324e.f3863L = c0329j.f3963X;
        c0324e.f3864M = c0329j.f3964Y;
        c0324e.f3867P = c0329j.f3965Z;
        c0324e.f3868Q = c0329j.f3967a0;
        c0324e.f3865N = c0329j.f3969b0;
        c0324e.f3866O = c0329j.f3971c0;
        c0324e.f3869R = c0329j.f3972d0;
        c0324e.f3870S = c0329j.f3974e0;
        c0324e.f3873V = c0329j.f3945E;
        c0324e.f3882c = c0329j.f3975f;
        c0324e.f3878a = c0329j.d;
        c0324e.f3880b = c0329j.f3973e;
        ((ViewGroup.MarginLayoutParams) c0324e).width = c0329j.f3968b;
        ((ViewGroup.MarginLayoutParams) c0324e).height = c0329j.f3970c;
        String str = c0329j.f3983k0;
        if (str != null) {
            c0324e.f3876Y = str;
        }
        c0324e.f3877Z = c0329j.f3991o0;
        c0324e.setMarginStart(c0329j.f3950K);
        c0324e.setMarginEnd(c0329j.f3949J);
        c0324e.a();
    }

    public final Object clone() {
        C0328i c0328i = new C0328i();
        C0329j c0329j = c0328i.d;
        c0329j.getClass();
        C0329j c0329j2 = this.d;
        c0329j.f3966a = c0329j2.f3966a;
        c0329j.f3968b = c0329j2.f3968b;
        c0329j.f3970c = c0329j2.f3970c;
        c0329j.d = c0329j2.d;
        c0329j.f3973e = c0329j2.f3973e;
        c0329j.f3975f = c0329j2.f3975f;
        c0329j.f3977g = c0329j2.f3977g;
        c0329j.h = c0329j2.h;
        c0329j.i = c0329j2.i;
        c0329j.f3981j = c0329j2.f3981j;
        c0329j.f3982k = c0329j2.f3982k;
        c0329j.f3984l = c0329j2.f3984l;
        c0329j.f3986m = c0329j2.f3986m;
        c0329j.f3988n = c0329j2.f3988n;
        c0329j.f3990o = c0329j2.f3990o;
        c0329j.f3992p = c0329j2.f3992p;
        c0329j.f3993q = c0329j2.f3993q;
        c0329j.f3994r = c0329j2.f3994r;
        c0329j.f3995s = c0329j2.f3995s;
        c0329j.f3996t = c0329j2.f3996t;
        c0329j.f3997u = c0329j2.f3997u;
        c0329j.f3998v = c0329j2.f3998v;
        c0329j.f3999w = c0329j2.f3999w;
        c0329j.f4000x = c0329j2.f4000x;
        c0329j.f4001y = c0329j2.f4001y;
        c0329j.f4002z = c0329j2.f4002z;
        c0329j.f3941A = c0329j2.f3941A;
        c0329j.f3942B = c0329j2.f3942B;
        c0329j.f3943C = c0329j2.f3943C;
        c0329j.f3944D = c0329j2.f3944D;
        c0329j.f3945E = c0329j2.f3945E;
        c0329j.F = c0329j2.F;
        c0329j.f3946G = c0329j2.f3946G;
        c0329j.f3947H = c0329j2.f3947H;
        c0329j.f3948I = c0329j2.f3948I;
        c0329j.f3949J = c0329j2.f3949J;
        c0329j.f3950K = c0329j2.f3950K;
        c0329j.f3951L = c0329j2.f3951L;
        c0329j.f3952M = c0329j2.f3952M;
        c0329j.f3953N = c0329j2.f3953N;
        c0329j.f3954O = c0329j2.f3954O;
        c0329j.f3955P = c0329j2.f3955P;
        c0329j.f3956Q = c0329j2.f3956Q;
        c0329j.f3957R = c0329j2.f3957R;
        c0329j.f3958S = c0329j2.f3958S;
        c0329j.f3959T = c0329j2.f3959T;
        c0329j.f3960U = c0329j2.f3960U;
        c0329j.f3961V = c0329j2.f3961V;
        c0329j.f3962W = c0329j2.f3962W;
        c0329j.f3963X = c0329j2.f3963X;
        c0329j.f3964Y = c0329j2.f3964Y;
        c0329j.f3965Z = c0329j2.f3965Z;
        c0329j.f3967a0 = c0329j2.f3967a0;
        c0329j.f3969b0 = c0329j2.f3969b0;
        c0329j.f3971c0 = c0329j2.f3971c0;
        c0329j.f3972d0 = c0329j2.f3972d0;
        c0329j.f3974e0 = c0329j2.f3974e0;
        c0329j.f3976f0 = c0329j2.f3976f0;
        c0329j.f3978g0 = c0329j2.f3978g0;
        c0329j.f3979h0 = c0329j2.f3979h0;
        c0329j.f3983k0 = c0329j2.f3983k0;
        int[] iArr = c0329j2.f3980i0;
        if (iArr == null || c0329j2.j0 != null) {
            c0329j.f3980i0 = null;
        } else {
            c0329j.f3980i0 = Arrays.copyOf(iArr, iArr.length);
        }
        c0329j.j0 = c0329j2.j0;
        c0329j.f3985l0 = c0329j2.f3985l0;
        c0329j.f3987m0 = c0329j2.f3987m0;
        c0329j.f3989n0 = c0329j2.f3989n0;
        c0329j.f3991o0 = c0329j2.f3991o0;
        k kVar = c0328i.f3937c;
        kVar.getClass();
        k kVar2 = this.f3937c;
        kVar2.getClass();
        kVar.f4004a = kVar2.f4004a;
        kVar.f4006c = kVar2.f4006c;
        kVar.f4007e = kVar2.f4007e;
        kVar.d = kVar2.d;
        l lVar = c0328i.f3936b;
        l lVar2 = this.f3936b;
        lVar.f4010a = lVar2.f4010a;
        lVar.f4012c = lVar2.f4012c;
        lVar.d = lVar2.d;
        lVar.f4011b = lVar2.f4011b;
        m mVar = c0328i.f3938e;
        mVar.getClass();
        m mVar2 = this.f3938e;
        mVar2.getClass();
        mVar.f4014a = mVar2.f4014a;
        mVar.f4015b = mVar2.f4015b;
        mVar.f4016c = mVar2.f4016c;
        mVar.d = mVar2.d;
        mVar.f4017e = mVar2.f4017e;
        mVar.f4018f = mVar2.f4018f;
        mVar.f4019g = mVar2.f4019g;
        mVar.h = mVar2.h;
        mVar.i = mVar2.i;
        mVar.f4020j = mVar2.f4020j;
        mVar.f4021k = mVar2.f4021k;
        mVar.f4022l = mVar2.f4022l;
        mVar.f4023m = mVar2.f4023m;
        c0328i.f3935a = this.f3935a;
        return c0328i;
    }
}
