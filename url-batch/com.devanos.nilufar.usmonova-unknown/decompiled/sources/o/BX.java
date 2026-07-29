package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class BX {
    public static final AbstractC2219xO a;
    public static final C1679pB b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new GX();
        } else if (i >= 28) {
            a = new FX();
        } else if (i >= 26) {
            a = new EX();
        } else {
            Method method = DX.c;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new DX();
            } else {
                a = new CX();
            }
        }
        b = new C1679pB(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r1.equals(r3) == false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, InterfaceC1126go interfaceC1126go, Resources resources, int i, String str, int i2, int i3, M5 m5, boolean z) {
        Typeface f;
        Typeface typeface;
        int i4 = -3;
        if (interfaceC1126go instanceof C1322jo) {
            C1322jo c1322jo = (C1322jo) interfaceC1126go;
            String str2 = c1322jo.d;
            f = null;
            boolean z2 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                if (m5 != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC1866s2(m5, 8, typeface));
                }
                return typeface;
            }
            int i5 = 1;
            Object[] objArr6 = !z ? m5 != null : c1322jo.c != 0;
            int i6 = z ? c1322jo.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            C1818rJ c1818rJ = new C1818rJ(22, z2);
            c1818rJ.i = m5;
            C1216i8 c1216i8 = c1322jo.a;
            C2002u5 c2002u5 = new C2002u5(14, c1818rJ, handler, objArr5 == true ? 1 : 0);
            int i7 = 4;
            if (objArr6 == true) {
                C1679pB c1679pB = AbstractC0994eo.a;
                String str3 = ((String) c1216i8.m) + "-" + i3;
                Typeface typeface2 = (Typeface) AbstractC0994eo.a.a(str3);
                if (typeface2 != null) {
                    handler.post(new RunnableC1996u1(i7, c1818rJ, typeface2, objArr4 == true ? 1 : 0));
                    f = typeface2;
                } else if (i6 == -1) {
                    C0863co a2 = AbstractC0994eo.a(str3, context, c1216i8, i3);
                    c2002u5.V(a2);
                    f = a2.a;
                } else {
                    try {
                        try {
                            C0863co c0863co = (C0863co) AbstractC0994eo.b.submit(new CallableC0732ao(str3, context, c1216i8, i3, 0)).get(i6, TimeUnit.MILLISECONDS);
                            c2002u5.V(c0863co);
                            f = c0863co.a;
                        } catch (InterruptedException e) {
                            throw e;
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) c2002u5.j).post(new F9(i4, (int) (objArr3 == true ? 1 : 0), c2002u5.i));
                    }
                }
            } else {
                C1679pB c1679pB2 = AbstractC0994eo.a;
                String str4 = ((String) c1216i8.m) + "-" + i3;
                Typeface typeface3 = (Typeface) AbstractC0994eo.a.a(str4);
                if (typeface3 != null) {
                    handler.post(new RunnableC1996u1(i7, c1818rJ, typeface3, objArr2 == true ? 1 : 0));
                    f = typeface3;
                } else {
                    C0798bo c0798bo = new C0798bo(objArr == true ? 1 : 0, c2002u5);
                    synchronized (AbstractC0994eo.c) {
                        try {
                            GR gr = AbstractC0994eo.d;
                            ArrayList arrayList = (ArrayList) gr.get(str4);
                            if (arrayList != null) {
                                arrayList.add(c0798bo);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(c0798bo);
                                gr.put(str4, arrayList2);
                                CallableC0732ao callableC0732ao = new CallableC0732ao(str4, context, c1216i8, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = AbstractC0994eo.b;
                                C0798bo c0798bo2 = new C0798bo(i5, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                MN mn = new MN();
                                mn.i = callableC0732ao;
                                mn.j = c0798bo2;
                                mn.k = handler2;
                                threadPoolExecutor.execute(mn);
                            }
                        } finally {
                        }
                    }
                }
            }
        } else {
            f = a.f(context, (C1192ho) interfaceC1126go, resources, i3);
            if (m5 != null) {
                if (f != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC1866s2(m5, 8, f));
                } else {
                    m5.a(-3);
                }
            }
        }
        if (f != null) {
            b.b(b(resources, i, str, i2, i3), f);
        }
        return f;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
