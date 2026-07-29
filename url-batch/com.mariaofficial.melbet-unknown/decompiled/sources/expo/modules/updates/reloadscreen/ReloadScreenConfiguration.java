package expo.modules.updates.reloadscreen;

import android.graphics.Color;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReloadScreenConfiguration.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JG\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lexpo/modules/updates/reloadscreen/ReloadScreenConfiguration;", "", ViewProps.BACKGROUND_COLOR, "", "image", "Lexpo/modules/updates/reloadscreen/ReloadScreenImageSource;", "imageResizeMode", "Lexpo/modules/updates/reloadscreen/ImageResizeMode;", "imageFullScreen", "", "fade", "spinner", "Lexpo/modules/updates/reloadscreen/SpinnerConfiguration;", "<init>", "(ILexpo/modules/updates/reloadscreen/ReloadScreenImageSource;Lexpo/modules/updates/reloadscreen/ImageResizeMode;ZZLexpo/modules/updates/reloadscreen/SpinnerConfiguration;)V", "getBackgroundColor", "()I", "getImage", "()Lexpo/modules/updates/reloadscreen/ReloadScreenImageSource;", "getImageResizeMode", "()Lexpo/modules/updates/reloadscreen/ImageResizeMode;", "getImageFullScreen", "()Z", "getFade", "getSpinner", "()Lexpo/modules/updates/reloadscreen/SpinnerConfiguration;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReloadScreenConfiguration {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int backgroundColor;
    private final boolean fade;
    private final ReloadScreenImageSource image;
    private final boolean imageFullScreen;
    private final ImageResizeMode imageResizeMode;
    private final SpinnerConfiguration spinner;

    public static /* synthetic */ ReloadScreenConfiguration copy$default(ReloadScreenConfiguration reloadScreenConfiguration, int i, ReloadScreenImageSource reloadScreenImageSource, ImageResizeMode imageResizeMode, boolean z, boolean z2, SpinnerConfiguration spinnerConfiguration, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = reloadScreenConfiguration.backgroundColor;
        }
        if ((i2 & 2) != 0) {
            reloadScreenImageSource = reloadScreenConfiguration.image;
        }
        if ((i2 & 4) != 0) {
            imageResizeMode = reloadScreenConfiguration.imageResizeMode;
        }
        if ((i2 & 8) != 0) {
            z = reloadScreenConfiguration.imageFullScreen;
        }
        if ((i2 & 16) != 0) {
            z2 = reloadScreenConfiguration.fade;
        }
        if ((i2 & 32) != 0) {
            spinnerConfiguration = reloadScreenConfiguration.spinner;
        }
        boolean z3 = z2;
        SpinnerConfiguration spinnerConfiguration2 = spinnerConfiguration;
        return reloadScreenConfiguration.copy(i, reloadScreenImageSource, imageResizeMode, z, z3, spinnerConfiguration2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final ReloadScreenImageSource getImage() {
        return this.image;
    }

    /* renamed from: component3, reason: from getter */
    public final ImageResizeMode getImageResizeMode() {
        return this.imageResizeMode;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getImageFullScreen() {
        return this.imageFullScreen;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getFade() {
        return this.fade;
    }

    /* renamed from: component6, reason: from getter */
    public final SpinnerConfiguration getSpinner() {
        return this.spinner;
    }

    public final ReloadScreenConfiguration copy(int backgroundColor, ReloadScreenImageSource image, ImageResizeMode imageResizeMode, boolean imageFullScreen, boolean fade, SpinnerConfiguration spinner) {
        Intrinsics.checkNotNullParameter(imageResizeMode, "imageResizeMode");
        Intrinsics.checkNotNullParameter(spinner, "spinner");
        return new ReloadScreenConfiguration(backgroundColor, image, imageResizeMode, imageFullScreen, fade, spinner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReloadScreenConfiguration)) {
            return false;
        }
        ReloadScreenConfiguration reloadScreenConfiguration = (ReloadScreenConfiguration) other;
        return this.backgroundColor == reloadScreenConfiguration.backgroundColor && Intrinsics.areEqual(this.image, reloadScreenConfiguration.image) && this.imageResizeMode == reloadScreenConfiguration.imageResizeMode && this.imageFullScreen == reloadScreenConfiguration.imageFullScreen && this.fade == reloadScreenConfiguration.fade && Intrinsics.areEqual(this.spinner, reloadScreenConfiguration.spinner);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.backgroundColor) * 31;
        ReloadScreenImageSource reloadScreenImageSource = this.image;
        return ((((((((hashCode + (reloadScreenImageSource == null ? 0 : reloadScreenImageSource.hashCode())) * 31) + this.imageResizeMode.hashCode()) * 31) + Boolean.hashCode(this.imageFullScreen)) * 31) + Boolean.hashCode(this.fade)) * 31) + this.spinner.hashCode();
    }

    public String toString() {
        return "ReloadScreenConfiguration(backgroundColor=" + this.backgroundColor + ", image=" + this.image + ", imageResizeMode=" + this.imageResizeMode + ", imageFullScreen=" + this.imageFullScreen + ", fade=" + this.fade + ", spinner=" + this.spinner + ")";
    }

    public ReloadScreenConfiguration(int i, ReloadScreenImageSource reloadScreenImageSource, ImageResizeMode imageResizeMode, boolean z, boolean z2, SpinnerConfiguration spinner) {
        Intrinsics.checkNotNullParameter(imageResizeMode, "imageResizeMode");
        Intrinsics.checkNotNullParameter(spinner, "spinner");
        this.backgroundColor = i;
        this.image = reloadScreenImageSource;
        this.imageResizeMode = imageResizeMode;
        this.imageFullScreen = z;
        this.fade = z2;
        this.spinner = spinner;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ReloadScreenImageSource getImage() {
        return this.image;
    }

    public final ImageResizeMode getImageResizeMode() {
        return this.imageResizeMode;
    }

    public final boolean getImageFullScreen() {
        return this.imageFullScreen;
    }

    public final boolean getFade() {
        return this.fade;
    }

    public final SpinnerConfiguration getSpinner() {
        return this.spinner;
    }

    /* compiled from: ReloadScreenConfiguration.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/updates/reloadscreen/ReloadScreenConfiguration$Companion;", "", "<init>", "()V", "fromOptions", "Lexpo/modules/updates/reloadscreen/ReloadScreenConfiguration;", "options", "Lexpo/modules/updates/reloadscreen/ReloadScreenOptions;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ReloadScreenConfiguration fromOptions(ReloadScreenOptions options) {
            String str;
            ImageResizeMode imageResizeMode;
            String str2;
            SpinnerSize spinnerSize;
            SpinnerOptions spinner;
            SpinnerOptions spinner2;
            SpinnerOptions spinner3;
            Boolean enabled;
            Boolean fade;
            Boolean imageFullScreen;
            boolean z = true;
            boolean z2 = (options != null ? options.getImage() : null) != null;
            if (options == null || (str = options.getBackgroundColor()) == null) {
                str = "#ffffff";
            }
            int parseColor = Color.parseColor(str);
            ReloadScreenImageSource image = options != null ? options.getImage() : null;
            if (options == null || (imageResizeMode = options.getImageResizeMode()) == null) {
                imageResizeMode = ImageResizeMode.CONTAIN;
            }
            ImageResizeMode imageResizeMode2 = imageResizeMode;
            boolean booleanValue = (options == null || (imageFullScreen = options.getImageFullScreen()) == null) ? false : imageFullScreen.booleanValue();
            boolean booleanValue2 = (options == null || (fade = options.getFade()) == null) ? false : fade.booleanValue();
            if (options != null && (spinner3 = options.getSpinner()) != null && (enabled = spinner3.getEnabled()) != null) {
                z = enabled.booleanValue();
            } else if (z2) {
                z = false;
            }
            if (options == null || (spinner2 = options.getSpinner()) == null || (str2 = spinner2.getColor()) == null) {
                str2 = "#007aff";
            }
            int parseColor2 = Color.parseColor(str2);
            if (options == null || (spinner = options.getSpinner()) == null || (spinnerSize = spinner.getSize()) == null) {
                spinnerSize = SpinnerSize.MEDIUM;
            }
            return new ReloadScreenConfiguration(parseColor, image, imageResizeMode2, booleanValue, booleanValue2, new SpinnerConfiguration(z, parseColor2, spinnerSize));
        }
    }
}
