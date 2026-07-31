package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistry;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.StructProto;
import com.explorestack.protobuf.TimestampProto;
import com.explorestack.protobuf.WrappersProto;

/* loaded from: classes15.dex */
public final class SDKAnalyticV2Proto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n*bidmachine/protobuf/sdk/analytics_v2.proto\u0012$bidmachine.protobuf.sdk.analytics_v2\u001a\u001fgoogle/protobuf/timestamp.proto\u001a\u001cgoogle/protobuf/struct.proto\u001a\u001egoogle/protobuf/wrappers.proto\u001a$bidmachine/protobuf/sdk/errors.proto\"\u0094\u0010\n\u0007Monitor\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012E\n\u0007records\u0018\u0002 \u0003(\u000b24.bidmachine.protobuf.sdk.analytics_v2.Monitor.Record\u001aÚ\u0005\n\rConfiguration\u0012*\n\u0004name\u0018\u0001 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012)\n\u0003url\u0018\u0002 \u0001(\u000b2\u001c.google.protobuf.StringValue\u00120\n\nbatch_size\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.UInt32Value\u0012.\n\binterval\u0018\u0004 \u0001(\u000b2\u001c.google.protobuf.UInt32Value\u00121\n\rshould_report\u0018\u0005 \u0001(\u000b2\u001a.google.protobuf.BoolValue\u0012a\n\rimp_extension\u0018\u0006 \u0001(\u000b2H.bidmachine.protobuf.sdk.analytics_v2.Monitor.Configuration.ImpExtensionH\u0000\u0012e\n\rgen_extension\u0018\b \u0001(\u000b2L.bidmachine.protobuf.sdk.analytics_v2.Monitor.Configuration.GenericExtensionH\u0000\u0012I\n\u0006filter\u0018\u0007 \u0001(\u000b29.bidmachine.protobuf.sdk.analytics_v2.Monitor.EventFilter\u001ar\n\fImpExtension\u0012/\n\tiaa_query\u0018\u0001 \u0001(\u000b2\u001c.google.protobuf.StringValue\u00121\n\u000bttl_seconds\u0018\u0002 \u0001(\u000b2\u001c.google.protobuf.UInt32Value\u001a@\n\u0010GenericExtension\u0012,\n\u0006config\u0018\u0001 \u0001(\u000b2\u001c.google.protobuf.StringValueB\u0012\n\u0010config_extension\u001a\u0096\u0001\n\u0006Record\u0012-\n\ttimestamp\u0018\u0001 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012'\n\u0006fields\u0018\u0002 \u0001(\u000b2\u0017.google.protobuf.Struct\u00124\n\u0005error\u0018\u0003 \u0001(\u000b2%.bidmachine.protobuf.sdk.errors.Error\u001a[\n\u000bEventFilter\u0012L\n\u0004expr\u0018\u0001 \u0001(\u000b2>.bidmachine.protobuf.sdk.analytics_v2.Monitor.FilterExpression\u001aâ\u0001\n\u0010FilterExpression\u0012@\n\u0003all\u0018\u0001 \u0001(\u000b21.bidmachine.protobuf.sdk.analytics_v2.Monitor.AllH\u0000\u0012@\n\u0003any\u0018\u0002 \u0001(\u000b21.bidmachine.protobuf.sdk.analytics_v2.Monitor.AnyH\u0000\u0012B\n\u0004rule\u0018\u0003 \u0001(\u000b22.bidmachine.protobuf.sdk.analytics_v2.Monitor.RuleH\u0000B\u0006\n\u0004node\u001aT\n\u0003All\u0012M\n\u0005items\u0018\u0001 \u0003(\u000b2>.bidmachine.protobuf.sdk.analytics_v2.Monitor.FilterExpression\u001aT\n\u0003Any\u0012M\n\u0005items\u0018\u0001 \u0003(\u000b2>.bidmachine.protobuf.sdk.analytics_v2.Monitor.FilterExpression\u001aí\u0001\n\u0004Rule\u0012\f\n\u0004path\u0018\u0001 \u0003(\t\u0012B\n\u0002op\u0018\u0002 \u0001(\u000e26.bidmachine.protobuf.sdk.analytics_v2.Monitor.Operator\u0012C\n\u0006values\u0018\u0003 \u0003(\u000b23.bidmachine.protobuf.sdk.analytics_v2.Monitor.Value\u0012N\n\u0007missing\u0018\u0004 \u0001(\u000e2=.bidmachine.protobuf.sdk.analytics_v2.Monitor.MissingBehavior\u001aj\n\u0005Value\u0012\u0016\n\fstring_value\u0018\u0001 \u0001(\tH\u0000\u0012\u0013\n\tint_value\u0018\u0002 \u0001(\u0003H\u0000\u0012\u0014\n\nbool_value\u0018\u0003 \u0001(\bH\u0000\u0012\u0016\n\fdouble_value\u0018\u0004 \u0001(\u0001H\u0000B\u0006\n\u0004kind\"³\u0001\n\bOperator\u0012\u0012\n\u000eOP_UNSPECIFIED\u0010\u0000\u0012\u0006\n\u0002IN\u0010\u0001\u0012\n\n\u0006NOT_IN\u0010\u0002\u0012\u0006\n\u0002EQ\u0010\u0003\u0012\u0007\n\u0003NEQ\u0010\u0004\u0012\n\n\u0006EXISTS\u0010\u0005\u0012\u000e\n\nNOT_EXISTS\u0010\u0006\u0012\u0010\n\fGREATER_THAN\u0010\u0007\u0012\u0019\n\u0015GREATER_THAN_OR_EQUAL\u0010\b\u0012\r\n\tLESS_THAN\u0010\t\u0012\u0016\n\u0012LESS_THAN_OR_EQUAL\u0010\n\">\n\u000fMissingBehavior\u0012\u0017\n\u0013MISSING_UNSPECIFIED\u0010\u0000\u0012\b\n\u0004FAIL\u0010\u0001\u0012\b\n\u0004PASS\u0010\u0002\"¢\n\n\u0006Reader\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012-\n\ttimestamp\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012D\n\u0007records\u0018\u0003 \u0003(\u000b23.bidmachine.protobuf.sdk.analytics_v2.Reader.Record\u001a\u0090\u0002\n\rConfiguration\u0012*\n\u0004name\u0018\u0001 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012)\n\u0003url\u0018\u0002 \u0001(\u000b2\u001c.google.protobuf.StringValue\u00125\n\u000fupdate_interval\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.UInt32Value\u0012/\n\u000bunique_only\u0018\u0004 \u0001(\u000b2\u001a.google.protobuf.BoolValue\u0012@\n\u0005rules\u0018\u0005 \u0003(\u000b21.bidmachine.protobuf.sdk.analytics_v2.Reader.Rule\u001aÐ\u0005\n\u0004Rule\u0012U\n\fgeneral_rule\u0018\u0001 \u0001(\u000b2=.bidmachine.protobuf.sdk.analytics_v2.Reader.Rule.GeneralRuleH\u0000\u0012T\n\fios_log_rule\u0018\u0002 \u0001(\u000b2<.bidmachine.protobuf.sdk.analytics_v2.Reader.Rule.IOSLogRuleH\u0000\u0012M\n\bpur_rule\u0018\u0003 \u0001(\u000b29.bidmachine.protobuf.sdk.analytics_v2.Reader.Rule.PurRuleH\u0000\u001ad\n\u000bGeneralRule\u0012)\n\u0003tag\u0018\u0001 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012*\n\u0004path\u0018\u0002 \u0001(\u000b2\u001c.google.protobuf.StringValue\u001a\u0094\u0001\n\nIOSLogRule\u0012)\n\u0003tag\u0018\u0001 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012,\n\u0006levels\u0018\u0002 \u0003(\u000b2\u001c.google.protobuf.StringValue\u0012-\n\u0007sources\u0018\u0003 \u0003(\u000b2\u001c.google.protobuf.StringValue\u001aÀ\u0001\n\u0007PurRule\u0012)\n\u0003tag\u0018\u0001 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012*\n\u0004path\u0018\u0002 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012+\n\u0005query\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.StringValue\u00121\n\rshould_report\u0018\u0004 \u0001(\u000b2\u001a.google.protobuf.BoolValueB\f\n\nrule_oneof\u001a®\u0001\n\u0006Record\u0012?\n\u0004rule\u0018\u0001 \u0001(\u000b21.bidmachine.protobuf.sdk.analytics_v2.Reader.Rule\u0012-\n\braw_data\u0018\u0002 \u0001(\u000b2\u001b.google.protobuf.BytesValue\u00124\n\u0005error\u0018\u0003 \u0001(\u000b2%.bidmachine.protobuf.sdk.errors.Error\"Ö\u0001\n\rConfiguration\u0012M\n\bmonitors\u0018\u0001 \u0003(\u000b2;.bidmachine.protobuf.sdk.analytics_v2.Monitor.Configuration\u0012K\n\u0007readers\u0018\u0002 \u0003(\u000b2:.bidmachine.protobuf.sdk.analytics_v2.Reader.Configuration\u0012)\n\u0003bpk\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.StringValue\"Å\u0001\n\u0005Event\u0012@\n\u0007monitor\u0018\u0001 \u0001(\u000b2-.bidmachine.protobuf.sdk.analytics_v2.MonitorH\u0000\u0012>\n\u0006reader\u0018\u0002 \u0001(\u000b2,.bidmachine.protobuf.sdk.analytics_v2.ReaderH\u0000\u0012/\n\u000eextras_private\u0018\u0003 \u0001(\u000b2\u0017.google.protobuf.StructB\t\n\u0007payload\"Â\u0001\n\u0005OSLog\u0012C\n\u0007records\u0018\u0001 \u0003(\u000b22.bidmachine.protobuf.sdk.analytics_v2.OSLog.Record\u001at\n\u0006Record\u0012-\n\ttimestamp\u0018\u0001 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012\u000b\n\u0003tag\u0018\u0002 \u0001(\t\u0012\r\n\u0005level\u0018\u0003 \u0001(\t\u0012\u000e\n\u0006source\u0018\u0004 \u0001(\t\u0012\u000f\n\u0007message\u0018\u0005 \u0001(\tB8\n\u001aio.bidmachine.protobuf.sdkB\u0012SDKAnalyticV2ProtoP\u0001¢\u0002\u0003BDMb\u0006proto3"}, new Descriptors.FileDescriptor[]{TimestampProto.getDescriptor(), StructProto.getDescriptor(), WrappersProto.getDescriptor(), SDKErrorsProto.getDescriptor()});
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_All_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_All_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Any_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Any_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_GenericExtension_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_GenericExtension_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_ImpExtension_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_ImpExtension_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_EventFilter_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_EventFilter_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_FilterExpression_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_FilterExpression_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Rule_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Rule_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Value_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Value_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_Record_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_Record_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_PurRule_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_PurRule_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_fieldAccessorTable;

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private SDKAnalyticV2Proto() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_descriptor = descriptor2;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Name", "Records"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_descriptor = descriptor3;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Name", "Url", "BatchSize", "Interval", "ShouldReport", "ImpExtension", "GenExtension", "Filter", "ConfigExtension"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_ImpExtension_descriptor = descriptor4;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_ImpExtension_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"IaaQuery", "TtlSeconds"});
        Descriptors.Descriptor descriptor5 = descriptor3.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_GenericExtension_descriptor = descriptor5;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_GenericExtension_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Config"});
        Descriptors.Descriptor descriptor6 = descriptor2.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_descriptor = descriptor6;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Timestamp", "Fields", "Error"});
        Descriptors.Descriptor descriptor7 = descriptor2.getNestedTypes().get(2);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_EventFilter_descriptor = descriptor7;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_EventFilter_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Expr"});
        Descriptors.Descriptor descriptor8 = descriptor2.getNestedTypes().get(3);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_FilterExpression_descriptor = descriptor8;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_FilterExpression_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"All", "Any", "Rule", "Node"});
        Descriptors.Descriptor descriptor9 = descriptor2.getNestedTypes().get(4);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_All_descriptor = descriptor9;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_All_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Items"});
        Descriptors.Descriptor descriptor10 = descriptor2.getNestedTypes().get(5);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Any_descriptor = descriptor10;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Any_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Items"});
        Descriptors.Descriptor descriptor11 = descriptor2.getNestedTypes().get(6);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Rule_descriptor = descriptor11;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Rule_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Path", "Op", "Values", "Missing"});
        Descriptors.Descriptor descriptor12 = descriptor2.getNestedTypes().get(7);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Value_descriptor = descriptor12;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Value_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"StringValue", "IntValue", "BoolValue", "DoubleValue", "Kind"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(1);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_descriptor = descriptor13;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Name", "Timestamp", "Records"});
        Descriptors.Descriptor descriptor14 = descriptor13.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_descriptor = descriptor14;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Name", "Url", "UpdateInterval", "UniqueOnly", "Rules"});
        Descriptors.Descriptor descriptor15 = descriptor13.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_descriptor = descriptor15;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"GeneralRule", "IosLogRule", "PurRule", "RuleOneof"});
        Descriptors.Descriptor descriptor16 = descriptor15.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_descriptor = descriptor16;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Tag", "Path"});
        Descriptors.Descriptor descriptor17 = descriptor15.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_descriptor = descriptor17;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"Tag", "Levels", "Sources"});
        Descriptors.Descriptor descriptor18 = descriptor15.getNestedTypes().get(2);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_PurRule_descriptor = descriptor18;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_PurRule_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"Tag", "Path", "Query", "ShouldReport"});
        Descriptors.Descriptor descriptor19 = descriptor13.getNestedTypes().get(2);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_descriptor = descriptor19;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"Rule", "RawData", "Error"});
        Descriptors.Descriptor descriptor20 = getDescriptor().getMessageTypes().get(2);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_descriptor = descriptor20;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"Monitors", "Readers", "Bpk"});
        Descriptors.Descriptor descriptor21 = getDescriptor().getMessageTypes().get(3);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_descriptor = descriptor21;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor21, new String[]{"Monitor", "Reader", "ExtrasPrivate", "Payload"});
        Descriptors.Descriptor descriptor22 = getDescriptor().getMessageTypes().get(4);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_descriptor = descriptor22;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor22, new String[]{"Records"});
        Descriptors.Descriptor descriptor23 = descriptor22.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_Record_descriptor = descriptor23;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_Record_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor23, new String[]{"Timestamp", "Tag", "Level", "Source", "Message"});
        TimestampProto.getDescriptor();
        StructProto.getDescriptor();
        WrappersProto.getDescriptor();
        SDKErrorsProto.getDescriptor();
    }
}
