package io.bidmachine.rendering.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.rendering.model.WatermarkParams;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0007\u0010\u000fJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R*\u0010/\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u00107\u001a\u0002002\u0006\u0010(\u001a\u0002008\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106RB\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u000209082\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u000209088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lio/bidmachine/rendering/view/SdkWatermarkView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Bitmap;", "a", "()Landroid/graphics/Bitmap;", "", "ch", "", "baseR", "baseG", "baseB", "(CIII)I", "w", "h", "oldw", "oldh", "", "onSizeChanged", "(IIII)V", "changedView", ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, "onVisibilityChanged", "(Landroid/view/View;I)V", "clearCache", "()V", "invalidateWatermark", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Bitmap;", "watermarkBitmap", "Landroid/graphics/Paint;", "b", "Landroid/graphics/Paint;", "paint", "value", "c", "I", "getBaseColor", "()I", "setBaseColor", "(I)V", "baseColor", "Lio/bidmachine/rendering/model/WatermarkParams$Location;", "d", "Lio/bidmachine/rendering/model/WatermarkParams$Location;", "getLocation", "()Lio/bidmachine/rendering/model/WatermarkParams$Location;", "setLocation", "(Lio/bidmachine/rendering/model/WatermarkParams$Location;)V", "location", "Lkotlin/Function1;", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lkotlin/jvm/functions/Function1;", "getPayloadProvider", "()Lkotlin/jvm/functions/Function1;", "setPayloadProvider", "(Lkotlin/jvm/functions/Function1;)V", "payloadProvider", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class SdkWatermarkView extends View {

    /* renamed from: a, reason: from kotlin metadata */
    private Bitmap watermarkBitmap;

    /* renamed from: b, reason: from kotlin metadata */
    private final Paint paint;

    /* renamed from: c, reason: from kotlin metadata */
    private int baseColor;

    /* renamed from: d, reason: from kotlin metadata */
    private WatermarkParams.Location location;

    /* renamed from: e, reason: from kotlin metadata */
    private Function1 payloadProvider;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WatermarkParams.Location.values().length];
            try {
                iArr[WatermarkParams.Location.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WatermarkParams.Location.TOP_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WatermarkParams.Location.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WatermarkParams.Location.BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WatermarkParams.Location.BOTTOM_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WatermarkParams.Location.BOTTOM_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final class a extends Lambda implements Function1 {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final String a(int i) {
            return "";
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkWatermarkView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        paint.setColor(-16777216);
        this.paint = paint;
        this.baseColor = -16777216;
        this.location = WatermarkParams.Location.TOP_LEFT;
        this.payloadProvider = a.a;
        setClickable(false);
        setFocusable(false);
    }

    private final Bitmap a() {
        Bitmap bitmap = this.watermarkBitmap;
        if (bitmap != null) {
            return bitmap;
        }
        int measuredWidth = getMeasuredWidth() - 8;
        if (measuredWidth < 0) {
            this.watermarkBitmap = null;
            return null;
        }
        String str = (String) this.payloadProvider.invoke(Integer.valueOf(measuredWidth));
        if (str.length() > measuredWidth) {
            str = StringsKt.reversed(StringsKt.take(StringsKt.reversed(str).toString(), measuredWidth)).toString();
        }
        String str2 = "bmc:" + str + ":cmb";
        Bitmap createBitmap = Bitmap.createBitmap(str2.length(), 1, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(watermark.l… Bitmap.Config.ARGB_8888)");
        int red = Color.red(this.baseColor);
        int green = Color.green(this.baseColor);
        int blue = Color.blue(this.baseColor);
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            createBitmap.setPixel(i, 0, a(str2.charAt(i), red, green, blue));
        }
        this.watermarkBitmap = createBitmap;
        return createBitmap;
    }

    public final void clearCache() {
        this.watermarkBitmap = null;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    public final int getBaseColor() {
        return this.baseColor;
    }

    @NotNull
    public final WatermarkParams.Location getLocation() {
        return this.location;
    }

    @NotNull
    public final Function1 getPayloadProvider() {
        return this.payloadProvider;
    }

    public final void invalidateWatermark() {
        clearCache();
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Bitmap a2 = a();
        if (a2 == null) {
            return;
        }
        canvas.save();
        int i = WhenMappings.$EnumSwitchMapping$0[this.location.ordinal()];
        if (i == 2) {
            canvas.translate((canvas.getWidth() - a2.getWidth()) / 2, 0.0f);
        } else if (i == 3) {
            canvas.translate(canvas.getWidth() - a2.getWidth(), 0.0f);
        } else if (i == 4) {
            canvas.translate(0.0f, getMeasuredHeight() - 1);
        } else if (i == 5) {
            canvas.translate((canvas.getWidth() - a2.getWidth()) / 2, getMeasuredHeight() - 1);
        } else if (i == 6) {
            canvas.translate(canvas.getWidth() - a2.getWidth(), getMeasuredHeight() - 1);
        }
        canvas.drawBitmap(a2, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (w != oldw) {
            invalidateWatermark();
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View changedView, int visibility) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        if (visibility != 0) {
            clearCache();
        }
    }

    public final void setBaseColor(int i) {
        int rgb = Color.rgb(RangesKt.coerceIn(Color.red(i), 0, 245), RangesKt.coerceIn(Color.green(i), 0, 245), RangesKt.coerceIn(Color.blue(i), 0, 245));
        if (this.baseColor != rgb) {
            invalidateWatermark();
        }
        this.paint.setColor(rgb);
        this.baseColor = rgb;
    }

    public final void setLocation(@NotNull WatermarkParams.Location value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.location = value;
        invalidate();
    }

    public final void setPayloadProvider(@NotNull Function1 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(this.payloadProvider, value)) {
            invalidateWatermark();
        }
        this.payloadProvider = value;
    }

    private final int a(char ch, int baseR, int baseG, int baseB) {
        if (ch < 0 || ch >= 256) {
            return -16777216;
        }
        return Color.rgb(baseR + (ch % 9), baseG + ((ch / 9) % 9), baseB + ((ch / 81) % 9));
    }
}
