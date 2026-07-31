package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.remotepermissions.internal.config.FeatureConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class b implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final e fromModel(@NotNull FeatureConfig featureConfig) {
        e eVar = new e();
        Set<String> permittedPermissions = featureConfig.getPermittedPermissions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(permittedPermissions, 10));
        Iterator<T> it = permittedPermissions.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).getBytes(Charsets.UTF_8));
        }
        eVar.a = (byte[][]) arrayList.toArray(new byte[0][]);
        return eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r7 == null) goto L9;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FeatureConfig toModel(@NotNull e eVar) {
        Set emptySet;
        byte[][] bArr = eVar.a;
        if (bArr != null) {
            ArrayList arrayList = new ArrayList(bArr.length);
            for (byte[] bArr2 : bArr) {
                arrayList.add(new String(bArr2, Charsets.UTF_8));
            }
            emptySet = CollectionsKt.toSet(arrayList);
        }
        emptySet = SetsKt.emptySet();
        return new FeatureConfig(emptySet);
    }
}
