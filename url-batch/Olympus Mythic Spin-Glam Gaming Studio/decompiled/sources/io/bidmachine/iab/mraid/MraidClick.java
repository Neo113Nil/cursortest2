package io.bidmachine.iab.mraid;

import android.graphics.PointF;
import io.bidmachine.iab.bridge.JsProvider;
import io.bidmachine.rendering.model.ScriptConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\r2\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\n\"\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lio/bidmachine/iab/mraid/MraidClick;", "Lio/bidmachine/iab/bridge/JsProvider;", "<init>", "()V", "", "Lio/bidmachine/rendering/model/ScriptConfig;", "scriptConfigs", "", "configure", "(Ljava/util/List;)V", "", "", "args", "", "getJs", "([Ljava/lang/Object;)Ljava/lang/String;", "", "a", "Z", "hasCustomScript", "Companion", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class MraidClick implements JsProvider {

    @NotNull
    public static final String SCRIPT_ID = "sclck";

    /* renamed from: a, reason: from kotlin metadata */
    private boolean hasCustomScript;

    public final void configure(@Nullable List<ScriptConfig> scriptConfigs) {
        this.hasCustomScript = MraidClickKt.hasClcScript(scriptConfigs);
    }

    @Override // io.bidmachine.iab.bridge.JsProvider
    @NotNull
    public String getJs(@NotNull Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Object obj = args[0];
        PointF pointF = obj instanceof PointF ? (PointF) obj : null;
        if (pointF == null) {
            return "";
        }
        if (this.hasCustomScript) {
            return "window.sclck(" + pointF.x + ", " + pointF.y + ')';
        }
        return "(function click(x, y) {var ev = new MouseEvent('click', {    'view': window,    'bubbles': true,    'cancelable': true,    'screenX': x,    'screenY': y});var el = document.elementFromPoint(x, y);if (el !== null) {     el.dispatchEvent(ev);}})(" + pointF.x + ", " + pointF.y + ')';
    }
}
