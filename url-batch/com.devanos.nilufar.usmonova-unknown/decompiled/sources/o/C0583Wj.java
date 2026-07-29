package o;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* renamed from: o.Wj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0583Wj extends AbstractC0048Bt {
    public final TextView h;
    public final C0479Sj i;
    public boolean j = true;

    public C0583Wj(TextView textView) {
        this.h = textView;
        this.i = new C0479Sj(textView);
    }

    @Override // o.AbstractC0048Bt
    public final InputFilter[] H(InputFilter[] inputFilterArr) {
        if (!this.j) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C0479Sj) {
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
            C0479Sj c0479Sj = this.i;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c0479Sj;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c0479Sj) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // o.AbstractC0048Bt
    public final void c0(boolean z) {
        if (z) {
            p0();
        }
    }

    @Override // o.AbstractC0048Bt
    public final void d0(boolean z) {
        this.j = z;
        p0();
        TextView textView = this.h;
        textView.setFilters(H(textView.getFilters()));
    }

    public final void p0() {
        TextView textView = this.h;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.j) {
            if (!(transformationMethod instanceof C0728ak) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new C0728ak(transformationMethod);
            }
        } else if (transformationMethod instanceof C0728ak) {
            transformationMethod = ((C0728ak) transformationMethod).h;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
