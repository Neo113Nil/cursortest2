package defpackage;

import android.graphics.Typeface;
import android.util.Log;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class pg0 implements og0, yh0 {
    public static pg0 e;
    public final /* synthetic */ int d;

    public /* synthetic */ pg0(int i) {
        this.d = i;
    }

    public static final void e(pg0 pg0Var) {
        et0 et0Var;
        rf0 rf0Var;
        rf0 rf0Var2;
        et0 et0Var2 = wi0.x;
        do {
            et0Var = wi0.x;
            rf0Var = (rf0) et0Var.getValue();
            hf0 hf0Var = rf0Var.f;
            h30 h30Var = (h30) hf0Var.get(pg0Var);
            if (h30Var == null) {
                rf0Var2 = rf0Var;
            } else {
                Object obj = h30Var.a;
                Object obj2 = h30Var.b;
                kx0 kx0Var = hf0Var.d;
                kx0 v = kx0Var.v(pg0Var != null ? pg0Var.hashCode() : 0, 0, pg0Var);
                if (kx0Var != v) {
                    hf0Var = v == null ? hf0.f : new hf0(v, hf0Var.e - 1);
                }
                b2 b2Var = b2.z;
                if (obj != b2Var) {
                    Object obj3 = hf0Var.get(obj);
                    obj3.getClass();
                    hf0Var = hf0Var.a(obj, new h30(((h30) obj3).a, obj2));
                }
                if (obj2 != b2Var) {
                    Object obj4 = hf0Var.get(obj2);
                    obj4.getClass();
                    hf0Var = hf0Var.a(obj2, new h30(obj, ((h30) obj4).b));
                }
                Object obj5 = obj != b2Var ? rf0Var.d : obj2;
                if (obj2 != b2Var) {
                    obj = rf0Var.e;
                }
                rf0Var2 = new rf0(obj5, obj, hf0Var);
            }
            if (rf0Var == rf0Var2) {
                return;
            }
        } while (!et0Var.i(rf0Var, rf0Var2));
    }

    public static final x5 f(String str, int i) {
        WeakHashMap weakHashMap = i21.u;
        return new x5(str, i);
    }

    public static final int g(long j, int i) {
        int i2 = nz.n;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static final yy0 h(String str, int i) {
        WeakHashMap weakHashMap = i21.u;
        return new yy0(new ty(0, 0, 0, 0), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [n01] */
    public static p01 i(r01 r01Var, ll llVar, int i) {
        ll llVar2 = llVar;
        if ((i & 2) != 0) {
            llVar2 = r01Var instanceof fw ? ((fw) r01Var).getDefaultViewModelProviderFactory() : ll.b;
        }
        hk defaultViewModelCreationExtras = r01Var instanceof fw ? ((fw) r01Var).getDefaultViewModelCreationExtras() : gk.b;
        llVar2.getClass();
        defaultViewModelCreationExtras.getClass();
        return new p01(r01Var.getViewModelStore(), llVar2, defaultViewModelCreationExtras);
    }

    public static Typeface j(String str, ut utVar, int i) {
        if (i == 0 && nz.l(utVar, ut.f) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int t = nk.t(utVar, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(t) : Typeface.create(str, t);
    }

    @Override // defpackage.og0
    public Typeface a(ut utVar, int i) {
        return j(null, utVar, i);
    }

    @Override // defpackage.yh0
    public void b() {
        switch (this.d) {
            case 1:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // defpackage.og0
    public Typeface c(ev evVar, ut utVar, int i) {
        String str;
        evVar.getClass();
        int i2 = utVar.d / 100;
        if (i2 >= 0 && i2 < 2) {
            str = "sans-serif-thin";
        } else if (2 > i2 || i2 >= 4) {
            if (i2 != 4) {
                if (i2 == 5) {
                    str = "sans-serif-medium";
                } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                    str = "sans-serif-black";
                }
            }
            str = "sans-serif";
        } else {
            str = "sans-serif-light";
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface j = j(str, utVar, i);
            if (!nz.l(j, Typeface.create(Typeface.DEFAULT, nk.t(utVar, i))) && !nz.l(j, j(null, utVar, i))) {
                typeface = j;
            }
        }
        return typeface == null ? j("sans-serif", utVar, i) : typeface;
    }

    @Override // defpackage.yh0
    public void d(int i, Object obj) {
        String str;
        switch (this.d) {
            case 1:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i != 6 && i != 7 && i != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    break;
                }
                break;
        }
    }

    public boolean k(CharSequence charSequence) {
        return false;
    }

    public String toString() {
        switch (this.d) {
            case 11:
                return "SharingStarted.Eagerly";
            case 12:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    private final void l() {
    }

    private final void m(int i, Object obj) {
    }
}
