package v;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0325i {

    /* renamed from: a, reason: collision with root package name */
    public int f3913a;

    /* renamed from: b, reason: collision with root package name */
    public final l f3914b;

    /* renamed from: c, reason: collision with root package name */
    public final k f3915c;
    public final C0326j d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3916e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f3917f;

    public C0325i() {
        l lVar = new l();
        lVar.f3988a = 0;
        lVar.f3989b = 0;
        lVar.f3990c = 1.0f;
        lVar.d = Float.NaN;
        this.f3914b = lVar;
        k kVar = new k();
        kVar.f3982a = -1;
        kVar.f3983b = 0;
        kVar.f3984c = -1;
        kVar.d = Float.NaN;
        kVar.f3985e = Float.NaN;
        kVar.f3986f = Float.NaN;
        kVar.f3987g = -1;
        kVar.h = null;
        kVar.i = -1;
        this.f3915c = kVar;
        C0326j c0326j = new C0326j();
        c0326j.f3944a = false;
        c0326j.d = -1;
        c0326j.f3951e = -1;
        c0326j.f3953f = -1.0f;
        c0326j.f3955g = true;
        c0326j.h = -1;
        c0326j.i = -1;
        c0326j.f3959j = -1;
        c0326j.f3960k = -1;
        c0326j.f3962l = -1;
        c0326j.f3964m = -1;
        c0326j.f3966n = -1;
        c0326j.f3968o = -1;
        c0326j.f3970p = -1;
        c0326j.f3971q = -1;
        c0326j.f3972r = -1;
        c0326j.f3973s = -1;
        c0326j.f3974t = -1;
        c0326j.f3975u = -1;
        c0326j.f3976v = -1;
        c0326j.f3977w = 0.5f;
        c0326j.f3978x = 0.5f;
        c0326j.f3979y = null;
        c0326j.f3980z = -1;
        c0326j.f3919A = 0;
        c0326j.f3920B = 0.0f;
        c0326j.f3921C = -1;
        c0326j.f3922D = -1;
        c0326j.f3923E = -1;
        c0326j.F = 0;
        c0326j.f3924G = 0;
        c0326j.f3925H = 0;
        c0326j.f3926I = 0;
        c0326j.f3927J = 0;
        c0326j.f3928K = 0;
        c0326j.f3929L = 0;
        c0326j.f3930M = Integer.MIN_VALUE;
        c0326j.f3931N = Integer.MIN_VALUE;
        c0326j.f3932O = Integer.MIN_VALUE;
        c0326j.f3933P = Integer.MIN_VALUE;
        c0326j.f3934Q = Integer.MIN_VALUE;
        c0326j.f3935R = Integer.MIN_VALUE;
        c0326j.f3936S = Integer.MIN_VALUE;
        c0326j.f3937T = -1.0f;
        c0326j.f3938U = -1.0f;
        c0326j.f3939V = 0;
        c0326j.f3940W = 0;
        c0326j.f3941X = 0;
        c0326j.f3942Y = 0;
        c0326j.f3943Z = 0;
        c0326j.f3945a0 = 0;
        c0326j.f3947b0 = 0;
        c0326j.f3949c0 = 0;
        c0326j.f3950d0 = 1.0f;
        c0326j.f3952e0 = 1.0f;
        c0326j.f3954f0 = -1;
        c0326j.f3956g0 = 0;
        c0326j.f3957h0 = -1;
        c0326j.f3963l0 = false;
        c0326j.f3965m0 = false;
        c0326j.f3967n0 = true;
        c0326j.f3969o0 = 0;
        this.d = c0326j;
        m mVar = new m();
        mVar.f3992a = 0.0f;
        mVar.f3993b = 0.0f;
        mVar.f3994c = 0.0f;
        mVar.d = 1.0f;
        mVar.f3995e = 1.0f;
        mVar.f3996f = Float.NaN;
        mVar.f3997g = Float.NaN;
        mVar.h = -1;
        mVar.i = 0.0f;
        mVar.f3998j = 0.0f;
        mVar.f3999k = 0.0f;
        mVar.f4000l = false;
        mVar.f4001m = 0.0f;
        this.f3916e = mVar;
        this.f3917f = new HashMap();
    }

    public final void a(C0321e c0321e) {
        C0326j c0326j = this.d;
        c0321e.f3863e = c0326j.h;
        c0321e.f3865f = c0326j.i;
        c0321e.f3867g = c0326j.f3959j;
        c0321e.h = c0326j.f3960k;
        c0321e.i = c0326j.f3962l;
        c0321e.f3871j = c0326j.f3964m;
        c0321e.f3872k = c0326j.f3966n;
        c0321e.f3874l = c0326j.f3968o;
        c0321e.f3876m = c0326j.f3970p;
        c0321e.f3878n = c0326j.f3971q;
        c0321e.f3880o = c0326j.f3972r;
        c0321e.f3886s = c0326j.f3973s;
        c0321e.f3887t = c0326j.f3974t;
        c0321e.f3888u = c0326j.f3975u;
        c0321e.f3889v = c0326j.f3976v;
        ((ViewGroup.MarginLayoutParams) c0321e).leftMargin = c0326j.F;
        ((ViewGroup.MarginLayoutParams) c0321e).rightMargin = c0326j.f3924G;
        ((ViewGroup.MarginLayoutParams) c0321e).topMargin = c0326j.f3925H;
        ((ViewGroup.MarginLayoutParams) c0321e).bottomMargin = c0326j.f3926I;
        c0321e.f3831A = c0326j.f3935R;
        c0321e.f3832B = c0326j.f3934Q;
        c0321e.f3891x = c0326j.f3931N;
        c0321e.f3893z = c0326j.f3933P;
        c0321e.f3835E = c0326j.f3977w;
        c0321e.F = c0326j.f3978x;
        c0321e.f3882p = c0326j.f3980z;
        c0321e.f3884q = c0326j.f3919A;
        c0321e.f3885r = c0326j.f3920B;
        c0321e.f3836G = c0326j.f3979y;
        c0321e.f3849T = c0326j.f3921C;
        c0321e.f3850U = c0326j.f3922D;
        c0321e.f3838I = c0326j.f3937T;
        c0321e.f3837H = c0326j.f3938U;
        c0321e.f3840K = c0326j.f3940W;
        c0321e.f3839J = c0326j.f3939V;
        c0321e.f3852W = c0326j.f3963l0;
        c0321e.f3853X = c0326j.f3965m0;
        c0321e.f3841L = c0326j.f3941X;
        c0321e.f3842M = c0326j.f3942Y;
        c0321e.f3845P = c0326j.f3943Z;
        c0321e.f3846Q = c0326j.f3945a0;
        c0321e.f3843N = c0326j.f3947b0;
        c0321e.f3844O = c0326j.f3949c0;
        c0321e.f3847R = c0326j.f3950d0;
        c0321e.f3848S = c0326j.f3952e0;
        c0321e.f3851V = c0326j.f3923E;
        c0321e.f3860c = c0326j.f3953f;
        c0321e.f3856a = c0326j.d;
        c0321e.f3858b = c0326j.f3951e;
        ((ViewGroup.MarginLayoutParams) c0321e).width = c0326j.f3946b;
        ((ViewGroup.MarginLayoutParams) c0321e).height = c0326j.f3948c;
        String str = c0326j.f3961k0;
        if (str != null) {
            c0321e.f3854Y = str;
        }
        c0321e.f3855Z = c0326j.f3969o0;
        c0321e.setMarginStart(c0326j.f3928K);
        c0321e.setMarginEnd(c0326j.f3927J);
        c0321e.a();
    }

    public final Object clone() {
        C0325i c0325i = new C0325i();
        C0326j c0326j = c0325i.d;
        c0326j.getClass();
        C0326j c0326j2 = this.d;
        c0326j.f3944a = c0326j2.f3944a;
        c0326j.f3946b = c0326j2.f3946b;
        c0326j.f3948c = c0326j2.f3948c;
        c0326j.d = c0326j2.d;
        c0326j.f3951e = c0326j2.f3951e;
        c0326j.f3953f = c0326j2.f3953f;
        c0326j.f3955g = c0326j2.f3955g;
        c0326j.h = c0326j2.h;
        c0326j.i = c0326j2.i;
        c0326j.f3959j = c0326j2.f3959j;
        c0326j.f3960k = c0326j2.f3960k;
        c0326j.f3962l = c0326j2.f3962l;
        c0326j.f3964m = c0326j2.f3964m;
        c0326j.f3966n = c0326j2.f3966n;
        c0326j.f3968o = c0326j2.f3968o;
        c0326j.f3970p = c0326j2.f3970p;
        c0326j.f3971q = c0326j2.f3971q;
        c0326j.f3972r = c0326j2.f3972r;
        c0326j.f3973s = c0326j2.f3973s;
        c0326j.f3974t = c0326j2.f3974t;
        c0326j.f3975u = c0326j2.f3975u;
        c0326j.f3976v = c0326j2.f3976v;
        c0326j.f3977w = c0326j2.f3977w;
        c0326j.f3978x = c0326j2.f3978x;
        c0326j.f3979y = c0326j2.f3979y;
        c0326j.f3980z = c0326j2.f3980z;
        c0326j.f3919A = c0326j2.f3919A;
        c0326j.f3920B = c0326j2.f3920B;
        c0326j.f3921C = c0326j2.f3921C;
        c0326j.f3922D = c0326j2.f3922D;
        c0326j.f3923E = c0326j2.f3923E;
        c0326j.F = c0326j2.F;
        c0326j.f3924G = c0326j2.f3924G;
        c0326j.f3925H = c0326j2.f3925H;
        c0326j.f3926I = c0326j2.f3926I;
        c0326j.f3927J = c0326j2.f3927J;
        c0326j.f3928K = c0326j2.f3928K;
        c0326j.f3929L = c0326j2.f3929L;
        c0326j.f3930M = c0326j2.f3930M;
        c0326j.f3931N = c0326j2.f3931N;
        c0326j.f3932O = c0326j2.f3932O;
        c0326j.f3933P = c0326j2.f3933P;
        c0326j.f3934Q = c0326j2.f3934Q;
        c0326j.f3935R = c0326j2.f3935R;
        c0326j.f3936S = c0326j2.f3936S;
        c0326j.f3937T = c0326j2.f3937T;
        c0326j.f3938U = c0326j2.f3938U;
        c0326j.f3939V = c0326j2.f3939V;
        c0326j.f3940W = c0326j2.f3940W;
        c0326j.f3941X = c0326j2.f3941X;
        c0326j.f3942Y = c0326j2.f3942Y;
        c0326j.f3943Z = c0326j2.f3943Z;
        c0326j.f3945a0 = c0326j2.f3945a0;
        c0326j.f3947b0 = c0326j2.f3947b0;
        c0326j.f3949c0 = c0326j2.f3949c0;
        c0326j.f3950d0 = c0326j2.f3950d0;
        c0326j.f3952e0 = c0326j2.f3952e0;
        c0326j.f3954f0 = c0326j2.f3954f0;
        c0326j.f3956g0 = c0326j2.f3956g0;
        c0326j.f3957h0 = c0326j2.f3957h0;
        c0326j.f3961k0 = c0326j2.f3961k0;
        int[] iArr = c0326j2.f3958i0;
        if (iArr == null || c0326j2.j0 != null) {
            c0326j.f3958i0 = null;
        } else {
            c0326j.f3958i0 = Arrays.copyOf(iArr, iArr.length);
        }
        c0326j.j0 = c0326j2.j0;
        c0326j.f3963l0 = c0326j2.f3963l0;
        c0326j.f3965m0 = c0326j2.f3965m0;
        c0326j.f3967n0 = c0326j2.f3967n0;
        c0326j.f3969o0 = c0326j2.f3969o0;
        k kVar = c0325i.f3915c;
        kVar.getClass();
        k kVar2 = this.f3915c;
        kVar2.getClass();
        kVar.f3982a = kVar2.f3982a;
        kVar.f3984c = kVar2.f3984c;
        kVar.f3985e = kVar2.f3985e;
        kVar.d = kVar2.d;
        l lVar = c0325i.f3914b;
        l lVar2 = this.f3914b;
        lVar.f3988a = lVar2.f3988a;
        lVar.f3990c = lVar2.f3990c;
        lVar.d = lVar2.d;
        lVar.f3989b = lVar2.f3989b;
        m mVar = c0325i.f3916e;
        mVar.getClass();
        m mVar2 = this.f3916e;
        mVar2.getClass();
        mVar.f3992a = mVar2.f3992a;
        mVar.f3993b = mVar2.f3993b;
        mVar.f3994c = mVar2.f3994c;
        mVar.d = mVar2.d;
        mVar.f3995e = mVar2.f3995e;
        mVar.f3996f = mVar2.f3996f;
        mVar.f3997g = mVar2.f3997g;
        mVar.h = mVar2.h;
        mVar.i = mVar2.i;
        mVar.f3998j = mVar2.f3998j;
        mVar.f3999k = mVar2.f3999k;
        mVar.f4000l = mVar2.f4000l;
        mVar.f4001m = mVar2.f4001m;
        c0325i.f3913a = this.f3913a;
        return c0325i;
    }
}
