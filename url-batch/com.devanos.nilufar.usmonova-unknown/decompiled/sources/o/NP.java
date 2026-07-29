package o;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class NP implements XZ {
    public final Application a;
    public final WZ b;
    public final Bundle c;
    public final AbstractC0106Dz d;
    public final KP e;

    public NP(Application application, MP mp, Bundle bundle) {
        WZ wz;
        this.e = mp.getSavedStateRegistry();
        this.d = mp.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (WZ.c == null) {
                WZ.c = new WZ(application);
            }
            wz = WZ.c;
            AbstractC0048Bt.k(wz);
        } else {
            wz = new WZ(null);
        }
        this.b = wz;
    }

    @Override // o.XZ
    public final UZ a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // o.XZ
    public final UZ b(Class cls, C2142wD c2142wD) {
        C1623oL c1623oL = C1623oL.r;
        LinkedHashMap linkedHashMap = c2142wD.a;
        String str = (String) linkedHashMap.get(c1623oL);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(AbstractC1807r8.e) == null || linkedHashMap.get(AbstractC1807r8.f) == null) {
            if (this.d != null) {
                return d(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(WZ.d);
        boolean isAssignableFrom = S3.class.isAssignableFrom(cls);
        Constructor a = (!isAssignableFrom || application == null) ? OP.a(cls, OP.b) : OP.a(cls, OP.a);
        return a == null ? this.b.b(cls, c2142wD) : (!isAssignableFrom || application == null) ? OP.b(cls, a, AbstractC1807r8.C(c2142wD)) : OP.b(cls, a, application, AbstractC1807r8.C(c2142wD));
    }

    public final UZ d(Class cls, String str) {
        AbstractC0106Dz abstractC0106Dz = this.d;
        if (abstractC0106Dz == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = S3.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor a = (!isAssignableFrom || application == null) ? OP.a(cls, OP.b) : OP.a(cls, OP.a);
        if (a == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            if (YZ.a == null) {
                YZ.a = new YZ();
            }
            YZ yz = YZ.a;
            AbstractC0048Bt.k(yz);
            return yz.a(cls);
        }
        KP kp = this.e;
        AbstractC0048Bt.k(kp);
        Bundle a2 = kp.a(str);
        Class[] clsArr = DP.f;
        DP f = DY.f(a2, this.c);
        EP ep = new EP(str, f);
        ep.m(abstractC0106Dz, kp);
        EnumC0080Cz enumC0080Cz = ((C0417Pz) abstractC0106Dz).d;
        if (enumC0080Cz == EnumC0080Cz.i || enumC0080Cz.compareTo(EnumC0080Cz.k) >= 0) {
            kp.d();
        } else {
            abstractC0106Dz.a(new C0113Eg(abstractC0106Dz, kp));
        }
        UZ b = (!isAssignableFrom || application == null) ? OP.b(cls, a, f) : OP.b(cls, a, application, f);
        b.a("androidx.lifecycle.savedstate.vm.tag", ep);
        return b;
    }
}
