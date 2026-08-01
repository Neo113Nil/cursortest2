package V;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final TextView f777e;

    /* renamed from: f, reason: collision with root package name */
    public final d f778f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f779g = true;

    public f(TextView textView) {
        this.f777e = textView;
        this.f778f = new d(textView);
    }

    @Override // q1.d
    public final void N(boolean z2) {
        if (z2) {
            b0();
        }
    }

    @Override // q1.d
    public final void R(boolean z2) {
        this.f779g = z2;
        b0();
        TextView textView = this.f777e;
        textView.setFilters(x(textView.getFilters()));
    }

    public final void b0() {
        TextView textView = this.f777e;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f779g) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f785a;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // q1.d
    public final InputFilter[] x(InputFilter[] inputFilterArr) {
        if (!this.f779g) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof d) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            d dVar = this.f778f;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == dVar) {
                return inputFilterArr;
            }
            i4++;
        }
    }
}
