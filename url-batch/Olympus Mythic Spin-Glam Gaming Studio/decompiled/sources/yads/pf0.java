package yads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class pf0 extends fi1 {
    public static final gb2 i = new wx(new Comparator() { // from class: yads.pf0$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return pf0.a((Integer) obj, (Integer) obj2);
        }
    });
    public static final gb2 j = new wx(new Comparator() { // from class: yads.pf0$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return pf0.b((Integer) obj, (Integer) obj2);
        }
    });
    public final Object c;
    public final za d;
    public final boolean e;
    public final hf0 f;
    public final kf0 g;
    public nj h;

    public pf0(Context context) {
        za zaVar = new za();
        hf0 hf0Var = hf0.R;
        hf0 hf0Var2 = new hf0(new gf0(context));
        this.c = new Object();
        if (context != null) {
            context.getApplicationContext();
        }
        this.d = zaVar;
        this.f = hf0Var2;
        this.h = nj.h;
        boolean z = context != null && sb3.c(context);
        this.e = z;
        if (!z && context != null && sb3.a >= 32) {
            this.g = kf0.a(context);
        }
        if (hf0Var2.L && context == null) {
            gh1.d("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static boolean a(boolean z, int i2) {
        int i3 = i2 & 7;
        return i3 == 4 || (z && i3 == 3);
    }

    public static /* synthetic */ int b(Integer num, Integer num2) {
        return 0;
    }

    public final Pair a(ei1 ei1Var, int[][][] iArr, final hf0 hf0Var) {
        final boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < ei1Var.a) {
                if (2 == ei1Var.b[i2] && ei1Var.c[i2].b > 0) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return a(1, ei1Var, iArr, new mf0() { // from class: yads.pf0$$ExternalSyntheticLambda2
            @Override // yads.mf0
            public final List a(int i3, x73 x73Var, int[] iArr2) {
                return pf0.this.a(hf0Var, z, i3, x73Var, iArr2);
            }
        }, new Comparator() { // from class: yads.pf0$$ExternalSyntheticLambda3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ef0.a((List) obj, (List) obj2);
            }
        });
    }

    public final void b() {
        boolean z;
        fo0 fo0Var;
        kf0 kf0Var;
        synchronized (this.c) {
            try {
                z = this.f.L && !this.e && sb3.a >= 32 && (kf0Var = this.g) != null && kf0Var.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (fo0Var = this.a) == null) {
            return;
        }
        fo0Var.i.a.sendEmptyMessage(10);
    }

    public static /* synthetic */ int a(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    @Override // yads.h83
    public final void a() {
        kf0 kf0Var;
        synchronized (this.c) {
            try {
                if (sb3.a >= 32 && (kf0Var = this.g) != null) {
                    kf0Var.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = null;
        this.b = null;
    }

    public static Pair a(ei1 ei1Var, int[][][] iArr, final int[] iArr2, final hf0 hf0Var) {
        return a(2, ei1Var, iArr, new mf0() { // from class: yads.pf0$$ExternalSyntheticLambda6
            @Override // yads.mf0
            public final List a(int i2, x73 x73Var, int[] iArr3) {
                List a;
                a = of0.a(i2, x73Var, hf0.this, iArr3, iArr2[i2]);
                return a;
            }
        }, new Comparator() { // from class: yads.pf0$$ExternalSyntheticLambda7
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return of0.a((List) obj, (List) obj2);
            }
        });
    }

    public final /* synthetic */ List a(hf0 hf0Var, boolean z, int i2, x73 x73Var, int[] iArr) {
        return ef0.a(i2, x73Var, hf0Var, iArr, z, new ig2() { // from class: yads.pf0$$ExternalSyntheticLambda8
            @Override // yads.ig2
            public final boolean apply(Object obj) {
                return pf0.this.a((jw0) obj);
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r2.b != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
    
        if (r4.equals("audio/ac4") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(jw0 jw0Var) {
        kf0 kf0Var;
        boolean z = true;
        char c = 2;
        synchronized (this.c) {
            try {
                if (this.f.L && !this.e && jw0Var.z > 2) {
                    String str = jw0Var.m;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -2123537834:
                                if (str.equals("audio/eac3-joc")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 187078296:
                                if (str.equals("audio/ac3")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 187078297:
                                break;
                            case 1504578661:
                                if (str.equals("audio/eac3")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                if (sb3.a >= 32) {
                                    kf0 kf0Var2 = this.g;
                                    if (kf0Var2 != null) {
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (sb3.a >= 32 || (kf0Var = this.g) == null || !kf0Var.b || !kf0Var.a() || !this.g.b() || !this.g.a(this.h, jw0Var)) {
                                    z = false;
                                    break;
                                } else {
                                    break;
                                }
                                break;
                        }
                    }
                    if (sb3.a >= 32) {
                    }
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    public static Pair a(ei1 ei1Var, int[][][] iArr, final hf0 hf0Var, final String str) {
        return a(3, ei1Var, iArr, new mf0() { // from class: yads.pf0$$ExternalSyntheticLambda4
            @Override // yads.mf0
            public final List a(int i2, x73 x73Var, int[] iArr2) {
                List a;
                a = lf0.a(hf0.this, str, i2, x73Var, iArr2);
                return a;
            }
        }, new Comparator() { // from class: yads.pf0$$ExternalSyntheticLambda5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return lf0.a((List) obj, (List) obj2);
            }
        });
    }

    public static Pair a(int i2, ei1 ei1Var, int[][][] iArr, mf0 mf0Var, Comparator comparator) {
        int i3;
        RandomAccess randomAccess;
        ei1 ei1Var2 = ei1Var;
        ArrayList arrayList = new ArrayList();
        int i4 = ei1Var2.a;
        int i5 = 0;
        while (i5 < i4) {
            if (i2 == ei1Var2.b[i5]) {
                y73 y73Var = ei1Var2.c[i5];
                for (int i6 = 0; i6 < y73Var.b; i6++) {
                    x73 a = y73Var.a(i6);
                    List a2 = mf0Var.a(i5, a, iArr[i5][i6]);
                    boolean[] zArr = new boolean[a.b];
                    int i7 = 0;
                    while (i7 < a.b) {
                        nf0 nf0Var = (nf0) a2.get(i7);
                        int a3 = nf0Var.a();
                        if (zArr[i7] || a3 == 0) {
                            i3 = i4;
                        } else {
                            if (a3 == 1) {
                                randomAccess = l41.a(nf0Var);
                                i3 = i4;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nf0Var);
                                int i8 = i7 + 1;
                                while (i8 < a.b) {
                                    nf0 nf0Var2 = (nf0) a2.get(i8);
                                    int i9 = i4;
                                    if (nf0Var2.a() == 2 && nf0Var.a(nf0Var2)) {
                                        arrayList2.add(nf0Var2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i4 = i9;
                                }
                                i3 = i4;
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i7++;
                        i4 = i3;
                    }
                }
            }
            i5++;
            ei1Var2 = ei1Var;
            i4 = i4;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((nf0) list.get(i10)).d;
        }
        nf0 nf0Var3 = (nf0) list.get(0);
        return Pair.create(new wo0(0, nf0Var3.c, iArr2), Integer.valueOf(nf0Var3.b));
    }

    public static void a(y73 y73Var, hf0 hf0Var, HashMap hashMap) {
        e83 e83Var;
        for (int i2 = 0; i2 < y73Var.b; i2++) {
            e83 e83Var2 = (e83) hf0Var.z.get(y73Var.a(i2));
            if (e83Var2 != null && ((e83Var = (e83) hashMap.get(Integer.valueOf(e83Var2.b.d))) == null || (e83Var.c.isEmpty() && !e83Var2.c.isEmpty()))) {
                hashMap.put(Integer.valueOf(e83Var2.b.d), e83Var2);
            }
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static int a(jw0 jw0Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(jw0Var.d)) {
            return 4;
        }
        String a = a(str);
        String a2 = a(jw0Var.d);
        if (a2 == null || a == null) {
            return (z && a2 == null) ? 1 : 0;
        }
        if (a2.startsWith(a) || a.startsWith(a2)) {
            return 3;
        }
        int i2 = sb3.a;
        return a2.split("-", 2)[0].equals(a.split("-", 2)[0]) ? 2 : 0;
    }

    public static int a(int i2, int i3) {
        if (i2 == 0 || i2 != i3) {
            return Integer.bitCount(i2 & i3);
        }
        return Integer.MAX_VALUE;
    }
}
