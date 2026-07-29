package o;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.devanos.nilufar.usmonova.p7.data.network.ApiService;
import java.util.Locale;

/* loaded from: classes.dex */
public final class A4 extends AbstractC2225xU implements InterfaceC2114vp {
    public int h;
    public final /* synthetic */ C4 i;
    public final /* synthetic */ String j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A4(C4 c4, String str, String str2, InterfaceC2235xe interfaceC2235xe) {
        super(1, interfaceC2235xe);
        this.i = c4;
        this.j = str;
        this.k = str2;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(InterfaceC2235xe interfaceC2235xe) {
        return new A4(this.i, this.j, this.k, interfaceC2235xe);
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        return ((A4) create((InterfaceC2235xe) obj)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        String language;
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1494mO.l(obj);
            return obj;
        }
        AbstractC1494mO.l(obj);
        C4 c4 = this.i;
        ApiService a = c4.a();
        C1580ni c1580ni = c4.d;
        String f0 = AbstractC1473m3.f0(AbstractC1473m3.f(89, 43, 120, 1, 56, 228, 78));
        Locale locale = c1580ni.a.getResources().getConfiguration().getLocales().get(0);
        String country = locale.getCountry();
        if (country == null || UT.J(country)) {
            language = locale.getLanguage();
            AbstractC0048Bt.k(language);
        } else {
            language = locale.getLanguage() + "-" + locale.getCountry();
        }
        String country2 = c1580ni.a.getResources().getConfiguration().getLocales().get(0).getCountry();
        if (UT.J(country2)) {
            country2 = Locale.getDefault().getCountry();
            if (UT.J(country2)) {
                country2 = "US";
            }
        }
        String str = country2;
        c1580ni.getClass();
        String str2 = Build.MODEL;
        if (str2 == null) {
            str2 = "unknown";
        }
        c1580ni.getClass();
        String str3 = Build.MANUFACTURER;
        if (str3 == null) {
            str3 = "unknown";
        }
        c1580ni.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = c1580ni.a.getSystemService("window");
        AbstractC0048Bt.l(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
        String valueOf = String.valueOf(displayMetrics.widthPixels);
        c1580ni.getClass();
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        Object systemService2 = c1580ni.a.getSystemService("window");
        AbstractC0048Bt.l(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService2).getDefaultDisplay().getRealMetrics(displayMetrics2);
        String valueOf2 = String.valueOf(displayMetrics2.heightPixels);
        String a2 = c1580ni.a();
        this.h = 1;
        Object startup = a.startup(f0, language, str, str2, str3, valueOf, valueOf2, this.j, this.k, a2, this);
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        return startup == enumC0448Re ? enumC0448Re : startup;
    }
}
