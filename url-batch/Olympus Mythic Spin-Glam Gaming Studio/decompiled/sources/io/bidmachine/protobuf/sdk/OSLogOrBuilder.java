package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import io.bidmachine.protobuf.sdk.OSLog;
import java.util.List;

/* loaded from: classes6.dex */
public interface OSLogOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

    OSLog.Record getRecords(int i);

    int getRecordsCount();

    List<OSLog.Record> getRecordsList();

    OSLog.RecordOrBuilder getRecordsOrBuilder(int i);

    List<? extends OSLog.RecordOrBuilder> getRecordsOrBuilderList();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
