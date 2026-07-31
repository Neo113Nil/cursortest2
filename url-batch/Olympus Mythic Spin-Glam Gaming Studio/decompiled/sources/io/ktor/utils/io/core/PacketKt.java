package io.ktor.utils.io.core;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Source;

/* compiled from: Packet.kt */
/* loaded from: classes3.dex */
public abstract class PacketKt {
    public static final boolean isEmpty(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return source.exhausted();
    }
}
