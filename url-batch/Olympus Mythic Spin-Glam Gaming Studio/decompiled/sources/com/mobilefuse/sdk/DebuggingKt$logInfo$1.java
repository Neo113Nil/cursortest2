package com.mobilefuse.sdk;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.Nullable;

/* compiled from: Debugging.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "", "p2", "p3", "", "invoke"}, k = 3, mv = {1, 4, 3})
/* loaded from: classes15.dex */
final /* synthetic */ class DebuggingKt$logInfo$1 extends FunctionReferenceImpl implements Function3 {
    public static final DebuggingKt$logInfo$1 INSTANCE = new DebuggingKt$logInfo$1();

    DebuggingKt$logInfo$1() {
        super(3, Log.class, "i", "i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return Integer.valueOf(invoke((String) obj, (String) obj2, (Throwable) obj3));
    }

    public final int invoke(@Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        return Log.i(str, str2, th);
    }
}
