package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f3991n;

    /* renamed from: a, reason: collision with root package name */
    public float f3992a;

    /* renamed from: b, reason: collision with root package name */
    public float f3993b;

    /* renamed from: c, reason: collision with root package name */
    public float f3994c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3995e;

    /* renamed from: f, reason: collision with root package name */
    public float f3996f;

    /* renamed from: g, reason: collision with root package name */
    public float f3997g;
    public int h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3998j;

    /* renamed from: k, reason: collision with root package name */
    public float f3999k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4000l;

    /* renamed from: m, reason: collision with root package name */
    public float f4001m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3991n = sparseIntArray;
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
            switch (f3991n.get(index)) {
                case 1:
                    this.f3992a = obtainStyledAttributes.getFloat(index, this.f3992a);
                    break;
                case 2:
                    this.f3993b = obtainStyledAttributes.getFloat(index, this.f3993b);
                    break;
                case 3:
                    this.f3994c = obtainStyledAttributes.getFloat(index, this.f3994c);
                    break;
                case 4:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 5:
                    this.f3995e = obtainStyledAttributes.getFloat(index, this.f3995e);
                    break;
                case 6:
                    this.f3996f = obtainStyledAttributes.getDimension(index, this.f3996f);
                    break;
                case 7:
                    this.f3997g = obtainStyledAttributes.getDimension(index, this.f3997g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f3998j = obtainStyledAttributes.getDimension(index, this.f3998j);
                    break;
                case 10:
                    this.f3999k = obtainStyledAttributes.getDimension(index, this.f3999k);
                    break;
                case 11:
                    this.f4000l = true;
                    this.f4001m = obtainStyledAttributes.getDimension(index, this.f4001m);
                    break;
                case 12:
                    this.h = n.f(obtainStyledAttributes, index, this.h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
