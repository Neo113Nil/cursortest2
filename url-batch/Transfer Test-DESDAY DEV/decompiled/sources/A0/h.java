package A0;

import K.AbstractC0004c;
import K.C0008g;
import K.C0014m;
import K.InterfaceC0005d;
import K.InterfaceC0007f;
import L.k;
import L.l;
import U.ThreadFactoryC0031a;
import U.i;
import Y.B;
import Y.C0052u;
import Y.U;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.profileinstaller.ProfileInstallReceiver;
import b0.C0081a;
import g1.j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.C0157f;
import k.C0166o;
import k.InterfaceC0162k;
import k.InterfaceC0175x;
import k.MenuC0164m;
import k.RunnableC0156e;
import k.SubMenuC0151E;
import k.ViewOnKeyListenerC0158g;
import l.C0218k;
import l.F0;
import l.InterfaceC0224n;
import l.V0;
import l.Y;

/* loaded from: classes.dex */
public class h implements a, InterfaceC0005d, InterfaceC0007f, i, G.b, e0.e, F0, InterfaceC0175x, InterfaceC0162k, Y {

    /* renamed from: c, reason: collision with root package name */
    public static h f28c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29a;

    /* renamed from: b, reason: collision with root package name */
    public Object f30b;

    public /* synthetic */ h(int i, Object obj) {
        this.f29a = i;
        this.f30b = obj;
    }

    @Override // K.InterfaceC0005d
    public void a(Bundle bundle) {
        ((ContentInfo.Builder) this.f30b).setExtras(bundle);
    }

    @Override // k.InterfaceC0175x
    public void b(MenuC0164m menuC0164m, boolean z2) {
        if (menuC0164m instanceof SubMenuC0151E) {
            ((SubMenuC0151E) menuC0164m).f2697z.k().c(false);
        }
        InterfaceC0175x interfaceC0175x = ((C0218k) this.f30b).f3019e;
        if (interfaceC0175x != null) {
            interfaceC0175x.b(menuC0164m, z2);
        }
    }

    @Override // l.Y
    public void c(int i) {
    }

    @Override // K.InterfaceC0005d
    public void d(Uri uri) {
        ((ContentInfo.Builder) this.f30b).setLinkUri(uri);
    }

    @Override // K.InterfaceC0007f
    public int e() {
        int source;
        source = ((ContentInfo) this.f30b).getSource();
        return source;
    }

    @Override // l.F0
    public void f(MenuC0164m menuC0164m, C0166o c0166o) {
        ViewOnKeyListenerC0158g viewOnKeyListenerC0158g = (ViewOnKeyListenerC0158g) this.f30b;
        viewOnKeyListenerC0158g.f2724f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0158g.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0164m == ((C0157f) arrayList.get(i)).f2719b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC0158g.f2724f.postAtTime(new RunnableC0156e(this, i2 < arrayList.size() ? (C0157f) arrayList.get(i2) : null, c0166o, menuC0164m), menuC0164m, SystemClock.uptimeMillis() + 200);
    }

    @Override // k.InterfaceC0175x
    public boolean g(MenuC0164m menuC0164m) {
        C0218k c0218k = (C0218k) this.f30b;
        if (menuC0164m == c0218k.f3018c) {
            return false;
        }
        ((SubMenuC0151E) menuC0164m).f2696A.getClass();
        c0218k.getClass();
        InterfaceC0175x interfaceC0175x = c0218k.f3019e;
        if (interfaceC0175x != null) {
            return interfaceC0175x.g(menuC0164m);
        }
        return false;
    }

    @Override // U.i
    public void h(final T.e eVar) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0031a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: U.l
            @Override // java.lang.Runnable
            public final void run() {
                A0.h hVar = A0.h.this;
                T.e eVar2 = eVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                hVar.getClass();
                try {
                    t q2 = T.e.q((Context) hVar.f30b);
                    if (q2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    s sVar = (s) ((i) q2.f817b);
                    synchronized (sVar.d) {
                        sVar.f845f = threadPoolExecutor2;
                    }
                    ((i) q2.f817b).h(new m(eVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    eVar2.G(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // K.InterfaceC0007f
    public ClipData i() {
        ClipData clip;
        clip = ((ContentInfo) this.f30b).getClip();
        return clip;
    }

    @Override // K.InterfaceC0005d
    public C0008g j() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f30b).build();
        return new C0008g(new h(build));
    }

    @Override // e0.e
    public void k(int i, Serializable serializable) {
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
        ((ProfileInstallReceiver) this.f30b).setResultCode(i);
    }

    @Override // G.b
    public void l() {
        ((U) this.f30b).a();
    }

    @Override // K.InterfaceC0007f
    public int m() {
        int flags;
        flags = ((ContentInfo) this.f30b).getFlags();
        return flags;
    }

    @Override // l.Y
    public void n(int i, float f2) {
    }

    @Override // e0.e
    public void o() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // k.InterfaceC0162k
    public void p(MenuC0164m menuC0164m) {
        V0 v02 = ((ActionMenuView) this.f30b).f1335u;
        if (v02 != null) {
            v02.p(menuC0164m);
        }
    }

    @Override // k.InterfaceC0162k
    public boolean q(MenuC0164m menuC0164m, MenuItem menuItem) {
        InterfaceC0224n interfaceC0224n = ((ActionMenuView) this.f30b).f1340z;
        if (interfaceC0224n != null) {
            Iterator it = ((CopyOnWriteArrayList) ((V0) interfaceC0224n).f2950a.f1362G.f425b).iterator();
            while (it.hasNext()) {
                if (((B) it.next()).f940a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // K.InterfaceC0007f
    public ContentInfo r() {
        return (ContentInfo) this.f30b;
    }

    @Override // l.F0
    public void s(MenuC0164m menuC0164m, C0166o c0166o) {
        ((ViewOnKeyListenerC0158g) this.f30b).f2724f.removeCallbacksAndMessages(menuC0164m);
    }

    @Override // l.Y
    public void t(int i) {
    }

    public String toString() {
        switch (this.f29a) {
            case 4:
                return "ContentInfoCompat{" + ((ContentInfo) this.f30b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // K.InterfaceC0005d
    public void u(int i) {
        ((ContentInfo.Builder) this.f30b).setFlags(i);
    }

    public k v(int i) {
        return null;
    }

    public k w(int i) {
        return null;
    }

    public O x(Class cls) {
        String str;
        g1.c a2 = j.a(cls);
        Class cls2 = a2.f2579a;
        g1.f.e(cls2, "jClass");
        String str2 = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            boolean isArray = cls2.isArray();
            HashMap hashMap = g1.c.f2578c;
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
            return ((C0014m) this.f30b).f(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public void y() {
        ((C0052u) this.f30b).d.K();
    }

    public boolean z(int i, int i2, Bundle bundle) {
        return false;
    }

    public h(Q q2, P p2) {
        this.f29a = 18;
        g1.f.e(q2, "store");
        C0081a c0081a = C0081a.f1724b;
        g1.f.e(c0081a, "defaultCreationExtras");
        this.f30b = new C0014m(q2, p2, c0081a);
    }

    public h(TextView textView) {
        this.f29a = 13;
        this.f30b = new W.g(textView);
    }

    public h(EditText editText) {
        this.f29a = 12;
        this.f30b = new B.j(editText);
    }

    public h(Context context) {
        this.f29a = 11;
        this.f30b = context.getApplicationContext();
    }

    public h(ContentInfo contentInfo) {
        this.f29a = 4;
        contentInfo.getClass();
        this.f30b = AbstractC0004c.g(contentInfo);
    }

    public h(ClipData clipData, int i) {
        this.f29a = 3;
        this.f30b = AbstractC0004c.e(clipData, i);
    }

    public h(int i) {
        this.f29a = i;
        switch (i) {
            case 5:
                this.f30b = new l(this);
                break;
            case 10:
                this.f30b = new Object();
                new Handler(Looper.getMainLooper(), new Q0.e(this));
                break;
            case 19:
                this.f30b = new LinkedHashMap();
                break;
        }
    }
}
