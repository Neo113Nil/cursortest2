package com.benasher44.uuid;

import expo.modules.notifications.serverregistration.InstallationId;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* compiled from: namebased.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u001e\u0010\u0006\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"uuid3Of", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "namespace", "name", "", "uuid5Of", InstallationId.LEGACY_PREFERENCES_UUID_KEY}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NamebasedKt {
    public static final UUID uuid3Of(UUID namespace, String name) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(name, "name");
        return UuidUtil.nameBasedUuidOf(namespace, name, new JvmHasher(MessageDigestAlgorithms.MD5, 3));
    }

    public static final UUID uuid5Of(UUID namespace, String name) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(name, "name");
        return UuidUtil.nameBasedUuidOf(namespace, name, new JvmHasher(MessageDigestAlgorithms.SHA_1, 5));
    }
}
