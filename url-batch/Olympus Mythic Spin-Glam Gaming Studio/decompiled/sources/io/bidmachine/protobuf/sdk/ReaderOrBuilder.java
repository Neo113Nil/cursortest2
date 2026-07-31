package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.TimestampOrBuilder;
import io.bidmachine.protobuf.sdk.Reader;
import java.util.List;

/* loaded from: classes6.dex */
public interface ReaderOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

    String getName();

    ByteString getNameBytes();

    Reader.Record getRecords(int i);

    int getRecordsCount();

    List<Reader.Record> getRecordsList();

    Reader.RecordOrBuilder getRecordsOrBuilder(int i);

    List<? extends Reader.RecordOrBuilder> getRecordsOrBuilderList();

    Timestamp getTimestamp();

    TimestampOrBuilder getTimestampOrBuilder();

    boolean hasTimestamp();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
