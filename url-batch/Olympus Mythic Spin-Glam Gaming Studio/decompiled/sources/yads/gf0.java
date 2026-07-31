package yads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class gf0 extends f83 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final SparseArray N;
    public final SparseBooleanArray O;

    public gf0(Context context) {
        super.a(context);
        Point b = sb3.b(context);
        int i = b.x;
        int i2 = b.y;
        this.i = i;
        this.j = i2;
        this.k = true;
        this.N = new SparseArray();
        this.O = new SparseBooleanArray();
        a();
    }

    public final void a() {
        this.A = true;
        this.B = false;
        this.C = true;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = true;
    }

    public gf0() {
        this.N = new SparseArray();
        this.O = new SparseBooleanArray();
        a();
    }

    public gf0(Bundle bundle) {
        super(bundle);
        um2 a;
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        a();
        hf0 hf0Var = hf0.R;
        this.A = bundle.getBoolean(Integer.toString(1000, 36), hf0Var.C);
        this.B = bundle.getBoolean(Integer.toString(1001, 36), hf0Var.D);
        this.C = bundle.getBoolean(Integer.toString(1002, 36), hf0Var.E);
        this.D = bundle.getBoolean(Integer.toString(1014, 36), hf0Var.F);
        this.E = bundle.getBoolean(Integer.toString(1003, 36), hf0Var.G);
        this.F = bundle.getBoolean(Integer.toString(1004, 36), hf0Var.H);
        this.G = bundle.getBoolean(Integer.toString(1005, 36), hf0Var.I);
        this.H = bundle.getBoolean(Integer.toString(1006, 36), hf0Var.J);
        this.I = bundle.getBoolean(Integer.toString(1015, 36), hf0Var.K);
        this.J = bundle.getBoolean(Integer.toString(1016, 36), hf0Var.L);
        this.K = bundle.getBoolean(Integer.toString(1007, 36), hf0Var.M);
        this.L = bundle.getBoolean(Integer.toString(1008, 36), hf0Var.N);
        this.M = bundle.getBoolean(Integer.toString(1009, 36), hf0Var.O);
        this.N = new SparseArray();
        int[] intArray = bundle.getIntArray(Integer.toString(1010, 36));
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1011, 36));
        if (parcelableArrayList == null) {
            i41 i41Var = l41.c;
            a = um2.f;
        } else {
            a = oq.a(y73.f, parcelableArrayList);
        }
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(Integer.toString(1012, 36));
        if (sparseParcelableArray == null) {
            sparseArray = new SparseArray();
        } else {
            mq mqVar = if0.e;
            SparseArray sparseArray2 = new SparseArray(sparseParcelableArray.size());
            for (int i = 0; i < sparseParcelableArray.size(); i++) {
                sparseArray2.put(sparseParcelableArray.keyAt(i), mqVar.a((Bundle) sparseParcelableArray.valueAt(i)));
            }
            sparseArray = sparseArray2;
        }
        if (intArray != null && intArray.length == a.e) {
            for (int i2 = 0; i2 < intArray.length; i2++) {
                int i3 = intArray[i2];
                y73 y73Var = (y73) a.get(i2);
                if0 if0Var = (if0) sparseArray.get(i2);
                Map map = (Map) this.N.get(i3);
                if (map == null) {
                    map = new HashMap();
                    this.N.put(i3, map);
                }
                if (!map.containsKey(y73Var) || !sb3.a(map.get(y73Var), if0Var)) {
                    map.put(y73Var, if0Var);
                }
            }
        }
        int[] intArray2 = bundle.getIntArray(Integer.toString(1013, 36));
        if (intArray2 == null) {
            sparseBooleanArray = new SparseBooleanArray();
        } else {
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(intArray2.length);
            for (int i4 : intArray2) {
                sparseBooleanArray2.append(i4, true);
            }
            sparseBooleanArray = sparseBooleanArray2;
        }
        this.O = sparseBooleanArray;
    }
}
