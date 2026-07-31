package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import io.bidmachine.protobuf.sdk.Regs;
import java.util.List;

/* loaded from: classes15.dex */
public interface RegsOrBuilder extends MessageOrBuilder {
    Regs.CMP getCmp();

    Regs.CMPOrBuilder getCmpOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

    MaskedSignals getMaskedSignals();

    MaskedSignalsOrBuilder getMaskedSignalsOrBuilder();

    RestrictionMode getPersistedMode();

    int getPersistedModeValue();

    Regs.Pub getPub();

    Regs.PubOrBuilder getPubOrBuilder();

    RestrictionKind getRestrictionKinds(int i);

    int getRestrictionKindsCount();

    List<RestrictionKind> getRestrictionKindsList();

    int getRestrictionKindsValue(int i);

    List<Integer> getRestrictionKindsValueList();

    boolean hasCmp();

    boolean hasMaskedSignals();

    boolean hasPub();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
