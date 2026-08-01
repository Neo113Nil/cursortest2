package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f4384n;

    /* renamed from: a, reason: collision with root package name */
    public float f4385a;

    /* renamed from: b, reason: collision with root package name */
    public float f4386b;

    /* renamed from: c, reason: collision with root package name */
    public float f4387c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f4388e;

    /* renamed from: f, reason: collision with root package name */
    public float f4389f;

    /* renamed from: g, reason: collision with root package name */
    public float f4390g;
    public int h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f4391j;

    /* renamed from: k, reason: collision with root package name */
    public float f4392k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4393l;

    /* renamed from: m, reason: collision with root package name */
    public float f4394m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4384n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f4384n.get(index)) {
                case 1:
                    this.f4385a = obtainStyledAttributes.getFloat(index, this.f4385a);
                    break;
                case 2:
                    this.f4386b = obtainStyledAttributes.getFloat(index, this.f4386b);
                    break;
                case 3:
                    this.f4387c = obtainStyledAttributes.getFloat(index, this.f4387c);
                    break;
                case 4:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 5:
                    this.f4388e = obtainStyledAttributes.getFloat(index, this.f4388e);
                    break;
                case 6:
                    this.f4389f = obtainStyledAttributes.getDimension(index, this.f4389f);
                    break;
                case 7:
                    this.f4390g = obtainStyledAttributes.getDimension(index, this.f4390g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f4391j = obtainStyledAttributes.getDimension(index, this.f4391j);
                    break;
                case 10:
                    this.f4392k = obtainStyledAttributes.getDimension(index, this.f4392k);
                    break;
                case 11:
                    this.f4393l = true;
                    this.f4394m = obtainStyledAttributes.getDimension(index, this.f4394m);
                    break;
                case 12:
                    this.h = n.f(obtainStyledAttributes, index, this.h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
