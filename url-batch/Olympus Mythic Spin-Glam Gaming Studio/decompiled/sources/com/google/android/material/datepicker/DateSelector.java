package com.google.android.material.datepicker;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import java.util.Collection;

@RestrictTo
/* loaded from: classes4.dex */
public interface DateSelector<S> extends Parcelable {
    Collection getSelectedDays();
}
