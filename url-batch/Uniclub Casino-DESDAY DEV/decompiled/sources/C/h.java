package C;

import B.o;
import H.n;
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
    public static final q1.d f63a;

    /* renamed from: b, reason: collision with root package name */
    public static final o.f f64b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f63a = new k();
        } else if (i >= 28) {
            f63a = new j();
        } else {
            f63a = new i();
        }
        f64b = new o.f(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r3.equals(r4) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, B.f fVar, Resources resources, int i, String str, int i2, int i3, B.b bVar, boolean z2) {
        Typeface i4;
        Typeface typeface;
        Typeface typeface2;
        int i5 = 1;
        int i6 = 0;
        int i7 = -3;
        if (fVar instanceof B.i) {
            B.i iVar = (B.i) fVar;
            String str2 = iVar.d;
            i4 = null;
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
            boolean z3 = !z2 ? bVar != null : iVar.f26c != 0;
            int i8 = z2 ? iVar.f25b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            g gVar = new g(0);
            gVar.f62b = bVar;
            H.e eVar = iVar.f24a;
            B.j jVar = new B.j(gVar, 2, handler);
            if (z3) {
                o.f fVar2 = H.i.f217a;
                String str3 = ((String) eVar.f207e) + "-" + i3;
                typeface2 = (Typeface) H.i.f217a.a(str3);
                if (typeface2 != null) {
                    handler.post(new H.a(gVar, 0, typeface2));
                } else if (i8 == -1) {
                    H.h a2 = H.i.a(str3, context, eVar, i3);
                    jVar.E(a2);
                    i4 = a2.f215a;
                } else {
                    try {
                        try {
                            try {
                                H.h hVar = (H.h) H.i.f218b.submit(new H.f(str3, context, eVar, i3, 0)).get(i8, TimeUnit.MILLISECONDS);
                                jVar.E(hVar);
                                i4 = hVar.f215a;
                            } catch (InterruptedException e2) {
                                throw e2;
                            }
                        } catch (ExecutionException e3) {
                            throw new RuntimeException(e3);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) jVar.f29c).post(new H.b((g) jVar.f28b, i7, i6));
                    }
                }
            } else {
                o.f fVar3 = H.i.f217a;
                String str4 = ((String) eVar.f207e) + "-" + i3;
                typeface2 = (Typeface) H.i.f217a.a(str4);
                if (typeface2 != null) {
                    handler.post(new H.a(gVar, 0, typeface2));
                } else {
                    H.g gVar2 = new H.g(i6, jVar);
                    synchronized (H.i.f219c) {
                        try {
                            o.k kVar = H.i.d;
                            ArrayList arrayList = (ArrayList) kVar.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(gVar2);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(gVar2);
                                kVar.put(str4, arrayList2);
                                H.f fVar4 = new H.f(str4, context, eVar, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = H.i.f218b;
                                H.g gVar3 = new H.g(i5, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                n nVar = new n();
                                nVar.f228b = fVar4;
                                nVar.f229c = gVar3;
                                nVar.d = handler2;
                                threadPoolExecutor.execute(nVar);
                            }
                        } finally {
                        }
                    }
                }
            }
            i4 = typeface2;
        } else {
            i4 = f63a.i(context, (B.g) fVar, resources, i3);
            if (bVar != null) {
                if (i4 != null) {
                    new Handler(Looper.getMainLooper()).post(new o(bVar, 0, i4));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (i4 != null) {
            f64b.b(b(resources, i, str, i2, i3), i4);
        }
        return i4;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
