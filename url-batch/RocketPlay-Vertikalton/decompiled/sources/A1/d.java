package A1;

import F1.l;
import K.C0013f;
import K.C0019l;
import K.C0029w;
import K.InterfaceC0009c;
import K.InterfaceC0012e;
import L.j;
import L.k;
import U.ThreadFactoryC0037a;
import U.i;
import W.g;
import Y.C0058u;
import Y.U;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.profileinstaller.ProfileInstallReceiver;
import b0.C0089a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.C0195f;
import k.C0204o;
import k.InterfaceC0213x;
import k.MenuC0202m;
import k.RunnableC0194e;
import k.SubMenuC0189E;
import k.ViewOnKeyListenerC0196g;
import l.C0259k;
import l.H0;

/* loaded from: classes.dex */
public class d implements InterfaceC0009c, InterfaceC0012e, i, G.b, e0.e, H0, InterfaceC0213x {

    /* renamed from: c, reason: collision with root package name */
    public static d f36c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37a;

    /* renamed from: b, reason: collision with root package name */
    public Object f38b;

    public /* synthetic */ d(int i, Object obj) {
        this.f37a = i;
        this.f38b = obj;
    }

    @Override // K.InterfaceC0009c
    public void a(Bundle bundle) {
        ((ContentInfo.Builder) this.f38b).setExtras(bundle);
    }

    @Override // k.InterfaceC0213x
    public void b(MenuC0202m menuC0202m, boolean z2) {
        if (menuC0202m instanceof SubMenuC0189E) {
            ((SubMenuC0189E) menuC0202m).f3128z.k().c(false);
        }
        InterfaceC0213x interfaceC0213x = ((C0259k) this.f38b).f3451e;
        if (interfaceC0213x != null) {
            interfaceC0213x.b(menuC0202m, z2);
        }
    }

    @Override // K.InterfaceC0009c
    public void c(Uri uri) {
        ((ContentInfo.Builder) this.f38b).setLinkUri(uri);
    }

    @Override // K.InterfaceC0012e
    public int d() {
        int source;
        source = ((ContentInfo) this.f38b).getSource();
        return source;
    }

    @Override // l.H0
    public void e(MenuC0202m menuC0202m, C0204o c0204o) {
        ViewOnKeyListenerC0196g viewOnKeyListenerC0196g = (ViewOnKeyListenerC0196g) this.f38b;
        viewOnKeyListenerC0196g.f3155f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0196g.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0202m == ((C0195f) arrayList.get(i)).f3150b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC0196g.f3155f.postAtTime(new RunnableC0194e(this, i2 < arrayList.size() ? (C0195f) arrayList.get(i2) : null, c0204o, menuC0202m), menuC0202m, SystemClock.uptimeMillis() + 200);
    }

    @Override // k.InterfaceC0213x
    public boolean f(MenuC0202m menuC0202m) {
        C0259k c0259k = (C0259k) this.f38b;
        if (menuC0202m == c0259k.f3450c) {
            return false;
        }
        ((SubMenuC0189E) menuC0202m).f3127A.getClass();
        c0259k.getClass();
        InterfaceC0213x interfaceC0213x = c0259k.f3451e;
        if (interfaceC0213x != null) {
            return interfaceC0213x.f(menuC0202m);
        }
        return false;
    }

    @Override // K.InterfaceC0012e
    public ClipData g() {
        ClipData clip;
        clip = ((ContentInfo) this.f38b).getClip();
        return clip;
    }

    @Override // K.InterfaceC0009c
    public C0013f h() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f38b).build();
        return new C0013f(new d(build));
    }

    @Override // e0.e
    public void i(int i, Serializable serializable) {
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
        ((ProfileInstallReceiver) this.f38b).setResultCode(i);
    }

    @Override // U.i
    public void j(final l lVar) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0037a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: U.l
            @Override // java.lang.Runnable
            public final void run() {
                A1.d dVar = A1.d.this;
                F1.l lVar2 = lVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                dVar.getClass();
                try {
                    t t2 = F1.d.t((Context) dVar.f38b);
                    if (t2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    s sVar = (s) ((i) t2.f1175b);
                    synchronized (sVar.d) {
                        sVar.f1203f = threadPoolExecutor2;
                    }
                    ((i) t2.f1175b).j(new m(lVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    lVar2.W(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // G.b
    public void k() {
        ((U) this.f38b).a();
    }

    @Override // K.InterfaceC0012e
    public int l() {
        int flags;
        flags = ((ContentInfo) this.f38b).getFlags();
        return flags;
    }

    @Override // e0.e
    public void m() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // K.InterfaceC0012e
    public ContentInfo n() {
        return (ContentInfo) this.f38b;
    }

    @Override // l.H0
    public void o(MenuC0202m menuC0202m, C0204o c0204o) {
        ((ViewOnKeyListenerC0196g) this.f38b).f3155f.removeCallbacksAndMessages(menuC0202m);
    }

    @Override // K.InterfaceC0009c
    public void p(int i) {
        ((ContentInfo.Builder) this.f38b).setFlags(i);
    }

    public j q(int i) {
        return null;
    }

    public j r(int i) {
        return null;
    }

    public O s(Class cls) {
        String str;
        i1.c a2 = i1.j.a(cls);
        Class cls2 = a2.f3046a;
        i1.f.e(cls2, "jClass");
        String str2 = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            boolean isArray = cls2.isArray();
            HashMap hashMap = i1.c.f3045c;
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
            return ((C0019l) this.f38b).f(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public void t() {
        View view = (View) this.f38b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public String toString() {
        switch (this.f37a) {
            case 5:
                return "ContentInfoCompat{" + ((ContentInfo) this.f38b) + "}";
            default:
                return super.toString();
        }
    }

    public void u() {
        ((C0058u) this.f38b).d.K();
    }

    public boolean v(int i, int i2, Bundle bundle) {
        return false;
    }

    public d(int i) {
        this.f37a = i;
        switch (i) {
            case 2:
                break;
            case 8:
                this.f38b = new k(this);
                break;
            case 10:
                this.f38b = new Object();
                new Handler(Looper.getMainLooper(), new O0.e(this));
                break;
            case 22:
                this.f38b = new LinkedHashMap();
                break;
            default:
                this.f38b = new LinkedHashSet();
                break;
        }
    }

    public d(View view) {
        this.f37a = 7;
        if (Build.VERSION.SDK_INT >= 30) {
            C0029w c0029w = new C0029w(6, view);
            c0029w.d = view;
            this.f38b = c0029w;
            return;
        }
        this.f38b = new d(6, view);
    }

    public d(Q q2, P p2) {
        this.f37a = 21;
        i1.f.e(q2, "store");
        C0089a c0089a = C0089a.f2101b;
        i1.f.e(c0089a, "defaultCreationExtras");
        this.f38b = new C0019l(q2, p2, c0089a);
    }

    public d(TextView textView) {
        this.f37a = 16;
        this.f38b = new g(textView);
    }

    public d(EditText editText) {
        this.f37a = 15;
        this.f38b = new B.j(editText);
    }

    public d(Context context) {
        this.f37a = 14;
        this.f38b = context.getApplicationContext();
    }

    public d(y1.a aVar) {
        this.f37a = 0;
        this.f38b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }

    public d(ContentInfo contentInfo) {
        this.f37a = 5;
        contentInfo.getClass();
        this.f38b = J0.e.g(contentInfo);
    }

    public d(ClipData clipData, int i) {
        this.f37a = 4;
        this.f38b = J0.e.e(clipData, i);
    }
}
