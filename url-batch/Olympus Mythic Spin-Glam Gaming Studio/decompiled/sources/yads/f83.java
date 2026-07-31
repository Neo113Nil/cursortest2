package yads;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes13.dex */
public class f83 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public int i;
    public int j;
    public boolean k;
    public final um2 l;
    public final int m;
    public final um2 n;
    public final int o;
    public final int p;
    public final int q;
    public final um2 r;
    public um2 s;
    public int t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final HashMap y;
    public final HashSet z;

    public f83() {
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
        this.j = Integer.MAX_VALUE;
        this.k = true;
        i41 i41Var = l41.c;
        um2 um2Var = um2.f;
        this.l = um2Var;
        this.m = 0;
        this.n = um2Var;
        this.o = 0;
        this.p = Integer.MAX_VALUE;
        this.q = Integer.MAX_VALUE;
        this.r = um2Var;
        this.s = um2Var;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = new HashMap();
        this.z = new HashSet();
    }

    public void a(Context context) {
        CaptioningManager captioningManager;
        int i = sb3.a;
        if (i >= 19) {
            if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.s = l41.a(sb3.a(locale));
                }
            }
        }
    }

    public static um2 a(String[] strArr) {
        i41 i41Var = l41.c;
        dx.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = strArr[i];
            str.getClass();
            String e = sb3.e(str);
            e.getClass();
            int i3 = i2 + 1;
            if (objArr.length < i3) {
                objArr = Arrays.copyOf(objArr, e41.a(objArr.length, i3));
            }
            objArr[i2] = e;
            i++;
            i2 = i3;
        }
        return l41.b(i2, objArr);
    }

    public f83(Bundle bundle) {
        um2 a;
        String num = Integer.toString(6, 36);
        g83 g83Var = g83.B;
        this.a = bundle.getInt(num, g83Var.b);
        this.b = bundle.getInt(Integer.toString(7, 36), g83Var.c);
        this.c = bundle.getInt(Integer.toString(8, 36), g83Var.d);
        this.d = bundle.getInt(Integer.toString(9, 36), g83Var.e);
        this.e = bundle.getInt(Integer.toString(10, 36), g83Var.f);
        this.f = bundle.getInt(Integer.toString(11, 36), g83Var.g);
        this.g = bundle.getInt(Integer.toString(12, 36), g83Var.h);
        this.h = bundle.getInt(Integer.toString(13, 36), g83Var.i);
        this.i = bundle.getInt(Integer.toString(14, 36), g83Var.j);
        this.j = bundle.getInt(Integer.toString(15, 36), g83Var.k);
        this.k = bundle.getBoolean(Integer.toString(16, 36), g83Var.l);
        String[] stringArray = bundle.getStringArray(Integer.toString(17, 36));
        this.l = l41.b(stringArray == null ? new String[0] : stringArray);
        this.m = bundle.getInt(Integer.toString(25, 36), g83Var.n);
        String[] stringArray2 = bundle.getStringArray(Integer.toString(1, 36));
        this.n = a(stringArray2 == null ? new String[0] : stringArray2);
        this.o = bundle.getInt(Integer.toString(2, 36), g83Var.p);
        this.p = bundle.getInt(Integer.toString(18, 36), g83Var.q);
        this.q = bundle.getInt(Integer.toString(19, 36), g83Var.r);
        String[] stringArray3 = bundle.getStringArray(Integer.toString(20, 36));
        this.r = l41.b(stringArray3 == null ? new String[0] : stringArray3);
        String[] stringArray4 = bundle.getStringArray(Integer.toString(3, 36));
        this.s = a(stringArray4 == null ? new String[0] : stringArray4);
        this.t = bundle.getInt(Integer.toString(4, 36), g83Var.u);
        this.u = bundle.getInt(Integer.toString(26, 36), g83Var.v);
        this.v = bundle.getBoolean(Integer.toString(5, 36), g83Var.w);
        this.w = bundle.getBoolean(Integer.toString(21, 36), g83Var.x);
        this.x = bundle.getBoolean(Integer.toString(22, 36), g83Var.y);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(23, 36));
        if (parcelableArrayList == null) {
            a = um2.f;
        } else {
            a = oq.a(e83.d, parcelableArrayList);
        }
        this.y = new HashMap();
        for (int i = 0; i < a.e; i++) {
            e83 e83Var = (e83) a.get(i);
            this.y.put(e83Var.b, e83Var);
        }
        int[] intArray = bundle.getIntArray(Integer.toString(24, 36));
        intArray = intArray == null ? new int[0] : intArray;
        this.z = new HashSet();
        for (int i2 : intArray) {
            this.z.add(Integer.valueOf(i2));
        }
    }
}
