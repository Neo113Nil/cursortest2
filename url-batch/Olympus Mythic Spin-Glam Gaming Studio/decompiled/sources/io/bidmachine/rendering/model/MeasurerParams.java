package io.bidmachine.rendering.model;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\f\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/bidmachine/rendering/model/MeasurerParams;", "", "", "name", "", "parameters", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class MeasurerParams {

    /* renamed from: a, reason: from kotlin metadata */
    private final String name;

    /* renamed from: b, reason: from kotlin metadata */
    private final Map parameters;

    public MeasurerParams(@NotNull String name, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.parameters = map;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public /* synthetic */ MeasurerParams(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : map);
    }
}
