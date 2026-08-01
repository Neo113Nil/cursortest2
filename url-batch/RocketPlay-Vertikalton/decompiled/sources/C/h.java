package C;

import B.o;
import H.m;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final F1.d f238a;

    /* renamed from: b, reason: collision with root package name */
    public static final o.f f239b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f238a = new k();
        } else if (i >= 28) {
            f238a = new j();
        } else {
            f238a = new i();
        }
        f239b = new o.f(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r4.equals(r5) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, B.f fVar, Resources resources, int i, String str, int i2, int i3, B.b bVar, boolean z2) {
        Typeface v2;
        Typeface typeface;
        Typeface typeface2;
        int i4 = 2;
        int i5 = 1;
        int i6 = 0;
        int i7 = -3;
        if (fVar instanceof B.i) {
            B.i iVar = (B.i) fVar;
            String str2 = iVar.d;
            v2 = null;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new o(bVar, 0, typeface));
                }
                return typeface;
            }
            boolean z3 = !z2 ? bVar != null : iVar.f70c != 0;
            int i8 = z2 ? iVar.f69b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            A1.d dVar = new A1.d(2);
            dVar.f38b = bVar;
            H.e eVar = iVar.f68a;
            B.j jVar = new B.j(dVar, i4, handler);
            if (z3) {
                o.f fVar2 = H.i.f558a;
                String str3 = ((String) eVar.f548e) + "-" + i3;
                typeface2 = (Typeface) H.i.f558a.a(str3);
                if (typeface2 != null) {
                    handler.post(new H.a(dVar, 0, typeface2));
                } else if (i8 == -1) {
                    H.h a2 = H.i.a(str3, context, eVar, i3);
                    jVar.H(a2);
                    v2 = a2.f556a;
                } else {
                    try {
                        try {
                            H.h hVar = (H.h) H.i.f559b.submit(new H.f(str3, context, eVar, i3, 0)).get(i8, TimeUnit.MILLISECONDS);
                            jVar.H(hVar);
                            v2 = hVar.f556a;
                        } catch (InterruptedException e2) {
                            throw e2;
                        } catch (ExecutionException e3) {
                            throw new RuntimeException(e3);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) jVar.f73c).post(new H.b((A1.d) jVar.f72b, i7, i6));
                    }
                }
            } else {
                o.f fVar3 = H.i.f558a;
                String str4 = ((String) eVar.f548e) + "-" + i3;
                typeface2 = (Typeface) H.i.f558a.a(str4);
                if (typeface2 != null) {
                    handler.post(new H.a(dVar, 0, typeface2));
                } else {
                    H.g gVar = new H.g(i6, jVar);
                    synchronized (H.i.f560c) {
                        try {
                            o.k kVar = H.i.d;
                            ArrayList arrayList = (ArrayList) kVar.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(gVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(gVar);
                                kVar.put(str4, arrayList2);
                                H.f fVar4 = new H.f(str4, context, eVar, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = H.i.f559b;
                                H.g gVar2 = new H.g(i5, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                m mVar = new m();
                                mVar.f567b = fVar4;
                                mVar.f568c = gVar2;
                                mVar.d = handler2;
                                threadPoolExecutor.execute(mVar);
                            }
                        } finally {
                        }
                    }
                }
            }
            v2 = typeface2;
        } else {
            v2 = f238a.v(context, (B.g) fVar, resources, i3);
            if (bVar != null) {
                if (v2 != null) {
                    new Handler(Looper.getMainLooper()).post(new o(bVar, 0, v2));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (v2 != null) {
            f239b.b(b(resources, i, str, i2, i3), v2);
        }
        return v2;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
