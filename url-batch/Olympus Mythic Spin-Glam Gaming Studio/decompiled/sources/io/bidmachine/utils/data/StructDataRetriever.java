package io.bidmachine.utils.data;

import androidx.annotation.Nullable;
import com.explorestack.protobuf.Struct;
import io.bidmachine.utils.ProtoUtils;

/* loaded from: classes5.dex */
public class StructDataRetriever extends MapDataRetriever<String> {
    public void setStruct(@Nullable Struct struct) {
        setParams(ProtoUtils.toMapOrNull(struct));
    }
}
