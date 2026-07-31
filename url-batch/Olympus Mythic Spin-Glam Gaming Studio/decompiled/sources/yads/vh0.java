package yads;

import com.yandex.div2.DivBase;
import com.yandex.div2.DivExtension;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class vh0 {
    public static DivExtension a(DivBase divBase, String str) {
        List<DivExtension> extensions = divBase.getExtensions();
        if (extensions == null) {
            return null;
        }
        for (DivExtension divExtension : extensions) {
            if (Intrinsics.areEqual(str, divExtension.id)) {
                return divExtension;
            }
        }
        return null;
    }
}
