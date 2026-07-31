package expo.modules.imagepicker;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.canhub.cropper.CropImageOptions;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExpoCropImageUtils.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0010\u0006\u001a\u00060\u0007R\u00020\b2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ*\u0010\u000f\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007R\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0019"}, d2 = {"Lexpo/modules/imagepicker/ExpoCropImageUtils;", "", "<init>", "()V", "getThemeColor", "", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "attr", "(Landroid/content/res/Resources$Theme;I)Ljava/lang/Integer;", "getColorResource", "resources", "colorResId", "(Landroid/content/res/Resources;I)Ljava/lang/Integer;", "applyPaletteToOptions", "isNight", "", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcom/canhub/cropper/CropImageOptions;", "applyWindowTheming", "", "window", "Landroid/view/Window;", "toolbarColor", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExpoCropImageUtils {
    public static final ExpoCropImageUtils INSTANCE = new ExpoCropImageUtils();

    private ExpoCropImageUtils() {
    }

    public final Integer getThemeColor(Resources.Theme theme, int attr) {
        Object m12363constructorimpl;
        Intrinsics.checkNotNullParameter(theme, "theme");
        try {
            Result.Companion companion = Result.INSTANCE;
            ExpoCropImageUtils expoCropImageUtils = this;
            TypedValue typedValue = new TypedValue();
            m12363constructorimpl = Result.m12363constructorimpl(theme.resolveAttribute(attr, typedValue, true) ? Integer.valueOf(typedValue.data) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m12363constructorimpl = Result.m12363constructorimpl(ResultKt.createFailure(th));
        }
        return (Integer) (Result.m12369isFailureimpl(m12363constructorimpl) ? null : m12363constructorimpl);
    }

    public final Integer getColorResource(Resources resources, int colorResId) {
        Object m12363constructorimpl;
        Intrinsics.checkNotNullParameter(resources, "resources");
        try {
            Result.Companion companion = Result.INSTANCE;
            ExpoCropImageUtils expoCropImageUtils = this;
            m12363constructorimpl = Result.m12363constructorimpl(Integer.valueOf(resources.getColor(colorResId, null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m12363constructorimpl = Result.m12363constructorimpl(ResultKt.createFailure(th));
        }
        return (Integer) (Result.m12369isFailureimpl(m12363constructorimpl) ? null : m12363constructorimpl);
    }

    public final int applyPaletteToOptions(Resources.Theme theme, Resources resources, boolean isNight, CropImageOptions options) {
        int i;
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(options, "options");
        Integer themeColor = getThemeColor(theme, R.attr.expoCropToolbarColor);
        if (themeColor == null) {
            themeColor = getColorResource(resources, R.color.expoCropToolbarColor);
        }
        Integer themeColor2 = getThemeColor(theme, R.attr.expoCropToolbarIconColor);
        if (themeColor2 == null) {
            themeColor2 = getColorResource(resources, R.color.expoCropToolbarIconColor);
        }
        Integer themeColor3 = getThemeColor(theme, R.attr.expoCropToolbarActionTextColor);
        if (themeColor3 == null) {
            themeColor3 = getColorResource(resources, R.color.expoCropToolbarActionTextColor);
        }
        Integer themeColor4 = getThemeColor(theme, R.attr.expoCropBackButtonIconColor);
        if (themeColor4 == null) {
            themeColor4 = getColorResource(resources, R.color.expoCropBackButtonIconColor);
        }
        Integer themeColor5 = getThemeColor(theme, R.attr.expoCropBackgroundColor);
        if (themeColor5 == null) {
            themeColor5 = getColorResource(resources, R.color.expoCropBackgroundColor);
        }
        int i2 = ViewCompat.MEASURED_STATE_MASK;
        int i3 = isNight ? -16777216 : -1;
        if (themeColor2 != null) {
            i = themeColor2.intValue();
        } else {
            i = isNight ? -1 : -16777216;
        }
        options.activityBackgroundColor = themeColor5 != null ? themeColor5.intValue() : i3;
        if (themeColor == null) {
            themeColor = Integer.valueOf(i3);
        }
        options.toolbarColor = themeColor;
        options.toolbarTitleColor = Integer.valueOf(i);
        if (themeColor4 == null) {
            themeColor4 = Integer.valueOf(i);
        }
        options.toolbarBackButtonColor = themeColor4;
        options.activityMenuIconColor = i;
        if (themeColor3 == null) {
            if (isNight) {
                i2 = -1;
            }
            themeColor3 = Integer.valueOf(i2);
        }
        options.activityMenuTextColor = themeColor3;
        return i;
    }

    public final void applyWindowTheming(Window window, int toolbarColor, boolean isNight) {
        Intrinsics.checkNotNullParameter(window, "window");
        window.setStatusBarColor(toolbarColor);
        new WindowInsetsControllerCompat(window, window.getDecorView()).setAppearanceLightStatusBars(!isNight);
    }
}
