package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class mh extends g8 {
    public final TextView k;
    public final ih l;
    public boolean m = true;

    public mh(TextView textView) {
        this.k = textView;
        this.l = new ih(textView);
    }

    @Override // defpackage.g8
    public final InputFilter[] C(InputFilter[] inputFilterArr) {
        if (!this.m) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof ih) {
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
            ih ihVar = this.l;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = ihVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == ihVar) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.g8
    public final void d0(boolean z) {
        if (z) {
            m0();
        }
    }

    @Override // defpackage.g8
    public final void e0(boolean z) {
        this.m = z;
        m0();
        TextView textView = this.k;
        textView.setFilters(C(textView.getFilters()));
    }

    public final void m0() {
        TextView textView = this.k;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.m) {
            if (!(transformationMethod instanceof qh) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new qh(transformationMethod);
            }
        } else if (transformationMethod instanceof qh) {
            transformationMethod = ((qh) transformationMethod).f;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
