package com.reactcommunity.rndatetimepicker;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.navigation.compose.DialogNavigator;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.CompositeDateValidator;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RNMaterialDatePicker.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\"B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\b\u0010 \u001a\u00020\u0015H\u0002J\b\u0010!\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00100\u00100\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;", "", "args", "Landroid/os/Bundle;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Landroid/os/Bundle;Lcom/facebook/react/bridge/Promise;Landroidx/fragment/app/FragmentManager;Lcom/facebook/react/bridge/ReactApplicationContext;)V", "promiseResolved", "", "datePicker", "Lcom/google/android/material/datepicker/MaterialDatePicker;", "", "builder", "Lcom/google/android/material/datepicker/MaterialDatePicker$Builder;", "kotlin.jvm.PlatformType", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "createDatePicker", "setInitialDate", "setTitle", "setInputMode", "setConstraints", "setFullscreen", "obtainMaterialThemeOverlayId", "", "resId", "addListeners", "show", "setButtons", "Listeners", "react-native-community_datetimepicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RNMaterialDatePicker {
    private final Bundle args;
    private MaterialDatePicker.Builder<Long> builder;
    private MaterialDatePicker<Long> datePicker;
    private final FragmentManager fragmentManager;
    private final Promise promise;
    private boolean promiseResolved;
    private final ReactApplicationContext reactContext;

    public RNMaterialDatePicker(Bundle args, Promise promise, FragmentManager fragmentManager, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.args = args;
        this.promise = promise;
        this.fragmentManager = fragmentManager;
        this.reactContext = reactContext;
        MaterialDatePicker.Builder<Long> datePicker = MaterialDatePicker.Builder.datePicker();
        Intrinsics.checkNotNullExpressionValue(datePicker, "datePicker(...)");
        this.builder = datePicker;
    }

    public final void open() {
        createDatePicker();
        addListeners();
        show();
    }

    private final void createDatePicker() {
        setInitialDate();
        setTitle();
        setInputMode();
        setButtons();
        setConstraints();
        setFullscreen();
        this.datePicker = this.builder.build();
    }

    private final void setInitialDate() {
        this.builder.setSelection(new RNDate(this.args).timestamp());
    }

    private final void setTitle() {
        String string = this.args.getString("title");
        if (string == null || string.length() == 0) {
            return;
        }
        this.builder.setTitleText(this.args.getString("title"));
    }

    private final void setInputMode() {
        String string = this.args.getString(RNConstants.ARG_INITIAL_INPUT_MODE);
        if (string == null || string.length() == 0) {
            this.builder.setInputMode(0);
            return;
        }
        String string2 = this.args.getString(RNConstants.ARG_INITIAL_INPUT_MODE);
        Intrinsics.checkNotNull(string2);
        String upperCase = string2.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (RNMaterialInputMode.valueOf(upperCase) == RNMaterialInputMode.KEYBOARD) {
            this.builder.setInputMode(1);
        } else {
            this.builder.setInputMode(0);
        }
    }

    private final void setConstraints() {
        CalendarConstraints.Builder builder = new CalendarConstraints.Builder();
        if (this.args.containsKey(RNConstants.FIRST_DAY_OF_WEEK)) {
            builder.setFirstDayOfWeek(this.args.getInt(RNConstants.FIRST_DAY_OF_WEEK));
        }
        ArrayList arrayList = new ArrayList();
        if (this.args.containsKey(RNConstants.ARG_MINDATE)) {
            DateValidatorPointForward from = DateValidatorPointForward.from(Common.minDateWithTimeZone(this.args));
            Intrinsics.checkNotNullExpressionValue(from, "from(...)");
            arrayList.add(from);
        }
        if (this.args.containsKey(RNConstants.ARG_MAXDATE)) {
            DateValidatorPointBackward before = DateValidatorPointBackward.before(Common.maxDateWithTimeZone(this.args));
            Intrinsics.checkNotNullExpressionValue(before, "before(...)");
            arrayList.add(before);
        }
        builder.setValidator(CompositeDateValidator.allOf(arrayList));
        this.builder.setCalendarConstraints(builder.build());
    }

    private final void setFullscreen() {
        if (this.args.getBoolean(RNConstants.ARG_FULLSCREEN)) {
            this.builder.setTheme(obtainMaterialThemeOverlayId(com.google.android.material.R.attr.materialCalendarFullscreenTheme));
        } else {
            this.builder.setTheme(obtainMaterialThemeOverlayId(com.google.android.material.R.attr.materialCalendarTheme));
        }
    }

    private final int obtainMaterialThemeOverlayId(int resId) {
        Resources.Theme theme;
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null || (theme = currentActivity.getTheme()) == null) {
            return resId;
        }
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(resId, typedValue, true);
        return typedValue.resourceId;
    }

    private final void addListeners() {
        Listeners listeners = new Listeners();
        MaterialDatePicker<Long> materialDatePicker = this.datePicker;
        Intrinsics.checkNotNull(materialDatePicker);
        materialDatePicker.addOnPositiveButtonClickListener(listeners);
        MaterialDatePicker<Long> materialDatePicker2 = this.datePicker;
        Intrinsics.checkNotNull(materialDatePicker2);
        materialDatePicker2.addOnDismissListener(listeners);
    }

    private final void show() {
        MaterialDatePicker<Long> materialDatePicker = this.datePicker;
        Intrinsics.checkNotNull(materialDatePicker);
        materialDatePicker.show(this.fragmentManager, "RNCMaterialDatePicker");
    }

    private final void setButtons() {
        Bundle bundle = this.args.getBundle(RNConstants.ARG_DIALOG_BUTTONS);
        if (bundle == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle(Common.NEGATIVE);
        Bundle bundle3 = bundle.getBundle(Common.POSITIVE);
        if (bundle2 != null) {
            this.builder.setNegativeButtonText(bundle2.getString("label"));
        }
        if (bundle3 != null) {
            this.builder.setPositiveButtonText(bundle3.getString("label"));
        }
    }

    /* compiled from: RNMaterialDatePicker.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¨\u0006\u000e"}, d2 = {"Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker$Listeners;", "Lcom/google/android/material/datepicker/MaterialPickerOnPositiveButtonClickListener;", "", "Landroid/content/DialogInterface$OnDismissListener;", "<init>", "(Lcom/reactcommunity/rndatetimepicker/RNMaterialDatePicker;)V", "onDismiss", "", DialogNavigator.NAME, "Landroid/content/DialogInterface;", "onPositiveButtonClick", "selection", "createNewCalendar", "Ljava/util/Calendar;", "react-native-community_datetimepicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class Listeners implements MaterialPickerOnPositiveButtonClickListener<Long>, DialogInterface.OnDismissListener {
        public Listeners() {
        }

        @Override // com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener
        public /* bridge */ /* synthetic */ void onPositiveButtonClick(Long l) {
            onPositiveButtonClick(l.longValue());
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            if (RNMaterialDatePicker.this.promiseResolved || !RNMaterialDatePicker.this.reactContext.hasActiveReactInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", RNConstants.ACTION_DISMISSED);
            RNMaterialDatePicker.this.promise.resolve(writableNativeMap);
            RNMaterialDatePicker.this.promiseResolved = true;
        }

        public void onPositiveButtonClick(long selection) {
            if (RNMaterialDatePicker.this.promiseResolved || !RNMaterialDatePicker.this.reactContext.hasActiveReactInstance()) {
                return;
            }
            Calendar createNewCalendar = createNewCalendar(selection);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", RNConstants.ACTION_DATE_SET);
            writableNativeMap.putDouble("timestamp", createNewCalendar.getTimeInMillis());
            writableNativeMap.putDouble("utcOffset", (createNewCalendar.getTimeZone().getOffset(createNewCalendar.getTimeInMillis()) / 1000) / 60);
            RNMaterialDatePicker.this.promise.resolve(writableNativeMap);
            RNMaterialDatePicker.this.promiseResolved = true;
        }

        private final Calendar createNewCalendar(long selection) {
            RNDate rNDate = new RNDate(RNMaterialDatePicker.this.args);
            Calendar calendar = Calendar.getInstance(Common.getTimeZone(RNMaterialDatePicker.this.args));
            calendar.setTimeInMillis(selection);
            calendar.set(11, rNDate.hour());
            calendar.set(12, rNDate.minute());
            calendar.set(13, 0);
            calendar.set(14, 0);
            Intrinsics.checkNotNull(calendar);
            return calendar;
        }
    }
}
