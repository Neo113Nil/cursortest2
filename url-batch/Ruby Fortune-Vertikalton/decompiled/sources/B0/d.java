package B0;

import K.C0006f;
import K.C0012l;
import K.C0023x;
import K.InterfaceC0003c;
import K.InterfaceC0005e;
import T.w;
import X.C0051u;
import X.U;
import a0.C0056a;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.punchtowin.balls.MainActivity;
import i1.u;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.C0150f;
import k.C0159o;
import k.MenuC0157m;
import k.RunnableC0149e;
import k.ViewOnKeyListenerC0151g;
import l.H0;

/* loaded from: classes.dex */
public class d implements InterfaceC0003c, InterfaceC0005e, T.i, T.o, G.b, d0.e, H0 {

    /* renamed from: c, reason: collision with root package name */
    public static d f57c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58a;

    /* renamed from: b, reason: collision with root package name */
    public Object f59b;

    public /* synthetic */ d(int i, Object obj) {
        this.f58a = i;
        this.f59b = obj;
    }

    public void A(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f59b;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    @Override // K.InterfaceC0003c
    public void a(Bundle bundle) {
        ((ContentInfo.Builder) this.f59b).setExtras(bundle);
    }

    @Override // K.InterfaceC0003c
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f59b).setLinkUri(uri);
    }

    @Override // K.InterfaceC0005e
    public int c() {
        int source;
        source = ((ContentInfo) this.f59b).getSource();
        return source;
    }

    @Override // l.H0
    public void d(MenuC0157m menuC0157m, C0159o c0159o) {
        ViewOnKeyListenerC0151g viewOnKeyListenerC0151g = (ViewOnKeyListenerC0151g) this.f59b;
        viewOnKeyListenerC0151g.f2650f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0151g.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0157m == ((C0150f) arrayList.get(i)).f2645b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC0151g.f2650f.postAtTime(new RunnableC0149e(this, i2 < arrayList.size() ? (C0150f) arrayList.get(i2) : null, c0159o, menuC0157m), menuC0157m, SystemClock.uptimeMillis() + 200);
    }

    @Override // T.o
    public Object e() {
        return this;
    }

    @Override // K.InterfaceC0005e
    public ClipData f() {
        ClipData clip;
        clip = ((ContentInfo) this.f59b).getClip();
        return clip;
    }

    @Override // K.InterfaceC0003c
    public C0006f g() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f59b).build();
        return new C0006f(new d(build));
    }

    @Override // d0.e
    public void h(int i, Serializable serializable) {
        String str;
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
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f59b).setResultCode(i);
    }

    @Override // G.b
    public void i() {
        ((U) this.f59b).a();
    }

    @Override // K.InterfaceC0005e
    public int j() {
        int flags;
        flags = ((ContentInfo) this.f59b).getFlags();
        return flags;
    }

    @Override // d0.e
    public void k() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // T.i
    public void l(q1.d dVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new T.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new N0.b(this, dVar, threadPoolExecutor, 1));
    }

    @Override // T.o
    public boolean m(CharSequence charSequence, int i, int i2, w wVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), (String) this.f59b)) {
            return true;
        }
        wVar.f750c = (wVar.f750c & 3) | 4;
        return false;
    }

    @Override // K.InterfaceC0005e
    public ContentInfo n() {
        return (ContentInfo) this.f59b;
    }

    @Override // l.H0
    public void o(MenuC0157m menuC0157m, C0159o c0159o) {
        ((ViewOnKeyListenerC0151g) this.f59b).f2650f.removeCallbacksAndMessages(menuC0157m);
    }

    @Override // K.InterfaceC0003c
    public void p(int i) {
        ((ContentInfo.Builder) this.f59b).setFlags(i);
    }

    public void q(String str, String str2) {
        X0.e.e(str, "name");
        X0.e.e(str2, "value");
        ArrayList arrayList = (ArrayList) this.f59b;
        arrayList.add(str);
        arrayList.add(e1.d.y0(str2).toString());
    }

    public i1.k r() {
        return new i1.k((String[]) ((ArrayList) this.f59b).toArray(new String[0]));
    }

    public L.j s(int i) {
        return null;
    }

    public L.j t(int i) {
        return null;
    }

    public String toString() {
        switch (this.f58a) {
            case 5:
                return "ContentInfoCompat{" + ((ContentInfo) this.f59b) + "}";
            default:
                return super.toString();
        }
    }

    public M u(Class cls) {
        String str;
        X0.c a2 = X0.i.a(cls);
        Class cls2 = a2.f1010a;
        String str2 = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            boolean isArray = cls2.isArray();
            HashMap hashMap = X0.c.f1009c;
            if (isArray) {
                Class<?> componentType = cls2.getComponentType();
                if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
                    str2 = str.concat("Array");
                }
                if (str2 == null) {
                    str2 = "kotlin.Array";
                }
            } else {
                str2 = (String) hashMap.get(cls2.getName());
                if (str2 == null) {
                    str2 = cls2.getCanonicalName();
                }
            }
        }
        if (str2 != null) {
            return ((C0012l) this.f59b).n(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public void v() {
        View view = (View) this.f59b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void w() {
        ((C0051u) this.f59b).h.K();
    }

    public void x(m1.j jVar, IOException iOException) {
        MainActivity mainActivity = (MainActivity) this.f59b;
        mainActivity.runOnUiThread(new q(5, mainActivity));
    }

    public void y(m1.j jVar, u uVar) {
        String str = ((i1.m) jVar.f3226b.f213c).h;
        String str2 = ((i1.m) uVar.f2519a.f213c).h;
        MainActivity mainActivity = (MainActivity) this.f59b;
        mainActivity.runOnUiThread(new N0.b(str, str2, mainActivity, 0));
    }

    public boolean z(int i, int i2, Bundle bundle) {
        return false;
    }

    public d(View view) {
        this.f58a = 7;
        if (Build.VERSION.SDK_INT < 30) {
            this.f59b = new d(6, view);
            return;
        }
        C0023x c0023x = new C0023x(6, view);
        c0023x.d = view;
        this.f59b = c0023x;
    }

    public d(O o2, N n2) {
        this.f58a = 21;
        X0.e.e(o2, "store");
        C0056a c0056a = C0056a.f1100b;
        X0.e.e(c0056a, "defaultCreationExtras");
        this.f59b = new C0012l(o2, n2, c0056a);
    }

    public d(TextView textView) {
        this.f58a = 16;
        this.f59b = new V.g(textView);
    }

    public d(EditText editText) {
        this.f58a = 15;
        this.f59b = new B.j(editText);
    }

    public d(Context context) {
        this.f58a = 13;
        this.f59b = context.getApplicationContext();
    }

    public d(int i) {
        this.f58a = i;
        switch (i) {
            case 3:
                this.f59b = new Object();
                new Handler(Looper.getMainLooper(), new J0.e(this));
                break;
            case 8:
                this.f59b = new L.k(this);
                break;
            case 26:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                X0.e.e(timeUnit, "timeUnit");
                this.f59b = new m1.n(l1.d.h, timeUnit);
                break;
            case 27:
                this.f59b = new ArrayList(20);
                break;
        }
    }

    public d(ContentInfo contentInfo) {
        this.f58a = 5;
        contentInfo.getClass();
        this.f59b = E0.e.g(contentInfo);
    }

    public d(ClipData clipData, int i) {
        this.f58a = 4;
        this.f59b = E0.e.e(clipData, i);
    }
}
