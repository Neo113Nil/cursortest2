package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class G3 implements O5 {
    @Override // io.appmetrica.analytics.impl.O5, kotlin.jvm.functions.Function1
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, String> invoke(@NotNull ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap c = Cb.c(asString);
        if (Wm.a(c)) {
            return c;
        }
        AbstractC5754vj.a("Passed clids (" + asString + ") are invalid.", new Object[0]);
        return null;
    }
}
