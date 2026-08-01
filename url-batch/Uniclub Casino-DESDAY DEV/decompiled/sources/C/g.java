package C;

import K.C0005f;
import K.C0011l;
import K.C0021w;
import K.InterfaceC0002c;
import K.InterfaceC0004e;
import T.ThreadFactoryC0031a;
import T.p;
import T.x;
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
import d0.InterfaceC0085e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.C0161f;
import k.C0170o;
import k.InterfaceC0179x;
import k.MenuC0168m;
import k.RunnableC0160e;
import k.SubMenuC0155E;
import k.ViewOnKeyListenerC0162g;
import l.C0232k;
import l.H0;
import m1.n;
import q1.l;

/* loaded from: classes.dex */
public class g implements InterfaceC0002c, InterfaceC0004e, T.i, p, G.b, InterfaceC0085e, H0, InterfaceC0179x {

    /* renamed from: c, reason: collision with root package name */
    public static g f60c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61a;

    /* renamed from: b, reason: collision with root package name */
    public Object f62b;

    public /* synthetic */ g(int i, Object obj) {
        this.f61a = i;
        this.f62b = obj;
    }

    public void A(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f62b;
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

    @Override // K.InterfaceC0002c
    public void a(Bundle bundle) {
        ((ContentInfo.Builder) this.f62b).setExtras(bundle);
    }

    @Override // k.InterfaceC0179x
    public void b(MenuC0168m menuC0168m, boolean z2) {
        if (menuC0168m instanceof SubMenuC0155E) {
            ((SubMenuC0155E) menuC0168m).f2632z.k().c(false);
        }
        InterfaceC0179x interfaceC0179x = ((C0232k) this.f62b).f3016e;
        if (interfaceC0179x != null) {
            interfaceC0179x.b(menuC0168m, z2);
        }
    }

    @Override // K.InterfaceC0002c
    public void c(Uri uri) {
        ((ContentInfo.Builder) this.f62b).setLinkUri(uri);
    }

    @Override // K.InterfaceC0004e
    public int d() {
        int source;
        source = ((ContentInfo) this.f62b).getSource();
        return source;
    }

    @Override // l.H0
    public void e(MenuC0168m menuC0168m, C0170o c0170o) {
        ViewOnKeyListenerC0162g viewOnKeyListenerC0162g = (ViewOnKeyListenerC0162g) this.f62b;
        viewOnKeyListenerC0162g.f2659f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0162g.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0168m == ((C0161f) arrayList.get(i)).f2654b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC0162g.f2659f.postAtTime(new RunnableC0160e(this, i2 < arrayList.size() ? (C0161f) arrayList.get(i2) : null, c0170o, menuC0168m), menuC0168m, SystemClock.uptimeMillis() + 200);
    }

    @Override // k.InterfaceC0179x
    public boolean f(MenuC0168m menuC0168m) {
        C0232k c0232k = (C0232k) this.f62b;
        if (menuC0168m == c0232k.f3015c) {
            return false;
        }
        ((SubMenuC0155E) menuC0168m).f2631A.getClass();
        c0232k.getClass();
        InterfaceC0179x interfaceC0179x = c0232k.f3016e;
        if (interfaceC0179x != null) {
            return interfaceC0179x.f(menuC0168m);
        }
        return false;
    }

    @Override // T.p
    public Object g() {
        return this;
    }

    @Override // K.InterfaceC0004e
    public ClipData h() {
        ClipData clip;
        clip = ((ContentInfo) this.f62b).getClip();
        return clip;
    }

    @Override // K.InterfaceC0002c
    public C0005f i() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f62b).build();
        return new C0005f(new g(build));
    }

    @Override // d0.InterfaceC0085e
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
        ((ProfileInstallReceiver) this.f62b).setResultCode(i);
    }

    @Override // G.b
    public void k() {
        ((U) this.f62b).a();
    }

    @Override // K.InterfaceC0004e
    public int l() {
        int flags;
        flags = ((ContentInfo) this.f62b).getFlags();
        return flags;
    }

    @Override // d0.InterfaceC0085e
    public void m() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // T.p
    public boolean n(CharSequence charSequence, int i, int i2, x xVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), (String) this.f62b)) {
            return true;
        }
        xVar.f759c = (xVar.f759c & 3) | 4;
        return false;
    }

    @Override // K.InterfaceC0004e
    public ContentInfo o() {
        return (ContentInfo) this.f62b;
    }

    @Override // l.H0
    public void p(MenuC0168m menuC0168m, C0170o c0170o) {
        ((ViewOnKeyListenerC0162g) this.f62b).f2659f.removeCallbacksAndMessages(menuC0168m);
    }

    @Override // T.i
    public void q(final l lVar) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0031a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: T.l
            @Override // java.lang.Runnable
            public final void run() {
                C.g gVar = C.g.this;
                q1.l lVar2 = lVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                gVar.getClass();
                try {
                    s h = q1.d.h((Context) gVar.f62b);
                    if (h == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    r rVar = (r) ((i) h.f720b);
                    synchronized (rVar.d) {
                        rVar.f746f = threadPoolExecutor2;
                    }
                    ((i) h.f720b).q(new m(lVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    lVar2.b0(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // K.InterfaceC0002c
    public void r(int i) {
        ((ContentInfo.Builder) this.f62b).setFlags(i);
    }

    public void s(String str, String str2) {
        X0.d.e(str, "name");
        X0.d.e(str2, "value");
        ArrayList arrayList = (ArrayList) this.f62b;
        arrayList.add(str);
        arrayList.add(e1.d.w0(str2).toString());
    }

    public i1.l t() {
        return new i1.l((String[]) ((ArrayList) this.f62b).toArray(new String[0]));
    }

    public String toString() {
        switch (this.f61a) {
            case 4:
                return "ContentInfoCompat{" + ((ContentInfo) this.f62b) + "}";
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
        X0.b a2 = X0.h.a(cls);
        Class cls2 = a2.f1015a;
        String str2 = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            boolean isArray = cls2.isArray();
            HashMap hashMap = X0.b.f1014c;
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
            return ((C0011l) this.f62b).n(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public void x() {
        View view = (View) this.f62b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void y() {
        ((C0051u) this.f62b).d.K();
    }

    public boolean z(int i, int i2, Bundle bundle) {
        return false;
    }

    public g(View view) {
        this.f61a = 6;
        if (Build.VERSION.SDK_INT < 30) {
            this.f62b = new g(5, view);
            return;
        }
        C0021w c0021w = new C0021w(5, view);
        c0021w.d = view;
        this.f62b = c0021w;
    }

    public g(O o2, N n2) {
        this.f61a = 20;
        X0.d.e(o2, "store");
        C0056a c0056a = C0056a.f1105b;
        X0.d.e(c0056a, "defaultCreationExtras");
        this.f62b = new C0011l(o2, n2, c0056a);
    }

    public g(TextView textView) {
        this.f61a = 15;
        this.f62b = new V.g(textView);
    }

    public g(EditText editText) {
        this.f61a = 14;
        this.f62b = new B.j(editText);
    }

    public g(Context context) {
        this.f61a = 12;
        this.f62b = context.getApplicationContext();
    }

    public g(int i) {
        this.f61a = i;
        switch (i) {
            case 7:
                this.f62b = new L.k(this);
                break;
            case 8:
                this.f62b = new Object();
                new Handler(Looper.getMainLooper(), new L0.e(this));
                break;
            case 25:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                X0.d.e(timeUnit, "timeUnit");
                this.f62b = new n(l1.d.h, timeUnit);
                break;
            case 26:
                this.f62b = new ArrayList(20);
                break;
        }
    }

    public g(ContentInfo contentInfo) {
        this.f61a = 4;
        contentInfo.getClass();
        this.f62b = G0.e.g(contentInfo);
    }

    public g(ClipData clipData, int i) {
        this.f61a = 3;
        this.f62b = G0.e.e(clipData, i);
    }
}
