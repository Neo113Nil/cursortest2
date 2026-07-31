package io.bidmachine.iab.mraid;

import android.content.Context;
import android.graphics.Rect;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.util.DeviceUtilsKt;
import io.bidmachine.util.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b!\b\u0016\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J?\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010 \u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b \u0010!J-\u0010\"\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010!J\u0015\u0010\"\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#J-\u0010$\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b$\u0010!J\u0015\u0010$\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b$\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b3\u0010+R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b5\u0010+R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b7\u0010+R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010)\u001a\u0004\b9\u0010+¨\u0006:"}, d2 = {"Lio/bidmachine/iab/mraid/MraidScreenMetrics;", "", "", "density", "Landroid/graphics/Rect;", "screenRectPx", "screenRectDp", "rootViewRectPx", "rootViewRectDp", "currentAdRectPx", "currentAdRectDp", "defaultAdRectPx", "defaultAdRectDp", "<init>", "(FLandroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "rectPx", "rectDp", "", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "width", "height", "", "a", "(Landroid/graphics/Rect;Landroid/graphics/Rect;IIII)Z", "newRectPx", "(Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;)Z", "setScreenSize", "(II)Z", "setRootViewPosition", "(IIII)Z", "setCurrentAdPosition", "(Landroid/graphics/Rect;)Z", "setDefaultAdPosition", "F", "getDensity", "()F", "b", "Landroid/graphics/Rect;", "getScreenRectPx", "()Landroid/graphics/Rect;", "c", "getScreenRectDp", "d", "getRootViewRectPx", EidRequestBuilder.REQUEST_FIELD_EMAIL, "getRootViewRectDp", InneractiveMediationDefs.GENDER_FEMALE, "getCurrentAdRectPx", "g", "getCurrentAdRectDp", "h", "getDefaultAdRectPx", "i", "getDefaultAdRectDp", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public class MraidScreenMetrics {

    /* renamed from: a, reason: from kotlin metadata */
    private final float density;

    /* renamed from: b, reason: from kotlin metadata */
    private final Rect screenRectPx;

    /* renamed from: c, reason: from kotlin metadata */
    private final Rect screenRectDp;

    /* renamed from: d, reason: from kotlin metadata */
    private final Rect rootViewRectPx;

    /* renamed from: e, reason: from kotlin metadata */
    private final Rect rootViewRectDp;

    /* renamed from: f, reason: from kotlin metadata */
    private final Rect currentAdRectPx;

    /* renamed from: g, reason: from kotlin metadata */
    private final Rect currentAdRectDp;

    /* renamed from: h, reason: from kotlin metadata */
    private final Rect defaultAdRectPx;

    /* renamed from: i, reason: from kotlin metadata */
    private final Rect defaultAdRectDp;

    public MraidScreenMetrics(float f, @NotNull Rect screenRectPx, @NotNull Rect screenRectDp, @NotNull Rect rootViewRectPx, @NotNull Rect rootViewRectDp, @NotNull Rect currentAdRectPx, @NotNull Rect currentAdRectDp, @NotNull Rect defaultAdRectPx, @NotNull Rect defaultAdRectDp) {
        Intrinsics.checkNotNullParameter(screenRectPx, "screenRectPx");
        Intrinsics.checkNotNullParameter(screenRectDp, "screenRectDp");
        Intrinsics.checkNotNullParameter(rootViewRectPx, "rootViewRectPx");
        Intrinsics.checkNotNullParameter(rootViewRectDp, "rootViewRectDp");
        Intrinsics.checkNotNullParameter(currentAdRectPx, "currentAdRectPx");
        Intrinsics.checkNotNullParameter(currentAdRectDp, "currentAdRectDp");
        Intrinsics.checkNotNullParameter(defaultAdRectPx, "defaultAdRectPx");
        Intrinsics.checkNotNullParameter(defaultAdRectDp, "defaultAdRectDp");
        this.density = f;
        this.screenRectPx = screenRectPx;
        this.screenRectDp = screenRectDp;
        this.rootViewRectPx = rootViewRectPx;
        this.rootViewRectDp = rootViewRectDp;
        this.currentAdRectPx = currentAdRectPx;
        this.currentAdRectDp = currentAdRectDp;
        this.defaultAdRectPx = defaultAdRectPx;
        this.defaultAdRectDp = defaultAdRectDp;
    }

    private final boolean a(Rect rectPx, Rect rectDp, int x, int y, int width, int height) {
        if (rectPx.left == x && rectPx.top == y && x + width == rectPx.right && y + height == rectPx.bottom) {
            return false;
        }
        rectPx.set(x, y, width + x, height + y);
        UtilsKt.setDpFromPx(rectDp, rectPx, this.density);
        return true;
    }

    @NotNull
    public final Rect getCurrentAdRectDp() {
        return this.currentAdRectDp;
    }

    @NotNull
    public final Rect getCurrentAdRectPx() {
        return this.currentAdRectPx;
    }

    @NotNull
    public final Rect getDefaultAdRectDp() {
        return this.defaultAdRectDp;
    }

    @NotNull
    public final Rect getDefaultAdRectPx() {
        return this.defaultAdRectPx;
    }

    public final float getDensity() {
        return this.density;
    }

    @NotNull
    public final Rect getRootViewRectDp() {
        return this.rootViewRectDp;
    }

    @NotNull
    public final Rect getRootViewRectPx() {
        return this.rootViewRectPx;
    }

    @NotNull
    public final Rect getScreenRectDp() {
        return this.screenRectDp;
    }

    @NotNull
    public final Rect getScreenRectPx() {
        return this.screenRectPx;
    }

    public final boolean setCurrentAdPosition(int x, int y, int width, int height) {
        return a(this.currentAdRectPx, this.currentAdRectDp, x, y, width, height);
    }

    public final boolean setDefaultAdPosition(int x, int y, int width, int height) {
        return a(this.defaultAdRectPx, this.defaultAdRectDp, x, y, width, height);
    }

    public final boolean setRootViewPosition(int x, int y, int width, int height) {
        return a(this.rootViewRectPx, this.rootViewRectDp, x, y, width, height);
    }

    public final boolean setScreenSize(int width, int height) {
        if (this.screenRectPx.width() == width && this.screenRectPx.height() == height) {
            return false;
        }
        this.screenRectPx.set(0, 0, width, height);
        UtilsKt.setDpFromPx(this.screenRectDp, this.screenRectPx, this.density);
        return true;
    }

    private final boolean a(Rect rectPx, Rect rectDp, Rect newRectPx) {
        if (Intrinsics.areEqual(rectPx, newRectPx)) {
            return false;
        }
        rectPx.set(newRectPx);
        UtilsKt.setDpFromPx(rectDp, rectPx, this.density);
        return true;
    }

    public final boolean setCurrentAdPosition(@NotNull Rect rectPx) {
        Intrinsics.checkNotNullParameter(rectPx, "rectPx");
        return a(this.currentAdRectPx, this.currentAdRectDp, rectPx);
    }

    public final boolean setDefaultAdPosition(@NotNull Rect rectPx) {
        Intrinsics.checkNotNullParameter(rectPx, "rectPx");
        return a(this.defaultAdRectPx, this.defaultAdRectDp, rectPx);
    }

    public /* synthetic */ MraidScreenMetrics(float f, Rect rect, Rect rect2, Rect rect3, Rect rect4, Rect rect5, Rect rect6, Rect rect7, Rect rect8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, rect, rect2, rect3, rect4, rect5, rect6, rect7, rect8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MraidScreenMetrics(@NotNull Context context) {
        this(DeviceUtilsKt.getScreenDensity(context), new Rect(), new Rect(), new Rect(), new Rect(), new Rect(), new Rect(), new Rect(), new Rect());
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
