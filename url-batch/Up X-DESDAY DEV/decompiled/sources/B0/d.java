package B0;

import K.C0006f;
import K.C0012l;
import K.C0023x;
import K.InterfaceC0003c;
import K.InterfaceC0005e;
import T.ThreadFactoryC0032a;
import T.x;
import X.C0052u;
import X.U;
import a0.C0057a;
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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.C0151f;
import k.C0160o;
import k.InterfaceC0169x;
import k.MenuC0158m;
import k.RunnableC0150e;
import k.SubMenuC0145E;
import k.ViewOnKeyListenerC0152g;
import l.C0243k;
import l.H0;

/* loaded from: classes.dex */
public class d implements InterfaceC0003c, InterfaceC0005e, T.i, T.p, G.b, d0.e, H0, InterfaceC0169x {

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

    @Override // k.InterfaceC0169x
    public void b(MenuC0158m menuC0158m, boolean z2) {
        if (menuC0158m instanceof SubMenuC0145E) {
            ((SubMenuC0145E) menuC0158m).f2607z.k().c(false);
        }
        InterfaceC0169x interfaceC0169x = ((C0243k) this.f59b).f2991e;
        if (interfaceC0169x != null) {
            interfaceC0169x.b(menuC0158m, z2);
        }
    }

    @Override // K.InterfaceC0003c
    public void c(Uri uri) {
        ((ContentInfo.Builder) this.f59b).setLinkUri(uri);
    }

    @Override // K.InterfaceC0005e
    public int d() {
        int source;
        source = ((ContentInfo) this.f59b).getSource();
        return source;
    }

    @Override // l.H0
    public void e(MenuC0158m menuC0158m, C0160o c0160o) {
        ViewOnKeyListenerC0152g viewOnKeyListenerC0152g = (ViewOnKeyListenerC0152g) this.f59b;
        viewOnKeyListenerC0152g.f2634f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0152g.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0158m == ((C0151f) arrayList.get(i)).f2629b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC0152g.f2634f.postAtTime(new RunnableC0150e(this, i2 < arrayList.size() ? (C0151f) arrayList.get(i2) : null, c0160o, menuC0158m), menuC0158m, SystemClock.uptimeMillis() + 200);
    }

    @Override // k.InterfaceC0169x
    public boolean f(MenuC0158m menuC0158m) {
        C0243k c0243k = (C0243k) this.f59b;
        if (menuC0158m == c0243k.f2990c) {
            return false;
        }
        ((SubMenuC0145E) menuC0158m).f2606A.getClass();
        c0243k.getClass();
        InterfaceC0169x interfaceC0169x = c0243k.f2991e;
        if (interfaceC0169x != null) {
            return interfaceC0169x.f(menuC0158m);
        }
        return false;
    }

    @Override // T.p
    public Object g() {
        return this;
    }

    @Override // K.InterfaceC0005e
    public ClipData h() {
        ClipData clip;
        clip = ((ContentInfo) this.f59b).getClip();
        return clip;
    }

    @Override // K.InterfaceC0003c
    public C0006f i() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f59b).build();
        return new C0006f(new d(build));
    }

    @Override // d0.e
    public void j(int i, Serializable serializable) {
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
    public void k() {
        ((U) this.f59b).a();
    }

    @Override // K.InterfaceC0005e
    public int l() {
        int flags;
        flags = ((ContentInfo) this.f59b).getFlags();
        return flags;
    }

    @Override // d0.e
    public void m() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // T.i
    public void n(final q1.d dVar) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0032a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: T.l
            @Override // java.lang.Runnable
            public final void run() {
                B0.d dVar2 = B0.d.this;
                q1.d dVar3 = dVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                dVar2.getClass();
                try {
                    s o2 = q1.l.o((Context) dVar2.f59b);
                    if (o2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    r rVar = (r) ((i) o2.f716b);
                    synchronized (rVar.d) {
                        rVar.f742f = threadPoolExecutor2;
                    }
                    ((i) o2.f716b).n(new m(dVar3, threadPoolExecutor2));
                } catch (Throwable th) {
                    dVar3.b0(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // T.p
    public boolean o(CharSequence charSequence, int i, int i2, x xVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), (String) this.f59b)) {
            return true;
        }
        xVar.f755c = (xVar.f755c & 3) | 4;
        return false;
    }

    @Override // K.InterfaceC0005e
    public ContentInfo p() {
        return (ContentInfo) this.f59b;
    }

    @Override // l.H0
    public void q(MenuC0158m menuC0158m, C0160o c0160o) {
        ((ViewOnKeyListenerC0152g) this.f59b).f2634f.removeCallbacksAndMessages(menuC0158m);
    }

    @Override // K.InterfaceC0003c
    public void r(int i) {
        ((ContentInfo.Builder) this.f59b).setFlags(i);
    }

    public void s(String str, String str2) {
        X0.e.e(str, "name");
        X0.e.e(str2, "value");
        ArrayList arrayList = (ArrayList) this.f59b;
        arrayList.add(str);
        arrayList.add(e1.d.y0(str2).toString());
    }

    public i1.k t() {
        return new i1.k((String[]) ((ArrayList) this.f59b).toArray(new String[0]));
    }

    public String toString() {
        switch (this.f58a) {
            case 5:
                return "ContentInfoCompat{" + ((ContentInfo) this.f59b) + "}";
            default:
                return super.toString();
        }
    }

    public L.j u(int i) {
        return null;
    }

    public L.j v(int i) {
        return null;
    }

    public M w(Class cls) {
        String str;
        X0.c a2 = X0.i.a(cls);
        Class cls2 = a2.f1013a;
        String str2 = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            boolean isArray = cls2.isArray();
            HashMap hashMap = X0.c.f1012c;
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

    public void x() {
        View view = (View) this.f59b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void y() {
        ((C0052u) this.f59b).h.K();
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
        this.f58a = 20;
        X0.e.e(o2, "store");
        C0057a c0057a = C0057a.f1103b;
        X0.e.e(c0057a, "defaultCreationExtras");
        this.f59b = new C0012l(o2, n2, c0057a);
    }

    public d(TextView textView) {
        this.f58a = 15;
        this.f59b = new V.g(textView);
    }

    public d(EditText editText) {
        this.f58a = 14;
        this.f59b = new B.j(editText);
    }

    public d(Context context) {
        this.f58a = 12;
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
            case 25:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                X0.e.e(timeUnit, "timeUnit");
                this.f59b = new m1.n(l1.d.h, timeUnit);
                break;
            case 26:
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
