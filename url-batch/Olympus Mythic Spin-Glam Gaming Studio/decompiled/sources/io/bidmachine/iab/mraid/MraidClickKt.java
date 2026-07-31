package io.bidmachine.iab.mraid;

import io.bidmachine.rendering.model.ScriptConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0000¨\u0006\u0004"}, d2 = {"hasClcScript", "", "", "Lio/bidmachine/rendering/model/ScriptConfig;", "bidmachine-android-sdk_bb_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes15.dex */
public final class MraidClickKt {
    public static final boolean hasClcScript(@Nullable List<ScriptConfig> list) {
        Object obj = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((ScriptConfig) next).getScriptId(), MraidClick.SCRIPT_ID)) {
                    obj = next;
                    break;
                }
            }
            obj = (ScriptConfig) obj;
        }
        return obj != null;
    }
}
