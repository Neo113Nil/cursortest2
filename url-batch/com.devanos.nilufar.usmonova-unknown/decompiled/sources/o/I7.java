package o;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* loaded from: classes.dex */
public final class I7 {
    public static final I7 a = new I7();

    public final AutofillId a(ViewStructure viewStructure) {
        AutofillId autofillId;
        autofillId = viewStructure.getAutofillId();
        return autofillId;
    }

    public final boolean b(AutofillValue autofillValue) {
        boolean isDate;
        isDate = autofillValue.isDate();
        return isDate;
    }

    public final boolean c(AutofillValue autofillValue) {
        boolean isList;
        isList = autofillValue.isList();
        return isList;
    }

    public final boolean d(AutofillValue autofillValue) {
        boolean isText;
        isText = autofillValue.isText();
        return isText;
    }

    public final boolean e(AutofillValue autofillValue) {
        boolean isToggle;
        isToggle = autofillValue.isToggle();
        return isToggle;
    }

    public final void f(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public final void g(ViewStructure viewStructure, AutofillId autofillId, int i) {
        viewStructure.setAutofillId(autofillId, i);
    }

    public final void h(ViewStructure viewStructure, int i) {
        viewStructure.setAutofillType(i);
    }

    public final CharSequence i(AutofillValue autofillValue) {
        CharSequence textValue;
        textValue = autofillValue.getTextValue();
        return textValue;
    }
}
