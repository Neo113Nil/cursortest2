package expo.modules.imagepicker;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.core.view.ViewCompat;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageOptions;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExpoCropImageActivity.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u001d\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lexpo/modules/imagepicker/ExpoCropImageActivity;", "Lcom/canhub/cropper/CropImageActivity;", "<init>", "()V", "currentIconColor", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onPrepareOptionsMenu", "applyPalette", "isNight", "opts", "Lcom/canhub/cropper/CropImageOptions;", "getCropOptions", "invokeSetCustomizations", "Lkotlin/Result;", "", "kotlin.jvm.PlatformType", "invokeSetCustomizations-d1pmJ48", "()Ljava/lang/Object;", "tintAllMenuItems", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExpoCropImageActivity extends CropImageActivity {
    private int currentIconColor = ViewCompat.MEASURED_STATE_MASK;

    @Override // com.canhub.cropper.CropImageActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CropImageOptions cropOptions = getCropOptions();
        if (cropOptions != null) {
            applyPalette((getResources().getConfiguration().uiMode & 48) == 32, cropOptions);
            m10897invokeSetCustomizationsd1pmJ48();
            invalidateOptionsMenu();
        }
    }

    @Override // com.canhub.cropper.CropImageActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        tintAllMenuItems(menu);
        return onCreateOptionsMenu;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        boolean onPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
        tintAllMenuItems(menu);
        return onPrepareOptionsMenu;
    }

    private final void applyPalette(boolean isNight, CropImageOptions opts) {
        ExpoCropImageUtils expoCropImageUtils = ExpoCropImageUtils.INSTANCE;
        Resources.Theme theme = getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        this.currentIconColor = expoCropImageUtils.applyPaletteToOptions(theme, resources, isNight, opts);
        int i = isNight ? ViewCompat.MEASURED_STATE_MASK : -1;
        Integer num = opts.toolbarColor;
        if (num != null) {
            i = num.intValue();
        }
        ExpoCropImageUtils expoCropImageUtils2 = ExpoCropImageUtils.INSTANCE;
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        expoCropImageUtils2.applyWindowTheming(window, i, isNight);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setElevation(0.0f);
        }
    }

    private final CropImageOptions getCropOptions() {
        Object m12363constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            ExpoCropImageActivity expoCropImageActivity = this;
            Field declaredField = CropImageActivity.class.getDeclaredField("cropImageOptions");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            m12363constructorimpl = Result.m12363constructorimpl(obj instanceof CropImageOptions ? (CropImageOptions) obj : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m12363constructorimpl = Result.m12363constructorimpl(ResultKt.createFailure(th));
        }
        return (CropImageOptions) (Result.m12369isFailureimpl(m12363constructorimpl) ? null : m12363constructorimpl);
    }

    /* renamed from: invokeSetCustomizations-d1pmJ48, reason: not valid java name */
    private final Object m10897invokeSetCustomizationsd1pmJ48() {
        try {
            Result.Companion companion = Result.INSTANCE;
            ExpoCropImageActivity expoCropImageActivity = this;
            Method declaredMethod = CropImageActivity.class.getDeclaredMethod("setCustomizations", new Class[0]);
            declaredMethod.setAccessible(true);
            return Result.m12363constructorimpl(declaredMethod.invoke(this, new Object[0]));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m12363constructorimpl(ResultKt.createFailure(th));
        }
    }

    private final void tintAllMenuItems(Menu menu) {
        Drawable icon;
        Drawable mutate;
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menu.getItem(i);
            if (item != null && (icon = item.getIcon()) != null && (mutate = icon.mutate()) != null) {
                mutate.setTint(this.currentIconColor);
            }
        }
    }
}
