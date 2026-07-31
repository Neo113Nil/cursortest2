package io.bidmachine.iab.utils;

import android.graphics.PointF;
import com.ogury.core.internal.datastore.preferences.core.PreferencesSerializer;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.rendering.model.ClickArea;
import io.bidmachine.util.UtilsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\u0012J\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001a"}, d2 = {"Lio/bidmachine/iab/utils/ClickAreaFactory;", "", "", "jsonValue", "", "horizontalGravity", "verticalGravity", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "value", "(Ljava/lang/String;)V", "(II)V", PreferencesSerializer.fileExtension, "Lio/bidmachine/rendering/model/ClickArea;", "a", "(Ljava/lang/String;)Lio/bidmachine/rendering/model/ClickArea;", "h", "v", "(II)Lio/bidmachine/rendering/model/ClickArea;", "build", "()Lio/bidmachine/rendering/model/ClickArea;", "Ljava/lang/String;", "b", "Ljava/lang/Integer;", "c", "Companion", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class ClickAreaFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final ClosedFloatingPointRange d = RangesKt.rangeTo(0.0f, 1.0f);

    /* renamed from: a, reason: from kotlin metadata */
    private final String jsonValue;

    /* renamed from: b, reason: from kotlin metadata */
    private final Integer horizontalGravity;

    /* renamed from: c, reason: from kotlin metadata */
    private final Integer verticalGravity;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u0004\u0018\u00010\t*\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/bidmachine/iab/utils/ClickAreaFactory$Companion;", "", "<init>", "()V", "", "", "Landroid/graphics/PointF;", "a", "(Ljava/util/Map;)Landroid/graphics/PointF;", "", "b", "(Ljava/util/Map;)Ljava/lang/Long;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "NORMALIZED_RANGE", "Lkotlin/ranges/ClosedFloatingPointRange;", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final PointF a(Map map) {
            Float floatOrDefault$default = UtilsKt.toFloatOrDefault$default(map != null ? map.get(VastAttributes.HORIZONTAL_POSITION) : null, null, 1, null);
            Float floatOrDefault$default2 = UtilsKt.toFloatOrDefault$default(map != null ? map.get(VastAttributes.VERTICAL_POSITION) : null, null, 1, null);
            if (floatOrDefault$default == null || !ClickAreaFactory.d.contains(floatOrDefault$default) || floatOrDefault$default2 == null || !ClickAreaFactory.d.contains(floatOrDefault$default2)) {
                return null;
            }
            return new PointF(floatOrDefault$default.floatValue(), floatOrDefault$default2.floatValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Long b(Map map) {
            Object obj;
            if (map == null || (obj = map.get("seed")) == null) {
                return null;
            }
            return UtilsKt.toLongOrDefault$default(obj, null, 1, null);
        }

        private Companion() {
        }
    }

    private ClickAreaFactory(String str, Integer num, Integer num2) {
        this.jsonValue = str;
        this.horizontalGravity = num;
        this.verticalGravity = num2;
    }

    private final ClickArea a(String json) {
        try {
            Map<String, Object> map = UtilsKt.toMap(new JSONObject(json));
            Object obj = map.get("spread");
            Map map2 = obj instanceof Map ? (Map) obj : null;
            Companion companion = INSTANCE;
            Object obj2 = map.get("center");
            PointF a = companion.a(obj2 instanceof Map ? (Map) obj2 : null);
            if (a == null) {
                a = ClickArea.INSTANCE.getDEFAULT_CENTER$bidmachine_android_sdk_bb_3_7_1();
            }
            PointF a2 = companion.a(map2);
            if (a2 == null) {
                a2 = ClickArea.INSTANCE.getDEFAULT_SPREAD$bidmachine_android_sdk_bb_3_7_1();
            }
            return new ClickArea(a, a2, companion.b(map2));
        } catch (Exception unused) {
            return new ClickArea(null, null, null, 7, null);
        }
    }

    @NotNull
    public final ClickArea build() {
        String str = this.jsonValue;
        if (str != null) {
            return a(str);
        }
        Integer num = this.horizontalGravity;
        if (num == null) {
            return new ClickArea(null, null, null, 7, null);
        }
        int intValue = num.intValue();
        Integer num2 = this.verticalGravity;
        Intrinsics.checkNotNull(num2);
        return a(intValue, num2.intValue());
    }

    public ClickAreaFactory(@Nullable String str) {
        this(str, (Integer) null, (Integer) null);
    }

    public /* synthetic */ ClickAreaFactory(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public ClickAreaFactory(int i, int i2) {
        this((String) null, Integer.valueOf(i), Integer.valueOf(i2));
    }

    private final ClickArea a(int h, int v) {
        float f = 0.5f;
        float f2 = (h == 1 || (h != 5 && h == 17)) ? 0.5f : 1.0f;
        if (v != 16 && v != 17) {
            f = v != 80 ? 0.0f : 1.0f;
        }
        return new ClickArea(new PointF(f2, f), ClickArea.INSTANCE.getDEFAULT_SPREAD$bidmachine_android_sdk_bb_3_7_1(), null);
    }
}
