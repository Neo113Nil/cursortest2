package io.bidmachine.util;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SharedPreferenceUtils.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a!\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0013\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0015\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0017\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a%\u0010\u0017\u001a\u00020\u0010*\u00020\u00002\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0019\"\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u001b\u001a\u0011\u0010\u001c\u001a\u00020\u0010*\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010!\u001a\u00020\u0010*\u00020\u00002\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00100\u001e¢\u0006\u0004\b!\u0010\"\u001a#\u0010\u0011\u001a\u00020\u001f*\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0011\u0010#\u001a#\u0010\u0013\u001a\u00020\u001f*\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010$\u001a#\u0010\u0015\u001a\u00020\u001f*\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0015\u0010%\u001aL\u0010)\u001a\u00020\u0010\"\u0004\b\u0000\u0010&*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u001e\u0010(\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100'H\u0082\b¢\u0006\u0004\b)\u0010*\u001aL\u0010)\u001a\u00020\u001f\"\u0004\b\u0000\u0010&*\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u001e\u0010(\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100'H\u0082\b¢\u0006\u0004\b)\u0010+¨\u0006,"}, d2 = {"Landroid/content/SharedPreferences;", "", "key", "defValue", "optStringOrNull", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "optString", "", "optInt", "(Landroid/content/SharedPreferences;Ljava/lang/String;I)I", "optIntOrNull", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;", "", "optLong", "(Landroid/content/SharedPreferences;Ljava/lang/String;J)J", "value", "", "putStringOrRemove", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V", "putIntOrRemove", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/Integer;)V", "putLongOrRemove", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/Long;)V", "remove", "(Landroid/content/SharedPreferences;Ljava/lang/String;)V", "", "keys", "(Landroid/content/SharedPreferences;[Ljava/lang/String;)V", "clear", "(Landroid/content/SharedPreferences;)V", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "editAction", "edit", "(Landroid/content/SharedPreferences;Lkotlin/jvm/functions/Function1;)V", "(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;", "(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Integer;)Landroid/content/SharedPreferences$Editor;", "(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Long;)Landroid/content/SharedPreferences$Editor;", "T", "Lkotlin/Function3;", "action", "putOrRemove", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Landroid/content/SharedPreferences$Editor;", "bidmachine-android-sdk_bd_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes15.dex */
public final class SharedPreferenceUtilsKt {
    public static /* synthetic */ String optStringOrNull$default(SharedPreferences sharedPreferences, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return optStringOrNull(sharedPreferences, str, str2);
    }

    @Nullable
    public static final String optStringOrNull(@NotNull SharedPreferences sharedPreferences, @NotNull String key, @Nullable String str) {
        String string;
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (sharedPreferences.contains(key) && (string = sharedPreferences.getString(key, str)) != null) {
            return string;
        }
        Unit unit = Unit.INSTANCE;
        return str;
    }

    @NotNull
    public static final String optString(@NotNull SharedPreferences sharedPreferences, @NotNull String key, @NotNull String defValue) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defValue, "defValue");
        String optStringOrNull = optStringOrNull(sharedPreferences, key, null);
        return optStringOrNull == null ? defValue : optStringOrNull;
    }

    public static final int optInt(@NotNull SharedPreferences sharedPreferences, @NotNull String key, int i) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (sharedPreferences.contains(key)) {
            return sharedPreferences.getInt(key, i);
        }
        Unit unit = Unit.INSTANCE;
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Integer optIntOrNull(@NotNull SharedPreferences sharedPreferences, @NotNull String key, @Nullable Integer num) {
        Integer num2;
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
        } catch (Throwable unused) {
            num2 = null;
        }
        if (sharedPreferences.contains(key)) {
            Object obj = sharedPreferences.getAll().get(key);
            if (obj instanceof Integer) {
                num2 = (Integer) obj;
            } else if (obj instanceof Long) {
                num2 = Integer.valueOf((int) ((Number) obj).longValue());
            }
            return num2 != null ? num : num2;
        }
        num2 = num;
        if (num2 != null) {
        }
    }

    public static final long optLong(@NotNull SharedPreferences sharedPreferences, @NotNull String key, long j) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (sharedPreferences.contains(key)) {
            return sharedPreferences.getLong(key, j);
        }
        Unit unit = Unit.INSTANCE;
        return j;
    }

    public static final void remove(@NotNull SharedPreferences sharedPreferences, @NotNull String key) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        sharedPreferences.edit().remove(key).apply();
    }

    public static final void remove(@NotNull SharedPreferences sharedPreferences, @NotNull String... keys) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String str : keys) {
            edit.remove(str);
        }
        edit.apply();
    }

    public static final void clear(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        for (String key : sharedPreferences.getAll().keySet()) {
            Intrinsics.checkNotNullExpressionValue(key, "key");
            remove(sharedPreferences, key);
        }
    }

    public static final void edit(@NotNull SharedPreferences sharedPreferences, @NotNull Function1 editAction) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(editAction, "editAction");
        try {
            SharedPreferences.Editor edit$lambda$9$lambda$8 = sharedPreferences.edit();
            Intrinsics.checkNotNullExpressionValue(edit$lambda$9$lambda$8, "edit$lambda$9$lambda$8");
            editAction.invoke(edit$lambda$9$lambda$8);
            edit$lambda$9$lambda$8.apply();
            Unit unit = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
    }

    public static final void putIntOrRemove(@NotNull SharedPreferences sharedPreferences, @NotNull String key, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (num == null) {
            remove(sharedPreferences, key);
            return;
        }
        SharedPreferences.Editor putOrRemove$lambda$13 = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(putOrRemove$lambda$13, "putOrRemove$lambda$13");
        putOrRemove$lambda$13.putInt(key, num.intValue());
        putOrRemove$lambda$13.apply();
    }

    public static final void putLongOrRemove(@NotNull SharedPreferences sharedPreferences, @NotNull String key, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (l == null) {
            remove(sharedPreferences, key);
            return;
        }
        SharedPreferences.Editor putOrRemove$lambda$13 = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(putOrRemove$lambda$13, "putOrRemove$lambda$13");
        putOrRemove$lambda$13.putLong(key, l.longValue());
        putOrRemove$lambda$13.apply();
    }

    private static final <T> void putOrRemove(SharedPreferences sharedPreferences, String str, T t, Function3 function3) {
        if (t == null) {
            remove(sharedPreferences, str);
            return;
        }
        SharedPreferences.Editor putOrRemove$lambda$13 = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(putOrRemove$lambda$13, "putOrRemove$lambda$13");
        function3.invoke(putOrRemove$lambda$13, str, t);
        putOrRemove$lambda$13.apply();
    }

    public static final void putStringOrRemove(@NotNull SharedPreferences sharedPreferences, @NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (str == null) {
            remove(sharedPreferences, key);
            return;
        }
        SharedPreferences.Editor putOrRemove$lambda$13 = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(putOrRemove$lambda$13, "putOrRemove$lambda$13");
        putOrRemove$lambda$13.putString(key, str);
        putOrRemove$lambda$13.apply();
    }

    @NotNull
    public static final SharedPreferences.Editor putIntOrRemove(@NotNull SharedPreferences.Editor editor, @NotNull String key, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(editor, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (num != null) {
            editor.putInt(key, num.intValue());
        } else {
            editor.remove(key);
        }
        return editor;
    }

    @NotNull
    public static final SharedPreferences.Editor putLongOrRemove(@NotNull SharedPreferences.Editor editor, @NotNull String key, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(editor, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (l != null) {
            editor.putLong(key, l.longValue());
        } else {
            editor.remove(key);
        }
        return editor;
    }

    private static final <T> SharedPreferences.Editor putOrRemove(SharedPreferences.Editor editor, String str, T t, Function3 function3) {
        if (t == null) {
            editor.remove(str);
        } else {
            function3.invoke(editor, str, t);
        }
        return editor;
    }

    @NotNull
    public static final SharedPreferences.Editor putStringOrRemove(@NotNull SharedPreferences.Editor editor, @NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(editor, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (str != null) {
            editor.putString(key, str);
        } else {
            editor.remove(key);
        }
        return editor;
    }
}
